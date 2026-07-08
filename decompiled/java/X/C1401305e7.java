package X;

import java.util.List;

/* JADX INFO: renamed from: X.05e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1401305e7 implements C0Z1N {
    public final C866530Xz1 LIZ;
    public final C2252331DDr LIZIZ;
    public final C2252331DDr LIZJ;
    public final C1401205e6 LIZLLL;

    @Override // X.InterfaceC893110Z1x
    public final void LJI() {
        C866530Xz1 c866530Xz1 = this.LIZ;
        if (c866530Xz1 != null) {
            c866530Xz1.LJIILLIIL(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC893110Z1x
    public final void register() {
        C866530Xz1 c866530Xz1 = this.LIZ;
        if (c866530Xz1 != null) {
            c866530Xz1.LJIIJJI(this.LIZLLL);
        }
        C2252331DDr c2252331DDr = this.LIZIZ;
        C866530Xz1 c866530Xz12 = this.LIZ;
        c2252331DDr.LIZJ(c866530Xz12 != null ? c866530Xz12.LJ() : null);
    }

    @Override // X.C0Z1N
    public final C2252331DDr LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.05e6] */
    public C1401305e7(String str) {
        C866530Xz1 c866530Xz1LIZIZ;
        if (str != null) {
            c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        } else {
            c866530Xz1LIZIZ = null;
        }
        this.LIZ = c866530Xz1LIZIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LIZIZ = c2252331DDrLIZIZ;
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = new InterfaceC866850XzX() { // from class: X.05e6
            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLI(String str2, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str2) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str2, List list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
                this.LL.LIZIZ.LIZJ(c0y8t);
            }
        };
    }
}
