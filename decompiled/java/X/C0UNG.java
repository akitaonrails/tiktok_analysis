package X;

import com.bytedance.android.livesdk.model.RoomSticker;

/* JADX INFO: renamed from: X.0UNG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNG {
    public static final boolean LIZ(RoomSticker roomSticker) {
        int i = roomSticker.reviewStatus;
        if (i != 2 && i != 5 && i != 0) {
            return false;
        }
        return true;
    }
}
