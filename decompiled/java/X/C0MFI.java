package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MFI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFI extends AbstractC2255721DQs<InterfaceC1659390tHd> implements InterfaceC1659390tHd, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public Integer LLJIJIL;
    public boolean LLJILJIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C0MFK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 691));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 695));
    public final InterfaceC1659390tHd LLJILJILJ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MFI.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MFI.class, "recordTooltipComponent", "getRecordTooltipComponent()Lcom/ss/android/ugc/gamora/recorder/tooltip/RecordTooltipApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MFI.class, "cameraComponent", "getCameraComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJ = 8;
    }

    private final C0MFK G2() {
        return (C0MFK) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    private final C0MFJ H2() {
        return (C0MFJ) this.LLIZ.getValue();
    }

    private final void X1() {
        C2253081DGo c2253081DGoIU1;
        C201955140j.LIZLLL(C0L76.LIZIZ, "RecordAIAliveComponent", "clearAndCacheCameraState");
        InterfaceC1650230t2r interfaceC1650230t2rO2 = o2();
        this.LLJIJIL = interfaceC1650230t2rO2 != null ? Integer.valueOf(interfaceC1650230t2rO2.re1()) : null;
        InterfaceC1650230t2r interfaceC1650230t2rO22 = o2();
        if (interfaceC1650230t2rO22 != null) {
            interfaceC1650230t2rO22.lb1(0);
        }
        this.LLJILJIL = true;
        InterfaceC1650230t2r interfaceC1650230t2rO23 = o2();
        if (interfaceC1650230t2rO23 == null || (c2253081DGoIU1 = interfaceC1650230t2rO23.IU1()) == null) {
            return;
        }
        c2253081DGoIU1.LIZLLL(EnumC545560LaU.RECORD_LOCAL_MEDIA_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_ALBUM_OPEN_DOCK_BAR, EnumC1641610sox.PAGE_INVISIBLE));
    }

    private final void c3() {
        Context sceneContext = this.LLILLJJLI.getSceneContext();
        if (sceneContext == null) {
            return;
        }
        ShortVideoContext shortVideoContextW1 = W1();
        VideoPublishEditModel videoPublishEditModelV3 = v3(shortVideoContextW1);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "ai_live_new_prompt_model", new NewPromptPageModel(null, C0MDI.SHOOT));
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContextW1);
        C1428470nHB.LLIL(bundle, videoPublishEditModelV3);
        C0MUK.LJIIJ(bundle, videoPublishEditModelV3.creativeModel);
        C0MWH.LIZ.getClass();
        C0MWH.LIZIZ(sceneContext, bundle);
    }

    private final void i3() {
        Bundle bundle = new Bundle();
        ShortVideoContext shortVideoContextW1 = W1();
        C537520L6g.LJFF(bundle, shortVideoContextW1.creativeInfo);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContextW1);
        bundle.putBoolean("Key_enable_single_select_mode", false);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_support_flag", 25);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_choose_scene", 60);
        bundle.putInt("key_choose_request_code", 1);
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this.LLILLJJLI);
        C569760MWg c569760MWg = new C569760MWg();
        c569760MWg.LIZ = true;
        navigationSceneLIZIZ.LLLLLLLLL(MvChoosePhotoScene.class, bundle, c569760MWg.LIZ());
    }

    private final InterfaceC1650230t2r o2() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    private final C0LFN w2() {
        return (C0LFN) this.LLILZLL.getValue();
    }

    public final void T2() {
        C2253081DGo c2253081DGoIU1;
        if (this.LLJI) {
            return;
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maybeResumeCameraState ");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJILJIL);
        C201955140j.LIZLLL(c0l76, "RecordAIAliveComponent", C2188811AlT.LIZIZ(sbLIZ));
        Integer num = this.LLJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            InterfaceC1650230t2r interfaceC1650230t2rO2 = o2();
            if (interfaceC1650230t2rO2 != null) {
                interfaceC1650230t2rO2.lb1(iIntValue);
            }
            this.LLJIJIL = null;
        }
        if (this.LLJILJIL) {
            InterfaceC1650230t2r interfaceC1650230t2rO22 = o2();
            if (interfaceC1650230t2rO22 != null && (c2253081DGoIU1 = interfaceC1650230t2rO22.IU1()) != null) {
                c2253081DGoIU1.LIZIZ(EnumC545560LaU.RECORD_LOCAL_MEDIA_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_BY_ALBUM_CLOSE, null), Boolean.FALSE);
            }
            this.LLJILJIL = false;
        }
    }

    @Override // X.InterfaceC1659390tHd
    public void b2() {
        this.LLJ++;
        C0LFN c0lfnW2 = w2();
        c0lfnW2.getClass();
        C0LAB c0lab = new C0LAB();
        C0LFN.LIZ(c0lab, c0lfnW2.LIZ);
        C20684815ws.LJIILLIIL("click_ai_livephoto_entrance", c0lab.LIZ);
        X1();
        if (q3(new AwS552S0100000_8(this, 692), new AwS552S0100000_8(this, 693), new AwS552S0100000_8(this, 694))) {
            this.LLJI = true;
        } else {
            m3(this);
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    private final ShortVideoContext W1() {
        ShortVideoContext shortVideoContext = (ShortVideoContext) C571330Max.LIZ(getShortVideoContext());
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        CameraLayoutModel cameraLayoutModel = creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            cameraLayoutModel.layoutEnabled = false;
        }
        LivePhotoModel livePhotoModel = creativeModel.livePhotoModel;
        if (livePhotoModel != null) {
            livePhotoModel.enableLiveMode = false;
        }
        MusicBeanUtilKt.updateAVMusic(creativeModel.musicBuzModel, null);
        Workspace workspace = shortVideoContext.creativeModel.workspace;
        if (workspace != null) {
            workspace.wQ();
        }
        Workspace workspace2 = shortVideoContext.cameraComponentModel.mWorkspace;
        if (workspace2 != null) {
            workspace2.wQ();
        }
        return shortVideoContext;
    }

    private final void W2() {
        if (getShortVideoContext().creativeModel.aiLivePhotoModel.shootGuideType != 1) {
            return;
        }
        if (this.LLJ > 0) {
            C0M8O.LIZ.getClass();
            Keva keva = C0M8O.LIZIZ;
            keva.storeInt("RECORD_BANNER_CONSECUTIVE_CLICK", keva.getInt("RECORD_BANNER_CONSECUTIVE_CLICK", 0) + this.LLJ);
            keva.storeInt("RECORD_BANNER_CONSECUTIVE_IGNORE", 0);
        } else {
            C0M8O.LIZ.getClass();
            Keva keva2 = C0M8O.LIZIZ;
            keva2.storeInt("RECORD_BANNER_CONSECUTIVE_CLICK", 0);
            keva2.storeInt("RECORD_BANNER_CONSECUTIVE_IGNORE", keva2.getInt("RECORD_BANNER_CONSECUTIVE_IGNORE", 0) + 1);
        }
        C0M8O.LIZ.getClass();
        Keva keva3 = C0M8O.LIZIZ;
        if (keva3.getInt("RECORD_BANNER_CONSECUTIVE_CLICK", 0) >= C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_shoot_banner_click_quit_count", true)) {
            keva3.storeBoolean("RECORD_BANNER_FOREVER_QUIT", true);
        } else if (keva3.getInt("RECORD_BANNER_CONSECUTIVE_IGNORE", 0) >= C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_shoot_banner_ignore_quit_count", true)) {
            keva3.storeLong("RECORD_BANNER_TEMPORARY_QUIT_TIME_MS", System.currentTimeMillis());
            keva3.storeInt("RECORD_BANNER_CONSECUTIVE_IGNORE", 0);
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAliveBannerKeva\nbanner info = [");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("forever quit:");
        sbLIZ2.append(keva3.getBoolean("RECORD_BANNER_FOREVER_QUIT", false));
        sbLIZ2.append(",\nlast banner shown:");
        sbLIZ2.append(keva3.getLong("BANNER_SHOW_TIME_MS", 0L));
        sbLIZ2.append(",\nconsecutive click:");
        sbLIZ2.append(keva3.getInt("RECORD_BANNER_CONSECUTIVE_CLICK", 0));
        sbLIZ2.append(",\nconsecutive ignore:");
        sbLIZ2.append(keva3.getInt("RECORD_BANNER_CONSECUTIVE_IGNORE", 0));
        sbLIZ2.append(",\ntemporary quit:");
        sbLIZ2.append(keva3.getLong("RECORD_BANNER_TEMPORARY_QUIT_TIME_MS", 0L));
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(']');
        C201955140j.LJIILL(c0l76, "RecordAIAliveComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1659390tHd
    public boolean Tv2() {
        return ((Boolean) H2().LLILLJJLI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1659390tHd
    public boolean cs() {
        return ((Boolean) H2().LL.getValue()).booleanValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0MFK c0mfkG2 = G2();
        if (c0mfkG2 != null) {
            c0mfkG2.ig(H2());
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guideType=");
        int i = C0BSO.LIZ;
        sbLIZ.append(C0BSO.LIZ);
        C201955140j.LJIILL(c0l76, "RecordAIAliveComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W2();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        T2();
    }

    public InterfaceC1659390tHd Z1() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public static final void m3(C0MFI c0mfi) {
        if (C0C06.LIZ()) {
            c0mfi.c3();
            return;
        }
        C0LFN c0lfnW2 = c0mfi.w2();
        c0lfnW2.getClass();
        C0LAB c0lab = new C0LAB();
        C0LFN.LIZ(c0lab, c0lfnW2.LIZ);
        c0lab.LIZ(1, "is_alive_shoot_page_side_bar");
        C20684815ws.LJIILLIIL("click_upload_entrance", c0lab.LIZ);
        c0mfi.i3();
    }

    private final VideoPublishEditModel v3(ShortVideoContext shortVideoContext) {
        Bundle bundle = new Bundle();
        C0MUK.LJIIJ(bundle, shortVideoContext.creativeModel);
        new C1438570nXT("RecordAIAliveComponent");
        VideoPublishEditModel videoPublishEditModelLJI = C1438570nXT.LJI(bundle, null);
        videoPublishEditModelLJI.mShootWay = shortVideoContext.shootWay;
        videoPublishEditModelLJI.setShootEnterMethod(shortVideoContext.enterMethod);
        return videoPublishEditModelLJI;
    }

    @Override // X.InterfaceC1659390tHd
    public void uC1(int i) {
        if (this.LLIZLLLIL) {
            return;
        }
        C0LFN c0lfnW2 = w2();
        c0lfnW2.getClass();
        C0LAB c0lab = new C0LAB();
        C0LFN.LIZ(c0lab, c0lfnW2.LIZ);
        C20684815ws.LJIILLIIL("ai_livephoto_entrance_show", c0lab.LIZ);
        this.LLIZLLLIL = true;
        getShortVideoContext().creativeModel.aiLivePhotoModel.shootGuideType = i;
    }

    public C0MFI(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }

    private final boolean q3(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Context sceneContext = this.LLILLJJLI.getSceneContext();
        if (sceneContext == null) {
            return false;
        }
        C0M8O.LIZ.getClass();
        if (C0M8O.LIZJ()) {
            return false;
        }
        C0M8O.LJ();
        C0MES c0mes = C0MES.LIZ;
        C19A3 c19a3 = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c0mes.getClass();
        C0MES.LJFF(sceneContext, c19a3, null, shortVideoContext, "video_shoot_page", R.id.sz5, function0, function02, function03);
        return true;
    }
}
