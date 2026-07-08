package X;

import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import irm.AkS79S0100000_7;

/* JADX INFO: renamed from: X.0JMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490900JMy extends AbstractC490940JNc {
    public LinearLayout LLILZ;
    public LiveIconView LLILZIL;
    public ConstraintLayout LLILZLL;
    public FrameLayout LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public ValueAnimator LLJILJILJ;

    private final View getTopGradient() {
        View view = this.LLJIJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f833yab);
        this.LLJIJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getBodyContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c8_);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getBottomGradient() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.cdo);
        this.LLJILJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getBottomSection() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cgi);
            this.LLJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getCenterSection() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmk);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final FrameLayout getDetailSection() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.frk);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getFullScreenContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.io1);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout getHeaderSection() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jkd);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LiveIconView getPlayBtn() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jw7);
            this.LLILZIL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    @Override // X.AbstractC490940JNc, X.C0JN0
    public final void LIZ() {
        super.LIZ();
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C0JN5(this, null), 3);
    }

    @Override // X.AbstractC490940JNc, X.C0JN0
    public final void LIZIZ() {
        super.LIZIZ();
        C489640JIc c489640JIc = getPlayerChannel().LIZIZ.LIZIZ;
        FrameLayout detailSection = getDetailSection();
        if (detailSection != null) {
            C786410Ut5.LJJJJIZL(detailSection);
        }
        if (c489640JIc.LIZIZ instanceof C489660JIe) {
            C489720JIk c489720JIk = new C489720JIk(getContext());
            C0JO7 baseParent = getBaseParent();
            if (baseParent != null) {
                c489720JIk.LIZJ(baseParent, C2296808zG.LIZ(C0PEM.LIZ));
                FrameLayout detailSection2 = getDetailSection();
                if (detailSection2 != null) {
                    detailSection2.addView(c489720JIk);
                }
            }
        }
        FrameLayout bottomSection = getBottomSection();
        if (bottomSection != null) {
            C786410Ut5.LJJJJIZL(bottomSection);
        }
        if (c489640JIc.LIZJ instanceof C0JIZ) {
            final Context context = getContext();
            C0JN0 c0jn0 = new C0JN0(context) { // from class: X.0JIa
                public LiveIconView LLILLL;
                public C16F5 LLILZ;
                public LiveIconView LLILZIL;

                private final C16F5 getBannerMsgView() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.brz);
                        this.LLILZ = (C16F5) callbackFindViewById;
                    }
                    return (C16F5) callbackFindViewById;
                }

                private final LiveIconView getLeftIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.bry);
                        this.LLILLL = (LiveIconView) callbackFindViewById;
                    }
                    return (LiveIconView) callbackFindViewById;
                }

                private final LiveIconView getRightIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.bs3);
                        this.LLILZIL = (LiveIconView) callbackFindViewById;
                    }
                    return (LiveIconView) callbackFindViewById;
                }

                @Override // X.C0JN0
                public final void LIZIZ() {
                    C0JIZ c0jiz;
                    AbstractC489630JIb abstractC489630JIb = getPlayerChannel().LIZIZ.LIZIZ.LIZJ;
                    if (!(abstractC489630JIb instanceof C0JIZ) || (c0jiz = (C0JIZ) abstractC489630JIb) == null) {
                        return;
                    }
                    int i = C0JIW.LIZ[c0jiz.LIZ.ordinal()];
                    if (i == 1) {
                        C16F5 bannerMsgView = getBannerMsgView();
                        if (bannerMsgView != null) {
                            bannerMsgView.setText(C497740JfY.LJIJI(2131855777));
                            return;
                        }
                        return;
                    }
                    if (i == 2) {
                        C16F5 bannerMsgView2 = getBannerMsgView();
                        if (bannerMsgView2 != null) {
                            bannerMsgView2.setText(C497740JfY.LJIJI(2131855779));
                            return;
                        }
                        return;
                    }
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    C16F5 bannerMsgView3 = getBannerMsgView();
                    if (bannerMsgView3 != null) {
                        bannerMsgView3.setText(C497740JfY.LJIJI(2131855778));
                    }
                }

                {
                    C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfe, this, true);
                }
            };
            C0JO7 baseParent2 = getBaseParent();
            if (baseParent2 != null) {
                c0jn0.LIZJ(baseParent2, getCoroutineScope());
                FrameLayout bottomSection2 = getBottomSection();
                if (bottomSection2 != null) {
                    bottomSection2.addView(c0jn0);
                }
            }
        }
        if (LJFF()) {
            LinearLayout fullScreenContainer = getFullScreenContainer();
            if (fullScreenContainer != null) {
                C786410Ut5.I7(new AkS79S0100000_7(this, 10), fullScreenContainer);
            }
        } else {
            LinearLayout fullScreenContainer2 = getFullScreenContainer();
            if (fullScreenContainer2 != null) {
                C500260Jjc.LJIILIIL(fullScreenContainer2);
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(61, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        View topGradient = getTopGradient();
        if (topGradient != null) {
            topGradient.setBackground(gradientDrawable);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        View bottomGradient = getBottomGradient();
        if (bottomGradient != null) {
            bottomGradient.setBackground(gradientDrawable2);
        }
    }

    public final boolean LJFF() {
        if (!getPlayerChannel().LIZIZ.LIZIZ.LIZ) {
            return false;
        }
        Video video = getPlayerChannel().LIZ;
        return video.getWidth() > video.getHeight() && video.getDuration() > 30000;
    }

    @Override // X.AbstractC490940JNc
    public int getSeekbarDefaultPlayMode() {
        return ((long) getPlayerChannel().LIZIZ()) <= 30000 ? 4 : 0;
    }

    public C490900JMy(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfh, this, true);
    }

    public final ValueAnimator LJ(float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 20));
        return valueAnimatorOfFloat;
    }
}
