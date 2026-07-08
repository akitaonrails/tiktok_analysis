package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577440Mko extends AbstractC1651430t4n {
    public static final C577140MkK LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final boolean LLILZLL;
    public final C1664750tQH LLIZ;
    public final EnumC1651770t5L LLIZLLLIL;
    public final AwS552S0100000_8 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C577440Mko.class, "cameraLayoutComponent", "getCameraLayoutComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C577140MkK();
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1651430t4n
    public final void LJIJI(C1654400t9a c1654400t9a) {
        ((InterfaceC577380Mki) this.LLIZ.getValue(this, LLJIJIL[0])).fv(c1654400t9a.LIZ);
    }

    public C577440Mko(C1DRG c1drg, boolean z) {
        super(c1drg);
        this.LLILZLL = z;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC577380Mki.class, null);
        this.LLIZLLLIL = EnumC1651770t5L.LAYOUT;
        this.LLJ = new AwS552S0100000_8(this, 913);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZLLL(C1654400t9a c1654400t9a, Object obj) {
        LJIJI(c1654400t9a);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        ((InterfaceC577380Mki) this.LLIZ.getValue(this, LLJIJIL[0])).In(c1654400t9a.LIZJ);
    }
}
