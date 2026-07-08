package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ISj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466830ISj {
    public static C466840ISk LIZ;

    public static C0ISJ LIZ(EnterRoomConfig enterRoomConfig, String str) {
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str2 = roomsData.enterMethod;
        String str3 = roomsData.enterFromMerge;
        LiveFeedDraw.Companion.getClass();
        String strValueOf = String.valueOf(C0ISY.LIZLLL(str3, str2).channel_id);
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String str4 = roomsData2.enterMethod;
        if (Intrinsics.LJFF("live_merge", roomsData2.enterFromMerge) && Intrinsics.LJFF("live_cover", str4)) {
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            String str5 = roomsData3.bubbleRoomId;
            String str6 = roomsData3.bubbleOwnerd;
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&bubble_room_id=");
                sbLIZ.append(str5);
                sbLIZ.append("&bubble_owner_id=");
                sbLIZ.append(str6);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            roomsData4.bubbleRoomId = "";
            roomsData4.bubbleOwnerd = "";
        }
        return new C0ISJ(enterRoomConfig, str, strValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0IOL LIZIZ(boolean r4, com.bytedance.android.livesdkapi.session.EnterRoomConfig r5) {
        /*
            r3 = 0
            r2 = 0
            if (r4 == 0) goto L45
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "RoomListProviderCenter_"
            r1.append(r0)
            r1.append(r3)
            r0 = 95
            r1.append(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L44
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r5.mRoomsData
            r0.providerTag = r1
            com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting r0 = com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting.INSTANCE
            com.bytedance.android.livesdk.live.model.LiveFeedDraw r0 = r0.getValue()
            java.lang.String r0 = r0.getUrl()
            X.0ISJ r2 = LIZ(r5, r0)
            X.0ISk r0 = new X.0ISk
            r0.<init>(r1, r2)
            X.C466830ISj.LIZ = r0
        L44:
            return r2
        L45:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r5.mRoomsData
            java.lang.String r1 = r0.providerTag
            boolean r0 = X.C500260Jjc.LJJIIZ(r1)
            if (r0 == 0) goto L7a
            X.0ISk r0 = X.C466830ISj.LIZ
            if (r0 == 0) goto L78
            java.lang.String r0 = r0.LIZ
        L55:
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r3)
            if (r0 == 0) goto L7a
            X.0ISk r1 = X.C466830ISj.LIZ
            if (r1 == 0) goto L7a
            X.0IOL r0 = r1.LIZIZ
            if (r0 == 0) goto L7a
            if (r1 == 0) goto L76
            X.0IOL r1 = r1.LIZIZ
        L67:
            X.0ISk r0 = X.C466830ISj.LIZ
            if (r0 == 0) goto L6f
            r0.LIZ = r2
            r0.LIZIZ = r2
        L6f:
            X.C466830ISj.LIZ = r2
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r5.mRoomsData
            r0.providerTag = r2
            return r1
        L76:
            r1 = r2
            goto L67
        L78:
            r0 = r2
            goto L55
        L7a:
            com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting r0 = com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting.INSTANCE
            com.bytedance.android.livesdk.live.model.LiveFeedDraw r0 = r0.getValue()
            java.lang.String r0 = r0.getUrl()
            X.0ISJ r1 = LIZ(r5, r0)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466830ISj.LIZIZ(boolean, com.bytedance.android.livesdkapi.session.EnterRoomConfig):X.0IOL");
    }
}
