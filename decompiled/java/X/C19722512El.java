package X;

import Y.AObserverS189S0200000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localcache.IVideoCache;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.MediaPayload;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEPreviewParams;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS110S0201000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.12El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19722512El extends AbstractC1664470tPp<C18VS, C19723012Eq, C19723312Et> implements C18VS, InterfaceC379610EuV {
    public static final C19723112Er LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public AbstractC1452680nuE LLIZLLLIL;
    public InterfaceC1452170ntP LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public InterfaceC19722312Ej LLJILJILJ;
    public final SafeHandler LLJILLL;
    public AbstractC2199801B7q LLJJ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C18VO.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(302));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 385));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12Er] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19722512El.class, "sessionInfo", "getSessionInfo()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19722512El.class, "inputApi", "getInputApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatInputFeatureApi;", 0)};
        LLJJIII = new Object() { // from class: X.12Er
        };
        LLJJIJIIJIL = 8;
    }

    private final InterfaceC1354700lMC E3() {
        return (InterfaceC1354700lMC) this.LLIZ.getValue();
    }

    private final C18UJ Q3() {
        return (C18UJ) this.LLILZIL.getValue(this, LLJJIJI[0]);
    }

    private final C214799194j e4() {
        return (C214799194j) this.LLJJI.getValue();
    }

    private final int k5() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        return interfaceC1452170ntP != null ? interfaceC1452170ntP.LLL() : T2().LJ;
    }

    public final void C5() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        Bitmap currDisplayImage = interfaceC1452170ntP != null ? interfaceC1452170ntP.getCurrDisplayImage() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCoverFrameInState: ");
        sbLIZ.append(currDisplayImage != null);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        if (currDisplayImage != null) {
            i3(new AwS395S0200000_29(currDisplayImage, this, 53));
        }
    }

    public final void D5() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        Bitmap currDisplayImage = interfaceC1452170ntP != null ? interfaceC1452170ntP.getCurrDisplayImage() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVideoPreviewContent: ");
        sbLIZ.append(currDisplayImage != null);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        if (currDisplayImage != null) {
            i3(new AwS608S0100000_29(currDisplayImage, 451));
        }
    }

    public final C18VO O3() {
        return (C18VO) this.LLILZLL.getValue(this, LLJJIJI[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19723012Eq> o2() {
        return AFwS218S0000000_29.get$arr$(301);
    }

    @Override // X.C18VS
    public void show() {
        Context contextRequireSceneContext = this.LLILLL.requireSceneContext();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(contextRequireSceneContext, "ai_chat_extract_frames_scene", true)) {
            return;
        }
        e4().LLLLL(this.LLILLL);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19723312Et> w2() {
        return new AwS573S0100000_29(this, 749);
    }

    @Override // X.C18VS
    public void hide() {
        e4().LLLLIL();
    }

    public final void n5() {
        if (k5() != 0) {
            v5(0);
            i3(AFwS273S0000000_29.get$arr$(259));
        }
    }

    public final C19722712En o4() {
        AIChatPayload aIChatPayload;
        List<MediaPayload> list;
        MediaPayload mediaPayload;
        AIChatPageConfig aIChatPageConfig = Q3().LJI;
        if (aIChatPageConfig == null || (aIChatPayload = aIChatPageConfig.payload) == null || (list = aIChatPayload.medias) == null || (mediaPayload = (MediaPayload) C13LP.LJJJLL(list)) == null || !(mediaPayload instanceof MediaPayload.VideoCover)) {
            return null;
        }
        MediaPayload.VideoCover videoCover = (MediaPayload.VideoCover) mediaPayload;
        return new C19722712En(videoCover.videoUrl, videoCover.videoDuration, videoCover.videoWidth, videoCover.videoHeight, videoCover.coverUrl, videoCover.videoLocalPath, videoCover.videoAweme);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL = null;
        this.LLJ = null;
        C19722812Eo.LIZ(this.LLJJ);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final C19A3 getParentScene() {
        return this.LLILLL;
    }

    private final Pair<String, String> B3(C19722712En c19722712En) {
        Video video;
        VideoUrlModel playAddrH264;
        String bitRatedRatioUri;
        String strAiChatExtractFrameDir;
        String strLIZIZ;
        IConfigService iConfigServiceConfigService;
        ICacheService iCacheServiceCacheConfig;
        Aweme aweme = c19722712En.LJI;
        if (aweme == null || (video = aweme.getVideo()) == null || (playAddrH264 = video.getPlayAddrH264()) == null || (bitRatedRatioUri = playAddrH264.getBitRatedRatioUri()) == null) {
            return null;
        }
        String strLIZJ = C08HM.LIZJ(bitRatedRatioUri);
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iConfigServiceConfigService = iExternalService.configService()) == null || (iCacheServiceCacheConfig = iConfigServiceConfigService.cacheConfig()) == null || (strAiChatExtractFrameDir = iCacheServiceCacheConfig.aiChatExtractFrameDir()) == null) {
            strAiChatExtractFrameDir = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(".mp4");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (u.LJIIZILJ(strAiChatExtractFrameDir, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strAiChatExtractFrameDir);
            sbLIZ2.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strAiChatExtractFrameDir);
            sbLIZ3.append(File.separator);
            sbLIZ3.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        return new Pair<>(strLIZIZ2, strLIZIZ);
    }

    private final void v3(String str) {
        int i;
        boolean z;
        if (str != null && str.length() != 0) {
            InterfaceC1286300jZs interfaceC1286300jZs = new InterfaceC1286300jZs() { // from class: X.12Em
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                    C2265108u9.LIZJ();
                    if (byteBuffer != null) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("extractFrames: width: ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", height: ");
                        sbLIZ.append(i3);
                        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                        C19722512El c19722512El = this.LIZ;
                        LifecycleOwnerExtensionsKt.LIZJ(c19722512El, new ARunnableS98S0200000_29(c19722512El, bitmapCreateBitmap, 36));
                        return true;
                    }
                    return true;
                }
            };
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
            if (videoFileInfo != null) {
                int i2 = videoFileInfo.width;
                int i3 = videoFileInfo.height;
                if (i2 < i3) {
                    i = i3;
                } else {
                    i = i2;
                }
                Pair<Integer, Integer> pairQ3 = q3(i2, i3, i);
                int iIntValue = pairQ3.getFirst().intValue();
                int iIntValue2 = pairQ3.getSecond().intValue();
                if (Math.min(videoFileInfo.width, videoFileInfo.height) >= 1080) {
                    z = true;
                } else {
                    z = false;
                }
                VEUtils.getVideoFrames(str, new int[]{0}, iIntValue, iIntValue2, true, true, interfaceC1286300jZs, z);
            }
        }
    }

    private final void v5(int i) {
        if (i < 0) {
            return;
        }
        C1452730nuJ c1452730nuJLIZLLL = C1452730nuJ.LIZLLL(i);
        AbstractC1452680nuE abstractC1452680nuE = this.LLIZLLLIL;
        if (abstractC1452680nuE != null) {
            abstractC1452680nuE.LJIIIZ(c1452730nuJLIZLLL);
        }
        F4(new ARunnableS129S0100000_29(this, 113));
    }

    public final void F4(final Runnable runnable) {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.df(new InterfaceC1464200oCo() { // from class: X.12Ep
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == 4101) {
                        this.LL.LLJILLL.post(runnable);
                        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LL.LLJ;
                        if (interfaceC1452170ntP2 != null) {
                            interfaceC1452170ntP2.Gf(this);
                        }
                    }
                }
            });
        }
    }

    public final int H3(float f) {
        if (this.LLJ != null) {
            return (int) (r0.getDuration() * f);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.11hc] */
    public final void H4(AbstractC1452680nuE abstractC1452680nuE) {
        String str;
        this.LLIZLLLIL = abstractC1452680nuE;
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuE.LJJ();
        this.LLJ = interfaceC1452170ntPLJJ;
        int duration = interfaceC1452170ntPLJJ.getDuration();
        int i = duration / LSPassThroughRecordSizeConfig.DEFAULT;
        boolean z = true;
        if (i < 1) {
            i = 1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEditorReady duration=");
        sbLIZ.append(duration);
        sbLIZ.append(", coverCount=");
        sbLIZ.append(i);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        final VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(interfaceC1452170ntPLJJ, this.LLILLL, i, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT, "choose_cover");
        ?? r6 = new InterfaceC19571111hd() { // from class: X.11hc
            @Override // X.InterfaceC1447630nm5
            public final int LIZ() {
                return vEVideoCoverGeneratorImpl.LL;
            }

            @Override // X.InterfaceC1447630nm5
            public final void reset() {
                vEVideoCoverGeneratorImpl.reset();
            }

            @Override // X.InterfaceC1447630nm5
            public final void LIZIZ(int i2, int i3, InterfaceC1699590uKT interfaceC1699590uKT) {
                vEVideoCoverGeneratorImpl.LIZIZ(i2, i3, interfaceC1699590uKT);
            }
        };
        D5();
        C19722712En c19722712En = T2().LIZ;
        Bitmap currDisplayImage = null;
        if (c19722712En == null || (str = c19722712En.LJ) == null || str.length() == 0) {
            currDisplayImage = interfaceC1452170ntPLJJ.getCurrDisplayImage();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onEditorReady: firstFrame is Null ");
        if (currDisplayImage != null) {
            z = false;
        }
        sbLIZ2.append(z);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ2));
        i3(new AwS110S0201000_29(currDisplayImage, duration, (C19571011hc) r6, 4));
        if (this.LLJILJIL != null) {
            CommentService.LIZ.getClass();
            if (C523420Kfs.LIZ().LJIIJJI()) {
                v3(this.LLJILJIL);
            }
        }
    }

    public final void Z4(C19722712En c19722712En) {
        Integer numValueOf;
        String str;
        Object objValueOf;
        String string;
        String str2;
        Aweme aweme;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJI;
        AIChatGenChatRoomModel aIChatGenChatRoomModel = Q3().LJ.chatRoomModel;
        Boolean bool = null;
        if (aIChatGenChatRoomModel != null) {
            numValueOf = Integer.valueOf(aIChatGenChatRoomModel.quota);
            bool = aIChatGenChatRoomModel.isNewUser;
        } else {
            numValueOf = null;
        }
        if (aIChatGenChatRoomModel == null || (str = aIChatGenChatRoomModel.enterMethod) == null) {
            str = "";
        }
        C0LAB c0lab = new C0LAB();
        if (c19722712En == null || (aweme = c19722712En.LJI) == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c0lab.LIZLLL(objValueOf, "aweme_type");
        c0lab.LJ("shoot_way", "photo_comment");
        c0lab.LJ("shoot_enter_method", str);
        c0lab.LJ("function_type", "capture_frame");
        c0lab.LJ("image_input_type", "capture_frame");
        if (numValueOf == null || (string = numValueOf.toString()) == null) {
            string = "";
        }
        c0lab.LJ("vp_process_cnt", string);
        c0lab.LJ("duration", String.valueOf(jCurrentTimeMillis));
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_vp_new_user", str2);
        } else {
            c0lab.LJ("is_vp_new_user", "");
        }
        C18UP.LIZ.getClass();
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("ttcrt_vp_image_input_result", c0lab.LIZ);
    }

    public final void d5(C19722712En c19722712En) {
        Integer numValueOf;
        String str;
        Object objValueOf;
        String string;
        String str2;
        Aweme aweme;
        AIChatGenChatRoomModel aIChatGenChatRoomModel = Q3().LJ.chatRoomModel;
        Boolean bool = null;
        if (aIChatGenChatRoomModel != null) {
            numValueOf = Integer.valueOf(aIChatGenChatRoomModel.quota);
            bool = aIChatGenChatRoomModel.isNewUser;
        } else {
            numValueOf = null;
        }
        if (aIChatGenChatRoomModel == null || (str = aIChatGenChatRoomModel.enterMethod) == null) {
            str = "";
        }
        C0LAB c0lab = new C0LAB();
        if (c19722712En == null || (aweme = c19722712En.LJI) == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c0lab.LIZLLL(objValueOf, "aweme_type");
        c0lab.LJ("shoot_way", "photo_comment");
        c0lab.LJ("shoot_enter_method", str);
        c0lab.LJ("function_type", "capture_frame");
        if (numValueOf == null || (string = numValueOf.toString()) == null) {
            string = "";
        }
        c0lab.LJ("vp_process_cnt", string);
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_vp_new_user", str2);
        } else {
            c0lab.LJ("is_vp_new_user", "");
        }
        C18UP.LIZ.getClass();
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("ttcrt_vp_image_input_panel_show", c0lab.LIZ);
    }

    public C19722512El(C19A3 c19a3, C1DRG c1drg) {
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLJILLL = new SafeHandler(c19a3);
    }

    private final void O4(C19722712En c19722712En, long j) {
        String groupId;
        String string;
        Aweme aweme;
        String str = "";
        if (c19722712En == null || (aweme = c19722712En.LJI) == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("item_id", groupId);
        c0lab.LJ("duration", String.valueOf(j));
        c0lab.LJ("content_type", "video");
        if (c19722712En != null && (string = Long.valueOf(c19722712En.LIZIZ).toString()) != null) {
            str = string;
        }
        c0lab.LJ("video_duration", str);
        C20684815ws.LJIILLIIL("ai_comment_fe_page_monitor", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12Ei] */
    public final void P4(final C19722712En c19722712En, boolean z) {
        String str;
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareVideo: isRetry=");
        sbLIZ.append(z);
        sbLIZ.append(", videoUrl:");
        String str2 = null;
        if (c19722712En != null) {
            str = c19722712En.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", coverUrl:");
        if (c19722712En != null) {
            str2 = c19722712En.LJ;
        }
        sbLIZ.append(str2);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        if (c19722712En == null) {
            i3(AFwS273S0000000_29.get$arr$(258));
            return;
        }
        final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 450);
        final AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 748);
        final String str3 = c19722712En.LIZ;
        if (str3.length() == 0) {
            return;
        }
        String str4 = c19722712En.LJFF;
        if (str4 != null && str4.length() != 0 && new C0VSJ(str4).exists()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(System.currentTimeMillis() - this.LLJI));
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            K4(c19722712En, jLongValue, true, "local_storage");
            awS608S0100000_29.invoke(str4);
            return;
        }
        Pair<String, String> pairB3 = B3(c19722712En);
        if (pairB3 == null) {
            return;
        }
        final String first = pairB3.getFirst();
        final String second = pairB3.getSecond();
        Aweme aweme = c19722712En.LJI;
        if (aweme != null) {
            IVideoCache iVideoCache = (IVideoCache) PluggableExtentionKt.pluggableSpi$default(IVideoCache.class, false, false, false, 14, null);
            if (iVideoCache != 0) {
                iVideoCache.LIZ(aweme, second, new InterfaceC1475840oVa() { // from class: X.12Ei
                    @Override // X.InterfaceC1475840oVa
                    public final /* synthetic */ void LIZ(long j, long j2) {
                    }

                    @Override // X.InterfaceC1475840oVa
                    public final void LIZIZ(int i) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("prepareVideo: copyCache onCopyError = ");
                        sbLIZ2.append(i);
                        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ2));
                        C19722512El c19722512El = this;
                        String str5 = str3;
                        String str6 = first;
                        String parent = new C0VSJ(second).getParent();
                        if (parent == null) {
                            parent = "";
                        }
                        c19722512El.x5(str5, str6, parent, c19722712En, this.LLJI, awS608S0100000_29, awS573S0100000_29);
                    }

                    @Override // X.InterfaceC1475840oVa
                    public final void onCopyComplete(boolean z2, int i, String str5) {
                        long jLongValue2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("prepareVideo: copyCache onCopyComplete: isSuccess=");
                        sbLIZ2.append(z2);
                        sbLIZ2.append(", errorCode=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", desc=");
                        sbLIZ2.append(str5);
                        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ2));
                        if (z2 && new C0VSJ(second).exists()) {
                            String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJI);
                            C19722512El c19722512El = this;
                            C19722712En c19722712En2 = c19722712En;
                            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(strValueOf);
                            if (lLJIILIIL2 != null) {
                                jLongValue2 = lLJIILIIL2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            c19722512El.K4(c19722712En2, jLongValue2, true, "mdl_cache");
                            awS608S0100000_29.invoke(second);
                            return;
                        }
                        C19722512El c19722512El2 = this;
                        String str6 = str3;
                        String str7 = first;
                        String parent = new C0VSJ(second).getParent();
                        if (parent == null) {
                            parent = "";
                        }
                        c19722512El2.x5(str6, str7, parent, c19722712En, this.LLJI, awS608S0100000_29, awS573S0100000_29);
                    }
                });
                return;
            }
            return;
        }
        String parent = new C0VSJ(second).getParent();
        if (parent == null) {
            parent = "";
        }
        x5(str3, first, parent, c19722712En, this.LLJI, awS608S0100000_29, awS573S0100000_29);
    }

    public final void t5(Bitmap bitmap, Function1<? super String, Unit> function1) {
        String strLIZ;
        C0VSJ c0vsj;
        File parentFile;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extract_frame_");
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1354700lMC interfaceC1354700lMCE3 = E3();
        if (interfaceC1354700lMCE3 != null) {
            strLIZ = interfaceC1354700lMCE3.LIZ(strLIZIZ, ".png");
        } else {
            strLIZ = null;
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            c0vsj = new C0VSJ(strLIZ);
        } else {
            File fileW2 = C786410Ut5.w2(this.LLILLL.requireSceneContext());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(".png");
            c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        try {
            File parentFile2 = c0vsj.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = c0vsj.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            C0VSV c0vsv = new C0VSV(c0vsj);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                c0vsv.flush();
                C2107108Nh.LIZ(c0vsv, null);
                function1.invoke(c0vsj.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                } catch (Exception e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    function1.invoke(null);
                                    C21290818Tq.LIZIZ("AiChatExtractFramesComp", "saveBitmap failed", e);
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void z4(String str, SurfaceView surfaceView) {
        int i;
        int i2;
        Integer numValueOf;
        String strAiChatExtractFrameDir;
        long j;
        IConfigService iConfigServiceConfigService;
        ICacheService iCacheServiceCacheConfig;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initEditorsWithVideo: videoPath=");
        sbLIZ.append(str);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ));
        if (a0.LJJJIL(str)) {
            i3(AFwS273S0000000_29.get$arr$(257));
            return;
        }
        if (!this.LLJIJIL && this.LLJI > 0) {
            O4(T2().LIZ, System.currentTimeMillis() - this.LLJI);
            this.LLJIJIL = true;
        }
        o.LJFF(C2216131BoR.LIZ());
        EnumC1441790ncf enumC1441790ncf = EnumC1441790ncf.DEFAULT;
        C1441890ncp c1441890ncp = new C1441890ncp(enumC1441790ncf.getValue(), C0BWE.LIZ(), enumC1441790ncf.getValue());
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo != null) {
            i = videoFileInfo.width;
            i2 = videoFileInfo.height;
        } else {
            i = 720;
            i2 = 1080;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initEditorsWithVideo w=");
        sbLIZ2.append(i);
        sbLIZ2.append(", h=");
        sbLIZ2.append(i2);
        sbLIZ2.append(", duration=");
        if (videoFileInfo != null) {
            numValueOf = Integer.valueOf(videoFileInfo.duration);
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        C21290818Tq.LIZJ("AiChatExtractFramesComp", C2188811AlT.LIZIZ(sbLIZ2));
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iConfigServiceConfigService = iExternalService.configService()) == null || (iCacheServiceCacheConfig = iConfigServiceConfigService.cacheConfig()) == null || (strAiChatExtractFrameDir = iCacheServiceCacheConfig.aiChatExtractFrameDir()) == null) {
            strAiChatExtractFrameDir = "";
        }
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        vEPreviewParams.mVideoPaths = new String[]{str};
        vEPreviewParams.mWorkspace = strAiChatExtractFrameDir;
        vEPreviewParams.interceptAutoPlay = true;
        vEPreviewParams.mEnableAutoStart = false;
        vEPreviewParams.mCanvasWidth = i;
        vEPreviewParams.mCanvasHeight = i2;
        vEPreviewParams.mPreviewWidth = i;
        vEPreviewParams.mPreviewHeight = i2;
        vEPreviewParams.mPageMode = 102;
        if (videoFileInfo != null) {
            j = videoFileInfo.duration;
        } else {
            j = 1000;
        }
        C0FGC.LIZ(2);
        C1419820n3E.LIZ.LIZ();
        long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        nLETrack.setStartTime(0L);
        nLETrack.setEndTime(j2);
        nLETrack.setDuration(j2);
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(0L);
        nLETrackSlot.setEndTime(j2);
        nLETrackSlot.setDuration(j2);
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(NLEResType.VIDEO);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(j2);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrack.addSlot(nLETrackSlot);
        c1441890ncp.LJIIL = nLETrack;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(vEPreviewParams);
        c1441890ncp.LIZLLL = mutableLiveData;
        c1441890ncp.LJ = new MutableLiveData();
        c1441890ncp.LIZ(this.LLILLL.requireSceneContext(), this, surfaceView);
        c1441890ncp.LJI.observe(this.LLILLL, new AObserverS189S0200000_29(this, c1441890ncp, 1));
    }

    private final Pair<Integer, Integer> q3(int i, int i2, int i3) {
        if (i > i2) {
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf((int) (i3 * (i2 / i))));
        }
        return new Pair<>(Integer.valueOf((int) (i3 * (i / i2))), Integer.valueOf(i3));
    }

    public final void K4(C19722712En c19722712En, long j, boolean z, String str) {
        String groupId;
        String str2;
        String string;
        Aweme aweme;
        C0LAB c0lab = new C0LAB();
        String str3 = "";
        if (c19722712En == null || (aweme = c19722712En.LJI) == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        c0lab.LJ("item_id", groupId);
        c0lab.LJ("duration", String.valueOf(j));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_success", str2);
        c0lab.LJ("download_source", str);
        if (c19722712En != null && (string = Long.valueOf(c19722712En.LIZIZ).toString()) != null) {
            str3 = string;
        }
        c0lab.LJ("video_duration", str3);
        C20684815ws.LJIILLIIL("ai_comment_video_download", c0lab.LIZ);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.12Eh] */
    public final void x5(String str, final String str2, final String str3, final C19722712En c19722712En, final long j, final Function1<? super String, Unit> function1, final Function0<Unit> function0) {
        ?? r2 = new AbsDownloadListener() { // from class: X.12Eh
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String strLIZIZ;
                long jLongValue;
                super.onSuccessed(downloadInfo);
                String str4 = str3;
                String str5 = File.separator;
                if (u.LJIIZILJ(str4, str5, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str5);
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - j);
                C19722512El c19722512El = this;
                C19722712En c19722712En2 = c19722712En;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(strValueOf);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                c19722512El.K4(c19722712En2, jLongValue, true, "network");
                function1.invoke(strLIZIZ);
                C21290818Tq.LIZJ("AiChatExtractFramesComp", "startDownload: onSuccessed");
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                long jLongValue;
                super.onFailed(downloadInfo, baseException);
                String strValueOf = String.valueOf(System.currentTimeMillis() - j);
                C19722512El c19722512El = this;
                C19722712En c19722712En2 = c19722712En;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(strValueOf);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                c19722512El.K4(c19722712En2, jLongValue, false, "network");
                function0.invoke();
                C21290818Tq.LIZIZ("AiChatExtractFramesComp", "startDownload: onFailed", baseException);
            }
        };
        C19722812Eo.LIZ(this.LLJJ);
        C19723412Eu c19723412Eu = new C19723412Eu(r2);
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJ = str3;
        abstractC2199801B7qWith.LJIIL = c19723412Eu;
        abstractC2199801B7qWith.LIZJ();
        this.LLJJ = abstractC2199801B7qWith;
    }
}
