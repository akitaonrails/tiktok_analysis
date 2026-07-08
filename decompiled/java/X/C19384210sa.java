package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19384210sa extends AbstractC19390410ta {
    public C19418310y5 LLILZLL;
    public final C19391010tg LLIZ;

    public C19384210sa() {
        super(R.id.qi0);
        this.LLIZ = new C19391010tg(C452501pT.LIZIZ(new AwS573S0100000_29(this, 1083)), C13LE.LIZ(ControlOverlayViewModel.class));
    }

    @Override // X.AbstractC19390410ta
    public final View LJI(Context context) {
        C19418310y5 c19418310y5 = new C19418310y5(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        layoutParams.gravity = 80;
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19418310y5);
        c19418310y5.setLayoutParams(layoutParams);
        c19418310y5.setClickable(false);
        int visibility = c19418310y5.getVisibility();
        c19418310y5.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c19418310y5);
        this.LLILZLL = c19418310y5;
        return c19418310y5;
    }

    @Override // X.AbstractC19390410ta
    public final void LJIILJJIL(View view) {
        ((ControlOverlayViewModel) this.LLIZ.getValue()).LLIZLLLIL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 153));
        ((ControlOverlayViewModel) this.LLIZ.getValue()).LLILZLL.observe(LJIIIIZZ(), new AObserverS231S0100000_29(this, 154));
    }
}
