package X;

import android.view.View;
import u4.q0;

/* JADX INFO: renamed from: X.1A6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6Y {
    public static volatile boolean LIZ;

    public static void LIZ(View view, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyFullScreenState: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1A6V c1a6vLJIIJ = q0.LJIIJ(view);
        if (c1a6vLJIIJ != null) {
            if (z) {
                c1a6vLJIIJ.LIZ(7);
                c1a6vLJIIJ.LIZ.LJ();
            } else {
                c1a6vLJIIJ.LIZLLL(7);
            }
        }
    }

    public static void LIZIZ(View view, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChangeToFullScreenMode: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ = z;
        LIZ(view, z);
    }

    public static void LIZJ(final View view, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInitToFullScreenMode: ");
        sbLIZ.append(z);
        sbLIZ.append(", view:");
        sbLIZ.append(view);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ = z;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("applyWindowInsetsListener: view:");
        sbLIZ2.append(view);
        C2188811AlT.LIZIZ(sbLIZ2);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.1A6Z
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C1A6Y.LIZ(view, C1A6Y.LIZ);
                return c20246014Ju;
            }
        });
        LIZ(view, z);
    }
}
