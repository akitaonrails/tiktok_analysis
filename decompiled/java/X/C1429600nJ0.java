package X;

import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVoiceAnchorModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterialKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429600nJ0 {
    public static boolean LJFF(SimpleTextStickerData simpleTextStickerData) {
        long jLIZ;
        long j = 0;
        if (simpleTextStickerData.getTtsAnchorReleaseDate() <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jCurrentTimeMillis < simpleTextStickerData.getTtsAnchorReleaseDate()) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJJ(31744, "tts_voice_anchor_release_duration", "", true).length() == 0) {
            return true;
        }
        long ttsAnchorReleaseDate = simpleTextStickerData.getTtsAnchorReleaseDate();
        try {
            String lowerCase = C0C64.LJIILLIIL().LJJ(31744, "tts_voice_anchor_release_duration", "", true).toLowerCase(Locale.ROOT);
            Pattern patternCompile = PatternProtector.compile("[0-9]+h");
            Pattern patternCompile2 = PatternProtector.compile("[0-9]+m(?!s)");
            Pattern patternCompile3 = PatternProtector.compile("[0-9]+s");
            Pattern patternCompile4 = PatternProtector.compile("[0-9]+ms");
            Matcher matcher = patternCompile.matcher(lowerCase);
            if (matcher.find()) {
                jLIZ = C2456409ju.LIZ(matcher.group()) + 0;
            } else {
                jLIZ = 0;
            }
            Matcher matcher2 = patternCompile2.matcher(lowerCase);
            if (matcher2.find()) {
                jLIZ += C2456409ju.LIZ(matcher2.group());
            }
            Matcher matcher3 = patternCompile3.matcher(lowerCase);
            if (matcher3.find()) {
                jLIZ += C2456409ju.LIZ(matcher3.group());
            }
            Matcher matcher4 = patternCompile4.matcher(lowerCase);
            if (matcher4.find()) {
                jLIZ += C2456409ju.LIZ(matcher4.group());
            }
            j = jLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (jCurrentTimeMillis > ttsAnchorReleaseDate + j) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6 A[Catch: JSONException -> 0x022d, TryCatch #0 {JSONException -> 0x022d, blocks: (B:61:0x018e, B:63:0x019f, B:64:0x01a3, B:66:0x01a9, B:68:0x01af, B:74:0x01c2, B:76:0x01ca, B:77:0x01ce, B:79:0x01d6, B:80:0x01da, B:82:0x01e2, B:83:0x01e6, B:85:0x01f6, B:87:0x0206, B:89:0x0216, B:95:0x0229), top: B:99:0x018e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429600nJ0.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap linkedHashMap) {
        boolean z;
        Integer numValueOf;
        CommentVideoModel commentVideoModel = videoPublishEditModel.getCommentVideoModel();
        if (commentVideoModel == null) {
            return;
        }
        String replyToReplyId = commentVideoModel.getReplyToReplyId();
        if (replyToReplyId != null && replyToReplyId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z)) {
            String commentId = commentVideoModel.getCommentId();
            if (commentId == null) {
                commentId = "";
            }
            linkedHashMap.put("reply_id", commentId);
        } else {
            String replyId = commentVideoModel.getReplyId();
            if (replyId == null) {
                replyId = "";
            }
            linkedHashMap.put("reply_id", replyId);
        }
        String replyToReplyId2 = commentVideoModel.getReplyToReplyId();
        if (replyToReplyId2 == null) {
            replyToReplyId2 = "";
        }
        linkedHashMap.put("reply_to_reply_id", replyToReplyId2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(commentVideoModel.getChannelId());
        sbLIZ.append("");
        linkedHashMap.put("channel_id", C2188811AlT.LIZIZ(sbLIZ));
        linkedHashMap.put("reply_aweme_id", commentVideoModel.getAwemeId());
        linkedHashMap.put("reply_user_id", commentVideoModel.getUserId());
        CommentVideoModel.Type type = commentVideoModel.getType();
        if (type != null) {
            numValueOf = Integer.valueOf(type.getCode());
        } else {
            numValueOf = null;
        }
        linkedHashMap.put("video_reply_type", String.valueOf(numValueOf));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.List r20, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429600nJ0.LIZIZ(java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.List r55, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r56) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1429600nJ0.LIZJ(java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static void LIZLLL(List list, VideoPublishEditModel videoPublishEditModel) {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LIZLLL() == 3 && !C2353809Ke.LIZ) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (videoPublishEditModel.getTextStickerDataList() != null) {
            for (SimpleTextStickerData simpleTextStickerData : videoPublishEditModel.getTextStickerDataList()) {
                if (simpleTextStickerData.getHasReadTextAudio() && C123100dR.LIZ(simpleTextStickerData.getVoiceEffectId()) && C123100dR.LIZ(simpleTextStickerData.getVoiceAnchorName()) && !C13LP.LJJJJ(simpleTextStickerData.getVoiceEffectId(), linkedHashSet) && LJFF(simpleTextStickerData)) {
                    String voiceEffectId = simpleTextStickerData.getVoiceEffectId();
                    if (voiceEffectId != null) {
                        linkedHashSet.add(voiceEffectId);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            String voiceEffectId2 = simpleTextStickerData.getVoiceEffectId();
                            if (voiceEffectId2 != null) {
                                jSONObject.put("tts_voice_id", voiceEffectId2);
                                jSONObject.put("create_source", "tt");
                                String voiceAnchorName = simpleTextStickerData.getVoiceAnchorName();
                                if (voiceAnchorName == null) {
                                    voiceAnchorName = "";
                                }
                                try {
                                    try {
                                        String json = GsonProtectorUtils.toJson(o.LIZIZ, new TTSVoiceStruct(simpleTextStickerData.getVoiceEffectId(), simpleTextStickerData.getVoiceEffectIconUrl(), simpleTextStickerData.getVoiceEffectResourceId(), C786410Ut5.J3(jSONObject)));
                                        ArrayList<EnumC1430380nKG> arrayList = C1429550nIv.LIZ;
                                        ArrayList arrayList2 = (ArrayList) list;
                                        arrayList2.add(new CreateAnchorInfo(50, voiceAnchorName, "", "", json, C1429550nIv.LIZ(EnumC1430380nKG.TTS_VOICE, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/tts_voice_anchor_icon.png"), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, LJFF(simpleTextStickerData), null, null, false, null));
                                    } catch (JSONException e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            e = e;
                        } catch (JSONException e3) {
                            e = e3;
                        }
                        TryCatchGuardChecker.doCheck(e);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        for (CapcutVoiceAnchorModel capcutVoiceAnchorModel : videoPublishEditModel.creativeModel.capcutVcTTSModel.ttsAnchorModels.values()) {
            if (C123100dR.LIZ(capcutVoiceAnchorModel.effectName) && C123100dR.LIZ(capcutVoiceAnchorModel.effectId) && !C13LP.LJJJJ(capcutVoiceAnchorModel.effectId, linkedHashSet)) {
                String str = capcutVoiceAnchorModel.effectId;
                if (str != null) {
                    linkedHashSet.add(str);
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        String str2 = capcutVoiceAnchorModel.effectId;
                        if (str2 != null) {
                            jSONObject2.put("tts_voice_id", str2);
                            jSONObject2.put("create_source", "cc");
                            String str3 = capcutVoiceAnchorModel.effectName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            String json2 = GsonProtectorUtils.toJson(o.LIZIZ, new TTSVoiceStruct(capcutVoiceAnchorModel.effectId, capcutVoiceAnchorModel.effectIconUrl, capcutVoiceAnchorModel.resourceId, C786410Ut5.J3(jSONObject2)));
                            ArrayList<EnumC1430380nKG> arrayList3 = C1429550nIv.LIZ;
                            String str4 = str3;
                            ((ArrayList) list).add(new CreateAnchorInfo(50, str4, "", "", json2, C1429550nIv.LIZ(EnumC1430380nKG.TTS_VOICE, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/tts_voice_anchor_icon.png"), Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    public static void LJ(List list, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        NLEModel nLEModelLJJLIIIJILLIZJL;
        VecNLETrackSPtr tracks;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LIZLLL() == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsLogin = C0CHQ.LIZ().getAccountService().isLogin();
        boolean zLIZ = C0CHQ.LIZ().getAccountService().LIZ();
        if ((!z || C2353809Ke.LIZ) && zIsLogin && !zLIZ) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (videoPublishEditModel.getNleData() != null && (nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel)) != null && (tracks = nLEModelLJJLIIIJILLIZJL.getTracks()) != null && !tracks.isEmpty()) {
                Iterator<NLETrack> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                        if (nLETrackSlot != null && nLETrackSlot.hasExtra("extra_voice_chang_effect_id") && nLETrackSlot.getExtra("extra_voice_chang_effect_id").length() > 0 && !linkedHashSet.contains(nLETrackSlot.getExtra("extra_voice_chang_effect_id"))) {
                            String extra = nLETrackSlot.getExtra("extra_voice_chang_effect_id");
                            String extra2 = nLETrackSlot.getExtra("extra_voice_chang_effect_anchor_name");
                            if (extra2 == null) {
                                extra2 = "";
                            }
                            EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_VOICECONVERSION;
                            String strLIZ = C1394650mOd.LIZ(enumC1430380nKG, extra2);
                            String extra3 = nLETrackSlot.getExtra("extra_voice_chang_effect_icon_url");
                            String extra4 = nLETrackSlot.getExtra("extra_voice_chang_effect_resource_id");
                            linkedHashSet.add(extra);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("effect_id", extra);
                                jSONObject.put("icon_url", extra3);
                                jSONObject.put("resource_id", extra4);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("vc_filter_id", extra);
                                jSONObject2.put("create_source", "tt");
                                jSONObject.put("vc_filter_attr", C786410Ut5.J3(jSONObject2));
                                if (strLIZ == null) {
                                    strLIZ = "";
                                }
                                ((ArrayList) list).add(new CreateAnchorInfo(72, strLIZ, "", "", C786410Ut5.J3(jSONObject), C1429550nIv.LIZ(enumC1430380nKG, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/vc_filter_anchor_icon.png"), Long.valueOf(System.currentTimeMillis()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            }
            for (CapcutVoiceAnchorModel capcutVoiceAnchorModel : videoPublishEditModel.creativeModel.capcutVcTTSModel.vcAnchorModels.values()) {
                String str = capcutVoiceAnchorModel.effectId;
                if (str != null && str.length() != 0 && !C13LP.LJJJJ(capcutVoiceAnchorModel.effectId, linkedHashSet)) {
                    String str2 = capcutVoiceAnchorModel.effectId;
                    if (str2 != null) {
                        linkedHashSet.add(str2);
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("effect_id", capcutVoiceAnchorModel.effectId);
                            jSONObject3.put("icon_url", capcutVoiceAnchorModel.effectIconUrl);
                            jSONObject3.put("resource_id", capcutVoiceAnchorModel.resourceId);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("vc_filter_id", capcutVoiceAnchorModel.effectId);
                            jSONObject4.put("create_source", "cc");
                            jSONObject3.put("vc_filter_attr", C786410Ut5.J3(jSONObject4));
                            String str3 = capcutVoiceAnchorModel.effectName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            EnumC1430380nKG enumC1430380nKG2 = EnumC1430380nKG.ANCHOR_VOICECONVERSION;
                            ((ArrayList) list).add(new CreateAnchorInfo(72, C1394650mOd.LIZ(enumC1430380nKG2, str3), "", "", C786410Ut5.J3(jSONObject3), C1429550nIv.LIZ(enumC1430380nKG2, "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/vc_filter_anchor_icon.png"), Long.valueOf(System.currentTimeMillis()), "", "", "", "", Boolean.TRUE, true, null, null, false, null));
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
    }

    public static String LJI(TimeSpeedModelExtension timeSpeedModelExtension, List list, StickerInfo stickerInfo) {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            Integer type = GreenScreenMaterialKt.getType(timeSpeedModelExtension);
            if (type != null) {
                jSONObject.put("green_screen_materials_type", type.intValue());
            }
            if (stickerInfo != null) {
                jSONObject.put("resource_id", stickerInfo.getResourceId());
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((UploadableMobileEffect2) it2.next()).effectId, timeSpeedModelExtension.getStickerId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jSONObject.put("mobile_effect_type", true);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return C786410Ut5.J3(new JSONObject());
        }
    }
}
