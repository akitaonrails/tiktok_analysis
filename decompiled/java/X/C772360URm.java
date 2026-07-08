package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0URm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C772360URm extends C2217421BqW implements Function1<C0UTQ, Map<String, String>> {
    public C772360URm(Object obj) {
        super(1, obj, C0UTP.class, "onCreateRoomDone", "onCreateRoomDone(Lcom/bytedance/android/livesdk/broadcast/utils/log/GoLiveEventData;)Ljava/util/Map;", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> invoke(X.C0UTQ r17) {
        /*
            r16 = this;
            r5 = r17
            X.0UTQ r5 = (X.C0UTQ) r5
            r0 = r16
            java.lang.Object r0 = r0.receiver
            r0.getClass()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = r5.LIZIZ
            java.lang.String r0 = "live_type"
            r3.put(r0, r1)
            int r0 = r5.LIZ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "resume_scene"
            r3.put(r0, r1)
            boolean r0 = r5.LIZJ
            java.lang.String r2 = "1"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L9d
            r1 = r2
        L2d:
            java.lang.String r0 = "is_try_mode"
            r3.put(r0, r1)
            boolean r0 = r5.LJ
            if (r0 != 0) goto L37
            r2 = r4
        L37:
            java.lang.String r0 = "is_smooth_golive"
            r3.put(r0, r2)
            int r0 = r5.LJI
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error_type"
            r3.put(r0, r1)
            long r0 = r5.LIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "t_go_live_start"
            r3.put(r0, r1)
            int r0 = r5.LJIIJ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "r_create_room_error_code"
            r3.put(r2, r0)
            java.lang.String r0 = r5.LJII
            int r0 = r0.length()
            r6 = 1
            if (r0 <= 0) goto L6d
            java.lang.String r1 = "room_id"
            java.lang.String r0 = r5.LJII
            r3.put(r1, r0)
        L6d:
            int r0 = r5.LIZ()
            r8 = 0
            if (r0 != r6) goto L89
            r6 = 0
        L77:
            r8 = r6
        L78:
            int r0 = r5.LJIIJ
            if (r0 != 0) goto L9f
            java.lang.String r1 = "t_create_room_success"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r3.put(r1, r0)
            r3.put(r2, r4)
            return r3
        L89:
            X.0UTP r0 = X.C0UTP.LIZ
            long r10 = r5.LIZ
            long r12 = r5.LJIIIIZZ
            long r14 = r5.LJIIIZ
            r0.getClass()
            long r6 = X.C0UTP.LIZ(r10, r12, r14)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L77
            goto L78
        L9d:
            r1 = r4
            goto L2d
        L9f:
            java.lang.String r1 = "t_create_room_fail"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r3.put(r1, r0)
            int r0 = r5.LJIIJ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C772360URm.invoke(java.lang.Object):java.lang.Object");
    }
}
