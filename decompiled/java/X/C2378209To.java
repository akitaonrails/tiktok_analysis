package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneTTSApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2378209To {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C2501609rC c2501609rC = new C2501609rC(c23260099m, 9);
        VoiceCloneTTSApi.Api api = (VoiceCloneTTSApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit("https://sami-va.tiktokv.com", true, VoiceCloneTTSApi.Api.class);
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LJIIIZ = true;
        n nVar = new n();
        nVar.LJJIIJ("speaker_id", str);
        n nVar2 = new n();
        nVar2.LJJIIJ("arguments", nVar.toString());
        nVar2.LJJIIJ("apiName", "GetLokiInfoFromSpeakerId");
        n nVar3 = new n();
        nVar3.LJJIIJ("payload", nVar2.toString());
        api.getLokiInfoFromSpeakerId("BGJqbgQOfj", "VopBuild", nVar3, c1493620oyG).enqueue(c2501609rC);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static void LIZIZ(String str, InterfaceC2376809Ta interfaceC2376809Ta) {
        String nickname;
        UrlModel iconUrl;
        List<String> arrayList;
        com.ss.android.ugc.aweme.base.model.UrlModel avatarThumb;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        String uid;
        String nickname2;
        String uid2;
        TTSSpeakerInfo tTSSpeakerInfo = new TTSSpeakerInfo(str, null, "private", "completed");
        Effect effect = tTSSpeakerInfo.LIZIZ;
        if (effect != null) {
            JSONObject jSONObject = new JSONObject();
            if (u.LJJIIJZLJL(str.toLowerCase(Locale.ROOT), "vop", false)) {
                jSONObject.put("is_voice_clone", true);
            } else {
                jSONObject.put("is_voice_clone", false);
            }
            jSONObject.put("is_instant_clone", true);
            jSONObject.put("from_tag", "instant clone");
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser == null || (uid2 = currentUser.getUid()) == null) {
                uid2 = "";
            }
            jSONObject.put("creator_user_id", uid2);
            effect.setExtra(C786410Ut5.J3(jSONObject));
        }
        Effect effect2 = tTSSpeakerInfo.LIZIZ;
        if (effect2 != null) {
            effect2.setEffect_id("instant_clone_private_local");
        }
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = tTSSpeakerInfo.LIZ;
        if (readTextEffectSpeakerExtra2 != null) {
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser2 == null || (nickname2 = currentUser2.getNickname()) == null) {
                nickname2 = "";
            }
            readTextEffectSpeakerExtra2.speakerName = nickname2;
        }
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra3 = tTSSpeakerInfo.LIZ;
        if (readTextEffectSpeakerExtra3 != null) {
            readTextEffectSpeakerExtra3.speakreID = str;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser3 == null || (uid = currentUser3.getUid()) == null) {
                uid = "";
            }
            readTextEffectSpeakerExtra3.voiceCreatorUserId = uid;
        }
        if (C11VR.LIZIZ().enableStreamTTS == 1 && (readTextEffectSpeakerExtra = tTSSpeakerInfo.LIZ) != null) {
            readTextEffectSpeakerExtra.streamTTSSpkID = str;
        }
        Effect effect3 = tTSSpeakerInfo.LIZIZ;
        if (effect3 != null && (iconUrl = effect3.getIconUrl()) != null) {
            C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser4 == null || (avatarThumb = currentUser4.getAvatarThumb()) == null || (arrayList = avatarThumb.getUrlList()) == null) {
                arrayList = new ArrayList<>();
            }
            iconUrl.setUrlList(arrayList);
        }
        Effect effect4 = tTSSpeakerInfo.LIZIZ;
        if (effect4 != null) {
            C19292410dm currentUser5 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser5 == null || (nickname = currentUser5.getNickname()) == null) {
                nickname = "";
            }
            effect4.setName(nickname);
        }
        interfaceC2376809Ta.LIZ(tTSSpeakerInfo, 0, "");
    }

    public static Object LIZJ(InterfaceC1635390sev interfaceC1635390sev, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (str.length() == 0) {
            C443120HZe c443120HZe = new C443120HZe(null, C2286608xc.LJ(102), "effect id is null");
            C189200o6.m2constructorimpl(c443120HZe);
            c23260099m.resumeWith(c443120HZe);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel", "speaking-voice");
            interfaceC1635390sev.LIZIZ(str, linkedHashMap, new C1768206wC(c23260099m, 2));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
