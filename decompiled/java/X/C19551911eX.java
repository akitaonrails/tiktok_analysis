package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectTabApi;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectTabApiResponse;

/* JADX INFO: renamed from: X.11eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19551911eX {
    public static SoundEffectTabApiResponse LIZ(boolean z) {
        int i;
        SoundEffectTabApi.Api api = (SoundEffectTabApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, SoundEffectTabApi.Api.class);
        if (z) {
            i = 14;
        } else {
            i = 13;
        }
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LIZLLL = 30000L;
        c1493620oyG.LIZJ = 30000L;
        c1493620oyG.LJ = 30000L;
        return api.get(i, c1493620oyG).execute().LIZIZ;
    }
}
