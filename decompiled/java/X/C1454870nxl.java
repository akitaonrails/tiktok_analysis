package X;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MultiChoose;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454870nxl implements InterfaceC1454960nxu, InterfaceC379610EuV {
    public static final C0EM6 LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C19EG LL;
    public final InterfaceC1455160nyE LLILLJJLI;
    public final C1DRG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public boolean LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664740tQG LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final h0<C0LCS<C1458000o2o>> LLJJJ;
    public final h0 LLJJJIL;
    public final h0<C529150Kp7> LLJJJJ;
    public final h0 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final h0<C529150Kp7> LLJJL;
    public final h0 LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<String> LLJL;
    public final MutableLiveData LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C1664750tQH LLJLL;
    public final C560530Lyd<Unit> LLJLLIL;
    public final C560530Lyd LLJLLL;
    public final C560530Lyd<Unit> LLJZ;
    public final C560530Lyd LLJZIJLIL;
    public final C1664740tQG LLL;
    public AVMusic LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final ArrayMap<String, String> LLLI;
    public final C1664740tQG LLLII;
    public String LLLIIII;
    public final C1664740tQG LLLIIIIL;
    public final C1664740tQG LLLIIIL;
    public final C15J2 LLILZIL = new C15J2();
    public final C1466810oH1 LLJJIII = new C1466810oH1(this, 9);

    @Override // X.InterfaceC1454960nxu
    public final void Xq() {
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0EM6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1454870nxl.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1454870nxl.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1454870nxl.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C1454870nxl.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new C2217381BqS(C1454870nxl.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new C2217381BqS(C1454870nxl.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1454870nxl.class, "ftcCutMusicApi", "getFtcCutMusicApi()Lcom/ss/android/ugc/aweme/ftc/components/cutmusic/FTCEditCutMusicApi;", 0), new C2217381BqS(C1454870nxl.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1454870nxl.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0), new C2217381BqS(C1454870nxl.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new C2217381BqS(C1454870nxl.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C1454870nxl.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1454870nxl.class, "recentMusicAddApi", "getRecentMusicAddApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0), new C2217381BqS(C1454870nxl.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicControlApi;", 0), new C2217381BqS(C1454870nxl.class, "lyricStickerEffectApi", "getLyricStickerEffectApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0), new C2217381BqS(C1454870nxl.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C1454870nxl.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C1454870nxl.class, "publishButtonVisibility", "getPublishButtonVisibility()Lcom/ss/android/ugc/gamora/editor/LighteningBottomPublishButtonVisibility;", 0), new C2217381BqS(C1454870nxl.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C1454870nxl.class, "chooseMusicConfig", "getChooseMusicConfig()Lcom/ss/android/ugc/aweme/port/in/music/ChooseMusicConfig;", 0), new C2217381BqS(C1454870nxl.class, "storyEditMusicApi", "getStoryEditMusicApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditMusicApi;", 0)};
        LLLIIL = new Object() { // from class: X.0EM6
        };
    }

    public final C1457860o2a LIZLLL() {
        return (C1457860o2a) this.LLLIIIIL.getValue(this, LLLIILIL[19]);
    }

    public final InterfaceC1454950nxt LJFF() {
        return (InterfaceC1454950nxt) this.LLIZLLLIL.getValue(this, LLLIILIL[3]);
    }

    public final InterfaceC559500Lwy LJI() {
        return (InterfaceC559500Lwy) this.LLJJI.getValue(this, LLLIILIL[10]);
    }

    public final InterfaceC1457250o1b LJII() {
        return (InterfaceC1457250o1b) this.LLJ.getValue(this, LLLIILIL[4]);
    }

    public final InterfaceC1453200nv4 LJIIIIZZ() {
        return (InterfaceC1453200nv4) this.LLJJIII.getValue(this, LLLIILIL[11]);
    }

    public final InterfaceC1455860nzM LJIIIZ() {
        return (InterfaceC1455860nzM) this.LLJILJIL.getValue(this, LLLIILIL[7]);
    }

    public final InterfaceC1460000o62 LJIIJ() {
        return (InterfaceC1460000o62) this.LLILZLL.getValue(this, LLLIILIL[1]);
    }

    public final InterfaceC1413540mt6 LJIIJJI() {
        return (InterfaceC1413540mt6) this.LLLII.getValue(this, LLLIILIL[18]);
    }

    public final VideoPublishEditModel LJIILIIL() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLLIILIL[0]);
    }

    public final InterfaceC1455160nyE LJIILJJIL() {
        InterfaceC1455160nyE interfaceC1455160nyE = (InterfaceC1455160nyE) this.LLJJIJIIJIL.getValue(this, LLLIILIL[13]);
        return interfaceC1455160nyE == null ? this.LLILLJJLI : interfaceC1455160nyE;
    }

    public final C1456470o0L LJIILL() {
        return (C1456470o0L) this.LLL.getValue(this, LLLIILIL[17]);
    }

    public final AbstractC214814194y LJIILLIIL() {
        return (AbstractC214814194y) this.LLJLL.getValue(this, LLLIILIL[16]);
    }

    public final InterfaceC1422030n6n LJIIZILJ() {
        return (InterfaceC1422030n6n) this.LLLIIIL.getValue(this, LLLIILIL[20]);
    }

    public final InterfaceC1456910o13 LJIJ() {
        return (InterfaceC1456910o13) this.LLJJ.getValue(this, LLLIILIL[9]);
    }

    @Override // X.InterfaceC1454960nxu
    public final void Wq() {
        if (this.LLLFZ) {
            return;
        }
        LJIILIIL().creativeModel.musicBuzModel.isMusicFromAutoEdit = false;
    }

    @Override // X.InterfaceC1454960nxu
    public final void cr() {
        SimpleEffect effectInfo;
        IUserService iUserService;
        User currentUser;
        AVChallenge aVChallenge;
        List listLJJLIIIJILLIZJL;
        this.LLJLLIL.LJIIJ(Unit.LIZ);
        String stickerID = LJIILIIL().getStickerID();
        String str = (stickerID == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stickerID, new String[]{","}, 0, 6)) == null) ? null : (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
        ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(LJIILIIL().getVideoSegmentsDesc());
        List<AVChallenge> list = LJIILIIL().challenges;
        String str2 = (list == null || (aVChallenge = (AVChallenge) C13LP.LJJJLZIJ(0, list)) == null) ? null : aVChallenge.cid;
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (Intrinsics.LJFF(Boolean.TRUE, interfaceC1413540mt6LJIIJJI != null ? Boolean.valueOf(interfaceC1413540mt6LJIIJJI.Mc2()) : null) && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUser = iUserService.getCurrentUser()) != null && currentUser.getAccountType() == 3) {
            InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI2 = LJIIJJI();
            if (interfaceC1413540mt6LJIIJJI2 != null) {
                interfaceC1413540mt6LJIIJJI2.Wx1(true);
            }
            InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI3 = LJIIJJI();
            if (interfaceC1413540mt6LJIIJJI3 != null) {
                interfaceC1413540mt6LJIIJJI3.LJIIL();
            }
        }
        String firstStickerMusicIdsJson = LJIILIIL().getFirstStickerMusicIdsJson();
        boolean zIsAllowClearMusic = LJIILIIL().isAllowClearMusic();
        boolean z = (LJIILIIL().isPhotoMvMode() || C1428470nHB.LJJZZI(LJIILIIL())) && !LJIILIIL().isCurrentAutoCutMode();
        boolean z2 = this.LLJILJILJ;
        String str3 = LJIILIIL().mShootWay;
        String creationId = LJIILIIL().getCreationId();
        boolean zLIZ = C384190F4n.LIZ(LJIILIIL());
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJJLL(arrayListLJIIIIZZ);
        boolean zIsBusiSticker = timeSpeedModelExtension != null ? timeSpeedModelExtension.isBusiSticker() : false;
        boolean zUseMusicBeatSticker = LJIILIIL().useMusicBeatSticker();
        boolean z3 = C1428470nHB.LJJZZI(LJIILIIL()) || C1428470nHB.LJJLIIIJLJLI(LJIILIIL()) || C1416310mxZ.LJJJJZ(LJIILIIL());
        long maxDuration = LJIILIIL().getMaxDuration();
        long videoLength = LJIILIIL().getVideoLength();
        C0EM6 c0em6 = LLLIIL;
        VideoPublishEditModel videoPublishEditModelLJIILIIL = LJIILIIL();
        c0em6.getClass();
        Mission mission = videoPublishEditModelLJIILIIL.creativeModel.commerceModel.getMission();
        String missionId = mission == null ? null : mission.getMissionId();
        Mission mission2 = LJIILIIL().creativeModel.commerceModel.getMission();
        String musicId = (mission2 == null || mission2.isMusicToasted()) ? null : mission2.getMusicId();
        VideoPublishEditModel videoPublishEditModelLJIILIIL2 = LJIILIIL();
        boolean z4 = (videoPublishEditModelLJIILIIL2.isDuet() || videoPublishEditModelLJIILIIL2.isStickPointMode() || (C1428470nHB.LJJZZI(videoPublishEditModelLJIILIIL2) && !C0EM4.LIZ()) || C1428520nHG.LJJJJJL(LJIILIIL())) ? false : true;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LJIILIIL().creativeModel.musicBuzModel);
        MusicModel musicModelLIZ = aVMusicExtractAVMusic != null ? C10I1.LIZ(aVMusicExtractAVMusic) : null;
        String musicOriginWithCheck = LJIILIIL().getMusicOriginWithCheck();
        FlowDataMusicInfo flowDataMusicInfo = LJIILIIL().getCreativeFlowData().getFlowDataMusicInfo();
        String str4 = (flowDataMusicInfo == null || !flowDataMusicInfo.isSelectedByAuto()) ? "manual" : "auto";
        TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) C13LP.LJJJLL(arrayListLJIIIIZZ);
        UrlModel iconUrl = (timeSpeedModelExtension2 == null || (effectInfo = timeSpeedModelExtension2.getEffectInfo()) == null) ? null : effectInfo.getIconUrl();
        String strLJIILIIL = C1428470nHB.LJIILIIL(LJIILIIL());
        String strLJIILL = C1428470nHB.LJIILL(LJIILIIL());
        C1446210njn c1446210njnLJ = C1442040nd4.LJ(LJIILIIL(), LJIILIIL().getVideoLength(), false, null, null, false, 0L, false, null, null, false, 1022);
        C1403010mc7.LIZ.getMusicService().Wk();
        List<String> value = C1085780eMS.LIZIZ.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        C15J3 c15j3 = new C15J3(firstStickerMusicIdsJson, str, str2, zIsAllowClearMusic, z, z2, str3, creationId, zLIZ, zIsBusiSticker, zUseMusicBeatSticker, z3, maxDuration, videoLength, missionId, musicId, z4, null, null, musicModelLIZ, musicOriginWithCheck, str4, iconUrl, strLJIILIIL, strLJIILL, c1446210njnLJ, value, false, er(), C1403850mdT.LJFF(LJIILIIL()), 134610944);
        C15J2 c15j2 = this.LLILZIL;
        C19EG c19eg = this.LL;
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 453);
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 663);
        UrlModel reuseOriginalSoundUrls = LJIILIIL().getReuseOriginalSoundUrls();
        int reuseOriginalSoundLength = LJIILIIL().getReuseOriginalSoundLength();
        String reuseOriginalSoundId = LJIILIIL().getReuseOriginalSoundId();
        c15j2.getClass();
        C15J2.LIZ(c19eg, c15j3, awS601S0100000_22, awS566S0100000_22, reuseOriginalSoundUrls, reuseOriginalSoundLength, reuseOriginalSoundId);
    }

    @Override // X.InterfaceC1454960nxu
    public final int gr() {
        C204607154j c204607154jLJLZ;
        if (!this.LLLFF) {
            if (this.LLLFFI) {
                return ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIIZ();
            }
            return -1;
        }
        C1403010mc7.LIZ.getMusicService().dl().getClass();
        C11PQ<C204607154j> c11pq = C1458410o3T.LIZLLL;
        if (c11pq == null || (c204607154jLJLZ = c11pq.LJLZ()) == null) {
            return -1;
        }
        return c204607154jLJLZ.LIZJ;
    }

    @Override // X.InterfaceC1454960nxu
    public final void mr() {
        this.LLJJL.LJII(new C529150Kp7());
    }

    @Override // X.InterfaceC1454960nxu
    public final void LJ() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            interfaceC1413540mt6LJIIJJI.LJ();
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void LJIIL() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            interfaceC1413540mt6LJIIJJI.LJIIL();
        }
    }

    public final void LJIJJ() {
        MusicBeanUtilKt.extractAVMusic(LJIILIIL().creativeModel.musicBuzModel);
        InterfaceC1460000o62 interfaceC1460000o62LJIIJ = LJIIJ();
        if (interfaceC1460000o62LJIIJ != null) {
            interfaceC1460000o62LJIIJ.FA1(R.raw.icon_music_note_s_alt);
        }
    }

    public final void LJIJJLI() {
        Function2<VEPreviewMusicParams, List<? extends VEPreviewMusicParams>, Unit> function2;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LJIILIIL().creativeModel.musicBuzModel);
        String strLIZ = C1438730nXj.LIZ(aVMusicExtractAVMusic);
        String strLIZIZ = C1438730nXj.LIZIZ(aVMusicExtractAVMusic);
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.mPath = null;
        vEPreviewMusicParams.mInPoint = 0;
        vEPreviewMusicParams.musicId = strLIZ;
        vEPreviewMusicParams.musicName = aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.musicName : null;
        vEPreviewMusicParams.mDuration = 0;
        vEPreviewMusicParams.mShootDuration = 0;
        if (aVMusicExtractAVMusic != null) {
            vEPreviewMusicParams.previewStartTime = aVMusicExtractAVMusic.getPreviewStartTime();
        }
        vEPreviewMusicParams.bgmDelay = 0;
        vEPreviewMusicParams.bgmLoudness = 0.0d;
        vEPreviewMusicParams.peakLoudness = 0.0d;
        vEPreviewMusicParams.avgLoudness = 0.0d;
        vEPreviewMusicParams.balancedGain = 0.0f;
        InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ = LJIIIZ();
        if (interfaceC1455860nzMLJIIIZ != null) {
            interfaceC1455860nzMLJIIIZ.JA2(vEPreviewMusicParams, null);
        }
        C1457860o2a c1457860o2aLIZLLL = LIZLLL();
        if (c1457860o2aLIZLLL != null && (function2 = c1457860o2aLIZLLL.LJ) != null) {
            function2.invoke(vEPreviewMusicParams, null);
        }
        LJIILIIL().getMMusicPath();
        LJIILIIL().setMMusicPath(null);
        LJIILIIL().setMusicRequestId(strLIZIZ);
        LJIILIIL().setMMusicStart(0);
        LJIILIIL().setIsSoundLoop(aVMusicExtractAVMusic != null ? Boolean.valueOf(aVMusicExtractAVMusic.isMemeSong()) : Boolean.FALSE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundLoop, AiMusic PreviewMusicRemove isSoundLoop = ");
        sbLIZ.append(LJIILIIL().getIsSoundLoop());
        sbLIZ.append(' ');
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        eg(C570830Ma9.LIZ(LJIILIIL().getCurMusicServerLength(), LJIILIIL(), LJIILIIL().getMMusicPath()));
        LJIJJ();
        this.LLLF = null;
    }

    @Override // X.InterfaceC1454960nxu
    public final void Qq() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            interfaceC1413540mt6LJIIJJI.lz(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0nxm] */
    @Override // X.InterfaceC1454960nxu
    public final void Vq() {
        if (!LJIILIIL().isDraftMusicIllegal() && LJIILIIL().isMvThemeVideoType()) {
            MvCreateVideoData mvCreateVideoData = LJIILIIL().getMvCreateVideoData();
            if (C580130Mp9.LIZ(mvCreateVideoData != null ? mvCreateVideoData.musicIds : null)) {
                return;
            }
            C1455220nyK c1455220nyKXk = C1403010mc7.LIZ.getMusicService().Xk(new InterfaceC1455230nyL() { // from class: X.0nxp
                @Override // X.InterfaceC1455230nyL
                public final MusicBuzModel LIZIZ() {
                    return this.LIZ.LJIILIIL().creativeModel.musicBuzModel;
                }

                @Override // X.InterfaceC1455230nyL
                public final void LIZ(AVMusic aVMusic) {
                    this.LIZ.LLJJJ.LJII(new C0LCS<>(new C1458000o2o(aVMusic, null, 14)));
                    C1452640nuA.LJII(aVMusic, false, this.LIZ.LJIILIIL().creativeModel.musicBuzModel);
                }
            });
            c1455220nyKXk.LIZIZ(new InterfaceC1455200nyI() { // from class: X.0nxm
                @Override // X.InterfaceC1455200nyI
                public final void LIZ(AVMusic aVMusic, boolean z) {
                    InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ;
                    LiveData<InterfaceC1452170ntP> liveDataG;
                    InterfaceC1452170ntP value;
                    VEMVAudioInfo vEMVAudioInfoRf;
                    if (aVMusic == null) {
                        return;
                    }
                    this.LIZ.getClass();
                    this.LIZ.LLJILJILJ = aVMusic.isMvThemeMusic();
                    C1454870nxl c1454870nxl = this.LIZ;
                    c1454870nxl.getClass();
                    if (z) {
                        c1454870nxl.LJIILIIL().setMusicOrigin("mv_default");
                        c1454870nxl.LLJJJ.LJII(new C0LCS<>(new C1458000o2o(aVMusic, null, 14)));
                        InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ2 = c1454870nxl.LJIIIIZZ();
                        if (interfaceC1453200nv4LJIIIIZZ2 != null) {
                            interfaceC1453200nv4LJIIIIZZ2.Do0(aVMusic);
                        }
                        c1454870nxl.LJIILIIL().setMusicRequestId(C1438730nXj.LIZIZ(aVMusic));
                        c1454870nxl.LJIILIIL().setOriginalSound(aVMusic.isOriginalSound());
                        InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ = c1454870nxl.LJIIIZ();
                        if (interfaceC1455860nzMLJIIIZ != null && (liveDataG = interfaceC1455860nzMLJIIIZ.g()) != null && (value = liveDataG.getValue()) != null && (vEMVAudioInfoRf = value.rf()) != null) {
                            c1454870nxl.LJIILIIL().setMMusicStart(vEMVAudioInfoRf.trimIn);
                            c1454870nxl.LJIILIIL().setMMusicEnd(vEMVAudioInfoRf.trimOut);
                        } else {
                            c1454870nxl.LJIILIIL().setMMusicStart(0);
                            c1454870nxl.LJIILIIL().setMMusicEnd(Math.min(aVMusic.getPresenterDuration(), C538540LAe.LLJJJIL));
                        }
                        c1454870nxl.fr(aVMusic.getMusicId(), "mv_default");
                    }
                    if (C0MT6.LIZ() && z && (interfaceC1453200nv4LJIIIIZZ = c1454870nxl.LJIIIIZZ()) != null) {
                        interfaceC1453200nv4LJIIIIZZ.C60(aVMusic);
                    }
                }
            });
            MvCreateVideoData mvCreateVideoData2 = LJIILIIL().getMvCreateVideoData();
            c1455220nyKXk.LIZ(mvCreateVideoData2 != null ? mvCreateVideoData2.musicIds : null);
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void ar() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            interfaceC1413540mt6LJIIJJI.Wx1(false);
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void dr() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            interfaceC1413540mt6LJIIJJI.QS1("", false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @Override // X.InterfaceC1454960nxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean er() {
        /*
            r8 = this;
            boolean r0 = X.C07N9.LIZ()
            r7 = 0
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.LJIILIIL()
            if (r2 == 0) goto La8
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r1 = r2.getPreviewInfo()
            if (r1 == 0) goto La0
            int r0 = r1.getPreviewVideoLength()
            if (r0 == 0) goto La0
            int r1 = r1.getPreviewVideoLength()
        L1d:
            com.ss.android.ugc.aweme.property.SmartExtendMusicConfigModel r0 = X.C1454930nxr.LIZ()
            long r5 = r0.videoMinLength
            long r3 = r0.videoMaxLength
            long r1 = (long) r1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L9f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            java.lang.String r2 = r0.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            java.lang.String r1 = X.C1428470nHB.LJIILL(r0)
            com.ss.android.ugc.aweme.property.SmartExtendMusicConfigModel r0 = X.C1454930nxr.LIZ()
            java.util.List<java.lang.String> r0 = r0.shootWayBlockList
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.property.SmartExtendMusicConfigModel r0 = X.C1454930nxr.LIZ()
            java.util.List<java.lang.String> r0 = r0.contentTypeAllowList
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = r0.getEditMusicSyncMode()
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = r0.isCutSameVideoType()
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = X.C1428470nHB.LLIIIZ(r0)
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = r0.isCurrentAutoCutMode()
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            boolean r0 = X.C1428470nHB.LJLJJLL(r0)
            if (r0 != 0) goto L9f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LJIILIIL()
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r0.getCanvasVideoData()
            boolean r0 = X.C1444940nhk.LJIIJ(r0)
            if (r0 != 0) goto L9f
            r7 = 1
        L9f:
            return r7
        La0:
            if (r2 == 0) goto La8
            int r1 = r2.getVideoDurationFromVideoCutPage()
            goto L1d
        La8:
            r1 = -1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454870nxl.er():boolean");
    }

    @Override // X.InterfaceC1454960nxu
    public final C385670FAf<Pair<Boolean, AVMusic>> ir() {
        InterfaceC1413540mt6 interfaceC1413540mt6LJIIJJI = LJIIJJI();
        if (interfaceC1413540mt6LJIIJJI != null) {
            return interfaceC1413540mt6LJIIJJI.gs0();
        }
        return null;
    }

    @Override // X.InterfaceC1454960nxu
    public final h0 Pn() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1454960nxu
    public final LiveEvent<Unit> Pq() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1454960nxu
    public final LiveEvent<Unit> Q9() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1454960nxu
    public final h0 Zq() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1454960nxu
    public final h0 br() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1454960nxu
    public final MutableLiveData kr() {
        return this.LLJLIL;
    }

    public final void LIZ(boolean z) {
        InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ;
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        if (!this.LLJJJJLIIL) {
            return;
        }
        if ((!z || LJIILLIIL().getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) && (interfaceC1455860nzMLJIIIZ = LJIIIZ()) != null && (mutableLiveDataVW1 = interfaceC1455860nzMLJIIIZ.vW1()) != null) {
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZJ());
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZLLL(0L));
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZ());
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void Sq(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @Override // X.InterfaceC1454960nxu
    public final void Uq(MusicBuzModel musicBuzModel) {
        C1456960o18 c1456960o18;
        String musicPath;
        float fFloatValue;
        Long startTime;
        Long endTime;
        int iLongValue;
        Long clipEndTime;
        Long clipStartTime;
        Float musicVolume;
        ArrayList arrayList = new ArrayList();
        for (MusicBuzModel musicBuzModel2 : (ArrayList) C1429680nJ8.LIZIZ(musicBuzModel)) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
            if (aVMusicExtractAVMusic != null && (c1456960o18 = musicBuzModel2.stripMusicModel) != null && (musicPath = c1456960o18.getMusicPath()) != null) {
                C1456960o18 c1456960o182 = musicBuzModel2.stripMusicModel;
                if (c1456960o182 != null && (musicVolume = c1456960o182.getMusicVolume()) != null) {
                    fFloatValue = musicVolume.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                VEPreviewMusicParams vEPreviewMusicParamsLIZIZ = LIZIZ(aVMusicExtractAVMusic, musicPath, fFloatValue, -1L, false);
                C1456960o18 c1456960o183 = musicBuzModel2.stripMusicModel;
                if (c1456960o183 != null && (startTime = c1456960o183.getStartTime()) != null) {
                    long jLongValue = startTime.longValue();
                    C1456960o18 c1456960o184 = musicBuzModel2.stripMusicModel;
                    if (c1456960o184 != null && (endTime = c1456960o184.getEndTime()) != null) {
                        long jLongValue2 = endTime.longValue();
                        vEPreviewMusicParamsLIZIZ.startTime = jLongValue;
                        vEPreviewMusicParamsLIZIZ.endTime = jLongValue2;
                        vEPreviewMusicParamsLIZIZ.mDuration = aVMusicExtractAVMusic.getDuration();
                        C1456960o18 c1456960o185 = musicBuzModel2.stripMusicModel;
                        int iLongValue2 = 0;
                        if (c1456960o185 != null && (clipStartTime = c1456960o185.getClipStartTime()) != null) {
                            iLongValue = (int) clipStartTime.longValue();
                        } else {
                            iLongValue = 0;
                        }
                        vEPreviewMusicParamsLIZIZ.mInPoint = iLongValue;
                        C1456960o18 c1456960o186 = musicBuzModel2.stripMusicModel;
                        if (c1456960o186 != null && (clipEndTime = c1456960o186.getClipEndTime()) != null) {
                            iLongValue2 = (int) clipEndTime.longValue();
                        }
                        vEPreviewMusicParamsLIZIZ.mOutPoint = iLongValue2;
                        arrayList.add(vEPreviewMusicParamsLIZIZ);
                    }
                }
            }
        }
        InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ = LJIIIZ();
        if (interfaceC1455860nzMLJIIIZ != null) {
            interfaceC1455860nzMLJIIIZ.cF2(arrayList);
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void Yq(String str) {
        this.LLJL.setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    @Override // X.InterfaceC1454960nxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void eg(boolean r4) {
        /*
            r3 = this;
            boolean r0 = X.C0MT6.LIZ()
            if (r0 == 0) goto L10
            X.0nv4 r0 = r3.LJIIIIZZ()
            if (r0 == 0) goto Lf
            r0.eg(r4)
        Lf:
            return
        L10:
            X.0tQG r2 = r3.LLJI
            X.1Bqa<java.lang.Object>[] r1 = X.C1454870nxl.LLLIILIL
            r0 = 5
            r0 = r1[r0]
            java.lang.Object r0 = r2.getValue(r3, r0)
            X.0n1E r0 = (X.InterfaceC1418580n1E) r0
            if (r0 == 0) goto L54
            boolean r0 = r0.FR0()
            r2 = 1
            if (r0 != r2) goto L54
        L26:
            X.0o62 r0 = r3.LJIIJ()
            r1 = 7
            if (r0 == 0) goto L30
            r0.Uh1(r1, r2)
        L30:
            X.0o62 r0 = r3.LJIIJ()
            if (r0 == 0) goto L39
            r0.ut0(r1, r2)
        L39:
            boolean r0 = X.C0EM4.LIZ()
            if (r0 != 0) goto L56
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJIILIIL()
            boolean r0 = X.C1428470nHB.LJJZZI(r0)
            if (r0 != 0) goto L53
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJIILIIL()
            boolean r0 = X.C1428470nHB.LJZL(r0)
            if (r0 == 0) goto L56
        L53:
            return
        L54:
            r2 = 0
            goto L26
        L56:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.LIZ()
            r2 = 8
            if (r0 == 0) goto L7a
            X.194y r0 = r3.LJIILLIIL()
            X.0tI4 r1 = X.C1659640tI2.LIZLLL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel> r0 = com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel.class
            com.bytedance.jedi.arch.JediViewModel r0 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel r0 = (com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel) r0
            r0.Uh1(r2, r4)
        L79:
            return
        L7a:
            X.0o62 r0 = r3.LJIIJ()
            if (r0 == 0) goto L79
            r0.ut0(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454870nxl.eg(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    @Override // X.InterfaceC1454960nxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hr(X.C1454900nxo r32) {
        /*
            Method dump skipped, instruction units count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454870nxl.hr(X.0nxo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    @Override // X.InterfaceC1454960nxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lr(boolean r9) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454870nxl.lr(boolean):void");
    }

    @Override // X.InterfaceC1454960nxu
    public final void fr(String str, String str2) {
        this.LLLI.put(str, str2);
    }

    public C1454870nxl(C19EG c19eg, InterfaceC1455160nyE interfaceC1455160nyE, C1DRG c1drg) {
        AbstractC1452680nuE abstractC1452680nuEGc;
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1455160nyE;
        this.LLILLL = c1drg;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453420nvQ.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1454950nxt.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457250o1b.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1454940nxs.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1459020o4S.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456910o13.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC559500Lwy.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453610nvj.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456450o0J.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC366450EYh.class, null);
        h0<C0LCS<C1458000o2o>> h0Var = new h0<>(null);
        this.LLJJJ = h0Var;
        this.LLJJJIL = h0Var;
        h0<C529150Kp7> h0Var2 = new h0<>(null);
        this.LLJJJJ = h0Var2;
        this.LLJJJJJIL = h0Var2;
        this.LLJJJJLIIL = true;
        h0<C529150Kp7> h0Var3 = new h0<>(null);
        this.LLJJL = h0Var3;
        this.LLJJLIIIJLLLLLLLZ = h0Var3;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LLJL = mutableLiveData;
        this.LLJLIL = mutableLiveData;
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJLL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJLLIL = c560530Lyd;
        this.LLJLLL = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJZ = c560530Lyd2;
        this.LLJZIJLIL = c560530Lyd2;
        this.LLL = C1664770tQJ.LIZIZ(c1drg, C1456470o0L.class, null);
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        arrayMap.put(LJIILIIL().getMusicId(), LJIILIIL().getMusicOrigin());
        this.LLLI = arrayMap;
        this.LLLII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1413540mt6.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZIZ(c1drg, C1457860o2a.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1422030n6n.class, null);
        try {
            C20187513yr c20187513yr = new InterfaceC1464200oCo() { // from class: X.13yr
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    String strSubstring;
                    if (i == 4417 && str != null && a0.LJJJ(str, ":", 0, false, 6) > 0 && a0.LJJJ(str, ":", 0, false, 6) + 1 < str.length() && (strSubstring = str.substring(a0.LJJJ(str, ":", 0, false, 6) + 1)) != null) {
                        C20187813yu.LIZ.getClass();
                        if (Intrinsics.LJFF(C20187813yu.LIZIZ, strSubstring) && !C20187813yu.LJ) {
                            C20187813yu.LJ = true;
                            long jCurrentTimeMillis = System.currentTimeMillis() - C20187813yu.LJFF;
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("play_type", "AUDIO");
                            c2344009Gk.LIZJ(C20187813yu.LIZLLL, "is_audio_streaming");
                            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                            c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                            String str2 = C20187813yu.LIZJ;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c2344009Gk.LJIIIIZZ("meta_song_id", str2);
                            C20684815ws.LJIILLIIL("video_play_quality", c2344009Gk.LIZ);
                        }
                    }
                }
            };
            InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ = LJIIIZ();
            if (interfaceC1455860nzMLJIIIZ != null && (abstractC1452680nuEGc = interfaceC1455860nzMLJIIIZ.gc()) != null) {
                abstractC1452680nuEGc.LJJ().df(c20187513yr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "Error while setting up VE audio first frame listener");
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void M9(AVMusic aVMusic, boolean z, Function1<? super Boolean, Unit> function1) {
        InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) ((C0ETY) this.LLILLL.LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class);
        if (interfaceC1419190n2D == null) {
            function1.invoke(Boolean.TRUE);
        } else {
            interfaceC1419190n2D.M9(aVMusic, z, function1);
        }
    }

    public final VEPreviewMusicParams LIZIZ(AVMusic aVMusic, String str, float f, long j, boolean z) {
        int iIntValue;
        int iMax;
        double bgmLoudness;
        double peakLoudness;
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.mPath = str;
        boolean z2 = false;
        if (aVMusic.getMusicStartFromCut() >= 0) {
            iIntValue = aVMusic.getMusicStartFromCut();
        } else {
            Integer num = aVMusic.ccTemplateMusicStartTime;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        vEPreviewMusicParams.mInPoint = iIntValue;
        if (C1399580mWa.LIZ()) {
            iMax = Math.max(aVMusic.getMusicEndFromCut(), Math.max(aVMusic.getMusicEndTime(), 0));
        } else {
            iMax = Math.max(aVMusic.getMusicEndFromCut(), 0);
        }
        vEPreviewMusicParams.mOutPoint = iMax;
        vEPreviewMusicParams.bgmDelay = LJIILIIL().getRecordBgmDelay();
        if (LJIILIIL().getLoudnessBalanceParam() != null) {
            LoudnessBalanceParam loudnessBalanceParam = LJIILIIL().getLoudnessBalanceParam();
            double avgLoudness = 0.0d;
            if (loudnessBalanceParam != null) {
                bgmLoudness = loudnessBalanceParam.getBgmLoudness();
            } else {
                bgmLoudness = 0.0d;
            }
            vEPreviewMusicParams.bgmLoudness = bgmLoudness;
            LoudnessBalanceParam loudnessBalanceParam2 = LJIILIIL().getLoudnessBalanceParam();
            if (loudnessBalanceParam2 != null) {
                peakLoudness = loudnessBalanceParam2.getPeakLoudness();
            } else {
                peakLoudness = 0.0d;
            }
            vEPreviewMusicParams.peakLoudness = peakLoudness;
            LoudnessBalanceParam loudnessBalanceParam3 = LJIILIIL().getLoudnessBalanceParam();
            if (loudnessBalanceParam3 != null) {
                avgLoudness = loudnessBalanceParam3.getAvgLoudness();
            }
            vEPreviewMusicParams.avgLoudness = avgLoudness;
        }
        vEPreviewMusicParams.musicId = C1438730nXj.LIZ(aVMusic);
        vEPreviewMusicParams.musicName = C1419800n3C.LIZIZ(this.LL, aVMusic);
        vEPreviewMusicParams.previewStartTime = aVMusic.getPreviewStartTime();
        vEPreviewMusicParams.mDuration = C141Q.LIZIZ(aVMusic.getDuration(), vEPreviewMusicParams.mPath);
        if (aVMusic.getShootDuration() > 0 && Math.abs(vEPreviewMusicParams.mDuration - aVMusic.getShootDuration()) >= 1000) {
            vEPreviewMusicParams.mShootDuration = aVMusic.getShootDuration();
        } else {
            vEPreviewMusicParams.mShootDuration = vEPreviewMusicParams.mDuration;
        }
        if (j > 0 && j < vEPreviewMusicParams.mShootDuration) {
            vEPreviewMusicParams.mShootDuration = (int) j;
        }
        if (aVMusic.isMemeSong()) {
            z2 = true;
        }
        vEPreviewMusicParams.isSoundLoop = z2;
        vEPreviewMusicParams.mVolume = f;
        List<String> list = C1458320o3K.LIZ;
        vEPreviewMusicParams.balancedGain = C1458320o3K.LIZ(aVMusic, LJIILIIL(), z);
        vEPreviewMusicParams.isMusicLoop = aVMusic.isLoopMusic() ? 1 : 0;
        vEPreviewMusicParams.musicMaxLoopDuration = aVMusic.getMaxLoopDuration();
        return vEPreviewMusicParams;
    }

    @Override // X.InterfaceC1454960nxu
    public final void Tq(AVMusic aVMusic, MultiChoose multiChoose, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5) {
        boolean z6;
        int iIntValue;
        InterfaceC1457250o1b interfaceC1457250o1bLJII;
        int iIntValue2;
        Integer numValueOf;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        boolean z7 = !TextUtils.isEmpty(LJIILIIL().getMusicId());
        Wq();
        String str = "EDITOR_PRO";
        String str2 = "";
        String str3 = null;
        numValueOf = null;
        numValueOf = null;
        Integer numValueOf2 = null;
        if (aVMusic == null) {
            InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ = LJIIIZ();
            if (interfaceC1455860nzMLJIIIZ != null && (liveDataG2 = interfaceC1455860nzMLJIIIZ.g()) != null && (value2 = liveDataG2.getValue()) != null) {
                numValueOf = Integer.valueOf(value2.getDuration());
            } else {
                numValueOf = null;
            }
            C1452640nuA.LJII(null, LJIILIIL().isPhotoMvMode(), LJIILIIL().creativeModel.musicBuzModel);
            h0<C0LCS<C1458000o2o>> h0Var = this.LLJJJ;
            if (!z2) {
                str = "";
            }
            h0Var.LJII(new C0LCS<>(new C1458000o2o(null, str, 12)));
            InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ = LJIIIIZZ();
            if (interfaceC1453200nv4LJIIIIZZ != null) {
                interfaceC1453200nv4LJIIIIZZ.Do0(null);
            }
            LJIJJLI();
            this.LLLF = null;
            LJIILIIL().setMusicOrigin(null);
            this.LLLFF = false;
            InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ2 = LJIIIZ();
            if (interfaceC1455860nzMLJIIIZ2 != null && (liveDataG = interfaceC1455860nzMLJIIIZ2.g()) != null && (value = liveDataG.getValue()) != null) {
                numValueOf2 = Integer.valueOf(value.getDuration());
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                this.LLJJJJ.LJII(new C529150Kp7());
            }
            z6 = false;
        } else {
            if (C1419800n3C.LIZLLL(aVMusic, this.LLLF) && !z2) {
                return;
            }
            C1452640nuA.LJII(aVMusic, LJIILIIL().isPhotoMvMode(), LJIILIIL().creativeModel.musicBuzModel);
            h0<C0LCS<C1458000o2o>> h0Var2 = this.LLJJJ;
            if (!z2) {
                str = "";
            }
            h0Var2.LJII(new C0LCS<>(new C1458000o2o(aVMusic, str, 12)));
            InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ2 = LJIIIIZZ();
            if (interfaceC1453200nv4LJIIIIZZ2 != null) {
                interfaceC1453200nv4LJIIIIZZ2.Do0(aVMusic);
            }
            this.LLLFF = !z2;
            this.LLLF = aVMusic;
            Map<String, String> map = multiChoose.musicFilePaths;
            if (map != null) {
                String musicId = aVMusic.getMusicId();
                if (musicId == null) {
                    musicId = "";
                }
                str3 = map.get(musicId);
            }
            LJIJI(this, str3, z, aVMusic, z2, z3, z7, z4, j, z5, multiChoose, null, null, 3072);
            Integer shootDuration = C389120FNm.LIZ(aVMusic).getShootDuration();
            if (shootDuration != null) {
                iIntValue = shootDuration.intValue();
                z6 = false;
            } else {
                z6 = false;
                iIntValue = 0;
            }
            int iMax = Math.max(iIntValue, z6 ? 1 : 0);
            List<AVMusic> mergedMusicList = aVMusic.getMergedMusicList();
            if (mergedMusicList != null) {
                Iterator<AVMusic> it2 = mergedMusicList.iterator();
                while (it2.hasNext()) {
                    Integer shootDuration2 = C389120FNm.LIZ(it2.next()).getShootDuration();
                    if (shootDuration2 != null) {
                        iIntValue2 = shootDuration2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    iMax += Math.max(iIntValue2, z6 ? 1 : 0);
                }
            }
            if (iMax > 0 && (interfaceC1457250o1bLJII = LJII()) != null) {
                interfaceC1457250o1bLJII.oJ2(Math.min(iMax, Math.min(C1428520nHG.LJJJIL(LJIIIZ()), LJIILIIL().getMCurMusicLength() - LJIILIIL().getMMusicStart())), LJIILIIL().getMCurMusicLength());
            }
            InterfaceC1457250o1b interfaceC1457250o1bLJII2 = LJII();
            if (interfaceC1457250o1bLJII2 != null) {
                if (str3 != null) {
                    str2 = str3;
                }
                interfaceC1457250o1bLJII2.yl1(aVMusic, str2, aVMusic.getDuration(), LJIILIIL().getMMusicStart(), null);
            }
        }
        InterfaceC1454950nxt interfaceC1454950nxtLJFF = LJFF();
        if (interfaceC1454950nxtLJFF != null) {
            interfaceC1454950nxtLJFF.zY();
        }
        if (z2) {
            C1456470o0L c1456470o0LLJIILL = LJIILL();
            if (c1456470o0LLJIILL != null) {
                c1456470o0LLJIILL.LIZ.LJIIJ(Boolean.FALSE);
            }
            ((C0ETY) this.LLILLL.LJII(C0ETY.class, null)).Sd(InterfaceC1419190n2D.class, new AwS601S0100000_22(this, 452));
        }
        this.LLLFFI = z6;
        if (!z2) {
            InterfaceC1456910o13 interfaceC1456910o13LJIJ = LJIJ();
            if (interfaceC1456910o13LJIJ != null) {
                interfaceC1456910o13LJIJ.O32(true);
            }
            InterfaceC1422030n6n interfaceC1422030n6nLJIIZILJ = LJIIZILJ();
            if (interfaceC1422030n6nLJIIZILJ != null) {
                interfaceC1422030n6nLJIIZILJ.P3();
            }
            InterfaceC559500Lwy interfaceC559500LwyLJI = LJI();
            if (interfaceC559500LwyLJI != null) {
                interfaceC559500LwyLJI.Qk(z6);
            }
        }
    }

    @Override // X.InterfaceC1454960nxu
    public final void jr(String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6) {
        this.LLLFZ = z5;
        LJIILIIL().creativeModel.musicBuzModel.isMusicFromAutoEdit = z5;
        Rq(str, aVMusic, true, z, z2, z3, j, z4, z6, "", false, null);
        this.LLLFZ = false;
    }

    @Override // X.InterfaceC1454960nxu
    public final void Rq(String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, String str2, boolean z7, Function0<Unit> function0) {
        String strLIZ;
        int duration;
        int iLJJJIL;
        boolean z8;
        Integer numValueOf;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ;
        LiveData<InterfaceC1452170ntP> liveDataG3;
        InterfaceC1452170ntP value3;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        if (!C0BXS.LIZ() || C1428470nHB.LJJZZI(LJIILIIL()) || (strLIZ = C1441910ncr.LIZ(LJIILIIL(), "ai_music_choose", str)) == null) {
            strLIZ = str;
        }
        Integer numValueOf2 = null;
        if (C566070MIb.LIZ() && C1428470nHB.LJJJJJL(LJIILIIL().creativeModel) && (interfaceC1455860nzMLJIIIZ = LJIIIZ()) != null && (liveDataG3 = interfaceC1455860nzMLJIIIZ.g()) != null && (value3 = liveDataG3.getValue()) != null && (nLEModelLIZ = C352130DrH.LIZ(value3)) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO && !C351220Dpo.LLLII(nLETrack)) {
                    nLEModelLIZ.removeTrack(nLETrack);
                    lr(true);
                }
            }
        }
        boolean z9 = !TextUtils.isEmpty(LJIILIIL().getMusicId());
        VideoPublishEditModel videoPublishEditModelLJIILIIL = LJIILIIL();
        if (aVMusic != null) {
            duration = aVMusic.getDuration();
        } else {
            duration = -1;
        }
        eg(C570830Ma9.LIZ(duration, videoPublishEditModelLJIILIIL, strLIZ));
        Wq();
        if (C1458070o2v.LIZIZ() && z4 && z && aVMusic != null && C1458070o2v.LJ(LJIILIIL().creativeModel.musicBuzModel)) {
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            int iLJJL = C1416310mxZ.LJJL(LJIILIIL(), 0, aVMusic, 1);
            c1452640nuA.getClass();
            C1452640nuA.LJIIJ(aVMusic, true, iLJJL);
        }
        String str3 = "EDITOR_PRO";
        String str4 = "";
        if (aVMusic == null) {
            LJIILIIL().creativeModel.musicBuzModel.unSelectMusic = new UnSelectMusic(LJIILIIL().getCreationId(), C1429680nJ8.LIZJ(LJIILIIL().creativeModel.musicBuzModel), 4);
            InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ2 = LJIIIZ();
            if (interfaceC1455860nzMLJIIIZ2 != null && (liveDataG2 = interfaceC1455860nzMLJIIIZ2.g()) != null && (value2 = liveDataG2.getValue()) != null) {
                numValueOf = Integer.valueOf(value2.getDuration());
            } else {
                numValueOf = null;
            }
            C1452640nuA.LJII(null, LJIILIIL().isPhotoMvMode(), LJIILIIL().creativeModel.musicBuzModel);
            h0<C0LCS<C1458000o2o>> h0Var = this.LLJJJ;
            if (!z2) {
                str3 = "";
            }
            h0Var.LJII(new C0LCS<>(new C1458000o2o(null, str3, 4)));
            InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ = LJIIIIZZ();
            if (interfaceC1453200nv4LJIIIIZZ != null) {
                interfaceC1453200nv4LJIIIIZZ.Do0(null);
            }
            LJIJJLI();
            this.LLLF = null;
            LJIILIIL().setMusicOrigin(null);
            this.LLLFF = false;
            InterfaceC1455860nzM interfaceC1455860nzMLJIIIZ3 = LJIIIZ();
            if (interfaceC1455860nzMLJIIIZ3 != null && (liveDataG = interfaceC1455860nzMLJIIIZ3.g()) != null && (value = liveDataG.getValue()) != null) {
                numValueOf2 = Integer.valueOf(value.getDuration());
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                this.LLJJJJ.LJII(new C529150Kp7());
            }
            z8 = true;
        } else {
            if (C1419800n3C.LIZLLL(aVMusic, this.LLLF) && !z2) {
                return;
            }
            C1452640nuA.LJII(aVMusic, LJIILIIL().isPhotoMvMode(), LJIILIIL().creativeModel.musicBuzModel);
            h0<C0LCS<C1458000o2o>> h0Var2 = this.LLJJJ;
            if (!z2) {
                str3 = "";
            }
            h0Var2.LJII(new C0LCS<>(new C1458000o2o(aVMusic, str3, 4)));
            InterfaceC1453200nv4 interfaceC1453200nv4LJIIIIZZ2 = LJIIIIZZ();
            if (interfaceC1453200nv4LJIIIIZZ2 != null) {
                interfaceC1453200nv4LJIIIIZZ2.Do0(aVMusic);
            }
            this.LLLFF = !z2;
            this.LLLF = aVMusic;
            String str5 = strLIZ;
            LJIJI(this, strLIZ, z, aVMusic, z2, z3, z9, z4, j, z5, null, str2, function0, 512);
            if (C1428470nHB.LJJZZI(LJIILIIL())) {
                iLJJJIL = LJIILIIL().getVideoLength();
            } else {
                iLJJJIL = C1428520nHG.LJJJIL(LJIIIZ());
            }
            if (C389120FNm.LIZ(aVMusic).getShootDuration().intValue() > 0) {
                if (C1399580mWa.LIZ()) {
                    z8 = true;
                    if (C1459090o4Z.LIZ(aVMusic) && LJIILIIL().getMMusicEnd() > LJIILIIL().getMMusicStart()) {
                        InterfaceC1457250o1b interfaceC1457250o1bLJII = LJII();
                        if (interfaceC1457250o1bLJII != null) {
                            interfaceC1457250o1bLJII.oJ2(Math.min(C389120FNm.LIZ(aVMusic).getShootDuration().intValue(), Math.min(iLJJJIL, LJIILIIL().getMMusicEnd() - LJIILIIL().getMMusicStart())), LJIILIIL().getMCurMusicLength());
                        }
                    }
                } else {
                    z8 = true;
                }
                InterfaceC1457250o1b interfaceC1457250o1bLJII2 = LJII();
                if (interfaceC1457250o1bLJII2 != null) {
                    interfaceC1457250o1bLJII2.oJ2(Math.min(C389120FNm.LIZ(aVMusic).getShootDuration().intValue(), Math.min(iLJJJIL, LJIILIIL().getMCurMusicLength() - LJIILIIL().getMMusicStart())), LJIILIIL().getMCurMusicLength());
                }
            } else {
                z8 = true;
            }
            InterfaceC1457250o1b interfaceC1457250o1bLJII3 = LJII();
            if (interfaceC1457250o1bLJII3 != null) {
                if (str5 != null) {
                    str4 = str5;
                }
                interfaceC1457250o1bLJII3.yl1(aVMusic, str4, aVMusic.getDuration(), LJIILIIL().getMMusicStart(), null);
            }
        }
        InterfaceC1454950nxt interfaceC1454950nxtLJFF = LJFF();
        if (interfaceC1454950nxtLJFF != null) {
            interfaceC1454950nxtLJFF.zY();
        }
        if (z2) {
            C1456470o0L c1456470o0LLJIILL = LJIILL();
            if (c1456470o0LLJIILL != null) {
                c1456470o0LLJIILL.LIZ.LJIIJ(Boolean.FALSE);
            }
            ((C0ETY) this.LLILLL.LJII(C0ETY.class, null)).Sd(InterfaceC1419190n2D.class, new AwS601S0100000_22(this, 451));
        }
        this.LLLFFI = false;
        if (!z2 && z6) {
            InterfaceC1456910o13 interfaceC1456910o13LJIJ = LJIJ();
            if (interfaceC1456910o13LJIJ != null) {
                interfaceC1456910o13LJIJ.O32(z8);
            }
            InterfaceC1422030n6n interfaceC1422030n6nLJIIZILJ = LJIIZILJ();
            if (interfaceC1422030n6nLJIIZILJ != null) {
                interfaceC1422030n6nLJIIZILJ.P3();
            }
            InterfaceC559500Lwy interfaceC559500LwyLJI = LJI();
            if (interfaceC559500LwyLJI != null) {
                interfaceC559500LwyLJI.Qk(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C1454870nxl r35, java.lang.String r36, boolean r37, com.ss.android.ugc.aweme.creative.model.music.AVMusic r38, boolean r39, boolean r40, boolean r41, boolean r42, long r43, boolean r45, com.ss.android.ugc.aweme.shortvideo.model.MultiChoose r46, java.lang.String r47, kotlin.jvm.functions.Function0 r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454870nxl.LJIJI(X.0nxl, java.lang.String, boolean, com.ss.android.ugc.aweme.creative.model.music.AVMusic, boolean, boolean, boolean, boolean, long, boolean, com.ss.android.ugc.aweme.shortvideo.model.MultiChoose, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }
}
