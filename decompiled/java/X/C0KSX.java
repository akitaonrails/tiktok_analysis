package X;

import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.data.SuperFanPermissionInfo;

/* JADX INFO: renamed from: X.0KSX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSX {
    public static final boolean LIZ(GetNonFansUserDataResponse.Data data) {
        SuperFanPermissionInfo superFanPermissionInfo;
        SuperFanPermissionInfo superFanPermissionInfo2;
        if (data != null && (superFanPermissionInfo = data.superFanPermissionInfo) != null && superFanPermissionInfo.enableSuperFan && (superFanPermissionInfo2 = data.superFanPermissionInfo) != null && superFanPermissionInfo2.enableSuperFanPurchase) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy) {
        GetNonFansUserDataResponse.Data data;
        SuperFanPermissionInfo superFanPermissionInfo;
        GetNonFansUserDataResponse.Data data2;
        SuperFanPermissionInfo superFanPermissionInfo2;
        if (c0ksy != null && (data = c0ksy.LIZ) != null && (superFanPermissionInfo = data.superFanPermissionInfo) != null && superFanPermissionInfo.enableSuperFan && (data2 = c0ksy.LIZ) != null && (superFanPermissionInfo2 = data2.superFanPermissionInfo) != null && superFanPermissionInfo2.enableSuperFanPurchase) {
            return true;
        }
        return false;
    }
}
