package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectCollectionApi;

/* JADX INFO: renamed from: X.11eW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19551811eW {
    public static BaseNetResponse LIZ(String str, boolean z) {
        String str2;
        SoundEffectCollectionApi.Api api = (SoundEffectCollectionApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, SoundEffectCollectionApi.Api.class);
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LIZLLL = 30000L;
        c1493620oyG.LIZJ = 30000L;
        c1493620oyG.LJ = 30000L;
        return api.get(str, str2, c1493620oyG).execute().LIZIZ;
    }
}
