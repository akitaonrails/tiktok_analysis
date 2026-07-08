package X;

import Y.ACListenerS164S0100000_30;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20299114bl extends C14TT {
    public final C20299214bm LLL;

    @Override // X.C14TT, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public final void LIZJ() throws Throwable {
        Activity activityLIZJ;
        Window window;
        C20299214bm c20299214bm = this.LLL;
        C1473870oSP mTextureView = getMTextureView();
        if (c20299214bm.LIZIZ) {
            return;
        }
        c20299214bm.LIZIZ = true;
        c20299214bm.LIZ = mTextureView;
        c20299214bm.LIZJ.setFocusableInTouchMode(true);
        c20299214bm.LIZJ.requestFocus();
        Activity activityLIZ = C1388190mED.LIZ(c20299214bm.LIZLLL);
        C20299214bm.LIZLLL(activityLIZ, false);
        Activity activityLIZJ2 = C20299214bm.LIZJ(activityLIZ);
        if (activityLIZJ2 != null && (window = activityLIZJ2.getWindow()) != null) {
            window.setFlags(1024, 1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(5894);
            }
        }
        try {
            if (C20299214bm.LIZ(activityLIZ) && (activityLIZJ = C20299214bm.LIZJ(activityLIZ)) != null) {
                activityLIZJ.setRequestedOrientation(0);
            }
            C786410Ut5.LJJJLZIJ(c20299214bm.LIZ, c20299214bm.LJ);
            Activity activityLIZJ3 = C20299214bm.LIZJ(c20299214bm.LIZLLL);
            ViewGroup viewGroup = activityLIZJ3 != null ? (ViewGroup) activityLIZJ3.findViewById(R.id.content) : null;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (viewGroup != null) {
                viewGroup.addView(c20299214bm.LIZJ, layoutParams);
            }
            c20299214bm.LIZJ.addView(c20299214bm.LIZ, new FrameLayout.LayoutParams(-1, -1));
            c20299214bm.LIZJ.setBackgroundColor(-16777216);
            C786410Ut5.Sd(com.zhiliaoapp.musically.R.layout.bit, C786410Ut5.ne(activityLIZ), c20299214bm.LIZJ);
            ImageView imageView = (ImageView) activityLIZ.findViewById(com.zhiliaoapp.musically.R.id.cnb);
            if (imageView != null) {
                C786410Ut5.Q7(imageView, new ACListenerS164S0100000_30(c20299214bm, 46));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public final void LIZLLL() throws Throwable {
        this.LLL.LIZIZ();
    }

    public C20299114bl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLL = new C20299214bm(context, this);
    }
}
