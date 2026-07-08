package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import webcast.api.room.Modification;

/* JADX INFO: renamed from: X.0U1G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U1G {
    public static C0U22 LIZ;
    public static String LIZJ;
    public static String LJ;
    public static Long LJFF;
    public static long LIZIZ = -1;
    public static long LIZLLL = -1;
    public static final Map<Long, String> LJI = new LinkedHashMap();

    public static void LIZ(boolean z, boolean z2) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closekaraoke: ");
        C0U22 c0u22 = LIZ;
        if (c0u22 != null) {
            str = c0u22.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(6L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), z, z2);
        ((LinkedHashMap) LJI).clear();
        LIZ = null;
        LIZJ = null;
    }

    public static void LIZIZ(boolean z, boolean z2) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause: ");
        C0U22 c0u22 = LIZ;
        if (c0u22 != null) {
            str = c0u22.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(4L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C0U22 r28, long r29, boolean r31, int r32) {
        /*
            r5 = r32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.C763810Txj.LIZ(r0)
            if (r0 == 0) goto L84
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            java.lang.String r27 = r0.getBroadcastScene()
        L18:
            r6 = r28
            long r12 = r6.LIZ
            java.lang.String r14 = r6.LIZJ
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r9 = r9 / r0
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r0
            X.0U17 r0 = X.C0U17.LIZ
            X.0TzH r0 = X.C0U17.LJIIZILJ(r29)
            java.lang.String r22 = r0.getValue()
            if (r31 == 0) goto L81
            r3 = 1
        L39:
            int r0 = r6.LJIILL
            float r2 = (float) r0
            X.0U3A r0 = r6.LIZIZ
            java.lang.String r0 = r0.LIZIZ
            r1 = 1
            if (r5 == r1) goto L7e
            r1 = 2
            if (r5 == r1) goto L7b
            r1 = 3
            if (r5 != r1) goto L7e
            r20 = 1
        L4b:
            webcast.api.room.Modification r11 = new webcast.api.room.Modification
            r15 = 0
            java.lang.Long r18 = java.lang.Long.valueOf(r9)
            java.lang.Long r19 = java.lang.Long.valueOf(r7)
            java.lang.Long r23 = java.lang.Long.valueOf(r3)
            java.lang.Float r25 = java.lang.Float.valueOf(r2)
            r30 = 0
            r32 = 0
            r16 = 11
            r24 = r15
            r26 = r0
            r28 = r15
            r29 = r15
            r11.<init>(r12, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
            r0 = 9
            X.C768300UBw.LJII(r0, r11)
            X.C768300UBw.LJIILIIL(r0)
            X.C768300UBw.LIZIZ(r0)
            return
        L7b:
            r20 = 2
            goto L4b
        L7e:
            r20 = 0
            goto L4b
        L81:
            r3 = 2
            goto L39
        L84:
            r27 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U1G.LIZJ(X.0U22, long, boolean, int):void");
    }

    public static void LIZLLL(long j, long j2, boolean z, boolean z2) {
        String broadcastScene;
        String strSE;
        long j3;
        long j4;
        long currentUserId;
        if (z) {
            broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        } else {
            broadcastScene = null;
        }
        String str = "";
        if (z) {
            strSE = "";
        } else {
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            strSE = iInteractService.sE(currentUserId);
        }
        C0U22 c0u22 = LIZ;
        if (c0u22 != null) {
            long j5 = c0u22.LIZ;
            String str2 = c0u22.LIZJ;
            long j6 = LIZIZ;
            String str3 = c0u22.LIZIZ.LIZIZ;
            if (z) {
                j3 = 0;
            } else {
                j3 = 1;
            }
            String str4 = (String) ((LinkedHashMap) LJI).get(Long.valueOf(j5));
            if (str4 == null) {
                str4 = "other";
            }
            if (z2 && (!a0.LJJJIL(c0u22.LJII.LIZIZ))) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            Modification modification = new Modification(j5, str2, null, 10L, Long.valueOf(j6), null, j3, str4, null, Long.valueOf(LIZLLL), null, str3, broadcastScene, null, null, j4, 0);
            Long lValueOf = Long.valueOf(j);
            if (lValueOf.longValue() != -1) {
                modification.mode = lValueOf.longValue();
            }
            Long lValueOf2 = Long.valueOf(j2);
            if (lValueOf2.longValue() != -1) {
                modification.endTime = lValueOf2.longValue();
            }
            String str5 = LIZJ;
            if (str5 != null) {
                str = str5;
            }
            modification.resourceId = str;
            if (C500260Jjc.LJJIIZ(strSE)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"link_id\":");
                sbLIZ.append(strSE);
                sbLIZ.append('}');
                modification.extra = C2188811AlT.LIZIZ(sbLIZ);
            }
            C768300UBw.LJII(9L, modification);
            C768300UBw.LJIILIIL(9L);
            C768300UBw.LIZIZ(9L);
        }
    }
}
