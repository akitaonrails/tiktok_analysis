package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewOnClickListenerC1017690cad implements InterfaceC1034560d1q, View.OnClickListener {
    public final LinearLayout LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 663));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 662));
    public Context LLILZ;
    public Aweme LLILZIL;
    public C1017780cam LLILZLL;

    @Override // X.InterfaceC1034560d1q
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1034560d1q
    public final void unBind() {
    }

    @Override // X.InterfaceC1034560d1q
    public void LJ() {
        C786410Ut5.R7(this.LL, this);
        C786410Ut5.I7(this, (View) this.LLILLL.getValue());
        C786410Ut5.T7(LJIIJJI(), this);
    }

    public final TextView LJIIJJI() {
        return (TextView) this.LLILLJJLI.getValue();
    }

    public ViewOnClickListenerC1017690cad(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    @Override // X.InterfaceC1034560d1q
    public void LJIIIZ(C1017730cah c1017730cah) {
        this.LLILZIL = c1017730cah.LIZIZ;
        this.LLILZ = c1017730cah.LIZ;
        this.LLILZLL = c1017730cah.LIZJ;
        C421740GgG.LIZ(LJIIJJI());
        TextView textViewLJIIJJI = LJIIJJI();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C1022030chd.LJI(this.LLILZ, this.LLILZIL));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(2));
        textViewLJIIJJI.setBackground(gradientDrawable);
        LJIIJJI().setText(C1001060c9o.LIZ(this.LLILZ, this.LLILZIL, false));
    }
}
