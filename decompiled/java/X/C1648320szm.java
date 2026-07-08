package X;

import a6n.a;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0szm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648320szm implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final k LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public int LLJILLL;
    public final boolean LLILLJJLI = false;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 52));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(70));

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648320szm.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648320szm.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648320szm.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648320szm.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648320szm.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1648320szm.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1648320szm.class, "tnsNoticeComponent", "getTnsNoticeComponent()Lcom/ss/android/ugc/gamora/recorder/tnsnotice/TnSNoticeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1648320szm.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final InterfaceC1647420syK LIZ() {
        return (InterfaceC1647420syK) this.LLIZLLLIL.getValue(this, LLJJ[1]);
    }

    public final ShortVideoContext LIZIZ() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJ[0]);
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(aVar.LIZ().getString(2131831813), EnumC1647570syZ.PLAYGROUND.getTag(), "quick_photo", this.LLILLJJLI, new InterfaceC1653360t7u() { // from class: X.0szk
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1630630sXF interfaceC1630630sXF;
                this.LIZ.LIZIZ().shootMode = 27;
                com.ss.android.ugc.aweme.shortvideo.component.a aVarLIZJ = this.LIZ.LIZ().pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.eP2(true);
                }
                C1648320szm c1648320szm = this.LIZ;
                C1664740tQG c1664740tQG = c1648320szm.LLJILJILJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648320szm.LLJJ;
                String secUid = null;
                if (C1631200sYA.LIZ((C1631190sY9) c1664740tQG.getValue(c1648320szm, interfaceC2217461BqaArr[7]))) {
                    ((C0ETY) this.LIZ.LL.LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS265S0000000_25(2));
                } else {
                    InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) this.LIZ.LL.LJII(InterfaceC1649820t2C.class, null);
                    if ((interfaceC1649820t2C instanceof InterfaceC1630630sXF) && (interfaceC1630630sXF = (InterfaceC1630630sXF) interfaceC1649820t2C) != null) {
                        interfaceC1630630sXF.LZ1(EnumC1648530t07.DEFAULT);
                    }
                    interfaceC1649820t2C.Hn(1, true);
                    interfaceC1649820t2C.hF2(false, false);
                }
                InterfaceC1651080t4E interfaceC1651080t4ELIZJ = this.LIZ.LIZ().I42().LIZJ();
                if (interfaceC1651080t4ELIZJ != null) {
                    interfaceC1651080t4ELIZJ.Ee2();
                }
                InterfaceC1648250szf interfaceC1648250szfLIZJ = this.LIZ.LIZ().MK().LIZJ();
                if (interfaceC1648250szfLIZJ != null) {
                    interfaceC1648250szfLIZJ.nT0(false);
                }
                InterfaceC1648870t0f interfaceC1648870t0fLIZJ = this.LIZ.LIZ().ir2().LIZJ();
                if (interfaceC1648870t0fLIZJ != null) {
                    interfaceC1648870t0fLIZJ.setEffectContainerVisibility(8);
                }
                InterfaceC1648870t0f interfaceC1648870t0fLIZJ2 = this.LIZ.LIZ().ir2().LIZJ();
                if (interfaceC1648870t0fLIZJ2 != null) {
                    interfaceC1648870t0fLIZJ2.setUploadVisibility(8);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("account");
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser != null) {
                    secUid = currentUser.getSecUid();
                }
                sbLIZ.append(secUid);
                ((Keva) this.LIZ.LLILZLL.getValue()).storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                C1648320szm c1648320szm2 = this.LIZ;
                C2253081DGo c2253081DGoIU1 = ((InterfaceC1650230t2r) c1648320szm2.LLJ.getValue(c1648320szm2, interfaceC2217461BqaArr[3])).IU1();
                this.LIZ.LLILZIL.getValue().getClass();
                c2253081DGoIU1.LIZLLL(EnumC545560LaU.NON_COVER_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_SWITCH_TO_TAB_OTHER, EnumC1641610sox.USER_OPERATION));
                if (!Intrinsics.LJFF(this.LIZ.LIZIZ().creativeModel.initialModel.dmCameraModel.enterDM, "group_shot")) {
                    this.LIZ.LIZIZ().creativeModel.initialModel.dmCameraModel.enterMethodType = "group_shot_initiate_dm_camera";
                }
                InterfaceC1648330szn interfaceC1648330sznLIZJ = this.LIZ.LIZ().eU0().LIZJ();
                if (interfaceC1648330sznLIZJ != null) {
                    interfaceC1648330sznLIZJ.Vi2(false);
                }
                InterfaceC1648240sze interfaceC1648240szeLIZJ = this.LIZ.LIZ().Ch1().LIZJ();
                if (interfaceC1648240szeLIZJ != null) {
                    interfaceC1648240szeLIZJ.Mp1();
                }
                C1648320szm c1648320szm3 = this.LIZ;
                ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                c1648320szm3.getClass();
                DMCameraModel dMCameraModel = shortVideoContextLIZLLL.creativeModel.initialModel.dmCameraModel;
                InterfaceC911720Zpi interfaceC911720ZpiLIZLLL = C912070ZqH.LIZIZ.LJIIIIZZ().LIZLLL();
                String str = dMCameraModel.sessionID;
                int i = dMCameraModel.chatType;
                String str2 = dMCameraModel.enterDM;
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC911720ZpiLIZLLL.LIZ(i, str, str2, "click_tab");
                int i2 = c1648320szm3.LLJILLL;
                if (i2 < 2) {
                    c1648320szm3.LLJILLL = i2 + 1;
                    return true;
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("tab_name", "playground");
                c0lab.LJ("enter_dm", dMCameraModel.enterDM);
                String str3 = dMCameraModel.enterMethodType;
                if (str3 != null) {
                    c0lab.LJ("enter_dm_type", str3);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("playground_");
                    sbLIZ2.append(dMCameraModel.enterDM);
                    c0lab.LJ("enter_dm_type", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C20684815ws.LJIILLIIL("click_dm_camera_tab", c0lab.LIZ);
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                String secUid;
                InterfaceC1648240sze interfaceC1648240szeLIZJ;
                C1648320szm c1648320szm = this.LIZ;
                C1664740tQG c1664740tQG = c1648320szm.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648320szm.LLJJ;
                InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) c1664740tQG.getValue(c1648320szm, interfaceC2217461BqaArr[5]);
                if (interfaceC1649820t2C != null) {
                    interfaceC1649820t2C.W9(true);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("account");
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser != null) {
                    secUid = currentUser.getSecUid();
                } else {
                    secUid = null;
                }
                sbLIZ.append(secUid);
                ((Keva) this.LIZ.LLILZLL.getValue()).storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                InterfaceC1648330szn interfaceC1648330sznLIZJ = this.LIZ.LIZ().eU0().LIZJ();
                if (interfaceC1648330sznLIZJ != null) {
                    interfaceC1648330sznLIZJ.Vi2(true);
                }
                this.LIZ.LLJILLL = 2;
                if ((Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.NEW_BOTTOM_DM_CAMERA.getTag()) || Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO.getTag()) || Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO.getTag())) && (interfaceC1648240szeLIZJ = this.LIZ.LIZ().Ch1().LIZJ()) != null) {
                    interfaceC1648240szeLIZJ.Pd1();
                }
                C1648320szm c1648320szm2 = this.LIZ;
                C2253081DGo c2253081DGoIU1 = ((InterfaceC1650230t2r) c1648320szm2.LLJ.getValue(c1648320szm2, interfaceC2217461BqaArr[3])).IU1();
                this.LIZ.LLILZIL.getValue().getClass();
                c2253081DGoIU1.LIZIZ(EnumC545560LaU.NON_COVER_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_SWITCH_BOTTOM_TAB, EnumC2249681D3m.SHOOT), Boolean.FALSE);
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        ((InterfaceC1648570t0B) this.LLJIJIL.getValue(this, LLJJ[4])).KA0(C0LF1.class, new C579550MoD(this.LLJI, (C19EG) this.LL.LJII(C19EG.class, null), (e0) this.LL.LJII(e0.class, null), (C1656050tCF) this.LL.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LL.LJII(C580090Mp5.class, null), (q) this.LL.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LL.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LL.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LL.LJIIL(null, C1647410syJ.class), this.LL));
        C2497109qT.LIZ.getClass();
        C2497109qT.LIZIZ();
    }

    public C1648320szm(C1DRG c1drg, boolean z, boolean z2) {
        this.LL = c1drg;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJI = (k) c1drg.LJIIL(null, k.class);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1646140swG.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJILLL = 2;
    }
}
