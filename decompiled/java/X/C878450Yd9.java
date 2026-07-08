package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS258S0300000_14;

/* JADX INFO: renamed from: X.0Yd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878450Yd9 implements InterfaceC866830XzV {
    public final /* synthetic */ C878470YdB LL;
    public final /* synthetic */ C878460YdA LLILLJJLI;

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
    public final void LLLIZZ(Map<String, C0Y8T> map) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
        LIZ(16, c0y8t);
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
        C878470YdB c878470YdB = this.LL;
        C1729806q0.LIZJ(c878470YdB.LIZ, new AwS258S0300000_14(c0y8t, c878470YdB, this.LLILLJJLI, 1));
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
        C878470YdB c878470YdB = this.LL;
        C1729806q0.LIZJ(c878470YdB.LIZ, new AwS258S0300000_14(c0y8t, c878470YdB, this.LLILLJJLI, 0));
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
        if (c1711306n1 != null && c1711306n1.LIZIZ != null) {
            C0Y8T c0y8t = c1711306n1.LIZIZ;
            if (c0y8t != null && c0y8t.isTemp()) {
                return;
            }
            LIZ(0, c1711306n1.LIZIZ);
        }
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
        LIZ(4, c0y8t);
    }

    public C878450Yd9(C878460YdA c878460YdA, C878470YdB c878470YdB) {
        this.LL = c878470YdB;
        this.LLILLJJLI = c878460YdA;
    }

    public final void LIZ(int i, C0Y8T c0y8t) {
        C878470YdB c878470YdB = this.LL;
        C1729806q0.LIZJ(c878470YdB.LIZ, new C878440Yd8(c0y8t, this, c878470YdB, this.LLILLJJLI, i));
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        LIZ(i, c0y8t);
    }
}
