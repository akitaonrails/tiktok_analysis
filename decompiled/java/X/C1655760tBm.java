package X;

import Y.AObjectS317S0200000_25;

/* JADX INFO: renamed from: X.0tBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1655760tBm {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public InterfaceC2254001DKc LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ(InterfaceC1656000tCA interfaceC1656000tCA) {
        if (!this.LJFF && !this.LJII) {
            if (this.LJI) {
                C2219091BtD.LIZLLL().i("CameraVideoRecorder concat return 0");
                interfaceC1656000tCA.LIZ(0, this.LIZ, this.LIZIZ, this.LIZJ);
                return;
            }
            if (this.LIZ != null) {
                C0VSJ c0vsj = new C0VSJ(this.LIZ);
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
            }
            if (this.LIZIZ != null) {
                C0VSJ c0vsj2 = new C0VSJ(this.LIZIZ);
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                }
            }
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CameraVideoRecorder executeAsync concatasync enableSingleSegmentConcatUseCopy ");
            sbLIZ.append(this.LIZLLL);
            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC2254001DKc interfaceC2254001DKc = this.LJ;
            if (interfaceC2254001DKc != null) {
                interfaceC2254001DKc.M5(this.LIZLLL, this.LIZJ, new AObjectS317S0200000_25(this, interfaceC1656000tCA, 0));
                return;
            }
            return;
        }
        if (this.LJI) {
            String str = this.LIZ;
            String str2 = this.LIZIZ;
            InterfaceC2254001DKc interfaceC2254001DKc2 = this.LJ;
            if (interfaceC2254001DKc2 != null) {
                interfaceC2254001DKc2.V4(new C1655800tBq(this, interfaceC1656000tCA, str, str2, 0));
                return;
            }
            return;
        }
        if (this.LIZ != null) {
            C0VSJ c0vsj3 = new C0VSJ(this.LIZ);
            if (c0vsj3.exists()) {
                c0vsj3.delete();
            }
        }
        if (this.LIZIZ != null) {
            C0VSJ c0vsj4 = new C0VSJ(this.LIZIZ);
            if (c0vsj4.exists()) {
                c0vsj4.delete();
            }
        }
        if (this.LIZ == null || this.LIZIZ == null || this.LJ == null) {
            return;
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CameraVideoRecorder concatWithReleaseGPUResource concatAsync enableSingleSegmentConcatUseCopy ");
        sbLIZ2.append(this.LIZLLL);
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
        this.LJ.M5(this.LIZLLL, this.LIZJ, new AObjectS317S0200000_25(this, interfaceC1656000tCA, 1));
    }
}
