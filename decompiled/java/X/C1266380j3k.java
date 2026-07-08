package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0j3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266380j3k implements InterfaceC1267260j5A, InterfaceC1267250j59 {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public float LJIIL = C1101250elP.LIZ.floatValue();
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public String LJIILLIIL = "default";
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public int LJIJI = -1;
    public int LJIJJ = -1;
    public int LJIJJLI = -1;
    public int LJIL = -1;
    public int LJJ = -1;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHStreamFeature{cameraCaptureWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cameraCaptureHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", adaptedResolutionWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", adaptedResolutionHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", encodeResolutionWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", encodeResolutionHeight=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", initialEncodeWidth=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", initialEncodeHeight=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", initialCameraWidth=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", initialCameraHeight=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", initialEffectWidth=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", initialEffectHeight=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", inCapFps=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", targetFps=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", encodeFps=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", encodeChangeReason='");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", initialFps=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", gameCaptureWidth=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", gameCaptureHeight=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", gameResolutionWidth=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", gameResolutionHeight=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", initialGameResolutionWidth=");
        sbLIZ.append(this.LJIL);
        sbLIZ.append(", initialGameResolutionHeight=");
        sbLIZ.append(this.LJJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267250j59
    public final List<String> LIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266380j3k)) {
            C1266380j3k c1266380j3k = (C1266380j3k) interfaceC1267260j5A;
            if (c1266380j3k.LJ != this.LJ || c1266380j3k.LJFF != this.LJFF) {
                if (TextUtils.equals(c1266380j3k.LJIILLIIL, "network")) {
                    arrayList.add("encoder_change");
                } else if (this.LJ > 0 && this.LJFF > 0) {
                    arrayList.add("encoder_change");
                }
            }
            int i2 = c1266380j3k.LIZJ;
            if (i2 > 0 && (i = this.LIZJ) > 0) {
                if (i2 > 360 && i <= 360) {
                    arrayList.add("effect_resolution_change");
                }
                if (c1266380j3k.LIZJ <= 360 && this.LIZJ > 360) {
                    arrayList.add("effect_resolution_change");
                }
            }
            if (c1266380j3k.LIZJ <= 360 && this.LIZJ == -1) {
                arrayList.add("effect_resolution_change");
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266380j3k)) {
            C1266380j3k c1266380j3k = (C1266380j3k) interfaceC1267260j5A;
            this.LIZIZ = c1266380j3k.LIZIZ;
            this.LIZ = c1266380j3k.LIZ;
            this.LIZJ = c1266380j3k.LIZJ;
            this.LIZLLL = c1266380j3k.LIZLLL;
            this.LJ = c1266380j3k.LJ;
            this.LJFF = c1266380j3k.LJFF;
            this.LJI = c1266380j3k.LJI;
            this.LJII = c1266380j3k.LJII;
            this.LJIIIIZZ = c1266380j3k.LJIIIIZZ;
            this.LJIIIZ = c1266380j3k.LJIIIZ;
            this.LJIIJ = c1266380j3k.LJIIJ;
            this.LJIIJJI = c1266380j3k.LJIIJJI;
            this.LJIIL = c1266380j3k.LJIIL;
            this.LJIILIIL = c1266380j3k.LJIILIIL;
            this.LJIILJJIL = c1266380j3k.LJIILJJIL;
            this.LJIILL = c1266380j3k.LJIILL;
            this.LJIILLIIL = c1266380j3k.LJIILLIIL;
            this.LJIIZILJ = c1266380j3k.LJIIZILJ;
            this.LJIJ = c1266380j3k.LJIJ;
            this.LJIJI = c1266380j3k.LJIJI;
            this.LJIJJ = c1266380j3k.LJIJJ;
            this.LJIJJLI = c1266380j3k.LJIJJLI;
            this.LJIL = c1266380j3k.LJIL;
            this.LJJ = c1266380j3k.LJJ;
        }
    }
}
