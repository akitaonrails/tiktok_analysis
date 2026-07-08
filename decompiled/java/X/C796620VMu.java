package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomTrackingLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0VMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796620VMu {
    public static final String[] LJIIL = {"UPDATE", "DELETE", "INSERT"};
    public final String[] LIZIZ;
    public final Map<String, Set<String>> LIZJ;
    public final AbstractC796540VMm LIZLLL;
    public volatile InterfaceC796340VLs LJI;
    public final C796640VMw LJII;
    public final C796670VMz LJIIIIZZ;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public volatile boolean LJFF = false;
    public final SafeIterableMap<AbstractC796650VMx, C796610VMt> LJIIIZ = new SafeIterableMap<>();
    public final Object LJIIJ = new Object();
    public final RunnableC796600VMs LJIIJJI = new Runnable() { // from class: X.0VMs
        public final void LIZ() {
            Set<Integer> setLIZIZ;
            Lock closeLock = this.LL.LIZLLL.getCloseLock();
            closeLock.lock();
            C0VLF c0vlfLJLJJI = null;
            try {
                try {
                } catch (Throwable th) {
                    closeLock.unlock();
                    this.LL.getClass();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                e = e;
                setLIZIZ = null;
            }
            if (!this.LL.LIZJ()) {
                closeLock.unlock();
                this.LL.getClass();
                return;
            }
            if (!this.LL.LJ.compareAndSet(true, false)) {
                closeLock.unlock();
                this.LL.getClass();
                return;
            }
            if (this.LL.LIZLLL.inTransaction()) {
                closeLock.unlock();
                this.LL.getClass();
                return;
            }
            try {
                try {
                    c0vlfLJLJJI = this.LL.LIZLLL.mOpenHelper.LJLJJI();
                    c0vlfLJLJJI.LJJII();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    setLIZIZ = LIZIZ();
                    c0vlfLJLJJI.LJJIIZ();
                    c0vlfLJLJJI.LJJIIZI();
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    c0vlfLJLJJI.LJJIIZI();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalStateException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
            }
            closeLock.unlock();
            this.LL.getClass();
            if (setLIZIZ != null || setLIZIZ.isEmpty()) {
            }
            synchronized (this.LL.LJIIIZ) {
                try {
                    Iterator<Map.Entry<AbstractC796650VMx, C796610VMt>> it2 = this.LL.LJIIIZ.iterator();
                    while (it2.hasNext()) {
                        C796610VMt value = it2.next().getValue();
                        int length = value.LIZ.length;
                        Set<String> hashSet = null;
                        for (int i = 0; i < length; i++) {
                            if (setLIZIZ.contains(Integer.valueOf(value.LIZ[i]))) {
                                if (length == 1) {
                                    hashSet = value.LIZLLL;
                                } else {
                                    if (hashSet == null) {
                                        hashSet = new HashSet<>(length);
                                    }
                                    hashSet.add(value.LIZIZ[i]);
                                }
                            }
                        }
                        if (hashSet != null) {
                            value.LIZJ.LIZ(hashSet);
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return;
            TryCatchGuardChecker.doCheck(e);
            closeLock.unlock();
            this.LL.getClass();
            if (setLIZIZ != null) {
            }
        }

        public final Set<Integer> LIZIZ() {
            HashSet hashSet = new HashSet();
            Cursor cursorQuery = this.LL.LIZLLL.query(new C0VN1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", null));
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            if (!hashSet.isEmpty()) {
                this.LL.LJI.LJIIL();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    public static final void LJI() {
    }

    public final boolean LIZJ() {
        if (!this.LIZLLL.isOpen()) {
            return false;
        }
        if (!this.LJFF) {
            this.LIZLLL.mOpenHelper.LJLJJI();
        }
        return this.LJFF;
    }

    public final void LIZ(AbstractC796650VMx abstractC796650VMx) {
        C796610VMt c796610VMtPutIfAbsent;
        String[] strArrLJ = LJ(abstractC796650VMx.LIZ);
        int[] iArr = new int[strArrLJ.length];
        int length = strArrLJ.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.LIZ.get(strArrLJ[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("There is no table with name ");
                sbLIZ.append(strArrLJ[i]);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C796610VMt c796610VMt = new C796610VMt(abstractC796650VMx, iArr, strArrLJ);
        synchronized (this.LJIIIZ) {
            try {
                c796610VMtPutIfAbsent = this.LJIIIZ.putIfAbsent(abstractC796650VMx, c796610VMt);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c796610VMtPutIfAbsent == null && this.LJII.LIZIZ(iArr) && this.LIZLLL.isOpen()) {
            LJII(this.LIZLLL.mOpenHelper.LJLJJI());
        }
    }

    public final void LIZLLL(AbstractC796650VMx abstractC796650VMx) {
        C796610VMt c796610VMtRemove;
        synchronized (this.LJIIIZ) {
            try {
                c796610VMtRemove = this.LJIIIZ.remove(abstractC796650VMx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c796610VMtRemove != null && this.LJII.LIZJ(c796610VMtRemove.LIZ) && this.LIZLLL.isOpen()) {
            LJII(this.LIZLLL.mOpenHelper.LJLJJI());
        }
    }

    public final String[] LJ(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.LIZJ.containsKey(lowerCase)) {
                hashSet.addAll(this.LIZJ.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final void LJII(C0VLF c0vlf) {
        if (c0vlf.LJJIJIIJI()) {
            return;
        }
        try {
            Lock closeLock = this.LIZLLL.getCloseLock();
            closeLock.lock();
            try {
                synchronized (this.LJIIJ) {
                    try {
                        int[] iArrLIZ = this.LJII.LIZ();
                        if (iArrLIZ == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length = iArrLIZ.length;
                        if (c0vlf.LLIIJLIL()) {
                            c0vlf.LJJII();
                        } else {
                            c0vlf.LJIIIIZZ();
                        }
                        for (int i = 0; i < length; i++) {
                            int i2 = iArrLIZ[i];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    String str = this.LIZIZ[i];
                                    StringBuilder sb = new StringBuilder();
                                    for (String str2 : LJIIL) {
                                        sb.setLength(0);
                                        sb.append("DROP TRIGGER IF EXISTS ");
                                        sb.append("`");
                                        sb.append("room_table_modification_trigger_");
                                        sb.append(str);
                                        sb.append("_");
                                        sb.append(str2);
                                        sb.append("`");
                                        c0vlf.LJIILJJIL(sb.toString());
                                    }
                                }
                            } else {
                                LJFF(i, c0vlf);
                            }
                        }
                        c0vlf.LJJIIZ();
                        c0vlf.LJJIIZI();
                        closeLock.unlock();
                    } catch (Throwable th) {
                        c0vlf.LJJIIZI();
                        throw th;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                closeLock.unlock();
                throw th2;
            }
        } catch (SQLiteException | IllegalStateException th22) {
        }
    }

    public final LiveData LIZIZ(String[] strArr, Callable callable) {
        C796670VMz c796670VMz = this.LJIIIIZZ;
        String[] strArrLJ = LJ(strArr);
        for (String str : strArrLJ) {
            if (!this.LIZ.containsKey(str.toLowerCase(Locale.US))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("There is no table with name ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        c796670VMz.getClass();
        return new RoomTrackingLiveData(c796670VMz.LIZIZ, c796670VMz, false, callable, strArrLJ);
    }

    public final void LJFF(int i, C0VLF c0vlf) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sbLIZ.append(i);
        sbLIZ.append(", 0)");
        c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        String str = this.LIZIZ[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : LJIIL) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            c0vlf.LJIILJJIL(sb.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VMs] */
    public C796620VMu(AbstractC796540VMm abstractC796540VMm, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.LIZLLL = abstractC796540VMm;
        this.LJII = new C796640VMw(strArr.length);
        this.LIZJ = map2;
        this.LJIIIIZZ = new C796670VMz(abstractC796540VMm);
        int length = strArr.length;
        this.LIZIZ = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.LIZ.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) ((HashMap) map).get(strArr[i]);
            if (str2 != null) {
                this.LIZIZ[i] = str2.toLowerCase(locale);
            } else {
                this.LIZIZ[i] = lowerCase;
            }
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.LIZ.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.LIZ;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }
}
