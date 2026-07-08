package X;

import java.util.List;
import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.data.SuperFanPackage;
import webcast.data.SuperFanPermissionInfo;

/* JADX INFO: renamed from: X.0KSS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSS {
    public final C0KSK<GetNonFansUserDataResponse.Data> LIZ;
    public final C0KSQ LIZIZ = new C0KSQ(this);

    public C0KSS(C0KSK<GetNonFansUserDataResponse.Data> c0ksk) {
        this.LIZ = c0ksk;
    }

    public static C516120KLy LIZ(C0KSS c0kss, long j, GetNonFansUserDataResponse.Data data, Throwable th, int i) {
        int size;
        String str;
        boolean z;
        SuperFanPermissionInfo superFanPermissionInfo;
        SuperFanPermissionInfo superFanPermissionInfo2;
        List<SuperFanPackage> list;
        SuperFanPackage superFanPackage;
        List<SuperFanPackage> list2;
        Throwable th2 = null;
        if ((i & 2) != 0) {
            data = null;
        }
        if ((i & 4) == 0) {
            th2 = th;
        }
        c0kss.getClass();
        if (data != null && (list2 = data.allPkgInfos) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        String str2 = c0kss.LIZ.LJFF;
        if (data == null || (list = data.allPkgInfos) == null || (superFanPackage = (SuperFanPackage) C13LP.LJJJLL(list)) == null || (str = superFanPackage.currency) == null) {
            str = "";
        }
        if (data != null && (superFanPermissionInfo = data.superFanPermissionInfo) != null && superFanPermissionInfo.enableSuperFan && (superFanPermissionInfo2 = data.superFanPermissionInfo) != null && superFanPermissionInfo2.enableSuperFanPurchase) {
            z = true;
        } else {
            z = false;
        }
        return new C516120KLy(j, size, str2, str, z, null, null, th2, 96);
    }
}
