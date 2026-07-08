package X;

import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;

/* JADX INFO: renamed from: X.0hSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204730hSJ extends AbstractC1201410hMx {
    public static final C1204730hSJ LIZIZ = new C1204730hSJ();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "content_insufficient_default_frequency_control";
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
        return (int) (((map == null || (noticeInterval = map.get("ContentInsufficient")) == null || (l = noticeInterval.defaultIntervalSecond) == null) ? 86400L : l.longValue()) / ((long) 86400));
    }
}
