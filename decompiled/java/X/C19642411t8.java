package X;

import g3a.a;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11t8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19642411t8 extends a implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final long LLJIJIL = System.currentTimeMillis();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19642411t8.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19642411t8.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C0CNO.LIZLLL(0L, new AwS573S0100000_29(this, 972));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    public C19642411t8(C1DRG c1drg) {
        this.LLIZLLLIL = c1drg;
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        LJ(AFwS273S0000000_29.get$arr$(360));
    }
}
