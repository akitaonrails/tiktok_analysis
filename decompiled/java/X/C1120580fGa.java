package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0fGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120580fGa {
    public static final EnumC1120600fGc LIZ(int i) {
        if (i != 1) {
            switch (i) {
                case 15:
                    return EnumC1120600fGc.EXCLUSIVE;
                case 16:
                    return EnumC1120600fGc.BACKPACK;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    return EnumC1120600fGc.INTERACTIVE;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    return EnumC1120600fGc.MUSIC;
                default:
                    return EnumC1120600fGc.GIFT;
            }
        }
        return EnumC1120600fGc.GIFT;
    }

    public static final int LIZIZ(EnumC1120600fGc enumC1120600fGc) {
        int i = C1120590fGb.LIZ[enumC1120600fGc.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return 1;
                    }
                    return 18;
                }
                return 16;
            }
            return 17;
        }
        return 15;
    }
}
