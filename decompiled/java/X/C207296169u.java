package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.169u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207296169u {
    public static final C207296169u LIZ = new C207296169u();

    public static void LIZ(EnumC207181165j enumC207181165j) {
        AwemeRawAd awemeRawAd;
        C01GW c01gw = C21278818Pa.LIZ;
        Aweme aweme = C21278818Pa.LIZIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            try {
                ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIIIZZ(enumC207181165j.getValue(), awemeRawAd, C2097608Jq.LJ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
