package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;

/* JADX INFO: renamed from: X.0a8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923170a8B {
    public static final EnumC918990a1R LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        int i = multiLiveAnchorPanelSettings.layoutType;
        if (i == 1) {
            if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                return EnumC918990a1R.FLOAT_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                    return EnumC918990a1R.GRID_FIX;
                }
                if (multiLiveAnchorPanelSettings.fixMicNumAction == 1) {
                    return EnumC918990a1R.GRID_FLOAT;
                }
                return null;
            }
            return null;
        }
        if (multiLiveAnchorPanelSettings.fixMicNumAction == 1) {
            return EnumC918990a1R.FLOAT;
        }
        return null;
    }

    public static final EnumC918990a1R LIZIZ(MultiLiveLayoutInfo multiLiveLayoutInfo) {
        int i = multiLiveLayoutInfo.anchorNewLayout;
        if (i == 1) {
            if (multiLiveLayoutInfo.fixSwitchOn == 0) {
                return EnumC918990a1R.FLOAT_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (multiLiveLayoutInfo.fixSwitchOn == 0) {
                    return EnumC918990a1R.GRID_FIX;
                }
                if (multiLiveLayoutInfo.fixSwitchOn == 1) {
                    return EnumC918990a1R.GRID_FLOAT;
                }
                return null;
            }
            return null;
        }
        if (multiLiveLayoutInfo.fixSwitchOn == 1) {
            return EnumC918990a1R.FLOAT;
        }
        return null;
    }
}
