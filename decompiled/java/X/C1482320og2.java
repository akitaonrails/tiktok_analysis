package X;

/* JADX INFO: renamed from: X.0og2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1482320og2 implements InterfaceC1483810oiR {
    public final InterfaceC1479560oba LIZ;
    public final InterfaceC1483670oiD LIZIZ;
    public InterfaceC585470Mxl LIZJ;
    public InterfaceC1481780ofA LIZLLL;

    @Override // X.InterfaceC1483810oiR
    public void mute() {
        this.LIZ.LJIILLIIL(0.0f, 0.0f);
    }

    @Override // X.InterfaceC1483810oiR
    public void unmute() {
        this.LIZ.LJIILLIIL(1.0f, 1.0f);
    }

    @Override // X.InterfaceC1483810oiR
    public void LIZ(InterfaceC585470Mxl interfaceC585470Mxl) {
        this.LIZJ = interfaceC585470Mxl;
    }

    @Override // X.InterfaceC1483810oiR
    public void LIZIZ(InterfaceC1481780ofA interfaceC1481780ofA) {
        this.LIZLLL = interfaceC1481780ofA;
    }

    @Override // X.InterfaceC1483810oiR
    public void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC1483810oiR
    public void LJ(InterfaceC585470Mxl interfaceC585470Mxl) {
        if (interfaceC585470Mxl == this.LIZJ) {
            this.LIZJ = null;
        }
    }

    public C1482320og2(InterfaceC1479560oba interfaceC1479560oba, C1479300obA c1479300obA) {
        this.LIZ = interfaceC1479560oba;
        this.LIZIZ = c1479300obA;
    }

    @Override // X.InterfaceC1483810oiR
    public void LIZLLL(String str, String str2) {
        this.LIZ.LIZLLL(str, str2);
    }

    @Override // X.InterfaceC1483810oiR
    public void LJIILLIIL(float f, float f2) {
        this.LIZ.LJIILLIIL(f, f2);
    }
}
