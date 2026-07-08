package X;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450720Hlu extends AbstractC1391580mJg<C450720Hlu> {
    public CharSequence LLILZ;
    public int LLILZIL;
    public Function1<? super ImageView, Unit> LLILZLL;
    public EnumC450670Hlp LLIZ;

    @Override // X.AbstractC1391580mJg
    public final C0P0T LIZIZ() {
        C450650Hln c450650Hln = new C450650Hln(this.LL);
        c450650Hln.LIZJ(this.LLILZ);
        c450650Hln.LIZIZ(this.LLIZ);
        c450650Hln.LIZ(this.LLILZIL);
        c450650Hln.setCustomImage(this.LLILZLL);
        this.LLILLJJLI.LJIIZILJ = c450650Hln;
        return super.LIZIZ();
    }

    public C450720Hlu(Context context) {
        super(context);
        this.LLILZ = "";
        this.LLIZ = EnumC450670Hlp.SMALL;
        Integer numLIZLLL = C1308910kAL.LIZLLL(context, R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipMessageBgColor);
        if (numLIZLLL != null) {
            LJI(numLIZLLL.intValue());
        }
    }

    public final void LJIIJ(int i) {
        this.LLILZ = this.LL.getString(i);
    }
}
