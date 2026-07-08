package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YC7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YC7 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C0YEM LIZ;
    public final HashMap<Long, Object> LIZIZ = new HashMap<>();

    public C0YC7(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045 A[PHI: r9
      0x0045: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:33:0x0043, B:31:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[PHI: r6
      0x006a: PHI (r6v1 long) = (r6v0 long), (r6v3 long), (r6v3 long), (r6v3 long), (r6v3 long) binds: [B:40:0x0067, B:14:0x001c, B:16:0x0020, B:18:0x0024, B:20:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0Y82 r22, X.C0Y72 r23, com.bytedance.im.core.proto.Response r24, int r25) {
        /*
            r21 = this;
            java.lang.String r5 = ""
            r1 = r24
            if (r1 == 0) goto L65
            com.bytedance.im.core.proto.ResponseBody r0 = r1.body
            if (r0 == 0) goto L65
            com.bytedance.im.core.proto.NewMessageNotify r0 = r0.has_new_message_notify
            if (r0 == 0) goto L65
            com.bytedance.im.core.proto.MessageBody r0 = r0.message
            if (r0 == 0) goto L65
            java.lang.Long r0 = r0.server_message_id
            if (r0 == 0) goto L65
            long r6 = r0.longValue()
        L1a:
            com.bytedance.im.core.proto.ResponseBody r0 = r1.body
            if (r0 == 0) goto L6a
            com.bytedance.im.core.proto.NewMessageNotify r0 = r0.has_new_message_notify
            if (r0 == 0) goto L6a
            com.bytedance.im.core.proto.MessageBody r0 = r0.message
            if (r0 == 0) goto L6a
            java.lang.Integer r0 = r0.message_type
            if (r0 == 0) goto L6a
            int r8 = r0.intValue()
        L2e:
            java.lang.String r10 = ""
            if (r1 == 0) goto L42
            com.bytedance.im.core.proto.ResponseBody r0 = r1.body
            if (r0 == 0) goto L42
            com.bytedance.im.core.proto.NewMessageNotify r0 = r0.has_new_message_notify
            if (r0 == 0) goto L42
            com.bytedance.im.core.proto.MessageBody r0 = r0.message
            if (r0 == 0) goto L42
            java.lang.String r9 = r0.conversation_id
            if (r9 != 0) goto L45
        L42:
            r9 = r10
            if (r1 == 0) goto L4a
        L45:
            java.lang.String r0 = r1.log_id
            if (r0 == 0) goto L4a
            r10 = r0
        L4a:
            java.lang.String r11 = "ws"
            X.0Y7G r15 = X.C0Y7G.INVALID_MSG
            r16 = 0
            java.lang.String r17 = ""
            r18 = 0
            r1 = -1
            r12 = r25
            r14 = r23
            r13 = r22
            r0 = r21
            r3 = r1
            r20 = r16
            r0.LIZLLL(r1, r3, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            return
        L65:
            r6 = 0
            if (r1 == 0) goto L6a
            goto L1a
        L6a:
            r8 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YC7.LIZ(X.0Y82, X.0Y72, com.bytedance.im.core.proto.Response, int):void");
    }

    public final void LIZJ(long j, long j2, String str, long j3, int i, String str2, String str3, String str4, int i2, C0Y82 c0y82, C0Y72 c0y72, C0Y7G c0y7g, boolean z) {
        LIZLLL(j, j2, str, j3, i, str2, str3, str4, i2, c0y82, c0y72, c0y7g, z, "", 0L, false);
    }

    public final void LIZLLL(long j, long j2, String str, long j3, int i, String str2, String str3, String str4, int i2, C0Y82 c0y82, C0Y72 c0y72, C0Y7G c0y7g, boolean z, String str5, long j4, boolean z2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("imsdk_load_msg");
        c0yj9.LIZ(str2, "conversation_id");
        if (str == null) {
            str = "";
        }
        c0yj9.LIZ(str, "msg_uuid");
        c0yj9.LIZ(Long.valueOf(j3), "msg_svr_id");
        c0yj9.LIZ(1, "result");
        c0yj9.LIZ(Integer.valueOf(i), "msg_type");
        c0yj9.LIZ(Boolean.valueOf(this.LIZ.LJ().LJ().isAppBackground()), "is_background");
        c0yj9.LIZ(Boolean.valueOf(this.LIZ.LJ().LIZ().LIZIZ()), "net_connected");
        c0yj9.LIZ(Boolean.valueOf(this.LIZ.LJ().LIZ().isWsConnected()), "is_ws_connected");
        c0yj9.LIZ(Long.valueOf(j), "load_cost_time");
        c0yj9.LIZ(Long.valueOf(j2), "total_cost_time");
        c0yj9.LIZ(str3, "logid");
        c0yj9.LIZ(str4, "received_from");
        c0yj9.LIZ(c0y7g.name(), "process_result");
        c0yj9.LIZ(Boolean.valueOf(z), "is_new");
        c0yj9.LIZ(Integer.valueOf(i2), "inbox");
        C870460YCu c870460YCuLIZ = this.LIZ.LJIIZILJ().LJFF().LIZ();
        c0yj9.LIZ(Boolean.valueOf(Boolean.TRUE.equals(((ConcurrentHashMap) c870460YCuLIZ.LIZIZ).get(Integer.valueOf(i2)))), "has_done_first_pull");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - this.LIZ.LJIILIIL().LJI), "init_cost_time");
        c0yj9.LIZ(Integer.valueOf(c0y82.getValue()), "chain_type");
        c0yj9.LIZ(c0y72.LIZ, "error_code");
        c0yj9.LIZ(c0y72.LIZIZ, "error_msg");
        c0yj9.LIZ(Long.valueOf(j4), "total_retry_queue_time");
        c0yj9.LIZ(Long.valueOf(System.currentTimeMillis()), "receive_time");
        c0yj9.LIZ(Boolean.valueOf(z2), "is_cmd_msg");
        Map<String, String> mapLJIIIIZZ = this.LIZ.LJ().getEvent().LJIIIIZZ("imsdk_load_msg");
        if (mapLJIIIIZZ != null && !mapLJIIIIZZ.isEmpty()) {
            c0yj9.LIZIZ(mapLJIIIIZZ);
        }
        if (str5.length() > 0) {
            c0yj9.LIZ(str5, "biz_scene");
        }
        c0yj9.LIZLLL();
        this.LIZIZ.remove(Long.valueOf(j3));
    }
}
