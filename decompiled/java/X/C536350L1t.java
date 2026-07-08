package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.AIGCExtraModel;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0L1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536350L1t {
    public final EnterStoryParam LIZ;
    public final InterfaceC536360L1u LIZIZ;
    public final SocialMediaPickerViewModel LIZJ;
    public final InterfaceC522160Kdq LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public AwS552S0100000_8 LJI;
    public final ShortVideoContext LJII;
    public final CreativeInfo LJIIIIZZ;
    public final int LJIIIZ;
    public InterfaceC522520KeQ LJIIJ;
    public final int LJIIJJI;
    public int LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final VideoPublishEditModel LJIILLIIL;
    public final long LJIIZILJ;
    public final long LJIJ;
    public final boolean LJIJI;
    public final Parcelable LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public float LJJ;

    public final boolean LIZ() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        Context contextLJJIZ = this.LIZIZ.LJJIZ();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if ((creativeToolsPluginService == null || !creativeToolsPluginService.LJI(contextLJJIZ)) && 0 == 0) {
            return false;
        }
        int i = this.LJIIIZ;
        ShortVideoContext shortVideoContext = this.LJII;
        return C0L4U.LIZJ(shortVideoContext, (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true, i);
    }

    public final C528240Kne LIZIZ() {
        EnumC563850M9n aiLiveSwitchStyle;
        SocialMediaPickerConfig socAlbumConfig = this.LIZ.getSocAlbumConfig();
        if (socAlbumConfig == null || (aiLiveSwitchStyle = socAlbumConfig.getAiLiveSwitchStyle()) == null || aiLiveSwitchStyle == EnumC563850M9n.DISABLE) {
            return null;
        }
        return new C528240Kne(aiLiveSwitchStyle, Boolean.valueOf(this.LIZJ.wQ2()), null, null, null, 508);
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public final C0LAB LJ(C0LAB c0lab) {
        EnumC563850M9n aiLiveSwitchStyle;
        String str;
        EnumC563850M9n aiLiveSwitchStyle2;
        SocialMediaPickerConfig socAlbumConfig = this.LIZ.getSocAlbumConfig();
        String mobName = null;
        if (socAlbumConfig != null) {
            aiLiveSwitchStyle = socAlbumConfig.getAiLiveSwitchStyle();
        } else {
            aiLiveSwitchStyle = null;
        }
        if (aiLiveSwitchStyle == EnumC563850M9n.DISABLE) {
            return c0lab;
        }
        SocialMediaPickerConfig socAlbumConfig2 = this.LIZ.getSocAlbumConfig();
        if (socAlbumConfig2 != null && (aiLiveSwitchStyle2 = socAlbumConfig2.getAiLiveSwitchStyle()) != null) {
            mobName = aiLiveSwitchStyle2.getMobName();
        }
        c0lab.LJ("ai_livephoto_switch_type", mobName);
        if (this.LIZJ.wQ2()) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("ai_livephoto_switch_status", str);
        return c0lab;
    }

    public final void LJFF(String str) {
        String creationId;
        String str2;
        String str3;
        String str4;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = this.LJII;
        CreativeModel creativeModel = null;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext2 = this.LJII;
        String str5 = "";
        if ((shortVideoContext2 == null || (str2 = shortVideoContext2.shootWay) == null) && (str2 = this.LJIILL) == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_way", str2);
        ShortVideoContext shortVideoContext3 = this.LJII;
        if (shortVideoContext3 == null || (str3 = shortVideoContext3.enterMethod) == null) {
            str3 = "";
        }
        c0lab.LJ("shoot_enter_method", str3);
        ShortVideoContext shortVideoContext4 = this.LJII;
        if (shortVideoContext4 != null && (str4 = shortVideoContext4.enterFrom) != null) {
            str5 = str4;
        }
        c0lab.LJ("shoot_enter_from", str5);
        c0lab.LIZ(this.LJIILJJIL ? 1 : 0, "is_upload_direct_enter");
        c0lab.LJ("select_method", str);
        ShortVideoContext shortVideoContext5 = this.LJII;
        if (shortVideoContext5 != null) {
            creativeModel = shortVideoContext5.creativeModel;
        }
        C0MJO.LIZIZ(creativeModel, c0lab);
        LJ(c0lab);
        C2341909Fp.LIZ("choose_upload_content", c0lab.LIZ);
    }

    public final void LJI(String str) {
        String creationId;
        String str2;
        String str3;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = this.LJII;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("shoot_way", this.LJIILL);
        c0lab.LJ("content_source", "upload");
        c0lab.LJ("enter_from", "upload_page");
        ShortVideoContext shortVideoContext2 = this.LJII;
        String str4 = "";
        if (shortVideoContext2 == null || (str2 = shortVideoContext2.enterFrom) == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_enter_from", str2);
        ShortVideoContext shortVideoContext3 = this.LJII;
        if (shortVideoContext3 != null && (str3 = shortVideoContext3.enterMethod) != null) {
            str4 = str3;
        }
        c0lab.LJ("shoot_enter_method", str4);
        c0lab.LIZ(this.LJIILJJIL ? 1 : 0, "is_upload_direct_enter");
        c0lab.LJ("component_type", str);
        C2341909Fp.LIZ("story_album_top_component_click", c0lab.LIZ);
    }

    public final void LJIIIIZZ(List<SocMediaResource> list) {
        SocMediaResource socMediaResource;
        IAlbumSharpImagePreloadService iAlbumSharpImagePreloadService;
        if ((C298390Bmn.LIZ() & 1) != 0 && list.size() == 1 && (socMediaResource = (SocMediaResource) C13LP.LJJJLL(list)) != null && socMediaResource.LIZJ() && (iAlbumSharpImagePreloadService = (IAlbumSharpImagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAlbumSharpImagePreloadService.class, false, false, false, 14, null)) != null) {
            iAlbumSharpImagePreloadService.LIZ(this.LIZIZ.LJJIZ(), 0, socMediaResource.LIZ());
        }
    }

    public final void LIZLLL(String str, List list) {
        CommonMobParamModel commonMobParamModel;
        CommonMobParamModel commonMobParamModel2;
        if (!C536380L1w.LIZ(this.LIZIZ.LJJIZ())) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                TikTokMediaModel tikTokMediaModel = ((SocMediaResource) obj).tiktokMediaModel;
                tikTokMediaModel.selectIndex = i2;
                tikTokMediaModel.copiedCount = 1;
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SocMediaResource) it2.next()).tiktokMediaModel);
        }
        if (this.LJIILJJIL) {
            ShortVideoContext shortVideoContext = this.LJII;
            String str2 = "";
            if (shortVideoContext != null) {
                CreativeModel creativeModel = shortVideoContext.creativeModel;
                if (creativeModel != null && (commonMobParamModel2 = creativeModel.commonMobModel) != null) {
                    String str3 = shortVideoContext.enterFrom;
                    if (str3 == null) {
                        str3 = "";
                    }
                    commonMobParamModel2.shootEnterFrom = str3;
                }
                CreativeModel creativeModel2 = shortVideoContext.creativeModel;
                if (creativeModel2 != null && (commonMobParamModel = creativeModel2.commonMobModel) != null) {
                    String str4 = shortVideoContext.enterMethod;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    commonMobParamModel.shootEnterMethod = str2;
                }
            }
        }
        C345210Dg7 c345210Dg7LIZIZ = C345220Dg8.LIZIZ();
        c345210Dg7LIZIZ.LIZ(new C535450KzH());
        c345210Dg7LIZIZ.LJ(C09HN.LIZ(arrayList), new AwS122S1100000_8(this, str, 14));
    }

    public final void LJII(List<? extends MediaModel> list, boolean z) {
        String str;
        EnumC563850M9n aiLiveSwitchStyle;
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext;
        PrivacySettingModel privacySettingModel;
        CreativeModel creativeModel2;
        AILivePhotoModel aILivePhotoModel;
        String mobName;
        EnumC563850M9n aiLiveSwitchStyle2;
        CreativeModel creativeModel3;
        AILivePhotoModel aILivePhotoModel2;
        AILivePhotoModel aILivePhotoModel3;
        EditSaveLocalModel editSaveLocalModel;
        CreativeModel creativeModel4;
        AIGCExtraModel aIGCExtraModel;
        CreativeModel creativeModel5;
        EditSaveLocalModel editSaveLocalModel2;
        Pair<Integer, Integer> pairLIZ;
        HashMap<String, String> metaData;
        String strLJIL;
        CreativeFlowData creativeFlowData;
        AutoSelectedAnchorInfos autoSelectedAnchorInfos;
        n nVarLJIILIIL;
        n nVarLJJIJ;
        k kVarLJJIIZ;
        ShortVideoContext shortVideoContext2;
        CommonMobParamModel commonMobParamModel;
        CommonMobParamModel commonMobParamModel2;
        CreativeModel creativeModel6;
        String str2;
        Unit unit;
        String str3;
        List<String> listLJJLIIIJILLIZJL;
        CreativeModel creativeModel7;
        CreativeModel creativeModel8;
        EditModel editModel;
        C2488309p3 c2488309p3;
        int i = this.LJIIL;
        int i2 = 2;
        if (i != 29 && i != 1) {
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 11;
            } else {
                Iterator<? extends MediaModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().LJIIJ()) {
                        if (list.size() == 1) {
                            if (!list.isEmpty()) {
                                Iterator<? extends MediaModel> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (!it3.next().LJIILJJIL()) {
                                        i = 2;
                                        break;
                                    }
                                }
                            }
                            i = 13;
                        } else {
                            i = 2;
                            break;
                        }
                    }
                }
                i = 11;
            }
        }
        this.LJIIL = i;
        Intent intent = new Intent();
        if (this.LJIIL == 2 && list.size() > 1) {
            for (MediaModel mediaModel : list) {
                if (C2471909mP.LJJIII(mediaModel.LJFF(), false, 4)) {
                    mediaModel.duration = 3000L;
                    if (!((Boolean) C280530Az5.LIZ.getValue()).booleanValue()) {
                        int i3 = mediaModel.width;
                        double d = i3;
                        int i4 = mediaModel.height;
                        double d2 = i4;
                        double d3 = d2 * 2.4d;
                        if (d <= d3 && d2 <= d * 2.4d) {
                            i3 = 720;
                        }
                        mediaModel.width = i3;
                        double d4 = i3;
                        if (d4 <= d3 && d2 <= d4 * 2.4d) {
                            i4 = 1280;
                        }
                        mediaModel.height = i4;
                    }
                }
            }
            Iterator<? extends MediaModel> it4 = list.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().LJIILJJIL()) {
                        if (!z3) {
                            z3 = true;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        if (!z2) {
                            z2 = true;
                        }
                        if (z3) {
                            break;
                        }
                    }
                } else if (z3) {
                    if (!z2) {
                        i2 = 1;
                    }
                } else {
                    i2 = z2 ? 3 : 0;
                }
            }
            intent.putExtra("extra_stick_point_type", i2);
        }
        if (this.LJIIL != 11 && LIZJ() && (c2488309p3 = (C2488309p3) this.LJFF.getValue()) != null) {
            c2488309p3.LIZ(this.LJIIIIZZ);
        }
        ShortVideoContext shortVideoContext3 = this.LJII;
        if (shortVideoContext3 != null) {
            shortVideoContext3.uploadTabNameList = Collections.singletonList("all");
        }
        ShortVideoContext shortVideoContext4 = this.LJII;
        if (shortVideoContext4 != null && (creativeModel8 = shortVideoContext4.creativeModel) != null && (editModel = creativeModel8.editModel) != null) {
            editModel.isFromEditAutoCut = false;
        }
        C0L24 c0l24 = null;
        Pair<Integer, Integer> pairLIZ2 = null;
        c0l24 = null;
        c0l24 = null;
        c0l24 = null;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MediaModel mediaModel2 : list) {
                arrayList.add(new MediaLocationMetaDataModel(mediaModel2.LJFF(), mediaModel2.encryptLatitude, mediaModel2.encryptLongitude, mediaModel2.createTimestamp));
                if (mediaModel2.LJIILJJIL() && (str2 = (String) C23203097h.LIZ(mediaModel2.LJFF()).get("live_info")) != null) {
                    mediaModel2.liveInfo = str2;
                    try {
                        Object objOpt = new JSONObject(str2).opt("live_room_ids");
                        if ((objOpt instanceof String) && (str3 = (String) objOpt) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) != null) {
                            for (String str4 : listLJJLIIIJILLIZJL) {
                                ShortVideoContext shortVideoContext5 = this.LJII;
                                if (shortVideoContext5 != null && (creativeModel7 = shortVideoContext5.creativeModel) != null && !creativeModel7.liveRecordModel.roomIdList.contains(Long.valueOf(CastLongProtector.parseLong(str4)))) {
                                    creativeModel7.liveRecordModel.roomIdList.add(Long.valueOf(CastLongProtector.parseLong(str4)));
                                }
                            }
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
            ShortVideoContext shortVideoContext6 = this.LJII;
            if (shortVideoContext6 != null && (creativeModel6 = shortVideoContext6.creativeModel) != null) {
                creativeModel6.mediaLocationMetaDataList = arrayList;
            }
        }
        String str5 = "";
        if (this.LJIILJJIL && (shortVideoContext2 = this.LJII) != null) {
            CreativeModel creativeModel9 = shortVideoContext2.creativeModel;
            if (creativeModel9 != null && (commonMobParamModel2 = creativeModel9.commonMobModel) != null) {
                String str6 = shortVideoContext2.enterFrom;
                if (str6 == null) {
                    str6 = "";
                }
                commonMobParamModel2.shootEnterFrom = str6;
            }
            CreativeModel creativeModel10 = shortVideoContext2.creativeModel;
            if (creativeModel10 != null && (commonMobParamModel = creativeModel10.commonMobModel) != null) {
                String str7 = shortVideoContext2.enterMethod;
                if (str7 == null) {
                    str7 = "";
                }
                commonMobParamModel.shootEnterMethod = str7;
            }
        }
        if (list.size() == 1) {
            MediaModel mediaModel3 = (MediaModel) ListProtector.get(list, 0);
            if (C1463450oBb.LIZ()) {
                if (!mediaModel3.LJIIJ()) {
                    metaData = C498101wp.LIZ(mediaModel3.LJFF());
                }
            } else {
                metaData = TEVideoUtils.getMetaData(mediaModel3.LJFF());
            }
            String str8 = metaData.get("LvMetaInfo");
            try {
                new p();
                k kVarLJJIIZ2 = p.LIZJ(str8).LJIILIIL().LJJIIZ("data");
                if (kVarLJJIIZ2 != null && (nVarLJIILIIL = kVarLJJIIZ2.LJIILIIL()) != null && (nVarLJJIJ = nVarLJIILIIL.LJJIJ("tiktokAnchorConfig")) != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("shareId")) != null) {
                    strLJIL = kVarLJJIIZ.LJIL();
                } else {
                    strLJIL = null;
                }
                ShortVideoContext shortVideoContext7 = this.LJII;
                if (shortVideoContext7 != null && (creativeFlowData = shortVideoContext7.creativeFlowData) != null && (autoSelectedAnchorInfos = creativeFlowData.getAutoSelectedAnchorInfos()) != null) {
                    autoSelectedAnchorInfos.setOpenPlatformShareId(strLJIL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        intent.putExtra("key_choose_media_item_size", this.LJJ);
        intent.putExtra("key_choose_media_data", C09HN.LIZ(list));
        intent.putExtra("key_select_mv_data", this.LJIJJ);
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        intent.putExtra("key_choose_scene", this.LJIIIZ);
        String str9 = this.LJIILL;
        if (str9 == null) {
            str9 = "";
        }
        intent.putExtra("shoot_way", str9);
        String str10 = this.LJIJJLI;
        if (str10 == null) {
            str10 = "";
        }
        intent.putExtra("content_source", str10);
        String str11 = this.LJIL;
        if (str11 == null) {
            str11 = "";
        }
        intent.putExtra("content_type", str11);
        C537520L6g.LIZLLL(intent, this.LJIIIIZZ);
        intent.putExtra("click_next_in_album_time", true);
        ShortVideoContext shortVideoContext8 = this.LJII;
        if (shortVideoContext8 == null || (str = shortVideoContext8.albumPreviewNextMethod) == null) {
            str = "";
        }
        intent.putExtra("upload_next_method", str);
        intent.putExtra("is_pip", this.LJIJI);
        intent.putExtra("key_is_from_use_effect_btn", false);
        if (list.size() == 1 && (pairLIZ = C0L21.LIZ(((MediaModel) ListProtector.get(list, 0)).LJFF())) != null) {
            int iIntValue = pairLIZ.getFirst().intValue();
            int iIntValue2 = pairLIZ.getSecond().intValue();
            intent.putExtra("key_story_canvas_bg_color_start", iIntValue);
            intent.putExtra("key_story_canvas_bg_color_end", iIntValue2);
        }
        ShortVideoContext shortVideoContext9 = this.LJII;
        if (shortVideoContext9 != null) {
            intent.putExtra("key_short_video_context", shortVideoContext9);
        }
        VideoPublishEditModel videoPublishEditModel = this.LJIILLIIL;
        if (videoPublishEditModel != null) {
            intent.putExtra("key_video_publish_edit_model", (Parcelable) videoPublishEditModel);
        }
        ShortVideoContext shortVideoContext10 = this.LJII;
        if (shortVideoContext10 != null && (creativeModel5 = shortVideoContext10.creativeModel) != null && (editSaveLocalModel2 = creativeModel5.editSaveLocalModel) != null) {
            editSaveLocalModel2.flowId = UUID.randomUUID().toString();
        }
        ShortVideoContext shortVideoContext11 = this.LJII;
        if (shortVideoContext11 != null && (creativeModel4 = shortVideoContext11.creativeModel) != null && (aIGCExtraModel = creativeModel4.aigcExtraModel) != null) {
            aIGCExtraModel.aiCreationId = UUID.randomUUID().toString();
        }
        ShortVideoContext shortVideoContext12 = this.LJII;
        if (shortVideoContext12 != null) {
            CreativeModel creativeModel11 = shortVideoContext12.creativeModel;
            if (creativeModel11 != null && (editSaveLocalModel = creativeModel11.editSaveLocalModel) != null) {
                editSaveLocalModel.saveLocalProgress = -1;
            }
            CreativeModel creativeModel12 = shortVideoContext12.creativeModel;
            if (creativeModel12 != null && (aILivePhotoModel3 = creativeModel12.aiLivePhotoModel) != null) {
                aILivePhotoModel3.needAutoShow = z;
            }
        }
        SocialMediaPickerConfig socAlbumConfig = this.LIZ.getSocAlbumConfig();
        if (socAlbumConfig != null) {
            aiLiveSwitchStyle = socAlbumConfig.getAiLiveSwitchStyle();
        } else {
            aiLiveSwitchStyle = null;
        }
        if (aiLiveSwitchStyle != EnumC563850M9n.DISABLE) {
            ShortVideoContext shortVideoContext13 = this.LJII;
            if (shortVideoContext13 != null && (creativeModel3 = shortVideoContext13.creativeModel) != null && (aILivePhotoModel2 = creativeModel3.aiLivePhotoModel) != null) {
                aILivePhotoModel2.aiLiveSwitch = this.LIZJ.wQ2();
            }
            ShortVideoContext shortVideoContext14 = this.LJII;
            if (shortVideoContext14 != null && (creativeModel2 = shortVideoContext14.creativeModel) != null && (aILivePhotoModel = creativeModel2.aiLivePhotoModel) != null) {
                SocialMediaPickerConfig socAlbumConfig2 = this.LIZ.getSocAlbumConfig();
                if (socAlbumConfig2 != null && (aiLiveSwitchStyle2 = socAlbumConfig2.getAiLiveSwitchStyle()) != null) {
                    mobName = aiLiveSwitchStyle2.getMobName();
                } else {
                    mobName = null;
                }
                aILivePhotoModel.aiLiveSwitchStyle = mobName;
            }
        }
        if (C298680BnG.LIZ() && this.LIZ.isSubOnlyStory() && C0L44.LIZ() && (shortVideoContext = this.LJII) != null) {
            CreativeModel creativeModel13 = shortVideoContext.creativeModel;
            if (creativeModel13 != null && (privacySettingModel = creativeModel13.privacySettingModel) != null) {
                privacySettingModel.isSubscribeOnly = true;
            }
            shortVideoContext.isPrivate = 4;
        }
        ShortVideoContext shortVideoContext15 = this.LJII;
        if (shortVideoContext15 != null && (creativeModel = shortVideoContext15.creativeModel) != null) {
            creativeModel.canvasVideoData = null;
            PublishModel publishModel = creativeModel.publishModel;
            publishModel.videoCanvasWidth = 0;
            publishModel.videoCanvasHeight = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MediaModel mediaModel4 : list) {
            if (mediaModel4.LJIILJJIL()) {
                arrayList2.add(mediaModel4);
            }
        }
        ShortVideoContext shortVideoContext16 = this.LJII;
        IStoryCanvasVideoHelper iStoryCanvasVideoHelper = (IStoryCanvasVideoHelper) PluggableExtentionKt.pluggableSpi$default(IStoryCanvasVideoHelper.class, false, false, false, 14, null);
        if (shortVideoContext16 != null && (!arrayList2.isEmpty()) && iStoryCanvasVideoHelper != null && iStoryCanvasVideoHelper.LIZJ(arrayList2.size(), shortVideoContext16)) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MediaModel mediaModel5 : list) {
                String strLJFF = mediaModel5.LJFF();
                if (strLJFF == null) {
                    strLJFF = "";
                }
                arrayList3.add(new C536390L1x(strLJFF, mediaModel5.width, mediaModel5.height));
            }
            String strLJFF2 = ((MediaModel) C13LP.LJJJJZI(arrayList2)).LJFF();
            if (strLJFF2 != null) {
                str5 = strLJFF2;
            }
            if (list.size() == 1) {
                pairLIZ2 = C0L21.LIZ(str5);
            }
            c0l24 = new C0L24(this.LIZIZ.LJJIZ(), shortVideoContext16, arrayList3, pairLIZ2, iStoryCanvasVideoHelper);
        }
        this.LJIIJ = MediaChosenResultProcessFactory.LIZJ().LIZ(this.LIZIZ.LLJJIJIIJIL(), this.LIZIZ.getDiContainer(), this.LJIIL, this.LJIIZILJ, this.LJIJ);
        C345210Dg7 c345210Dg7LIZIZ = C345220Dg8.LIZIZ();
        c345210Dg7LIZIZ.LIZ(new C526700KlA(this.LIZIZ.LJJIZ(), false));
        c345210Dg7LIZIZ.LIZ(new C535450KzH());
        if (c0l24 != null) {
            c345210Dg7LIZIZ.LIZ(c0l24);
        }
        C345210Dg7.LIZLLL(c345210Dg7LIZIZ, intent, new AwS409S0200000_8(this, intent, 110));
    }

    public final void LJIIIZ(SocMediaResource socMediaResource, boolean z) {
        String name;
        if (C289260BVk.LIZIZ()) {
            String str = socMediaResource.id;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            boolean zLIZLLL = socMediaResource.LIZLLL();
            String strLIZ = socMediaResource.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            if (C2286708xd.LIZJ(socMediaResource.tiktokMediaModel.LJFF()) && (name = new C0VSJ(C2471909mP.LJIJ(socMediaResource.tiktokMediaModel)).getName()) != null) {
                str2 = name;
            }
            C1458730o3z c1458730o3z = new C1458730o3z(str, zLIZLLL, strLIZ, str2, Long.valueOf(socMediaResource.durationMs), false, 32);
            C1458370o3P c1458370o3P = C1458370o3P.LIZ;
            ShortVideoContext shortVideoContext = this.LJII;
            c1458370o3P.getClass();
            C1458370o3P.LJJIIJ(c1458730o3z, z, shortVideoContext, true, true);
        }
    }

    public C536350L1t(Bundle bundle, EnterStoryParam enterStoryParam, InterfaceC536360L1u interfaceC536360L1u, SocialMediaPickerViewModel socialMediaPickerViewModel) {
        InterfaceC522160Kdq c528220Knc;
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        TemplateData templateData;
        TemplateData templateData2;
        EnumC1412640mre enumC1412640mreLIZJ;
        TemplateData templateData3;
        StoryShootModel storyShootModel;
        this.LIZ = enterStoryParam;
        this.LIZIZ = interfaceC536360L1u;
        this.LIZJ = socialMediaPickerViewModel;
        String strLIZLLL = null;
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            c528220Knc = new C523160KfS();
        } else {
            c528220Knc = new C528220Knc(null);
        }
        this.LIZLLL = c528220Knc;
        this.LJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(398));
        this.LJFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 930));
        CreativeInfo creativeInfoLIZIZ = C0DMI.LIZIZ(null);
        this.LJIIIIZZ = creativeInfoLIZIZ;
        this.LJIJ = -1L;
        ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("key_short_video_context");
        this.LJII = shortVideoContext;
        if (shortVideoContext != null) {
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (storyShootModel = creativeModel2.storyModel) != null) {
                storyShootModel.setShootFromSocialAlbum(true);
            }
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            if (creativeInfo != null) {
                creativeInfoLIZIZ = creativeInfo;
            }
        }
        this.LJIIIIZZ = creativeInfoLIZIZ;
        if (shortVideoContext != null) {
            CreativeModel creativeModel3 = shortVideoContext.creativeModel;
            if (creativeModel3 != null && (templateData3 = creativeModel3.templateData) != null) {
                templateData3.setTemplateType(Integer.valueOf(bundle.getInt("template_type", -1)));
            }
            CreativeModel creativeModel4 = shortVideoContext.creativeModel;
            if (creativeModel4 != null && (templateData2 = creativeModel4.templateData) != null) {
                Integer templateType = templateData2.getTemplateType();
                if (templateType != null && (enumC1412640mreLIZJ = C1412660mrg.LIZJ(templateType.intValue())) != null) {
                    strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
                }
                templateData2.setTtTemplateType(strLIZLLL);
            }
            CreativeModel creativeModel5 = shortVideoContext.creativeModel;
            if (creativeModel5 != null && (templateData = creativeModel5.templateData) != null) {
                templateData.setMvId(bundle.getString("mv_id"));
            }
        }
        this.LJIIIZ = bundle.getInt("key_choose_scene", -1);
        this.LJIIJJI = bundle.getInt("key_choose_request_code", -1);
        this.LJIILIIL = bundle.getInt("key_support_flag", -1);
        boolean z = bundle.getBoolean("key_upload_direct_enter", false);
        this.LJIILJJIL = z;
        this.LJIILL = bundle.getString("shoot_way");
        this.LJIILLIIL = (VideoPublishEditModel) bundle.getParcelable("key_video_publish_edit_model");
        this.LJIIZILJ = bundle.getLong("Key_min_duration", C566050MHz.LIZIZ());
        this.LJIJI = bundle.getBoolean("is_pip", false);
        this.LJIJJ = bundle.getParcelable("key_select_mv_data");
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (commonMobParamModel = creativeModel.commonMobModel) != null) {
            commonMobParamModel.isUploadDirectEnter = z;
        }
        String string = bundle.getString("content_source");
        this.LJIJJLI = string == null ? "upload" : string;
        this.LJIL = bundle.getString("content_type");
    }
}
