package X;

import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.0tQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664880tQU implements InterfaceC1665350tRF<C787130UuF>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final AnonymousClass0951 LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1664880tQU.class, "revealShootApi", "getRevealShootApi()Lcom/ss/android/ugc/aweme/social/creation/record/biz/reveal/camera/RevealDualCameraShootApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1665350tRF
    public final C05YD<C787130UuF> LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1664880tQU(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C09IC.LIZIZ(C1BNE.LIZ(new C787130UuF(new C1657510tEb((InterfaceC1650310t2z) C1664770tQJ.LIZ(c1drg, InterfaceC1650310t2z.class, null).getValue(this, LLILLL[0])))));
    }

    @Override // X.InterfaceC1665350tRF
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(C787130UuF c787130UuF, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-197604358);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c787130UuF)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1665880tS6.LIZ(c787130UuF.LIZIZ, c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c787130UuF, i, 42);
        }
    }
}
