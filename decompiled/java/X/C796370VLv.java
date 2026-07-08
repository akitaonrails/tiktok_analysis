package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.database.OptInPopupDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796370VLv implements InterfaceC19217410Ge {
    public static final C796370VLv LIZ = new C796370VLv();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(174));

    public static OptInPopupDatabase LJI() {
        return (OptInPopupDatabase) LIZIZ.getValue();
    }

    @Override // X.InterfaceC19217410Ge
    public final List<C10GS> LIZ() {
        List<C10GS> listLIZ;
        synchronized (C10GS.LJIIJJI) {
            try {
                listLIZ = LJI().LIZ().LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLIZ;
    }

    @Override // X.InterfaceC19217410Ge
    public final void LIZLLL(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i);
        synchronized (LIZ) {
            try {
                int iLIZLLL = LJI().LIZ().LIZLLL(jCurrentTimeMillis);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearExpiredTaskRecords(");
                sbLIZ.append(iLIZLLL);
                sbLIZ.append(") before ");
                sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(jCurrentTimeMillis)));
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC19217410Ge
    public final long LJ(C10GS c10gs) {
        long jLJ;
        synchronized (C10GS.LJIIJJI) {
            try {
                jLJ = LJI().LIZ().LJ(c10gs);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insertOptInPopupRecord(");
                sbLIZ.append(jLJ);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jLJ;
    }

    @Override // X.InterfaceC19217410Ge
    public final C10GS LJFF(long j) {
        C10GS c10gsLJFF;
        synchronized (C10GS.LJIIJJI) {
            try {
                c10gsLJFF = LJI().LIZ().LJFF(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c10gsLJFF;
    }

    @Override // X.InterfaceC19217410Ge
    public final List<C10GS> LIZIZ(long j, long j2) {
        List<C10GS> listLIZIZ;
        synchronized (C10GS.LJIIJJI) {
            try {
                listLIZIZ = LJI().LIZ().LIZIZ(j, j2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLIZIZ;
    }

    @Override // X.InterfaceC19217410Ge
    public final void LIZJ(int i, long j, long j2, String str) {
        synchronized (C10GS.LJIIJJI) {
            try {
                int iLIZJ = LJI().LIZ().LIZJ(i, j, j2, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateOptInPopupAction(");
                sbLIZ.append(iLIZJ);
                sbLIZ.append(")：[");
                sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(j)));
                sbLIZ.append("]action = ");
                sbLIZ.append(i);
                sbLIZ.append(", actionTS = ");
                sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(j2)));
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
