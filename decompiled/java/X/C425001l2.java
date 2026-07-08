package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import webcast.api.sub.BookingInfo;
import webcast.api.sub.ServiceInfo;

/* JADX INFO: renamed from: X.01l2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C425001l2 {
    public static final String LIZ(BookingInfo bookingInfo, boolean z, int i) {
        boolean z2;
        LiveSmbServiceBioDesignOptSetting liveSmbServiceBioDesignOptSetting = LiveSmbServiceBioDesignOptSetting.INSTANCE;
        if (liveSmbServiceBioDesignOptSetting.enableIndividualSkuStyle() || z || (liveSmbServiceBioDesignOptSetting.enableAggregatedSkuStyle() && i == 1)) {
            String str = bookingInfo.locationText;
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return C497740JfY.LJIJJ(2131851502, Integer.valueOf(bookingInfo.durationSeconds / 60));
            }
            return C497740JfY.LJIJJ(2131855861, C497740JfY.LJIJJ(2131851502, Integer.valueOf(bookingInfo.durationSeconds / 60)), str);
        }
        return "";
    }

    public static final String LIZIZ(BookingInfo bookingInfo, boolean z, int i, boolean z2) {
        String str;
        String str2;
        String str3 = "";
        if (!z && !z2) {
            LiveSmbServiceBioDesignOptSetting liveSmbServiceBioDesignOptSetting = LiveSmbServiceBioDesignOptSetting.INSTANCE;
            if (!liveSmbServiceBioDesignOptSetting.enableIndividualSkuStyle() && (!liveSmbServiceBioDesignOptSetting.enableAggregatedSkuStyle() || i != 1)) {
                Object[] objArr = new Object[2];
                ServiceInfo serviceInfo = bookingInfo.serviceInfo;
                if (serviceInfo != null && (str2 = serviceInfo.title) != null) {
                    str3 = str2;
                }
                objArr[0] = str3;
                objArr[1] = C497740JfY.LJIJJ(2131851502, Integer.valueOf(bookingInfo.durationSeconds / 60));
                return C497740JfY.LJIJJ(2131855861, objArr);
            }
        }
        ServiceInfo serviceInfo2 = bookingInfo.serviceInfo;
        if (serviceInfo2 == null || (str = serviceInfo2.title) == null) {
            return "";
        }
        return str;
    }
}
