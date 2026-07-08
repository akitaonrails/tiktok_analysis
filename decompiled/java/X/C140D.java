package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ITTC2PAService;
import com.ss.android.ugc.aweme.aigc.C2PAApi;
import com.ss.android.ugc.aweme.aigc.C2paMinorEditConfig;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.C2PAInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.140D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140D {
    public static final C140D LIZ = new C140D();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static boolean LJI;
    public static final C054G LJII;
    public static final HashMap<String, AIGCInfo> LJIIIIZZ;
    public static final Application LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;

    static {
        C1446930nkx.LJFF("C2PAAIGCManager", new C1431720nMQ());
        LIZIZ = C452501pT.LIZIZ(new C140T());
        LIZJ = C452501pT.LIZIZ(new C294140Bfw());
        LIZLLL = C452501pT.LIZIZ(new C201946140a());
        LJ = C452501pT.LIZIZ(new C140Z());
        LJFF = C452501pT.LIZIZ(new C140Y());
        LJII = C2296808zG.LIZ(C0PEM.LIZJ);
        LJIIIIZZ = new HashMap<>();
        LJIIIZ = C1BWL.LIZ();
        LJIIJ = C452501pT.LIZIZ(new C140R());
        LJIIJJI = C452501pT.LIZIZ(new C294150Bfx());
        LJIIL = C452501pT.LIZIZ(new C140V());
    }

    public static File LJIIJJI() {
        return ((Boolean) LJIIJJI.getValue()).booleanValue() ? ((InterfaceC570310MYj) LJIIJ.getValue()).LJIIJ(EnumC20227914Cv.TEMP_C2PA_SOURCE, "", true) : C2298208zU.LIZ((InterfaceC570310MYj) LJIIJ.getValue(), new CreativeInfo("creative-temp-id", 0, null, 6, null), EnumC20228014Cw.TEMP_C2PA_SOURCE, null, true, 4);
    }

    public static long LJIIZILJ() {
        return ((Number) LIZIZ.getValue()).longValue();
    }

    public static Keva LJIJJLI() {
        return (Keva) LJIIL.getValue();
    }

    public static ITTC2PAService LJJI() {
        ITTC2PAService iTTC2PAServiceLIZ = C20193213zm.LIZ.LIZ();
        if (iTTC2PAServiceLIZ == null) {
            return null;
        }
        return iTTC2PAServiceLIZ;
    }

    public static int LIZ(VideoPublishEditModel videoPublishEditModel) {
        C1436380nTw c1436380nTwLJJIIZ = LJJIIZ(videoPublishEditModel);
        int i = 0;
        int i2 = 0;
        for (AIGCInfo aIGCInfo : c1436380nTwLJJIIZ.LIZ) {
            if (aIGCInfo != null && aIGCInfo.getType() == 2) {
                if (aIGCInfo.isFullyAIGC()) {
                    i2 += 2;
                } else {
                    i2++;
                }
            }
        }
        if (c1436380nTwLJJIIZ.LIZ.size() != 0 && i2 != 0) {
            if (i2 == c1436380nTwLJJIIZ.LIZ.size() * 2) {
                i = 2;
                if (c1436380nTwLJJIIZ.LIZJ.size() > 0) {
                    i = 1;
                }
            } else {
                i = 1;
            }
        }
        if (c1436380nTwLJJIIZ.LIZIZ) {
            return Math.max(i, 1);
        }
        if (C1437010nUx.LIZ() && (!videoPublishEditModel.creativeModel.privacySettingModel.gcMarkContentProducerList.isEmpty())) {
            return 2;
        }
        if (C306460Bzo.LIZ() && videoPublishEditModel.creativeModel.privacySettingModel.isIPTCMetadataExist) {
            return 2;
        }
        return i;
    }

    public static boolean LIZIZ(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray2;
        String strOptString;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("manifests");
        if (jSONObjectOptJSONObject2 == null) {
            return false;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("assertions")) != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 != null && Intrinsics.LJFF("c2pa.actions.v2", jSONObjectOptJSONObject4.optString("label")) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("data")) != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("actions")) != null) {
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject5 != null && (strOptString = jSONObjectOptJSONObject5.optString("digitalSourceType")) != null && C140P.LIZ().aigcDigitalSourceTypeList.contains(strOptString)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Object LIZJ(JSONObject jSONObject) {
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray2;
        String strOptString2;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("manifests");
        if (jSONObjectOptJSONObject2 == null) {
            return false;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject3 != null && (strOptString = jSONObjectOptJSONObject3.optString("format")) != null && a0.LJJIIZI(strOptString, "audio", false) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("assertions")) != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 != null && Intrinsics.LJFF("c2pa.actions.v2", jSONObjectOptJSONObject4.optString("label")) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("data")) != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("actions")) != null) {
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject5 != null && (strOptString2 = jSONObjectOptJSONObject5.optString("digitalSourceType")) != null && C140P.LIZ().aigcDigitalSourceTypeList.contains(strOptString2)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray2;
        String strOptString;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        C2paMinorEditConfig c2paMinorEditConfig = C1867200ygo.LIZ;
        C2paMinorEditConfig c2paMinorEditConfig2 = (C2paMinorEditConfig) settingsManagerLIZLLL.LJIIIIZZ("c2pa_minor_edit_list", C2paMinorEditConfig.class, c2paMinorEditConfig);
        if (c2paMinorEditConfig2 == null) {
            c2paMinorEditConfig2 = c2paMinorEditConfig;
        }
        List<String> list = c2paMinorEditConfig2.digitalSourceTypeList;
        C2paMinorEditConfig c2paMinorEditConfig3 = (C2paMinorEditConfig) SettingsManager.LIZLLL().LJIIIIZZ("c2pa_minor_edit_list", C2paMinorEditConfig.class, c2paMinorEditConfig);
        if (c2paMinorEditConfig3 != null) {
            c2paMinorEditConfig = c2paMinorEditConfig3;
        }
        List<String> list2 = c2paMinorEditConfig.softWareAgentList;
        if (list2 == null || list2.isEmpty() || (jSONObjectOptJSONObject = jSONObject.optJSONObject("manifests")) == null) {
            return false;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("assertions")) != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 != null && Intrinsics.LJFF("c2pa.actions.v2", jSONObjectOptJSONObject4.optString("label")) && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("data")) != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("actions")) != null) {
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject5 != null && (strOptString = jSONObjectOptJSONObject5.optString("digitalSourceType")) != null) {
                                LIZ.getClass();
                                String strLJJ = LJJ(jSONObjectOptJSONObject5);
                                if (strLJJ != null && strLJJ.length() != 0 && list2.contains(strLJJ) && (list == null || list.isEmpty() || list.contains(strOptString))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static C2PAInfo LJ(VideoPublishEditModel videoPublishEditModel) {
        String strJ3;
        boolean z;
        Object next;
        String strLJJLIIIJ;
        Set<Integer> errorCode;
        int size;
        Set<Integer> errorCode2;
        Map<String, String> etMap;
        String strLIZIZ;
        if (!videoPublishEditModel.creativeModel.aigcExtraModel.aigcServerTaskIdAcquired) {
            C1436990nUv.LJIIIIZZ(videoPublishEditModel, false);
        }
        C1436380nTw c1436380nTwLJJIIZ = LJJIIZ(videoPublishEditModel);
        List<AIGCInfo> list = c1436380nTwLJJIIZ.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            for (AIGCInfo aIGCInfo : list) {
                if (aIGCInfo != null && (etMap = aIGCInfo.getEtMap()) != null) {
                    for (Map.Entry<String, String> entry : etMap.entrySet()) {
                        if (!Intrinsics.LJFF(entry.getKey(), "dedup_src")) {
                            String key = entry.getKey();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            C140D c140d = LIZ;
                            String str = (String) linkedHashMap.get(entry.getKey());
                            c140d.getClass();
                            if (C123100dR.LIZ(str)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str);
                                sbLIZ2.append(',');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            } else {
                                strLIZIZ = "";
                            }
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append(entry.getValue());
                            linkedHashMap.put(key, C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            linkedHashSet.add(entry.getValue());
                        }
                    }
                }
            }
        }
        linkedHashMap.put("dedup_src", C13LP.LJJLIIIJ(linkedHashSet, null, null, null, 0, null, null, 63));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aigc_percentage_type", LIZ(videoPublishEditModel));
            if (C123100dR.LIZ(videoPublishEditModel.creativeModel.privacySettingModel.fingerprintId)) {
                jSONObject.put("fingerprint_id", videoPublishEditModel.creativeModel.privacySettingModel.fingerprintId);
            }
            jSONObject.put("has_invisible_watermark", 2);
            jSONObject.put("generate_server_task_id", new JSONArray((Collection) c1436380nTwLJJIIZ.LIZLLL));
            if (C1437010nUx.LIZ() && (!videoPublishEditModel.creativeModel.privacySettingModel.gcMarkContentProducerList.isEmpty())) {
                jSONObject.put("gcmark_content_producer", new JSONArray((Collection) videoPublishEditModel.creativeModel.privacySettingModel.gcMarkContentProducerList));
            }
            if (C306460Bzo.LIZ() && (!videoPublishEditModel.creativeModel.privacySettingModel.iptcTypeList.isEmpty())) {
                jSONObject.put("iptc_type", new JSONArray((Collection) videoPublishEditModel.creativeModel.privacySettingModel.iptcTypeList));
            }
            strJ3 = C786410Ut5.J3(jSONObject);
            try {
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } catch (Throwable th2) {
            th = th2;
            strJ3 = null;
        }
        String str2 = (String) linkedHashMap.get("first_src");
        String str3 = (String) linkedHashMap.get("last_src");
        String str4 = (String) linkedHashMap.get("dedup_src");
        String str5 = (String) linkedHashMap.get("first_aigc_src");
        String str6 = (String) linkedHashMap.get("last_aigc_src");
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource, null, null, null, 0, null, null, 63);
        ArrayList<String> arrayList = videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C0MCT.LIZ.contains(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean zContains = videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.contains("extern_share");
        ArrayList arrayList2 = new ArrayList();
        for (AIGCInfo aIGCInfo2 : list) {
            AIGCInfo aIGCInfo3 = aIGCInfo2;
            if (aIGCInfo3 != null && aIGCInfo3.getType() == 2) {
                arrayList2.add(aIGCInfo2);
            }
        }
        long size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (AIGCInfo aIGCInfo4 : list) {
            AIGCInfo aIGCInfo5 = aIGCInfo4;
            if (aIGCInfo5 != null && aIGCInfo5.getType() == 2 && Intrinsics.LJFF(aIGCInfo5.isImageResource(), Boolean.TRUE)) {
                arrayList3.add(aIGCInfo4);
            }
        }
        long size3 = arrayList3.size();
        ArrayList arrayList4 = new ArrayList();
        for (AIGCInfo aIGCInfo6 : list) {
            AIGCInfo aIGCInfo7 = aIGCInfo6;
            if (aIGCInfo7 != null && aIGCInfo7.getType() == 2) {
                Boolean boolIsImageResource = aIGCInfo7.isImageResource();
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.LJFF(boolIsImageResource, bool) && Intrinsics.LJFF(aIGCInfo7.isAudioResource(), bool)) {
                    arrayList4.add(aIGCInfo6);
                }
            }
        }
        long size4 = arrayList4.size();
        ArrayList arrayList5 = new ArrayList();
        for (AIGCInfo aIGCInfo8 : list) {
            AIGCInfo aIGCInfo9 = aIGCInfo8;
            if (aIGCInfo9 != null && aIGCInfo9.getType() == 2 && Intrinsics.LJFF(aIGCInfo9.isAudioResource(), Boolean.TRUE)) {
                arrayList5.add(aIGCInfo8);
            }
        }
        long size5 = arrayList5.size();
        int i = 0;
        for (AIGCInfo aIGCInfo10 : list) {
            if (aIGCInfo10 != null && (errorCode2 = aIGCInfo10.getErrorCode()) != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : errorCode2) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue != 49 && iIntValue != 0) {
                        arrayList6.add(obj);
                    }
                }
                size = arrayList6.size();
            } else {
                size = 0;
            }
            i += size;
        }
        long j = i;
        ArrayList arrayList7 = new ArrayList();
        for (AIGCInfo aIGCInfo11 : list) {
            if (aIGCInfo11 != null && (errorCode = aIGCInfo11.getErrorCode()) != null) {
                arrayList7.add(errorCode);
            }
        }
        Iterator it3 = arrayList7.iterator();
        if (!it3.hasNext()) {
            next = null;
        } else {
            next = it3.next();
            while (it3.hasNext()) {
                Set set = (Set) it3.next();
                Set set2 = (Set) next;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : set) {
                    int iIntValue2 = ((Number) obj2).intValue();
                    if (iIntValue2 != 49 && iIntValue2 != 0) {
                        arrayList8.add(obj2);
                    }
                }
                set2.addAll(arrayList8);
                next = set2;
            }
        }
        Set set3 = (Set) next;
        if (set3 != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(set3, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        return new C2PAInfo(str2, str3, str4, str5, str6, strLJJLIIIJ, strLJJLIIIJ2, z, zContains, size2, j, size3, size4, size5, 0.0d, strJ3);
    }

    public static boolean LJII(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("validation_state");
        if (strOptString == null) {
            strOptString = "";
        }
        return Intrinsics.LJFF(strOptString, "Valid");
    }

    public static File LJIIL(String str) {
        if (((Boolean) LJIIJJI.getValue()).booleanValue()) {
            InterfaceC570310MYj interfaceC570310MYj = (InterfaceC570310MYj) LJIIJ.getValue();
            EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.TEMP_C2PA_SOURCE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(new C0VSJ(str).getName().hashCode());
            sbLIZ.append("-ingredients.txt");
            return interfaceC570310MYj.LJIIIZ(enumC20227914Cv, C2188811AlT.LIZIZ(sbLIZ), true);
        }
        InterfaceC570310MYj interfaceC570310MYj2 = (InterfaceC570310MYj) LJIIJ.getValue();
        CreativeInfo creativeInfo = new CreativeInfo("creative-temp-id", 0, null, 6, null);
        EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.TEMP_C2PA_SOURCE;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(new C0VSJ(str).getName().hashCode());
        sbLIZ2.append("-ingredients.txt");
        return interfaceC570310MYj2.LJIIJJI(creativeInfo, enumC20228014Cw, C2188811AlT.LIZIZ(sbLIZ2), true);
    }

    public static Pair LJIILLIIL(JSONObject jSONObject) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("assertions");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("signature_info");
        String strLJJ = "";
        if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("issuer")) == null) {
            strOptString = "";
        }
        if (jSONArrayOptJSONArray2 == null) {
            return new Pair(Boolean.FALSE, strOptString);
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i);
            if (jSONObjectOptJSONObject3 != null && Intrinsics.LJFF("c2pa.actions.v2", jSONObjectOptJSONObject3.optString("label")) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("data")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("actions")) != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject4 != null) {
                        if (strLJJ.length() == 0) {
                            strLJJ = LJJ(jSONObjectOptJSONObject4);
                        }
                        String strOptString2 = jSONObjectOptJSONObject4.optString("digitalSourceType");
                        if (strOptString2 != null && (Intrinsics.LJFF("http://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia", strOptString2) || Intrinsics.LJFF("https://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia", strOptString2) || Intrinsics.LJFF("http://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia", strOptString2) || Intrinsics.LJFF("https://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia", strOptString2))) {
                            String strLJJ2 = LJJ(jSONObjectOptJSONObject4);
                            Boolean bool = Boolean.TRUE;
                            if (strLJJ2.length() != 0) {
                                strOptString = strLJJ2;
                            }
                            return new Pair(bool, strOptString);
                        }
                    }
                }
                Boolean bool2 = Boolean.FALSE;
                if (strLJJ.length() != 0) {
                    strOptString = strLJJ;
                }
                return new Pair(bool2, strOptString);
            }
        }
        return new Pair(Boolean.FALSE, strOptString);
    }

    public static Map LJIJ(List list) {
        boolean z;
        boolean z2;
        System.currentTimeMillis();
        if (list.isEmpty()) {
            return C2097608Jq.LJ();
        }
        ArrayList<Map> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            System.currentTimeMillis();
            boolean z3 = false;
            C140Q c140qLJI = null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("manifests");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObject.optString("active_manifest", "");
                    if (strOptString == null || strOptString.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        c140qLJI = LJI(jSONObjectOptJSONObject, strOptString, null);
                    }
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (c140qLJI != null) {
                System.currentTimeMillis();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair pairLJIILLIIL = LJIILLIIL(c140qLJI.LIZ);
                if (((CharSequence) pairLJIILLIIL.getSecond()).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put("last_src", pairLJIILLIIL.getSecond());
                }
                if (((Boolean) pairLJIILLIIL.getFirst()).booleanValue()) {
                    if (((CharSequence) pairLJIILLIIL.getSecond()).length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        linkedHashMap.put("last_aigc_src", pairLJIILLIIL.getSecond());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                LJIIJ(c140qLJI, linkedHashSet, arrayList2, arrayList3);
                linkedHashMap.put("first_src", C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, null, 63));
                linkedHashMap.put("first_aigc_src", C13LP.LJJLIIIJ(arrayList3, null, null, null, 0, null, null, 63));
                linkedHashMap.put("dedup_src", C13LP.LJJLIIIJ(linkedHashSet, null, null, null, 0, null, null, 63));
                arrayList.add(linkedHashMap);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Map map : arrayList) {
            Object obj = map.get("first_src");
            if (obj != null) {
                arrayList4.add(obj);
            }
            Object obj2 = map.get("first_aigc_src");
            if (obj2 != null) {
                arrayList5.add(obj2);
            }
            Object obj3 = map.get("last_src");
            if (obj3 != null) {
                arrayList6.add(obj3);
            }
            Object obj4 = map.get("last_aigc_src");
            if (obj4 != null) {
                arrayList7.add(obj4);
            }
            Object obj5 = map.get("dedup_src");
            if (obj5 != null) {
                linkedHashSet2.add(obj5);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("first_src", C13LP.LJJLIIIJ(arrayList4, null, null, null, 0, null, null, 63));
        linkedHashMap2.put("first_aigc_src", C13LP.LJJLIIIJ(arrayList5, null, null, null, 0, null, null, 63));
        linkedHashMap2.put("last_src", C13LP.LJJLIIIJ(arrayList6, null, null, null, 0, null, null, 63));
        linkedHashMap2.put("last_aigc_src", C13LP.LJJLIIIJ(arrayList7, null, null, null, 0, null, null, 63));
        linkedHashMap2.put("dedup_src", C13LP.LJJLIIIJ(linkedHashSet2, null, null, null, 0, null, null, 63));
        return linkedHashMap2;
    }

    public static String LJIJJ(MediaModel mediaModel) {
        Object c098200Yq;
        Object next;
        Object obj = null;
        try {
            Iterator it2 = C1697810uHb.LJIIJJI(mediaModel.originLocalUriPath, mediaModel.LJFF(), mediaModel.relativePath).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C2286708xd.LIZJ((String) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c098200Yq = (String) next;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static String LJJ(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("softwareAgent");
        if (objOpt == null) {
            return "";
        }
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        if (!(objOpt instanceof JSONObject)) {
            return "";
        }
        return ((JSONObject) objOpt).optString("name");
    }

    public static boolean LJJII(AIGCInfo aIGCInfo) {
        if (aIGCInfo == null) {
            return false;
        }
        if (aIGCInfo.getC2paPath().length() <= 0 && LJIIIIZZ.get(aIGCInfo.getBucketTaskId()) == null) {
            return false;
        }
        return true;
    }

    public static void LJJIII(final Context context) {
        C201955140j.LIZLLL(C1421580n64.LIZIZ, "C2PA_AIGC", "initTTC2PASDK");
        ITTC2PAService iTTC2PAServiceLIZ = C20193213zm.LIZ.LIZ();
        if (iTTC2PAServiceLIZ != null) {
            iTTC2PAServiceLIZ.init(new InterfaceC2227891CHr() { // from class: X.140U
                @Override // X.InterfaceC2227891CHr
                public final void enableDebug() {
                }

                @Override // X.InterfaceC2227891CHr
                public final void getCertFailRetryIntervalSeconds() {
                }

                @Override // X.InterfaceC2227891CHr
                public final void getIoExecutor() {
                }

                @Override // X.InterfaceC2227891CHr
                public final String getRemoteCertDownloadURL() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C140P.LIZ().remoteCertHost);
                    sbLIZ.append(C140P.LIZ().remoteCertPath);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC2227891CHr
                public final String getTimeStampRequestHost() {
                    return C140P.LIZ().tsaHost;
                }

                @Override // X.InterfaceC2227891CHr
                public final Context getContext() {
                    return context;
                }

                @Override // X.InterfaceC2227891CHr
                public final void LIZIZ(JSONObject jSONObject) {
                    C20684815ws.LJIJ("c2pa_read_write_sdk_performance", jSONObject);
                }

                @Override // X.InterfaceC2227891CHr
                public final C201948140c onRemoteSign(byte[] bArr) {
                    try {
                        return C2PAApi.LIZ(C2PAApi.LIZ.c2paSign(C140P.LIZ().remoteSignPath, new TypedByteArray("", bArr, new String[0])).execute());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return new C201948140c(-1L, "", "", new byte[0]);
                    }
                }

                @Override // X.InterfaceC2227891CHr
                public final C201948140c LIZ(String str, Map map) {
                    C2PAApi.Api api = C2PAApi.LIZ;
                    if (str.length() == 0) {
                        return new C201948140c(-1L, "URL is empty", "", new byte[0]);
                    }
                    try {
                        return C2PAApi.LIZ(C2PAApi.LIZIZ.doGet(C140P.LIZ().remoteCertPath, map, null, new C1493620oyG()).execute());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return new C201948140c(-1L, "", "", new byte[0]);
                    }
                }

                @Override // X.InterfaceC2227891CHr
                public final void monitorLogSend(String str, String str2) {
                    try {
                        C793770VBv.LJ(str, new JSONObject(str2));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0216 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1436380nTw LJJIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.0nTw");
    }

    public static List LJJIIZI(SingleImageData singleImageData) {
        List<StickerItemModel> stickers;
        AIGCInfo aIGCInfo;
        if (singleImageData == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(singleImageData.getAigcInfo());
        ImageStickerInfo stickerInfo = singleImageData.getStickerInfo();
        if (stickerInfo != null && (stickers = stickerInfo.getStickers()) != null) {
            for (StickerItemModel stickerItemModel : stickers) {
                if (stickerItemModel != null && (aIGCInfo = stickerItemModel.aigcInfo) != null) {
                    arrayList.add(aIGCInfo);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void LJJIIJ(boolean z) {
        if (C0BJ5.LIZ()) {
            if (!C275780ArQ.LIZJ() && C275780ArQ.LIZ() != 3 && !z) {
                return;
            }
            if (System.currentTimeMillis() - C1150504el.LIZ().LJJII < ((Number) LIZJ.getValue()).longValue() && !z) {
                return;
            }
            if (LJI) {
            } else {
                LJJIIJZLJL(LJIIIZ, AFwS219S0000000_30.get$arr$(288), null);
            }
        } else {
            if (!C275780ArQ.LIZJ() && C275780ArQ.LIZ() != 3 && !z) {
                return;
            }
            if (System.currentTimeMillis() - C1150504el.LIZ().LJJII < ((Number) LIZJ.getValue()).longValue() && !z) {
                return;
            }
            if (LJI) {
                return;
            }
            LJI = true;
            LJJIII(LJIIIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8 A[LOOP:0: B:24:0x00b2->B:26:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJLIJ(com.ss.android.ugc.aweme.creative.model.CreativeInfo r17) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIJLIJ(com.ss.android.ugc.aweme.creative.model.CreativeInfo):boolean");
    }

    public static JSONObject LJFF(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", str);
        jSONObject.put("digitalSourceType", str2);
        jSONObject.put("softwareAgent", "TikTok");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("actions", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("label", "c2pa.actions");
        jSONObject3.put("data", jSONObject2);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("assertions", jSONArray2);
        return jSONObject4;
    }

    public static void LJIIIIZZ(String str, String str2) {
        Keva kevaLJIJJLI = LJIJJLI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('+');
        sbLIZ.append(str2);
        kevaLJIJJLI.erase(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJIL(Context context, String str) {
        if (context != null && C2471909mP.LJJIIZI(str)) {
            return C09N5.LIZ(context, C2471909mP.LJIILIIL(str));
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) throws org.json.JSONException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C140O
            if (r0 == 0) goto L20
            r7 = r10
            X.140O r7 = (X.C140O) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L32
            if (r0 != r5) goto L2a
            goto L26
        L20:
            X.140O r7 = new X.140O
            r7.<init>(r8, r10)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L64
            goto L68
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            if (r9 == 0) goto L44
            int r0 = r9.length()
            if (r0 == 0) goto L44
            r0 = 0
        L3f:
            if (r0 == 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            r0 = 1
            goto L3f
        L46:
            r8.LJJIIJ(r1)
            java.lang.String r1 = "http://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia"
            java.lang.String r0 = "c2pa.created"
            org.json.JSONObject r4 = LJFF(r0, r1)
            long r2 = LJIIZILJ()     // Catch: java.io.IOException -> L64
            X.063i r1 = new X.063i     // Catch: java.io.IOException -> L64
            r0 = 0
            r1.<init>(r9, r0, r4)     // Catch: java.io.IOException -> L64
            r7.LLILLL = r5     // Catch: java.io.IOException -> L64
            java.lang.Object r0 = X.C099A.LIZJ(r2, r1, r7)     // Catch: java.io.IOException -> L64
            if (r0 != r6) goto L68
            return r6
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C140Q LJI(JSONObject jSONObject, String str, C140Q c140q) {
        String strOptString;
        C140Q c140qLJI;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        C140Q c140q2 = new C140Q(jSONObjectOptJSONObject, c140q);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ingredients");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("active_manifest", "")) != null && (c140qLJI = LJI(jSONObject, strOptString, c140q2)) != null) {
                    c140q2.LIZJ.add(c140qLJI);
                }
            }
        }
        return c140q2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJI(java.lang.String r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJIJI(java.lang.String, boolean, boolean):java.lang.String");
    }

    public static void LJJJJI(String str, String str2, Function1 function1) throws Throwable {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        C1403990mdh c1403990mdh = C1403990mdh.LIZ;
        boolean zCheckPluginInstalled = iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_c2pa_fake");
        boolean z = LJI;
        c1403990mdh.getClass();
        C1403990mdh.LIZLLL(zCheckPluginInstalled, z);
        C23250099c.LJ(C23271099x.INSTANCE, new C15463063p(str, str2, null, function1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(java.lang.String r14, X.C15464063q r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIFFI(java.lang.String, X.063q, X.05Vn):java.lang.Object");
    }

    public final synchronized void LJJIIJZLJL(final Context context, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_c2pa_fake")) {
            if (function0 != null) {
                function0.invoke();
            }
            return;
        }
        InterfaceC842850X4p interfaceC842850X4p = new InterfaceC842850X4p() { // from class: X.1402
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z) {
                C1421580n64 c1421580n64 = C1421580n64.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("c2pa plugin install success, packageName is ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c1421580n64, "C2PA_AIGC", C2188811AlT.LIZIZ(sbLIZ));
                C1BLW c1blwLIZLLL = iPluginService.LIZLLL();
                Context context2 = context;
                c1blwLIZLLL.getClass();
                a.install(context2);
                a.LIZLLL(context2);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                C1403990mdh c1403990mdh = C1403990mdh.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                c1403990mdh.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jElapsedRealtime2, "cost_time_millis");
                c2344009Gk.LIZJ(1, "success");
                c2344009Gk.LIZJ(0, "error_code");
                C20684815ws.LJIILLIIL("install_c2pa_plugin", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z) {
                C1421580n64 c1421580n64 = C1421580n64.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("c2pa plugin install failed, reason = ");
                sbLIZ.append(i);
                C201955140j.LIZLLL(c1421580n64, "C2PA_AIGC", C2188811AlT.LIZIZ(sbLIZ));
                Function1<Integer, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i));
                }
                C1403990mdh c1403990mdh = C1403990mdh.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                c1403990mdh.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jElapsedRealtime2, "cost_time_millis");
                c2344009Gk.LIZJ(0, "success");
                c2344009Gk.LIZJ(i, "error_code");
                C20684815ws.LJIILLIIL("install_c2pa_plugin", c2344009Gk.LIZ);
            }
        };
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZIZ = true;
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_c2pa_fake";
        c844020X9c.LIZLLL = interfaceC842850X4p;
        iPluginService.LJJI(c844020X9c.LIZ());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:13))(0)|7|(1:106)|(5:(1:(1:(1:(6:12|66|67|(3:69|(1:71)(1:72)|(9:74|(1:76)(1:77)|78|(1:80)|81|(1:83)(1:84)|85|86|87))|88|89)(2:14|15))(3:16|110|17))(4:20|45|46|(2:48|49)(2:50|(1:52)(1:53))))(2:21|(2:23|24)(2:25|(2:27|28)(8:29|108|30|(2:32|33)(2:34|(2:36|37)(2:38|(2:40|41)(4:42|(1:44)|46|(0)(0))))|112|97|98|99)))|112|97|98|99)|104|54|(2:56|57)(10:58|(1:60)(1:61)|62|114|63|(1:65)|67|(0)|88|89)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0290, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b A[Catch: all -> 0x0292, TRY_ENTER, TryCatch #1 {all -> 0x0292, blocks: (B:66:0x01ed, B:67:0x01f0, B:69:0x01fe, B:74:0x020f, B:78:0x0226, B:81:0x025a, B:85:0x026a, B:45:0x015c, B:46:0x015f, B:50:0x017b), top: B:106:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:66:0x01ed, B:67:0x01f0, B:69:0x01fe, B:74:0x020f, B:78:0x0226, B:81:0x025a, B:85:0x026a, B:45:0x015c, B:46:0x015f, B:50:0x017b), top: B:106:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r37, X.C15464063q r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r39) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIJ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, X.063q, X.05Vn):java.lang.Object");
    }

    public final Object LJJJI(VideoPublishEditModel videoPublishEditModel, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        C1403990mdh c1403990mdh = C1403990mdh.LIZ;
        boolean zCheckPluginInstalled = iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_c2pa_fake");
        boolean z2 = LJI;
        c1403990mdh.getClass();
        C1403990mdh.LIZLLL(zCheckPluginInstalled, z2);
        if (C275780ArQ.LIZ() == 2) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                Object objLJJJIL = LJJJIL(videoPublishEditModel, z, interfaceC1364105Vn);
                if (objLJJJIL == C099R.LJFF()) {
                    return objLJJJIL;
                }
                return Unit.LIZ;
            }
            Object objLJJJJ = LJJJJ(videoPublishEditModel, z, interfaceC1364105Vn);
            if (objLJJJJ == C099R.LJFF()) {
                return objLJJJJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01bb, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x017f, code lost:
    
        if (r9 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016c, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:119:0x01c1, B:105:0x01a8], limit reached: 188 */
    /* JADX WARN: Path cross not found for [B:127:0x01de, B:124:0x01d3], limit reached: 188 */
    /* JADX WARN: Path cross not found for [B:134:0x01f2, B:135:0x01f3], limit reached: 188 */
    /* JADX WARN: Path cross not found for [B:68:0x014c, B:77:0x0167], limit reached: 188 */
    /* JADX WARN: Path cross not found for [B:94:0x018a, B:110:0x01b3], limit reached: 188 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ec A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022c A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022f A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0253 A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0295 A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01bb A[EDGE_INSN: B:184:0x01bb->B:115:0x01bb BREAK  A[LOOP:3: B:95:0x018e->B:187:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[LOOP:3: B:95:0x018e->B:187:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[Catch: Exception -> 0x02ad, TryCatch #0 {Exception -> 0x02ad, blocks: (B:148:0x0248, B:149:0x024b, B:151:0x0253, B:152:0x027b, B:154:0x0295, B:155:0x02a6, B:22:0x007b, B:24:0x0081, B:26:0x008d, B:27:0x00b3, B:28:0x00c8, B:30:0x00ce, B:32:0x00d6, B:34:0x00dc, B:36:0x00e2, B:37:0x00e6, B:39:0x00ec, B:41:0x00f8, B:45:0x010a, B:46:0x010e, B:49:0x0116, B:55:0x0122, B:57:0x0126, B:58:0x012a, B:60:0x0137, B:62:0x013d, B:66:0x0146, B:68:0x014c, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:92:0x0184, B:94:0x018a, B:95:0x018e, B:97:0x0194, B:99:0x019c, B:106:0x01aa, B:122:0x01c8, B:124:0x01d3, B:126:0x01d9, B:132:0x01ec, B:136:0x01f5, B:140:0x021f, B:142:0x022c, B:144:0x022f, B:127:0x01de, B:129:0x01e4, B:139:0x021c, B:17:0x005f, B:19:0x0071, B:21:0x0077), top: B:162:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x01ea -> B:90:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0245 -> B:149:0x024b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r32, boolean r33, X.InterfaceC1364105Vn<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:81:0x014b, B:87:0x0162], limit reached: 237 */
    /* JADX WARN: Path cross not found for [B:88:0x0164, B:79:0x0145], limit reached: 237 */
    /* JADX WARN: Path cross not found for [B:93:0x016c, B:96:0x0171], limit reached: 237 */
    /* JADX WARN: Path cross not found for [B:99:0x0176, B:101:0x0179], limit reached: 237 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0229 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023a A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0241 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024b A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0286 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028b A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0291 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d5 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d8 A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0318 A[Catch: Exception -> 0x032a, TRY_LEAVE, TryCatch #0 {Exception -> 0x032a, blocks: (B:197:0x02ee, B:198:0x02f1, B:200:0x0309, B:202:0x030f, B:204:0x0318, B:188:0x02c5, B:189:0x02c8, B:191:0x02d5, B:193:0x02d8, B:130:0x020c, B:131:0x020f, B:138:0x0225, B:140:0x0229, B:117:0x01a5, B:119:0x01ab, B:121:0x01b7, B:123:0x01dc, B:124:0x01e6, B:126:0x01f5, B:127:0x01ff, B:142:0x0234, B:144:0x023a, B:176:0x0280, B:178:0x0286, B:181:0x0291, B:185:0x029a, B:179:0x028b, B:147:0x0241, B:148:0x0245, B:150:0x024b, B:152:0x0253, B:159:0x0261, B:19:0x0072, B:20:0x008a, B:22:0x0090, B:24:0x0098, B:26:0x009e, B:28:0x00a4, B:29:0x00a8, B:31:0x00ae, B:33:0x00ba, B:37:0x00cc, B:38:0x00d0, B:41:0x00d8, B:47:0x00e4, B:49:0x00e8, B:50:0x00ec, B:52:0x00f5, B:54:0x00ff, B:56:0x0105, B:75:0x0139, B:77:0x013f, B:79:0x0145, B:81:0x014b, B:82:0x014f, B:84:0x0155, B:93:0x016c, B:110:0x018b, B:116:0x019f, B:107:0x0186, B:59:0x010c, B:60:0x0110, B:62:0x0116, B:64:0x011e, B:67:0x012a), top: B:209:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[LOOP:0: B:148:0x0245->B:214:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x01b5 -> B:141:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0209 -> B:131:0x020f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23, boolean r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJJJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, X.05Vn):java.lang.Object");
    }

    public static void LJIIJ(C140Q c140q, Set set, List list, List list2) {
        Pair pairLJIILLIIL = LJIILLIIL(c140q.LIZ);
        c140q.LIZLLL = ((Boolean) pairLJIILLIIL.getFirst()).booleanValue();
        c140q.LJ = (String) pairLJIILLIIL.getSecond();
        if (((CharSequence) pairLJIILLIIL.getSecond()).length() > 0) {
            set.add(pairLJIILLIIL.getSecond());
        }
        if (c140q.LIZJ.isEmpty()) {
            if (((CharSequence) pairLJIILLIIL.getSecond()).length() > 0) {
                ((ArrayList) list).add(pairLJIILLIIL.getSecond());
            }
            if (((Boolean) pairLJIILLIIL.getFirst()).booleanValue()) {
                if (((CharSequence) pairLJIILLIIL.getSecond()).length() > 0) {
                    ((ArrayList) list2).add(pairLJIILLIIL.getSecond());
                    return;
                }
                return;
            }
            for (C140Q c140q2 = c140q.LIZIZ; c140q2 != null; c140q2 = c140q2.LIZIZ) {
                while (c140q2.LIZLLL) {
                    if (c140q2.LJ.length() > 0) {
                        ((ArrayList) list2).add(c140q2.LJ);
                    }
                }
            }
            return;
        }
        Iterator<C140Q> it2 = c140q.LIZJ.iterator();
        while (it2.hasNext()) {
            LJIIJ(it2.next(), set, list, list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r34, com.ss.android.ugc.aweme.creative.model.CreativeInfo r35, long r36, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r38) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIJIIJI(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.creative.model.CreativeInfo, long, X.05Vn):java.lang.Object");
    }

    public static Object LJJIJIIJIL(C140D c140d, MediaModel mediaModel, long j, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        long jLongValue = j;
        if ((i & 4) != 0) {
            c140d.getClass();
            jLongValue = ((Number) LJ.getValue()).longValue();
        }
        return c140d.LJJIJIIJI(mediaModel, null, jLongValue, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIJL(X.C140D r9, com.ss.android.ugc.aweme.ITTC2PAService r10, java.lang.String r11, X.C15464063q r12, X.AbstractC23140094w r13) {
        /*
            r9.getClass()
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r13)
            r2 = 1
            r3.<init>(r2, r0)
            r3.LJIJJ()
            com.ss.android.ugc.aweme.experiment.AIGCSafetyPerfETVESDKDFKillSwitch r0 = com.ss.android.ugc.aweme.experiment.AIGCSafetyPerfETVESDKDFKillSwitch.INSTANCE
            boolean r0 = r0.isEnabled()
            r5 = 0
            if (r0 != 0) goto L54
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r4 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto L54
            X.140D r0 = X.C140D.LIZ
            r0.getClass()
            android.app.Application r0 = X.C140D.LJIIIZ
            boolean r0 = r1.LJI(r0)
            if (r0 != r2) goto L54
        L35:
            X.140D r0 = X.C140D.LIZ
            r0.getClass()
            java.lang.String r1 = LJIJI(r11, r5, r2)
            X.0uS2 r0 = new X.0uS2
            r0.<init>()
            r10.readAndVerifyFromPath(r1, r2, r12, r0)
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L53
            X.C099Q.LIZJ(r13)
        L53:
            return r1
        L54:
            r2 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIJL(X.140D, com.ss.android.ugc.aweme.ITTC2PAService, java.lang.String, X.063q, X.094w):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[Catch: all -> 0x021c, TryCatch #3 {all -> 0x021c, blocks: (B:64:0x0171, B:66:0x017f, B:71:0x0190, B:75:0x01a7, B:77:0x01c3, B:81:0x01cc, B:91:0x01fa, B:37:0x00ba, B:38:0x00bd, B:40:0x00d4, B:54:0x0130, B:56:0x0136, B:60:0x013f, B:45:0x00ed, B:49:0x0102, B:53:0x0117), top: B:114:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[Catch: all -> 0x021c, TryCatch #3 {all -> 0x021c, blocks: (B:64:0x0171, B:66:0x017f, B:71:0x0190, B:75:0x01a7, B:77:0x01c3, B:81:0x01cc, B:91:0x01fa, B:37:0x00ba, B:38:0x00bd, B:40:0x00d4, B:54:0x0130, B:56:0x0136, B:60:0x013f, B:45:0x00ed, B:49:0x0102, B:53:0x0117), top: B:114:0x00ba }] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Integer[], java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(long r33, X.C15464063q r35, com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo r36, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r37, X.InterfaceC1364105Vn r38) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJIIIZ(long, X.063q, com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r35, com.ss.android.ugc.aweme.creative.model.CreativeInfo r36, long r37, java.lang.String r39, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r40) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJIILJJIL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.creative.model.CreativeInfo, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIJIL(X.C140D r9, com.ss.android.ugc.aweme.ITTC2PAService r10, java.lang.String r11, X.C15464063q r12, X.InterfaceC1364105Vn r13, int r14) {
        /*
            r0 = r14 & 4
            if (r0 == 0) goto La
            X.063q r12 = new X.063q
            r0 = 0
            r12.<init>(r0)
        La:
            r9.getClass()
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r13)
            r2 = 1
            r3.<init>(r2, r0)
            r3.LJIJJ()
            com.ss.android.ugc.aweme.experiment.AIGCSafetyPerfETVESDKDFKillSwitch r0 = com.ss.android.ugc.aweme.experiment.AIGCSafetyPerfETVESDKDFKillSwitch.INSTANCE
            boolean r0 = r0.isEnabled()
            r5 = 0
            if (r0 != 0) goto L5e
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r4 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto L5e
            X.140D r0 = X.C140D.LIZ
            r0.getClass()
            android.app.Application r0 = X.C140D.LJIIIZ
            boolean r0 = r1.LJI(r0)
            if (r0 != r2) goto L5e
        L3f:
            X.140D r0 = X.C140D.LIZ
            r0.getClass()
            java.lang.String r1 = LJIJI(r11, r5, r2)
            X.0uS1 r0 = new X.0uS1
            r0.<init>()
            r10.readIngredientsFromPath(r1, r2, r12, r0)
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L5d
            X.C099Q.LIZJ(r13)
        L5d:
            return r1
        L5e:
            r2 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIJIL(X.140D, com.ss.android.ugc.aweme.ITTC2PAService, java.lang.String, X.063q, X.05Vn, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIZ(final java.lang.String r13, org.json.JSONObject r14, java.lang.String r15, java.util.List r16, X.C15464063q r17, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140D.LJJIZ(java.lang.String, org.json.JSONObject, java.lang.String, java.util.List, X.063q, X.05Vn):java.lang.Object");
    }
}
