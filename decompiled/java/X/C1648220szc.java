package X;

import a6n.a;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0szc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648220szc implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 50));
    public final C1664740tQG LLJ;
    public final C1664750tQH LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664740tQG LLJJ;
    public final k LLJJI;
    public final C1664750tQH LLJJIII;

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648220szc.class, "tnsNoticeComponent", "getTnsNoticeComponent()Lcom/ss/android/ugc/gamora/recorder/tnsnotice/TnSNoticeApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648220szc.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648220szc.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648220szc.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648220szc.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1648220szc.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1648220szc.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1648220szc.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final InterfaceC1648020szI LIZ() {
        return (InterfaceC1648020szI) this.LLJILLL.getValue(this, LLJJIJI[5]);
    }

    public final InterfaceC1647420syK LIZIZ() {
        return (InterfaceC1647420syK) this.LLJILJILJ.getValue(this, LLJJIJI[4]);
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        if (this.LLIZ) {
            return null;
        }
        return (AbstractC1653180t7c) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        String str;
        if (this.LLILLL) {
            str = this.LLILZ;
        } else {
            str = " ";
        }
        return new C1653330t7r(str, this.LLILZIL, this.LLILZLL, this.LLILLJJLI, new InterfaceC1653360t7u() { // from class: X.0szb
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str2) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1648240sze interfaceC1648240szeLIZJ;
                C385670FAf<Boolean> c385670FAfL00;
                Object obj;
                String str2;
                InterfaceC1648250szf interfaceC1648250szfLIZJ = this.LIZ.LIZIZ().MK().LIZJ();
                if (interfaceC1648250szfLIZJ != null) {
                    interfaceC1648250szfLIZJ.nT0(true);
                }
                C1648220szc c1648220szc = this.LIZ;
                C1664740tQG c1664740tQG = c1648220szc.LLJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648220szc.LLJJIJI;
                InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1664740tQG.getValue(c1648220szc, interfaceC2217461BqaArr[6]);
                if (interfaceC1646220swO != null) {
                    int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
                    C1647390syH c1647390syH = c1646490swp.LIZJ;
                    if (c1647390syH != null) {
                        obj = c1647390syH.LIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    interfaceC1646220swO.uF2(iLJFF, str2, c1646490swp.LJ, EnumC2008807tu.TAB_CHANGED);
                }
                C1648220szc c1648220szc2 = this.LIZ;
                C1447470nlp.LIZIZ(((InterfaceC1650190t2n) c1648220szc2.LLJI.getValue(c1648220szc2, interfaceC2217461BqaArr[1])).fF2(), C11VU.LIZ(12.0f));
                C1648220szc c1648220szc3 = this.LIZ;
                ((ShortVideoContext) c1648220szc3.LLJILJIL.getValue(c1648220szc3, interfaceC2217461BqaArr[3])).shootMode = 24;
                com.ss.android.ugc.aweme.shortvideo.component.a aVarLIZJ = this.LIZ.LIZIZ().pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.eP2(true);
                }
                InterfaceC1651080t4E interfaceC1651080t4ELIZJ = this.LIZ.LIZIZ().I42().LIZJ();
                if (interfaceC1651080t4ELIZJ != null) {
                    interfaceC1651080t4ELIZJ.Ee2();
                }
                C1648220szc c1648220szc4 = this.LIZ;
                InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) c1648220szc4.LLJIJIL.getValue(c1648220szc4, interfaceC2217461BqaArr[2]);
                if (interfaceC1652190t61 != null && (c385670FAfL00 = interfaceC1652190t61.L00()) != null && Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE)) {
                    C1648220szc c1648220szc5 = this.LIZ;
                    InterfaceC1652190t61 interfaceC1652190t612 = (InterfaceC1652190t61) c1648220szc5.LLJIJIL.getValue(c1648220szc5, interfaceC2217461BqaArr[2]);
                    if (interfaceC1652190t612 != null) {
                        interfaceC1652190t612.tu2();
                    }
                }
                if (Intrinsics.LJFF(this.LIZ.LLILZIL, EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO.getTag())) {
                    C1648220szc c1648220szc6 = this.LIZ;
                    DMCameraModel dMCameraModel = ((ShortVideoContext) c1648220szc6.LLJILJIL.getValue(c1648220szc6, interfaceC2217461BqaArr[3])).creativeModel.initialModel.dmCameraModel;
                    if (dMCameraModel.shouldDisplayRecordGuide && !dMCameraModel.shouldDisplayTnsNoticeShooting) {
                        C1648220szc c1648220szc7 = this.LIZ;
                        InterfaceC1646140swG interfaceC1646140swG = (InterfaceC1646140swG) c1648220szc7.LLJ.getValue(c1648220szc7, interfaceC2217461BqaArr[0]);
                        if (interfaceC1646140swG != null) {
                            interfaceC1646140swG.hide();
                        }
                    }
                    InterfaceC1648240sze interfaceC1648240szeLIZJ2 = this.LIZ.LIZIZ().Ch1().LIZJ();
                    if (interfaceC1648240szeLIZJ2 != null) {
                        interfaceC1648240szeLIZJ2.pl1(true);
                    }
                } else if (Intrinsics.LJFF(this.LIZ.LLILZIL, EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO.getTag()) && (interfaceC1648240szeLIZJ = this.LIZ.LIZIZ().Ch1().LIZJ()) != null) {
                    interfaceC1648240szeLIZJ.pl1(false);
                }
                C1648220szc c1648220szc8 = this.LIZ;
                boolean z = c1646490swp.LIZ;
                c1648220szc8.getClass();
                C1648150szV c1648150szV = new C1648150szV(true);
                c1648150szV.LIZLLL = z;
                c1648150szV.LIZJ = 2;
                c1648220szc8.LIZ().configSwitchDuration(c1648150szV);
                if (C294760Bgw.LIZ()) {
                    C1648220szc c1648220szc9 = this.LIZ;
                    if (!c1648220szc9.LLIZ) {
                        c1648220szc9.LIZ().showComplexTab(0, c1646490swp.LIZJ);
                        this.LIZ.LIZ().selectDefaultSubTab();
                    }
                }
                C1647390syH c1647390syH2 = c1646490swp.LIZJ;
                if (c1647390syH2 != null) {
                    Object obj2 = c1647390syH2.LIZ;
                    Object obj3 = c1647390syH2.LIZIZ;
                    if (obj2 != null && !Intrinsics.LJFF(obj2, obj3)) {
                        C1648220szc c1648220szc10 = this.LIZ;
                        ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                        c1648220szc10.getClass();
                        DMCameraModel dMCameraModel2 = shortVideoContextLIZLLL.creativeModel.initialModel.dmCameraModel;
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("tab_name", "camera");
                        c0lab.LJ("enter_dm", dMCameraModel2.enterDM);
                        String str3 = dMCameraModel2.enterMethodType;
                        if (str3 == null) {
                            str3 = "";
                        }
                        c0lab.LJ("enter_dm_type", str3);
                        C20684815ws.LJIILLIIL("click_dm_camera_tab", c0lab.LIZ);
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                C1648220szc c1648220szc = this.LIZ;
                C1447470nlp.LIZIZ(((InterfaceC1650190t2n) c1648220szc.LLJI.getValue(c1648220szc, C1648220szc.LLJJIJI[1])).fF2(), C11VU.LIZ(0.0f));
                if (C294760Bgw.LIZ()) {
                    C1648220szc c1648220szc2 = this.LIZ;
                    if (!c1648220szc2.LLIZ) {
                        c1648220szc2.LIZ().showComplexTab(8, c1646490swp.LIZJ);
                    }
                }
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        ((InterfaceC1648570t0B) this.LLJJIII.getValue(this, LLJJIJI[7])).KA0(C0LF1.class, new C579550MoD(this.LLJJI, (C19EG) this.LL.LJII(C19EG.class, null), (e0) this.LL.LJII(e0.class, null), (C1656050tCF) this.LL.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LL.LJII(C580090Mp5.class, null), (q) this.LL.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LL.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LL.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LL.LJIIL(null, C1647410syJ.class), this.LL));
    }

    public C1648220szc(C1DRG c1drg, boolean z, boolean z2, String str, String str2, String str3, boolean z3) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = z3;
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646140swG.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652190t61.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLJJI = (k) c1drg.LJIIL(null, k.class);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
    }
}
