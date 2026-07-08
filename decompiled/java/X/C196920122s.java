package X;

import Y.ACListenerS163S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;

/* JADX INFO: renamed from: X.122s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196920122s extends C122I {
    public LinearLayout LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.C122I
    public final View LJFF() {
        LinearLayout linearLayoutLIZIZ;
        LinearLayout linearLayoutLIZLLL = LIZLLL();
        if (C196909122h.LIZIZ().LIZIZ.LIZIZ && this.LIZLLL && !this.LJIILJJIL) {
            if (C196909122h.LIZIZ().LIZIZ.LIZJ) {
                if (this.LJIILIIL) {
                    linearLayoutLIZIZ = LIZIZ(R.drawable.c8b, 2131850138);
                } else {
                    linearLayoutLIZIZ = LIZIZ(R.drawable.c8c, C196909122h.LJFF ? 2131850139 : 2131829877);
                }
                this.LJIIL = linearLayoutLIZIZ;
                View childAt = linearLayoutLIZIZ.getChildAt(0);
                C391040FUw.LIZ.getClass();
                Keva keva = C391040FUw.LIZIZ;
                if (!keva.getBoolean("read_text_guide_shown_v2", false)) {
                    keva.storeBoolean("read_text_guide_shown_v2", true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                    duration.setInterpolator(new TimeInterpolator() { // from class: X.1246
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            float f2;
                            if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                                return f * 1.11f;
                            }
                            if (0.36f <= f && f <= 0.56f) {
                                f2 = 0.04f;
                            } else {
                                if (0.56f > f || f > 0.8f) {
                                    return f;
                                }
                                f *= 0.833f;
                                f2 = 0.1336f;
                            }
                            return f + f2;
                        }
                    });
                    animatorSet.play(duration).after(duration.clone()).after(1500L);
                    animatorSet.start();
                }
                LinearLayout linearLayout = this.LJIIL;
                if (linearLayout != null) {
                    C786410Ut5.R7(linearLayout, new AkS95S0100000_29(this, 75));
                }
                linearLayoutLIZLLL.addView(this.LJIIL);
                linearLayoutLIZLLL.addView(LIZJ());
                this.LJIIJ = true;
            } else {
                LinearLayout linearLayoutLIZIZ2 = this.LJIILIIL ? LIZIZ(R.drawable.a_t, 2131829878) : LIZIZ(R.drawable.a_t, 2131829877);
                this.LJIIL = linearLayoutLIZIZ2;
                View childAt2 = linearLayoutLIZIZ2.getChildAt(0);
                C391040FUw.LIZ.getClass();
                Keva keva2 = C391040FUw.LIZIZ;
                if (!keva2.getBoolean("read_text_guide_shown", false)) {
                    keva2.storeBoolean("read_text_guide_shown", true);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                    duration2.setInterpolator(new TimeInterpolator() { // from class: X.1245
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f) {
                            float f2;
                            if ((0.0f <= f && f <= 0.18f) || (0.18f <= f && f <= 0.36f)) {
                                return f * 1.11f;
                            }
                            if (0.36f <= f && f <= 0.56f) {
                                f2 = 0.04f;
                            } else {
                                if (0.56f > f || f > 0.8f) {
                                    return f;
                                }
                                f *= 0.833f;
                                f2 = 0.1336f;
                            }
                            return f + f2;
                        }
                    });
                    animatorSet2.play(duration2).after(duration2.clone()).after(1500L);
                    animatorSet2.start();
                }
                LinearLayout linearLayout2 = this.LJIIL;
                if (linearLayout2 != null) {
                    C786410Ut5.R7(linearLayout2, new AkS95S0100000_29(this, 76));
                }
                linearLayoutLIZLLL.addView(this.LJIIL);
                linearLayoutLIZLLL.addView(LIZJ());
                this.LJIIJ = true;
            }
        }
        LinearLayout linearLayoutLIZIZ3 = LIZIZ(R.drawable.a_u, 2131829851);
        LinearLayout linearLayoutLIZIZ4 = LIZIZ(R.drawable.a_r, 2131829874);
        C786410Ut5.R7(linearLayoutLIZIZ3, new ACListenerS163S0100000_29(this, 238));
        C786410Ut5.R7(linearLayoutLIZIZ4, new ACListenerS163S0100000_29(this, 239));
        if (this.LIZLLL) {
            linearLayoutLIZLLL.addView(linearLayoutLIZIZ3);
            linearLayoutLIZLLL.addView(LIZJ());
            this.LJIIIZ = 3;
        } else {
            this.LJIIIZ = 2;
        }
        linearLayoutLIZLLL.addView(linearLayoutLIZIZ4);
        return linearLayoutLIZLLL;
    }

    public C196920122s(View view, C196908122g c196908122g) {
        super(view, c196908122g);
    }

    @Override // X.C122I
    public final void LJIIIZ(RectF rectF, int i, int i2, float f, boolean z, C123U c123u) {
        this.LJIILIIL = z;
        super.LJIIIZ(rectF, i, i2, f, z, c123u);
    }
}
