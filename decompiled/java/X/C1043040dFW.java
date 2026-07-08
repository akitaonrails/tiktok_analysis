package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043040dFW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(285));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(284));

    public static void LIZ(Runnable runnable) {
        try {
            C01GW c01gw = LIZIZ;
            if (Intrinsics.LJFF(((Handler) c01gw.getValue()).getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                C786410Ut5.LJJZZIII((Handler) c01gw.getValue(), runnable);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ad_ssp_preload_thread throws exception: ");
            sbLIZ.append(th.getMessage());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "CommerceLandPageSSPContext_");
        }
    }
}
