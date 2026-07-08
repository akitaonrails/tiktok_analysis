package X;

import a6n.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0szY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648180szY implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1191));
    public final C1664740tQG LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final k LLJ;
    public final C1664750tQH LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648180szY.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648180szY.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648180szY.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648180szY.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648180szY.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1648180szY.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1648180szY.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(a aVar) {
        EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.NEW_BOTTOM_STORY;
        return new C1653330t7r(C0MTD.LIZ(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag(), "quick_video", this.LLILLJJLI, new InterfaceC1653360t7u() { // from class: X.0szX
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                int i;
                C385670FAf<Boolean> c385670FAfL00;
                Object obj;
                String str;
                C1648180szY c1648180szY = this.LIZ;
                C1664740tQG c1664740tQG = c1648180szY.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648180szY.LLJIJIL;
                InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1664740tQG.getValue(c1648180szY, interfaceC2217461BqaArr[5]);
                if (interfaceC1646220swO != null) {
                    int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
                    C1647390syH c1647390syH = c1646490swp.LIZJ;
                    if (c1647390syH != null) {
                        obj = c1647390syH.LIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    interfaceC1646220swO.uF2(iLJFF, str, c1646490swp.LJ, EnumC2008807tu.TAB_CHANGED);
                }
                C1648180szY c1648180szY2 = this.LIZ;
                ShortVideoContext shortVideoContext = (ShortVideoContext) c1648180szY2.LLILZIL.getValue(c1648180szY2, interfaceC2217461BqaArr[2]);
                C1648180szY c1648180szY3 = this.LIZ;
                if (((ShortVideoContext) c1648180szY3.LLILZIL.getValue(c1648180szY3, interfaceC2217461BqaArr[2])).creativeModel.storyModel.isSocialCameraEntrance()) {
                    i = 23;
                } else {
                    i = 20;
                }
                shortVideoContext.shootMode = i;
                C1648180szY c1648180szY4 = this.LIZ;
                com.ss.android.ugc.aweme.shortvideo.component.a aVarLIZJ = ((InterfaceC1647420syK) c1648180szY4.LLILZLL.getValue(c1648180szY4, interfaceC2217461BqaArr[3])).pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.eP2(true);
                }
                C1648180szY c1648180szY5 = this.LIZ;
                InterfaceC1628590sTx interfaceC1628590sTxLIZJ = ((InterfaceC1647420syK) c1648180szY5.LLILZLL.getValue(c1648180szY5, interfaceC2217461BqaArr[3])).NL1().LIZJ();
                if (interfaceC1628590sTxLIZJ != null) {
                    interfaceC1628590sTxLIZJ.Y7(Boolean.FALSE, null, null);
                }
                C1648180szY c1648180szY6 = this.LIZ;
                InterfaceC1651080t4E interfaceC1651080t4ELIZJ = ((InterfaceC1647420syK) c1648180szY6.LLILZLL.getValue(c1648180szY6, interfaceC2217461BqaArr[3])).I42().LIZJ();
                if (interfaceC1651080t4ELIZJ != null) {
                    interfaceC1651080t4ELIZJ.Ee2();
                }
                C1648180szY c1648180szY7 = this.LIZ;
                InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) c1648180szY7.LLILZ.getValue(c1648180szY7, interfaceC2217461BqaArr[1]);
                if (interfaceC1652190t61 != null && (c385670FAfL00 = interfaceC1652190t61.L00()) != null && Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE)) {
                    C1648180szY c1648180szY8 = this.LIZ;
                    InterfaceC1652190t61 interfaceC1652190t612 = (InterfaceC1652190t61) c1648180szY8.LLILZ.getValue(c1648180szY8, interfaceC2217461BqaArr[1]);
                    if (interfaceC1652190t612 != null) {
                        interfaceC1652190t612.tu2();
                    }
                }
                C1648180szY c1648180szY9 = this.LIZ;
                boolean z = c1646490swp.LIZ;
                c1648180szY9.getClass();
                C1648150szV c1648150szV = new C1648150szV(true);
                c1648150szV.LIZLLL = z;
                c1648150szV.LIZJ = 2;
                ((InterfaceC1648020szI) c1648180szY9.LLIZ.getValue(c1648180szY9, interfaceC2217461BqaArr[4])).configSwitchDuration(c1648150szV);
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        ((InterfaceC1648570t0B) this.LLJI.getValue(this, LLJIJIL[6])).KA0(C0LF1.class, new C579550MoD(this.LLJ, (C19EG) this.LL.LJII(C19EG.class, null), (e0) this.LL.LJII(e0.class, null), (C1656050tCF) this.LL.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LL.LJII(C580090Mp5.class, null), (q) this.LL.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LL.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LL.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LL.LJIIL(null, C1647410syJ.class), this.LL));
    }

    public C1648180szY(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
        C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652190t61.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLJ = (k) c1drg.LJIIL(null, k.class);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
    }
}
