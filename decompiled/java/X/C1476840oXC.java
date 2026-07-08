package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;

/* JADX INFO: renamed from: X.0oXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476840oXC extends C1477120oXe {
    public boolean LLJ;
    public int LLJILJIL;
    public long LLJILJILJ;
    public String LLJILLL;
    public InterfaceC1475360oUo LLJJ;
    public String LLJJIII;
    public String LLJJIJI;
    public int LLJI = -1;
    public String LLJIJIL = "";
    public int LLJJI = 1;

    public static C1476840oXC LIZ(C1477120oXe c1477120oXe) {
        if (c1477120oXe instanceof C1477120oXe) {
            C1476840oXC c1476840oXC = new C1476840oXC();
            c1476840oXC.LL = c1477120oXe.LL;
            c1476840oXC.LLILZLL = c1477120oXe.LLILZLL;
            c1476840oXC.LLILZIL = c1477120oXe.LLILZIL;
            c1476840oXC.LLIZ = c1477120oXe.LLIZ;
            c1476840oXC.LLILZ = c1477120oXe.LLILZ;
            c1476840oXC.LLILLJJLI = c1477120oXe.LLILLJJLI;
            if (C1474810oTv.LLJL()) {
                c1476840oXC.LLILLL = c1477120oXe.LLILLL;
            }
            c1476840oXC.LLIZLLLIL = c1477120oXe.LLIZLLLIL;
            InterfaceC1477220oXo interfaceC1477220oXo = c1477120oXe.LL;
            if (interfaceC1477220oXo instanceof SimBitRate) {
                SimBitRate simBitRate = (SimBitRate) interfaceC1477220oXo;
                c1476840oXC.LLJJIJI = simBitRate.getFidProfileLabels();
                if (simBitRate.getPlayAddr() != null) {
                    c1476840oXC.LLJJIII = simBitRate.getPlayAddr().getaK();
                }
            }
            if (c1477120oXe instanceof C1476840oXC) {
                C1476840oXC c1476840oXC2 = (C1476840oXC) c1477120oXe;
                c1476840oXC.LLJILJILJ = c1476840oXC2.LLJILJILJ;
                c1476840oXC.LLJILLL = c1476840oXC2.LLJILLL;
                c1476840oXC.LLIZ = c1476840oXC2.LLIZ;
                c1476840oXC.LLJIJIL = c1476840oXC2.LLJIJIL;
            }
            return c1476840oXC;
        }
        return null;
    }
}
