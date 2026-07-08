package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api;

/* JADX INFO: renamed from: X.09SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SZ {
    public static String LIZIZ(boolean z) {
        return z ? "Vop" : "TTS";
    }

    public static TextToSpeechApi.FetchTextAudioResponse LIZ(Integer num, String str, String str2, String str3) {
        int iIntValue;
        ReadTextV2Api.Api api = (ReadTextV2Api.Api) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, ReadTextV2Api.Api.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LIZLLL = 30000L;
        c1493620oyG.LIZJ = 30000L;
        c1493620oyG.LJ = 30000L;
        return api.get(str, str2, iIntValue, str3, c1493620oyG).execute().LIZIZ;
    }
}
