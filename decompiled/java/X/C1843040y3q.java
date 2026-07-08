package X;

import Y.AUListenerS230S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: X.0y3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843040y3q extends AbstractC1842530y31 {
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
    public ValueAnimator LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;

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
        ValueAnimator valueAnimator10 = this.LJJJ;
        if (valueAnimator10 != null) {
            valueAnimator10.cancel();
        }
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIJJI() {
        super.LJIIJJI();
        C786410Ut5.LJLZ(8, LIZLLL());
        C786410Ut5.R4(1.0f, LIZLLL());
        ImageView imageView = this.LJIJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.V4(imageView, 1.0f);
    }

    public final void LJIJI(C1842470y2v c1842470y2v) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LIZIZ.LIZ(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type)), this.LIZIZ.LJIIIZ);
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        valueAnimatorOfArgb.setStartDelay(0L);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 30));
        this.LJJIL = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public final void LJIJJ(C1842470y2v c1842470y2v) {
        long j;
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LIZIZ.LJIIIZ, this.LIZIZ.LIZ(Integer.valueOf(c1842470y2v.LIZ.LIZIZ.type)));
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        if (this.LJJII) {
            j = 250;
        } else {
            j = this.LJJIIZ;
        }
        valueAnimatorOfArgb.setStartDelay(j);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 31));
        valueAnimatorOfArgb.addListener(new C1864930yd9(this, c1842470y2v, 1));
        this.LJJIZ = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public C1843040y3q(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
        this.LJJIIZ = 3000L;
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIIZ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2) {
        LJII();
        C1843110y3x c1843110y3xLIZ = C1489430orV.LIZ(c1842470y2v.LIZIZ);
        if (c1843110y3xLIZ != null) {
            C786410Ut5.LJLZ(0, LIZLLL());
            C786410Ut5.R4(0.0f, LIZLLL());
            this.LJJJI = this.LIZJ.getWidth();
            LJ().setText(c1843110y3xLIZ.LIZ);
            LJFF().setText(String.valueOf(c1843110y3xLIZ.LIZIZ));
            LJI().setText(c1843110y3xLIZ.LIZJ);
            ImageView imageView = this.LJIJI;
            if (imageView == null) {
                imageView = null;
            }
            AbstractC1842530y31.LJIIL(this, imageView, c1842470y2v, false, true, 4);
            C786410Ut5.LJZL(8, this.LJIIJJI);
            AbstractC1842530y31.LJIIJ(this.LIZJ);
            int measuredWidth = this.LIZJ.getMeasuredWidth();
            int iIntValue = this.LIZIZ.LJFF.invoke().intValue();
            if (measuredWidth > iIntValue) {
                measuredWidth = iIntValue;
            }
            this.LJJJIL = measuredWidth;
            C786410Ut5.Mb(this.LIZIZ.LJIILIIL, LJFF());
            C786410Ut5.nc(this.LIZIZ.LJIILIIL, LJFF());
            LIZIZ();
            int measuredWidth2 = this.LIZJ.getMeasuredWidth();
            int iIntValue2 = this.LIZIZ.LJFF.invoke().intValue();
            if (measuredWidth2 > iIntValue2) {
                measuredWidth2 = iIntValue2;
            }
            this.LJJJJ = measuredWidth2;
            C786410Ut5.LJZL(0, this.LJIIJJI);
            new C443120HZe(Integer.valueOf(this.LJJJI), Integer.valueOf(this.LJJJIL), Integer.valueOf(this.LJJJJ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnterRankProcessor - ");
            sbLIZ.append(c1842470y2v.LIZIZ);
            sbLIZ.append(" - ");
            sbLIZ.append(this.LJJJI);
            sbLIZ.append(" - ");
            sbLIZ.append(this.LJJJIL);
            sbLIZ.append(" - ");
            sbLIZ.append(this.LJJJJ);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
            final CharSequence text = this.LJIILIIL.getText();
            this.LJIILIIL.setText(c1842470y2v.LIZIZ);
            C786410Ut5.y3(this.LJIILIIL.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0y3n
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C786410Ut5.D3(this.LL.LJIILIIL.getViewTreeObserver(), this);
                    C1843040y3q c1843040y3q = this.LL;
                    c1843040y3q.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateViewStyleForNumContainer - ");
                    sbLIZ2.append(c1843040y3q.LJIILIIL.getTextSize());
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(c1843040y3q.LJIILIIL.getLetterSpacing());
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(c1843040y3q.LJIILIIL.getTextSize());
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(c1843040y3q.LJFF().getTextSize());
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(c1843040y3q.LJIILIIL.getTextSize() / c1843040y3q.LJFF().getTextSize());
                    C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
                    float textSize = c1843040y3q.LJIILIIL.getTextSize();
                    TextView textViewLJ = c1843040y3q.LJ();
                    if (textViewLJ != null) {
                        textViewLJ.setTextSize(0, textSize);
                    }
                    TextView textViewLJFF = c1843040y3q.LJFF();
                    if (textViewLJFF != null) {
                        textViewLJFF.setTextSize(0, textSize);
                    }
                    TextView textViewLJI = c1843040y3q.LJI();
                    if (textViewLJI != null) {
                        textViewLJI.setTextSize(0, textSize);
                    }
                    TextView textView = c1843040y3q.LJJI;
                    if (textView != null) {
                        textView.setTextSize(0, textSize);
                    }
                    float letterSpacing = c1843040y3q.LJIILIIL.getLetterSpacing();
                    TextView textViewLJ2 = c1843040y3q.LJ();
                    if (textViewLJ2 != null) {
                        textViewLJ2.setLetterSpacing(letterSpacing);
                    }
                    TextView textViewLJFF2 = c1843040y3q.LJFF();
                    if (textViewLJFF2 != null) {
                        textViewLJFF2.setLetterSpacing(letterSpacing);
                    }
                    TextView textViewLJI2 = c1843040y3q.LJI();
                    if (textViewLJI2 != null) {
                        textViewLJI2.setLetterSpacing(letterSpacing);
                    }
                    TextView textView2 = c1843040y3q.LJJI;
                    if (textView2 != null) {
                        textView2.setLetterSpacing(letterSpacing);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handleMarquee - ");
                    sbLIZ3.append(c1842470y2v.LIZIZ);
                    sbLIZ3.append(" - ");
                    Layout layout = this.LL.LJIILIIL.getLayout();
                    sbLIZ3.append(layout != null ? Integer.valueOf((int) layout.getLineWidth(0)) : null);
                    sbLIZ3.append(" - ");
                    sbLIZ3.append(this.LL.LJIILIIL.getMeasuredWidth());
                    sbLIZ3.append(" - ");
                    sbLIZ3.append(this.LL.LJIILIIL.getWidth());
                    C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ3));
                    C1843040y3q c1843040y3q2 = this.LL;
                    Layout layout2 = c1843040y3q2.LJIILIIL.getLayout();
                    c1843040y3q2.LJJII = ((int) ((layout2 != null ? layout2.getLineWidth(0) : 0.0f) - ((float) this.LL.LJIILIIL.getWidth()))) > 0;
                    C1843040y3q c1843040y3q3 = this.LL;
                    if (!c1843040y3q3.LJJII) {
                        c1843040y3q3.LJIILIIL.setText(text);
                        this.LL.LJIJ(c1842470y2v, c1842470y2v2);
                        return false;
                    }
                    c1843040y3q3.LJIJI(c1842470y2v);
                    final C1843040y3q c1843040y3q4 = this.LL;
                    EnumC1842640y3C enumC1842640y3C = EnumC1842640y3C.RESET;
                    TextView textView3 = c1843040y3q4.LJIILIIL;
                    final C1842470y2v c1842470y2v3 = c1842470y2v;
                    String str = c1842470y2v3.LIZIZ;
                    final CharSequence charSequence = text;
                    final C1842470y2v c1842470y2v4 = c1842470y2v2;
                    c1843040y3q4.LJIILL(enumC1842640y3C, textView3, str, -1L, new InterfaceC1704110uRl() { // from class: X.0y3p
                        @Override // X.InterfaceC1704110uRl
                        public final void LIZ(int i) {
                            boolean z;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Marquee end - ");
                            sbLIZ4.append(i);
                            sbLIZ4.append(" - ");
                            if (i > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sbLIZ4.append(z);
                            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ4));
                            if (i > 0) {
                                c1843040y3q4.LJIJJ(c1842470y2v3);
                            } else {
                                c1843040y3q4.LJIILIIL.setText(charSequence);
                                c1843040y3q4.LJIJ(c1842470y2v3, c1842470y2v4);
                            }
                        }
                    }, true);
                    return false;
                }
            });
            return;
        }
        LJIILIIL(false);
    }

    public final void LJIJ(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        int i = C1843050y3r.LIZ[AbstractC1842530y31.LIZJ(c1842470y2v, c1842470y2v2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat.setStartDelay(0L);
                    valueAnimatorOfFloat.setDuration(750L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 55));
                    valueAnimatorOfFloat.addListener(new C1864940ydA(this, 16));
                    this.LJJIJIL = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                    valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat2.setStartDelay(0L);
                    valueAnimatorOfFloat2.setDuration(750L);
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 43));
                    valueAnimatorOfFloat2.addListener(new C1864940ydA(this, 9));
                    this.LJJIJL = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.start();
                }
            } else {
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat3.setStartDelay(0L);
                valueAnimatorOfFloat3.setDuration(750L);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(this, 59));
                valueAnimatorOfFloat3.addListener(new C1864940ydA(this, 18));
                this.LJJIJIIJI = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.start();
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat4.setStartDelay(0L);
                valueAnimatorOfFloat4.setDuration(750L);
                valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(this, 51));
                valueAnimatorOfFloat4.addListener(new C1864940ydA(this, 14));
                this.LJJIJIIJIL = valueAnimatorOfFloat4;
                valueAnimatorOfFloat4.start();
            }
        } else {
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfFloat5.setStartDelay(0L);
            valueAnimatorOfFloat5.setDuration(300L);
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS275S0100000_27(this, 57));
            this.LJJIIZI = valueAnimatorOfFloat5;
            valueAnimatorOfFloat5.start();
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfFloat6.setStartDelay(300L);
            valueAnimatorOfFloat6.setDuration(700L);
            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS275S0100000_27(this, 48));
            valueAnimatorOfFloat6.addListener(new C1864940ydA(this, 13));
            this.LJJIJ = valueAnimatorOfFloat6;
            valueAnimatorOfFloat6.start();
        }
        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(this.LIZIZ.LJIILIIL, 1.0f);
        valueAnimatorOfFloat7.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat7.setStartDelay(3000L);
        valueAnimatorOfFloat7.setDuration(750L);
        valueAnimatorOfFloat7.addUpdateListener(new AUListenerS275S0100000_27(this, 40));
        this.LJJIJLIJ = valueAnimatorOfFloat7;
        valueAnimatorOfFloat7.start();
        LJIJI(c1842470y2v);
        LJIJJ(c1842470y2v);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJJJI, this.LJJJIL);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        valueAnimatorOfInt.setStartDelay(0L);
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 4));
        this.LJJJ = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }
}
