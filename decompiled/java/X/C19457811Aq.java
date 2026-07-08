package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19457811Aq implements InterfaceC194555119t {
    public static final /* synthetic */ int LLIZ = 0;
    public final Effect LL;
    public View LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public final ARunnableS129S0100000_29 LLILZLL = new ARunnableS129S0100000_29(this, 247);

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLILZIL;
    }

    public C19457811Aq(Effect effect) {
        this.LL = effect;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        View viewFindViewById;
        TextView textView;
        if (frameLayout == null) {
            return;
        }
        this.LLILLL = frameLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d98, frameLayout, false);
        this.LLILLJJLI = viewTd;
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewTd);
        }
        View view = this.LLILLJJLI;
        C1322110kVd c1322110kVd = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.i2v);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        View view2 = this.LLILLJJLI;
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.w6v)) != null) {
            String hint = this.LL.getHint();
            if (hint == null) {
                hint = "";
            }
            textView.setText(hint);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            c1322110kVd = (C1322110kVd) view3.findViewById(R.id.w6w);
        }
        C1741940vQm.LIZLLL(8, c1322110kVd);
        View view4 = this.LLILZ;
        if (view4 != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view4.startAnimation(alphaAnimation);
        }
        View view5 = this.LLILZ;
        if (view5 != null) {
            HandlerHook.viewPostDelay(view5, this.LLILZLL, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        View view = this.LLILZ;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLILZLL);
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(this.LLILLJJLI, frameLayout);
        }
        this.LLILZIL = false;
    }
}
