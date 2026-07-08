package X;

import Y.AUListenerS230S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingEntranceCompetitionNodeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingPerceptionImprovementSetting;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceRiseAndFallAnimationConfig;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842980y3k extends AbstractC1842530y31 {
    public final long LJJIIZ;
    public ValueAnimator LJJIIZI;
    public ValueAnimator LJJIJ;
    public ValueAnimator LJJIJIIJI;
    public ValueAnimator LJJIJIIJIL;
    public ValueAnimator LJJIJIL;
    public ValueAnimator LJJIJL;
    public ValueAnimator LJJIJLIJ;
    public ValueAnimator LJJIL;
    public ValueAnimator LJJIZ;
    public boolean LJJJ;

    @Override // X.AbstractC1842530y31
    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJJIIZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJJIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LJJIJIIJI;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LJJIJIIJIL;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LJJIJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LJJIJL;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator valueAnimator7 = this.LJJIJLIJ;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        ValueAnimator valueAnimator8 = this.LJJIL;
        if (valueAnimator8 != null) {
            valueAnimator8.cancel();
        }
        ValueAnimator valueAnimator9 = this.LJJIZ;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIJJI() {
        super.LJIIJJI();
        C786410Ut5.LJLZ(8, LIZLLL());
        C786410Ut5.R4(1.0f, LIZLLL());
    }

    public final void LJIJ(C1842470y2v c1842470y2v) {
        C20441214yg.LIZIZ("Ranking Entrance Unification", "setUpFirstContainerBGColorChangeAnimation");
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LIZIZ.LIZ(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type)), this.LIZIZ.LJIIIZ);
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        valueAnimatorOfArgb.setStartDelay(0L);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 38));
        this.LJJIL = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public final void LJIJI(C1842470y2v c1842470y2v) {
        int i;
        int i2;
        boolean z;
        int width;
        int width2;
        float f;
        float f2;
        C1843110y3x c1843110y3xLIZ = C1489430orV.LIZ(this.LJIILIIL.getText().toString());
        C1843110y3x c1843110y3xLIZ2 = C1489430orV.LIZ(c1842470y2v.LIZIZ);
        if (c1843110y3xLIZ != null && c1843110y3xLIZ2 != null && Intrinsics.LJFF(c1843110y3xLIZ.LIZ, c1843110y3xLIZ2.LIZ) && Intrinsics.LJFF(c1843110y3xLIZ.LIZJ, c1843110y3xLIZ2.LIZJ) && (i = c1843110y3xLIZ.LIZIZ) != (i2 = c1843110y3xLIZ2.LIZIZ)) {
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJJI.getWidth();
            C497740JfY.LIZIZ(8.0f);
            C786410Ut5.LJZL(8, this.LJIIJJI);
            C786410Ut5.LJLZ(0, LIZLLL());
            C786410Ut5.R4(1.0f, LIZLLL());
            LJ().setText(c1843110y3xLIZ.LIZ);
            LJFF().setText(String.valueOf(c1843110y3xLIZ.LIZIZ));
            LJI().setText(c1843110y3xLIZ.LIZJ);
            TextView textView = this.LJJI;
            if (textView != null) {
                textView.setText(String.valueOf(c1843110y3xLIZ2.LIZIZ));
            }
            ImageView imageView = this.LJIJI;
            if (imageView == null) {
                imageView = null;
            }
            AbstractC1842530y31.LJIIL(this, imageView, c1842470y2v, false, false, 12);
            ViewGroup viewGroup = this.LJJIFFI;
            if (viewGroup != null) {
                width = viewGroup.getWidth();
            } else {
                width = LJFF().getWidth();
            }
            ViewGroup viewGroup2 = this.LJJIFFI;
            if (viewGroup2 != null) {
                width2 = viewGroup2.getWidth();
            } else {
                width2 = LJFF().getWidth();
            }
            ViewGroup viewGroup3 = this.LJJIFFI;
            if (viewGroup3 != null) {
                AbstractC1842530y31.LJIIJ(viewGroup3);
                width = viewGroup3.getMeasuredWidth();
                C786410Ut5.LLIL(LJFF(), 8);
                TextView textView2 = this.LJJI;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                AbstractC1842530y31.LJIIJ(viewGroup3);
                width2 = viewGroup3.getMeasuredWidth();
                C786410Ut5.LLIL(LJFF(), 0);
                TextView textView3 = this.LJJI;
                if (textView3 != null) {
                    C786410Ut5.LLIL(textView3, 8);
                }
            }
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            if (z) {
                f = this.LIZIZ.LJIILL * (-1.0f);
            } else {
                f = this.LIZIZ.LJIILL;
            }
            fArr[1] = f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat.setStartDelay(0L);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 54));
            this.LJJIIZI = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            float[] fArr2 = new float[2];
            if (z) {
                f2 = this.LIZIZ.LJIILL;
            } else {
                f2 = (-1.0f) * this.LIZIZ.LJIILL;
            }
            fArr2[0] = f2;
            fArr2[1] = 0.0f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat2.setStartDelay(0L);
            valueAnimatorOfFloat2.setDuration(750L);
            valueAnimatorOfFloat2.addListener(new C1864930yd9(this, c1843110y3xLIZ2, 3));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 50));
            this.LJJIJ = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.start();
            C1842430y2r c1842430y2r = this.LIZIZ;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(c1842430y2r.LJIILJJIL, c1842430y2r.LJIILIIL);
            valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
            valueAnimatorOfFloat3.setStartDelay(250L);
            valueAnimatorOfFloat3.setDuration(500L);
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(this, 47));
            this.LJJIJIIJI = valueAnimatorOfFloat3;
            valueAnimatorOfFloat3.start();
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.LIZIZ.LJIILIIL, 1.0f);
            valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
            valueAnimatorOfFloat4.setStartDelay(2250L);
            valueAnimatorOfFloat4.setDuration(500L);
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(this, 45));
            this.LJJIJIIJIL = valueAnimatorOfFloat4;
            valueAnimatorOfFloat4.start();
            C1842430y2r c1842430y2r2 = this.LIZIZ;
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(c1842430y2r2.LJIIJ, c1842430y2r2.LJIIJJI);
            valueAnimatorOfArgb.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfArgb.setStartDelay(2250L);
            valueAnimatorOfArgb.setDuration(750L);
            valueAnimatorOfArgb.addListener(new C1864940ydA(this, 8));
            this.LJJIJIL = valueAnimatorOfArgb;
            valueAnimatorOfArgb.start();
            int width3 = this.LIZJ.getWidth();
            this.LJIIIIZZ.setText(c1842470y2v.LIZIZ);
            AbstractC1842530y31.LJIIJ(this.LJFF);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width3, this.LJFF.getMeasuredWidth());
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfInt.setStartDelay(0L);
            valueAnimatorOfInt.setDuration(750L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 3));
            this.LJJIJL = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(width, width2);
            valueAnimatorOfInt2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfInt2.setStartDelay(0L);
            valueAnimatorOfInt2.setDuration(750L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt2, 6));
            this.LJJIJLIJ = valueAnimatorOfInt2;
            valueAnimatorOfInt2.start();
            if (this.LJJJ) {
                LJIJ(c1842470y2v);
                LJIJJ(c1842470y2v);
                return;
            }
            return;
        }
        LJIILIIL(false);
    }

    public final void LJIJJ(C1842470y2v c1842470y2v) {
        long j;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "setUpSecondContainerBGColorChangeAnimation");
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LIZIZ.LJIIIZ, this.LIZIZ.LIZ(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type)));
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        if (this.LJJII) {
            j = 0;
        } else {
            j = this.LJJIIZ;
        }
        valueAnimatorOfArgb.setStartDelay(j);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 39));
        valueAnimatorOfArgb.addListener(new C1864940ydA(this, 7));
        this.LJJIZ = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public C1842980y3k(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
        this.LJJIIZ = 3000L;
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIIZ(final C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        int i;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "RiseAndFallProcessor - playInternal");
        LJII();
        if (c1842470y2v2 != null) {
            i = (int) c1842470y2v2.LJ;
        } else {
            i = 0;
        }
        int i2 = (int) c1842470y2v.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUpContainerBGColorChangeAnimation - ");
        sbLIZ.append(c1842470y2v.LIZ.LIZIZ);
        sbLIZ.append(" - ");
        sbLIZ.append(i);
        sbLIZ.append(" - ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("Ranking Entrance Unification", "needToChangeContainerBGColor set to FALSE");
        this.LJJJ = false;
        if ((!Intrinsics.LJFF(c1842470y2v.LIZ.LIZIZ, RankTypeV2.LJIJJLI) || LivePopularityRankingPerceptionImprovementSetting.INSTANCE.riseAndFallAnimBgColorOpt()) && ((!Intrinsics.LJFF(c1842470y2v.LIZ.LIZIZ, RankTypeV2.LIZ) && !Intrinsics.LJFF(c1842470y2v.LIZ.LIZIZ, RankTypeV2.LJIIL)) || LiveCreatorRankingEntranceCompetitionNodeSetting.INSTANCE.getValue())) {
            loop0: for (LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig rankingRiseAndFallAnimationConfig : LiveRankingEntranceRiseAndFallAnimationConfig.INSTANCE.getValue().rankingRiseAndFallAnimationConfigList) {
                if (rankingRiseAndFallAnimationConfig.rankType == c1842470y2v.LIZ.LIZIZ.type) {
                    Iterator<Integer> it2 = rankingRiseAndFallAnimationConfig.riseAnimationRankingMilestoneList.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = it2.next().intValue();
                        if (iIntValue >= i2 && (iIntValue < i || i <= 0)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("needToChangeContainerBGColor set to TRUE - ");
                            sbLIZ2.append(iIntValue);
                            sbLIZ2.append(" - ");
                            sbLIZ2.append(i);
                            sbLIZ2.append(" - ");
                            sbLIZ2.append(i2);
                            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
                            this.LJJJ = true;
                            break loop0;
                        }
                    }
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("needToChangeContainerBGColor - ");
            sbLIZ3.append(this.LJJJ);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ3));
            if (this.LJJJ) {
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannel = this.LIZIZ.LIZ.LIZ;
                C1810410xDD c1810410xDD = c1842470y2v.LIZ;
                c1810690xDf.getClass();
                C1810690xDf.LJJIJIL(dataChannel, c1810410xDD);
            }
        }
        final CharSequence text = this.LJIILIIL.getText();
        this.LJIILIIL.setText(c1842470y2v.LIZIZ);
        C786410Ut5.y3(this.LJIILIIL.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0y3m
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C786410Ut5.D3(this.LL.LJIILIIL.getViewTreeObserver(), this);
                C1842980y3k c1842980y3k = this.LL;
                c1842980y3k.getClass();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("updateViewStyleForNumContainer - ");
                sbLIZ4.append(c1842980y3k.LJIILIIL.getTextSize());
                sbLIZ4.append(" - ");
                sbLIZ4.append(c1842980y3k.LJIILIIL.getLetterSpacing());
                sbLIZ4.append(" - ");
                sbLIZ4.append(c1842980y3k.LJIILIIL.getTextSize());
                sbLIZ4.append(" - ");
                sbLIZ4.append(c1842980y3k.LJFF().getTextSize());
                sbLIZ4.append(" - ");
                sbLIZ4.append(c1842980y3k.LJIILIIL.getTextSize() / c1842980y3k.LJFF().getTextSize());
                C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ4));
                float textSize = c1842980y3k.LJIILIIL.getTextSize();
                TextView textViewLJ = c1842980y3k.LJ();
                if (textViewLJ != null) {
                    textViewLJ.setTextSize(0, textSize);
                }
                TextView textViewLJFF = c1842980y3k.LJFF();
                if (textViewLJFF != null) {
                    textViewLJFF.setTextSize(0, textSize);
                }
                TextView textViewLJI = c1842980y3k.LJI();
                if (textViewLJI != null) {
                    textViewLJI.setTextSize(0, textSize);
                }
                TextView textView = c1842980y3k.LJJI;
                if (textView != null) {
                    textView.setTextSize(0, textSize);
                }
                float letterSpacing = c1842980y3k.LJIILIIL.getLetterSpacing();
                TextView textViewLJ2 = c1842980y3k.LJ();
                if (textViewLJ2 != null) {
                    textViewLJ2.setLetterSpacing(letterSpacing);
                }
                TextView textViewLJFF2 = c1842980y3k.LJFF();
                if (textViewLJFF2 != null) {
                    textViewLJFF2.setLetterSpacing(letterSpacing);
                }
                TextView textViewLJI2 = c1842980y3k.LJI();
                if (textViewLJI2 != null) {
                    textViewLJI2.setLetterSpacing(letterSpacing);
                }
                TextView textView2 = c1842980y3k.LJJI;
                if (textView2 != null) {
                    textView2.setLetterSpacing(letterSpacing);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("handleMarquee - ");
                sbLIZ5.append(c1842470y2v.LIZIZ);
                sbLIZ5.append(" - ");
                Layout layout = this.LL.LJIILIIL.getLayout();
                sbLIZ5.append(layout != null ? Integer.valueOf((int) layout.getLineWidth(0)) : null);
                sbLIZ5.append(" - ");
                sbLIZ5.append(this.LL.LJIILIIL.getMeasuredWidth());
                sbLIZ5.append(" - ");
                sbLIZ5.append(this.LL.LJIILIIL.getWidth());
                C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ5));
                C1842980y3k c1842980y3k2 = this.LL;
                Layout layout2 = c1842980y3k2.LJIILIIL.getLayout();
                c1842980y3k2.LJJII = ((int) ((layout2 != null ? layout2.getLineWidth(0) : 0.0f) - ((float) this.LL.LJIILIIL.getWidth()))) > 0;
                C1842980y3k c1842980y3k3 = this.LL;
                if (!c1842980y3k3.LJJII) {
                    c1842980y3k3.LJIILIIL.setText(text);
                    this.LL.LJIJI(c1842470y2v);
                    return false;
                }
                if (c1842980y3k3.LJJJ) {
                    c1842980y3k3.LJIJ(c1842470y2v);
                }
                final C1842980y3k c1842980y3k4 = this.LL;
                EnumC1842640y3C enumC1842640y3C = EnumC1842640y3C.RESET;
                TextView textView3 = c1842980y3k4.LJIILIIL;
                final C1842470y2v c1842470y2v3 = c1842470y2v;
                String str = c1842470y2v3.LIZIZ;
                final CharSequence charSequence = text;
                c1842980y3k4.LJIILL(enumC1842640y3C, textView3, str, -1L, new InterfaceC1704110uRl() { // from class: X.0y3o
                    @Override // X.InterfaceC1704110uRl
                    public final void LIZ(int i3) {
                        boolean z;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Marquee end - ");
                        sbLIZ6.append(i3);
                        sbLIZ6.append(" - ");
                        if (i3 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sbLIZ6.append(z);
                        sbLIZ6.append(" - ");
                        sbLIZ6.append(c1842980y3k4.LJJJ);
                        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ6));
                        if (i3 > 0) {
                            C1842980y3k c1842980y3k5 = c1842980y3k4;
                            if (c1842980y3k5.LJJJ) {
                                c1842980y3k5.LJIJJ(c1842470y2v3);
                                return;
                            } else {
                                c1842980y3k5.LJIILIIL(false);
                                return;
                            }
                        }
                        c1842980y3k4.LJIILIIL.setText(charSequence);
                        c1842980y3k4.LJIJI(c1842470y2v3);
                    }
                }, true);
                return false;
            }
        });
    }
}
