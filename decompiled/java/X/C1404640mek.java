package X;

import android.app.ActivityManager;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.publish.TrackParams;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404640mek extends AbstractC1446660nkW {
    public final Function0<Boolean> LJ;
    public VideoPublishEditModel LJFF;
    public C1405220mfg LJI;
    public C1404570med LJII;
    public PublishModel LJIIIIZZ;
    public InterfaceC1434300nQa LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public int LJIIL;

    public final C0LAB LJII() {
        C1404570med c1404570med = this.LJII;
        if (c1404570med == null) {
            c1404570med = null;
        }
        C1420470n4H c1420470n4H = new C1420470n4H(c1404570med.LIZ);
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel != null ? videoPublishEditModel : null;
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel2);
        c1420470n4H.LIZ(videoPublishEditModel2, c0labLJFF);
        return c0labLJFF;
    }

    public C1404640mek(Function0<Boolean> function0) {
        super(2, EnumC1434770nRL.COMPILE);
        this.LJ = function0;
        this.LJIIJJI = -2;
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        String str;
        String str2;
        String str3;
        float f;
        String str4;
        String str5;
        String str6;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            InterfaceC1434300nQa interfaceC1434300nQa = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJFF = ((C1434960nRe) next).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJIIIIZZ = ((C1434970nRf) next2).LIZ;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C1405220mfg) {
                                        if (next3 != null) {
                                            this.LJI = (C1405220mfg) next3;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it5.next();
                                                if (next4 instanceof C1404570med) {
                                                    if (next4 != null) {
                                                        this.LJII = (C1404570med) next4;
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof InterfaceC1434300nQa) {
                                                                if (next5 != null) {
                                                                    this.LJIIIZ = (InterfaceC1434300nQa) next5;
                                                                    SystemClock.uptimeMillis();
                                                                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                                                                    if (videoPublishEditModel == null) {
                                                                        videoPublishEditModel = null;
                                                                    }
                                                                    TrackParams trackParams = videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams;
                                                                    trackParams.compileBeginScene = trackParams.currentScene;
                                                                    trackParams.compileBeginDuration = System.currentTimeMillis() - videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.currentSceneStartTime;
                                                                    Application application = C0CHQ.LIZ;
                                                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                                                    C2204961BRm.LJFF((ActivityManager) C786410Ut5.H2(application, "activity"), memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCbVL/HHVZso=", null));
                                                                    long j = 1024;
                                                                    int i = (int) ((memoryInfo.totalMem / j) / j);
                                                                    C0LAB c0labLJII = LJII();
                                                                    VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                                                                    if (videoPublishEditModel2 == null) {
                                                                        videoPublishEditModel2 = null;
                                                                    }
                                                                    c0labLJII.LJ("resolution", videoPublishEditModel2.getVideoResolution());
                                                                    boolean zEnableHardEncodeForRecord = AVSettingsWrapper.enableHardEncodeForRecord();
                                                                    String str7 = CardStruct.IStatusCode.DEFAULT;
                                                                    if (zEnableHardEncodeForRecord) {
                                                                        str = "1";
                                                                    } else {
                                                                        str = CardStruct.IStatusCode.DEFAULT;
                                                                    }
                                                                    c0labLJII.LJ("is_hardcode", str);
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                                                                    if (videoPublishEditModel3 == null) {
                                                                        videoPublishEditModel3 = null;
                                                                    }
                                                                    sbLIZ.append(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel3));
                                                                    sbLIZ.append("");
                                                                    c0labLJII.LJ("bite_rate", C2188811AlT.LIZIZ(sbLIZ));
                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                    sbLIZ2.append(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality());
                                                                    sbLIZ2.append("");
                                                                    c0labLJII.LJ("video_quality", C2188811AlT.LIZIZ(sbLIZ2));
                                                                    c0labLJII.LJ("_perf_monitor", "1");
                                                                    C1404570med c1404570med = this.LJII;
                                                                    if (c1404570med == null) {
                                                                        c1404570med = null;
                                                                    }
                                                                    c0labLJII.LIZLLL(c1404570med, "publish_id");
                                                                    PublishModel publishModel = this.LJIIIIZZ;
                                                                    if (publishModel == null) {
                                                                        publishModel = null;
                                                                    }
                                                                    c0labLJII.LIZ(publishModel.publishType, "pre_publish_type");
                                                                    PublishModel publishModel2 = this.LJIIIIZZ;
                                                                    if (publishModel2 == null) {
                                                                        publishModel2 = null;
                                                                    }
                                                                    c0labLJII.LIZ(publishModel2.publishType, "publish_type");
                                                                    SettingsManager.LIZLLL().getClass();
                                                                    int i2 = 0;
                                                                    if (SettingsManager.LIZ("tool_enable_privacy_preupload_switch", false)) {
                                                                        str2 = "1";
                                                                    } else {
                                                                        str2 = CardStruct.IStatusCode.DEFAULT;
                                                                    }
                                                                    c0labLJII.LJ("user_enable_pre_publish", str2);
                                                                    if (C0CHQ.LIZ().LJJIIZI().LJJIIZ()) {
                                                                        str3 = "1";
                                                                    } else {
                                                                        str3 = CardStruct.IStatusCode.DEFAULT;
                                                                    }
                                                                    c0labLJII.LJ("feature_enable_pre_publish", str3);
                                                                    C1699250uJv c1699250uJv = C1699250uJv.LLILLL;
                                                                    c1699250uJv.getClass();
                                                                    int i3 = (int) (0 / j);
                                                                    c0labLJII.LIZ(i - i3, "total_available_memory_mb");
                                                                    if (i <= 0) {
                                                                        f = 1.0f;
                                                                    } else {
                                                                        c1699250uJv.getClass();
                                                                        float f2 = i;
                                                                        f = (f2 - i3) / f2;
                                                                    }
                                                                    c0labLJII.LIZJ(Float.valueOf(f), "total_available_memory_percentage");
                                                                    c0labLJII.LIZ(i, "total_memory_mb");
                                                                    c0labLJII.LIZ((int) ((Runtime.getRuntime().maxMemory() / j) / j), "jvm_allow_memory_mb");
                                                                    c0labLJII.LIZ(((int) ((Runtime.getRuntime().maxMemory() / j) / j)) - ((int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j) / j)), "jvm_available_memory_mb");
                                                                    c0labLJII.LIZJ(Float.valueOf(((int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j) / j)) / ((int) ((Runtime.getRuntime().maxMemory() / j) / j))), "jvm_available_memory_percentage");
                                                                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                                                                    if (videoPublishEditModel4 == null) {
                                                                        videoPublishEditModel4 = null;
                                                                    }
                                                                    c0labLJII.LIZ(videoPublishEditModel4.videoFps(false), "fps");
                                                                    PublishModel publishModel3 = this.LJIIIIZZ;
                                                                    if (publishModel3 == null) {
                                                                        publishModel3 = null;
                                                                    }
                                                                    c0labLJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
                                                                    VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                                                                    if (videoPublishEditModel5 == null) {
                                                                        videoPublishEditModel5 = null;
                                                                    }
                                                                    c0labLJII.LIZ(videoPublishEditModel5.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                                                                    VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                                                                    if (videoPublishEditModel6 == null) {
                                                                        videoPublishEditModel6 = null;
                                                                    }
                                                                    c0labLJII.LIZ(videoPublishEditModel6.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                                                                    VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
                                                                    if (videoPublishEditModel7 == null) {
                                                                        videoPublishEditModel7 = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(videoPublishEditModel7.mShootWay)) {
                                                                        VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
                                                                        if (videoPublishEditModel8 == null) {
                                                                            videoPublishEditModel8 = null;
                                                                        }
                                                                        c0labLJII.LJ("shoot_way", videoPublishEditModel8.mShootWay);
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
                                                                    if (videoPublishEditModel9 == null) {
                                                                        videoPublishEditModel9 = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(videoPublishEditModel9.getClientId())) {
                                                                        VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
                                                                        if (videoPublishEditModel10 == null) {
                                                                            videoPublishEditModel10 = null;
                                                                        }
                                                                        c0labLJII.LJ("channel", videoPublishEditModel10.getClientId());
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel11 = this.LJFF;
                                                                    if (videoPublishEditModel11 == null) {
                                                                        videoPublishEditModel11 = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(videoPublishEditModel11.getShareId())) {
                                                                        VideoPublishEditModel videoPublishEditModel12 = this.LJFF;
                                                                        if (videoPublishEditModel12 == null) {
                                                                            videoPublishEditModel12 = null;
                                                                        }
                                                                        c0labLJII.LJ("open_platform_share_id", videoPublishEditModel12.getShareId());
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel13 = this.LJFF;
                                                                    if (videoPublishEditModel13 == null) {
                                                                        videoPublishEditModel13 = null;
                                                                    }
                                                                    if (TextUtils.equals(C1428470nHB.LJIILIIL(videoPublishEditModel13), "upload")) {
                                                                        VideoPublishEditModel videoPublishEditModel14 = this.LJFF;
                                                                        if (videoPublishEditModel14 == null) {
                                                                            videoPublishEditModel14 = null;
                                                                        }
                                                                        c0labLJII.LIZ(C1428470nHB.LJJLIIIJ(videoPublishEditModel14) ? 1 : 0, "is_fast_import");
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel15 = this.LJFF;
                                                                    if (videoPublishEditModel15 == null) {
                                                                        videoPublishEditModel15 = null;
                                                                    }
                                                                    c0labLJII.LJ("creation_id", videoPublishEditModel15.getCreationId());
                                                                    VideoPublishEditModel videoPublishEditModel16 = this.LJFF;
                                                                    if (videoPublishEditModel16 == null) {
                                                                        videoPublishEditModel16 = null;
                                                                    }
                                                                    c0labLJII.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel16));
                                                                    VideoPublishEditModel videoPublishEditModel17 = this.LJFF;
                                                                    if (videoPublishEditModel17 == null) {
                                                                        videoPublishEditModel17 = null;
                                                                    }
                                                                    c0labLJII.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel17));
                                                                    int i4 = this.LJIIJJI;
                                                                    if (i4 != 0) {
                                                                        c0labLJII.LIZ(i4, "notRemuxErrorcode");
                                                                    }
                                                                    C1405220mfg c1405220mfg = this.LJI;
                                                                    if (c1405220mfg == null) {
                                                                        c1405220mfg = null;
                                                                    }
                                                                    c0labLJII.LIZ(c1405220mfg.LIZIZ ? 1 : 0, "is_click_publish");
                                                                    VideoPublishEditModel videoPublishEditModel18 = this.LJFF;
                                                                    if (videoPublishEditModel18 == null) {
                                                                        videoPublishEditModel18 = null;
                                                                    }
                                                                    ShareKitPanel shareKitPanel = videoPublishEditModel18.getCreativeFlowData().getShareKitPanel();
                                                                    if (shareKitPanel != null) {
                                                                        c0labLJII.LJ("effect_resource_id", shareKitPanel.getEffectResourceId());
                                                                        c0labLJII.LJ("channel", shareKitPanel.getClientKey());
                                                                        c0labLJII.LJ("share_panel_option", shareKitPanel.getSharePanelOption());
                                                                        c0labLJII.LIZLLL(shareKitPanel.getShareMediaType(), "share_media_type");
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel19 = this.LJFF;
                                                                    if (videoPublishEditModel19 == null) {
                                                                        videoPublishEditModel19 = null;
                                                                    }
                                                                    C1402840mbq c1402840mbqLIZLLL = C1B46.LIZLLL(videoPublishEditModel19);
                                                                    if (c1402840mbqLIZLLL != null) {
                                                                        c0labLJII.LJ("channel", c1402840mbqLIZLLL.mClientKey);
                                                                        c0labLJII.LJ("sdk_name", c1402840mbqLIZLLL.getSdkNameForServer());
                                                                        c0labLJII.LJ("sdk_version", c1402840mbqLIZLLL.mSdkVersion);
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel20 = this.LJFF;
                                                                    if (videoPublishEditModel20 == null) {
                                                                        videoPublishEditModel20 = null;
                                                                    }
                                                                    if (videoPublishEditModel20.getCreativeFlowData().getEditorProModel() != null) {
                                                                        VideoPublishEditModel videoPublishEditModel21 = this.LJFF;
                                                                        if (videoPublishEditModel21 == null) {
                                                                            videoPublishEditModel21 = null;
                                                                        }
                                                                        if (videoPublishEditModel21.getEditorProModel().isAdvancedEdit()) {
                                                                            str5 = "1";
                                                                        } else {
                                                                            str5 = CardStruct.IStatusCode.DEFAULT;
                                                                        }
                                                                        c0labLJII.LJ("is_use_editor_pro", str5);
                                                                        VideoPublishEditModel videoPublishEditModel22 = this.LJFF;
                                                                        if (videoPublishEditModel22 == null) {
                                                                            videoPublishEditModel22 = null;
                                                                        }
                                                                        if (videoPublishEditModel22.getEditorProModel().isPipUsed()) {
                                                                            str6 = "1";
                                                                        } else {
                                                                            str6 = CardStruct.IStatusCode.DEFAULT;
                                                                        }
                                                                        c0labLJII.LJ("is_use_pip", str6);
                                                                        C0EMG c0emg = C0EMG.LIZ;
                                                                        VideoPublishEditModel videoPublishEditModel23 = this.LJFF;
                                                                        if (videoPublishEditModel23 == null) {
                                                                            videoPublishEditModel23 = null;
                                                                        }
                                                                        c0emg.getClass();
                                                                        c0labLJII.LJ("all_editor_pro_used_functions", C0EMG.LIZ(videoPublishEditModel23));
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel24 = this.LJFF;
                                                                    if (videoPublishEditModel24 == null) {
                                                                        videoPublishEditModel24 = null;
                                                                    }
                                                                    ArrayList<EffectPointModel> effectList = videoPublishEditModel24.getEffectList();
                                                                    if ((effectList instanceof Collection) && effectList.isEmpty()) {
                                                                        str4 = CardStruct.IStatusCode.DEFAULT;
                                                                    } else {
                                                                        Iterator<EffectPointModel> it7 = effectList.iterator();
                                                                        while (it7.hasNext()) {
                                                                            if (it7.next().getIsNewEngineEffect().booleanValue()) {
                                                                                str4 = "1";
                                                                                break;
                                                                            }
                                                                        }
                                                                        str4 = CardStruct.IStatusCode.DEFAULT;
                                                                    }
                                                                    c0labLJII.LJ("is_use_CC_effect", str4);
                                                                    VideoPublishEditModel videoPublishEditModel25 = this.LJFF;
                                                                    if (videoPublishEditModel25 == null) {
                                                                        videoPublishEditModel25 = null;
                                                                    }
                                                                    if (videoPublishEditModel25.hasTextSticker()) {
                                                                        str7 = "1";
                                                                    }
                                                                    c0labLJII.LJ("text_added", str7);
                                                                    VideoPublishEditModel videoPublishEditModel26 = this.LJFF;
                                                                    if (videoPublishEditModel26 == null) {
                                                                        videoPublishEditModel26 = null;
                                                                    }
                                                                    Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel26);
                                                                    if (pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() > 1) {
                                                                        i2 = 1;
                                                                    }
                                                                    c0labLJII.LIZ(i2, "is_multi_content");
                                                                    VideoPublishEditModel videoPublishEditModel27 = this.LJFF;
                                                                    if (videoPublishEditModel27 == null) {
                                                                        videoPublishEditModel27 = null;
                                                                    }
                                                                    c0labLJII.LIZ(C1428470nHB.LJJIL(videoPublishEditModel27), "source_is_hdr");
                                                                    VideoPublishEditModel videoPublishEditModel28 = this.LJFF;
                                                                    if (videoPublishEditModel28 == null) {
                                                                        videoPublishEditModel28 = null;
                                                                    }
                                                                    if (C1428470nHB.LJJZZI(videoPublishEditModel28)) {
                                                                        VideoPublishEditModel videoPublishEditModel29 = this.LJFF;
                                                                        if (videoPublishEditModel29 == null) {
                                                                            videoPublishEditModel29 = null;
                                                                        }
                                                                        c0labLJII.LIZ(C1428470nHB.LJJJJLL(videoPublishEditModel29) ? 1 : 0, "is_canvas_as_image");
                                                                    }
                                                                    Map<String, String> map = c0labLJII.LIZ;
                                                                    InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIZ;
                                                                    if (interfaceC1434300nQa2 != null) {
                                                                        interfaceC1434300nQa = interfaceC1434300nQa2;
                                                                    }
                                                                    interfaceC1434300nQa.LJ().getClass();
                                                                    C20684815ws.LJIILLIIL("video_compose_start", map);
                                                                    this.LJIIJ = C1411880mqQ.LIZIZ.LIZ();
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        if (obj2 instanceof C1404690mep) {
            this.LJIIJJI = ((C1404690mep) obj2).LIZ;
        } else {
            if (!(obj2 instanceof C1404700meq)) {
                return;
            }
            this.LJIIL = ((C1404700meq) obj2).LIZIZ;
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C1435220nS4 c1435220nS4;
        Throwable t;
        C1405220mfg c1405220mfg = null;
        if (abstractC1404540mea instanceof C1404550meb) {
            c1435220nS4 = ((C1404550meb) abstractC1404540mea).LIZ;
        } else {
            c1435220nS4 = null;
        }
        if (c1435220nS4 != null) {
            t = c1435220nS4.getT();
        } else {
            t = null;
        }
        C1405220mfg c1405220mfg2 = this.LJI;
        if (c1405220mfg2 != null) {
            c1405220mfg = c1405220mfg2;
        }
        LJI(false, true, t, null, i, c1405220mfg.LIZIZ);
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        C1405220mfg c1405220mfg = this.LJI;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        LJI(false, false, c1435220nS4, null, i, c1405220mfg.LIZIZ);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        C1405220mfg c1405220mfg = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        TrackParams trackParams = videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams;
        trackParams.compileEndScene = trackParams.currentScene;
        trackParams.compileEndDuration = System.currentTimeMillis() - videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.currentSceneStartTime;
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj2;
        C1405220mfg c1405220mfg2 = this.LJI;
        if (c1405220mfg2 != null) {
            c1405220mfg = c1405220mfg2;
        }
        LJI(true, false, null, synthetiseResult, i, c1405220mfg.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r23, boolean r24, java.lang.Throwable r25, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r26, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 2225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404640mek.LJI(boolean, boolean, java.lang.Throwable, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, int, boolean):void");
    }
}
