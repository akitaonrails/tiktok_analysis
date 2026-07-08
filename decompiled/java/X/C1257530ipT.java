package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ipT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257530ipT extends C1257550ipV {
    public TuxIconView LLILZ;
    public EnumC1257740ipo LLILZIL;

    @Override // X.C1257550ipV, android.view.View
    public final void onFinishInflate() {
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.ag4);
        this.LLILZ = tuxIconView;
        if (tuxIconView != null) {
            getAnimatingViews().add(tuxIconView);
        }
        super.onFinishInflate();
    }

    public final EnumC1257740ipo getButtonState() {
        return this.LLILZIL;
    }

    public final void setAdditionViewVisibility(int i) {
        C786410Ut5.LJLLLLLL(i, findViewById(R.id.wpt));
    }

    public final void setAdditionalSupportImageResource(int i) {
        setAdditionViewVisibility(0);
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    public final void setButtonState(EnumC1257740ipo enumC1257740ipo) {
        this.LLILZIL = enumC1257740ipo;
    }

    public final void setSupportIconState(EnumC1257740ipo enumC1257740ipo) {
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            int i = C1257730ipn.LIZ[enumC1257740ipo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILZIL = EnumC1257740ipo.TOGGLED;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = tuxIconView.animate();
                    viewPropertyAnimatorAnimate.rotation(180.0f);
                    viewPropertyAnimatorAnimate.setDuration(0L);
                    return;
                }
                throw new C1954807lC();
            }
            this.LLILZIL = EnumC1257740ipo.INITIAL;
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = tuxIconView.animate();
            viewPropertyAnimatorAnimate2.rotation(0.0f);
            viewPropertyAnimatorAnimate2.setDuration(0L);
        }
    }

    public final void setVideoNumber(String str) {
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.video_number);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        tuxTextView.setText(str);
    }

    public C1257530ipT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = EnumC1257740ipo.INITIAL;
    }
}
