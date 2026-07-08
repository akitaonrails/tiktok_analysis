package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204790hSP extends AbstractC1204600hS6 {
    public static final C1204790hSP LIZIZ = new C1204790hSP();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(789));

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "banner_promote_precise_location_permission_frequency";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Integer num;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        if (map == null || (bannerCardInterval = map.get("PreciseGPSBottomBanner")) == null || (num = bannerCardInterval.authorizeShowFrequency) == null) {
            return 5;
        }
        return num.intValue();
    }

    @Override // X.AbstractC1204580hS4
    public final long LJII() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Long l;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        return ((map == null || (bannerCardInterval = map.get("PreciseGPSBottomBanner")) == null || (l = bannerCardInterval.afterClickIntervalSeconds) == null) ? 604800L : l.longValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.AbstractC1204580hS4
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LIZ.storeInt((String) LIZJ.getValue(), 0);
    }

    @Override // X.AbstractC1204580hS4
    public final long LJIIIZ() {
        NearbyClientSettings.BannerCardInterval bannerCardInterval;
        Long l;
        Map<String, NearbyClientSettings.BannerCardInterval> map = NearbyClientSettings.LIZIZ().bottomBannerTypeIntervalMap;
        return ((map == null || (bannerCardInterval = map.get("PreciseGPSBottomBanner")) == null || (l = bannerCardInterval.defaultIntervalSecond) == null) ? 259200L : l.longValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
