package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveChainEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.CoStreamer;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabs;
import com.bytedance.android.livesdkapi.depend.model.live.LiveChain;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* JADX INFO: renamed from: X.0Ilb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476010Ilb {
    public static final EnumC476020Ilc LIZ(Room room) {
        boolean z;
        List<CoStreamer> list;
        CustomTabs customTabs;
        List<CustomTab> list2;
        CustomTabInfo customTabInfo = room.customTabInfo;
        boolean z2 = false;
        if (customTabInfo != null && (customTabs = customTabInfo.customTabs) != null && (list2 = customTabs.customTabList) != null && list2.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        LiveChain liveChain = room.liveChainInfo;
        if (liveChain != null && (list = liveChain.coStreamers) != null && list.size() > 0) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                if (!LiveChainEnableSetting.INSTANCE.enable()) {
                    return EnumC476020Ilc.MULTITAB;
                }
                return EnumC476020Ilc.BOTH_MULTITAB_AND_CASTERS;
            }
            return EnumC476020Ilc.MULTITAB;
        }
        if (z2) {
            if (!LiveChainEnableSetting.INSTANCE.enable()) {
                return EnumC476020Ilc.NONE;
            }
            return EnumC476020Ilc.CASTERS;
        }
        return EnumC476020Ilc.NONE;
    }
}
