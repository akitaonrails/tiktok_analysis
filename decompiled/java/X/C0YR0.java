package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YR0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YR0 implements InterfaceC866830XzV {
    public static final C0YR0 LL = new C0YR0();

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
    public final void LJLILLLLZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
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

    public static void LIZ(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.isGroupChat()) {
            C874150YQz.LIZ.getClass();
            C874150YQz.LIZIZ.put(c0y8t.getConversationId(), new C0YR4(2));
            C054G c054g = C0YR3.LIZ;
            C23250099c.LIZLLL(C0YR3.LIZ, null, null, new C0YNT(c0y8t.getConversationId(), null), 3);
        }
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
        LIZ(c0y8t);
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
        LIZ(c0y8t);
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
        LIZ(c0y8t);
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        if (i == 3) {
            LIZ(c0y8t);
        }
    }
}
