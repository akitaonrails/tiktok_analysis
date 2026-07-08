package X;

import a6n.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0szh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648270szh implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final C1DRG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final k LLJI;
    public final C1664740tQG LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648270szh.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648270szh.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648270szh.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648270szh.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648270szh.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new InterfaceC1653360t7u() { // from class: X.0szg
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                a aVar2 = aVar;
                if (aVar2.LIZ) {
                    InterfaceC1646290swV interfaceC1646290swV = aVar2.LIZIZ;
                    if (interfaceC1646290swV != null) {
                        interfaceC1646290swV.n3("record");
                    }
                } else {
                    ln3.a aVar3 = aVar2.LIZLLL;
                    if (aVar3 != null) {
                        aVar3.n3("record");
                    }
                }
                C1648270szh c1648270szh = this;
                C1664750tQH c1664750tQH = c1648270szh.LLILZLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648270szh.LLJILJIL;
                ((InterfaceC1648570t0B) c1664750tQH.getValue(c1648270szh, interfaceC2217461BqaArr[0])).va0(C0LF1.class);
                aVar.LIZLLL().shootMode = 15;
                C1648270szh c1648270szh2 = this;
                ((com.ss.android.ugc.aweme.shortvideo.component.a) c1648270szh2.LLIZ.getValue(c1648270szh2, interfaceC2217461BqaArr[1])).eP2(true);
                C1648270szh c1648270szh3 = this;
                ((InterfaceC1650190t2n) c1648270szh3.LLIZLLLIL.getValue(c1648270szh3, interfaceC2217461BqaArr[2])).qh(0);
                C1648270szh c1648270szh4 = this;
                ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                boolean z = c1646490swp.LIZ;
                c1648270szh4.getClass();
                if (!shortVideoContextLIZLLL.LJJLL()) {
                    C1648150szV c1648150szV = new C1648150szV(true);
                    c1648150szV.LIZLLL = z;
                    c1648150szV.LIZJ = 2;
                    c1648150szV.LJ = false;
                    ((InterfaceC1648020szI) c1648270szh4.LLJ.getValue(c1648270szh4, interfaceC2217461BqaArr[3])).configSwitchDuration(c1648150szV);
                }
                C1439190nYT.LJIIIIZZ(15);
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        InterfaceC1644770su3 interfaceC1644770su3;
        ln3.a aVar2;
        C1647410syJ c1647410syJ;
        C1664750tQH c1664750tQH = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        InterfaceC1648570t0B interfaceC1648570t0B = (InterfaceC1648570t0B) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0]);
        k kVar = this.LLJI;
        C19EG c19eg = (C19EG) this.LLILZIL.LJII(C19EG.class, null);
        e0 e0Var = (e0) this.LLILZIL.LJII(e0.class, null);
        C1656050tCF c1656050tCF = (C1656050tCF) this.LLILZIL.LJII(f0.class, null);
        ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
        C580090Mp5 c580090Mp5 = (C580090Mp5) this.LLILZIL.LJII(C580090Mp5.class, null);
        q qVar = (q) this.LLILZIL.LJIIL(null, q.class);
        com.ss.android.ugc.aweme.shortvideo.component.a aVar3 = (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLILZIL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        if (C1622090sJT.LIZ((C1645380sv2) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[4]))) {
            interfaceC1644770su3 = null;
        } else {
            interfaceC1644770su3 = (InterfaceC1644770su3) this.LLILZIL.LJIIL(null, InterfaceC1644770su3.class);
        }
        if (C1622090sJT.LIZ((C1645380sv2) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[4]))) {
            aVar2 = null;
        } else {
            aVar2 = (ln3.a) this.LLILZIL.LJIIL(null, ln3.a.class);
        }
        if (C1622090sJT.LIZ((C1645380sv2) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[4]))) {
            c1647410syJ = (C1647410syJ) this.LLILZIL.LJIIL(null, C1647410syJ.class);
        } else {
            c1647410syJ = null;
        }
        InterfaceC1644770su3 interfaceC1644770su32 = interfaceC1644770su3;
        interfaceC1648570t0B.KA0(C0LF1.class, new C579550MoD(kVar, c19eg, e0Var, c1656050tCF, shortVideoContextLIZLLL, c580090Mp5, qVar, aVar3, interfaceC1644770su32, aVar2, c1647410syJ, this.LLILZIL));
    }

    public C1648270szh(String str, String str2, String str3, boolean z, C1DRG c1drg) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = c1drg;
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJI = (k) c1drg.LJIIL(null, k.class);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
    }
}
