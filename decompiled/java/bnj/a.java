package bnj;

import X.AbstractC2252991DGf;
import X.C1660750tJp;
import X.C2253021DGi;
import X.C2253031DGj;
import X.C2253111DGr;
import X.C2253131DGt;
import X.C2253181DGy;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: loaded from: classes36.dex */
public final class a extends AbstractC2252991DGf {
    public final C2253181DGy LIZIZ;
    public final String LIZJ = "type_activity_lifecycle";

    @Override // X.InterfaceC2190671AoT
    public final String getType() {
        return this.LIZJ;
    }

    public a(C2253181DGy c2253181DGy) {
        this.LIZIZ = c2253181DGy;
    }

    public final void LIZIZ(Cert cert) {
        LIZ(new C2253021DGi(this.LIZJ, new C1660750tJp(1, 1), new C2253031DGj(this.LIZIZ.LIZ(new C2253131DGt(true, 2), "action_name_allow_preview"), cert)));
    }

    public final void LIZLLL(Cert cert) {
        LIZ(new C2253021DGi(this.LIZJ, new C1660750tJp(1, 1), new C2253031DGj(this.LIZIZ.LIZ(new C2253131DGt(true, 2), "action_name_start_preview"), cert)));
    }

    public final void LIZJ(Cert cert, boolean z) {
        LIZ(new C2253021DGi(this.LIZJ, new C1660750tJp(2, 2), new C2253031DGj(this.LIZIZ.LIZ(new C2253111DGr(z), "action_name_close_camera"), cert)));
    }
}
