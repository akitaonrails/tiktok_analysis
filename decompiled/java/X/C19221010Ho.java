package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.services.edit.MusicStripResultConfirmRequest;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrack;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19221010Ho {
    public static final /* synthetic */ C19221010Ho LIZ = new C19221010Ho();
    public static final C01GW<InterfaceC19221110Hp> LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(416));

    public static Object LIZ(MusicStripResultConfirmRequest musicStripResultConfirmRequest, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson();
        return LIZIZ.getValue().LIZIZ(musicStripResultConfirmRequest.itemId, musicStripResultConfirmRequest.userId, musicStripResultConfirmRequest.isApplyStripResult(), musicStripResultConfirmRequest.editReqId, interfaceC1364105Vn);
    }

    public static Object LIZIZ(StripMusicRequest stripMusicRequest, InterfaceC1364105Vn interfaceC1364105Vn) {
        String json;
        String json2;
        Gson retrofitFactoryGson = C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson();
        InterfaceC19221110Hp value = LIZIZ.getValue();
        String itemID = stripMusicRequest.getItemID();
        String originalVid = stripMusicRequest.getOriginalVid();
        OriginalAudioTrack originalAudioTrack = stripMusicRequest.getOriginalAudioTrack();
        if (originalAudioTrack != null) {
            json = GsonProtectorUtils.toJson(retrofitFactoryGson, originalAudioTrack);
        } else {
            json = null;
        }
        if (stripMusicRequest.getMultiMusicEditInfo() != null) {
            json2 = GsonProtectorUtils.toJson(retrofitFactoryGson, stripMusicRequest.getMultiMusicEditInfo());
        } else {
            json2 = null;
        }
        return value.LIZ(itemID, originalVid, null, json, json2, stripMusicRequest.getMusicEditScene(), stripMusicRequest.getExtra(), stripMusicRequest.getVersion(), interfaceC1364105Vn);
    }
}
