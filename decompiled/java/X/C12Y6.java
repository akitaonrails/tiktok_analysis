package X;

import android.view.View;

/* JADX INFO: renamed from: X.12Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y6 extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C12Y6 c12y6, View view) {
        InterfaceC19578611iq interfaceC19578611iq;
        C1866270yfJ c1866270yfJ = ((C19614411oc) c12y6.l0).getInteractStickerContainerCommonParam().LJ;
        if (c1866270yfJ != null && (interfaceC19578611iq = c1866270yfJ.LIZ) != null) {
            interfaceC19578611iq.onClick(((C19614411oc) c12y6.l0).getStruct());
        }
        ((InterfaceC19578611iq) c12y6.l1).onClick(((C19614411oc) c12y6.l0).getStruct());
    }

    public static final void LIZ$1(C12Y6 c12y6, View view) {
        if (view != null) {
            C19395610uQ c19395610uQ = (C19395610uQ) c12y6.l0;
            if (c19395610uQ.LJIILIIL) {
                c19395610uQ.LJIILJJIL = true;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C502601xY(null), 3);
            }
            InterfaceC212166181c interfaceC212166181c = (InterfaceC212166181c) c12y6.l1;
            if (interfaceC212166181c != null) {
                interfaceC212166181c.LIZ("flip_card_upper_area", null, 0);
            }
        }
    }

    public static final void LIZ$2(C12Y6 c12y6, View view) {
        if (view != null) {
            C19395610uQ c19395610uQ = (C19395610uQ) c12y6.l0;
            if (c19395610uQ.LJIILIIL) {
                c19395610uQ.LJIILJJIL = true;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C502701xZ(null), 3);
            }
            InterfaceC212166181c interfaceC212166181c = (InterfaceC212166181c) c12y6.l1;
            if (interfaceC212166181c != null) {
                interfaceC212166181c.LIZ("flip_card_lower_area", null, 0);
            }
        }
    }

    public static final void LIZ$3(C12Y6 c12y6, View view) {
        if (view != null) {
            ((C11W7) c12y6.l0).LJJJLL(view, (C2344009Gk) c12y6.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y6(C19395610uQ c19395610uQ, InterfaceC212166181c interfaceC212166181c, int i) {
        super(300L);
        this.$t = i;
        this.l0 = c19395610uQ;
        this.l1 = interfaceC212166181c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y6(C11W7 c11w7, C2344009Gk c2344009Gk, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c11w7;
        this.l1 = c2344009Gk;
    }

    public C12Y6(C19614411oc c19614411oc, InterfaceC19578611iq interfaceC19578611iq, int i) {
        this.$t = i;
        this.l0 = c19614411oc;
        this.l1 = interfaceC19578611iq;
    }
}
