package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;

/* JADX INFO: renamed from: X.0IO2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO2 {
    public static String LIZ(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return "";
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (!roomsData.fromNewStyle) {
            return "";
        }
        String str = roomsData.feedUrl;
        if (C2093608Ic.LJ(str)) {
            return "";
        }
        return str;
    }

    public static boolean LIZIZ(EnterRoomConfig enterRoomConfig) {
        if (("live_merge".equals(enterRoomConfig.mRoomsData.enterFromMerge) && !"live_cover".equals(enterRoomConfig.mRoomsData.enterMethod)) || enterRoomConfig.mLogData.loadDuration <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2;
        C0IXL c0ixl;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig2 = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && enterRoomConfig2.mRoomsData.fromNewStyle) {
            long j = enterRoomConfig.mRoomsData.smallPictureOrder;
            if (j != -1) {
                Long lValueOf = Long.valueOf(j);
                C0IR5 c0ir5LIZIZ = C0IR2.LIZIZ();
                if (c0ir5LIZIZ != null && (c0ixl = c0ir5LIZIZ.LJFF) != null) {
                    c0ixl.LJIILLIIL = lValueOf;
                }
            }
        }
    }

    public static String LIZJ(String str, String str2) {
        if (!C2093608Ic.LJ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("&");
            sbLIZ.append(str2);
            sbLIZ.append("=[^&]*");
            return str.replaceAll(C2188811AlT.LIZIZ(sbLIZ), "");
        }
        return str;
    }
}
