package X;

import Y.ACallableS1S1112000_22;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453730nvv extends AbstractC2255721DQs<InterfaceC1456450o0J> implements InterfaceC1456450o0J, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LL;
    public final InterfaceC1456450o0J LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC23230098i.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2180241AUk.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1419190n2D.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC1453750nvx.class, null);

    @Override // X.InterfaceC1456450o0J, X.InterfaceC1455160nyE
    public void LLJL() {
        pd1(true, true, false);
    }

    @Override // X.InterfaceC1456450o0J, X.InterfaceC1455160nyE
    public void t3() {
        o2(false);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453730nvv.class, "editGlobalLoadingApi", "getEditGlobalLoadingApi()Lcom/ss/android/ugc/gamora/editor/flow/EditGlobalLoadingApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1453730nvv.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1453730nvv.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1453730nvv.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1453730nvv.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1453730nvv.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1453730nvv.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1453730nvv.class, "editNavApi", "getEditNavApi()Lcom/ss/android/ugc/gamora/editor/nav/EditNavigationApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1453730nvv.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1453730nvv.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1453730nvv.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1453730nvv.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1453730nvv.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1453730nvv.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1453730nvv.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1453730nvv.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C1453730nvv.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17};
    }

    private final InterfaceC2180241AUk B3() {
        return (InterfaceC2180241AUk) this.LLJI.getValue(this, LLJJIJIL[7]);
    }

    private final InterfaceC1451520nsM E3() {
        return (InterfaceC1451520nsM) this.LLJIJIL.getValue(this, LLJJIJIL[8]);
    }

    private final AbstractC1453750nvx H3() {
        return (AbstractC1453750nvx) this.LLJJIJIIJIL.getValue(this, LLJJIJIL[16]);
    }

    private final boolean K4() {
        return !(((IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null)) != null ? Intrinsics.LJFF(r0.LJIILJJIL(), Boolean.FALSE) : false);
    }

    private final InterfaceC1461350o8D O3() {
        return (InterfaceC1461350o8D) this.LLJILJILJ.getValue(this, LLJJIJIL[10]);
    }

    private final void O4() {
        C1453500nvY c1453500nvY = C1453500nvY.LIZ;
        String creationId = o4().getCreationId();
        String strLIZJ = C1429680nJ8.LIZJ(o4().creativeModel.musicBuzModel);
        c1453500nvY.getClass();
        C1453500nvY.LIZ("video_shoot_page", creationId, strLIZJ, "trim_click_done");
    }

    private final InterfaceC1455850nzL T2() {
        return (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJJIJIL[4]);
    }

    private final void T4() {
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService != null) {
            iMusicService.LJJI();
        }
    }

    private final InterfaceC1419190n2D W2() {
        return (InterfaceC1419190n2D) this.LLJILLL.getValue(this, LLJJIJIL[11]);
    }

    private final InterfaceC1453760nvy c3() {
        return (InterfaceC1453760nvy) this.LLJILJIL.getValue(this, LLJJIJIL[9]);
    }

    private final InterfaceC1455500nym m3() {
        return (InterfaceC1455500nym) this.LLIZLLLIL.getValue(this, LLJJIJIL[5]);
    }

    private final InterfaceC1453200nv4 v3() {
        return (InterfaceC1453200nv4) this.LLILZLL.getValue(this, LLJJIJIL[3]);
    }

    public final AbstractC214814194y F4() {
        return (AbstractC214814194y) this.LLJJIII.getValue(this, LLJJIJIL[14]);
    }

    public final C0LAB G2() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", o4().getCreationId());
        if (!TextUtils.isEmpty(o4().getNewDraftId())) {
            c0lab.LJ("new_draft_id", o4().getNewDraftId());
        }
        return c0lab;
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJJIJIL[1]);
    }

    public final InterfaceC1455610nyx Q3() {
        return (InterfaceC1455610nyx) this.LLJ.getValue(this, LLJJIJIL[6]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJ.getValue(this, LLJJIJIL[12]);
    }

    public final InterfaceC1457250o1b i3() {
        return (InterfaceC1457250o1b) this.LLILZIL.getValue(this, LLJJIJIL[2]);
    }

    public final VideoPublishEditModel o4() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJJIJIL[13]);
    }

    public final InterfaceC23230098i q3() {
        return (InterfaceC23230098i) this.LLILLL.getValue(this, LLJJIJIL[0]);
    }

    public final InterfaceC1454960nxu z4() {
        return (InterfaceC1454960nxu) this.LLJJIJI.getValue(this, LLJJIJIL[15]);
    }

    private final InterfaceC1444170ngV H4() {
        return H3().LLLLLJIL();
    }

    private final void U1() {
        InterfaceC1453200nv4 interfaceC1453200nv4V3 = v3();
        if (interfaceC1453200nv4V3 != null) {
            interfaceC1453200nv4V3.U1();
        }
    }

    private final void w2() {
        if (o4().isStickPointMode()) {
            if (o4().mIsFromDraft) {
                return;
            }
            C19EG activity = getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131848918);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 2051, creativeToastBuilder);
            return;
        }
        InterfaceC1444170ngV interfaceC1444170ngVH4 = H4();
        if (interfaceC1444170ngVH4 != null) {
            interfaceC1444170ngVH4.LJJJJLL();
        }
        InterfaceC1455610nyx interfaceC1455610nyxQ3 = Q3();
        if (interfaceC1455610nyxQ3 != null) {
            interfaceC1455610nyxQ3.bo();
        }
        JY0().vW1().setValue(C1452730nuJ.LIZJ());
        B3().jn0(true);
        z4().cr();
        C1403470mcr.LJFF(o4());
    }

    public final boolean X1() {
        InterfaceC1444170ngV interfaceC1444170ngVH4;
        if (o4().getTimeEffect() == null && C0IKQ.LIZ(o4().getEffectList()) && !o4().hasInfoStickers() && ((interfaceC1444170ngVH4 = H4()) == null || !interfaceC1444170ngVH4.C1())) {
            return false;
        }
        InterfaceC1444170ngV interfaceC1444170ngVH42 = H4();
        if (interfaceC1444170ngVH42 != null) {
            interfaceC1444170ngVH42.LJJJJIZL(null);
        }
        InterfaceC1444170ngV interfaceC1444170ngVH43 = H4();
        if (interfaceC1444170ngVH43 != null) {
            interfaceC1444170ngVH43.LJJIIZ();
        }
        InterfaceC1455500nym interfaceC1455500nymM3 = m3();
        if (interfaceC1455500nymM3 != null) {
            interfaceC1455500nymM3.YI();
        }
        return true;
    }

    public final InterfaceC1461650o8h e4() {
        return T2().Iz2().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (o4().mIsFromDraft) {
            boolean z = (C0CHQ.LIZ().getAccountService().LIZ() || o4().isDuet() || o4().isStitchMode() || o4().isStickPointMode() || C570830Ma9.LJFF(o4())) ? false : true;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(o4().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null || !z) {
                return;
            }
            o4();
            C570830Ma9.LJII(aVMusicExtractAVMusic.getMergedMusicList(), new AwS388S0200000_22(this, aVMusicExtractAVMusic, 120));
        }
    }

    public InterfaceC1456450o0J H2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1453730nvv(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void P4(String str) {
        InterfaceC1461350o8D interfaceC1461350o8DO3;
        C0EZ1 c0ez1WM2;
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && (interfaceC1461350o8DO3 = O3()) != null && (c0ez1WM2 = interfaceC1461350o8DO3.WM2()) != null) {
            c0ez1WM2.B1(str, EnumC356070Dxd.DONE);
        }
    }

    private final void Z4(boolean z) {
        InterfaceC1453200nv4 interfaceC1453200nv4V3 = v3();
        if (interfaceC1453200nv4V3 != null) {
            interfaceC1453200nv4V3.LJJ(z);
        }
    }

    private final void o2(boolean z) {
        boolean z2;
        InterfaceC1460000o62 interfaceC1460000o62;
        boolean z3 = true;
        if (o4().isStickPointMode()) {
            if (!o4().mIsFromDraft) {
                C19EG activity = getActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131848918);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 2051, creativeToastBuilder);
                return;
            }
            return;
        }
        InterfaceC1455610nyx interfaceC1455610nyxQ3 = Q3();
        if ((interfaceC1455610nyxQ3 instanceof InterfaceC1460000o62) && (interfaceC1460000o62 = (InterfaceC1460000o62) interfaceC1455610nyxQ3) != null) {
            interfaceC1460000o62.wv(1, false);
        }
        C1403010mc7.LIZ.getMusicService().Tk();
        if (C0BWI.LIZ() && !K4()) {
            O4();
            U1();
            T4();
        } else {
            Z4(z);
            C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(o4().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isMvThemeMusic()) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1454960nxu interfaceC1454960nxuZ4 = z4();
        if (!C570830Ma9.LIZIZ(o4()) || z2) {
            z3 = false;
        }
        interfaceC1454960nxuZ4.eg(z3);
    }

    public final void W1(String str) {
        if (!o4().isDuet() && !o4().isStitchMode() && !C1444940nhk.LJIIJ(o4().getCanvasVideoData())) {
            if (!((Keva) C879460Yem.LIZIZ.getValue()).getBoolean(o4().getCreationId(), true)) {
                C879450Yel.LIZIZ(o4(), true);
                C879450Yel.LIZJ(o4());
                C0CHQ.LIZ().LJIJJ().LJFF(getActivity(), new AwS171S1100000_22(this, str, 10));
                C20684815ws.LJIILLIIL("show_audio_clear_popup", G2().LIZ);
                return;
            }
            if (C879450Yel.LIZ(o4())) {
                return;
            }
            C879450Yel.LIZLLL(o4(), true);
            C879450Yel.LIZJ(o4());
            InterfaceC1455610nyx interfaceC1455610nyxQ3 = Q3();
            if (interfaceC1455610nyxQ3 == null) {
                return;
            }
            interfaceC1455610nyxQ3.Ws(1);
        }
    }

    public final void Z1(String str) {
        ImageAlbumData imageAlbumData;
        if (C297670Bld.LIZ() && C1428470nHB.LJJZZI(o4()) && (imageAlbumData = o4().getImageAlbumData()) != null && imageAlbumData.isTempImageMode()) {
            InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
            if (publishService.LJJL() || publishService.LJIL()) {
                publishService.LJJLL(o4(), "cancel_no_permission_music");
            }
        }
        C1452640nuA.LIZIZ = str;
        C1452640nuA.LJII(null, false, o4().creativeModel.musicBuzModel);
        z4().lr(true);
        z4().Yq(str);
        Workspace workspace = o4().getWorkspace();
        if (workspace != null) {
            workspace.wQ();
        }
    }

    public final void d5(String str) {
        int i;
        C19EG activity = getActivity();
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(F4());
        if (interfaceC20597015iiLJ != null && !C0CHQ.LIZ().LJIJJ().LJIILIIL(interfaceC20597015iiLJ.LC())) {
            return;
        }
        if (C298210BmV.LIZ()) {
            i = 2131848630;
        } else {
            i = 2131832443;
        }
        C1453460nvU c1453460nvU = C1453460nvU.LIZ;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 654);
        AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(this, 655);
        c1453460nvU.getClass();
        C1453460nvU.LIZ(activity, 2131832444, i, awS566S0100000_22, awS566S0100000_222);
        P4(str);
    }

    @Override // X.InterfaceC1456450o0J
    public void pd1(boolean z, boolean z2, boolean z3) {
        boolean z4;
        InterfaceC1453760nvy interfaceC1453760nvyC3;
        InterfaceC1453760nvy interfaceC1453760nvyC32;
        E3().LLJL();
        InterfaceC1419190n2D interfaceC1419190n2DW2 = W2();
        if (interfaceC1419190n2DW2 != null) {
            interfaceC1419190n2DW2.Uu2();
        }
        C524780Ki4.LIZ.start(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "start_choose_music");
        ICommerceToolsMissionService iCommerceToolsMissionService = (ICommerceToolsMissionService) PluggableExtentionKt.pluggableSpi$default(ICommerceToolsMissionService.class, false, false, false, 14, null);
        if (iCommerceToolsMissionService != null) {
            iCommerceToolsMissionService.LJIILL(getActivity(), o4());
        }
        InterfaceC1453760nvy interfaceC1453760nvyC33 = c3();
        if (interfaceC1453760nvyC33 != null && interfaceC1453760nvyC33.d20() && (interfaceC1453760nvyC32 = c3()) != null) {
            interfaceC1453760nvyC32.tB();
        }
        if (C362370EIp.LIZJ(o4()) && !C290480Ba2.LIZ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (C0C1H.LIZ() != 1 && z && !C290480Ba2.LIZ() && (interfaceC1453760nvyC3 = c3()) != null && interfaceC1453760nvyC3.KB2("video_edit_page", "click_add_sound", z4, null, new AwS566S0100000_22(this, 653))) {
            return;
        }
        C1443030nef.LJII().LJI = C857680Xkk.LIZIZ(o4());
        if (C0MT6.LIZIZ()) {
            C1403470mcr.LJII(o4(), "ai_panel", 26);
            o2(z2);
        } else if (H3().LLLLLJLJLL()) {
            H3().LLLLLLL(false);
        } else {
            C1403470mcr.LJII(o4(), null, 30);
            w2();
        }
    }

    @Override // X.InterfaceC1456450o0J, X.InterfaceC1455160nyE
    public void Q4(final String str, final int i, int i2, final int i3, final boolean z) {
        q3().Ip2(1115);
        ACallableS1S1112000_22 aCallableS1S1112000_22 = new ACallableS1S1112000_22(i, i2, this, str, z, 0);
        ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
        C15O7.LIZIZ(aCallableS1S1112000_22, executorC2206508kh, null).LJ(new InterfaceC2385309Wh<Pair<Integer, AVMusicWaveBean>, Unit>() { // from class: X.0nvw
            @Override // X.InterfaceC2385309Wh
            public final Unit then(C15O7<Pair<Integer, AVMusicWaveBean>> c15o7) {
                Object obj;
                int duration;
                InterfaceC1457250o1b interfaceC1457250o1bI3;
                C1C7U.LIZ("EditMusicControlComponent@1121.onMvMusicChanged$1");
                this.q3().AN(1115);
                if (c15o7 != null) {
                    Pair<Integer, AVMusicWaveBean> pairLJIIL = c15o7.LJIIL();
                    if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && pairLJIIL != null && (obj = pairLJIIL.first) != null && ((Number) obj).intValue() >= 0) {
                        if (this.X1()) {
                            C19EG activity = this.getActivity();
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.message(this.getActivity().getString(2131837859));
                            C1390380mHk.LIZ(activity, 1051, creativeToastBuilder);
                        }
                        if (this.JY0().g().getValue() != null) {
                            InterfaceC1452170ntP value = this.JY0().g().getValue();
                            int iMo51if = 0;
                            if (value != null) {
                                duration = value.getDuration();
                            } else {
                                duration = 0;
                            }
                            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.o4().creativeModel.musicBuzModel);
                            if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getShootDuration() > 0) {
                                int iLIZIZ = C141Q.LIZIZ(this.o4().getCurMusicServerLength(), str);
                                if (Math.abs(iLIZIZ - aVMusicExtractAVMusic.getShootDuration()) >= 1000) {
                                    InterfaceC1457250o1b interfaceC1457250o1bI32 = this.i3();
                                    if (interfaceC1457250o1bI32 != null) {
                                        interfaceC1457250o1bI32.LLLL(Math.min(duration, aVMusicExtractAVMusic.getShootDuration()));
                                    }
                                } else {
                                    InterfaceC1457250o1b interfaceC1457250o1bI33 = this.i3();
                                    if (interfaceC1457250o1bI33 != null) {
                                        interfaceC1457250o1bI33.LLLL(Math.min(duration, iLIZIZ));
                                    }
                                }
                            } else {
                                InterfaceC1457250o1b interfaceC1457250o1bI34 = this.i3();
                                if (interfaceC1457250o1bI34 != null) {
                                    interfaceC1457250o1bI34.LLLL(duration);
                                }
                            }
                            if (z && (interfaceC1457250o1bI3 = this.i3()) != null) {
                                interfaceC1457250o1bI3.yl1(null, str, i3, i, null);
                            }
                            if (C545820Lau.LIZIZ(this.F4()) != null) {
                                ((EditEffectVideoModel) C1659630tI1.LJIIIIZZ(this.F4(), null, null, 6).get(EditEffectVideoModel.class)).DQ2().setValue(Integer.valueOf(duration));
                            }
                            this.o4().setVideoLength(duration);
                            InterfaceC1452170ntP value2 = this.JY0().g().getValue();
                            if (value2 != null) {
                                iMo51if = value2.mo51if();
                            }
                            InterfaceC1461650o8h interfaceC1461650o8hE4 = this.e4();
                            if (interfaceC1461650o8hE4 != null) {
                                interfaceC1461650o8hE4.l0(new kotlin.Pair<>(Integer.valueOf(iMo51if), Integer.valueOf(duration)));
                            }
                            if (this.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                                MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = this.JY0().vW1();
                                mutableLiveDataVW1.setValue(C1452730nuJ.LIZLLL(i));
                                mutableLiveDataVW1.setValue(C1452730nuJ.LIZ());
                            }
                            if (!C1430550nKX.LIZIZ(this.o4())) {
                                this.z4().eg(C570830Ma9.LIZ(this.o4().getCurMusicServerLength(), this.o4(), str));
                            }
                            C1453000nuk value3 = this.JY0().gq1().getValue();
                            if (value3 != null) {
                                this.JY0().pn2(value3);
                            }
                        }
                    } else {
                        C19EG activity2 = this.getActivity();
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.message(this.getActivity().getString(2131837858));
                        C1390380mHk.LIZ(activity2, 1051, creativeToastBuilder2);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditMusicControlComponent@1121.onMvMusicChanged$1");
                return unit;
            }
        }, executorC2206508kh, null);
    }
}
