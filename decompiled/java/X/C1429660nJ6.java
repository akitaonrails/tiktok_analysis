package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVoiceAnchorModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429660nJ6 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429660nJ6.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        try {
            JSONArray jSONArray = new JSONArray();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (videoPublishEditModel.getTextStickerDataList() != null) {
                for (SimpleTextStickerData simpleTextStickerData : videoPublishEditModel.getTextStickerDataList()) {
                    if (simpleTextStickerData.getHasReadTextAudio() && C123100dR.LIZ(simpleTextStickerData.getVoiceEffectId())) {
                        String voiceEffectId = simpleTextStickerData.getVoiceEffectId();
                        if (voiceEffectId != null) {
                            if (linkedHashSet.contains(voiceEffectId)) {
                                continue;
                            } else {
                                String voiceEffectId2 = simpleTextStickerData.getVoiceEffectId();
                                if (voiceEffectId2 != null) {
                                    linkedHashSet.add(voiceEffectId2);
                                    JSONObject jSONObject = new JSONObject();
                                    String voiceEffectId3 = simpleTextStickerData.getVoiceEffectId();
                                    if (voiceEffectId3 != null) {
                                        jSONObject.put("tts_voice_id", voiceEffectId3);
                                        jSONObject.put("create_source", "tt");
                                        if (!simpleTextStickerData.getTtsExtraMap().containsKey("from_tag")) {
                                            jSONObject.put("tts_voice_origin", "");
                                        } else {
                                            jSONObject.put("tts_voice_origin", simpleTextStickerData.getTtsExtraMap().get("from_tag"));
                                        }
                                        jSONArray.put(jSONObject);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }
            for (CapcutVoiceAnchorModel capcutVoiceAnchorModel : videoPublishEditModel.creativeModel.capcutVcTTSModel.ttsAnchorModels.values()) {
                String str = capcutVoiceAnchorModel.effectId;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !C13LP.LJJJJ(capcutVoiceAnchorModel.effectId, linkedHashSet)) {
                    String str2 = capcutVoiceAnchorModel.effectId;
                    if (str2 != null) {
                        linkedHashSet.add(str2);
                        JSONObject jSONObject2 = new JSONObject();
                        String str3 = capcutVoiceAnchorModel.effectId;
                        if (str3 != null) {
                            jSONObject2.put("tts_voice_id", str3);
                            jSONObject2.put("create_source", "cc");
                            jSONArray.put(jSONObject2);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final String LJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        VecNLETrackSPtr tracks;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            JSONArray jSONArray = new JSONArray();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (videoPublishEditModel.getNleData() != null) {
                NLEModel nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel);
                if (nLEModelLJJLIIIJILLIZJL != null) {
                    tracks = nLEModelLJJLIIIJILLIZJL.getTracks();
                } else {
                    tracks = null;
                }
                if (tracks == null || tracks.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && tracks != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                            if (nLETrackSlot != null && nLETrackSlot.hasExtra("extra_voice_chang_effect_id")) {
                                if (nLETrackSlot.getExtra("extra_voice_chang_effect_id").length() <= 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3 && !linkedHashSet.contains(nLETrackSlot.getExtra("extra_voice_chang_effect_id"))) {
                                    String extra = nLETrackSlot.getExtra("extra_voice_chang_effect_id");
                                    String extra2 = nLETrackSlot.getExtra("extra_voice_change_creator_id");
                                    linkedHashSet.add(extra);
                                    if (extra2.length() <= 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        linkedHashSet2.add(extra2);
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("vc_filter_id", extra);
                                    jSONObject.put("create_source", "tt");
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                    }
                }
            }
            videoPublishEditModel.creativeModel.voiceConversionModel.vcVoiceIDs.clear();
            videoPublishEditModel.creativeModel.voiceConversionModel.vcCreatorIDs.clear();
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                videoPublishEditModel.creativeModel.voiceConversionModel.vcVoiceIDs.add((String) it3.next());
            }
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                videoPublishEditModel.creativeModel.voiceConversionModel.vcCreatorIDs.add((String) it4.next());
            }
            for (CapcutVoiceAnchorModel capcutVoiceAnchorModel : videoPublishEditModel.creativeModel.capcutVcTTSModel.vcAnchorModels.values()) {
                String str = capcutVoiceAnchorModel.effectId;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String str2 = capcutVoiceAnchorModel.effectId;
                    if (str2 != null) {
                        if (linkedHashSet.contains(str2)) {
                            continue;
                        } else {
                            String str3 = capcutVoiceAnchorModel.effectId;
                            if (str3 != null) {
                                linkedHashSet.add(str3);
                                JSONObject jSONObject2 = new JSONObject();
                                String str4 = capcutVoiceAnchorModel.effectId;
                                if (str4 != null) {
                                    jSONObject2.put("vc_filter_id", str4);
                                    jSONObject2.put("create_source", "cc");
                                    jSONArray.put(jSONObject2);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
