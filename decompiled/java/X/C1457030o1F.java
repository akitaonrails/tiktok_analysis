package X;

import g3a.a;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.0o1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457030o1F extends a implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1664750tQH LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457030o1F.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457030o1F.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C0CNO.LIZLLL(0L, new AwS423S0200000_22(this, ((InterfaceC1455850nzL) this.LLJ.getValue(this, LLJIJIL[0])).AC2().LIZJ(), 43));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    public C1457030o1F(C1DRG c1drg) {
        this.LLIZLLLIL = c1drg;
        this.LLJ = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        LJ(AFwS261S0000000_22.get$arr$(168));
    }
}
