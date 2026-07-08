package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0mJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1391540mJc extends AbstractC1391580mJg<C1391540mJc> {
    public final Context LLILZ;
    public View LLILZIL;
    public ViewGroup LLILZLL;

    public String LJIIJ() {
        return "min(wrap_content,screen.height-96dp)";
    }

    @Override // X.AbstractC1391580mJg
    public final C0P0T LIZIZ() {
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            this.LLILLJJLI.LIZJ = viewGroup;
        } else {
            LIZLLL();
        }
        this.LLILLJJLI.LJJIII = true;
        C1CRB c1crb = new C1CRB(this.LLILZ, null, 6);
        RadiusLayout radiusLayout = new RadiusLayout(this.LLILZ, null, 6);
        radiusLayout.setRadius(C418440Gaw.LIZIZ(16));
        C1CRC c1crc = new C1CRC(-2);
        c1crc.LJI = C2230281CQw.LIZ(this.LL, LJIIJJI(), "width2");
        c1crc.LJII = C2230281CQw.LIZ(this.LL, LJIIJ(), "height2");
        radiusLayout.addView(this.LLILZIL);
        c1crb.addView(radiusLayout, c1crc);
        this.LLILLJJLI.LJIIZILJ = c1crb;
        return super.LIZIZ();
    }

    public String LJIIJJI() {
        return (C497820Jfg.LJ(this.LLILZ) || C497820Jfg.LIZLLL(this.LLILZ)) ? "min(max(wrap_content,375dp),420dp)" : "min(max(wrap_content,220dp),screen.width-32dp)";
    }

    public C1391540mJc(Context context) {
        super(context);
        this.LLILZ = context;
        Integer numLIZLLL = C1308910kAL.LIZLLL(context, R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipPopoverBgColor);
        if (numLIZLLL != null) {
            LJI(numLIZLLL.intValue());
        }
        this.LLILLJJLI.LJIIIZ = true;
        LJIIIZ(true, null);
    }
}
