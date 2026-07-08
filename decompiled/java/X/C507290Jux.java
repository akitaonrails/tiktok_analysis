package X;

import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507290Jux {
    public static boolean LIZ(String str, GetSubPrivilegeDetailResponse.Data data) {
        int i;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo2 = data.subOnlyVideosBriefInfo;
        if (subOnlyVideosBriefInfo2 != null) {
            i = subOnlyVideosBriefInfo2.totalCount;
        } else {
            i = 0;
        }
        if (i < 3 && !Intrinsics.LJFF(str, EnumC504050Jpj.SUB_ONLY_VIDEO.getSource()) && ((subOnlyVideosBriefInfo = data.subOnlyVideosBriefInfo) == null || !subOnlyVideosBriefInfo.isSovAdjustmentsEnabledForConsumer)) {
            return false;
        }
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo3 = data.subOnlyVideosBriefInfo;
        if (subOnlyVideosBriefInfo3 != null && subOnlyVideosBriefInfo3.isSovAdjustmentsEnabledForConsumer && subOnlyVideosBriefInfo3.creatorStatus != 1) {
            return false;
        }
        return true;
    }
}
