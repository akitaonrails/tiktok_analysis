package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.service.IIMMediaService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dtj.u7;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import ln3.a;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0nmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447990nmf {
    public static final C1447990nmf LIZ = new C1447990nmf();

    public static void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        HashMap<String, HashMap<String, String>> map = shortVideoContext.extraEventParams;
        if (map != null && map.containsKey("is_favourite_music")) {
            c0lab.LIZ(1, "is_favourite_music");
        }
        HashMap<String, HashMap<String, String>> map2 = shortVideoContext.extraEventParams;
        if (map2 != null && map2.containsKey("is_favourite_prop")) {
            c0lab.LIZ(1, "is_favourite_prop");
        }
    }

    public static final void LIZIZ(e0 e0Var, q qVar, VideoRecordRootView videoRecordRootView, C19EG c19eg, long j, long j2, final C1DRG c1drg, C1448140nmu c1448140nmu, ShortVideoContext shortVideoContext) {
        long j3;
        long j4;
        long j5;
        String name;
        String effectId;
        long jLIZIZ;
        long provider;
        long package_size;
        long jCurrentTimeMillis;
        C01GW<a> c01gw;
        String str;
        String enName;
        String id;
        boolean z;
        String str2;
        ShootExtraData shootExtraData;
        ShootExtraData shootExtraData2;
        String str3;
        String str4;
        int stitchVideoDuration;
        String str5;
        String str6;
        Object obj;
        String str7;
        C1449430noz c1449430noz;
        ShootExtraData shootExtraData3;
        int i;
        Map<String, String> map;
        HashMap<String, String> map2;
        TTSVoiceModel tTSVoiceModel;
        String str8;
        String str9;
        String str10;
        C857540XkW.LIZ(j - shortVideoContext.creativeModel.conversionRateTime, shortVideoContext.shootWay, shortVideoContext.getCreationId(), "finish_animation", shortVideoContext.enterFrom);
        long firstMeasureStartTimeMS = videoRecordRootView.getFirstMeasureStartTimeMS();
        long firstDrawnTimeMS = videoRecordRootView.getFirstDrawnTimeMS();
        if (c1448140nmu != null) {
            j3 = c1448140nmu.LIZJ;
            j4 = c1448140nmu.LIZ;
            j5 = c1448140nmu.LIZIZ;
        } else {
            j3 = 0;
            j4 = 0;
            j5 = 0;
        }
        C1645380sv2 c1645380sv2 = (C1645380sv2) c1drg.LJIIL("lazyBeautyFilter", C1645380sv2.class);
        FilterBean filterBeanLIZJ = null;
        if (C1622090sJT.LIZ(c1645380sv2)) {
            InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) ((C0ETY) c1drg.LJII(C0ETY.class, null)).MY1(InterfaceC1644770su3.class);
            if (interfaceC1644770su3 != null) {
                filterBeanLIZJ = interfaceC1644770su3.i70().LIZJ();
            }
        } else {
            filterBeanLIZJ = ((InterfaceC1644770su3) c1drg.LJII(InterfaceC1644770su3.class, null)).i70().LIZJ();
        }
        Effect effect = shortVideoContext.enterMvThemeEffect;
        if (effect == null) {
            name = "";
            effectId = "";
        } else {
            effectId = effect.getEffectId();
            name = effect.getName();
        }
        long j6 = shortVideoContext.creativeModel.recordMobModel.startRecordTime;
        if (C1442110ndB.LIZ()) {
            jLIZIZ = C1448840no2.LIZIZ(j6, j);
        } else {
            jLIZIZ = 0;
        }
        long j7 = j6 + jLIZIZ;
        long j8 = j2 - j7;
        long j9 = j4 - j7;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        RecordMobModel recordMobModel = creativeModel.recordMobModel;
        int i2 = recordMobModel.sdkLoadVESoStatus;
        long j10 = recordMobModel.preloadVESoCostTime;
        int i3 = recordMobModel.preloadVESoStatus;
        long j11 = recordMobModel.decompressVESoCostTime;
        boolean z2 = recordMobModel.isColdStart;
        long j12 = recordMobModel.effectDownloadTime;
        long j13 = recordMobModel.musicDownloadTime;
        long j14 = recordMobModel.videoDownloadTime;
        long j15 = j - j7;
        Effect effect2 = creativeModel.recordEffectModel.autoApplyEffect;
        if (effect2 != null) {
            provider = effect2.getProvider();
        } else {
            provider = 0;
        }
        Effect effect3 = shortVideoContext.creativeModel.recordEffectModel.autoApplyEffect;
        if (effect3 != null) {
            package_size = effect3.getPackage_size();
        } else {
            package_size = 0;
        }
        String strLIZ = C524380KhQ.LIZ(shortVideoContext);
        String str11 = shortVideoContext.creativeModel.initialModel.dmCameraModel.enterDMWay;
        String strLJFF = qVar.Up2().LJFF();
        boolean zLIZIZ = C577580Ml2.LIZ.LIZIZ();
        ShootLinkPerfMobModel shootLinkPerfMobModel = shortVideoContext.creativeModel.shootLinkPerfMobModel;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j7, "start_time");
        c0lab.LIZ(i2, "sdk_load_ve_so_status");
        c0lab.LIZ(i3, "preload_ve_so_task_status");
        c0lab.LIZIZ(j10, "preload_ve_so_cost_time");
        c0lab.LIZIZ(j11, "extra_decompress_time");
        c0lab.LIZIZ(j9, "first_frame_duration");
        c0lab.LIZIZ((long) Math.max(j9, j15), "first_frame_duration_new");
        c0lab.LIZIZ(j15, "enter_anim_complete_duration");
        c0lab.LIZIZ(j8, "first_ui_frame_duration");
        c0lab.LIZIZ(j3 - j7, "ui_render_to_start_duration");
        c0lab.LIZIZ(firstMeasureStartTimeMS - j2, "ui_measure_to_resume_duration");
        c0lab.LIZIZ(j3 - j2, "ui_render_to_resume_duration");
        c0lab.LIZIZ(firstDrawnTimeMS - firstMeasureStartTimeMS, "ui_done_to_measure_duration");
        c0lab.LIZIZ(firstDrawnTimeMS - j7, "ui_done_to_start_duration");
        c0lab.LIZIZ(firstDrawnTimeMS - j3, "ui_done_to_ui_render_duration");
        c0lab.LIZIZ(j - firstDrawnTimeMS, "anim_end_to_ui_done_duration");
        c0lab.LIZIZ(j5 - j4, "effect_first_frame_duration");
        c0lab.LIZIZ(j5 - j7, "total_first_frame_duration");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_enter_from", strLIZ);
        c0lab.LJ("shoot_enter_method", shortVideoContext.creativeModel.commonMobModel.shootEnterMethod);
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJII("shoot_perf_session_id", shootLinkPerfMobModel.shootPerfSessionId, zLIZIZ);
        long j16 = shootLinkPerfMobModel.shootNativeRecvTs;
        if (j16 > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - j16;
        } else {
            jCurrentTimeMillis = -1;
        }
        c0lab.LJII("e2e_open_time", String.valueOf(jCurrentTimeMillis), zLIZIZ);
        c0lab.LJII("inspiration_enter_from", shootLinkPerfMobModel.inspirationEnterFrom, zLIZIZ);
        c0lab.LJII("inspiration_enter_method", shootLinkPerfMobModel.inspirationEnterMethod, zLIZIZ);
        c0lab.LJII("search_extra", shootLinkPerfMobModel.searchExtra, zLIZIZ);
        c0lab.LJII("interceptor_cost", String.valueOf(shootLinkPerfMobModel.interceptorCost), zLIZIZ);
        c0lab.LJII("service_load_cost", String.valueOf(shootLinkPerfMobModel.serviceLoadCost), zLIZIZ);
        c0lab.LJFF("cold_start", z2);
        c0lab.LIZIZ(shortVideoContext.creativeModel.recordMobModel.waitVESoLoadDuration, "wait_ve_so_duration_in_main");
        c0lab.LIZIZ(j12, "effect_download_duration");
        c0lab.LIZIZ(j13, "music_download_duration");
        c0lab.LIZIZ(j14, "video_download_duration");
        c0lab.LJ("camera_type", C1621770sIx.LIZ(e0Var.St2().getCurrentCameraType()));
        c0lab.LJ("prop_id", strLJFF);
        c0lab.LIZIZ(provider, "provider");
        c0lab.LIZIZ(package_size, "package_size");
        c0lab.LJ("enter_dm_way", str11);
        c0lab.LIZ(shortVideoContext.creativeModel.recordMobModel.recordFromTab, "from_tab");
        if (C1442110ndB.LIZ() || C1448080nmo.LIZ()) {
            c0lab.LIZIZ(jLIZIZ, "background_duration_before_ffd");
        }
        long j17 = shortVideoContext.creativeModel.recordMobModel.duetStitchClickTime;
        if (j17 > 0) {
            c0lab.LIZIZ(j - j17, "duet_stitch_first_frame_duration");
        }
        C1403900mdY c1403900mdY = C1403900mdY.LIZ;
        CreativeModel creativeModel2 = shortVideoContext.creativeModel;
        c1403900mdY.getClass();
        C1403900mdY.LJFF(creativeModel2, c0lab);
        boolean zLIZ = C0C1K.LIZ();
        C21142717oX.LIZIZ(c0lab, !zLIZ);
        if (zLIZ) {
            C860560XpO.LIZ(c0lab);
        }
        if (C1622090sJT.LIZ(c1645380sv2)) {
            c01gw = new C01GW<a>() { // from class: X.0nmm
                @Override // X.C01GW
                public final boolean isInitialized() {
                    return true;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.05YF, ln3.a] */
                @Override // X.C01GW
                public final a getValue() {
                    return ((C0ETY) c1drg.LJII(C0ETY.class, null)).MY1(a.class);
                }
            };
        } else {
            c01gw = null;
        }
        C1448710nnp c1448710nnp = new C1448710nnp(null, null, c1drg, null, e0Var, c01gw);
        if (d4.LJJIIJ(shortVideoContext)) {
            str = "tool_performance_camera_first_frame";
        } else {
            str = "tool_performance_record_first_frame";
        }
        c1448710nnp.LIZIZ(c0lab, new C1448070nmn(str, c0lab, j5, j4));
        if (C1DS1.LIZJ && !((Boolean) C1DS1.LJIIL.getValue()).booleanValue() && j15 > ((Number) C1DS1.LJIILJJIL.getValue()).longValue()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_FIRST_FRAME, null, 0L, 28));
        }
        if (C308340C6u.LIZ()) {
            C1448090nmp.LIZJ(C1448090nmp.LIZIZ(shortVideoContext.shootWay));
        }
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
        C1457570o27 c1457570o27 = C1457570o27.LIZ;
        String creationId = shortVideoContext.getCreationId();
        String str12 = shortVideoContext.shootWay;
        String str13 = shortVideoContext.enterFrom;
        c1457570o27.getClass();
        C1457570o27.LIZIZ("tool_performance_enter_shoot_page_new", creationId, str12, j7, j9, j8, 0, "entry", str13, "", "", zIsLogin, true, zLIZLLL);
        C524780Ki4.LIZ.recordSingleValuePerfLog("tool_performance_record_components_info", new C857100Xjo());
        C0LAB c0lab2 = new C0LAB();
        if (filterBeanLIZJ == null) {
            enName = "";
        } else {
            enName = filterBeanLIZJ.getEnName();
        }
        c0lab2.LJ("filter_name", enName);
        if (filterBeanLIZJ != null) {
            id = filterBeanLIZJ.getId();
        } else {
            id = null;
        }
        c0lab2.LJ("filter_id", id);
        c0lab2.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab2.LJ("prop_id", strLJFF);
        c0lab2.LJ("mv_id", effectId);
        c0lab2.LJ("mv_name", name);
        c0lab2.LJFF("cold_start", z2);
        c0lab2.LIZ(((Number) C20102013l4.LIZJ("av_video_record_init").getFirst()).intValue(), "app_mem_use");
        c0lab2.LIZ(((Number) C20102013l4.LIZJ("av_video_record_init").getSecond()).intValue(), "availble_mem");
        c0lab2.LIZIZ(shortVideoContext.creativeModel.recordMobModel.downloadResourceTime, "download_res_time");
        StitchParams stitchParams = shortVideoContext.stitchContext.stitchParams;
        if (stitchParams != null && stitchParams.isThroughStitchChain()) {
            z = true;
        } else {
            z = false;
        }
        String str14 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab2.LJ("is_through_stitch_button", str2);
        c0lab2.LJ("camera_type", C1621770sIx.LIZ(e0Var.St2().getCurrentCameraType()));
        c0lab2.LJI(new C15M8().LJFF("action_originated_from"));
        c0lab2.LIZ(shortVideoContext.creativeModel.mdpInfoModel.fromOfflineMusicMdp ? 1 : 0, "is_offline_unmuted_mdp");
        c0lab2.LJ("single_song_shoot_previous_page", shortVideoContext.creativeModel.musicBuzModel.singleSongShootPreviousPage);
        c0lab2.LJ("single_song_shoot_previous_enter_method", shortVideoContext.creativeModel.musicBuzModel.singleSongShootPreviousEnterMethod);
        c0lab2.LJ("previous_search_query", shortVideoContext.creativeModel.musicBuzModel.previousSearchQuery);
        c0lab2.LJ("is_same_music_supply_detail_page", shortVideoContext.creativeModel.musicBuzModel.isSameMusicSupplyDetailPage);
        String followPromptTypeSafelyBeforeEdit = shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getFollowPromptTypeSafelyBeforeEdit();
        if (followPromptTypeSafelyBeforeEdit != null) {
            c0lab2.LJ("follow_prompt_type", followPromptTypeSafelyBeforeEdit);
        }
        ShootExtraData shootExtraData4 = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData4 != null) {
            c0lab2.LJ("followup_square_action_position", shootExtraData4.getFollowupSquareActionPosition());
            c0lab2.LJ("is_from_followup_square_original_video", shootExtraData4.isFromFollowupSquareOriginalVideo());
            c0lab2.LJ("followup_square_recommend_type", shootExtraData4.getFollowupSquareRecommendType());
            c0lab2.LJ("followup_square_recommend_reason", shootExtraData4.getFollowupSquareRecommendReason());
            if (shootExtraData4.getFollowupSquareVideoRank() != null) {
                c0lab2.LIZLLL(shootExtraData4.getFollowupSquareVideoRank(), "followup_square_video_rank");
            }
        }
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
            c0lab2.LJ("is_dm_text_icon", "1");
        }
        if (Intrinsics.LJFF("self_shoot", shortVideoContext.shootWay)) {
            c0lab2.LJ("enter_from", "video_shoot_page");
        } else if (shortVideoContext.LJJJJIZL()) {
            c0lab2.LJ("enter_from", "video_edit_page");
        } else if (Intrinsics.LJFF("story", shortVideoContext.shootWay)) {
            if (Intrinsics.LJFF("upload_page", shortVideoContext.enterFrom)) {
                c0lab2.LJ("enter_from", shortVideoContext.enterFrom);
                String shootEnterFrom = shortVideoContext.creativeModel.commonMobModel.shootEnterFrom;
                if (shootEnterFrom == null && ((shootExtraData2 = shortVideoContext.creativeFlowData.getShootExtraData()) == null || (shootEnterFrom = shootExtraData2.getShootEnterFrom()) == null)) {
                    shootEnterFrom = shortVideoContext.enterFrom;
                }
                c0lab2.LJ("shoot_enter_from", shootEnterFrom);
                String shootEnterMethod = shortVideoContext.creativeModel.commonMobModel.shootEnterMethod;
                if (shootEnterMethod == null && ((shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData()) == null || (shootEnterMethod = shootExtraData.getShootEnterMethod()) == null)) {
                    shootEnterMethod = shortVideoContext.enterMethod;
                }
                c0lab2.LJ("shoot_enter_method", shootEnterMethod);
                c0lab2.LJ("shoot_entrance", "now");
                c0lab2.LJ("content_type", "now");
                c0lab2.LIZ(0, "dual_camera_support");
            } else {
                c0lab2.LJ("enter_from", "video_shoot_page");
                c0lab2.LJ("shoot_enter_from", shortVideoContext.enterFrom);
                c0lab2.LJ("shoot_enter_method", shortVideoContext.enterMethod);
                c0lab2.LJ("shoot_entrance", "now");
                c0lab2.LJ("content_type", "now");
                c0lab2.LIZ(0, "dual_camera_support");
            }
        } else if (Intrinsics.LJFF("h5_long_video", shortVideoContext.shootWay)) {
            c0lab2.LJ("enter_from", shortVideoContext.enterFrom);
            c0lab2.LJ("enter_method", shortVideoContext.enterMethod);
            c0lab2.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab2.LJ("group_id", C1443560nfW.LJIIIIZZ());
        } else if (!shortVideoContext.creativeModel.stickerModel.addYoursStickerExtras.isEmpty()) {
            if (!C298260Bma.LIZ()) {
                c0lab2.LJ("music_selected_from", "add_yours");
            }
            c0lab2.LJ("enter_from", ((AddYoursStickerExtras) ListProtector.get(shortVideoContext.creativeModel.stickerModel.addYoursStickerExtras, 0)).getEnterFrom());
        } else {
            c0lab2.LJ("enter_from", shortVideoContext.enterFrom);
            c0lab2.LJ("enter_method", shortVideoContext.enterMethod);
            String str15 = shortVideoContext.creativeModel.commonMobModel.shootEnterMethod;
            if (strLIZ == null) {
                strLIZ = shortVideoContext.enterFrom;
            }
            c0lab2.LJ("shoot_enter_from", strLIZ);
            if (str15 == null) {
                str15 = shortVideoContext.enterMethod;
            }
            c0lab2.LJ("shoot_enter_method", str15);
        }
        if (Intrinsics.LJFF("direct_shoot", shortVideoContext.shootWay)) {
            c0lab2.LJ("is_story_enhanced_entrance", C1402490mbH.LIZ(shortVideoContext.creativeModel.commonMobModel.isStoryEnhancedEntrance));
        }
        int i4 = shortVideoContext.draftId;
        if (i4 != 0) {
            c0lab2.LIZ(i4, "draft_id");
        }
        if (!TextUtils.isEmpty(shortVideoContext.clientId)) {
            c0lab2.LJ("channel", shortVideoContext.clientId);
        }
        if (!TextUtils.isEmpty(shortVideoContext.mShareId)) {
            c0lab2.LJ("open_platform_share_id", shortVideoContext.mShareId);
        }
        CreativeModel creativeModel3 = shortVideoContext.creativeModel;
        LoadMusicAndEffectModel loadMusicAndEffectModel = creativeModel3.loadMusicAndEffectModel;
        if (loadMusicAndEffectModel.loadAfterRecord) {
            String str16 = loadMusicAndEffectModel.musicId;
            RecordMobModel recordMobModel2 = creativeModel3.recordMobModel;
            if (str16 == null) {
                str16 = "";
            }
            recordMobModel2.fromMusicId = str16;
            c0lab2.LJ("enter_method", "long_press_music_publish");
            c0lab2.LJ("shoot_entrance", "single_song");
            if (!C298260Bma.LIZ()) {
                c0lab2.LJ("music_id", shortVideoContext.creativeModel.recordMobModel.fromMusicId);
            }
        }
        ShareKitPanel shareKitPanel = shortVideoContext.creativeFlowData.getShareKitPanel();
        if (shareKitPanel != null) {
            c0lab2.LIZLLL(shareKitPanel.getShareMediaType(), "share_media_type");
            c0lab2.LJ("effect_resource_id", shareKitPanel.getEffectResourceId());
            c0lab2.LJ("share_panel_option", shareKitPanel.getSharePanelOption());
            c0lab2.LJ("channel", shareKitPanel.getClientKey());
        }
        C1402840mbq c1402840mbq = shortVideoContext.shareContext;
        if (c1402840mbq != null) {
            String sdkNameForServer = c1402840mbq.getSdkNameForServer();
            String str17 = c1402840mbq.mSdkVersion;
            String str18 = c1402840mbq.mClientKey;
            if (!TextUtils.isEmpty(sdkNameForServer)) {
                c0lab2.LJ("sdk_name", sdkNameForServer);
            }
            if (!TextUtils.isEmpty(str17)) {
                c0lab2.LJ("sdk_version", str17);
            }
            if (!TextUtils.isEmpty(str18)) {
                c0lab2.LJ("channel", str18);
            }
        }
        if (!TextUtils.isEmpty(shortVideoContext.newDraftId)) {
            c0lab2.LJ("new_draft_id", shortVideoContext.newDraftId);
            if (shortVideoContext.draftToEditFrom == 0) {
                if (!shortVideoContext.LJJJJIZL()) {
                    c0lab2.LJ("enter_method", "click_back_button");
                    String str19 = shortVideoContext.enterFrom;
                    if (str19 == null || str19.length() == 0) {
                        c0lab2.LJ("enter_from", "video_edit_page");
                    }
                }
                str10 = "general_draft_list";
            } else {
                str10 = null;
            }
            c0lab2.LJ("draft_way", str10);
        }
        c0lab2.LIZ(C778450UgF.LIZ(c19eg), "brightness");
        c0lab2.LIZJ(Float.valueOf(ToolsBaseLightSensorUtils.INSTANCE.getCurrentLightLevel()), "light_sensor_level");
        if (C1392820mLg.LIZ()) {
            if (zIsLogin) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("is_login", str8);
            c0lab2.LJ("has_camera_permission", "1");
            if (zLIZLLL) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("has_microphone_permission", str9);
        }
        if (j7 > 0 && j9 > 0) {
            c0lab2.LIZIZ(j9, "duration");
        }
        if (TextUtils.equals(shortVideoContext.enterFrom, "super_entrance")) {
            c0lab2.LIZ(1, "is_special_icon");
        }
        if (Intrinsics.LJFF("story", shortVideoContext.shootWay)) {
            c0lab2.LJ("shoot_entrance", "story");
            c0lab2.LJ("enter_method", shortVideoContext.enterMethod);
        }
        if (Intrinsics.LJFF("anchor_combine_tts", shortVideoContext.shootWay) && (tTSVoiceModel = shortVideoContext.ttsVoiceModel) != null) {
            c0lab2.LJ("tone_list", tTSVoiceModel.getEffectId());
        }
        C1411120mpC.LIZ(shortVideoContext);
        c0lab2.LJ("reference_tts_voice_ids", C1411120mpC.LIZIZ(shortVideoContext));
        c0lab2.LJ("shoot_page", "video_shoot_page");
        c0lab2.LIZ(shortVideoContext.mDuetFromDuetButton, "is_from_duet_button");
        if (shortVideoContext.LJJJJI()) {
            c0lab2.LIZ(1, "is_restore_crash");
            if (C0CHQ.LIZ().LJIIJ().LJIIJJI()) {
                c0lab2.LJ("enter_method", "click_continue_popup");
            } else {
                c0lab2.LJ("enter_method", "click_back_button");
            }
        } else {
            c0lab2.LIZ(0, "is_restore_crash");
        }
        if (shortVideoContext.cameraComponentModel.mRestoreType == 1) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab2.LJ("is_draft", str3);
        String str20 = "camera";
        c0lab2.LJ("camera", C1449260noi.LIZIZ(e0Var.LJLJJLL()));
        c0lab2.LIZ(C0CHQ.LIZ().getPublishService().LJJJJJL(), "publish_cnt");
        if (shortVideoContext.creativeFlowData.isThroughAnchor()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab2.LJ("is_through_anchor", str4);
        if (TextUtils.equals(shortVideoContext.shootWay, "duet")) {
            c0lab2.LIZ(shortVideoContext.duetVideoDuration, "duet_video_duration");
        } else if (TextUtils.equals(shortVideoContext.shootWay, "stitch")) {
            StitchParams stitchParams2 = shortVideoContext.stitchContext.stitchParams;
            if (stitchParams2 != null) {
                stitchVideoDuration = stitchParams2.getStitchVideoDuration();
            } else {
                stitchVideoDuration = 0;
            }
            c0lab2.LIZ(stitchVideoDuration, "stitch_video_duration");
        }
        DuetAndStitchRouterConfigKt.mobIsEcommerce(shortVideoContext.creativeModel.initialModel.duetAndStitchRouterConfig, new AwS601S0100000_22(c0lab2, 138));
        if (TextUtils.equals(shortVideoContext.shootWay, "friends_effect")) {
            c0lab2.LJ("enter_method", shortVideoContext.enterMethod);
            HashMap<String, HashMap<String, String>> map3 = shortVideoContext.extraEventParams;
            if (map3 != null && map3.get("friends_effect") != null && (map2 = map3.get("friends_effect")) != null) {
                c0lab2.LJ("from_user_id", map2.get("from_user_id"));
            }
        }
        if (TextUtils.equals(shortVideoContext.shootWay, "chat_shoot")) {
            c0lab2.LJ("enter_method", "click");
            DMCameraModel dMCameraModel = shortVideoContext.creativeModel.initialModel.dmCameraModel;
            c0lab2.LJ("enter_dm", dMCameraModel.enterDM);
            c0lab2.LJ("enter_dm_type", dMCameraModel.enterMethodType);
            c0lab2.LJ("enter_dm_way", dMCameraModel.enterDMWay);
            String str21 = dMCameraModel.searchSessionId;
            int i5 = dMCameraModel.chatType;
            if (i5 != -1) {
                c0lab2.LJ("chat_type", ((IIMMediaService) ServiceManager.get().getService(IIMMediaService.class)).LJFF().LJIJI(Integer.valueOf(i5)));
            }
            if (str21 != null) {
                c0lab2.LJ("search_session_id", str21);
            }
            if (dMCameraModel.isFromEffectButton) {
                c0lab2.LJ("is_chat_page_icon_effect", "1");
            }
        }
        if (shortVideoContext.LJJJIL()) {
            c0lab2.LJ("enter_method", "click_replace");
        } else if (shortVideoContext.LJJJJIZL()) {
            c0lab2.LJ("enter_method", "click_reshoot");
        }
        StreamVoiceConversionModel streamVoiceConversionModel = shortVideoContext.creativeModel.streamVoiceConversionModel;
        String str22 = streamVoiceConversionModel.vcShootingEffectId;
        String str23 = streamVoiceConversionModel.vcVoiceId;
        if (!TextUtils.isEmpty(str22) && Intrinsics.LJFF(str22, str23)) {
            str5 = "vc_page";
        } else if (!TextUtils.isEmpty(str22)) {
            str5 = shortVideoContext.creativeModel.streamVoiceConversionModel.vcShootingEffectIdFrom;
        } else {
            str5 = null;
        }
        if (!TextUtils.isEmpty(str5)) {
            c0lab2.LIZ(1, "is_voice_effect");
            c0lab2.LJ("voice_modify_id", shortVideoContext.creativeModel.streamVoiceConversionModel.vcShootingEffectId);
            c0lab2.LJ("voice_effect_selected_from", str5);
        }
        EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(d4.LIZLLL(shortVideoContext));
        if (enumC1448590nndLIZLLL == EnumC1448590nnd.RATIO_3_4) {
            str6 = "3:4";
        } else if (enumC1448590nndLIZLLL == EnumC1448590nnd.RATIO_1_1) {
            str6 = "1:1";
        } else {
            str6 = "9:16";
        }
        c0lab2.LJ("picture_size", str6);
        if (C560970LzL.LIZJ(c19eg)) {
            obj = "1";
        } else {
            obj = 0;
        }
        c0lab2.LIZLLL(obj, "internet_status");
        c0lab2.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        c0lab2.LIZ(C1402450mbD.LIZ(C2179771ASp.LIZ()), "earphone_state");
        C21142717oX.LIZIZ(c0lab2, true);
        if (!shortVideoContext.creativeModel.stickerModel.addYoursStickerExtras.isEmpty()) {
            if (shortVideoContext.creativeModel.stickerModel.addYoursStickerModels.isEmpty()) {
                C1403900mdY.LJI(shortVideoContext.creativeModel, c0lab2);
            } else {
                C1403900mdY.LIZJ(shortVideoContext.creativeModel, new AddYoursStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.ADD_YOURS, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, true, false, false, null, null, 0, 14.0f, 0, null, null, false, false, null, false, null, null, true, null), c0lab2);
            }
            C1403900mdY.LIZIZ(shortVideoContext.creativeModel, c0lab2);
        }
        float fLIZ = C1485020okO.LIZ(shortVideoContext.creativeModel.musicVolumeInfoModel.musicVolumeInfo);
        if (C1485020okO.LIZLLL(Float.valueOf(fLIZ))) {
            c0lab2.LIZJ(Float.valueOf(fLIZ), "bgm_volume_difference_with_feed_db");
        }
        if (shortVideoContext.creativeModel.paidContentModel.getEntryPoint().length() != 0) {
            c0lab2.LJ("entry_point", shortVideoContext.creativeModel.paidContentModel.getEntryPoint());
        }
        if (!C298260Bma.LIZ()) {
            c0lab2.LJ("music_selected_from", C1444890nhf.LIZ(shortVideoContext));
        }
        String musicId = shortVideoContext.getMusicId();
        if (!TextUtils.isEmpty(musicId)) {
            shortVideoContext.creativeModel.recordMobModel.fromMusicId = musicId;
            if (!C298260Bma.LIZ()) {
                c0lab2.LJ("music_id", musicId);
            }
            c0lab2.LIZ(shortVideoContext.creativeModel.musicBuzModel.isFeedPreDownloadMdp, "is_feed_pre_download_mdp");
        }
        C1402840mbq c1402840mbq2 = shortVideoContext.shareContext;
        if (c1402840mbq2 != null && (map = c1402840mbq2.extraET) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0lab2.LJ(entry.getKey(), entry.getValue());
            }
        }
        Mission mission = shortVideoContext.creativeModel.commerceModel.getMission();
        if (mission != null) {
            c0lab2.LJ("mission_id", mission.getMissionId());
            c0lab2.LIZ(mission.isDuet() ? 1 : 0, "mission_duet");
        }
        boolean z3 = false;
        if (C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false)) {
            str7 = "on";
        } else {
            str7 = "off";
        }
        c0lab2.LJ("auto_meme_mode", str7);
        if (!shortVideoContext.LJJJI()) {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab2.LJ("is_delete_to_edit", str14);
        if (shortVideoContext.creativeModel.draftInfoModel.draftLandPage.length() != 0) {
            c0lab2.LJ("draft_land_page", shortVideoContext.creativeModel.draftInfoModel.draftLandPage);
        }
        c0lab2.LIZ(shortVideoContext.creativeModel.draftInfoModel.isPostDraftPrompt ? 1 : 0, "is_post_draft_prompt");
        DMCameraModel dMCameraModel2 = shortVideoContext.creativeModel.initialModel.dmCameraModel;
        boolean zLJIIJJI = d4.LJIIJJI(shortVideoContext);
        if (dMCameraModel2.enablePhotoSwap) {
            String str24 = dMCameraModel2.enterDM;
            c0lab2.LJ("enter_dm", str24);
            if (zLJIIJJI) {
                if (Intrinsics.LJFF("photoswap", str24)) {
                    c0lab2.LJ("enter_dm_type", dMCameraModel2.enterMethodType);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("photoswap_");
                    sbLIZ.append(str24);
                    c0lab2.LJ("enter_dm_type", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (dMCameraModel2.photoSwapPairedMsgId != null) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab2.LIZ(i, "is_photoswap_reply");
        }
        C1609930rzr.LJIILJJIL(shortVideoContext.creativeModel, c0lab2);
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.enableGroupShot && shortVideoContext.LJJIIJZLJL()) {
            z3 = true;
        }
        if (zLJIIJJI) {
            str20 = "photoswap";
        } else if (z3) {
            str20 = "group_shot";
        }
        c0lab2.LJ("dm_camera_tab", str20);
        if (z3) {
            String str25 = dMCameraModel2.enterDM;
            c0lab2.LJ("enter_dm", str25);
            if (Intrinsics.LJFF("group_shot", str25)) {
                c0lab2.LJ("enter_dm_type", dMCameraModel2.enterMethodType);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("group_shot_");
                sbLIZ2.append(str25);
                c0lab2.LJ("enter_dm_type", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        c0lab2.LJ("microphone_status", C1448020nmi.LIZ(shortVideoContext, shortVideoContext.creativeModel.recordMobModel.fromMusicId));
        C1440340naK.LIZ(c0lab2, shortVideoContext.creativeModel.propFromGroupModel);
        if (d4.LJIJJLI(shortVideoContext)) {
            c0lab2.LJ("content_source", "upload");
        }
        if (!TextUtils.isEmpty(shortVideoContext.creativeModel.socialModel.relationEnterMethod)) {
            c0lab2.LJ("shoot_enter_method", shortVideoContext.creativeModel.socialModel.relationEnterMethod);
        }
        C1411580mpw.LIZ("enter_video_shoot_page");
        if (C298260Bma.LIZ()) {
            c1449430noz = new C1449430noz(shortVideoContext.creativeModel.recordMobModel.fromMusicId, C1444890nhf.LIZ(shortVideoContext));
        } else {
            c1449430noz = null;
        }
        C1438550nXR.LIZ(c0lab2, shortVideoContext);
        LIZ.getClass();
        LIZ(c0lab2, shortVideoContext);
        CreativeFlowData creativeFlowData = shortVideoContext.creativeFlowData;
        if (creativeFlowData != null) {
            shootExtraData3 = creativeFlowData.getShootExtraData();
        } else {
            shootExtraData3 = null;
        }
        C1405050mfP.LIZ(c0lab2, shootExtraData3);
        C560380LyO c560380LyO = C560380LyO.LIZ;
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.RECORD;
        String strLJIIIIZZ = c0lab2.LJIIIIZZ("enter_from");
        c560380LyO.getClass();
        C560380LyO.LJIJ(enumC560450LyV, strLJIIIIZZ);
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String creationId2 = shortVideoContext.getCreationId();
        String str26 = shortVideoContext.shootWay;
        if (str26 != null) {
            iRecordMobService.LIZJ(new C1449420noy(creationId2, str26, C1443560nfW.LJIIIIZZ(), c1449430noz), c0lab2);
            if (u7.LJ() || u7.LIZJ()) {
                C0LAB c0lab3 = new C0LAB();
                c0lab3.LJFF("is_4k_enable", C2495709qF.LIZ());
                C20684815ws.LJIILLIIL("tool_performance_4k_video_import", c0lab3.LIZ);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
