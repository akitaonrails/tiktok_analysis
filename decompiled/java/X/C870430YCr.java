package X;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870430YCr {
    public final C0YEM LIZ;
    public final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();

    public final InterfaceC864790XwD LJ() {
        return this.LIZ.LJIIZILJ();
    }

    public final long LJFF() {
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            return 0L;
        }
        return interfaceC870450YCtLJI.LJJIZ();
    }

    public final boolean LJIIIZ() {
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        return interfaceC870450YCtLJI != null && interfaceC870450YCtLJI.LJJIJIIJI();
    }

    public C870430YCr(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final InterfaceC869960YAw LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, "compile_statement", null);
            return null;
        }
        try {
            InterfaceC869960YAw interfaceC869960YAwLJIIJJI = interfaceC870450YCtLJI.LJIIJJI(str);
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ("compile_statement");
            return interfaceC869960YAwLJIIJJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMDBProxy compileStatement:");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), e);
            C0YLL eventTracker = LJ().LJFF().getEventTracker();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMDBProxy  compileStatement ");
            sbLIZ2.append(str);
            eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ2), e, new HashMap());
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, "compile_statement", e);
            return null;
        }
    }

    public final long LJII(ContentValues contentValues) {
        return LJIIIIZZ("retry_request", contentValues, 2);
    }

    public final void LJIILIIL(String str) {
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMDBProxy ");
            sbLIZ.append(str);
            sbLIZ.append(" startTransaction failed, db = null");
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, "startTransaction", null);
            return;
        }
        if (interfaceC870450YCtLJI.LJJIJIIJI()) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMDBProxy ");
            sbLIZ2.append(str);
            sbLIZ2.append(" startTransaction, already inTransaction, current tid=");
            sbLIZ2.append(C786410Ut5.u3());
            c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), new RuntimeException());
            return;
        }
        try {
            if (this.LIZ.LJIIIZ().LJJIII) {
                interfaceC870450YCtLJI.LJJII();
            } else {
                interfaceC870450YCtLJI.LJIIIIZZ();
            }
            Integer num = this.LIZIZ.get(str);
            if (num == null) {
                this.LIZIZ.putIfAbsent(str, 1);
            } else {
                this.LIZIZ.replace(str, num, Integer.valueOf(num.intValue() + 1));
            }
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ("startTransaction");
            C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IMDBProxy ");
            sbLIZ3.append(str);
            sbLIZ3.append(" startTransaction successfully");
            c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL4 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("IMDBProxy ");
            sbLIZ4.append(str);
            sbLIZ4.append(" startTransaction failed");
            c868780Y6iLIZLLL4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), e);
            C0YLL eventTracker = LJ().LJFF().getEventTracker();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("IMDBProxy  startTransaction ");
            sbLIZ5.append(str);
            eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ5), e, new HashMap());
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, "startTransaction", e);
        }
    }

    public final void LIZJ(String str, boolean z) {
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMDBProxy ");
            sbLIZ.append(str);
            sbLIZ.append(" endTransaction failed, db = null");
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, "endTransaction", null);
            return;
        }
        if (interfaceC870450YCtLJI.LJJIJIIJI()) {
            try {
                if (z) {
                    interfaceC870450YCtLJI.LJJIIZ();
                } else {
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("IMDBProxy ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" endTransaction, failed! Changes will roll back.");
                    c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
                    c0yj9.LIZJ("imsdk_db_end_transaction_fail");
                    c0yj9.LIZ(str, "invoking_tag");
                    c0yj9.LIZ(this.LIZIZ.toString(), "started_tags");
                    c0yj9.LIZ(C786410Ut5.u3().toString(), "thread");
                    c0yj9.LIZLLL();
                }
                interfaceC870450YCtLJI.LJJIIZI();
                Integer num = this.LIZIZ.get(str);
                if (num != null) {
                    if (num.intValue() == 1) {
                        this.LIZIZ.remove(str, num);
                    } else {
                        this.LIZIZ.replace(str, num, Integer.valueOf(num.intValue() - 1));
                    }
                }
                C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMDBProxy ");
                sbLIZ3.append(str);
                sbLIZ3.append(" endTransaction, successful:");
                sbLIZ3.append(z);
                c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ("endTransaction");
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL4 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("IMDBProxy ");
                sbLIZ4.append(str);
                sbLIZ4.append(" endTransaction failed");
                c868780Y6iLIZLLL4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), e);
                C0YLL eventTracker = LJ().LJFF().getEventTracker();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("IMDBProxy  endTransaction ");
                sbLIZ5.append(str);
                eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ5), e, new HashMap());
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, "endTransaction", e);
                return;
            }
        }
        C868780Y6i c868780Y6iLIZLLL5 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("IMDBProxy ");
        sbLIZ6.append(str);
        sbLIZ6.append(" endTransaction, no transaction, current tid=");
        sbLIZ6.append(C786410Ut5.u3());
        c868780Y6iLIZLLL5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6), new RuntimeException());
    }

    public final boolean LIZLLL(String str, String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        boolean z = false;
        if (interfaceC870450YCtLJI == null) {
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, str2, null);
            return false;
        }
        try {
            interfaceC870450YCtLJI.LJIILJJIL(str);
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ(str2);
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMDBProxy execSQL:");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), e);
            C0YLL eventTracker = LJ().LJFF().getEventTracker();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMDBProxy  execSQL ");
            sbLIZ2.append(str2);
            sbLIZ2.append(str);
            eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ2), e, new HashMap());
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, str2, e);
        }
        LJIIJ(jUptimeMillis, str2, z);
        return z;
    }

    public final long LJI(String str, ContentValues contentValues) {
        return LJIIIIZZ(str, contentValues, 0);
    }

    public final long LJIIL(String str, ContentValues contentValues) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            C870440YCs c870440YCsLIZIZ = this.LIZ.LJIIZILJ().LJFF().LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replace ");
            sbLIZ.append(str);
            c870440YCsLIZIZ.LIZIZ(0, C2188811AlT.LIZIZ(sbLIZ), null);
            return -1L;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("replace:");
        sbLIZ2.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        try {
            try {
                long jLJJIJLIJ = interfaceC870450YCtLJI.LJJIJLIJ(str, contentValues);
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ(strLIZIZ);
                LJIIJ(jUptimeMillis, strLIZIZ, true);
                return jLJJIJLIJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMDBProxy replace, table:");
                sbLIZ3.append(str);
                sbLIZ3.append(", nullColumnHack:");
                sbLIZ3.append((String) null);
                c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), e);
                C0YLL eventTracker = LJ().LJFF().getEventTracker();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("IMDBProxy  replace, table ");
                sbLIZ4.append(str);
                eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ4), e, new HashMap());
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, strLIZIZ, e);
                LJIIJ(jUptimeMillis, strLIZIZ, false);
                return -1L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIJ(jUptimeMillis, strLIZIZ, false);
            throw th;
        }
    }

    public final boolean LIZIZ(String str, String str2, String[] strArr) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, "delete", null);
            return false;
        }
        try {
            try {
                int iLJJIJL = interfaceC870450YCtLJI.LJJIJL(str, str2, strArr);
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ("delete");
                if (iLJJIJL > 0) {
                    z = true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete:");
                sbLIZ.append(str);
                LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ), z);
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMDBProxy delete, table:");
                sbLIZ2.append(str);
                sbLIZ2.append(", whereClause:");
                sbLIZ2.append(str2);
                c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
                C0YLL eventTracker = LJ().LJFF().getEventTracker();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMDBProxy  delete, table ");
                sbLIZ3.append(str);
                eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ3), e, new HashMap());
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, "delete", e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("delete:");
                sbLIZ4.append(str);
                LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ4), false);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("delete:");
            sbLIZ5.append(str);
            LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ5), false);
            throw th;
        }
    }

    public final long LJIIIIZZ(String str, ContentValues contentValues, int i) {
        long jLJJJI;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertWithOnConflict:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        if (interfaceC870450YCtLJI == null) {
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, strLIZIZ, null);
            return -1L;
        }
        try {
            try {
                if (i != 1) {
                    if (i == 2) {
                        jLJJJI = interfaceC870450YCtLJI.LJJIL(str, contentValues);
                    } else {
                        jLJJJI = interfaceC870450YCtLJI.LJJIJIIJIL(str, contentValues);
                    }
                } else {
                    jLJJJI = interfaceC870450YCtLJI.LJJJI(str, contentValues);
                }
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("insertWithOnConflict id = ");
                sbLIZ2.append(jLJJJI);
                sbLIZ2.append(" table = ");
                sbLIZ2.append(str);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ(strLIZIZ);
                LJIIJ(jUptimeMillis, strLIZIZ, true);
                return jLJJJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMDBProxy insertWithOnConflict, table:");
                sbLIZ3.append(str);
                sbLIZ3.append(", nullColumnHack:");
                sbLIZ3.append((String) null);
                c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), e);
                C0YLL eventTracker = LJ().LJFF().getEventTracker();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("IMDBProxy  insert, table ");
                sbLIZ4.append(str);
                eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ4), e, new HashMap());
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, strLIZIZ, e);
                LJIIJ(jUptimeMillis, strLIZIZ, false);
                return -1L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIJ(jUptimeMillis, strLIZIZ, false);
            throw th;
        }
    }

    public final void LJIIJ(long j, String str, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (this.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZJ(this.LIZ.LJIIIZ().LJJLIIIIJ.LJJIFFI)) {
            C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
            c0yj9.LIZJ("im_sdk_db_operation");
            c0yj9.LIZ(str, "tag");
            c0yj9.LIZ(Long.valueOf(jUptimeMillis), "cost_time");
            if (C787080UuA.LIZ()) {
                try {
                    throw new IllegalAccessException("IMDB operation must not be called on the main thread");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0yj9.LIZ(Boolean.TRUE, "is_main_thread");
                    this.LIZ.LJIIZILJ().LJFF().getEventTracker().getClass();
                    c0yj9.LIZ(C0YLL.LIZIZ(e), "error_stack");
                    this.LIZ.LIZLLL().LJIIIZ("IMDBProxy Db Operation on the main thread", e);
                    LJ().LJFF().getEventTracker().LJFF("IMDBProxy  checkNotOnMainThread ", e, new HashMap());
                }
            }
            c0yj9.LIZ(Boolean.valueOf(z), "is_success");
            c0yj9.LIZLLL();
        }
    }

    public final InterfaceC869470Y8z LJIIJJI(String str, String str2, String[] strArr) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
        InterfaceC869470Y8z interfaceC869470Y8zLJJJ = null;
        if (interfaceC870450YCtLJI == null) {
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, str2, null);
            return null;
        }
        try {
            try {
                interfaceC869470Y8zLJJJ = interfaceC870450YCtLJI.LJJJ(str, strArr);
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ(str2);
                LJIIJ(jUptimeMillis, str2, true);
                return interfaceC869470Y8zLJJJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMDBProxy rawQuery: ");
                sbLIZ.append(str2);
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), e);
                C0YLL eventTracker = LJ().LJFF().getEventTracker();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMDBProxy  rawQuery ");
                sbLIZ2.append(str);
                eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ2), e, new HashMap());
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, str2, e);
                LJIIJ(jUptimeMillis, str2, false);
                return interfaceC869470Y8zLJJJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIJ(jUptimeMillis, str2, false);
            throw th;
        }
    }

    public final int LJIILJJIL(String str, ContentValues contentValues, String str2, String[] strArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!TextUtils.isEmpty(str)) {
            InterfaceC870450YCt interfaceC870450YCtLJI = this.LIZ.LJIIZILJ().LIZIZ().LIZ().LJI();
            if (interfaceC870450YCtLJI == null) {
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(0, "update", null);
                return -1;
            }
            try {
                try {
                    int iLJJIJIL = interfaceC870450YCtLJI.LJJIJIL(str, contentValues, str2, strArr);
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZJ(strLIZIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(str);
                    LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ2), true);
                    return iLJJIJIL;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("IMDBProxy update, table:");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", whereClause:");
                    sbLIZ3.append(str2);
                    c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), e);
                    C0YLL eventTracker = LJ().LJFF().getEventTracker();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("IMDBProxy  update, table ");
                    sbLIZ4.append(str);
                    eventTracker.LJFF(C2188811AlT.LIZIZ(sbLIZ4), e, new HashMap());
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZIZ(1, strLIZIZ, e);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append(str);
                    LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ5), false);
                    return -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append(str);
                LJIIJ(jUptimeMillis, C2188811AlT.LIZIZ(sbLIZ6), false);
                throw th;
            }
        }
        return -1;
    }
}
