package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475930oVj {
    public static String LIZIZ(SimVideoUrlModel simVideoUrlModel, List list, List list2) {
        Long lValueOf;
        String quality;
        Long lValueOf2;
        Long lValueOf3;
        String codecType;
        String fileHash;
        String mainUrl;
        String backupUrl;
        String fallbackUrl;
        String subInfo;
        String fileId;
        String fidProfileLabels;
        String languageCode;
        Boolean boolValueOf;
        Float loudness;
        Float peak;
        C1476790oX7 urlList;
        C1476790oX7 urlList2;
        C1476790oX7 urlList3;
        JSONObject json;
        int iOptInt;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String strOptString6;
        String strOptString7;
        String strOptString8;
        String str2;
        String str3;
        String str4;
        String str5;
        if (simVideoUrlModel != null && simVideoUrlModel.hasDashBitrate()) {
            if (list == null && (list = simVideoUrlModel.getRawBitRate()) == null) {
                list = C13BV.INSTANCE;
            }
            if (list2 == null && (list2 = simVideoUrlModel.getAudioBitrate()) == null) {
                list2 = C13BV.INSTANCE;
            }
            String str6 = simVideoUrlModel.LLJJ;
            Object originUri = simVideoUrlModel.getOriginUri();
            double duration = simVideoUrlModel.getDuration();
            Object didProfileLabels = simVideoUrlModel.getDidProfileLabels();
            Object vidProfileLabels = simVideoUrlModel.getVidProfileLabels();
            Object transParams = simVideoUrlModel.getTransParams();
            if ((!list.isEmpty()) || (!list2.isEmpty())) {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("enable_video_dash_reconstruct", 1);
                    jSONObject2.put("video_meta", jSONObject.optString("video_meta"));
                    jSONObject2.put("vq_score", jSONObject.optDouble("vq_score", 0.0d));
                    jSONObject2.put("sr_score", jSONObject.optDouble("sr_score", 0.0d));
                    jSONObject2.put("video_id", originUri);
                    jSONObject2.put("video_duration", duration / ((double) 1000.0f));
                    jSONObject2.put("media_type", "video");
                    jSONObject2.put("did_profile_labels", didProfileLabels);
                    jSONObject2.put("vid_profile_labels", vidProfileLabels);
                    jSONObject2.put("trans_params", transParams);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("dynamic_type", "segment_base");
                    JSONArray jSONArray = new JSONArray();
                    for (SimBitRate simBitRate : list) {
                        if (!TextUtils.isEmpty(simBitRate.videoExtra)) {
                            json = C1472900oQq.from(simBitRate.videoExtra).getJson();
                        } else {
                            json = null;
                        }
                        if (json == null) {
                            iOptInt = simBitRate.bitRate;
                        } else {
                            iOptInt = json.optInt("real_bitrate", simBitRate.bitRate);
                        }
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("real_bitrate", iOptInt);
                        jSONObject4.put("fps", simBitRate.LLILLJJLI);
                        if (json == null) {
                            strOptString = null;
                        } else {
                            strOptString = json.optString("definition");
                        }
                        jSONObject4.put("definition", strOptString);
                        if (json == null) {
                            strOptString2 = null;
                        } else {
                            strOptString2 = json.optString("quality");
                        }
                        jSONObject4.put("quality", strOptString2);
                        if (json == null) {
                            strOptString3 = null;
                        } else {
                            strOptString3 = json.optString("mvmaf");
                        }
                        jSONObject4.put("mvmaf", strOptString3);
                        if (json == null) {
                            strOptString4 = null;
                        } else {
                            strOptString4 = json.optString("audio_file_id");
                        }
                        jSONObject4.put("audio_file_id", strOptString4);
                        if (json == null) {
                            strOptString5 = null;
                        } else {
                            strOptString5 = json.optString("gearvqm");
                        }
                        jSONObject4.put("gearvqm", strOptString5);
                        jSONObject4.put("vtype", "dash");
                        SimUrlModel simUrlModel = simBitRate.playAddr;
                        if (simUrlModel != null) {
                            numValueOf = Integer.valueOf(simUrlModel.width);
                        } else {
                            numValueOf = null;
                        }
                        jSONObject4.put("vwidth", numValueOf);
                        SimUrlModel simUrlModel2 = simBitRate.playAddr;
                        if (simUrlModel2 != null) {
                            numValueOf2 = Integer.valueOf(simUrlModel2.height);
                        } else {
                            numValueOf2 = null;
                        }
                        jSONObject4.put("vheight", numValueOf2);
                        jSONObject4.put("bitrate", simBitRate.bitRate);
                        jSONObject4.put("size", simBitRate.getSize());
                        jSONObject4.put("codec_type", C1475940oVk.LIZ(simBitRate.LL));
                        SimUrlModel simUrlModel3 = simBitRate.playAddr;
                        if (simUrlModel3 != null) {
                            str = simUrlModel3.fileHash;
                        } else {
                            str = null;
                        }
                        jSONObject4.put("file_hash", str);
                        if (json == null) {
                            strOptString6 = null;
                        } else {
                            strOptString6 = json.optString("file_id");
                        }
                        jSONObject4.put("file_id", strOptString6);
                        List<String> listUrlList = simBitRate.urlList();
                        if (listUrlList != null && (str5 = (String) C13LP.LJJJLZIJ(0, listUrlList)) != null) {
                            jSONObject4.put("main_url", str5);
                        }
                        List<String> listUrlList2 = simBitRate.urlList();
                        if (listUrlList2 != null && (str4 = (String) C13LP.LJJJLZIJ(1, listUrlList2)) != null) {
                            jSONObject4.put("backup_url_1", str4);
                        }
                        List<String> listUrlList3 = simBitRate.urlList();
                        if (listUrlList3 != null && (str3 = (String) C13LP.LJJJLZIJ(2, listUrlList3)) != null) {
                            jSONObject4.put("backup_url_2", str3);
                        }
                        List<String> listUrlList4 = simBitRate.urlList();
                        if (listUrlList4 != null && (str2 = (String) C13LP.LJJJLZIJ(3, listUrlList4)) != null) {
                            jSONObject4.put("backup_url_3", str2);
                        }
                        if (json == null) {
                            strOptString7 = null;
                        } else {
                            strOptString7 = json.optString("sub_info");
                        }
                        jSONObject4.put("sub_info", strOptString7);
                        jSONObject4.put("fid_profile_labels", simBitRate.getFidProfileLabels());
                        jSONObject4.put("hdr_type", simBitRate.getHdrType());
                        if (json == null) {
                            strOptString8 = null;
                        } else {
                            strOptString8 = json.optString("dec_info");
                        }
                        jSONObject4.put("dec_info", strOptString8);
                        jSONObject4.put("gear_name", simBitRate.getGearName());
                        jSONArray.put(jSONObject4);
                    }
                    jSONObject3.put("dynamic_video_list", jSONArray);
                    JSONArray jSONArray2 = new JSONArray();
                    for (SimAudioBitrate simAudioBitrate : list2) {
                        JSONObject jSONObject5 = new JSONObject();
                        C1476780oX6 audioMeta = simAudioBitrate.getAudioMeta();
                        if (audioMeta != null) {
                            lValueOf = Long.valueOf(audioMeta.getBitrate());
                        } else {
                            lValueOf = null;
                        }
                        jSONObject5.put("real_bitrate", lValueOf);
                        C1476780oX6 audioMeta2 = simAudioBitrate.getAudioMeta();
                        if (audioMeta2 != null) {
                            quality = audioMeta2.getQuality();
                        } else {
                            quality = null;
                        }
                        jSONObject5.put("quality", quality);
                        jSONObject5.put("vtype", "dash");
                        C1476780oX6 audioMeta3 = simAudioBitrate.getAudioMeta();
                        if (audioMeta3 != null) {
                            lValueOf2 = Long.valueOf(audioMeta3.getBitrate());
                        } else {
                            lValueOf2 = null;
                        }
                        jSONObject5.put("bitrate", lValueOf2);
                        C1476780oX6 audioMeta4 = simAudioBitrate.getAudioMeta();
                        if (audioMeta4 != null) {
                            lValueOf3 = Long.valueOf(audioMeta4.getSize());
                        } else {
                            lValueOf3 = null;
                        }
                        jSONObject5.put("size", lValueOf3);
                        C1476780oX6 audioMeta5 = simAudioBitrate.getAudioMeta();
                        if (audioMeta5 != null) {
                            codecType = audioMeta5.getCodecType();
                        } else {
                            codecType = null;
                        }
                        jSONObject5.put("codec_type", codecType);
                        C1476780oX6 audioMeta6 = simAudioBitrate.getAudioMeta();
                        if (audioMeta6 != null) {
                            fileHash = audioMeta6.getFileHash();
                        } else {
                            fileHash = null;
                        }
                        jSONObject5.put("file_hash", fileHash);
                        C1476780oX6 audioMeta7 = simAudioBitrate.getAudioMeta();
                        if (audioMeta7 != null && (urlList3 = audioMeta7.getUrlList()) != null) {
                            mainUrl = urlList3.getMainUrl();
                        } else {
                            mainUrl = null;
                        }
                        jSONObject5.put("main_url", mainUrl);
                        C1476780oX6 audioMeta8 = simAudioBitrate.getAudioMeta();
                        if (audioMeta8 != null && (urlList2 = audioMeta8.getUrlList()) != null) {
                            backupUrl = urlList2.getBackupUrl();
                        } else {
                            backupUrl = null;
                        }
                        jSONObject5.put("backup_url_1", backupUrl);
                        C1476780oX6 audioMeta9 = simAudioBitrate.getAudioMeta();
                        if (audioMeta9 != null && (urlList = audioMeta9.getUrlList()) != null) {
                            fallbackUrl = urlList.getFallbackUrl();
                        } else {
                            fallbackUrl = null;
                        }
                        jSONObject5.put("backup_url_2", fallbackUrl);
                        C1476780oX6 audioMeta10 = simAudioBitrate.getAudioMeta();
                        if (audioMeta10 != null) {
                            subInfo = audioMeta10.getSubInfo();
                        } else {
                            subInfo = null;
                        }
                        jSONObject5.put("sub_info", subInfo);
                        C1476780oX6 audioMeta11 = simAudioBitrate.getAudioMeta();
                        if (audioMeta11 != null) {
                            fileId = audioMeta11.getFileId();
                        } else {
                            fileId = null;
                        }
                        jSONObject5.put("file_id", fileId);
                        C1476780oX6 audioMeta12 = simAudioBitrate.getAudioMeta();
                        if (audioMeta12 != null) {
                            fidProfileLabels = audioMeta12.getFidProfileLabels();
                        } else {
                            fidProfileLabels = null;
                        }
                        jSONObject5.put("fid_profile_labels", fidProfileLabels);
                        C1476780oX6 audioMeta13 = simAudioBitrate.getAudioMeta();
                        if (audioMeta13 != null) {
                            languageCode = audioMeta13.getLanguageCode();
                        } else {
                            languageCode = null;
                        }
                        jSONObject5.put("language_code", languageCode);
                        C1476780oX6 audioMeta14 = simAudioBitrate.getAudioMeta();
                        if (audioMeta14 != null) {
                            boolValueOf = Boolean.valueOf(audioMeta14.getIsDubbedAudio());
                        } else {
                            boolValueOf = null;
                        }
                        jSONObject5.put("is_dubbed_audio", boolValueOf);
                        C1476780oX6 audioMeta15 = simAudioBitrate.getAudioMeta();
                        if (audioMeta15 != null) {
                            loudness = audioMeta15.getLoudness();
                        } else {
                            loudness = null;
                        }
                        jSONObject5.put("loudness", loudness);
                        C1476780oX6 audioMeta16 = simAudioBitrate.getAudioMeta();
                        if (audioMeta16 != null) {
                            peak = audioMeta16.getPeak();
                        } else {
                            peak = null;
                        }
                        jSONObject5.put("peak", peak);
                        jSONArray2.put(jSONObject5);
                    }
                    jSONObject3.put("dynamic_audio_list", jSONArray2);
                    jSONObject2.put("dynamic_video", jSONObject3);
                    return C786410Ut5.J3(jSONObject2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
        }
        return null;
    }

    public static Map LIZJ(SimVideoUrlModel simVideoUrlModel, List list, List list2) {
        List audioBitrate = list2;
        List rawBitRate = list;
        Map mapLIZ = null;
        if (simVideoUrlModel == null || !simVideoUrlModel.hasDashBitrate()) {
            return null;
        }
        if (rawBitRate == null && (rawBitRate = simVideoUrlModel.getRawBitRate()) == null) {
            rawBitRate = C13BV.INSTANCE;
        }
        if (audioBitrate == null && (audioBitrate = simVideoUrlModel.getAudioBitrate()) == null) {
            audioBitrate = C13BV.INSTANCE;
        }
        String str = simVideoUrlModel.LLJJ;
        String originUri = simVideoUrlModel.getOriginUri();
        double duration = simVideoUrlModel.getDuration();
        String didProfileLabels = simVideoUrlModel.getDidProfileLabels();
        String vidProfileLabels = simVideoUrlModel.getVidProfileLabels();
        String transParams = simVideoUrlModel.getTransParams();
        if (!(!rawBitRate.isEmpty()) && !(!audioBitrate.isEmpty())) {
            return null;
        }
        try {
            mapLIZ = LIZ(rawBitRate, audioBitrate, str, originUri, (int) duration, didProfileLabels, vidProfileLabels, transParams);
            return mapLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return mapLIZ;
        }
    }

    public static Map LIZ(List list, List list2, String str, String str2, int i, String str3, String str4, String str5) {
        String strOptString;
        Double dValueOf;
        Double dValueOf2;
        Long lValueOf;
        String quality;
        Long lValueOf2;
        Long lValueOf3;
        String codecType;
        String fileHash;
        String mainUrl;
        String backupUrl;
        String fallbackUrl;
        String subInfo;
        String fileId;
        String fidProfileLabels;
        String languageCode;
        Boolean boolValueOf;
        Float loudness;
        Float peak;
        C1476790oX7 urlList;
        C1476790oX7 urlList2;
        C1476790oX7 urlList3;
        JSONObject json;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        Integer numValueOf;
        Integer numValueOf2;
        String str6;
        String strOptString6;
        String strOptString7;
        String strOptString8;
        String strOptString9;
        String strOptString10;
        String strOptString11;
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        Object objLJJJLZIJ3;
        Object objLJJJLZIJ4;
        JSONObject json2 = C1473210oRL.from(str).getJson();
        HashMap map = new HashMap();
        map.put("enable_video_dash_reconstruct", 1);
        if (json2 != null) {
            strOptString = json2.optString("video_meta");
        } else {
            strOptString = null;
        }
        map.put("video_meta", strOptString);
        if (json2 != null) {
            dValueOf = Double.valueOf(json2.optDouble("vq_score", 0.0d));
        } else {
            dValueOf = null;
        }
        map.put("vq_score", dValueOf);
        if (json2 != null) {
            dValueOf2 = Double.valueOf(json2.optDouble("sr_score", 0.0d));
        } else {
            dValueOf2 = null;
        }
        map.put("sr_score", dValueOf2);
        map.put("video_id", str2);
        map.put("video_duration", Float.valueOf(i / 1000.0f));
        map.put("media_type", "video");
        map.put("did_profile_labels", str3);
        map.put("vid_profile_labels", str4);
        map.put("trans_params", str5);
        HashMap map2 = new HashMap();
        map2.put("dynamic_type", "segment_base");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SimBitRate simBitRate = (SimBitRate) it2.next();
            if (!TextUtils.isEmpty(simBitRate.videoExtra)) {
                json = C1472900oQq.from(simBitRate.videoExtra).getJson();
            } else {
                json = null;
            }
            int iOptInt = simBitRate.bitRate;
            if (json != null) {
                iOptInt = json.optInt("real_bitrate", iOptInt);
            }
            HashMap map3 = new HashMap();
            map3.put("real_bitrate", Integer.valueOf(iOptInt));
            map3.put("fps", Long.valueOf(simBitRate.LLILLJJLI));
            if (json != null) {
                strOptString2 = json.optString("definition");
            } else {
                strOptString2 = null;
            }
            map3.put("definition", strOptString2);
            if (json != null) {
                strOptString3 = json.optString("quality");
            } else {
                strOptString3 = null;
            }
            map3.put("quality", strOptString3);
            if (json != null) {
                strOptString4 = json.optString("mvmaf");
            } else {
                strOptString4 = null;
            }
            map3.put("mvmaf", strOptString4);
            if (json != null) {
                strOptString5 = json.optString("gearvqm");
            } else {
                strOptString5 = null;
            }
            map3.put("gearvqm", strOptString5);
            map3.put("vtype", "dash");
            SimUrlModel simUrlModel = simBitRate.playAddr;
            if (simUrlModel != null) {
                numValueOf = Integer.valueOf(simUrlModel.width);
            } else {
                numValueOf = null;
            }
            map3.put("vwidth", numValueOf);
            SimUrlModel simUrlModel2 = simBitRate.playAddr;
            if (simUrlModel2 != null) {
                numValueOf2 = Integer.valueOf(simUrlModel2.height);
            } else {
                numValueOf2 = null;
            }
            map3.put("vheight", numValueOf2);
            map3.put("bitrate", Integer.valueOf(simBitRate.bitRate));
            map3.put("size", Integer.valueOf(simBitRate.getSize()));
            map3.put("codec_type", C1475940oVk.LIZ(simBitRate.LL));
            SimUrlModel simUrlModel3 = simBitRate.playAddr;
            if (simUrlModel3 != null) {
                str6 = simUrlModel3.fileHash;
            } else {
                str6 = null;
            }
            map3.put("file_hash", str6);
            if (json != null) {
                strOptString6 = json.optString("file_id");
            } else {
                strOptString6 = null;
            }
            map3.put("file_id", strOptString6);
            List<String> listUrlList = simBitRate.urlList();
            if (listUrlList != null && (objLJJJLZIJ4 = C13LP.LJJJLZIJ(0, listUrlList)) != null) {
                map3.put("main_url", objLJJJLZIJ4);
            }
            List<String> listUrlList2 = simBitRate.urlList();
            if (listUrlList2 != null && (objLJJJLZIJ3 = C13LP.LJJJLZIJ(1, listUrlList2)) != null) {
                map3.put("backup_url_1", objLJJJLZIJ3);
            }
            List<String> listUrlList3 = simBitRate.urlList();
            if (listUrlList3 != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(2, listUrlList3)) != null) {
                map3.put("backup_url_2", objLJJJLZIJ2);
            }
            List<String> listUrlList4 = simBitRate.urlList();
            if (listUrlList4 != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(3, listUrlList4)) != null) {
                map3.put("backup_url_3", objLJJJLZIJ);
            }
            if (json != null) {
                strOptString7 = json.optString("sub_info");
            } else {
                strOptString7 = null;
            }
            map3.put("sub_info", strOptString7);
            if (json != null) {
                strOptString8 = json.optString("mvmaf");
            } else {
                strOptString8 = null;
            }
            map3.put("mvmaf", strOptString8);
            if (json != null) {
                strOptString9 = json.optString("audio_file_id");
            } else {
                strOptString9 = null;
            }
            map3.put("audio_file_id", strOptString9);
            if (json != null) {
                strOptString10 = json.optString("gearvqm");
            } else {
                strOptString10 = null;
            }
            map3.put("gearvqm", strOptString10);
            map3.put("fid_profile_labels", simBitRate.getFidProfileLabels());
            map3.put("hdr_type", Integer.valueOf(simBitRate.getHdrType()));
            if (json != null) {
                strOptString11 = json.optString("dec_info");
            } else {
                strOptString11 = null;
            }
            map3.put("dec_info", strOptString11);
            map3.put("gear_name", simBitRate.getGearName());
            arrayList.add(map3);
        }
        map2.put("dynamic_video_list", arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            SimAudioBitrate simAudioBitrate = (SimAudioBitrate) it3.next();
            HashMap map4 = new HashMap();
            C1476780oX6 audioMeta = simAudioBitrate.getAudioMeta();
            if (audioMeta != null) {
                lValueOf = Long.valueOf(audioMeta.getBitrate());
            } else {
                lValueOf = null;
            }
            map4.put("real_bitrate", lValueOf);
            C1476780oX6 audioMeta2 = simAudioBitrate.getAudioMeta();
            if (audioMeta2 != null) {
                quality = audioMeta2.getQuality();
            } else {
                quality = null;
            }
            map4.put("quality", quality);
            map4.put("vtype", "dash");
            C1476780oX6 audioMeta3 = simAudioBitrate.getAudioMeta();
            if (audioMeta3 != null) {
                lValueOf2 = Long.valueOf(audioMeta3.getBitrate());
            } else {
                lValueOf2 = null;
            }
            map4.put("bitrate", lValueOf2);
            C1476780oX6 audioMeta4 = simAudioBitrate.getAudioMeta();
            if (audioMeta4 != null) {
                lValueOf3 = Long.valueOf(audioMeta4.getSize());
            } else {
                lValueOf3 = null;
            }
            map4.put("size", lValueOf3);
            C1476780oX6 audioMeta5 = simAudioBitrate.getAudioMeta();
            if (audioMeta5 != null) {
                codecType = audioMeta5.getCodecType();
            } else {
                codecType = null;
            }
            map4.put("codec_type", codecType);
            C1476780oX6 audioMeta6 = simAudioBitrate.getAudioMeta();
            if (audioMeta6 != null) {
                fileHash = audioMeta6.getFileHash();
            } else {
                fileHash = null;
            }
            map4.put("file_hash", fileHash);
            C1476780oX6 audioMeta7 = simAudioBitrate.getAudioMeta();
            if (audioMeta7 != null && (urlList3 = audioMeta7.getUrlList()) != null) {
                mainUrl = urlList3.getMainUrl();
            } else {
                mainUrl = null;
            }
            map4.put("main_url", mainUrl);
            C1476780oX6 audioMeta8 = simAudioBitrate.getAudioMeta();
            if (audioMeta8 != null && (urlList2 = audioMeta8.getUrlList()) != null) {
                backupUrl = urlList2.getBackupUrl();
            } else {
                backupUrl = null;
            }
            map4.put("backup_url_1", backupUrl);
            C1476780oX6 audioMeta9 = simAudioBitrate.getAudioMeta();
            if (audioMeta9 != null && (urlList = audioMeta9.getUrlList()) != null) {
                fallbackUrl = urlList.getFallbackUrl();
            } else {
                fallbackUrl = null;
            }
            map4.put("backup_url_2", fallbackUrl);
            C1476780oX6 audioMeta10 = simAudioBitrate.getAudioMeta();
            if (audioMeta10 != null) {
                subInfo = audioMeta10.getSubInfo();
            } else {
                subInfo = null;
            }
            map4.put("sub_info", subInfo);
            C1476780oX6 audioMeta11 = simAudioBitrate.getAudioMeta();
            if (audioMeta11 != null) {
                fileId = audioMeta11.getFileId();
            } else {
                fileId = null;
            }
            map4.put("file_id", fileId);
            C1476780oX6 audioMeta12 = simAudioBitrate.getAudioMeta();
            if (audioMeta12 != null) {
                fidProfileLabels = audioMeta12.getFidProfileLabels();
            } else {
                fidProfileLabels = null;
            }
            map4.put("fid_profile_labels", fidProfileLabels);
            C1476780oX6 audioMeta13 = simAudioBitrate.getAudioMeta();
            if (audioMeta13 != null) {
                languageCode = audioMeta13.getLanguageCode();
            } else {
                languageCode = null;
            }
            map4.put("language_code", languageCode);
            C1476780oX6 audioMeta14 = simAudioBitrate.getAudioMeta();
            if (audioMeta14 != null) {
                boolValueOf = Boolean.valueOf(audioMeta14.getIsDubbedAudio());
            } else {
                boolValueOf = null;
            }
            map4.put("is_dubbed_audio", boolValueOf);
            C1476780oX6 audioMeta15 = simAudioBitrate.getAudioMeta();
            if (audioMeta15 != null) {
                loudness = audioMeta15.getLoudness();
            } else {
                loudness = null;
            }
            map4.put("loudness", loudness);
            C1476780oX6 audioMeta16 = simAudioBitrate.getAudioMeta();
            if (audioMeta16 != null) {
                peak = audioMeta16.getPeak();
            } else {
                peak = null;
            }
            map4.put("peak", peak);
            arrayList2.add(map4);
        }
        map2.put("dynamic_audio_list", arrayList2);
        map.put("dynamic_video", map2);
        return map;
    }
}
