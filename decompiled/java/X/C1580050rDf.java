package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580050rDf extends FrameLayout {
    public TuxIconDrawable LL;
    public C1856690yPr LLILLJJLI;
    public final int LLILLL;
    public final LinearLayout LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public final TuxIconView LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1856690yPr c1856690yPr = this.LLILLJJLI;
        if (c1856690yPr != null) {
            c1856690yPr.LJIIJ();
        }
    }

    private final void setFollowStatus(boolean z) {
        if (!z) {
            this.LL = LIZ(Integer.valueOf(R.raw.icon_plus_small));
            C0H1U.LIZIZ(this.LLIZLLLIL);
            C12ES.LJIILL(0, this.LLILZ);
            this.LLILZIL.setImageDrawable(this.LL);
        } else {
            this.LL = LIZ(Integer.valueOf(R.raw.icon_tick_fill_small));
            C12ES.LJIILL(0, this.LLIZLLLIL);
            C337180DJs.LIZIZ(this.LLILZ);
            this.LLIZLLLIL.setImageDrawable(this.LL);
        }
        this.LLJI = z;
    }

    public final TuxIconDrawable LIZ(Integer num) {
        TuxIconDrawable tuxIconDrawable = null;
        if (num != null) {
            num.intValue();
            if (num.intValue() <= 0) {
                return null;
            }
            tuxIconDrawable = new TuxIconDrawable(getContext(), num.intValue());
            Integer numLIZJ = C1308910kAL.LIZJ(this.LLILLL, getContext());
            if (numLIZJ != null) {
                tuxIconDrawable.LJFF(numLIZJ.intValue());
            }
        }
        return tuxIconDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(AbstractC1623806Xk<Integer> abstractC1623806Xk) {
        boolean z = true;
        if (abstractC1623806Xk instanceof C1623706Xj) {
            LIZJ(this, true);
            return;
        }
        LIZJ(this, false);
        if (abstractC1623806Xk instanceof C1623606Xi) {
            C1743890vTv c1743890vTv = C1743890vTv.LIZ;
            int iIntValue = ((Number) ((C1623606Xi) abstractC1623806Xk).LIZ).intValue();
            c1743890vTv.getClass();
            if (iIntValue != 2 && iIntValue != 1) {
                z = false;
            }
            setFollowStatus(z);
            return;
        }
        if (this.LLJI) {
            C337180DJs.LIZIZ(this.LLILZ);
            C12ES.LJIILL(0, this.LLIZLLLIL);
            LinearLayout linearLayout = this.LLILZ;
            String string = getContext().getString(2131832868);
            C1389880mGw c1389880mGw = new C1389880mGw(linearLayout);
            c1389880mGw.LJIIIZ(string);
            c1389880mGw.LJIIJ();
            return;
        }
        C12ES.LJIILL(0, this.LLILZ);
        C0H1U.LIZIZ(this.LLIZLLLIL);
        LinearLayout linearLayout2 = this.LLILZ;
        String string2 = getContext().getString(2131832867);
        C1389880mGw c1389880mGw2 = new C1389880mGw(linearLayout2);
        c1389880mGw2.LJIIIZ(string2);
        c1389880mGw2.LJIIJ();
    }

    public final void setLoading(boolean z) {
        this.LLJ = z;
    }

    public final void setText(String str) {
        this.LLILZLL.setText(str);
    }

    public C1580050rDf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = R.attr.a0p;
        C786410Ut5.Sd(R.layout.bw8, C786410Ut5.ne(context), this);
        this.LLILZ = (LinearLayout) findViewById(R.id.n_7);
        this.LLILZIL = (TuxIconView) findViewById(R.id.l6b);
        this.LLILZLL = (TuxTextView) findViewById(R.id.z40);
        this.LLIZ = (TuxIconView) findViewById(R.id.l6s);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.l6c);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.atl);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        setBackground(c384050F3z.LIZ(getContext()));
    }

    public static void LIZJ(C1580050rDf c1580050rDf, boolean z) {
        if (z != c1580050rDf.LLJ) {
            c1580050rDf.LLJ = z;
            c1580050rDf.setClickable(!z);
            if (z) {
                if (c1580050rDf.LLILLJJLI == null) {
                    c1580050rDf.LLILLJJLI = new C1856690yPr(c1580050rDf.getContext(), R.raw.icon_spinner_normal);
                    Integer numLIZJ = C1308910kAL.LIZJ(c1580050rDf.LLILLL, c1580050rDf.getContext());
                    if (numLIZJ != null) {
                        int iIntValue = numLIZJ.intValue();
                        C1856690yPr c1856690yPr = c1580050rDf.LLILLJJLI;
                        if (c1856690yPr != null) {
                            c1856690yPr.LJFF(iIntValue);
                        }
                    }
                }
                C1856690yPr c1856690yPr2 = c1580050rDf.LLILLJJLI;
                if (c1856690yPr2 != null) {
                    c1856690yPr2.LJIIIZ();
                }
                c1580050rDf.LLIZ.setImageDrawable(c1580050rDf.LLILLJJLI);
                C12ES.LJIILL(0, c1580050rDf.LLIZ);
                C337180DJs.LIZIZ(c1580050rDf.LLILZ);
                C0H1U.LIZIZ(c1580050rDf.LLIZLLLIL);
                return;
            }
            C1856690yPr c1856690yPr3 = c1580050rDf.LLILLJJLI;
            if (c1856690yPr3 != null) {
                c1856690yPr3.LJIIJ();
            }
            C0H1U.LIZIZ(c1580050rDf.LLIZ);
        }
    }
}
