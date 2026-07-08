package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.SubSpaceInfo;

/* JADX INFO: renamed from: X.0Juy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507300Juy {
    public static boolean LIZ(GetSubPrivilegeDetailResponse.Data data) {
        SubSpaceInfo subSpaceInfo = data.spaceInfo;
        if (subSpaceInfo != null && C500260Jjc.LJJJI(Boolean.valueOf(subSpaceInfo.hasSubOnlySpace))) {
            return true;
        }
        return false;
    }
}
