package X;

import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;

/* JADX INFO: renamed from: X.0hSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204750hSL extends AbstractC1201410hMx {
    public static final C1204750hSL LIZIZ = new C1204750hSL();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "non_gps_supported_regions_default_frequency_control";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        return 1;
    }

    @Override // X.AbstractC1201410hMx
    public final int LJII() {
        NearbyClientSettings.NoticeInterval noticeInterval;
        Long l;
        Map<String, NearbyClientSettings.NoticeInterval> map = NearbyClientSettings.LIZIZ().noticeTypeIntervalMap;
        return (int) (((map == null || (noticeInterval = map.get("NonGPSSupportedRegions")) == null || (l = noticeInterval.defaultIntervalSecond) == null) ? 259200L : l.longValue()) / ((long) 86400));
    }
}
