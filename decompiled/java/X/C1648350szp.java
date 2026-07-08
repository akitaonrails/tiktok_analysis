package X;

import a6n.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0szp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648350szp implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final String LL;
    public final String LLILLJJLI;
    public final C1DRG LLILZ;
    public final C1664740tQG LLILZLL;
    public final ShortVideoContext LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final String LLILLL = "quick";
    public final boolean LLILZIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648350szp.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648350szp.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648350szp.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648350szp.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648350szp.class, "permissionApiComponent", "getPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return null;
    }

    public final InterfaceC1638550sk1 LIZ() {
        return (InterfaceC1638550sk1) this.LLILZLL.getValue(this, LLJI[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, new InterfaceC1653360t7u() { // from class: X.0szr
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                ShortVideoContext shortVideoContext;
                ShortVideoContext shortVideoContext2;
                C385670FAf<Boolean> c385670FAfL00;
                InterfaceC1638550sk1 interfaceC1638550sk1LIZ = this.LIZ.LIZ();
                if (interfaceC1638550sk1LIZ != null) {
                    interfaceC1638550sk1LIZ.yf(c1646490swp);
                }
                ShortVideoContext shortVideoContext3 = this.LIZ.LLIZ;
                if ((shortVideoContext3 != null && shortVideoContext3.LJJIL()) || (((shortVideoContext = this.LIZ.LLIZ) != null && shortVideoContext.LJJJ()) || ((shortVideoContext2 = this.LIZ.LLIZ) != null && shortVideoContext2.LJJIIZI()))) {
                    C1648350szp c1648350szp = this.LIZ;
                    InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) c1648350szp.LLJ.getValue(c1648350szp, C1648350szp.LLJI[4]);
                    if (interfaceC1652190t61 == null || (c385670FAfL00 = interfaceC1652190t61.L00()) == null || !Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE)) {
                        ((C0MGL) this.LIZ.LLILZ.LJII(C0MGL.class, null)).GN2(true);
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1638550sk1 interfaceC1638550sk1LIZ = this.LIZ.LIZ();
                if (interfaceC1638550sk1LIZ != null) {
                    interfaceC1638550sk1LIZ.m5(c1646490swp);
                    return false;
                }
                return false;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        ShortVideoContext shortVideoContext = this.LLIZ;
        boolean z = false;
        if (shortVideoContext == null || !C539900LFk.LIZ(shortVideoContext) || !this.LLIZ.LJJIL()) {
            z = true;
        }
        InterfaceC1638550sk1 interfaceC1638550sk1LIZ = LIZ();
        if (interfaceC1638550sk1LIZ != null) {
            interfaceC1638550sk1LIZ.d30(true);
        }
        InterfaceC1638550sk1 interfaceC1638550sk1LIZ2 = LIZ();
        if (interfaceC1638550sk1LIZ2 != null) {
            interfaceC1638550sk1LIZ2.JN0(z);
        }
        C1664750tQH c1664750tQH = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        ((InterfaceC1648570t0B) c1664750tQH.getValue(this, interfaceC2217461BqaArr[3])).KA0(C0LF1.class, new C579550MoD((k) this.LLILZ.LJIIL(null, k.class), (C19EG) this.LLILZ.LJII(C19EG.class, null), (e0) this.LLILZ.LJII(e0.class, null), (C1656050tCF) this.LLILZ.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LLILZ.LJII(C580090Mp5.class, null), (q) this.LLILZ.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLILZ.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LLILZ.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LLILZ.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LLILZ.LJIIL(null, C1647410syJ.class), this.LLILZ));
        ((InterfaceC1648570t0B) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[3])).va0(C0LF1.class);
    }

    public C1648350szp(String str, String str2, C1DRG c1drg) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZ = c1drg;
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1638550sk1.class, null);
        C1664770tQJ.LIZIZ(c1drg, com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        this.LLIZ = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652190t61.class, null);
    }
}
