package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131140fXc {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZIZ(InterfaceC1131100fXY interfaceC1131100fXY) {
        C1132120fZC c1132120fZC;
        if (interfaceC1131100fXY != null) {
            C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
            if (c1126160fPaLJJLIIIJJIZ != null && (c1132120fZC = c1126160fPaLJJLIIIJJIZ.LIZJ) != null) {
                return c1132120fZC.LJ;
            }
            return interfaceC1131100fXY.LJZ();
        }
        return 0;
    }

    public static final int LIZJ(InterfaceC1131100fXY interfaceC1131100fXY) {
        C1132120fZC c1132120fZC;
        if (interfaceC1131100fXY != null) {
            C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
            if (c1126160fPaLJJLIIIJJIZ != null && (c1132120fZC = c1126160fPaLJJLIIIJJIZ.LIZJ) != null) {
                return c1132120fZC.LIZ;
            }
            return interfaceC1131100fXY.LJLJL();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r18, X.InterfaceC1131100fXY r19) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131140fXc.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, X.0fXY):void");
    }

    public static boolean LIZ(InterfaceC1131100fXY interfaceC1131100fXY, Room room, DataChannel dataChannel, String str, String str2, String str3, boolean z, boolean z2) throws JSONException {
        String string;
        String string2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String string3;
        Room room2;
        Room room3;
        String string4;
        C20441214yg.LIZIZ("SendGiftHelper", "checkingRoomId");
        String str4 = "";
        Long lValueOf4 = null;
        if (Intrinsics.LJFF(str, "")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
            if (c1132880faQLIZJ != null && (string4 = Long.valueOf(c1132880faQLIZJ.LIZ).toString()) != null) {
                str4 = string4;
            }
            jSONObject2.put("event_to_user", str4);
            Room roomLIZ = interfaceC1131100fXY.LIZ();
            if (roomLIZ != null) {
                lValueOf4 = Long.valueOf(roomLIZ.getId());
            }
            jSONObject2.put("event_room", lValueOf4);
            jSONObject2.put("room_source", str2);
            jSONObject.put("room_source", str2);
            jSONObject.put("type", "room_invalid");
            C1CC2.LJ("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
            return false;
        }
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        if (!Intrinsics.LJFF(string, str)) {
            C20441214yg.LJ("SendGiftHelper", "toRoomIdCheckBlock toRoomId not current room!");
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("room_source", str2);
            C1132880faQ c1132880faQLIZJ2 = interfaceC1131100fXY.LIZJ();
            if (c1132880faQLIZJ2 == null || (string2 = Long.valueOf(c1132880faQLIZJ2.LIZ).toString()) == null) {
                string2 = "";
            }
            jSONObject4.put("event_to_user", string2);
            jSONObject4.put("current_anchor", str3);
            Room roomLIZ2 = interfaceC1131100fXY.LIZ();
            if (roomLIZ2 != null) {
                lValueOf = Long.valueOf(roomLIZ2.getId());
            } else {
                lValueOf = null;
            }
            jSONObject4.put("event_room", lValueOf);
            jSONObject4.put("current_room", str);
            if (dataChannel != null && (room3 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                lValueOf2 = Long.valueOf(room3.getId());
            } else {
                lValueOf2 = null;
            }
            jSONObject4.put("datachannel_room", lValueOf2);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
            if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null) {
                lValueOf3 = Long.valueOf(room2.getId());
            } else {
                lValueOf3 = null;
            }
            jSONObject4.put("global_room", lValueOf3);
            Room room4 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room4 != null) {
                lValueOf4 = Long.valueOf(room4.getId());
            }
            jSONObject4.put("global_current_room", lValueOf4);
            jSONObject3.put("room_source", str2);
            jSONObject3.put("type", "room_not_current");
            C1CC2.LJ("gift_core_monitor", jSONObject3, new JSONObject(), jSONObject4);
            if (z) {
                return true;
            }
            C1132880faQ c1132880faQLIZJ3 = interfaceC1131100fXY.LIZJ();
            if (c1132880faQLIZJ3 != null && (string3 = Long.valueOf(c1132880faQLIZJ3.LIZ).toString()) != null) {
                str4 = string3;
            }
            if (Intrinsics.LJFF(str4, str3)) {
                jSONObject3.put("type", "room_not_current_anchor_current");
                C1CC2.LJ("gift_core_monitor", jSONObject3, new JSONObject(), jSONObject4);
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
