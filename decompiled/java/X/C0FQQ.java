package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQQ {
    public static final C0FQQ LIZ = new C0FQQ();
    public static String LIZIZ = "";

    public static final void LIZ(String str, Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mob: eventName=");
        sbLIZ.append(str);
        sbLIZ.append(", eventMap=");
        sbLIZ.append(map);
        C201955140j.LIZIZ("Template_Mob", String.valueOf(C2188811AlT.LIZIZ(sbLIZ)));
        C20684815ws.LJIILLIIL(str, map);
    }

    public static final void LIZLLL(String str, String str2, Integer num, String str3, long j, String str4, int i, int i2, String str5, String str6, Map<String, String> map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_task_name", str);
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i2, "error_code");
        c0lab.LJ("error_msg", str5);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZLLL(num, "template_type");
        c0lab.LJ("template_id", str2);
        c0lab.LJ("resource_id", str4);
        c0lab.LJ("shoot_way", str6);
        c0lab.LJ("consume_scene", str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                    c0lab.LJ(entry.getKey(), entry.getValue());
                }
            }
        }
        LIZ("magic_consume", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[PHI: r4
      0x00e8: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v7 java.lang.String), (r4v7 java.lang.String), (r4v7 java.lang.String) binds: [B:18:0x008c, B:20:0x0095, B:22:0x009b, B:24:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r3, java.lang.String r4, java.lang.Integer r5, long r6, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.Map<java.lang.String, java.lang.String> r10, int r11, int r12, java.lang.String r13, int r14, java.lang.String r15, int r16) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FQQ.LIZIZ(java.lang.String, java.lang.String, java.lang.Integer, long, java.util.List, java.util.List, java.util.Map, int, int, java.lang.String, int, java.lang.String, int):void");
    }
}
