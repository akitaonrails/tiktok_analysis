package X;

import android.view.SurfaceControl;

/* JADX INFO: renamed from: X.0oHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467230oHh {
    public final InterfaceC1467240oHi LIZ;
    public SurfaceControl LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C1467230oHh(C1468160oJC c1468160oJC) {
        this.LIZ = c1468160oJC;
    }

    public final void LIZ(InterfaceC1467950oIr interfaceC1467950oIr) {
        String string;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mediaPlayer:");
            sbLIZ.append(interfaceC1467950oIr);
            sbLIZ.append(", mParentSurfaceControl:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", mWidth:");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", mHeight:");
            sbLIZ.append(this.LIZLLL);
            C1481110oe5.LIZIZ("EngineSurfaceControlWrapper", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1467240oHi interfaceC1467240oHi = this.LIZ;
        if (interfaceC1467240oHi != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlayCoreSurfaceControl@");
            SurfaceControl surfaceControl = this.LIZIZ;
            if (surfaceControl != null) {
                string = surfaceControl.toString();
            } else {
                string = "";
            }
            sbLIZ2.append(string);
            interfaceC1467240oHi.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (interfaceC1467950oIr != null) {
            ((C1470430oMr) interfaceC1467950oIr).LJJIJIIJI(this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }
}
