package X;

import Y.AComparatorS509S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1860100yVM extends C1857630yRN implements InterfaceC1860040yVG {
    public C2248251Cz9 LLJILJIL;

    public C1860100yVM LJJJI() {
        return this;
    }

    @Override // X.InterfaceC1860040yVG
    public final void LJIILLIIL() {
        C2248251Cz9 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJIIZILJ.clear();
        }
    }

    public final int getSelectedColor() {
        BackgroundColorSpan backgroundColorSpan;
        C2248251Cz9 textSelector = getTextSelector();
        if (textSelector == null || (backgroundColorSpan = textSelector.LJIILJJIL) == null) {
            return 1291887305;
        }
        return backgroundColorSpan.getBackgroundColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Cz9] */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextSelector(new C2248241Cz8(this) { // from class: X.1Cz9
            public final TextView LJJIIZ;
            public InterfaceC2247911Cyb LJJIIZI;

            @Override // X.AbstractC2248231Cz7
            public final void LJIJJ() {
                C2248181Cz2 c2248181Cz2 = this.LJII;
                if (c2248181Cz2 != null) {
                    c2248181Cz2.LIZIZ();
                }
                C2248181Cz2 c2248181Cz22 = this.LJIIIZ;
                if (c2248181Cz22 != null) {
                    c2248181Cz22.LIZIZ();
                }
                InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJIIZI;
                if (interfaceC2247911Cyb != null) {
                    interfaceC2247911Cyb.LIZIZ(false);
                }
            }

            @Override // X.AbstractC2248231Cz7
            public final void LJJ() {
                InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJIIZI;
                if (interfaceC2247911Cyb != null) {
                    interfaceC2247911Cyb.LIZIZ(false);
                }
            }

            @Override // X.AbstractC2248231Cz7, X.InterfaceC1859950yV7
            public final void LIZJ() {
                super.LIZJ();
                InterfaceC2247911Cyb interfaceC2247911Cyb = this.LJJIIZI;
                if (interfaceC2247911Cyb != null) {
                    interfaceC2247911Cyb.LIZIZ(true);
                }
            }

            @Override // X.AbstractC2248231Cz7
            public final void LJJIII() {
                InterfaceC2247911Cyb interfaceC2247911Cyb;
                LJIIJ();
                if (!LJJIIZ(LJIIZILJ(), this.LJIIJJI, this.LJIIL) || (interfaceC2247911Cyb = this.LJJIIZI) == null) {
                    return;
                }
                interfaceC2247911Cyb.onShow();
            }

            {
                super(this);
                this.LJJIIZ = this;
            }

            @Override // X.InterfaceC1859950yV7
            public final void LIZLLL(int i) {
                C2248301CzE c2248301CzE;
                if (i != 0) {
                    if (i == 1 && (c2248301CzE = this.LJIJ) != null) {
                        c2248301CzE.LIZ = false;
                        return;
                    }
                    return;
                }
                LJIL();
            }

            @Override // X.InterfaceC1859950yV7
            public final void LJ(InterfaceC2247911Cyb interfaceC2247911Cyb) {
                this.LJJIIZI = interfaceC2247911Cyb;
            }

            @Override // X.InterfaceC1859950yV7
            public final void LJIILJJIL(int[] iArr) {
                View rootView;
                Window window;
                Activity activityLIZ = C1388190mED.LIZ(this.LJJIIZ.getContext());
                if (activityLIZ == null || (window = activityLIZ.getWindow()) == null || (rootView = window.getDecorView()) == null) {
                    rootView = this.LJJIIZ.getRootView();
                }
                int measuredWidth = ((this.LJIL + this.LJJIFFI) / 2) - (rootView.getMeasuredWidth() / 2);
                int i = this.LJJ;
                if (i != this.LJJII) {
                    measuredWidth = 0;
                }
                iArr[0] = measuredWidth;
                iArr[1] = i;
                iArr[2] = this.LJJIII;
            }

            @Override // X.AbstractC2248231Cz7
            public final boolean LJIJJLI(MotionEvent motionEvent) {
                float rawY = motionEvent.getRawY();
                float rawX = motionEvent.getRawX();
                int i = this.LJJ;
                if (rawY >= i) {
                    int i2 = this.LJJIII;
                    if (rawY <= i2) {
                        if (rawY > i && rawY < this.LJJI && rawX < this.LJIL) {
                            return true;
                        }
                        if (rawY > this.LJJII && rawY < i2 && rawX > this.LJJIFFI) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            }
        });
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2248251Cz9 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJJIFFI();
        }
        setTextSelector(null);
    }

    public /* bridge */ /* synthetic */ TextView LJIJI() {
        LJJJI();
        return this;
    }

    @Override // X.InterfaceC1860040yVG
    public C2248251Cz9 getTextSelector() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1860040yVG
    public final void LJ(InterfaceC2248331CzH interfaceC2248331CzH) {
        C2248251Cz9 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJIIZILJ.add(interfaceC2248331CzH);
        }
    }

    public final String LJJJIL(InterfaceC342000Daw interfaceC342000Daw) {
        int i;
        int length;
        C1860140yVQ c1860140yVQ;
        int spanStart;
        C2248251Cz9 textSelector = getTextSelector();
        if (textSelector != null) {
            i = textSelector.LJIIJJI;
        } else {
            i = 0;
        }
        C2248251Cz9 textSelector2 = getTextSelector();
        if (textSelector2 != null) {
            length = textSelector2.LJIIL;
        } else {
            length = 0;
        }
        if (i >= length) {
            length = getText().length();
            i = 0;
        }
        StringBuilder sb = new StringBuilder(getText().subSequence(i, length));
        if ((interfaceC342000Daw instanceof C1860140yVQ) && (c1860140yVQ = (C1860140yVQ) interfaceC342000Daw) != null) {
            for (LeadingMarginSpan leadingMarginSpan : C13LP.LJLLLL(new AComparatorS509S0100000_10(c1860140yVQ, 3), C13LQ.LJJLL(c1860140yVQ.LIZ.getSpans(0, getText().length(), LeadingMarginSpan.class)))) {
                if (leadingMarginSpan instanceof C445340HdE) {
                    int spanStart2 = c1860140yVQ.LIZ.getSpanStart(leadingMarginSpan);
                    if (i <= spanStart2 && spanStart2 < length) {
                        sb.insert(spanStart2 - i, ((C445340HdE) leadingMarginSpan).LLILZIL);
                    }
                } else if ((leadingMarginSpan instanceof C445220Hd2) && i <= (spanStart = c1860140yVQ.LIZ.getSpanStart(leadingMarginSpan)) && spanStart < length) {
                    sb.insert(spanStart - i, "- ");
                }
            }
        }
        return a0.LJJJLL("⚫", a0.LJLIIIL(sb.toString()).toString());
    }

    public void setTextSelector(C2248251Cz9 c2248251Cz9) {
        this.LLJILJIL = c2248251Cz9;
    }

    public C1860100yVM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C1860100yVM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
