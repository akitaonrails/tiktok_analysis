package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002860cCi {
    public static final C1002860cCi LIZ = new C1002860cCi();

    public static Map LIZ(AwemeRawAd awemeRawAd) {
        Integer num;
        Integer num2;
        if (awemeRawAd == null) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null && (num2 = searchAdInfo.adPdpVideoShrinkType) != null) {
            }
            AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo2 != null && (num = searchAdInfo2.adPdpFullModeType) != null) {
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
