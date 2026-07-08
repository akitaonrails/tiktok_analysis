package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ZxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916490ZxP {
    public static boolean LIZIZ(long j) {
        return (j & 1) == 1;
    }

    public static int LIZLLL(long j) {
        int i = (int) (j & 3);
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static MultiGuestDataHolder LIZJ() {
        try {
            return (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        Map<Integer, String> map;
        String str;
        Map<Integer, String> map2;
        String str2;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && multiLiveAnchorPanelSettings != null) {
            if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                int i = multiLiveAnchorPanelSettings.layoutType;
                if (i == 0) {
                    MultiGuestDataHolder multiGuestDataHolderLIZJ = LIZJ();
                    if (multiGuestDataHolderLIZJ == null || (map2 = multiGuestDataHolderLIZJ.LJIJJLI) == null || (str2 = (String) ((ConcurrentHashMap) map2).get(2)) == null) {
                        return LiveSdkMicCountToLayoutIdMap.INSTANCE.gridFixLayoutId();
                    }
                    return str2;
                }
                if (i == 1) {
                    MultiGuestDataHolder multiGuestDataHolderLIZJ2 = LIZJ();
                    if (multiGuestDataHolderLIZJ2 != null && (map = multiGuestDataHolderLIZJ2.LJIJJLI) != null && (str = (String) ((ConcurrentHashMap) map).get(1)) != null) {
                        return str;
                    }
                    return LiveSdkMicCountToLayoutIdMap.INSTANCE.panelFixLayoutId();
                }
                return null;
            }
            if (multiLiveAnchorPanelSettings.fixMicNumAction == 1) {
                int i2 = multiLiveAnchorPanelSettings.layoutType;
                if (i2 == 0) {
                    if (multiLiveAnchorPanelSettings.LIZLLL == 3) {
                        if (C917740ZzQ.LIZJ(multiLiveAnchorPanelSettings)) {
                            return LiveSdkMicCountToLayoutIdMap.INSTANCE.gridFloatWithEmptySeatWithoutGuestId();
                        }
                        return LiveSdkMicCountToLayoutIdMap.INSTANCE.gridFloatLayoutWithEmptyId();
                    }
                    if (C917740ZzQ.LIZJ(multiLiveAnchorPanelSettings)) {
                        return LiveSdkMicCountToLayoutIdMap.INSTANCE.gridFloatWithoutGuestId();
                    }
                    return LiveSdkMicCountToLayoutIdMap.INSTANCE.gridFloatLayoutId();
                }
                if (i2 == 1) {
                    if (multiLiveAnchorPanelSettings.LIZLLL == 3) {
                        if (C917740ZzQ.LIZJ(multiLiveAnchorPanelSettings)) {
                            return LiveSdkMicCountToLayoutIdMap.INSTANCE.panelFloatWithEmptySeatWithoutGuestId();
                        }
                        return LiveSdkMicCountToLayoutIdMap.INSTANCE.panelFloatLayoutWithEmptyId();
                    }
                    if (C917740ZzQ.LIZJ(multiLiveAnchorPanelSettings)) {
                        return LiveSdkMicCountToLayoutIdMap.INSTANCE.panelFloatWithoutGuestId();
                    }
                    return LiveSdkMicCountToLayoutIdMap.INSTANCE.panelFloatLayoutId();
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
