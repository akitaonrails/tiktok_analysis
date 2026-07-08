package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1DHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253311DHl extends C2253301DHk {
    @Override // X.C2253301DHk
    public final void LIZIZ() {
    }

    @Override // X.C2253301DHk
    public final int LIZ() {
        return this.LIZLLL ? 2 : 0;
    }

    @Override // X.C2253301DHk
    public final boolean LJ() {
        int i = this.LIZ.A4().getInt("device_support_wide_angle_mode", -1);
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraDeviceAbility isSupportWideAngle:");
        sbLIZ.append(i);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return i == 1;
    }

    @Override // X.C2253301DHk
    public final void LIZJ(boolean z) {
        boolean z2 = true;
        this.LIZIZ = true;
        int i = C2253341DHo.LIZ;
        if (i == -1 || i != VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal()) {
            z2 = false;
        }
        this.LIZJ = z2;
        this.LIZLLL = z;
    }

    @Override // X.C2253301DHk
    public final boolean LIZLLL(boolean z) {
        if (!z && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.C2253301DHk
    public final void LJFF(Cert cert) {
        int i;
        C1DHX c1dhx = this.LIZ;
        if (this.LIZLLL) {
            i = 0;
        } else {
            i = 2;
        }
        c1dhx.I4(i, new InterfaceC2253331DHn() { // from class: X.1DHm
            public final /* synthetic */ InterfaceC2253331DHn LIZ = null;

            @Override // X.InterfaceC2253331DHn
            public final void LIZIZ(int i2) {
                InterfaceC2253331DHn interfaceC2253331DHn = this.LIZ;
                if (interfaceC2253331DHn != null) {
                    interfaceC2253331DHn.LIZIZ(i2);
                }
            }

            @Override // X.InterfaceC2253331DHn
            public final void LIZ(int i2, int i3, String str) {
                InterfaceC2253331DHn interfaceC2253331DHn = this.LIZ;
                if (interfaceC2253331DHn != null) {
                    interfaceC2253331DHn.LIZ(i2, i3, str);
                }
            }
        }, cert);
        this.LIZLLL = !this.LIZLLL;
        this.LIZ.X3().LIZLLL(this.LIZLLL);
    }
}
