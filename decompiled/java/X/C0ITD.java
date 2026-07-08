package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0ITD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITD {
    public static String LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        String str = "";
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = roomsData.enterFromMerge;
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append('_');
        String str3 = roomsData.enterMethod;
        if (str3 != null) {
            str = str3;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
