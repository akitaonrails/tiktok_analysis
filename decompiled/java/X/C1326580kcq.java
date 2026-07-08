package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326580kcq {
    public static volatile EnumC1326550kcn LIZ = EnumC1326550kcn.NOT_ENTERED;
    public static volatile EnumC1326570kcp LIZIZ = EnumC1326570kcp.IDLE;

    public static boolean LIZ() {
        return (LIZ == EnumC1326550kcn.NOT_ENTERED || LIZ == EnumC1326550kcn.SECOND_REFRESH_DONE) ? false : true;
    }

    public static void LIZIZ(EnumC1326570kcp enumC1326570kcp) {
        LIZIZ = enumC1326570kcp;
        int i = C1326560kco.LIZIZ[enumC1326570kcp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(70));
                    return;
                }
                throw new C1954807lC();
            }
            C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(69));
            return;
        }
        C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(68));
    }

    public static void LIZJ(EnumC1326550kcn enumC1326550kcn) {
        LIZ = enumC1326550kcn;
        int[] iArr = C1326560kco.LIZ;
        int i = iArr[enumC1326550kcn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(72));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(71));
                }
            } else {
                C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(74));
            }
        } else {
            C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(73));
        }
        int i2 = iArr[enumC1326550kcn.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                final long jUptimeMillis = SystemClock.uptimeMillis();
                final String str = "second_refresh_ui_finish";
                C786410Ut5.LJJZZIII(C788270Uw5.LIZ, new Runnable() { // from class: X.00y3
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcomMallMainThreadLoadReporter@c37a.report$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcomMallMainThreadLoadReporter@c37a.report$1");
                    }

                    public final void LIZ() {
                        Object c098200Yq;
                        try {
                            C1018703yb.LJ("rd_tiktokec_mall_main_thread_load", C2097608Jq.LJIIIIZZ(new Pair("stage", str), new Pair("duration", Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis))));
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }
                });
                return;
            }
            return;
        }
        final long jUptimeMillis2 = SystemClock.uptimeMillis();
        final String str2 = "second_refresh_api_return";
        C786410Ut5.LJJZZIII(C788270Uw5.LIZ, new Runnable() { // from class: X.00y3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcomMallMainThreadLoadReporter@c37a.report$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcomMallMainThreadLoadReporter@c37a.report$1");
            }

            public final void LIZ() {
                Object c098200Yq;
                try {
                    C1018703yb.LJ("rd_tiktokec_mall_main_thread_load", C2097608Jq.LJIIIIZZ(new Pair("stage", str2), new Pair("duration", Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2))));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        });
    }
}
