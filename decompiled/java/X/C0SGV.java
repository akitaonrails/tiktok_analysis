package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBottomBannerButtonType;

/* JADX INFO: renamed from: X.0SGV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0SGV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SeriesBottomBannerButtonType.values().length];
        try {
            iArr[SeriesBottomBannerButtonType.PLAY_NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[SeriesBottomBannerButtonType.WATCH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
