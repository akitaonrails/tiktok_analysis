package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrack;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;

/* JADX INFO: renamed from: X.10Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19220810Hm {
    public static MusicEditResponse LIZ(ReplaceMusicRequest replaceMusicRequest) {
        String json;
        int iIntValue;
        InterfaceC19220910Hn interfaceC19220910Hn = (InterfaceC19220910Hn) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, InterfaceC19220910Hn.class);
        String itemID = replaceMusicRequest.getItemID();
        String originalVid = replaceMusicRequest.getOriginalVid();
        String json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), replaceMusicRequest.getEditMusicStruct());
        Integer voiceVolume = replaceMusicRequest.getVoiceVolume();
        if (voiceVolume != null && (iIntValue = voiceVolume.intValue()) > 0) {
            json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), new OriginalAudioTrack(iIntValue, null, null, null, null));
        } else {
            json = null;
        }
        return interfaceC19220910Hn.LIZ(itemID, originalVid, json2, json).execute().LIZIZ;
    }
}
