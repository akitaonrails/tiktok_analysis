package X;

import Y.AfS176S0100000_7;

/* JADX INFO: renamed from: X.11L0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11L0 implements C0TCG<Object> {
    public final /* synthetic */ C11IV LIZ;
    public final /* synthetic */ C0UJ3 LIZIZ;

    @Override // X.InterfaceC465980IPc
    public final Object LIZ(final AbstractC19484711Kz abstractC19484711Kz) {
        C0UJ3 c0uj3 = this.LIZIZ;
        if (c0uj3 != null) {
            abstractC19484711Kz = abstractC19484711Kz.LJFF(c0uj3);
        }
        return new InterfaceC500100JjM<Object>() { // from class: X.11HZ
            @Override // X.InterfaceC500100JjM
            public final C11JL subscribe() {
                return (C11JL) new C11HY(abstractC19484711Kz, this.LIZIZ.LIZ).LJJIIJ();
            }

            @Override // X.InterfaceC500100JjM
            public final C11JL LIZJ(C09JN c09jn) {
                return (C11JL) new C11HY(abstractC19484711Kz, this.LIZIZ.LIZ).LJJIIJZLJL(c09jn);
            }

            @Override // X.InterfaceC500100JjM
            public final C11JL LIZ(C09JN c09jn, C09JN c09jn2) {
                return (C11JL) new C11HY(abstractC19484711Kz, this.LIZIZ.LIZ).LJJIIZ(c09jn, c09jn2);
            }
        };
    }

    @Override // X.InterfaceC465970IPb
    public final Object LIZIZ(final C11NZ c11nz) {
        C0UJ3 c0uj3 = this.LIZIZ;
        if (c0uj3 != null) {
            c11nz = c11nz.LJIILIIL(c0uj3);
        }
        return new C0J1N<Object>() { // from class: X.11HS
            @Override // X.C0J1N
            public final C11JF subscribe() {
                return (C11JF) new C11HR(c11nz, this.LIZIZ.LIZ).LJJLJ();
            }

            @Override // X.C0J1N
            public final void LIZIZ(InterfaceC626120Oh8<? super Object> interfaceC626120Oh8) {
                new C11HR(c11nz, this.LIZIZ.LIZ).LIZIZ(interfaceC626120Oh8);
            }

            @Override // X.C0J1N
            public final C11JF LIZJ(C09JN c09jn) {
                return (C11JF) new C11HR(c11nz, this.LIZIZ.LIZ).LJJLJLI(c09jn);
            }

            @Override // X.C0J1N
            public final C11JF LIZ(C09JN c09jn, C09JN c09jn2) {
                return (C11JF) new C11HR(c11nz, this.LIZIZ.LIZ).LJJLL(c09jn, c09jn2);
            }
        };
    }

    public final Object LIZJ(final C11NN c11nn) {
        C0UJ3 c0uj3 = this.LIZIZ;
        if (c0uj3 != null) {
            c11nn = c11nn.LIZ(c0uj3);
        }
        return new InterfaceC1098380egm<Object>() { // from class: X.11L1
            @Override // X.InterfaceC1098380egm
            public final C11LS LIZ(AfS176S0100000_7 afS176S0100000_7) {
                final C11NN c11nn2 = c11nn;
                final C11IV c11iv = this.LIZIZ.LIZ;
                return (C11LS) new C11NN<T>(c11nn2, c11iv) { // from class: X.11LD
                    public final C11LE<T> LLILLJJLI;
                    public final C11IV LLILLL;

                    @Override // X.C11NN
                    public final void LJIILLIIL(C11M9<? super T> c11m9) {
                        this.LLILLJJLI.subscribe(new C11N9(this.LLILLL, c11m9));
                    }

                    {
                        this.LLILLJJLI = c11nn2;
                        this.LLILLL = c11iv;
                    }
                }.LJIIL(afS176S0100000_7);
            }
        };
    }

    public C11L0(C11JX c11jx, C0UO0 c0uo0) {
        this.LIZ = c11jx;
        this.LIZIZ = c0uo0;
    }
}
