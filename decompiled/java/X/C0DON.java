package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;
import mf.a;

/* JADX INFO: renamed from: X.0DON, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DON extends LinearLayout {
    public final C01GW LL;
    public int LLILLJJLI;
    public Function1<? super View, Unit> LLILLL;
    public C1856690yPr LLILZ;

    private final C19M4 getText() {
        return (C19M4) this.LL.getValue();
    }

    public final Function1<View, Unit> getOnNotSentClickCallback() {
        return this.LLILLL;
    }

    public final C1856690yPr getRotateAnimationDrawable() {
        return this.LLILZ;
    }

    public final void LIZ(int i) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C0DJ1.LIZIZ(this);
                    C1856690yPr c1856690yPr = this.LLILZ;
                    if (c1856690yPr != null) {
                        c1856690yPr.LJIIJ();
                    }
                } else {
                    C0DJ1.LIZJ(this);
                    C19M4 text = getText();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.zs);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    text.setStartIcon(c419910GdJ);
                    getText().setTextColorRes(R.attr.zs);
                    getText().setText(2131848778);
                    C1856690yPr c1856690yPr2 = this.LLILZ;
                    if (c1856690yPr2 != null) {
                        c1856690yPr2.LJIIJ();
                    }
                }
            } else {
                C0DJ1.LIZIZ(this);
                C1856690yPr c1856690yPr3 = this.LLILZ;
                if (c1856690yPr3 != null) {
                    c1856690yPr3.LJIIJ();
                }
            }
        } else {
            C0DJ1.LIZJ(this);
            C19M4 text2 = getText();
            C1856690yPr c1856690yPr4 = new C1856690yPr(getContext(), R.raw.icon_spinner_thin);
            c1856690yPr4.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            c1856690yPr4.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            c1856690yPr4.LJI(R.attr.a1k, getContext());
            c1856690yPr4.LJIIIZ();
            text2.setCompoundDrawablesRelativeWithIntrinsicBounds(c1856690yPr4, (Drawable) null, (Drawable) null, (Drawable) null);
            getText().setTextColorRes(R.attr.a1k);
            getText().setText(2131848789);
        }
        this.LLILLJJLI = i;
    }

    public final void setOnNotSentClickCallback(Function1<? super View, Unit> function1) {
        this.LLILLL = function1;
    }

    public final void setRotateAnimationDrawable(C1856690yPr c1856690yPr) {
        this.LLILZ = c1856690yPr;
    }

    public C0DON(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aka, this, true);
        View.OnClickListener aCListenerS139S0100000_4 = new ACListenerS139S0100000_4(this, 65);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS139S0100000_4) : aCListenerS139S0100000_4);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        this.LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 422));
        this.LLILLJJLI = -1;
    }
}
