package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872090yoh implements InterfaceC1870490ym7 {
    public final /* synthetic */ AbstractC1872080yog LIZ;
    public final /* synthetic */ C1872070yof LIZIZ;
    public final /* synthetic */ EnumC1059790dgX LIZJ;
    public final /* synthetic */ InterfaceC1063920dnC LIZLLL;

    @Override // X.InterfaceC1870490ym7
    public final void LIZIZ(C1872160yoo c1872160yoo, String str) {
        Map mapLIZ = C1872170yop.LIZ(c1872160yoo);
        if (mapLIZ == null) {
            this.LIZ.LJII(-5, this.LIZIZ.LIZ(), this.LIZIZ.getUrl(), "Invalid results", -1, this.LIZJ.name());
            AbstractC1872080yog abstractC1872080yog = this.LIZ;
            InterfaceC1063920dnC interfaceC1063920dnC = this.LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            abstractC1872080yog.getClass();
            AbstractC1064500do8.LIZJ(interfaceC1063920dnC, -5, "", linkedHashMap);
            return;
        }
        AbstractC1872080yog abstractC1872080yog2 = this.LIZ;
        InterfaceC1063920dnC interfaceC1063920dnC2 = this.LIZLLL;
        abstractC1872080yog2.getClass();
        AbstractC1064500do8.LJ(interfaceC1063920dnC2, str, mapLIZ);
    }

    @Override // X.InterfaceC1870490ym7
    public final void LIZ(int i, String str, C1872160yoo c1872160yoo) {
        Map linkedHashMap;
        if (c1872160yoo != null) {
            linkedHashMap = C1872170yop.LIZ(c1872160yoo);
            if (linkedHashMap == null) {
                AbstractC1872080yog abstractC1872080yog = this.LIZ;
                InterfaceC1063920dnC interfaceC1063920dnC = this.LIZLLL;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                abstractC1872080yog.getClass();
                AbstractC1064500do8.LIZJ(interfaceC1063920dnC, i, str, linkedHashMap2);
                return;
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        AbstractC1872080yog abstractC1872080yog2 = this.LIZ;
        InterfaceC1063920dnC interfaceC1063920dnC2 = this.LIZLLL;
        abstractC1872080yog2.getClass();
        AbstractC1064500do8.LIZJ(interfaceC1063920dnC2, i, str, linkedHashMap);
    }

    public C1872090yoh(AbstractC1872080yog abstractC1872080yog, C1872070yof c1872070yof, EnumC1059790dgX enumC1059790dgX, InterfaceC1063920dnC interfaceC1063920dnC) {
        this.LIZ = abstractC1872080yog;
        this.LIZIZ = c1872070yof;
        this.LIZJ = enumC1059790dgX;
        this.LIZLLL = interfaceC1063920dnC;
    }
}
