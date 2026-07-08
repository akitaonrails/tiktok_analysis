package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0a4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920900a4W {
    public static final EnumC920860a4S LIZ(int i) {
        MultiGuestV3GuestMonitoringTipsSetting multiGuestV3GuestMonitoringTipsSetting = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE;
        List<Integer> badLevelList = multiGuestV3GuestMonitoringTipsSetting.getBadLevelList();
        List<Integer> veryBadLevelList = multiGuestV3GuestMonitoringTipsSetting.getVeryBadLevelList();
        List<Integer> hiddenLevelList = multiGuestV3GuestMonitoringTipsSetting.getHiddenLevelList();
        if (badLevelList.contains(Integer.valueOf(i))) {
            return EnumC920860a4S.BAD;
        }
        if (veryBadLevelList.contains(Integer.valueOf(i))) {
            return EnumC920860a4S.VERY_BAD;
        }
        if (hiddenLevelList.contains(Integer.valueOf(i))) {
            return EnumC920860a4S.GOOD;
        }
        return EnumC920860a4S.UNKNOWN;
    }
}
