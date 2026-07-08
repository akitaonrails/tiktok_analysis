package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784830UqX {
    public static C0UC1 LIZ;
    public static C784840UqY LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[PHI: r10
      0x004b: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:10:0x0011, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0UC1 LIZ(com.bytedance.android.livesdk.model.Board r15) {
        /*
            X.0UC1 r3 = new X.0UC1
            X.0UqY r0 = X.C784830UqX.LIZIZ
            if (r0 == 0) goto L4e
            long r4 = r0.LIZ
        L8:
            java.lang.String r12 = ""
            if (r0 == 0) goto L10
            java.lang.String r10 = r0.LIZIZ
            if (r10 != 0) goto L4b
        L10:
            r10 = r12
            if (r0 != 0) goto L4b
            r11 = 0
        L14:
            if (r0 == 0) goto L18
            java.lang.String r12 = "tiktok_live_boards"
        L18:
            long r6 = r15.id
            long r8 = X.C158B.LIZ()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r8 = r8 / r0
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "{\"boardID\":"
            r2.append(r0)
            long r0 = r15.id
            r2.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r13 = X.C2188811AlT.LIZIZ(r2)
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            java.lang.String r14 = r0.getBroadcastScene()
            java.lang.String r15 = r15.previewImageUri
            r3.<init>(r4, r6, r8, r10, r11, r12, r13, r14, r15)
            return r3
        L4b:
            java.lang.String r11 = r0.LIZJ
            goto L14
        L4e:
            r4 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784830UqX.LIZ(com.bytedance.android.livesdk.model.Board):X.0UC1");
    }

    public static void LIZIZ(LiveEffect liveEffect) {
        C784840UqY c784840UqY = LIZIZ;
        if (c784840UqY != null && c784840UqY.LIZ == liveEffect.getEffectId()) {
            return;
        }
        LIZIZ = new C784840UqY(liveEffect.getEffectId(), liveEffect.getResourceId(), liveEffect.getName());
    }
}
