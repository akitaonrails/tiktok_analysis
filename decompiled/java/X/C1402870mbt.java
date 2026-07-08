package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.ReuploadMetaData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402870mbt {
    public static final String LJFF() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            }
        }
        sbLIZ.append(sb.toString());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJI(String str) {
        if (str != null && str.length() != 0) {
            return "sdk";
        }
        return "system_share";
    }

    public static final String LJII(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<String> arrayList;
        int videoLength = (int) (((double) videoPublishEditModel.getVideoLength()) * 0.02d);
        List<Integer> list = videoPublishEditModel.creativeModel.musicBuzModel.trimPointsList;
        if (list == null) {
            return "";
        }
        String str = "";
        int i = 0;
        for (Integer num : list) {
            int i2 = i + 1;
            if (i >= 0) {
                int iIntValue = num.intValue();
                int i3 = iIntValue - videoLength;
                int i4 = iIntValue + videoLength;
                MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                int i5 = musicBuzModel.musicStart;
                if (i3 <= i5 && i5 <= i4 && ((arrayList = musicBuzModel.trimTypeList) == null || (str = (String) ListProtector.get(arrayList, i)) == null)) {
                    str = "";
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return str;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        AISelfModel aISelfModel = videoPublishEditModel.creativeModel.aiSelfModel;
        if (C123100dR.LIZ(aISelfModel.styleName)) {
            c0lab.LJ("root_style_id", aISelfModel.styleParentId);
            c0lab.LJ("style_id", aISelfModel.styleId);
            c0lab.LJ("aime_task_id", aISelfModel.taskId);
            c0lab.LIZ(aISelfModel.aiSelfIsFromAlbumAiTab, "ai_self_is_from_album_ai_tab");
            c0lab.LJ("style_selected_from", aISelfModel.styleSelectedFrom);
            c0lab.LIZ(!Intrinsics.LJFF(aISelfModel.isChildStyle, Boolean.TRUE) ? 1 : 0, "is_default_prompt");
            if (C290460Ba0.LIZ()) {
                c0lab.LJ("aime_entrance", aISelfModel.aimeEntrance);
            }
            if (u4.LJJIL(videoPublishEditModel)) {
                c0lab.LJ("aiself_click_from", "shoot_page_edit_tab");
            }
        }
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        JSONObject jSONObjectOptJSONObject;
        if (videoPublishEditModel == null) {
            return;
        }
        try {
            String descriptionByUpload = videoPublishEditModel.getDescriptionByUpload();
            if (descriptionByUpload != null && !a0.LJJJIL(descriptionByUpload)) {
                JSONObject jSONObject = new JSONObject(descriptionByUpload);
                if (Intrinsics.LJFF(jSONObject.optString("source_type"), "vicut") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("capabilityName");
                    if ((!a0.LJJJIL(strOptString)) && strOptString != null) {
                        c0lab.LJ("capabilityName", strOptString);
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("templateId");
                    if ((!a0.LJJJIL(strOptString2)) && strOptString2 != null) {
                        c0lab.LJ("cc_template_id", strOptString2);
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402870mbt.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.Map):void");
    }

    public static final void LJIIIIZZ(ArrayList arrayList, Map map) {
        boolean z;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((ReuploadMetaData) it2.next()).isMetTemplateUsed()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        map.put("met_parent_template_resource_id", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_met_template_used_in_publish", str);
    }

    public static final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, Map map) {
        boolean z;
        String str;
        String strLJJLIIIJ;
        List<String> list;
        String str2 = "";
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        if (stickerInfo != null && stickerInfo.isMobileEffect()) {
            z = true;
        } else {
            z = false;
        }
        List<Boolean> list2 = videoPublishEditModel.creativeModel.effectData.isChildEffect;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<Boolean> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!it2.next().booleanValue()) {
                    if (z) {
                        str = "1";
                    }
                }
            }
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_met_template_used_in_publish", str);
        ArrayList arrayList = new ArrayList();
        try {
            StickerInfo stickerInfo2 = videoPublishEditModel.stickerInfo;
            if (stickerInfo2 != null && stickerInfo2.isMobileEffect() && (list = videoPublishEditModel.creativeModel.effectData.metParentResourceIds) != null && list.size() > 0) {
                String str3 = list.get(0);
                if (str3 != null && str3.length() != 0) {
                    if (list.size() > 0) {
                        arrayList.add(list.get(0));
                    }
                } else {
                    String str4 = videoPublishEditModel.creativeModel.effectData.resourceIds;
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!(!arrayList.isEmpty())) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
            }
            map.put("met_parent_template_resource_id", str2);
        }
        str2 = strLJJLIIIJ;
        map.put("met_parent_template_resource_id", str2);
    }

    public static final void LJIIJ(VideoPublishEditModel videoPublishEditModel, Map map) {
        String str;
        String strLJJLIIIJ;
        ArrayList<TimeSpeedModelExtension> arrayList;
        StickerInfo stickerInfo;
        String str2 = "";
        if (C1428470nHB.LJL(videoPublishEditModel)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_met_template_used_in_publish", str);
        ArrayList arrayList2 = new ArrayList();
        try {
            MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
                for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                    String stickerId = timeSpeedModelExtension.getStickerId();
                    if (stickerId != null && stickerId.length() != 0 && (stickerInfo = timeSpeedModelExtension.getStickerInfo()) != null && stickerInfo.isMobileEffect()) {
                        String metParentResourceId = stickerInfo.getMetParentResourceId();
                        if (metParentResourceId != null && metParentResourceId.length() != 0) {
                            String metParentResourceId2 = stickerInfo.getMetParentResourceId();
                            if (metParentResourceId2 != null) {
                                arrayList2.add(metParentResourceId2);
                            }
                        } else {
                            String resourceId = timeSpeedModelExtension.getEffectInfo().getResourceId();
                            if (resourceId != null) {
                                arrayList2.add(resourceId);
                            }
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!(!arrayList2.isEmpty())) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ == null) {
            }
            map.put("met_parent_template_resource_id", str2);
        }
        str2 = strLJJLIIIJ;
        map.put("met_parent_template_resource_id", str2);
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, Map map) {
        String strLJJLIIIJ;
        List<String> list = videoPublishEditModel.creativeModel.effectData.metParentResourceIds;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        map.put("met_parent_template_resource_id", strLJJLIIIJ);
    }

    public static final void LJ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        int i2;
        VecNLETrackSPtr tracks;
        Object next;
        String extra;
        Integer numLJIIJJI;
        String str;
        MvModel mvModel;
        String mvId;
        LIZIZ(nLEModel, videoPublishEditModel, c0lab, "publish");
        C377880Eri.LIZ(c0lab, nLEModel);
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.retryCount, "retry_count");
        Iterator<String> it2 = videoPublishEditModel.creativeModel.pugcTemplateData.featureList.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            } else if (Intrinsics.LJFF(it2.next(), "UGC_MAGIC_V2")) {
                c0lab.LJ("template_task_name", "COMBINE_EFFECT");
                break;
            }
        }
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        if (C856200XiM.LIZ() || C0M0L.LIZ()) {
            if (videoPublishEditModel.creativeModel.pugcTemplateData.canPostTemplate) {
                c0lab.LJ("is_allow_pugc_template", "1");
                c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.contentCnt, "pugc_content_cnt");
                c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.fixedSlots.size(), "pugc_non_replaceable_content_cnt");
                c0lab.LJ("pugc_non_replaceable_content_location_list", videoPublishEditModel.creativeModel.pugcTemplateData.fixedSlotIndex.toString());
                c0lab.LJ("pugc_content_duration_list", videoPublishEditModel.creativeModel.pugcTemplateData.slotDurations.toString());
            } else {
                c0lab.LJ("is_allow_pugc_template", CardStruct.IStatusCode.DEFAULT);
            }
        }
        String str2 = "";
        if (C1428470nHB.LLIIJI(videoPublishEditModel)) {
            String str3 = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
            if (str3 == null) {
                str3 = "";
            }
            c0lab.LJ("followed_template_id", str3);
        }
        AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct != null && (mvModel = uploadMiscInfoStruct.mvInfo) != null && (mvId = mvModel.getMvId()) != null) {
            c0lab.LJ("followed_template_id", mvId);
        }
        AVUploadMiscInfoStruct uploadMiscInfoStruct2 = videoPublishEditModel.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct2 != null && (str = uploadMiscInfoStruct2.mvThemeId) != null) {
            c0lab.LJ("followed_template_id", str);
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.pugcTemplateData.canPostTemplate || creativeModel.ugcTemplateData.enablePublishAsTemplate || C1428470nHB.LLIIJI(videoPublishEditModel) || C1428470nHB.LJLJL(videoPublishEditModel)) {
            c0lab.LJ("template_used_functions", C0EG7.LIZ(videoPublishEditModel));
        }
        if (C1428470nHB.LLIIJI(videoPublishEditModel) || C1428470nHB.LJLJL(videoPublishEditModel)) {
            c0lab.LJ("is_use_editor_pro_template", C1402490mbH.LIZ(videoPublishEditModel.creativeModel.ugcTemplateData.isFromEPTemplateAnchor));
            c0lab.LJ("template_tags", videoPublishEditModel.creativeModel.ugcTemplateData.templateTags);
        }
        c0lab.LJ("followed_template_type", videoPublishEditModel.creativeModel.followUpPublishTrackerModel.followedTemplateType);
        c0lab.LJ("followed_main_anchor_type", videoPublishEditModel.creativeModel.followUpPublishTrackerModel.followedMainAnchorType);
        if (C1416310mxZ.LJJJIL(videoPublishEditModel)) {
            c0lab.LJ("mv_tab_name", videoPublishEditModel.creativeModel.mvModel.templateCategoryName);
            c0lab.LIZ(videoPublishEditModel.creativeModel.mvModel.templatePosition, "mv_position");
            c0lab.LJ("is_cache_template", C1402490mbH.LIZ(videoPublishEditModel.creativeModel.mvModel.templateFromCache));
            c0lab.LJ("mv_category_key", videoPublishEditModel.creativeModel.mvModel.templateCategoryKey);
            c0lab.LJ("template_tags", videoPublishEditModel.creativeModel.mvModel.templateTags);
            if (C1428470nHB.LJJLIIIJL(videoPublishEditModel)) {
                C1402970mc3.LIZ(videoPublishEditModel.creativeModel, c0lab);
            }
        }
        if (videoPublishEditModel.creativeModel.mvModel.isFromTemplateTabUseNow && C1416310mxZ.LJJJIL(videoPublishEditModel)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_click_template_use_now");
        if (((Boolean) C284560BDi.LIZ.getValue()).booleanValue() && C1433000nOU.LIZIZ(videoPublishEditModel) != null) {
            c0lab.LIZJ(C1433000nOU.LIZIZ(videoPublishEditModel), "template_complexity_score");
        } else {
            c0lab.LIZ(0, "template_complexity_score");
        }
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            i = 1;
        }
        c0lab.LIZ(i, "is_nows");
        C1428520nHG.LJFF(videoPublishEditModel, c0lab, !Intrinsics.LJFF("publish", "publish"));
        C1402970mc3.LIZLLL(c0lab, videoPublishEditModel.creativeModel, videoPublishEditModel, "publish");
        C1402970mc3.LJ(videoPublishEditModel, c0lab);
        int iIntValue = videoPublishEditModel.creativeModel.pugcTemplateData.fillMode;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it3 = tracks.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getSlots(), arrayList);
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    if (((NLENode) next).hasExtra("pugc_fill_mode")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLENode nLENode = (NLENode) next;
            if (nLENode != null && (extra = nLENode.getExtra("pugc_fill_mode")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null) {
                iIntValue = numLJIIJJI.intValue();
            }
        }
        if (iIntValue != EnumC356130Dxj.DEFAULT.ordinal()) {
            if (iIntValue == EnumC356130Dxj.ORIGIN_SHAPE.ordinal()) {
                str2 = "original";
            } else if (iIntValue == EnumC356130Dxj.CROP.ordinal()) {
                str2 = "crop";
            }
            c0lab.LJ("pugc_fill_mode", str2);
        }
    }

    public static final void LIZIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, String str) {
        int i;
        int i2;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        String str5;
        int i3;
        String str6;
        String str7;
        String str8;
        AutoCutTitle autoCutTitle;
        boolean z3;
        boolean z4;
        EnumC1413160msU enumC1413160msU = null;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            PhotoModeEditingStage photoModeEditingStage = videoPublishEditModel.creativeModel.photoModeEnterEditingStage;
            if (photoModeEditingStage != null) {
                enumC1413160msU = photoModeEditingStage.itemType;
            }
            if (enumC1413160msU == EnumC1413160msU.SLIDESHOW) {
                c0lab.LJ("autocut_click_from", "edit_page_photo");
            }
            if (!Intrinsics.LJFF(str, "enter_video_post_page") && !Intrinsics.LJFF(str, "publish")) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean zLJFF = Intrinsics.LJFF(str, "publish");
            if (!Intrinsics.LJFF(str, "enter_video_post_page") && !Intrinsics.LJFF(str, "publish")) {
                z4 = false;
            } else {
                z4 = true;
            }
            C538730LAx.LIZIZ(c0lab, videoPublishEditModel, z3, zLJFF, z4, nLEModel);
            return;
        }
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AutoCutThemeData next = it2.next();
            if (Intrinsics.LJFF(next.musicId, videoPublishEditModel.getMusicId())) {
                if (next != null) {
                    i = 0;
                }
            }
        }
        i = 1;
        c0lab.LJ("autocut_style_name", s.LJIILIIL(autoCutModel.curIndexFromSource, autoCutModel, C1416110mxF.LJIIJJI(autoCutModel.curSource)));
        if (C1416110mxF.LIZIZ(autoCutModel) == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_recommend_style");
        String strLJJII = autoCutModel.clickFrom;
        if (strLJJII == null || strLJJII.length() == 0) {
            strLJJII = C1428520nHG.LJJII(videoPublishEditModel, C1416110mxF.LJIIJJI(autoCutModel.curSource), null);
        }
        c0lab.LJ("autocut_click_from", strLJJII);
        c0lab.LIZ(autoCutModel.curTemplateType, "autocut_template_type");
        c0lab.LJ("autocut_template_id", autoCutModel.curTemplateId);
        c0lab.LJ("autocut_reuse_music_type", s.LJJIIJ(autoCutModel, null, null));
        c0lab.LJ("autocut_task_id", autoCutModel.taskId);
        c0lab.LJ("autocut_template_group_id", autoCutModel.curTemplateGroupId);
        c0lab.LJ("autocut_template_tag", autoCutModel.curTemplateTag);
        C1412610mrb.LIZLLL(c0lab, autoCutModel.speedVariationType);
        C1412610mrb.LJFF(c0lab, Integer.valueOf(autoCutModel.curTemplateType), autoCutModel.curSceneType);
        List<TextStickerData> listLJI = C0F7U.LJI(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        for (TextStickerData textStickerData : listLJI) {
            if (Intrinsics.LJFF(textStickerData.getType(), "type_text_sticker")) {
                arrayList.add(textStickerData);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (true) {
            str2 = "";
            if (!it3.hasNext()) {
                break;
            }
            TextStickerData textStickerData2 = (TextStickerData) it3.next();
            if (textStickerData2 != null) {
                String textStr = textStickerData2.getTextStr();
                String fontId = textStickerData2.getFontId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append(textStickerData2.getX());
                sbLIZ.append(", ");
                sbLIZ.append(textStickerData2.getY());
                sbLIZ.append(')');
                autoCutTitle = new AutoCutTitle(textStr, fontId, C2188811AlT.LIZIZ(sbLIZ), "");
            } else {
                autoCutTitle = null;
            }
            arrayList2.add(autoCutTitle);
        }
        C1412610mrb.LIZIZ(c0lab, str, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<AutoCutMediaModel> list = autoCutModel.curMediaList;
        if (list != null) {
            for (AutoCutMediaModel autoCutMediaModel : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(autoCutMediaModel.width);
                sb.append('*');
                sb.append(autoCutMediaModel.height);
                arrayList3.add(sb.toString());
                arrayList4.add(String.valueOf(autoCutMediaModel.duration));
            }
        }
        List<AutoCutTitle> list2 = autoCutModel.curRecommendTitleList;
        if (list2 != null) {
            ArrayList arrayList5 = new ArrayList();
            if (arrayList2.isEmpty()) {
                i3 = 1;
            } else {
                loop4: while (true) {
                    i3 = 0;
                    for (AutoCutTitle autoCutTitle2 : list2) {
                        Iterator it4 = arrayList2.iterator();
                        int i4 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                AutoCutTitle autoCutTitle3 = (AutoCutTitle) it4.next();
                                String str9 = autoCutTitle2.caption;
                                if (autoCutTitle3 != null) {
                                    str6 = autoCutTitle3.caption;
                                } else {
                                    str6 = null;
                                }
                                int i5 = !Intrinsics.LJFF(str9, str6) ? 1 : 0;
                                String str10 = autoCutTitle2.actualCaptionLocation;
                                if (autoCutTitle3 != null) {
                                    str7 = autoCutTitle3.originCaptionLocation;
                                } else {
                                    str7 = null;
                                }
                                int i6 = !Intrinsics.LJFF(str10, str7) ? 1 : 0;
                                String str11 = autoCutTitle2.captionFontId;
                                if (autoCutTitle3 != null) {
                                    str8 = autoCutTitle3.captionFontId;
                                } else {
                                    str8 = null;
                                }
                                int i7 = ((!Intrinsics.LJFF(str11, str8) ? 1 : 0) << 2) + (i6 << 1) + i5;
                                if (i7 != 0) {
                                    if ((i7 & 1) == 0) {
                                        i3 = i7;
                                        break;
                                    }
                                    i4 |= i7;
                                }
                            } else {
                                i3 |= i4;
                                break;
                            }
                        }
                    }
                }
            }
            int i8 = i3 & 1;
            int i9 = (i3 & 2) >> 1;
            int i10 = (i3 & 4) >> 2;
            if (i3 == 0) {
                arrayList5.add(Integer.valueOf(EnumC992580bw8.AUTO_CUT_CHANGE_TITLE_NONE.getValue()));
            } else {
                if (i8 == 1) {
                    arrayList5.add(Integer.valueOf(EnumC992580bw8.AUTO_CUT_CHANGE_TITLE_CONTENT.getValue()));
                }
                if (i9 == 1) {
                    arrayList5.add(Integer.valueOf(EnumC992580bw8.AUTO_CUT_CHANGE_TITLE_LOCATION.getValue()));
                }
                if (i10 == 1) {
                    arrayList5.add(Integer.valueOf(EnumC992580bw8.AUTO_CUT_CHANGE_TITLE_FONT.getValue()));
                }
            }
            c0lab.LJ("autocut_is_change_caption", arrayList5.toString());
        }
        if (Intrinsics.LJFF(str, "publish")) {
            s.LJIILIIL(autoCutModel.curIndexFromSource, autoCutModel, C1416110mxF.LJIIJJI(autoCutModel.curSource));
            AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource));
            if (autoCutThemeDataLJ != null) {
                AutoCutCategory autoCutCategory = autoCutThemeDataLJ.category;
                if (autoCutCategory != null && (str5 = autoCutCategory.categoryKey) != null) {
                    c0lab.LJ("autocut_category_key", str5);
                }
                AutoCutCategory autoCutCategory2 = autoCutThemeDataLJ.category;
                if (autoCutCategory2 != null && (str4 = autoCutCategory2.categoryName) != null) {
                    c0lab.LJ("autocut_tab_name", str4);
                }
            }
            c0lab.LIZ(C1403130mcJ.LIZLLL(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource)) + 1, "autocut_style_order");
            c0lab.LIZ(i, "autocut_is_change_music");
            c0lab.LJ("autocut_content_size", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList3));
            c0lab.LJ("autocut_content_duration", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList4));
            if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
                String str12 = videoPublishEditModel.creativeModel.autoCutAnchorModel.templateId;
                if (str12 != null) {
                    str2 = str12;
                }
                c0lab.LJ("followed_template_id", str2);
            }
            c0lab.LJ("tt_template_id", videoPublishEditModel.getTTTemplateIdForAutoCut());
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ != null && (str3 = autoCutThemeDataLIZJ.templateTag) != null && C123100dR.LIZ(str3)) {
                c0lab.LJ("template_tags", str3);
            }
        }
        if (Intrinsics.LJFF(str, "enter_video_post_page")) {
            int iLIZLLL = C1403130mcJ.LIZLLL(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource)) + 1;
            c0lab.LIZ(!Intrinsics.LJFF("other", s.LJJIIJ(autoCutModel, null, null)) ? 1 : 0, "is_reuse_music");
            c0lab.LIZ(iLIZLLL, "autocut_style_order");
            c0lab.LIZ(autoCutModel.curGenerateType, "generate_type");
        }
        if (!Intrinsics.LJFF(str, "enter_video_post_page") && !Intrinsics.LJFF(str, "publish")) {
            z = false;
        } else {
            z = true;
        }
        boolean zLJFF2 = Intrinsics.LJFF(str, "publish");
        if (!Intrinsics.LJFF(str, "enter_video_post_page") && !Intrinsics.LJFF(str, "publish")) {
            z2 = false;
        } else {
            z2 = true;
        }
        C538730LAx.LIZIZ(c0lab, videoPublishEditModel, z, zLJFF2, z2, nLEModel);
    }
}
