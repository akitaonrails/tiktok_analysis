package X;

import Y.AAListenerS342S0100000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21367118jd extends RelativeLayout {
    public InterfaceC21367218je LL;
    public InterfaceC21367218je LLILLJJLI;
    public Boolean LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final ViewGroup LLILZLL;
    public final ViewGroup LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public final int LLJI;
    public ViewGroup LLJIJIL;
    public ViewGroup LLJILJIL;
    public ValueAnimator LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final FrameLayout LLJJI;
    public final FrameLayout LLJJIII;

    public final void LIZJ() {
        Boolean bool = this.LLILLL;
        if (bool == null) {
            this.LLILLL = Boolean.TRUE;
            LIZIZ(this.LLILZIL, this.LLILZ);
        } else {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                LIZ(this.LLILZIL, this.LLILZ);
            } else {
                LIZ(this.LLILZ, this.LLILZIL);
            }
            requestLayout();
        }
    }

    public final View getLeftSelectorView() {
        return this.LLIZLLLIL;
    }

    public final View getRightSelectorView() {
        return this.LLJ;
    }

    public C21367118jd(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        FrameLayout frameLayout = new FrameLayout(c19eg);
        this.LLJJI = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(c19eg);
        this.LLJJIII = frameLayout2;
        RelativeLayout.inflate(c19eg, R.layout.bo7, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.e2(this, 8);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.gdn);
        this.LLILZ = frameLayout3;
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.gdo);
        this.LLILZIL = frameLayout4;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mla);
        this.LLILZLL = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.tmk);
        this.LLIZ = viewGroup2;
        C786410Ut5.LJLZ(4, viewGroup);
        C786410Ut5.LJLZ(4, viewGroup2);
        frameLayout3.addView(frameLayout, 0, new RelativeLayout.LayoutParams(-1, -2));
        frameLayout4.addView(frameLayout2, 0, new RelativeLayout.LayoutParams(-1, -2));
    }

    public final void LIZ(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (this.LLJIJIL != null && this.LLJILJIL != null) {
            if (this.LLJILJILJ == null) {
                this.LLJJ = this.LLILZ.getWidth();
                int width = this.LLILZIL.getWidth();
                this.LLJILLL = width;
                ValueAnimator duration = ValueAnimator.ofInt(width, this.LLJJ).setDuration(this.LLJI);
                this.LLJILJILJ = duration;
                if (duration != null) {
                    duration.addUpdateListener(new AUListenerS279S0100000_32(this, 22));
                }
                ValueAnimator valueAnimator = this.LLJILJILJ;
                if (valueAnimator != null) {
                    valueAnimator.addListener(new AAListenerS342S0100000_32(this, 7));
                }
            }
            ValueAnimator valueAnimator2 = this.LLJILJILJ;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
                return;
            }
            return;
        }
        LIZIZ(viewGroup, viewGroup2);
    }

    public final void LIZIZ(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View childAt;
        View childAt2;
        View childAt3;
        View childAt4;
        this.LLJIJIL = viewGroup;
        this.LLJILJIL = viewGroup2;
        if (viewGroup2 != null && (childAt4 = viewGroup2.getChildAt(0)) != null) {
            C786410Ut5.LJLLLLLL(0, childAt4);
        }
        ViewGroup viewGroup3 = this.LLJIJIL;
        if (viewGroup3 != null && (childAt3 = viewGroup3.getChildAt(0)) != null) {
            C786410Ut5.LJLLLLLL(8, childAt3);
        }
        ViewGroup viewGroup4 = this.LLJIJIL;
        if (viewGroup4 != null && (childAt2 = viewGroup4.getChildAt(1)) != null) {
            C786410Ut5.LJLLLLLL(0, childAt2);
        }
        ViewGroup viewGroup5 = this.LLJILJIL;
        if (viewGroup5 != null && (childAt = viewGroup5.getChildAt(1)) != null) {
            C786410Ut5.LJLLLLLL(8, childAt);
        }
    }
}
