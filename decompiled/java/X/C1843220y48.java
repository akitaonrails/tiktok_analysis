package X;

import Y.AUListenerS230S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0y48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843220y48 extends AbstractC1842530y31 {
    public final long LJJIIZ;
    public final long LJJIIZI;
    public final long LJJIJ;
    public final long LJJIJIIJI;
    public ValueAnimator LJJIJIIJIL;
    public ValueAnimator LJJIJIL;
    public ValueAnimator LJJIJL;
    public ValueAnimator LJJIJLIJ;
    public ValueAnimator LJJIL;
    public ValueAnimator LJJIZ;
    public ValueAnimator LJJJ;
    public ValueAnimator LJJJI;
    public ValueAnimator LJJJIL;
    public ValueAnimator LJJJJ;
    public ValueAnimator LJJJJI;
    public ValueAnimator LJJJJIZL;
    public ValueAnimator LJJJJJ;
    public ValueAnimator LJJJJJL;
    public ValueAnimator LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;

    @Override // X.AbstractC1842530y31
    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJJIJIIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LJJIJL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LJJIJLIJ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LJJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LJJIZ;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator valueAnimator7 = this.LJJJ;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        ValueAnimator valueAnimator8 = this.LJJJI;
        if (valueAnimator8 != null) {
            valueAnimator8.cancel();
        }
        ValueAnimator valueAnimator9 = this.LJJJIL;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
        ValueAnimator valueAnimator10 = this.LJJJJ;
        if (valueAnimator10 != null) {
            valueAnimator10.cancel();
        }
        ValueAnimator valueAnimator11 = this.LJJJJI;
        if (valueAnimator11 != null) {
            valueAnimator11.cancel();
        }
        ValueAnimator valueAnimator12 = this.LJJJJIZL;
        if (valueAnimator12 != null) {
            valueAnimator12.cancel();
        }
        ValueAnimator valueAnimator13 = this.LJJJJJ;
        if (valueAnimator13 != null) {
            valueAnimator13.cancel();
        }
        ValueAnimator valueAnimator14 = this.LJJJJJL;
        if (valueAnimator14 != null) {
            valueAnimator14.cancel();
        }
        ValueAnimator valueAnimator15 = this.LJJJJL;
        if (valueAnimator15 != null) {
            valueAnimator15.cancel();
        }
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIJJI() {
        super.LJIIJJI();
        C786410Ut5.o5(this.LJIILLIIL, 1.0f);
        C786410Ut5.V4(this.LJIILL, 1.0f);
        C786410Ut5.hd(this.LJIIJJI, 0.0f);
        C786410Ut5.cd(0.0f, this.LJIILIIL);
        C786410Ut5.hd(this.LJIILJJIL, 0.0f);
        C786410Ut5.pd(this.LJIILLIIL, 0.0f);
        C786410Ut5.LJLLLLLL(8, this.LJ);
        C786410Ut5.T4(this.LJ, 1.0f);
        C1810690xDf.LIZ.getClass();
        C1810690xDf.LJFF = false;
    }

    public C1843220y48(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
        this.LJJIIZ = 4000L;
        this.LJJIIZI = 4250L;
        this.LJJIJ = 4500L;
        this.LJJIJIIJI = 4250L;
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIIZ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2) {
        String content;
        String content2;
        Integer numValueOf;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        C1810690xDf.LIZ.getClass();
        C1810690xDf.LJFF = true;
        AbstractC1842530y31.LJIIL(this, this.LJIILL, c1842470y2v, false, false, 12);
        C1844320y5u c1844320y5u = this.LJIILLIIL;
        RankAnimationInfo rankAnimationInfo = c1842470y2v.LJI;
        if (rankAnimationInfo == null || (content = rankAnimationInfo.getContent()) == null) {
            content = c1842470y2v.LIZIZ;
        }
        c1844320y5u.setText(content);
        int i = C1843070y3t.LIZ[AbstractC1842530y31.LIZJ(c1842470y2v, c1842470y2v2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat.setStartDelay(0L);
                    valueAnimatorOfFloat.setDuration(750L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 69));
                    this.LJJJIL = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                    valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat2.setStartDelay(0L);
                    valueAnimatorOfFloat2.setDuration(750L);
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 42));
                    valueAnimatorOfFloat2.addListener(new C1704130uRn() { // from class: X.0y4D
                        @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            C1843220y48 c1843220y48 = this.LL;
                            c1843220y48.LJIJ(c1842470y2v, c1842470y2v2, c1843220y48.LJIILLIIL.getText().toString());
                        }

                        @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                            C1843220y48 c1843220y48 = this.LL;
                            C786410Ut5.hd(c1843220y48.LJIILJJIL, c1843220y48.LIZIZ.LJIILL);
                        }
                    });
                    this.LJJJJ = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.start();
                }
            } else {
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat3.setStartDelay(0L);
                valueAnimatorOfFloat3.setDuration(750L);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(this, 83));
                this.LJJIL = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.start();
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat4.setStartDelay(0L);
                valueAnimatorOfFloat4.setDuration(750L);
                valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(this, 56));
                valueAnimatorOfFloat4.addListener(new C1704130uRn() { // from class: X.0y4E
                    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C1843220y48 c1843220y48 = this.LL;
                        c1843220y48.LJIJ(c1842470y2v, c1842470y2v2, c1843220y48.LJIILLIIL.getText().toString());
                    }

                    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                        C1843220y48 c1843220y48 = this.LL;
                        C786410Ut5.pd(c1843220y48.LJIILLIIL, c1843220y48.LIZIZ.LJIILL);
                    }
                });
                this.LJJIZ = valueAnimatorOfFloat4;
                valueAnimatorOfFloat4.start();
            }
        } else {
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfFloat5.setStartDelay(0L);
            valueAnimatorOfFloat5.setDuration(300L);
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS275S0100000_27(this, 77));
            this.LJJIJIIJIL = valueAnimatorOfFloat5;
            valueAnimatorOfFloat5.start();
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfFloat6.setStartDelay(300L);
            valueAnimatorOfFloat6.setDuration(700L);
            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS275S0100000_27(this, 49));
            valueAnimatorOfFloat6.addListener(new C1704130uRn() { // from class: X.0y4G
                @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C1843220y48 c1843220y48 = this.LL;
                    c1843220y48.LJIJ(c1842470y2v, c1842470y2v2, c1843220y48.LJIILLIIL.getText().toString());
                }

                @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                    C786410Ut5.o5(this.LL.LJIILLIIL, 0.0f);
                }
            });
            this.LJJIJIL = valueAnimatorOfFloat6;
            valueAnimatorOfFloat6.start();
        }
        C786410Ut5.LJLLLLLL(0, this.LJ);
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(0.5f, 0.5f), Keyframe.ofFloat(0.75f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfKeyframe);
        valueAnimator.setDuration(Mp4ScreenVideoLoadTimeout.CONTROL);
        valueAnimator.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        valueAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 33));
        valueAnimator.addListener(new C1864940ydA(this, 6));
        this.LJJJJJ = valueAnimator;
        valueAnimator.start();
        this.LJJJJLI = this.LIZJ.getWidth();
        TextView textView = this.LJIIIIZZ;
        RankAnimationInfo rankAnimationInfo2 = c1842470y2v.LJI;
        if (rankAnimationInfo2 == null || (content2 = rankAnimationInfo2.getContent()) == null) {
            content2 = c1842470y2v.LIZIZ;
        }
        textView.setText(content2);
        AbstractC1842530y31.LJIIJ(this.LJFF);
        int measuredWidth = this.LJFF.getMeasuredWidth();
        int iIntValue = this.LIZIZ.LJFF.invoke().intValue();
        if (measuredWidth > iIntValue) {
            measuredWidth = iIntValue;
        }
        this.LJJJJLL = measuredWidth;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJJJJLI, measuredWidth);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        valueAnimatorOfInt.setStartDelay(0L);
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 5));
        this.LJJJJJL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
        C1842430y2r c1842430y2r = this.LIZIZ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        } else {
            numValueOf = null;
        }
        int iLIZ = c1842430y2r.LIZ(numValueOf);
        this.LIZJ.setCardBackgroundColor(iLIZ);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iLIZ, this.LIZIZ.LJIIIZ);
        valueAnimatorOfArgb.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfArgb.setStartDelay(0L);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 36));
        this.LJJJJI = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public final void LJIJ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2, String str) {
        LJIILL(EnumC1842640y3C.ONCE, this.LJIILLIIL, str, 0L, new InterfaceC1704110uRl() { // from class: X.0y49
            @Override // X.InterfaceC1704110uRl
            public final void LIZ(int i) {
                long j;
                long j2;
                long j3;
                Integer numValueOf;
                long j4;
                C1810410xDD c1810410xDD;
                RankTypeV2 rankTypeV2;
                long j5;
                long j6;
                long j7;
                long j8;
                if (i > 0) {
                    this.LIZ.LJIILLIIL.setScrollEnabled(false);
                }
                C1843220y48 c1843220y48 = this.LIZ;
                C1842470y2v c1842470y2v3 = c1842470y2v;
                C1842470y2v c1842470y2v4 = c1842470y2v2;
                c1843220y48.getClass();
                int i2 = C1843070y3t.LIZ[AbstractC1842530y31.LIZJ(c1842470y2v3, c1842470y2v4).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1843220y48.LIZIZ.LJIILL, 0.0f);
                            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                            if (c1843220y48.LJJII) {
                                j7 = 0;
                            } else {
                                j7 = c1843220y48.LJJIIZI;
                            }
                            valueAnimatorOfFloat.setStartDelay(j7);
                            valueAnimatorOfFloat.setDuration(750L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 67));
                            valueAnimatorOfFloat.start();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, c1843220y48.LIZIZ.LJIILL * (-1.0f));
                            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                            if (c1843220y48.LJJII) {
                                j8 = 0;
                            } else {
                                j8 = c1843220y48.LJJIIZI;
                            }
                            valueAnimatorOfFloat2.setStartDelay(j8);
                            valueAnimatorOfFloat2.setDuration(750L);
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 46));
                            valueAnimatorOfFloat2.addListener(new C1864940ydA(c1843220y48, 12));
                            valueAnimatorOfFloat2.start();
                        }
                    } else {
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(c1843220y48.LIZIZ.LJIILL, 0.0f);
                        valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                        if (c1843220y48.LJJII) {
                            j5 = 0;
                        } else {
                            j5 = c1843220y48.LJJIIZI;
                        }
                        valueAnimatorOfFloat3.setStartDelay(j5);
                        valueAnimatorOfFloat3.setDuration(750L);
                        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 80));
                        valueAnimatorOfFloat3.addListener(new C1864940ydA(c1843220y48, 28));
                        c1843220y48.LJJJ = valueAnimatorOfFloat3;
                        valueAnimatorOfFloat3.start();
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, c1843220y48.LIZIZ.LJIILL * (-1.0f));
                        valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                        if (c1843220y48.LJJII) {
                            j6 = 0;
                        } else {
                            j6 = c1843220y48.LJJIIZI;
                        }
                        valueAnimatorOfFloat4.setStartDelay(j6);
                        valueAnimatorOfFloat4.setDuration(750L);
                        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 60));
                        valueAnimatorOfFloat4.addListener(new C1864940ydA(c1843220y48, 22));
                        c1843220y48.LJJJI = valueAnimatorOfFloat4;
                        valueAnimatorOfFloat4.start();
                    }
                } else {
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
                    if (c1843220y48.LJJII) {
                        j = 700;
                    } else {
                        j = c1843220y48.LJJIIZ + 700;
                    }
                    valueAnimatorOfFloat5.setStartDelay(j);
                    valueAnimatorOfFloat5.setDuration(300L);
                    valueAnimatorOfFloat5.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 75));
                    c1843220y48.LJJIJL = valueAnimatorOfFloat5;
                    valueAnimatorOfFloat5.start();
                    ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
                    if (c1843220y48.LJJII) {
                        j2 = 0;
                    } else {
                        j2 = c1843220y48.LJJIIZ;
                    }
                    valueAnimatorOfFloat6.setStartDelay(j2);
                    valueAnimatorOfFloat6.setDuration(700L);
                    valueAnimatorOfFloat6.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 53));
                    valueAnimatorOfFloat6.addListener(new C1864940ydA(c1843220y48, 15));
                    c1843220y48.LJJIJLIJ = valueAnimatorOfFloat6;
                    valueAnimatorOfFloat6.start();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1843220y48.LJJJJLL, c1843220y48.LJJJJLI);
                valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                if (c1843220y48.LJJII) {
                    j3 = 250;
                } else {
                    j3 = c1843220y48.LJJIJIIJI;
                }
                valueAnimatorOfInt.setStartDelay(j3);
                valueAnimatorOfInt.setDuration(750L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(c1843220y48, valueAnimatorOfInt, 2));
                c1843220y48.LJJJJL = valueAnimatorOfInt;
                valueAnimatorOfInt.start();
                C1842430y2r c1842430y2r = c1843220y48.LIZIZ;
                if (c1842470y2v4 != null && (c1810410xDD = c1842470y2v4.LIZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
                    numValueOf = Integer.valueOf(rankTypeV2.type);
                } else {
                    numValueOf = null;
                }
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(c1843220y48.LIZIZ.LJIIIZ, c1842430y2r.LIZ(numValueOf));
                valueAnimatorOfArgb.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
                if (c1843220y48.LJJII) {
                    j4 = 500;
                } else {
                    j4 = c1843220y48.LJJIJ;
                }
                valueAnimatorOfArgb.setStartDelay(j4);
                valueAnimatorOfArgb.setDuration(500L);
                valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(c1843220y48, 85));
                valueAnimatorOfArgb.addListener(new C1864940ydA(c1843220y48, 4));
                c1843220y48.LJJJJIZL = valueAnimatorOfArgb;
                valueAnimatorOfArgb.start();
            }
        }, true);
    }
}
