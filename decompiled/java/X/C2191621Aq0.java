package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.applog.priority.original.InsertCacheConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS48S0001000_3;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Aq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191621Aq0 implements InterfaceC2191651Aq3 {
    public final InterfaceC2190561AoI LIZ;
    public final C2191631Aq1 LIZIZ;
    public final C2190521AoE LIZJ;

    @Override // X.InterfaceC2191651Aq3
    public final void destroy() {
    }

    @Override // X.InterfaceC2191651Aq3
    public final Set<Integer> LIZLLL() {
        this.LIZIZ.LIZ(3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            SQLiteDatabase writableDatabase = this.LIZJ.getWritableDatabase();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select distinct(");
            sbLIZ.append("group_id");
            sbLIZ.append(") from ");
            sbLIZ.append("event");
            Cursor cursorRawQuery = writableDatabase.rawQuery(C2188811AlT.LIZIZ(sbLIZ), null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    linkedHashSet.add(Integer.valueOf(cursorRawQuery.getInt(0)));
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(cursorRawQuery, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(cursorRawQuery, th);
                        throw th;
                    }
                }
            }
            C2107108Nh.LIZ(cursorRawQuery, null);
            return linkedHashSet;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            this.LIZ.LIZIZ("SqliteDatabase:getAllGroupIds", th4, AFwS225S0000000_34.get$arr$(298));
            return linkedHashSet;
        }
    }

    @Override // X.InterfaceC2191651Aq3
    public final int LIZ(int i) {
        this.LIZIZ.LIZ(2);
        try {
            SQLiteDatabase writableDatabase = this.LIZJ.getWritableDatabase();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select count(1) from ");
            sbLIZ.append("event");
            sbLIZ.append(" where ");
            sbLIZ.append("group_id");
            sbLIZ.append(" = ?");
            Cursor cursorRawQuery = writableDatabase.rawQuery(C2188811AlT.LIZIZ(sbLIZ), new String[]{String.valueOf(i)});
            try {
                if (cursorRawQuery.moveToFirst()) {
                    int i2 = cursorRawQuery.getInt(0);
                    C2107108Nh.LIZ(cursorRawQuery, null);
                    return i2;
                }
                C2107108Nh.LIZ(cursorRawQuery, null);
                return 0;
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(cursorRawQuery, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            this.LIZ.LIZIZ("SqliteDatabase:count", th4, new AwS48S0001000_3(i, 7));
            return 0;
        }
    }

    @Override // X.InterfaceC2191651Aq3
    public final void LIZIZ(Iterable<C2191641Aq2> iterable) {
        SQLiteDatabase writableDatabase = this.LIZJ.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete from ");
            sbLIZ.append("event");
            sbLIZ.append(" where id = ?");
            SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement(C2188811AlT.LIZIZ(sbLIZ));
            try {
                for (C2191641Aq2 c2191641Aq2 : iterable) {
                    if (c2191641Aq2.LIZ >= 0) {
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindLong(1, c2191641Aq2.LIZ);
                        sQLiteStatementCompileStatement.executeUpdateDelete();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sQLiteStatementCompileStatement.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sQLiteStatementCompileStatement.close();
                throw th;
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        C2191771AqF.LIZ(writableDatabase);
    }

    @Override // X.InterfaceC2191651Aq3
    public final boolean LJFF(int i) {
        if (LIZ(i) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2191651Aq3
    public final C2191641Aq2 LJ(C2191641Aq2 c2191641Aq2, String str) {
        Function0<SQLiteDatabase> function0;
        C2191631Aq1 c2191631Aq1 = this.LIZIZ;
        if (!c2191631Aq1.LLIZLLLIL) {
            return c2191631Aq1.LLILLL.invoke(c2191641Aq2, str);
        }
        try {
            c2191631Aq1.LLILZIL.lock();
            ((ArrayList) c2191631Aq1.LLILZLL).add(new Pair(c2191641Aq2, str));
            if (((ArrayList) c2191631Aq1.LLILZLL).size() == 1) {
                C418201jw c418201jw = c2191631Aq1.LLIZ;
                AnonymousClass0956 anonymousClass0956 = c418201jw.LIZ.LLILZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C2191631Aq1 c2191631Aq12 = c418201jw.LIZ;
                c2191631Aq12.LLILZ = C23250099c.LIZLLL(c2191631Aq12, null, null, new C418101jv(c2191631Aq12, c418201jw, null), 3);
            }
            if (((ArrayList) c2191631Aq1.LLILZLL).size() >= c2191631Aq1.LL.maxCacheSize) {
                try {
                    c2191631Aq1.LLILLJJLI.invoke().beginTransaction();
                    for (Pair pair : (ArrayList) c2191631Aq1.LLILZLL) {
                        c2191631Aq1.LLILLL.invoke((C2191641Aq2) pair.getFirst(), (String) pair.getSecond());
                    }
                    ((ArrayList) c2191631Aq1.LLILZLL).clear();
                    AnonymousClass0956 anonymousClass09562 = c2191631Aq1.LLILZ;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    c2191631Aq1.LLILLJJLI.invoke().setTransactionSuccessful();
                    function0 = c2191631Aq1.LLILLJJLI;
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        function0 = c2191631Aq1.LLILLJJLI;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c2191631Aq1.LLILLJJLI.invoke().endTransaction();
                        throw th2;
                    }
                }
                function0.invoke().endTransaction();
            }
            c2191631Aq1.LLILZIL.unlock();
            return c2191641Aq2;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c2191631Aq1.LLILZIL.unlock();
            throw th3;
        }
    }

    public C2191621Aq0(InterfaceC2190561AoI interfaceC2190561AoI, Context context, String str, EnumC2191941AqW enumC2191941AqW) {
        this.LIZ = interfaceC2190561AoI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CREATE TABLE IF NOT EXISTS ");
        sbLIZ.append("event");
        sbLIZ.append(" (\n        id integer primary key autoincrement, \n        ");
        sbLIZ.append("group_id");
        sbLIZ.append(" integer NOT NULL, \n        ");
        sbLIZ.append("monitor_id");
        sbLIZ.append(" varchar(32) NOT NULL, \n        ");
        sbLIZ.append("event_type");
        sbLIZ.append(" integer NOT NULL, \n        ");
        sbLIZ.append("event_stained");
        sbLIZ.append(" integer default 0, \n        ");
        sbLIZ.append("timestamp");
        sbLIZ.append(" integer NOT NULL, \n        ");
        sbLIZ.append("event_name");
        sbLIZ.append(" varchar(255) NOT NULL, \n        ");
        sbLIZ.append("event_json");
        sbLIZ.append(" TEXT NOT NULL \n        )");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = new C2191631Aq1(new InsertCacheConfig(false, 0, 0L, null, 15, null), new AwS578S0100000_34(this, 217), new AwS648S0100000_34(this, 33));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("applog_priority_db_");
        sbLIZ2.append(enumC2191941AqW.name());
        sbLIZ2.append('@');
        sbLIZ2.append(str);
        this.LIZJ = new C2190521AoE(interfaceC2190561AoI, context, C2188811AlT.LIZIZ(sbLIZ2), 1, Collections.singletonList(strLIZIZ), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        X.C2107108Nh.LIZ(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        r4 = r5 ? 1 : 0;
     */
    @Override // X.InterfaceC2191651Aq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.HashMap<X.C2191641Aq2, org.json.JSONObject>, java.lang.Boolean> LIZJ(int r32, long r33, int r35, long r36, kotlin.jvm.functions.Function1<? super org.json.JSONObject, java.lang.Boolean> r38) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191621Aq0.LIZJ(int, long, int, long, kotlin.jvm.functions.Function1):kotlin.Pair");
    }
}
