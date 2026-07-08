package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706040Rmk {
    public static boolean LIZ(BaseFeedPageParams baseFeedPageParams) {
        if (baseFeedPageParams.param.isShowFollowButtonOnBottom()) {
            String cellType = baseFeedPageParams.param.getCellType();
            Boolean boolValueOf = Boolean.valueOf(baseFeedPageParams.param.isShowFollowButtonOnBottomForMaf());
            if (!Intrinsics.LJFF(cellType, "cell_detail") || !Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
}
