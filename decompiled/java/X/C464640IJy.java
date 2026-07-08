package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464640IJy {
    public static final String LIZ(EnterRoomConfig enterRoomConfig) {
        String str = enterRoomConfig.mRoomsData.backRoomSource;
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
            sbLIZ.append('-');
            sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
