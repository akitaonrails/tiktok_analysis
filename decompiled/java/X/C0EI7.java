package X;

import android.app.Activity;
import android.text.SpannableString;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EI7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(NLETrackSlot nLETrackSlot) {
        String extra;
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("text_tts_id") || !nLETrackSlot.hasExtra("ep_text_tts_speaker_id") || !nLETrackSlot.hasExtra("tts_effect_extra") || (extra = nLETrackSlot.getExtra("tts_effect_extra")) == null || extra.length() == 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(extra);
            boolean zOptBoolean = jSONObject.optBoolean("is_voice_clone");
            boolean zOptBoolean2 = jSONObject.optBoolean("is_instant_clone");
            if (!zOptBoolean && !zOptBoolean2) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        StickerNewEngineModel stickerNewEngineModel;
        List<TextStickerModel> list;
        Map<String, String> map;
        if (videoPublishEditModel != null) {
            try {
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel != null && (stickerNewEngineModel = creativeModel.stickerModel) != null && (list = stickerNewEngineModel.textStickerModels) != null) {
                    Iterator<TextStickerModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        TTSModel ttsModel = it2.next().getTtsModel();
                        if (ttsModel != null && (map = ttsModel.ttsExtraMap) != null) {
                            if ((map.containsKey("is_instant_clone") && Intrinsics.LJFF(map.get("is_instant_clone"), "1")) || Intrinsics.LJFF(map.get("is_instant_clone"), "true")) {
                                return true;
                            }
                            if ((map.containsKey("is_voice_clone") && Intrinsics.LJFF(map.get("is_voice_clone"), "1")) || Intrinsics.LJFF(map.get("is_voice_clone"), "true")) {
                                return true;
                            }
                        }
                    }
                }
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (nLEModel == null) {
            return false;
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (C351220Dpo.LLLJL(nLETrack)) {
                Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
                while (it3.hasNext()) {
                    if (LIZ(it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZLLL(int i, Activity activity) {
        String string;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    string = activity.getString(2131858330);
                } else {
                    string = activity.getString(2131858329);
                }
            } else {
                string = activity.getString(2131858327);
            }
        } else {
            string = activity.getString(2131858326);
        }
        C1389880mGw c1389880mGw = new C1389880mGw(activity);
        c1389880mGw.LJIIIZ(string);
        c1389880mGw.LJIIJ();
    }

    public static C361980EHc LIZJ(TTSSpeakerInfo tTSSpeakerInfo, C19EG c19eg, String str) {
        CharSequence string;
        if (tTSSpeakerInfo.LIZ()) {
            string = c19eg.getString(2131820776);
            if (tTSSpeakerInfo.LIZIZ()) {
                string = new SpannableString(string);
            }
        } else {
            string = c19eg.getString(2131858351);
        }
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = string;
        c361970EHb.LJ = "bottom_item_sound_voice_clone";
        c361970EHb.LJIIIIZZ = str;
        c361970EHb.LIZLLL = new AwS549S0100000_5(c19eg, 421);
        return c361970EHb.LIZ();
    }
}
