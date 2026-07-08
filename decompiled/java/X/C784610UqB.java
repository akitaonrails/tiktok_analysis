package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784610UqB {
    public static volatile C784610UqB LIZ;

    public static C784610UqB LIZ() {
        if (LIZ == null) {
            synchronized (C784610UqB.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C784610UqB();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static final void LIZIZ(Context context, C784600UqA c784600UqA) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", c784600UqA.LIZJ);
        bundle.putBoolean("hide_status_bar", c784600UqA.LIZLLL);
        C786410Ut5.LJJJI("title", c784600UqA.LIZIZ, bundle);
        bundle.putBoolean("show_progress", false);
        bundle.putBoolean("bundle_user_webview_title", c784600UqA.LJI);
        C786410Ut5.LJJJI("status_bar_color", c784600UqA.LJ, bundle);
        C786410Ut5.LJJJI("status_bar_bg_color", c784600UqA.LJFF, bundle);
        bundle.putInt("bundle_web_view_background_color", C497740JfY.LJFF(R.color.a2g));
        C786410Ut5.LJJJI("original_scheme", null, bundle);
        C786410Ut5.LJJJI("soft_input_mode", null, bundle);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveBrowser(c784600UqA.LIZ, bundle, context);
    }
}
