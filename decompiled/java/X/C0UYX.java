package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UYX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UYX extends C2217421BqW implements Function1<Boolean, Unit> {
    public C0UYX(Object obj) {
        super(1, obj, C774580Ua0.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        Room room;
        InterfaceC769940UIe interfaceC769940UIe;
        Room room2;
        InterfaceC769940UIe interfaceC769940UIe2;
        boolean zBooleanValue = bool.booleanValue();
        C774580Ua0 c774580Ua0 = (C774580Ua0) this.receiver;
        if (zBooleanValue) {
            c774580Ua0.getClass();
            c774580Ua0.LIZIZ(CertProviderManagerKt.findCert("bpea-782", 1476788483), true, false, null);
            DataChannel dataChannel = c774580Ua0.LIZ;
            if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && room2.getIdStr() != null && (interfaceC769940UIe2 = c774580Ua0.LIZIZ) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("live_pause", 1);
                interfaceC769940UIe2.LIZ("live_pause_sei", "1610665992", jSONObject, false);
            }
            C0UZ9 c0uz9 = c774580Ua0.LIZJ;
            if (c0uz9 != null) {
                c0uz9.LIZLLL(1);
            }
        } else {
            InterfaceC769940UIe interfaceC769940UIe3 = c774580Ua0.LIZIZ;
            if (interfaceC769940UIe3 != null) {
                interfaceC769940UIe3.P3(CertProviderManagerKt.findCert("bpea-781", 1476788233), false);
            }
            DataChannel dataChannel2 = c774580Ua0.LIZ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && room.getIdStr() != null && (interfaceC769940UIe = c774580Ua0.LIZIZ) != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("live_pause", 0);
                interfaceC769940UIe.LIZ("live_pause_sei", "1610665992", jSONObject2, false);
            }
            C0UZ9 c0uz92 = c774580Ua0.LIZJ;
            if (c0uz92 != null) {
                c0uz92.LJ(1);
            }
        }
        return Unit.LIZ;
    }
}
