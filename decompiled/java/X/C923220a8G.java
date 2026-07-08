package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0a8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923220a8G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, Integer num, String str2) {
        if (i <= 0) {
            return;
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (str2 != null) {
            map.put("enter_from", str2);
        }
        map.put("viewer_cnt", String.valueOf(i));
        map.put("show_time", str);
        C0KX4.LIZ("livesdk_anchor_guest_connection_viewers_list_invite_list_show", map, null, true);
        C924950aB3.LIZJ("room_viewer", i, null, num, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r22, java.lang.String r23, int r24, java.util.List r25, java.util.List r26, java.lang.String r27, java.lang.String r28, boolean r29, int r30, java.lang.Integer r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923220a8G.LIZIZ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, java.lang.String, int, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, int, java.lang.Integer, java.lang.String):void");
    }
}
