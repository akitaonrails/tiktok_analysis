package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WCD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WCD implements C0WCP, C0WCM, InterfaceC819420WCm {
    public static final C814570VxP LLILZLL = new C814570VxP("proto");
    public final C2211551Bh3 LL;
    public final C0WC2 LLILLJJLI;
    public final C0WC2 LLILLL;
    public final AbstractC819510WCv LLILZ;
    public final InterfaceC819210WBr<String> LLILZIL;

    @Override // X.InterfaceC819420WCm
    public final void LIZ() {
        LJIILLIIL(new C0WCC() { // from class: X.0WCK
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                C0WCD c0wcd = this.LIZ;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c0wcd.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UPDATE global_log_event_state SET last_metrics_upload_ms=");
                sbLIZ.append(c0wcd.LLILLJJLI.getTime());
                sQLiteDatabase.compileStatement(C2188811AlT.LIZIZ(sbLIZ)).execute();
                return null;
            }
        });
    }

    @Override // X.C0WCP
    public final int LIZJ() {
        final long time = this.LLILLJJLI.getTime() - this.LLILZ.LIZIZ();
        return ((Integer) LJIILLIIL(new C0WCC() { // from class: X.0WCH
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                C0WCD c0wcd = this.LIZ;
                long j = time;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c0wcd.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c0wcd.LIZLLL(cursorRawQuery.getInt(0), EnumC819310WCb.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // X.InterfaceC819420WCm
    public final C819540WCy LJFF() {
        final C819530WCx c819530WCx = new C819530WCx();
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseLJII = LJII();
        sQLiteDatabaseLJII.beginTransaction();
        try {
            C819540WCy c819540WCy = (C819540WCy) LJIJJLI(sQLiteDatabaseLJII.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0WCC() { // from class: X.0WCt
                /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[PHI: r1
                  0x0087: PHI (r1v9 X.0WCb) = (r1v8 X.0WCb), (r1v10 X.0WCb), (r1v11 X.0WCb), (r1v12 X.0WCb), (r1v13 X.0WCb), (r1v14 X.0WCb) binds: [B:8:0x0029, B:10:0x0031, B:12:0x0039, B:14:0x0041, B:16:0x0049, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.C0WCC
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 313
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C819490WCt.apply(java.lang.Object):java.lang.Object");
                }
            });
            sQLiteDatabaseLJII.setTransactionSuccessful();
            sQLiteDatabaseLJII.endTransaction();
            return c819540WCy;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJII.endTransaction();
            throw th;
        }
    }

    public final SQLiteDatabase LJII() {
        C2211551Bh3 c2211551Bh3 = this.LL;
        Objects.requireNonNull(c2211551Bh3);
        long time = this.LLILLL.getTime();
        while (true) {
            try {
                return c2211551Bh3.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILLL.getTime() >= ((long) this.LLILZ.LIZ()) + time) {
                    throw new C0WCR("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    @Override // X.C0WCP
    public final Iterable<AbstractC818550W9d> LJJLIIIJLJLI() {
        SQLiteDatabase sQLiteDatabaseLJII = LJII();
        sQLiteDatabaseLJII.beginTransaction();
        try {
            List list = (List) LJIJJLI(sQLiteDatabaseLJII.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C0WCC() { // from class: X.0W9a
                @Override // X.C0WCC
                public final Object apply(Object obj) {
                    byte[] bArrDecode;
                    Cursor cursor = (Cursor) obj;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
                        c818570W9fLIZ.LIZIZ(cursor.getString(1));
                        c818570W9fLIZ.LIZJ(C816330W0p.LIZIZ(cursor.getInt(2)));
                        String string = cursor.getString(3);
                        if (string == null) {
                            bArrDecode = null;
                        } else {
                            bArrDecode = Base64.decode(string, 0);
                        }
                        c818570W9fLIZ.LIZIZ = bArrDecode;
                        arrayList.add(c818570W9fLIZ.LIZ());
                    }
                    return arrayList;
                }
            });
            sQLiteDatabaseLJII.setTransactionSuccessful();
            sQLiteDatabaseLJII.endTransaction();
            return list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJII.endTransaction();
            throw th;
        }
    }

    public static String LJIJJ(Iterable<C0WC9> iterable) {
        StringBuilder sb = new StringBuilder(e3.h);
        Iterator<C0WC9> it2 = iterable.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().LIZIZ());
            if (it2.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C0WCM
    public final Object LIZIZ(C0WCL c0wcl) {
        try {
            return LJI(c0wcl);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final <T> T LJI(C0WCL<T> c0wcl) {
        SQLiteDatabase sQLiteDatabaseLJII = LJII();
        long time = this.LLILLL.getTime();
        while (true) {
            try {
                sQLiteDatabaseLJII.beginTransaction();
                try {
                    T tExecute = c0wcl.execute();
                    sQLiteDatabaseLJII.setTransactionSuccessful();
                    sQLiteDatabaseLJII.endTransaction();
                    return tExecute;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sQLiteDatabaseLJII.endTransaction();
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILLL.getTime() < ((long) this.LLILZ.LIZ()) + time) {
                    SystemClock.sleep(50L);
                } else {
                    throw new C0WCR("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final <T> T LJIILLIIL(C0WCC<SQLiteDatabase, T> c0wcc) {
        SQLiteDatabase sQLiteDatabaseLJII = LJII();
        sQLiteDatabaseLJII.beginTransaction();
        try {
            T tApply = c0wcc.apply(sQLiteDatabaseLJII);
            sQLiteDatabaseLJII.setTransactionSuccessful();
            sQLiteDatabaseLJII.endTransaction();
            return tApply;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJII.endTransaction();
            throw th;
        }
    }

    @Override // X.C0WCP
    public final void LJJJJI(Iterable<C0WC9> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DELETE FROM events WHERE _id in ");
        sbLIZ.append(LJIJJ(iterable));
        LJII().compileStatement(C2188811AlT.LIZIZ(sbLIZ)).execute();
    }

    @Override // X.C0WCP
    public final long LJJJLZIJ(AbstractC818550W9d abstractC818550W9d) {
        Long lValueOf;
        Cursor cursorRawQuery = LJII().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC818550W9d.LIZIZ(), String.valueOf(C816330W0p.LIZ(abstractC818550W9d.LIZLLL()))});
        try {
            if (cursorRawQuery.moveToNext()) {
                lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            } else {
                lValueOf = 0L;
            }
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // X.C0WCP
    public final Iterable<C0WC9> LJJZZI(final AbstractC818550W9d abstractC818550W9d) {
        return (Iterable) LJIILLIIL(new C0WCC() { // from class: X.0WC6
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                ArrayList arrayList;
                C0WCD c0wcd = this.LIZ;
                AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                List<C0WC9> listLJIIZILJ = c0wcd.LJIIZILJ(sQLiteDatabase, abstractC818550W9d2, c0wcd.LLILZ.LIZJ());
                int i = 0;
                for (EnumC816340W0q enumC816340W0q : EnumC816340W0q.values()) {
                    if (enumC816340W0q != abstractC818550W9d2.LIZLLL()) {
                        ArrayList arrayList2 = (ArrayList) listLJIIZILJ;
                        int iLIZJ = c0wcd.LLILZ.LIZJ() - arrayList2.size();
                        if (iLIZJ <= 0) {
                            break;
                        }
                        C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
                        c818570W9fLIZ.LIZIZ(abstractC818550W9d2.LIZIZ());
                        c818570W9fLIZ.LIZJ(enumC816340W0q);
                        c818570W9fLIZ.LIZIZ = abstractC818550W9d2.LIZJ();
                        arrayList2.addAll(c0wcd.LJIIZILJ(sQLiteDatabase, c818570W9fLIZ.LIZ(), iLIZJ));
                    }
                }
                final HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                while (true) {
                    arrayList = (ArrayList) listLJIIZILJ;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    sb.append(((C0WC9) ListProtector.get(listLJIIZILJ, i)).LIZIZ());
                    if (i < arrayList.size() - 1) {
                        sb.append(',');
                    }
                    i++;
                }
                sb.append(')');
                C0WCD.LJIJJLI(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new C0WCC() { // from class: X.0VSg
                    @Override // X.C0WCC
                    public final Object apply(Object obj2) {
                        Map map2 = map;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            long j = cursor.getLong(0);
                            Set hashSet = (Set) map2.get(Long.valueOf(j));
                            if (hashSet == null) {
                                hashSet = new HashSet();
                                map2.put(Long.valueOf(j), hashSet);
                            }
                            hashSet.add(new C0WCA(cursor.getString(1), cursor.getString(2)));
                        }
                        return null;
                    }
                });
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    C0WC9 c0wc9 = (C0WC9) listIterator.next();
                    if (map.containsKey(Long.valueOf(c0wc9.LIZIZ()))) {
                        C819250WBv c819250WBvLJIIIIZZ = c0wc9.LIZ().LJIIIIZZ();
                        for (C0WCA c0wca : (Set) map.get(Long.valueOf(c0wc9.LIZIZ()))) {
                            c819250WBvLJIIIIZZ.LIZ(c0wca.LIZ, c0wca.LIZIZ);
                        }
                        listIterator.set(new C0WC7(c0wc9.LIZIZ(), c0wc9.LIZJ(), c819250WBvLJIIIIZZ.LIZIZ()));
                    }
                }
                return listLJIIZILJ;
            }
        });
    }

    @Override // X.C0WCP
    public final boolean LJLI(final AbstractC818550W9d abstractC818550W9d) {
        return ((Boolean) LJIILLIIL(new C0WCC() { // from class: X.0WCI
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                C0WCD c0wcd = this.LIZ;
                AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                c0wcd.getClass();
                Long lLJIILL = C0WCD.LJIILL((SQLiteDatabase) obj, abstractC818550W9d2);
                if (lLJIILL == null) {
                    return Boolean.FALSE;
                }
                Cursor cursorRawQuery = c0wcd.LJII().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lLJIILL.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    return boolValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorRawQuery.close();
                    throw th;
                }
            }
        })).booleanValue();
    }

    @Override // X.C0WCP
    public final void LLII(Iterable<C0WC9> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        sbLIZ.append(LJIJJ(iterable));
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJIILLIIL(new C0WCC() { // from class: X.0WCJ
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                C0WCD c0wcd = this.LIZ;
                String str = strLIZIZ;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c0wcd.getClass();
                sQLiteDatabase.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c0wcd.LIZLLL(cursorRawQuery.getInt(0), EnumC819310WCb.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            }
        });
    }

    public static Long LJIILL(SQLiteDatabase sQLiteDatabase, AbstractC818550W9d abstractC818550W9d) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC818550W9d.LIZIZ(), String.valueOf(C816330W0p.LIZ(abstractC818550W9d.LIZLLL()))));
        if (abstractC818550W9d.LIZJ() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC818550W9d.LIZJ(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) LJIJJLI(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new C0WCC() { // from class: X.0VSh
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
            }
        });
    }

    public static <T> T LJIJJLI(Cursor cursor, C0WCC<Cursor, T> c0wcc) {
        try {
            T tApply = c0wcc.apply(cursor);
            cursor.close();
            return tApply;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursor.close();
            throw th;
        }
    }

    @Override // X.C0WCP
    public final C0WC7 LJJLJLI(final AbstractC818550W9d abstractC818550W9d, final C0WCG c0wcg) {
        abstractC818550W9d.LIZLLL();
        c0wcg.LJI();
        abstractC818550W9d.LIZIZ();
        C1894007bO.LIZ("SQLiteEventStore");
        long jLongValue = ((Long) LJIILLIIL(new C0WCC() { // from class: X.0WCE
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                long jInsert;
                boolean z;
                byte[] bArr;
                C0WCD c0wcd = this.LIZ;
                C0WCG c0wcg2 = c0wcg;
                AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (c0wcd.LJII().compileStatement("PRAGMA page_count").simpleQueryForLong() * c0wcd.LJII().compileStatement("PRAGMA page_size").simpleQueryForLong() >= c0wcd.LLILZ.LJ()) {
                    c0wcd.LIZLLL(1L, EnumC819310WCb.CACHE_FULL, c0wcg2.LJI());
                    return -1L;
                }
                Long lLJIILL = C0WCD.LJIILL(sQLiteDatabase, abstractC818550W9d2);
                if (lLJIILL != null) {
                    jInsert = lLJIILL.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", abstractC818550W9d2.LIZIZ());
                    contentValues.put("priority", Integer.valueOf(C816330W0p.LIZ(abstractC818550W9d2.LIZLLL())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (abstractC818550W9d2.LIZJ() != null) {
                        contentValues.put("extras", Base64.encodeToString(abstractC818550W9d2.LIZJ(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iLIZLLL = c0wcd.LLILZ.LIZLLL();
                byte[] bArr2 = c0wcg2.LIZLLL().LIZIZ;
                if (bArr2.length <= iLIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", c0wcg2.LJI());
                contentValues2.put("timestamp_ms", Long.valueOf(c0wcg2.LJ()));
                contentValues2.put("uptime_ms", Long.valueOf(c0wcg2.LJII()));
                contentValues2.put("payload_encoding", c0wcg2.LIZLLL().LIZ.LIZ);
                contentValues2.put("code", c0wcg2.LIZJ());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                if (z) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iLIZLLL));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iLIZLLL, Math.min(i * iLIZLLL, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c0wcg2.LIZIZ()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new C0WC7(jLongValue, abstractC818550W9d, c0wcg);
    }

    @Override // X.C0WCP
    public final void LLFZ(final long j, final AbstractC818550W9d abstractC818550W9d) {
        LJIILLIIL(new C0WCC() { // from class: X.0W0r
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                long j2 = j;
                AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC818550W9d2.LIZIZ(), String.valueOf(C816330W0p.LIZ(abstractC818550W9d2.LIZLLL()))}) < 1) {
                    contentValues.put("backend_name", abstractC818550W9d2.LIZIZ());
                    contentValues.put("priority", Integer.valueOf(C816330W0p.LIZ(abstractC818550W9d2.LIZLLL())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // X.InterfaceC819420WCm
    public final void LIZLLL(final long j, final EnumC819310WCb enumC819310WCb, final String str) {
        LJIILLIIL(new C0WCC() { // from class: X.0VSf
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                boolean z;
                String str2 = str;
                EnumC819310WCb enumC819310WCb2 = enumC819310WCb;
                long j2 = j;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(enumC819310WCb2.getNumber())});
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    cursorRawQuery.close();
                    if (!boolValueOf.booleanValue()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("log_source", str2);
                        contentValues.put("reason", Integer.valueOf(enumC819310WCb2.getNumber()));
                        contentValues.put("events_dropped_count", Long.valueOf(j2));
                        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
                    sbLIZ.append(j2);
                    sbLIZ.append(" WHERE log_source = ? AND reason = ?");
                    sQLiteDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ), new String[]{str2, Integer.toString(enumC819310WCb2.getNumber())});
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final List<C0WC9> LJIIZILJ(SQLiteDatabase sQLiteDatabase, final AbstractC818550W9d abstractC818550W9d, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lLJIILL = LJIILL(sQLiteDatabase, abstractC818550W9d);
        if (lLJIILL == null) {
            return arrayList;
        }
        LJIJJLI(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lLJIILL.toString()}, null, null, null, String.valueOf(i)), new C0WCC() { // from class: X.0WC5
            @Override // X.C0WCC
            public final Object apply(Object obj) {
                boolean z;
                C814570VxP c814570VxP;
                C814570VxP c814570VxP2;
                C0WCD c0wcd = this.LIZ;
                List list = arrayList;
                AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                Cursor cursor = (Cursor) obj;
                c0wcd.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C819250WBv c819250WBv = new C819250WBv();
                    c819250WBv.LJFF = new HashMap();
                    c819250WBv.LIZLLL(cursor.getString(1));
                    c819250WBv.LIZLLL = Long.valueOf(cursor.getLong(2));
                    c819250WBv.LJ = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            c814570VxP2 = C0WCD.LLILZLL;
                        } else {
                            c814570VxP2 = new C814570VxP(string);
                        }
                        c819250WBv.LIZJ(new C0WCB(c814570VxP2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            c814570VxP = C0WCD.LLILZLL;
                        } else {
                            c814570VxP = new C814570VxP(string2);
                        }
                        c819250WBv.LIZJ(new C0WCB(c814570VxP, (byte[]) C0WCD.LJIJJLI(c0wcd.LJII().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new C0WCC() { // from class: X.0VSe
                            @Override // X.C0WCC
                            public final Object apply(Object obj2) {
                                Cursor cursor2 = (Cursor) obj2;
                                ArrayList arrayList2 = new ArrayList();
                                int length = 0;
                                while (cursor2.moveToNext()) {
                                    byte[] blob = cursor2.getBlob(0);
                                    arrayList2.add(blob);
                                    length += blob.length;
                                }
                                byte[] bArr = new byte[length];
                                int length2 = 0;
                                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                    byte[] bArr2 = (byte[]) ListProtector.get(arrayList2, i2);
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                }
                                return bArr;
                            }
                        })));
                    }
                    if (!cursor.isNull(6)) {
                        c819250WBv.LIZIZ = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new C0WC7(j, abstractC818550W9d2, c819250WBv.LIZIZ()));
                }
                return null;
            }
        });
        return arrayList;
    }

    public C0WCD(C0WC2 c0wc2, C0WC2 c0wc22, AbstractC819510WCv abstractC819510WCv, C2211551Bh3 c2211551Bh3, InterfaceC819210WBr<String> interfaceC819210WBr) {
        this.LL = c2211551Bh3;
        this.LLILLJJLI = c0wc2;
        this.LLILLL = c0wc22;
        this.LLILZ = abstractC819510WCv;
        this.LLILZIL = interfaceC819210WBr;
    }
}
