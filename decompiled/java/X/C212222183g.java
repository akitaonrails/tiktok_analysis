package X;

import java.util.Map;

/* JADX INFO: renamed from: X.183g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212222183g {
    public final /* synthetic */ C212219183d LIZ;

    public final void LIZ() {
        this.LIZ.LLJZIJLIL.LJIIZILJ(true);
    }

    public C212222183g(C212219183d c212219183d) {
        this.LIZ = c212219183d;
    }

    public final void LIZIZ(C212236183u c212236183u) {
        InterfaceC212166181c popCardViewCallback;
        C212219183d c212219183d = this.LIZ;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAtmosphere result needShow = ");
        sbLIZ.append(c212236183u.LIZ);
        sbLIZ.append(" , showChanged = ");
        sbLIZ.append(c212236183u.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        c212219183d.LLJZIJLIL.LJIIZILJ(!c212236183u.LIZ);
        if (c212236183u.LIZ) {
            Map<String, String> map = c212236183u.LIZJ;
            if (c212236183u.LIZIZ && map != null && (popCardViewCallback = c212219183d.getPopCardViewCallback()) != null) {
                popCardViewCallback.LJIIIIZZ(map);
            }
        }
    }
}
