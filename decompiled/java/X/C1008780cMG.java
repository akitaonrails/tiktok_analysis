package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.dualbuttons.AnoleDualButtonData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008780cMG extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public C197039127h LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public final C01GW LLJLLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnoleDualButtonData LJJ() {
        return (AnoleDualButtonData) this.LLJLLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        C1008810cMJ c1008810cMJ = (C1008810cMJ) this.LLJLIL.getValue();
        c1008810cMJ.logAd((InterfaceC1023400cjq) c1008810cMJ.LIZLLL.getValue());
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        if (str == null) {
            str = "";
        }
        C1014650cVj.LIZ(this, str, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        C197039127h c197039127h;
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.pg, this.LLJJIII, false);
        }
        View view = this.LLJJIJIL;
        C197039127h c197039127h2 = null;
        if (view != null) {
            c197039127h = (C197039127h) view.findViewById(R.id.cpq);
        } else {
            c197039127h = null;
        }
        this.LLJLILLLLZIIL = c197039127h;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            c197039127h2 = (C197039127h) view2.findViewById(R.id.cpr);
        }
        this.LLJLL = c197039127h2;
        C197039127h c197039127h3 = this.LLJLILLLLZIIL;
        if (c197039127h3 != null) {
            c197039127h3.LJJJJL(new AwS595S0100000_16(this, 219));
        }
        C197039127h c197039127h4 = this.LLJLL;
        if (c197039127h4 != null) {
            c197039127h4.LJJJJL(new AwS595S0100000_16(this, 220));
        }
        C197039127h c197039127h5 = this.LLJLILLLLZIIL;
        if (c197039127h5 != null) {
            C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 217);
            c1003890cEN.getClass();
            C786410Ut5.U8(c197039127h5, new C1003560cDq(awS595S0100000_16));
        }
        C197039127h c197039127h6 = this.LLJLL;
        if (c197039127h6 != null) {
            C1003890cEN c1003890cEN2 = AbstractViewOnClickListenerC1003880cEM.LLILLL;
            AwS595S0100000_16 awS595S0100000_162 = new AwS595S0100000_16(this, 218);
            c1003890cEN2.getClass();
            C786410Ut5.U8(c197039127h6, new C1003560cDq(awS595S0100000_162));
        }
        C2271391DvN.LIZ(this.LLJLILLLLZIIL, (C1A5L) C2271381DvM.G.getValue());
        C2271391DvN.LIZ(this.LLJLL, (C1A5L) C2271381DvM.H.getValue());
        super.Nk(anoleComponentAppearModel);
    }

    public C1008780cMG(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 52));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 679));
    }
}
