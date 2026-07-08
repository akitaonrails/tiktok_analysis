package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00n4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C182800n4 {
    public static Long LIZ;
    public static Long LIZIZ;

    public static final void LIZ(long j, DataChannel dataChannel) {
        Long lValueOf;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWidgetOnLoad cur(");
        sbLIZ.append(LIZ);
        sbLIZ.append(") new(");
        sbLIZ.append(j);
        sbLIZ.append(" roomId(");
        sbLIZ.append(lValueOf);
        sbLIZ.append("))");
        C20441214yg.LIZIZ("GiftWidgetInstanceMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZ != null) {
            C20441214yg.LJ("GiftWidgetInstanceMonitor", "detect existing instance!");
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("type", "gift_widget_onload_error");
                jSONObject2.put("existingWidgetHashcode", LIZ);
                jSONObject2.put("existingRoomId", LIZIZ);
                jSONObject2.put("onloadHashcode", j);
                jSONObject2.put("onloadRoomId", lValueOf);
                C1CC2.LJ("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZ = Long.valueOf(j);
        LIZIZ = lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_component_onload");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C1135800ff8.LJJII() ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_component_onload", new JSONObject(), new JSONObject(), new JSONObject());
    }

    public static final void LIZIZ(long j, DataChannel dataChannel) throws JSONException {
        Long lValueOf;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWidgetUnLoad cur(");
        sbLIZ.append(LIZ);
        sbLIZ.append(") un(");
        sbLIZ.append(j);
        sbLIZ.append(" roomId(");
        sbLIZ.append(lValueOf);
        sbLIZ.append("))");
        C20441214yg.LIZIZ("GiftWidgetInstanceMonitor", C2188811AlT.LIZIZ(sbLIZ));
        Long l = LIZ;
        if (l == null || l.longValue() != j) {
            C20441214yg.LJ("GiftWidgetInstanceMonitor", "detect unload not match!");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("type", "gift_widget_unload_error");
            jSONObject2.put("existingWidgetHashcode", LIZ);
            jSONObject2.put("existingRoomId", LIZIZ);
            jSONObject2.put("onloadHashcode", j);
            jSONObject2.put("onloadRoomId", lValueOf);
            C1CC2.LJ("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
        }
        LIZ = null;
        LIZIZ = null;
    }
}
