package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470390IcX {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(View view) {
        C21538419Qw c21538419Qw;
        if ((view instanceof C16FS) && (c21538419Qw = (C21538419Qw) view) != null) {
            c21538419Qw.setRadius(C418440Gaw.LIZIZ(22));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, c21538419Qw.getContext());
            if (numLIZJ != null) {
                c21538419Qw.setBackgroundColor(numLIZJ.intValue());
            }
            C14K9.LJIILLIIL(c21538419Qw, null);
        }
    }

    public static final void LIZ(LiveIconView liveIconView, int i) {
        Object c098200Yq;
        Context context = liveIconView.getContext();
        if (context == null) {
            return;
        }
        try {
            c098200Yq = C20736316Cj.LJI(i, context);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        liveIconView.setImageDrawable((Drawable) c098200Yq);
    }
}
