package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0oHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1467190oHd extends C1467410oHz {
    public final int LJ;
    public String LJFF;
    public final String LJI;
    public InterfaceC1467050oHP LJII;
    public C1474520oTS LJIIIIZZ;
    public HashMap<String, EnumC2281151EQn> LJIIIZ;
    public final HashMap<String, String> LJIIJ = new HashMap<>();

    @Override // X.C1467410oHz, X.InterfaceC1467290oHn
    public final boolean LIZJ() {
        return true;
    }

    public C1467190oHd() {
    }

    public C1467190oHd(InterfaceC1467050oHP interfaceC1467050oHP) {
        this.LJII = interfaceC1467050oHP;
        String strLJJII = interfaceC1467050oHP.LJJII(218);
        this.LJI = strLJJII;
        this.LJFF = this.LJII.LJJII(217);
        this.LJ = this.LJII.LJIIZILJ(9);
        this.LJII.LJJI(this.LJIIIZ);
        this.LIZIZ = interfaceC1467050oHP.LJJII(2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set video model, fallback api:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",keyseed:");
        sbLIZ.append(strLJJII);
        C1471660oOq.LIZJ("VideoModelMediaSource", C2188811AlT.LIZIZ(sbLIZ));
    }
}
