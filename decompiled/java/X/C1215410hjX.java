package X;

import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215410hjX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        Context context;
        Integer numLIZJ;
        if (!C1EDI.LJ()) {
            if (view != null && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                view.setBackgroundColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        view.setBackgroundColor(0);
    }

    public static void LIZIZ(View view) {
        Integer numLIZJ;
        if (view != null) {
            Context context = view.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context)) != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
            HandlerHook.viewPostDelay(view, new ARunnableS119S0100000_19(view, 146), Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }
}
