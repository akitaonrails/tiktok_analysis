package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0bqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989170bqd {
    public static final C989170bqd LIZ = new C989170bqd();

    public static void LIZ(final Object obj) {
        if (!(obj instanceof Aweme)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            final IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
            if (iAdLandPagePreloadService != null) {
                iAdLandPagePreloadService.G0();
                C1024380clQ.LJIILIIL(arrayList, "incentive_preload", new AbstractC1552040qUU() { // from class: X.0bqe
                    @Override // X.AbstractC1552040qUU
                    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                        C989170bqd c989170bqd = C989170bqd.LIZ;
                        Aweme aweme = (Aweme) obj;
                        IAdLandPagePreloadService iAdLandPagePreloadService2 = iAdLandPagePreloadService;
                        c989170bqd.getClass();
                        C989170bqd.LIZIZ(aweme, iAdLandPagePreloadService2);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIL(long j, UpdatePackage updatePackage) {
                        C989170bqd c989170bqd = C989170bqd.LIZ;
                        Aweme aweme = (Aweme) obj;
                        IAdLandPagePreloadService iAdLandPagePreloadService2 = iAdLandPagePreloadService;
                        c989170bqd.getClass();
                        C989170bqd.LIZIZ(aweme, iAdLandPagePreloadService2);
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJI(int i, Throwable th, Map map) {
                        C989170bqd c989170bqd = C989170bqd.LIZ;
                        Aweme aweme = (Aweme) obj;
                        IAdLandPagePreloadService iAdLandPagePreloadService2 = iAdLandPagePreloadService;
                        c989170bqd.getClass();
                        C989170bqd.LIZIZ(aweme, iAdLandPagePreloadService2);
                        C1022620cia.LIZ("GmtRewardAdCommonUtil", "preload onCheckRequestIntercept");
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(Aweme aweme, IAdLandPagePreloadService iAdLandPagePreloadService) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        try {
            if (awemeRawAd.getPreloadWeb() == 4) {
                String channelName = awemeRawAd.getChannelName();
                String strK0 = iAdLandPagePreloadService.K0("feed");
                if (strK0 == null) {
                    strK0 = "";
                }
                iAdLandPagePreloadService.O0(C1552050qUV.LJ(strK0, channelName), null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
