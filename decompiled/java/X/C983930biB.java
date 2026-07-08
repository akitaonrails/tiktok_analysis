package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorItem;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorItemList;

/* JADX INFO: renamed from: X.0biB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983930biB {
    public static final LiveTakeTheStageColorItem LIZ(LiveTakeTheStageColorItemList liveTakeTheStageColorItemList, int i) {
        if (i >= 0 && i < 4) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return liveTakeTheStageColorItemList.item3;
                    }
                    return liveTakeTheStageColorItemList.item2;
                }
                return liveTakeTheStageColorItemList.item1;
            }
            return liveTakeTheStageColorItemList.item0;
        }
        return null;
    }
}
