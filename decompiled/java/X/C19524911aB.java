package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19524911aB {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(boolean z, InterfaceC19526511aR interfaceC19526511aR, int i) {
        Integer numValueOf;
        String str;
        String str2;
        C11YJ c11yj;
        String str3;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C19525511aH c19525511aH = new C19525511aH(linkedHashMap);
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AbstractC19524811aA<List<? extends String>> abstractC19524811aA = new AbstractC19524811aA<List<? extends String>>(linkedHashMap2) { // from class: X.11a9
            public final Map<String, List<String>> LIZIZ;

            {
                super(linkedHashMap2);
                this.LIZIZ = linkedHashMap2;
            }

            @Override // X.AbstractC19524811aA
            public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
                Object objLJIIL = interfaceC19526611aS.LJIIL("tts_speaker_id_list");
                if (objLJIIL == null) {
                    objLJIIL = C13BV.INSTANCE;
                }
                this.LIZIZ.put("tts_speaker_id_list", (List<String>) objLJIIL);
            }
        };
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AbstractC19524811aA<String> abstractC19524811aA2 = new AbstractC19524811aA<String>(linkedHashMap3) { // from class: X.11aC
            public final Map<String, String> LIZIZ;

            {
                super(linkedHashMap3);
                this.LIZIZ = linkedHashMap3;
            }

            @Override // X.AbstractC19524811aA
            public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
                Object objLJIIL = interfaceC19526611aS.LJIIL("server_log_id");
                if (objLJIIL == null) {
                    objLJIIL = "";
                }
                this.LIZIZ.put("server_log_id", (String) objLJIIL);
                MusicModel musicModel = (MusicModel) interfaceC19526611aS.LJIIL("music_model");
                if (musicModel != null) {
                    this.LIZIZ.put("music_id", musicModel.getMusicId());
                }
            }
        };
        final LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        AbstractC19524811aA<Long> abstractC19524811aA3 = new AbstractC19524811aA<Long>(linkedHashMap4) { // from class: X.11aE
            public final Map<String, Long> LIZIZ;

            {
                super(linkedHashMap4);
                this.LIZIZ = linkedHashMap4;
            }

            @Override // X.AbstractC19524811aA
            public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
                long jLongValue5;
                long j = c19525911aL.LIZLLL - c19525911aL.LJ;
                Map<String, Long> map = this.LIZIZ;
                String str4 = c19525911aL.LIZ;
                Long l = map.get(str4);
                if (l != null) {
                    jLongValue5 = l.longValue();
                } else {
                    jLongValue5 = 0;
                }
                map.put(str4, Long.valueOf(Math.max(j, jLongValue5)));
                C19525911aL c19525911aLLJIJI = interfaceC19526611aS.LJIJI();
                if (c19525911aLLJIJI != null) {
                    this.LIZIZ.put(c19525911aLLJIJI.LIZ, Long.valueOf(System.currentTimeMillis() - c19525911aLLJIJI.LJ));
                }
            }
        };
        final LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        AbstractC19524811aA<JSONObject> abstractC19524811aA4 = new AbstractC19524811aA<JSONObject>(linkedHashMap5) { // from class: X.11a8
            public final Map<String, JSONObject> LIZIZ;

            {
                super(linkedHashMap5);
                this.LIZIZ = linkedHashMap5;
            }

            @Override // X.AbstractC19524811aA
            public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) throws JSONException {
                String str4;
                Map linkedHashMap6 = (Map) interfaceC19526611aS.LJIIL("fetch_voice_list_result");
                if (linkedHashMap6 == null) {
                    linkedHashMap6 = new LinkedHashMap();
                }
                JSONObject jSONObject = new JSONObject();
                Object obj = linkedHashMap6.get("all_effect_size");
                if (obj == null) {
                    obj = 0;
                }
                jSONObject.put("all_effect_size", String.valueOf(obj));
                if (C311110CHl.LIZ()) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("tts_v2", str4);
                String str5 = (String) linkedHashMap6.get("category_error_msg");
                if (str5 != null && C703302op.LIZ(str5)) {
                    jSONObject.put("category_error_msg", str5);
                    this.LIZIZ.put("fetch_voice_list_result", jSONObject);
                    return;
                }
                String str6 = (String) linkedHashMap6.get("category_key_list");
                if (str6 == null) {
                    str6 = "";
                }
                if (str6.length() > 0) {
                    jSONObject.put("category_key_list", str6);
                    for (String str7 : a0.LJJLIIIJILLIZJL(str6, new String[]{","}, 0, 6)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str7);
                        sbLIZ.append("error_msg");
                        String str8 = (String) linkedHashMap6.get(C2188811AlT.LIZIZ(sbLIZ));
                        if (str8 != null && C703302op.LIZ(str8)) {
                            jSONObject.put("fetch_voice_list_error_msg", str8);
                        }
                    }
                }
                this.LIZIZ.put("fetch_voice_list_result", jSONObject);
            }
        };
        arrayList.add(c19525511aH);
        arrayList.add(abstractC19524811aA);
        arrayList.add(abstractC19524811aA2);
        arrayList.add(abstractC19524811aA3);
        arrayList.add(abstractC19524811aA4);
        C19525311aF.LIZ(interfaceC19526511aR, arrayList);
        Iterable iterable = (Iterable) linkedHashMap2.get("tts_speaker_id_list");
        String str4 = (String) linkedHashMap3.get("server_log_id");
        String str5 = (String) linkedHashMap3.get("music_id");
        Object obj = linkedHashMap5.get("fetch_voice_list_result");
        C19525111aD c19525111aD = (C19525111aD) C13LP.LJJJLIIL(linkedHashMap.values());
        String strLJJLIIIJ = null;
        if (c19525111aD != null) {
            numValueOf = Integer.valueOf(c19525111aD.LIZ);
            str = c19525111aD.LIZIZ;
            str2 = c19525111aD.LIZJ;
            c11yj = c19525111aD.LJ;
            str3 = c19525111aD.LIZLLL;
        } else {
            numValueOf = null;
            str = null;
            str2 = null;
            c11yj = null;
            str3 = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (iterable != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62);
        }
        c2344009Gk.LJFF("speakerIdList", strLJJLIIIJ);
        if (z) {
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "");
        } else {
            c2344009Gk.LJ(numValueOf, "error_code");
            c2344009Gk.LJFF("error_msg", str);
            c2344009Gk.LJFF("error_extra", str3);
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -2006095252:
                        if (str2.equals("FetchTexts")) {
                            c2344009Gk.LJFF("error_phase", "fetch_text");
                        }
                        break;
                    case -1177792791:
                        if (str2.equals("FetchMusicList")) {
                            c2344009Gk.LJFF("error_phase", "fetch_music_list");
                        }
                        break;
                    case 309697203:
                        if (str2.equals("UploadVideoFrame")) {
                            c2344009Gk.LJFF("error_phase", "upload");
                        }
                        break;
                    case 439542137:
                        if (str2.equals("FetchTTSAudioFile")) {
                            c2344009Gk.LJFF("error_phase", "download_audio");
                        }
                        break;
                    case 814250589:
                        if (str2.equals("DownloadMusic")) {
                            c2344009Gk.LJFF("error_phase", "download_music");
                        }
                        break;
                    case 1707996022:
                        if (str2.equals("FetchVoiceList")) {
                            c2344009Gk.LJFF("error_phase", "fetch_voice_list");
                        }
                        break;
                }
            }
        }
        Long l = (Long) linkedHashMap4.get("UploadVideoFrame");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = (Long) linkedHashMap4.get("FetchTexts");
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long l3 = (Long) linkedHashMap4.get("FetchVoiceList");
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        Long l4 = (Long) linkedHashMap4.get("FetchTTSAudioFile");
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        c2344009Gk.LIZLLL(jLongValue2, "fetch_text_duration");
        c2344009Gk.LIZLLL(jLongValue, "upload_duration");
        c2344009Gk.LIZLLL(jLongValue3, "fetch_voice_list_duration");
        c2344009Gk.LIZLLL(jLongValue4, "download_audio_duration");
        long j = jLongValue + jLongValue2;
        c2344009Gk.LIZLLL(j, "upload_and_fetch_text_duration");
        c2344009Gk.LIZLLL(jLongValue4 + Math.max(j, jLongValue3), "total_duration");
        c2344009Gk.LIZJ(i, "video_duration");
        c2344009Gk.LJFF("fetch_text_log_id", str4);
        c2344009Gk.LJFF("extra", String.valueOf(obj));
        c2344009Gk.LJFF("meme_sound_music_id", str5);
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(numValueOf);
        c11yx.LIZJ(str);
        c11yx.LIZLLL(c11yj);
        c11yx.LJ("meme_audio_event");
        c11yx.LIZIZ = true;
        Map<String, String> map = c2344009Gk.LIZ;
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C19518711Yb.LIZIZ("meme_audio_event", map, c11yyLIZ);
    }
}
