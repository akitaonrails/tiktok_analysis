package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0a4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920910a4X {
    public static final EnumC920920a4Y LIZ(int i) {
        MultiGuestV3GuestMonitoringTipsSetting multiGuestV3GuestMonitoringTipsSetting = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE;
        List<Integer> badLevelList = multiGuestV3GuestMonitoringTipsSetting.getBadLevelList();
        List<Integer> veryBadLevelList = multiGuestV3GuestMonitoringTipsSetting.getVeryBadLevelList();
        List<Integer> hiddenLevelList = multiGuestV3GuestMonitoringTipsSetting.getHiddenLevelList();
        if (badLevelList.contains(Integer.valueOf(i))) {
            return EnumC920920a4Y.BAD;
        }
        if (veryBadLevelList.contains(Integer.valueOf(i))) {
            return EnumC920920a4Y.VERY_BAD;
        }
        if (hiddenLevelList.contains(Integer.valueOf(i))) {
            return EnumC920920a4Y.GOOD;
        }
        return EnumC920920a4Y.UNKNOWN;
    }
}
