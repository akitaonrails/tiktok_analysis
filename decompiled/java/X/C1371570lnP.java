package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371570lnP {
    public static final C01GW<C1371570lnP> LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(628));

    public static void LIZ(SharePackage sharePackage) {
        try {
            ShareService shareService = C621180OYa.LIZ;
            if (!(sharePackage instanceof SharePackage)) {
                sharePackage = null;
            }
            Aweme awemeLJJIJIL = shareService.LJJIJIL(sharePackage);
            if (awemeLJJIJIL != null) {
                C2249091D1f c2249091D1f = new C2249091D1f(awemeLJJIJIL);
                if (c2249091D1f.LIZ.isAd()) {
                    try {
                        c2249091D1f.logAd(C2246291Cvz.LIZ, c2249091D1f.LIZ.getAwemeRawAd());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
