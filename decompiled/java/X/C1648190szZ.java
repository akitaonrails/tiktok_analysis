package X;

import a6n.a;
import android.view.MotionEvent;
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
import lth.o;
import mn3.e0;

/* JADX INFO: renamed from: X.0szZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648190szZ implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final k LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C1664750tQH LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public int LLJJJIL;
    public final C1630690sXL LLJJJJ;
    public final C1648230szd LLJJJJJIL;
    public String LLILZIL = "photo_swap_ping";
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1189));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(603));
    public final C01GW LLJJIJIIJIL = C1449630npJ.LIZ(this, C1650260t2u.class);

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648190szZ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648190szZ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648190szZ.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648190szZ.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1648190szZ.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1648190szZ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1648190szZ.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1648190szZ.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1648190szZ.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1648190szZ.class, "tnsNoticeComponent", "getTnsNoticeComponent()Lcom/ss/android/ugc/gamora/recorder/tnsnotice/TnSNoticeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1648190szZ.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1648190szZ.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
    }

    public final InterfaceC1650230t2r LIZ() {
        return (InterfaceC1650230t2r) this.LLIZLLLIL.getValue(this, LLJJJJLIIL[0]);
    }

    public final InterfaceC1647420syK LIZIZ() {
        return (InterfaceC1647420syK) this.LLJI.getValue(this, LLJJJJLIIL[2]);
    }

    public final ShortVideoContext LIZJ() {
        return (ShortVideoContext) this.LLJ.getValue(this, LLJJJJLIIL[1]);
    }

    public final q LIZLLL() {
        return (q) this.LLJILJILJ.getValue(this, LLJJJJLIIL[5]);
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        int nameResId;
        String strLIZ;
        if (!this.LLILZ) {
            strLIZ = " ";
        } else {
            if (this.LLILLL) {
                nameResId = 2131832159;
            } else {
                nameResId = EnumC1647570syZ.PHOTO_SWAP.getNameResId();
            }
            strLIZ = C0MTD.LIZ(nameResId);
        }
        return new C1653330t7r(strLIZ, EnumC1647570syZ.PHOTO_SWAP.getTag(), "quick_photo", this.LLILLJJLI, new InterfaceC1653360t7u() { // from class: X.0sza
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1630630sXF interfaceC1630630sXF;
                Object obj;
                String str;
                String str2 = this.LIZ.LIZJ().creativeModel.initialModel.dmCameraModel.photoSwapScene;
                if (str2 != null) {
                    this.LIZ.LLILZIL = str2;
                } else {
                    C1648190szZ c1648190szZ = this.LIZ;
                    c1648190szZ.LIZJ().creativeModel.initialModel.dmCameraModel.photoSwapScene = c1648190szZ.LLILZIL;
                }
                C1648190szZ c1648190szZ2 = this.LIZ;
                ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                int i = c1648190szZ2.LLJJJIL;
                if (i < 2) {
                    c1648190szZ2.LLJJJIL = i + 1;
                } else {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("tab_name", "photoswap");
                    DMCameraModel dMCameraModel = shortVideoContextLIZLLL.creativeModel.initialModel.dmCameraModel;
                    c0lab.LJ("enter_dm", dMCameraModel.enterDM);
                    String str3 = dMCameraModel.enterMethodType;
                    if (str3 != null) {
                        c0lab.LJ("enter_dm_type", str3);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("photoswap_");
                        sbLIZ.append(dMCameraModel.enterDM);
                        c0lab.LJ("enter_dm_type", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C20684815ws.LJIILLIIL("click_dm_camera_tab", c0lab.LIZ);
                }
                this.LIZ.LIZJ().shootMode = 26;
                C1648190szZ c1648190szZ3 = this.LIZ;
                C1664740tQG c1664740tQG = c1648190szZ3.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648190szZ.LLJJJJLIIL;
                InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1664740tQG.getValue(c1648190szZ3, interfaceC2217461BqaArr[4]);
                String secUid = null;
                if (interfaceC1646220swO != null) {
                    int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_1_1, false);
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
                C1447470nlp.LIZIZ(this.LIZ.LIZ().fF2(), C11VU.LIZ(12.0f));
                com.ss.android.ugc.aweme.shortvideo.component.a aVarLIZJ = this.LIZ.LIZIZ().pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.eP2(true);
                }
                C1648190szZ c1648190szZ4 = this.LIZ;
                if (C1631200sYA.LIZ((C1631190sY9) c1648190szZ4.LLJJIII.getValue(c1648190szZ4, interfaceC2217461BqaArr[8]))) {
                    ((C0ETY) this.LIZ.LL.LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS265S0000000_25(23));
                } else {
                    InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) this.LIZ.LL.LJII(InterfaceC1649820t2C.class, null);
                    if ((interfaceC1649820t2C instanceof InterfaceC1630630sXF) && (interfaceC1630630sXF = (InterfaceC1630630sXF) interfaceC1649820t2C) != null) {
                        interfaceC1630630sXF.LZ1(EnumC1648530t07.DEFAULT);
                    }
                }
                InterfaceC1648240sze interfaceC1648240szeLIZJ = this.LIZ.LIZIZ().Ch1().LIZJ();
                if (interfaceC1648240szeLIZJ != null) {
                    interfaceC1648240szeLIZJ.Mp1();
                }
                InterfaceC1651080t4E interfaceC1651080t4ELIZJ = this.LIZ.LIZIZ().I42().LIZJ();
                if (interfaceC1651080t4ELIZJ != null) {
                    interfaceC1651080t4ELIZJ.Ee2();
                }
                C1648190szZ c1648190szZ5 = this.LIZ;
                boolean z = c1646490swp.LIZ;
                c1648190szZ5.getClass();
                C1648150szV c1648150szV = new C1648150szV(true);
                c1648150szV.LIZLLL = z;
                c1648150szV.LIZJ = 2;
                ((InterfaceC1648020szI) c1648190szZ5.LLJIJIL.getValue(c1648190szZ5, interfaceC2217461BqaArr[3])).configSwitchDuration(c1648150szV);
                this.LIZ.LIZJ().cameraComponentModel.mVideoHeight = this.LIZ.LIZJ().cameraComponentModel.mVideoWidth;
                InterfaceC1648250szf interfaceC1648250szfLIZJ = this.LIZ.LIZIZ().MK().LIZJ();
                if (interfaceC1648250szfLIZJ != null) {
                    interfaceC1648250szfLIZJ.nT0(false);
                }
                if (!this.LIZ.LIZJ().creativeModel.initialModel.dmCameraModel.shouldDisplayRestrictSharingNoticeShooting) {
                    C1648190szZ c1648190szZ6 = this.LIZ;
                    InterfaceC1646140swG interfaceC1646140swG = (InterfaceC1646140swG) c1648190szZ6.LLJJIJI.getValue(c1648190szZ6, interfaceC2217461BqaArr[9]);
                    if (interfaceC1646140swG != null) {
                        interfaceC1646140swG.hide();
                    }
                }
                ((C1650260t2u) this.LIZ.LLJJIJIIJIL.getValue()).S60(this.LIZ.LLJJJJJIL);
                C1648190szZ c1648190szZ7 = this.LIZ;
                if (C1622090sJT.LIZ((C1645380sv2) c1648190szZ7.LLJJJ.getValue(c1648190szZ7, interfaceC2217461BqaArr[11]))) {
                    InterfaceC1644770su3 interfaceC1644770su3LIZJ = this.LIZ.LIZIZ().tn2().LIZJ();
                    if (interfaceC1644770su3LIZJ != null) {
                        interfaceC1644770su3LIZJ.nI1();
                    }
                } else {
                    C1648190szZ c1648190szZ8 = this.LIZ;
                    ((InterfaceC1644770su3) c1648190szZ8.LLJJIJIL.getValue(c1648190szZ8, interfaceC2217461BqaArr[10])).nI1();
                }
                q qVarLIZLLL = this.LIZ.LIZLLL();
                if (qVarLIZLLL != null) {
                    qVarLIZLLL.vY(this.LIZ.LLJJJJ);
                }
                q qVarLIZLLL2 = this.LIZ.LIZLLL();
                if (qVarLIZLLL2 != null) {
                    qVarLIZLLL2.fP();
                }
                q qVarLIZLLL3 = this.LIZ.LIZLLL();
                if (qVarLIZLLL3 != null) {
                    qVarLIZLLL3.Lx0();
                }
                C1648190szZ c1648190szZ9 = this.LIZ;
                if (c1648190szZ9.LLILZ) {
                    StringBuilder sb = new StringBuilder("account");
                    C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                    if (currentUser != null) {
                        secUid = currentUser.getSecUid();
                    }
                    sb.append(secUid);
                    ((Keva) this.LIZ.LLIZ.getValue()).storeBoolean(sb.toString(), true);
                    return true;
                }
                ((InterfaceC1648020szI) c1648190szZ9.LLJIJIL.getValue(c1648190szZ9, interfaceC2217461BqaArr[3])).showBottomTab(false);
                C1648190szZ c1648190szZ10 = this.LIZ;
                ((InterfaceC1648020szI) c1648190szZ10.LLJIJIL.getValue(c1648190szZ10, interfaceC2217461BqaArr[3])).updateDotVisibility(false);
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1648240sze interfaceC1648240szeLIZJ;
                Object obj;
                String str;
                C1447470nlp.LIZIZ(this.LIZ.LIZ().fF2(), C11VU.LIZ(0.0f));
                String secUid = null;
                this.LIZ.LIZJ().creativeModel.initialModel.dmCameraModel.photoSwapScene = null;
                ShortVideoContext shortVideoContextLIZJ = this.LIZ.LIZJ();
                C1443590nfZ c1443590nfZ = o.LJIIJJI;
                c1443590nfZ.LIZ();
                shortVideoContextLIZJ.cameraComponentModel.mVideoHeight = c1443590nfZ.LIZIZ;
                C1648190szZ c1648190szZ = this.LIZ;
                C1664740tQG c1664740tQG = c1648190szZ.LLJJIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1648190szZ.LLJJJJLIIL;
                if (C1631200sYA.LIZ((C1631190sY9) c1664740tQG.getValue(c1648190szZ, interfaceC2217461BqaArr[8]))) {
                    ((C0ETY) this.LIZ.LL.LJII(C0ETY.class, null)).Sd(InterfaceC1649820t2C.class, new AwS265S0000000_25(24));
                } else {
                    C1648190szZ c1648190szZ2 = this.LIZ;
                    InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) c1648190szZ2.LLJJI.getValue(c1648190szZ2, interfaceC2217461BqaArr[7]);
                    if (interfaceC1649820t2C != null) {
                        interfaceC1649820t2C.W9(true);
                    }
                }
                if (!Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.DM_GROUP_SHOT.getTag())) {
                    C1648190szZ c1648190szZ3 = this.LIZ;
                    InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) c1648190szZ3.LLJILJIL.getValue(c1648190szZ3, interfaceC2217461BqaArr[4]);
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
                }
                ((C1650260t2u) this.LIZ.LLJJIJIIJIL.getValue()).bQ2(this.LIZ.LLJJJJJIL);
                q qVarLIZLLL = this.LIZ.LIZLLL();
                if (qVarLIZLLL != null) {
                    qVarLIZLLL.sb(this.LIZ.LLJJJJ);
                }
                q qVarLIZLLL2 = this.LIZ.LIZLLL();
                if (qVarLIZLLL2 != null) {
                    qVarLIZLLL2.N32();
                }
                q qVarLIZLLL3 = this.LIZ.LIZLLL();
                if (qVarLIZLLL3 != null) {
                    qVarLIZLLL3.Lx0();
                }
                if ((Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.NEW_BOTTOM_DM_CAMERA.getTag()) || Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO.getTag()) || Intrinsics.LJFF(c1646490swp.LJ, EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO.getTag())) && (interfaceC1648240szeLIZJ = this.LIZ.LIZIZ().Ch1().LIZJ()) != null) {
                    interfaceC1648240szeLIZJ.Pd1();
                }
                if (this.LIZ.LLILZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("account");
                    C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                    if (currentUser != null) {
                        secUid = currentUser.getSecUid();
                    }
                    sbLIZ.append(secUid);
                    ((Keva) this.LIZ.LLIZ.getValue()).storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                }
                this.LIZ.LLJJJIL = 2;
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        ((InterfaceC1648570t0B) this.LLJJ.getValue(this, LLJJJJLIIL[6])).KA0(C0LF1.class, new C579550MoD(this.LLJILLL, (C19EG) this.LL.LJII(C19EG.class, null), (e0) this.LL.LJII(e0.class, null), (C1656050tCF) this.LL.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LL.LJII(C580090Mp5.class, null), (q) this.LL.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LL.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LL.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LL.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LL.LJIIL(null, C1647410syJ.class), this.LL));
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.0sXL] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0szd] */
    public C1648190szZ(C1DRG c1drg, boolean z, boolean z2, boolean z3) {
        int i;
        this.LL = c1drg;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, q.class, null);
        this.LLJILLL = (k) c1drg.LJIIL(null, k.class);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646140swG.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1644770su3.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        this.LLJJJIL = i;
        this.LLJJJJ = new InterfaceC1622080sJS() { // from class: X.0sXL
            @Override // X.InterfaceC1622080sJS
            public final int getPriority() {
                return EnumC1641540soq.HIGH_INTERCEPT_STICKER_PRIORITY.getPriority();
            }

            @Override // X.InterfaceC1622080sJS
            public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
                return new C1623370sLX();
            }
        };
        this.LLJJJJJIL = new InterfaceC1650280t2w() { // from class: X.0szd
            @Override // X.InterfaceC1650280t2w
            public final void le(MotionEvent motionEvent) {
                this.LIZ.LIZ().fF2().getLocationInWindow(new int[2]);
                this.LIZ.LIZ().GK(motionEvent.getX() - r4[0], motionEvent.getY() - r4[1]);
            }
        };
    }
}
