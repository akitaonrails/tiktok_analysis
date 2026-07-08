package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheAllowPathListSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheEnableGiftSubSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheEnableServicePlusSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122210fJD {
    public static final boolean LIZ(String str) {
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(str, LivePcsDataCacheAllowPathListSetting.INSTANCE.getValue());
        if (Intrinsics.LJFF(str, "/webcast/sub/gift/send_subscription_panel/")) {
            if (LivePcsDataCacheEnableGiftSubSetting.INSTANCE.getValue() && zLJIILLIIL) {
                return true;
            }
            return false;
        }
        if (C1697810uHb.LJIIJJI("/webcast/sub/smb/creator_info/", "/webcast/sub/smb/service_stat/", "/webcast/sub/smb/qualification/", "/webcast/sub/upsell/industry_list/", "/webcast/smb/opt_in/progress/", "/webcast/sub/smb/service_switch_info/").contains(str)) {
            if (LivePcsDataCacheEnableServicePlusSetting.INSTANCE.getValue() && zLJIILLIIL) {
                return true;
            }
            return false;
        }
        return zLJIILLIIL;
    }
}
