package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.pgc_sub.PGCSubSpaceInfo;

/* JADX INFO: renamed from: X.0K0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0Z {
    public static boolean LIZ(PGCGetSubPrivilegeDetailResponse.Data data) {
        PGCSubSpaceInfo pGCSubSpaceInfo = data.spaceInfo;
        if (pGCSubSpaceInfo != null && C0K51.LJI(Boolean.valueOf(pGCSubSpaceInfo.hasSubOnlySpace))) {
            return true;
        }
        return false;
    }
}
