package X;

import webcast.api.sub.ExclusiveContent;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Juz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507310Juz {
    public static boolean LIZ(GetSubPrivilegeDetailResponse.Data data) {
        ExclusiveContent exclusiveContent = data.exclusiveContent;
        if (exclusiveContent != null && exclusiveContent.shouldShowSubOnlyLive) {
            return true;
        }
        return false;
    }
}
