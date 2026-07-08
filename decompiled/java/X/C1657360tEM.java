package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0tEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657360tEM implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1647120sxq LLILLJJLI;
    public final Map<C1657450tEV, C1657460tEW> LLILLL;
    public final AnonymousClass0951 LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1657360tEM.class, "tabRepository", "getTabRepository()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabRepository;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1657360tEM(C1DRG c1drg, C1647120sxq c1647120sxq) {
        this.LL = c1drg;
        this.LLILLJJLI = c1647120sxq;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, C1653860t8i.class, null);
        this.LLILLL = new LinkedHashMap();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        C414301jJ c414301jJ = new C414301jJ(((C1653860t8i) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).LIZJ, ((C1653860t8i) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).LJFF, new C1657370tEN(this, null));
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        C05YW.LIZ.getClass();
        this.LLILZ = C09IC.LJJIJIL(c414301jJ, c054gLIZ, C1370905Yd.LIZIZ, new C443120HZe(-1, -1, new C1657390tEP(new C1657500tEa(C13BV.INSTANCE), new C1657460tEW(null), null, null)));
    }
}
