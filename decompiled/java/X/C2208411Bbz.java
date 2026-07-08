package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Bbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208411Bbz {
    public final List<String> LIZ = new ArrayList();

    public final String LIZLLL() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return "";
        }
        Iterator<String> it2 = this.LIZ.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        String next = it2.next();
        while (it2.hasNext()) {
            String next2 = it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(next);
            sbLIZ.append('&');
            sbLIZ.append(next2);
            next = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str = next;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UploaderServerParam: ");
        sbLIZ2.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return str;
    }

    public C2208411Bbz() {
        String str;
        C0CHQ.LIZ().getApplicationService();
        LIZIZ("appid", String.valueOf(C19221910Hx.LIZ()));
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        LIZIZ("did", (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) ? CardStruct.IStatusCode.DEFAULT : strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        LIZIZ("uid", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        LIZIZ("version_code", String.valueOf(C0CHQ.LIZ().getVersionCode()));
        LIZIZ("update_version_code", String.valueOf(C0CHQ.LIZ().getUpdateVersionCode()));
        switch (C804570VhH.LIZ[C786410Ut5.e3(C0CHQ.LIZ).ordinal()]) {
            case 1:
            case 2:
                str = "null";
                break;
            case 3:
                str = "mobile";
                break;
            case 4:
                str = "2G";
                break;
            case 5:
            case 6:
            case 7:
                str = "3G";
                break;
            case 8:
                str = "4G";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str = "5G";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                str = "wifi";
                break;
            default:
                throw new C1954807lC();
        }
        LIZIZ("net_type", str);
        C0CHQ.LIZ().getRegionService().getClass();
        String strLJ = C2222691Bz1.LJ();
        LIZIZ("carrier_region", strLJ == null ? "" : strLJ);
    }

    public final void LIZ(UploadVideoConfig uploadVideoConfig) {
        String strLIZ = uploadVideoConfig.uploadRegion;
        if (strLIZ == null || strLIZ.length() == 0) {
            C0CHQ.LIZ().getRegionService();
            strLIZ = C20186013yc.LIZ();
        }
        LIZIZ("Region", strLIZ);
        String str = uploadVideoConfig.userStoreRegion;
        if (str != null && str.length() != 0) {
            LIZIZ("StoreRegion", str);
        }
    }

    public final void LIZJ(UploadImageConfig uploadImageConfig) {
        String str = uploadImageConfig.userStoreRegion;
        if (str != null && str.length() != 0) {
            LIZIZ("store_region", str);
        }
    }

    public final void LIZIZ(String str, String str2) {
        List<String> list = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('=');
        sbLIZ.append(str2);
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
    }
}
