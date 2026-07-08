package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0ZzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917740ZzQ {
    public static final boolean LIZ(boolean z) {
        int iIntValue;
        if (z) {
            iIntValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_fix_layout_1v4");
        } else {
            Integer numLJ = C931820aM8.LJ("multi_guest_fix_layout_1v4");
            if (numLJ == null) {
                return false;
            }
            iIntValue = numLJ.intValue();
        }
        if (iIntValue <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(boolean z) {
        int iIntValue;
        if (z) {
            iIntValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_change_layout_v2");
        } else {
            Integer numLJ = C931820aM8.LJ("multi_guest_change_layout_v2");
            if (numLJ == null) {
                return false;
            }
            iIntValue = numLJ.intValue();
        }
        if (iIntValue <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings == null || multiLiveAnchorPanelSettings.enableShowMultiGuestLayout != 3) {
            return false;
        }
        return true;
    }
}
