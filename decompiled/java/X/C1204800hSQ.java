package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;

/* JADX INFO: renamed from: X.0hSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204800hSQ extends AbstractC1204600hS6 {
    public static final C1204800hSQ LIZIZ = new C1204800hSQ();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "ttkls_nearby_banner_popup";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Integer num;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        if (map == null || (bannerCardInterval = map.get("GPSBottomBannerType")) == null || (num = bannerCardInterval.authorizeShowFrequency) == null) {
            return 5;
        }
        return num.intValue();
    }

    @Override // X.AbstractC1204580hS4
    public final long LJII() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Long l;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        return ((map == null || (bannerCardInterval = map.get("GPSBottomBannerType")) == null || (l = bannerCardInterval.afterClickIntervalSeconds) == null) ? 604800L : l.longValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.AbstractC1204580hS4
    public final long LJIIIZ() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Long l;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        return ((map == null || (bannerCardInterval = map.get("GPSBottomBannerType")) == null || (l = bannerCardInterval.defaultIntervalSecond) == null) ? 259200L : l.longValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
