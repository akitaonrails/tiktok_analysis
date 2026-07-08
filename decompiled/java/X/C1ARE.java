package X;

import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1ARE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARE extends C1ARJ implements InterfaceC2179551ARt, C1AR5 {
    public InterfaceC2178131AMh<InterfaceC2179261AQq, C2179231AQn> LLILLJJLI = new InterfaceC2178131AMh<InterfaceC2179261AQq, C2179231AQn>() { // from class: X.1AQp
        @Override // X.InterfaceC2178131AMh
        public final void LIZ(AwS612S0100000_33 awS612S0100000_33, Object obj) {
            C2179231AQn c2179231AQn;
            InterfaceC2179261AQq interfaceC2179261AQq = (InterfaceC2179261AQq) obj;
            if (interfaceC2179261AQq == null) {
                c2179231AQn = null;
            } else {
                c2179231AQn = new C2179231AQn(interfaceC2179261AQq.getPlayUrl(), interfaceC2179261AQq.getLocalPath(), interfaceC2179261AQq.getPlayModel(), 12);
            }
            awS612S0100000_33.invoke(c2179231AQn);
        }
    };

    @Override // X.C1AR5
    public final C1AQY LJIILL(C1AQY c1aqy) {
        return c1aqy;
    }

    @Override // X.C1ARN
    public final void onDetach() {
        C1ARS c1ars;
        this.LLILLJJLI = null;
        C1ARL c1arl = this.LL;
        if (c1arl == null || (c1ars = c1arl.LIZ) == null) {
            return;
        }
        c1ars.LJIIZILJ(this);
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void onCompletion() {
        C1ARI c1ari;
        C1ARI c1ari2;
        C1ARI c1ari3;
        C1ARI c1ari4;
        C1ARL c1arl = this.LL;
        InterfaceC2179261AQq interfaceC2179261AQqLIZ = null;
        if (((c1arl == null || (c1ari4 = c1arl.LIZLLL) == null) ? null : c1ari4.LJ()) != C1AQY.SINGLE_LOOP) {
            C1ARL c1arl2 = this.LL;
            if (c1arl2 == null || (c1ari = c1arl2.LIZLLL) == null || !c1ari.LJI()) {
                return;
            }
            LJIILJJIL(new C0NIR("FROM_AUTO_PLAY_NEXT"));
            return;
        }
        C1ARL c1arl3 = this.LL;
        if (c1arl3 == null || (c1ari2 = c1arl3.LIZLLL) == null || !c1ari2.Zr()) {
            return;
        }
        C1ARL c1arl4 = this.LL;
        if (c1arl4 != null && (c1ari3 = c1arl4.LIZLLL) != null) {
            interfaceC2179261AQqLIZ = c1ari3.LIZ();
        }
        LJIJJLI(interfaceC2179261AQqLIZ, new C0NIR("FROM_AUTO_SINGLE_LOOP"));
    }

    @Override // X.C1AR5
    public final InterfaceC2179131AQd LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
        C1ARK c1ark;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ark = c1arl.LIZJ) != null) {
            c1ark.LIZLLL(new C0NIR("STOP_FROM_PLAYLIST_CHANGED"));
        }
        return interfaceC2179131AQd;
    }

    @Override // X.C1ARJ, X.C1AR6
    public final void LJI(InterfaceC2179261AQq interfaceC2179261AQq) {
        InterfaceC2178131AMh<InterfaceC2179261AQq, C2179231AQn> interfaceC2178131AMh = this.LLILLJJLI;
        if (interfaceC2178131AMh != null) {
            interfaceC2178131AMh.LIZ(new AwS612S0100000_33(this, 232), interfaceC2179261AQq);
        }
    }

    @Override // X.InterfaceC2179551ARt
    public final void LJIILJJIL(C0NIR c0nir) {
        InterfaceC2179261AQq next;
        C1ARI c1ari;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ari = c1arl.LIZLLL) != null) {
            next = c1ari.getNext();
        } else {
            next = null;
        }
        LJIJJLI(next, c0nir);
    }

    @Override // X.InterfaceC2179551ARt
    public final void LJIJ(C0NIR c0nir) {
        InterfaceC2179261AQq interfaceC2179261AQqLJIIIZ;
        C1ARI c1ari;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ari = c1arl.LIZLLL) != null) {
            interfaceC2179261AQqLJIIIZ = c1ari.LJIIIZ();
        } else {
            interfaceC2179261AQqLJIIIZ = null;
        }
        LJIJJLI(interfaceC2179261AQqLJIIIZ, c0nir);
    }

    @Override // X.C1ARJ, X.C1ARN
    public final void LJIJI(C1ARL c1arl) {
        this.LL = c1arl;
        C1ARS c1ars = c1arl.LIZ;
        if (c1ars != null) {
            c1ars.LJIILIIL(this);
        }
    }

    @Override // X.C1AR5
    public final InterfaceC2179261AQq LIZIZ(InterfaceC2179261AQq interfaceC2179261AQq, C0NIR c0nir) {
        C1ARK c1ark;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ark = c1arl.LIZJ) != null) {
            if (c0nir == null) {
                c0nir = new C0NIR("STOP_FROM_DATA_SOURCE_CHANGED");
            }
            c1ark.LIZLLL(c0nir);
        }
        return interfaceC2179261AQq;
    }

    public final void LJIJJLI(InterfaceC2179261AQq interfaceC2179261AQq, C0NIR c0nir) {
        C1ARK c1ark;
        C1ARI c1ari;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ari = c1arl.LIZLLL) != null) {
            c1ari.LJIJI(interfaceC2179261AQq, c0nir);
        }
        C1ARL c1arl2 = this.LL;
        if (c1arl2 != null && (c1ark = c1arl2.LIZJ) != null) {
            c1ark.LJII(c0nir);
        }
    }
}
