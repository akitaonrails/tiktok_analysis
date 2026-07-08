package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257371DXb implements InterfaceC1038430d85 {
    public final InterfaceC2257411DXf LIZ;
    public final InterfaceC2257411DXf LIZIZ;
    public InterfaceC2257411DXf LIZJ;
    public AbstractC2257361DXa LIZLLL;

    @Override // X.InterfaceC1038430d85
    public final void LJ(C1036250d4Z c1036250d4Z) {
    }

    @Override // X.InterfaceC1038430d85
    public final void LIZ(AbstractC1039890dAR abstractC1039890dAR) {
        InterfaceC2257411DXf interfaceC2257411DXf;
        if (!(abstractC1039890dAR instanceof C1036500d4y)) {
            InterfaceC2257411DXf interfaceC2257411DXf2 = this.LIZ;
            if (interfaceC2257411DXf2 != null && interfaceC2257411DXf2.LIZLLL(abstractC1039890dAR)) {
                interfaceC2257411DXf = this.LIZ;
            } else {
                InterfaceC2257411DXf interfaceC2257411DXf3 = this.LIZIZ;
                if (interfaceC2257411DXf3 != null && interfaceC2257411DXf3.LIZLLL(abstractC1039890dAR)) {
                    interfaceC2257411DXf = this.LIZIZ;
                } else {
                    return;
                }
            }
            if (interfaceC2257411DXf == null || Intrinsics.LJFF(interfaceC2257411DXf, this.LIZJ)) {
                return;
            }
            InterfaceC2257411DXf interfaceC2257411DXf4 = this.LIZJ;
            if (interfaceC2257411DXf4 != null) {
                interfaceC2257411DXf4.cancel();
            }
            interfaceC2257411DXf.LIZIZ(this.LIZLLL);
            interfaceC2257411DXf.LIZJ(abstractC1039890dAR);
            this.LIZJ = interfaceC2257411DXf;
            return;
        }
        InterfaceC2257411DXf interfaceC2257411DXf5 = this.LIZJ;
        if (interfaceC2257411DXf5 != null) {
            interfaceC2257411DXf5.cancel();
        }
        this.LIZJ = null;
    }

    public C2257371DXb(InterfaceC2257411DXf interfaceC2257411DXf, InterfaceC2257411DXf interfaceC2257411DXf2) {
        this.LIZ = interfaceC2257411DXf;
        this.LIZIZ = interfaceC2257411DXf2;
    }
}
