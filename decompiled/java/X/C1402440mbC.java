package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402440mbC {
    public static final C1402470mbF LIZ = new C1402470mbF();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1d9a  */
    /* JADX WARN: Removed duplicated region for block: B:1486:0x264d  */
    /* JADX WARN: Removed duplicated region for block: B:1704:0x2b2b  */
    /* JADX WARN: Removed duplicated region for block: B:2106:0x3604 A[PHI: r10
      0x3604: PHI (r10v32 boolean) = (r10v31 boolean), (r10v34 boolean) binds: [B:2098:0x35ee, B:2105:0x3602] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:2109:0x360d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0e2d  */
    /* JADX WARN: Type inference failed for: r3v683, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v86, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v302, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v284, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v459, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v473 */
    /* JADX WARN: Type inference failed for: r6v474, types: [int] */
    /* JADX WARN: Type inference failed for: r6v922 */
    /* JADX WARN: Type inference failed for: r7v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r84v0, types: [X.0LAB, X.0md0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v68, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(X.C1403560md0 r84, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r85, X.AbstractC855580XhM r86, boolean r87, boolean r88, kotlin.jvm.functions.Function1 r89, java.lang.String r90) {
        /*
            Method dump skipped, instruction units count: 13951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402440mbC.LJIIZILJ(X.0md0, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0XhM, boolean, boolean, kotlin.jvm.functions.Function1, java.lang.String):void");
    }

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sb = new StringBuilder();
        sb.append(videoPublishEditModel.getEditEffectDurationListStr());
        List<Long> videoAnimDurationList = videoPublishEditModel.getEditorProModel().getVideoAnimDurationList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(videoAnimDurationList, 10));
        Iterator<Long> it2 = videoAnimDurationList.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().longValue()));
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                if (i == 0) {
                    sb.append(",");
                }
                sb.append(str);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        return C1403680mdC.LIZJ(videoPublishEditModel);
    }

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : videoPublishEditModel.getEditorProModel().getVideoAnimEffectIds()) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(str);
                if (i != r4.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static String LIZLLL(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] strArr = (String[]) new Regex(";").split(str, 0).toArray(new String[0]);
                StringBuilder sb = new StringBuilder();
                for (String str3 : strArr) {
                    int i = CastIntegerProtector.parseInt(str3);
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 101) {
                                    str2 = "";
                                } else {
                                    str2 = "twitter";
                                }
                            } else {
                                str2 = "instagram_story";
                            }
                        } else {
                            str2 = "instagram";
                        }
                    } else {
                        str2 = "local";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                }
                String string = sb.toString();
                if (u.LJIIZILJ(string, ",", false)) {
                    return string.substring(0, string.length() - 1);
                }
                return string;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    public static String LJ(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] strArr = (String[]) new Regex(";").split(str, 0).toArray(new String[0]);
                StringBuilder sb = new StringBuilder();
                for (String str3 : strArr) {
                    int i = CastIntegerProtector.parseInt(str3);
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 101) {
                                    switch (i) {
                                        case 5:
                                            str2 = "whatsapp";
                                            break;
                                        case 6:
                                            str2 = "facebook";
                                            break;
                                        case 7:
                                            str2 = "messenger";
                                            break;
                                        case 8:
                                            str2 = "snapchat";
                                            break;
                                        case BdTuring.TYPE_ECAF /* 9 */:
                                            str2 = "vk";
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                            str2 = "zalo";
                                            break;
                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                            str2 = "line";
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            str2 = "kakaotalk";
                                            break;
                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                            str2 = "sms";
                                            break;
                                        case 14:
                                            str2 = "whatsapp_status";
                                            break;
                                        case 15:
                                            str2 = "lemon8";
                                            break;
                                        case 16:
                                            str2 = "tiktok_now";
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            str2 = "now_to_ins";
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            str2 = "telegram";
                                            break;
                                        case 19:
                                            str2 = "viber";
                                            break;
                                        default:
                                            str2 = "";
                                            break;
                                    }
                                } else {
                                    str2 = "twitter";
                                }
                            } else {
                                str2 = "instagram_story";
                            }
                        } else {
                            str2 = "instagram";
                        }
                    } else {
                        str2 = "local";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                }
                String string = sb.toString();
                if (u.LJIIZILJ(string, ",", false)) {
                    return string.substring(0, string.length() - 1);
                }
                return string;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    public static boolean LJFF(String str) {
        if (!Intrinsics.LJFF(str, "has_tracker_shoot_event") && !Intrinsics.LJFF(str, "music_shoot_from_search") && !Intrinsics.LJFF(str, "music_enter_method") && !Intrinsics.LJFF(str, "music_enter_position") && !Intrinsics.LJFF(str, EnumC1403640md8.PROP_SELECTED_FROM.getParamName())) {
            return true;
        }
        return false;
    }

    public static Map LJII(VideoPublishEditModel videoPublishEditModel) {
        CreativeFlowData creativeFlowData;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoPublishEditModel != null) {
            try {
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel != null && (creativeFlowData = creativeModel.creativeFlowData) != null && creativeFlowData.getAutoSelectedAnchorInfos() != null) {
                    AutoSelectedAnchorInfos autoSelectedAnchorInfos = creativeFlowData.getAutoSelectedAnchorInfos();
                    if (autoSelectedAnchorInfos == null || (str = autoSelectedAnchorInfos.openPlatFormExtra) == null) {
                        str = "{}";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString("ttg_task_mode", "");
                        linkedHashMap.put("task_id", jSONObject.optString("ttg_task_id", ""));
                        linkedHashMap.put("task_type", strOptString);
                        return linkedHashMap;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return linkedHashMap;
    }

    public static Pair LJI(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        boolean z;
        int size;
        int size2;
        VecNLETrackSlotSPtr slots;
        NLEResourceNode resource;
        String resourceFile;
        NLESegment mainSegment;
        int size3 = 0;
        if (C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData())) {
            return new Pair(0, 1);
        }
        if (videoPublishEditModel.isCutSameVideoType()) {
            return new Pair(Integer.valueOf(videoPublishEditModel.getVideoCount()), Integer.valueOf(videoPublishEditModel.getPhotoCount()));
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return new Pair(0, Integer.valueOf(C1428470nHB.LJIJJ(videoPublishEditModel)));
        }
        if (videoPublishEditModel.getTtStoryUploadModel() != null && ((Number) C273290AnP.LIZ.getValue()).intValue() > 0) {
            return new Pair(0, 1);
        }
        if (bool != null && C308510C7l.LIZIZ(bool.booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                String originImportPath = it2.next().getOriginImportPath();
                if (originImportPath != null) {
                    arrayList.add(originImportPath);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : setLLIIJI) {
                if (C2471909mP.LJJIIJ((String) obj, z)) {
                    arrayList2.add(obj);
                }
            }
            Set setLLIIJI2 = C13LP.LLIIJI(arrayList2);
            Set setLJII = C15442062u.LJII(setLLIIJI, setLLIIJI2);
            size = setLLIIJI2.size();
            size2 = setLJII.size();
            if (size2 > 0 || size > 0) {
                return new Pair(Integer.valueOf(size2), Integer.valueOf(size));
            }
        } else {
            size = 0;
            size2 = 0;
        }
        if (C123100dR.LIZ(videoPublishEditModel.getNleData())) {
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NLETrack mainTrack = nLEEditorLIZ.getModel().getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                    if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        NLEResType resourceType = nLETrackSlot.getMainSegment().getResource().getResourceType();
                        NLEResType nLEResType = NLEResType.VIDEO;
                        if (resourceType == nLEResType && !linkedHashSet.contains(resourceFile)) {
                            linkedHashSet.add(resourceFile);
                            size2++;
                        }
                        if (nLETrackSlot.getMainSegment().getResource().getResourceType() == NLEResType.IMAGE) {
                            if (!linkedHashSet2.contains(resourceFile)) {
                                linkedHashSet2.add(resourceFile);
                                size++;
                            }
                            NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
                            if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && mainSegment.getResource().getResourceType() == nLEResType && !linkedHashSet.contains(resourceFile)) {
                                linkedHashSet.add(resourceFile);
                                size2++;
                            }
                        }
                    }
                }
            }
            if (videoPublishEditModel.isStitchMode() && C2548609ym.LIZ) {
                ArrayList<String> arrayList3 = videoPublishEditModel.creativeModel.recordData.recordTypeList;
                if (arrayList3 != null) {
                    size3 = arrayList3.size();
                }
                size2 = (size2 + size3) - 2;
            }
            return new Pair(Integer.valueOf(size2), Integer.valueOf(size));
        }
        return new Pair(Integer.valueOf(size2), Integer.valueOf(size));
    }

    public static void LJIIIIZZ(Map map, HashMap map2) {
        Object obj = map2.get(Scene.SCENE_SERVICE);
        if (obj != null) {
            map.put(Scene.SCENE_SERVICE, obj);
        }
        Object obj2 = map2.get("inspiration_result_id");
        if (obj2 != null) {
            map.put("inspiration_result_id", obj2);
        }
        Object obj3 = map2.get("inspiration_keyword");
        if (obj3 != null) {
            map.put("inspiration_keyword", obj3);
        }
        Object obj4 = map2.get("inspiration_reco_id");
        if (obj4 != null) {
            map.put("inspiration_reco_id", obj4);
        }
        Object obj5 = map2.get("search_topic_id");
        if (obj5 != null) {
            map.put("search_topic_id", obj5);
        }
    }

    public static void LJIIIZ(Map map, HashMap map2) {
        String str = (String) map.get("music_selected_from");
        if (str != null && u.LJIIZILJ(str, "_search", false)) {
            Object obj = map2.get("music_search_id");
            if (obj != null) {
                map.put("music_search_id", obj);
            }
            Object obj2 = map2.get("music_search_result_id");
            if (obj2 != null) {
                map.put("music_search_result_id", obj2);
            }
            Object obj3 = map2.get("music_list_item_id");
            if (obj3 != null) {
                map.put("music_list_item_id", obj3);
            }
        }
    }

    public static void LJIIJ(Map map, HashMap map2) {
        Object obj = map2.get("prop_search_info");
        if (obj != null) {
            map.put("prop_search_info", obj);
        }
        Object obj2 = map2.get("has_search");
        if (obj2 != null) {
            map.put("has_search", obj2);
        }
        Object obj3 = map2.get("creation_id");
        if (obj3 != null) {
            map.put("creation_id", obj3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIIJJI(Map map, HashMap map2) {
        if (Intrinsics.LJFF(map2.get("is_inspiration_scene"), "1")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1984209114:
                            if (str.equals("inspiration_reco_id")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case -881241120:
                            if (str.equals("tag_id")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case 413771156:
                            if (str.equals("inspiration_keyword")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case 859795941:
                            if (str.equals("page_tab")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case 1527100377:
                            if (str.equals("inspiration_session_id")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                        case 1639784808:
                            if (str.equals("inspiration_result_id")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            break;
                    }
                }
            }
            map.putAll(linkedHashMap);
        }
    }

    public static void LJIIL(Map map, HashMap map2) {
        Object obj = map2.get("is_music_chart");
        if (obj != null) {
            map.put("is_music_chart", obj);
        }
        Object obj2 = map2.get("search_source");
        if (obj2 != null) {
            map.put("search_source", obj2);
        }
    }

    public static void LJIILIIL(Map map, HashMap map2) {
        if (map2.containsKey("shoot_from_music")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "shoot_from_music")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                map.put(entry2.getKey(), entry2.getValue());
            }
        }
        Object obj = map2.get("artist_type");
        if (obj != null) {
            map.put("artist_type", obj);
        }
    }

    public static void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, HashMap map, Map map2) {
        boolean z;
        String musicOriginWithCheck = videoPublishEditModel.getMusicOriginWithCheck();
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId != null && musicId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (Intrinsics.LJFF("shoot_page_search", musicOriginWithCheck) || Intrinsics.LJFF("edit_page_search", musicOriginWithCheck))) {
            Object obj = map.get("music_shoot_from_search");
            if (obj != null) {
                map.put("shoot_from_search", obj);
            }
            Object obj2 = map.get("music_enter_method");
            if (obj2 != null) {
                map.put("enter_method", obj2);
            }
            Object obj3 = map.get("music_enter_position");
            if (obj3 != null) {
                map.put("enter_position", obj3);
            }
        } else {
            try {
                if (map.containsKey("music_search_id")) {
                    map.remove("music_search_id");
                    map.remove("music_search_result_id");
                    map.remove("music_list_item_id");
                    map.remove("words_horder");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C123100dR.LIZ(videoPublishEditModel.getMusicId()) && !map.containsKey("music_search_id")) {
            if (Intrinsics.LJFF("single_song", musicOriginWithCheck) || Intrinsics.LJFF("original", musicOriginWithCheck)) {
                if (Intrinsics.LJFF("single_song", map.get("shoot_from_search")) || Intrinsics.LJFF("music_card", map.get("search_enter_position"))) {
                    Object obj4 = map.get("search_id");
                    if (obj4 != null) {
                        map2.put("music_search_id", obj4);
                    }
                    Object obj5 = map.get("search_result_id");
                    if (obj5 != null) {
                        map2.put("music_search_result_id", obj5);
                    }
                    Object obj6 = map.get("list_item_id");
                    if (obj6 != null) {
                        map2.put("music_list_item_id", obj6);
                    }
                    Object obj7 = map.get("words_horder");
                    if (obj7 != null) {
                        map2.put("words_horder", obj7);
                    }
                }
            }
        }
    }

    public static void LJIILLIIL(C1402440mbC c1402440mbC, Activity activity, VideoPublishEditModel videoPublishEditModel, boolean z, PublishPreviewScene publishPreviewScene, boolean z2, Function1 function1, Bundle bundle, String str, int i) {
        Bundle extras = bundle;
        String str2 = str;
        Function1 function12 = function1;
        boolean z3 = z2;
        PublishPreviewScene publishPreviewScene2 = publishPreviewScene;
        if ((i & 32) != 0) {
            publishPreviewScene2 = null;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        if ((i & 128) != 0) {
            function12 = null;
        }
        if ((i & 256) != 0) {
            try {
                extras = activity.getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        }
        if ((i & 512) != 0) {
            str2 = null;
        }
        c1402440mbC.LJIILL(activity, videoPublishEditModel, null, null, z, publishPreviewScene2, z3, function12, extras, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024a  */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r22v3, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(android.app.Activity r25, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26, X.C0ZI0 r27, X.C855680XhW r28, boolean r29, com.ss.android.ugc.aweme.adaptation.PublishPreviewScene r30, boolean r31, kotlin.jvm.functions.Function1 r32, android.os.Bundle r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402440mbC.LJIILL(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0ZI0, X.0XhW, boolean, com.ss.android.ugc.aweme.adaptation.PublishPreviewScene, boolean, kotlin.jvm.functions.Function1, android.os.Bundle, java.lang.String):void");
    }
}
