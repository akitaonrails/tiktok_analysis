package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429770GtD extends ConstraintLayout {
    public C1324720kZq LL;
    public C1324720kZq LLILLJJLI;
    public C1324720kZq LLILLL;
    public C1324720kZq LLILZ;
    public ConstraintLayout LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C16F5 LLIZLLLIL;

    private final int getScreenWidthInPx() {
        try {
            return C497740JfY.LJIIZILJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static int e0(int i) {
        return (int) C497740JfY.LIZIZ(i);
    }

    private final void setGuestEffectScoreBarMarginAndBias(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams4;
        if (C426750GoL.LJFF()) {
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                C786410Ut5.Yb(c1324720kZq, -1.0f);
            }
            C1324720kZq c1324720kZq2 = this.LLILZ;
            if (c1324720kZq2 != null) {
                C786410Ut5.Yb(c1324720kZq2, -1.0f);
            }
        } else {
            C1324720kZq c1324720kZq3 = this.LLILLL;
            if (c1324720kZq3 != null) {
                C786410Ut5.Yb(c1324720kZq3, 1.0f);
            }
            C1324720kZq c1324720kZq4 = this.LLILZ;
            if (c1324720kZq4 != null) {
                C786410Ut5.Yb(c1324720kZq4, 1.0f);
            }
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILZIL);
        View view = this.LLILZLL;
        if (view != null) {
            c19mb.LJJII(0.46f, view.getId());
            c19mb.LIZIZ(this.LLILZIL);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        if (z) {
            C1324720kZq c1324720kZq5 = this.LLILLL;
            if (c1324720kZq5 != null) {
                layoutParams3 = c1324720kZq5.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof C19ME) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginStart(e0(8));
                }
            } else {
                marginLayoutParams2 = null;
            }
            C1324720kZq c1324720kZq6 = this.LLILLL;
            if (c1324720kZq6 != null) {
                C786410Ut5.u6(c1324720kZq6, marginLayoutParams2);
            }
            C1324720kZq c1324720kZq7 = this.LLILZ;
            if (c1324720kZq7 != null) {
                layoutParams4 = c1324720kZq7.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            if ((layoutParams4 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams3.setMarginEnd(e0(48));
            }
            C1324720kZq c1324720kZq8 = this.LLILZ;
            if (c1324720kZq8 != null) {
                C786410Ut5.u6(c1324720kZq8, marginLayoutParams3);
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq9 = this.LLILLL;
        if (c1324720kZq9 != null) {
            layoutParams = c1324720kZq9.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(e0(6));
            }
        } else {
            marginLayoutParams = null;
        }
        C1324720kZq c1324720kZq10 = this.LLILLL;
        if (c1324720kZq10 != null) {
            C786410Ut5.u6(c1324720kZq10, marginLayoutParams);
        }
        C1324720kZq c1324720kZq11 = this.LLILZ;
        if (c1324720kZq11 != null) {
            layoutParams2 = c1324720kZq11.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams3.setMarginEnd(e0(38));
        }
        C1324720kZq c1324720kZq12 = this.LLILZ;
        if (c1324720kZq12 == null) {
            return;
        }
        C786410Ut5.u6(c1324720kZq12, marginLayoutParams3);
    }

    private final void setGuestEffectScoreBarWidthAndHeight(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9 = null;
        if (z) {
            ConstraintLayout constraintLayout = this.LLILZIL;
            if (constraintLayout != null) {
                layoutParams5 = constraintLayout.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.width = e0(320);
                }
            } else {
                layoutParams5 = null;
            }
            ConstraintLayout constraintLayout2 = this.LLILZIL;
            if (constraintLayout2 != null) {
                C786410Ut5.m6(constraintLayout2, layoutParams5);
            }
            View view = this.LLILZLL;
            if (view != null) {
                layoutParams6 = view.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = e0(16);
                    layoutParams6.width = e0(74);
                }
            } else {
                layoutParams6 = null;
            }
            View view2 = this.LLILZLL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams6);
            }
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                layoutParams7 = c1324720kZq.getLayoutParams();
            } else {
                layoutParams7 = null;
            }
            if (layoutParams7 != null) {
                layoutParams7.height = e0(12);
            }
            if (layoutParams7 != null) {
                layoutParams7.width = e0(51);
            }
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.u6(c1324720kZq2, layoutParams7);
            }
            C1324720kZq c1324720kZq3 = this.LLILZ;
            if (c1324720kZq3 != null) {
                layoutParams8 = c1324720kZq3.getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.height = e0(12);
                    layoutParams8.width = e0(51);
                }
            } else {
                layoutParams8 = null;
            }
            C1324720kZq c1324720kZq4 = this.LLILZ;
            if (c1324720kZq4 != null) {
                C786410Ut5.u6(c1324720kZq4, layoutParams8);
            }
            View view3 = this.LLIZ;
            if (view3 != null && (layoutParams9 = view3.getLayoutParams()) != null) {
                layoutParams9.height = e0(11);
                layoutParams9.width = e0(11);
            }
            View view4 = this.LLIZ;
            if (view4 != null) {
                C786410Ut5.W5(view4, layoutParams9);
            }
            C16F5 c16f5 = this.LLIZLLLIL;
            if (c16f5 != null) {
                c16f5.setTextSize(13.0f);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout3 = this.LLILZIL;
        if (constraintLayout3 != null) {
            layoutParams = constraintLayout3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = e0(257);
            }
        } else {
            layoutParams = null;
        }
        ConstraintLayout constraintLayout4 = this.LLILZIL;
        if (constraintLayout4 != null) {
            C786410Ut5.m6(constraintLayout4, layoutParams);
        }
        View view5 = this.LLILZLL;
        if (view5 != null) {
            layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = e0(14);
                layoutParams2.width = e0(60);
            }
        } else {
            layoutParams2 = null;
        }
        View view6 = this.LLILZLL;
        if (view6 != null) {
            C786410Ut5.W5(view6, layoutParams2);
        }
        C1324720kZq c1324720kZq5 = this.LLILLL;
        if (c1324720kZq5 != null) {
            layoutParams3 = c1324720kZq5.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 != null) {
            layoutParams3.height = e0(10);
        }
        if (layoutParams3 != null) {
            layoutParams3.width = e0(41);
        }
        C1324720kZq c1324720kZq6 = this.LLILLL;
        if (c1324720kZq6 != null) {
            C786410Ut5.u6(c1324720kZq6, layoutParams3);
        }
        C1324720kZq c1324720kZq7 = this.LLILZ;
        if (c1324720kZq7 != null) {
            layoutParams4 = c1324720kZq7.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = e0(10);
                layoutParams4.width = e0(41);
            }
        } else {
            layoutParams4 = null;
        }
        C1324720kZq c1324720kZq8 = this.LLILZ;
        if (c1324720kZq8 != null) {
            C786410Ut5.u6(c1324720kZq8, layoutParams4);
        }
        View view7 = this.LLIZ;
        if (view7 != null && (layoutParams9 = view7.getLayoutParams()) != null) {
            layoutParams9.height = e0(9);
            layoutParams9.width = e0(9);
        }
        View view8 = this.LLIZ;
        if (view8 != null) {
            C786410Ut5.W5(view8, layoutParams9);
        }
        C16F5 c16f52 = this.LLIZLLLIL;
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextSize(11.0f);
    }

    public final void h0(boolean z) {
        C1143680frq.LIZLLL(this.LLIZ, "tiktok_live_interaction_normal_4", "count_down_for_all_star.png");
        C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_normal_4", "count_down_for_all_guest_effect_bg.png");
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null) {
            c1324720kZq.setAdjustViewBounds(true);
        }
        C1324720kZq c1324720kZq2 = this.LLILZ;
        if (c1324720kZq2 != null) {
            c1324720kZq2.setAdjustViewBounds(true);
        }
        C1324720kZq c1324720kZq3 = this.LLILLL;
        if (c1324720kZq3 != null) {
            c1324720kZq3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        C1324720kZq c1324720kZq4 = this.LLILZ;
        if (c1324720kZq4 != null) {
            c1324720kZq4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_interaction_normal_4", "count_down_for_all_0_score_bar.png");
        C1143680frq.LIZLLL(this.LLILLL, "tiktok_live_interaction_normal_4", "count_down_for_all_0_score_bar.png");
        if (z) {
            C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_normal_4", "count_down_for_all_guest_effect_390wide.png");
        } else {
            C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_normal_4", "count_down_for_all_guest_effect_390narrow.png");
        }
    }

    public final void setGuestEffectTargetScoreText(String str) {
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 != null) {
            c16f5.setText(str);
        }
    }

    public C429770GtD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.g3u, C786410Ut5.ne(getContext()), this);
        this.LL = (C1324720kZq) viewSd.findViewById(R.id.ood);
        this.LLILLJJLI = (C1324720kZq) viewSd.findViewById(R.id.ooc);
        this.LLILZIL = (ConstraintLayout) viewSd.findViewById(R.id.oog);
        this.LLILZLL = viewSd.findViewById(R.id.oof);
        this.LLILLL = (C1324720kZq) viewSd.findViewById(R.id.ooa);
        this.LLILZ = (C1324720kZq) viewSd.findViewById(R.id.oob);
        this.LLIZ = viewSd.findViewById(R.id.ooh);
        this.LLIZLLLIL = (C16F5) viewSd.findViewById(R.id.ooi);
        if (getScreenWidthInPx() >= e0(390)) {
            i0(320, 166);
            setGuestEffectScoreBarWidthAndHeight(true);
            setGuestEffectScoreBarMarginAndBias(true);
            h0(true);
            return;
        }
        i0(257, 134);
        setGuestEffectScoreBarWidthAndHeight(false);
        setGuestEffectScoreBarMarginAndBias(false);
        h0(false);
    }

    public final void i0(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        C1324720kZq c1324720kZq = this.LL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c1324720kZq != null) {
            layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = e0(i2);
            }
        } else {
            layoutParams = null;
        }
        C1324720kZq c1324720kZq2 = this.LL;
        if (c1324720kZq2 != null) {
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
        C1324720kZq c1324720kZq3 = this.LL;
        if (c1324720kZq3 != null) {
            c1324720kZq3.setOutlineProvider(new C0IDB(this, 0));
        }
        C1324720kZq c1324720kZq4 = this.LL;
        if (c1324720kZq4 != null) {
            c1324720kZq4.setClipToOutline(true);
        }
        C1324720kZq c1324720kZq5 = this.LLILLJJLI;
        if (c1324720kZq5 != null && (layoutParams2 = c1324720kZq5.getLayoutParams()) != null) {
            layoutParams2.height = e0(i2);
            layoutParams2.width = e0(i);
        }
        C1324720kZq c1324720kZq6 = this.LLILLJJLI;
        if (c1324720kZq6 != null) {
            C786410Ut5.u6(c1324720kZq6, layoutParams2);
        }
    }
}
