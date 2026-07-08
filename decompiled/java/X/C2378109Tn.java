package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneTTSApi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2378109Tn extends AbstractC2255721DQs<InterfaceC19469111Ez> implements InterfaceC19469111Ez, InterfaceC379610EuV {
    public final C1DRG LL;
    public final InterfaceC19469111Ez LLILLJJLI = this;

    public InterfaceC19469111Ez W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C2378109Tn(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC19469111Ez
    public void SE0(VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean) {
        C19418810yA.LIZIZ.LIZ(C1664590tQ1.LJIIIZ(this), "voice_panel");
    }

    @Override // X.InterfaceC19469111Ez
    public void m60(final InterfaceC1635390sev interfaceC1635390sev, final InterfaceC2376809Ta interfaceC2376809Ta) {
        String uid;
        final Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        InterfaceC2376809Ta interfaceC2376809Ta2 = new InterfaceC2376809Ta() { // from class: X.09Tc
            @Override // X.InterfaceC2376809Ta
            public final void LIZ(TTSSpeakerInfo tTSSpeakerInfo, int i, String str) {
                UrlModel iconUrl;
                List<String> arrayList;
                com.ss.android.ugc.aweme.base.model.UrlModel avatarThumb;
                if (tTSSpeakerInfo != null && tTSSpeakerInfo.LIZ() && !tTSSpeakerInfo.LIZIZ()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2376909Tb(tTSSpeakerInfo, interfaceC2376809Ta, interfaceC1635390sev, i, str, contextLJIIIZ, null), 3);
                    return;
                }
                if (tTSSpeakerInfo != null) {
                    Effect effect = tTSSpeakerInfo.LIZIZ;
                    if (effect != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("is_voice_clone", true);
                        effect.setExtra(C786410Ut5.J3(jSONObject));
                    }
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = tTSSpeakerInfo.LIZ;
                    if (readTextEffectSpeakerExtra != null) {
                        readTextEffectSpeakerExtra.speakerName = contextLJIIIZ.getString(2131858294);
                    }
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = tTSSpeakerInfo.LIZ;
                    if (readTextEffectSpeakerExtra2 != null) {
                        String str2 = tTSSpeakerInfo.speakerId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        readTextEffectSpeakerExtra2.speakreID = str2;
                    }
                    Effect effect2 = tTSSpeakerInfo.LIZIZ;
                    if (effect2 != null && (iconUrl = effect2.getIconUrl()) != null) {
                        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                        if (currentUser == null || (avatarThumb = currentUser.getAvatarThumb()) == null || (arrayList = avatarThumb.getUrlList()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        iconUrl.setUrlList(arrayList);
                    }
                }
                interfaceC2376809Ta.LIZ(tTSSpeakerInfo, i, str);
                if (tTSSpeakerInfo == null || !tTSSpeakerInfo.LIZ() || !tTSSpeakerInfo.LIZIZ()) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2374209Sa("hello", tTSSpeakerInfo.speakerId, true, null), 3);
            }
        };
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "";
        }
        if (uid.length() == 0) {
            interfaceC2376809Ta2.LIZ(null, 103, "GetSpeakerInfoFromUid: uid is null");
            return;
        }
        C2501609rC c2501609rC = new C2501609rC(interfaceC2376809Ta2, 10);
        VoiceCloneTTSApi.Api api = (VoiceCloneTTSApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit("https://sami-va.tiktokv.com", true, VoiceCloneTTSApi.Api.class);
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LJIIIZ = true;
        n nVar = new n();
        nVar.LJJIIJ("locale", "jp");
        nVar.LJJIIJ("uid", uid);
        nVar.LJJIII(1, "filter_text_content");
        n nVar2 = new n();
        nVar2.LJJIIJ("arguments", nVar.toString());
        nVar2.LJJIIJ("apiName", "GetSpeakerInfoFromUid");
        n nVar3 = new n();
        nVar3.LJJIIJ("payload", nVar2.toString());
        api.getSpeakerInfoFromUid("BGJqbgQOfj", "VopBuild", nVar3, c1493620oyG).enqueue(c2501609rC);
    }

    @Override // X.InterfaceC19469111Ez
    public void C20(String str, String str2, String str3, InterfaceC2376809Ta interfaceC2376809Ta) {
        C2378209To.LIZIZ(str2, interfaceC2376809Ta);
    }
}
