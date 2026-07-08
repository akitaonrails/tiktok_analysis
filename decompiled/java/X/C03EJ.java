package X;

import Y.ARunnableS7S1100000_1;
import android.content.Context;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(480));

    public static final void LIZ(Context context, String str) {
        try {
            if (context == null) {
                return;
            }
            try {
                if (((Boolean) C03EK.LIZ.getValue()).booleanValue()) {
                    C189200o6.m2constructorimpl(Boolean.valueOf(C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS7S1100000_1(context, str, 6))));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
