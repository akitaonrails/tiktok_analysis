package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.LoginProxyImpl;

/* JADX INFO: renamed from: X.0XPD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPD {
    public static C0XPE LIZ;
    public static boolean LIZIZ;

    public static C0XPE LIZ() {
        if (LIZ == null && !LIZIZ) {
            synchronized (C0XPD.class) {
                try {
                    if (!LIZIZ) {
                        LIZ = LoginProxyImpl.LIZIZ().LIZ();
                        LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(Activity activity, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        if (LIZ() != null) {
            if (activity != null && !activity.isFinishing()) {
                LIZ().LIZIZ(activity, str, str2, bundle, interfaceC849390XTt);
                return;
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }

    public static void LIZJ(Fragment fragment, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        if (LIZ() != null) {
            if (fragment != null && fragment.getActivity() != null && !C0R1H.LIZ(fragment.getActivity())) {
                LIZ().LIZ(fragment, str, str2, bundle, interfaceC849390XTt);
                return;
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }
}
