package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eP7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087430eP7 {
    public static String LIZ = "";
    public static final Map<Long, Long> LIZIZ = new LinkedHashMap();
    public static final Map<Long, Long> LIZJ = new LinkedHashMap();

    public static void LIZJ(DataChannel dataChannel, String str) {
        boolean z;
        String str2;
        String str3;
        if (dataChannel != null && Intrinsics.LJFF(Boolean.TRUE, dataChannel.gg0(UserIsAnchorChannel.class))) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZ = C01C5.LIZ(dataChannel);
        if (z) {
            str2 = "anchor";
        } else if (zLIZ) {
            str2 = "admin";
        } else {
            str2 = "viewer";
        }
        if (Intrinsics.LJFF(str, "show")) {
            str3 = "livesdk_privilege_show_frame_check";
        } else {
            str3 = "livesdk_advanced_message_click_frame_check";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1087430eP7.LIZ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage):void");
    }

    public static void LIZIZ(EnumC1087450eP9 enumC1087450eP9, DataChannel dataChannel, PrivilegeAdvanceMessage privilegeAdvanceMessage, long j) {
        Long lValueOf;
        long id;
        long ownerUserId;
        boolean z;
        String str;
        Room room;
        Room room2;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        int[] iArr = C1087440eP8.LIZ;
        int i = iArr[enumC1087450eP9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l = (Long) ((LinkedHashMap) LIZJ).get(Long.valueOf(privilegeAdvanceMessage.getMessageId()));
                    if (l != null) {
                        jLongValue3 = l.longValue();
                    } else {
                        jLongValue3 = 0;
                    }
                    lValueOf = Long.valueOf(jCurrentTimeMillis - jLongValue3);
                } else {
                    throw new C1954807lC();
                }
            } else {
                long messageId = privilegeAdvanceMessage.getMessageId();
                Long lValueOf2 = Long.valueOf(messageId);
                Map<Long, Long> map = LIZJ;
                map.put(lValueOf2, Long.valueOf(System.currentTimeMillis()));
                Long l2 = (Long) ((LinkedHashMap) map).get(Long.valueOf(messageId));
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                Long l3 = (Long) ((LinkedHashMap) LIZIZ).get(Long.valueOf(messageId));
                if (l3 != null) {
                    jLongValue2 = l3.longValue();
                } else {
                    jLongValue2 = 0;
                }
                lValueOf = Long.valueOf(jLongValue - jLongValue2);
            }
        } else {
            LIZIZ.put(Long.valueOf(privilegeAdvanceMessage.getMessageId()), Long.valueOf(System.currentTimeMillis()));
            lValueOf = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LJFF(Scene.SCENE_SERVICE, privilegeAdvanceMessage.scene, jSONObject);
        if (lValueOf != null) {
            lValueOf.longValue();
            C0K04.LJ("event_duration", lValueOf.longValue(), jSONObject2);
        }
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        C0K04.LJ("room_id", id, jSONObject3);
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C0K04.LJ("creator_id", ownerUserId, jSONObject3);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C0K04.LJ("user_id", currentUserId, jSONObject3);
        if (ownerUserId == currentUserId) {
            z = true;
        } else {
            z = false;
        }
        C0K04.LIZLLL(Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE) ? 1 : 0, "is_creator", jSONObject3);
        C0K04.LJ("msg_id", privilegeAdvanceMessage.getMessageId(), jSONObject3);
        if (lValueOf != null) {
            lValueOf.longValue();
            C0K04.LJ("event_duration", lValueOf.longValue(), jSONObject3);
        }
        if (enumC1087450eP9 == EnumC1087450eP9.CLICK) {
            C0K04.LJ("display_duration", j, jSONObject3);
        }
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        int i2 = iArr[enumC1087450eP9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "ttlive_privilege_announcement_click";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "ttlive_privilege_announcement_show";
            }
        } else {
            str = "ttlive_privilege_announcement_receive";
        }
        C1CC2.LJ(str, jSONObject, jSONObject2, jSONObject4);
    }
}
