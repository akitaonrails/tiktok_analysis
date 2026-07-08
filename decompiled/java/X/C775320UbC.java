package X;

import com.bytedance.android.livesdk.broadcast.harmodel.LiveReportTnsApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastHarModelForDrivingSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0UbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775320UbC implements C157X {
    public static final C775320UbC LIZ = new C775320UbC();
    public static volatile boolean LIZIZ;

    @Override // X.C157X
    public final void LIZ(int i, boolean z, Map map) {
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("LiveHarModelForDrivingHelper", C2188811AlT.LIZIZ(sbLIZ));
        C157W.LIZ();
        C157U c157u = C157U.LIZ;
        C157U.LJIIIZ(this);
        if (z && i == 1) {
            HashMap map2 = new HashMap();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            map2.put("room_id", Long.valueOf(id));
            map2.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            map2.put("model_name", "live_driving_recog_har");
            map2.put("model_score", 1);
            map2.put("model_threshold", 0);
            map2.put("data_type", 1);
            C480460Ism.LIZ().getClass();
            AbstractC19484711Kz<C470590Icr<Object>> abstractC19484711KzUploadSexualSignal = ((LiveReportTnsApi) C480460Ism.LIZLLL(LiveReportTnsApi.class)).uploadSexualSignal(map2, new MultipartTypedOutput());
            if (abstractC19484711KzUploadSexualSignal != null) {
                abstractC19484711KzUploadSexualSignal.LJJIIJ();
            }
        }
        if (LIZIZ) {
            return;
        }
        C486790J7d.LIZLLL(RunnableC775330UbD.LL, null, LiveBroadcastHarModelForDrivingSetting.INSTANCE.getValue().periodTime);
    }
}
