package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.AudienceIsCohostDuringMultiGuestEnabled;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicChxmgLiveStudioAudience;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicChxmgLiveStudioAudienceShieldMask;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931800aM6 {
    public static final C931800aM6 LIZ = new C931800aM6();
    public static Pair<Integer, n> LIZIZ;

    public static boolean LIZIZ() {
        boolean zLIZ;
        Room room;
        Room room2;
        try {
            room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("LinkMicCoHostWhenMultiGuestSettingHelper#catch", String.valueOf(th));
        }
        if (room2 != null) {
            LIZ.getClass();
            zLIZ = LIZ(room2);
        } else {
            zLIZ = false;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (C781520UlC.LJIIL((Room) dataChannelGlobal.gg0(C930940aKi.class))) {
            if (zLIZ) {
                return LinkCoreModelKt.currentUserIsAnchor() || AudienceIsCohostDuringMultiGuestEnabled.isEnabled();
            }
            return false;
        }
        if (!C781520UlC.LIZLLL((Room) dataChannelGlobal.gg0(C930940aKi.class)) || (LinkMicChxmgLiveStudioAudience.INSTANCE.getValue() & 1) == 0) {
            return false;
        }
        if ((LinkMicChxmgLiveStudioAudienceShieldMask.INSTANCE.getValue() & 1) == 0 || ((room = (Room) dataChannelGlobal.gg0(C930940aKi.class)) != null && (!LivePlayerNewLayoutTopicIdSetting.INSTANCE.isGameTopic(room)))) {
            return zLIZ;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r4) {
        /*
            java.lang.String r0 = r4.roomCreateAbParam
            int r3 = r0.hashCode()
            kotlin.Pair<java.lang.Integer, com.google.gson.n> r1 = X.C931800aM6.LIZIZ
            if (r1 == 0) goto L2f
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r3 == r0) goto L59
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = r4.roomCreateAbParam
            com.google.gson.n r0 = X.C2348809Ig.LJFF(r0)
            r2.<init>(r1, r0)
            X.C931800aM6.LIZIZ = r2
            java.lang.Object r2 = r2.getSecond()
            com.google.gson.n r2 = (com.google.gson.n) r2
        L2d:
            if (r2 != 0) goto L46
        L2f:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = r4.roomCreateAbParam
            com.google.gson.n r0 = X.C2348809Ig.LJFF(r0)
            r2.<init>(r1, r0)
            X.C931800aM6.LIZIZ = r2
            java.lang.Object r2 = r2.getSecond()
            com.google.gson.n r2 = (com.google.gson.n) r2
        L46:
            r1 = 0
            if (r2 == 0) goto L58
            java.lang.String r0 = "is_cohost_during_multiguest_enabled"
            com.google.gson.k r0 = r2.LJJIIZ(r0)
            if (r0 == 0) goto L58
            int r0 = r0.LJIIJJI()
            if (r0 <= 0) goto L58
            r1 = 1
        L58:
            return r1
        L59:
            java.lang.Object r2 = r1.getSecond()
            com.google.gson.n r2 = (com.google.gson.n) r2
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C931800aM6.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }
}
