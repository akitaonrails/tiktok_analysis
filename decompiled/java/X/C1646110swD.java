package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0swD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646110swD extends AbstractC2255721DQs<InterfaceC1646030sw5> implements InterfaceC1646030sw5, InterfaceC379610EuV {
    public static final C1646130swF LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final boolean LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646220swO.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1646140swG.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final C1170020gYK LLJIJIL = new C1170020gYK(new AwS604S0100000_25(this, 288));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2266));

    public C1646110swD Z1() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0swF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646110swD.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1646110swD.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0), new C2217381BqS(C1646110swD.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1646110swD.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1646110swD.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1646110swD.class, "tnsNoticeComponent", "getTnsNoticeComponent()Lcom/ss/android/ugc/gamora/recorder/tnsnotice/TnSNoticeApiComponent;", 0), new C2217381BqS(C1646110swD.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1646110swD.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLJILLL = new Object() { // from class: X.0swF
        };
        LLJJI = 8;
    }

    private final InterfaceC1646140swG H2() {
        return (InterfaceC1646140swG) this.LLJ.getValue(this, LLJJ[5]);
    }

    private final InterfaceC1646220swO Kp() {
        return (InterfaceC1646220swO) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLIZLLLIL.getValue(this, LLJJ[4]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJJ[2]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZ.getValue(this, LLJJ[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJ[3]);
    }

    private final q getStickerApi() {
        return (q) this.LLJILJIL.getValue(this, LLJJ[7]);
    }

    public final C1167170gTj G2() {
        return (C1167170gTj) this.LLJILJILJ.getValue();
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJI.getValue(this, LLJJ[6]);
    }

    private final InterfaceC1648870t0f o2() {
        return getRecordAdapterApi().ir2().LIZJ();
    }

    private final C0MGL w2() {
        return getRecordAdapterApi().Vt2().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(R.id.j8c, G2(), "DMGroupShotTemplateScene");
        X1(this.LLILLJJLI.requireSceneContext());
        InterfaceC1648870t0f interfaceC1648870t0fO2 = o2();
        if (interfaceC1648870t0fO2 != null) {
            interfaceC1648870t0fO2.setUploadVisibility(8);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    private final void X1(Context context) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1167260gTs(this, context, null), 3);
    }

    public final void T2(String str) {
        InterfaceC1646220swO interfaceC1646220swOKp;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        DMCameraModel dMCameraModel = getShortVideoContext().creativeModel.initialModel.dmCameraModel;
        EnumC1448590nnd enumC1448590nndLIZJ = null;
        dMCameraModel.groupShotData = new GroupShotDataModel(Collections.singletonList(dMCameraModel.sessionID), false, str, null, null, 16, null);
        this.LLILLJJLI.hide(G2());
        InterfaceC1648870t0f interfaceC1648870t0fO2 = o2();
        if (interfaceC1648870t0fO2 != null) {
            interfaceC1648870t0fO2.showDockBar(true);
            interfaceC1648870t0fO2.setUploadVisibility(0);
            interfaceC1648870t0fO2.setEffectContainerVisibility(8);
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        interfaceC1648020szIOp.showBottomTab(false);
        interfaceC1648020szIOp.updateDotVisibility(false);
        H2().Sn1(2131830880, -1L);
        C2253081DGo c2253081DGoIU1 = getCameraApiComponent().IU1();
        EnumC545560LaU enumC545560LaU = EnumC545560LaU.NON_COVER_SCENE;
        C1DPV c1dpv = C1DPV.LIZIZ;
        c2253081DGoIU1.LIZIZ(enumC545560LaU, c1dpv.LIZIZ(C1DPW.OPEN_CAMERA_SWITCH_BOTTOM_TAB, EnumC2249681D3m.SHOOT), Boolean.FALSE);
        InterfaceC1646220swO interfaceC1646220swOKp2 = Kp();
        if (interfaceC1646220swOKp2 != null && (c385670FAfDk = interfaceC1646220swOKp2.dk()) != null) {
            enumC1448590nndLIZJ = c385670FAfDk.LIZJ();
        }
        EnumC1448590nnd enumC1448590nnd = EnumC1448590nnd.RATIO_9_16;
        if (enumC1448590nndLIZJ != enumC1448590nnd && (interfaceC1646220swOKp = Kp()) != null) {
            int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, enumC1448590nnd, false);
            EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.DM_GROUP_SHOT;
            interfaceC1646220swOKp.uF2(iLJFF, enumC1647570syZ.getTag(), enumC1647570syZ.getTag(), EnumC2008807tu.TAB_CHANGED);
        }
        q stickerApi = getStickerApi();
        if (stickerApi != null) {
            stickerApi.U72();
        }
        if (getCameraApiComponent().LJLJJLL() == 0) {
            getCameraApiComponent().AF2(false);
            getCameraApiComponent().Cd(false, c1dpv.LIZIZ(C1DPW.OPEN_CAMERA_GROUP_SHOT, null), "group_shot");
        }
    }

    public final void yp0(String str, long j) {
        C0MGL c0mglW2 = w2();
        if (c0mglW2 != null) {
            c0mglW2.Xp1(str, j);
        }
    }

    public C1646110swD(boolean z, C19A3 c19a3, C1DRG c1drg) {
        this.LL = z;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
    }
}
