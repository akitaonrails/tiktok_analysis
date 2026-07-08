package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466400IQs {
    public static final boolean LIZ(EnterRoomConfig enterRoomConfig) {
        C466650IRr c466650IRr;
        if (Intrinsics.LJFF("live_merge", enterRoomConfig.mRoomsData.enterFromMerge) && Intrinsics.LJFF("live_cover", enterRoomConfig.mRoomsData.enterMethod)) {
            C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
            if (!c466640IRqLIZJ.LIZ || (c466650IRr = c466640IRqLIZJ.LIZIZ) == null || !c466650IRr.LJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r4, com.bytedance.android.livesdkapi.session.EnterRoomConfig r5) {
        /*
            r3 = 1
            if (r4 != 0) goto L25
            boolean r0 = LIZ(r5)
            if (r0 != 0) goto L25
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r5.mRoomsData
            java.lang.String r1 = r0.enterFromMerge
            java.lang.String r0 = r0.enterMethod
            boolean r0 = com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting.matchNearbyFeed(r1, r0)
            if (r0 == 0) goto L48
            X.0IRq r1 = X.C466640IRq.LIZJ()
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L25
            X.0IRr r0 = r1.LIZIZ
            if (r0 == 0) goto L25
            boolean r0 = r0.LJ
            if (r0 != 0) goto L48
        L25:
            r1 = r4
            if (r4 == 0) goto L2e
            boolean r0 = LIZ(r5)
            if (r0 == 0) goto L2f
        L2e:
            r3 = 0
        L2f:
            X.0IQz r2 = new X.0IQz
            r2.<init>(r1, r3, r4)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0fzJ> r0 = X.C1148310fzJ.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0IR5 r0 = (X.C0IR5) r0
            if (r0 == 0) goto L42
            r0.LJI = r2
        L42:
            java.lang.Class<X.0aLR> r0 = X.C931390aLR.class
            r1.JQ2(r0, r2)
            return
        L48:
            X.0IRq r1 = X.C466640IRq.LIZJ()
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L57
            X.0IRr r0 = r1.LIZIZ
            if (r0 == 0) goto L57
            int r1 = r0.LJFF
            goto L2e
        L57:
            r1 = -1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466400IQs.LIZIZ(int, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }
}
