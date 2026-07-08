package X;

import Y.AfS152S0200000_16;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;

/* JADX INFO: renamed from: X.0cq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1027230cq1 extends AbstractC1027370cqF {
    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        IBOCFrequencyControlUtils iBOCFrequencyControlUtils;
        if (LJI() == null || !C2079308Cp.LIZ(LJ().LIZIZ.LIZ)) {
            return false;
        }
        AwemeRawAd awemeRawAdLJI = LJI();
        if (((awemeRawAdLJI == null || !awemeRawAdLJI.isOpenSystemBrowser()) && ((iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null)) == null || !iBOCFrequencyControlUtils.LJFF(LJI(), LJ().LJ.LIZIZ))) || ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).bv(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(LJ().LIZ.LJIIIIZZ), LJ().LJ.LIZ, LJ().LJ.LIZIZ, false)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return !UriProtector.parse(LJ().LIZIZ.LIZ).getBooleanQueryParameter("disable_boc", false);
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        String creativeIdStr;
        IBOCFrequencyControlUtils iBOCFrequencyControlUtils;
        String string;
        C1040770dBr c1040770dBrLJII = AdWebLogService.LJIIIZ().LJII();
        boolean zLJFF = AdWebLogService.LJIIIZ().LJFF();
        AwemeRawAd awemeRawAdLJI = LJI();
        String str = "";
        if (awemeRawAdLJI == null || (creativeIdStr = awemeRawAdLJI.getCreativeIdStr()) == null) {
            creativeIdStr = "";
        }
        AwemeRawAd awemeRawAdLJI2 = LJI();
        String logExtra = awemeRawAdLJI2 != null ? awemeRawAdLJI2.getLogExtra() : null;
        String str2 = LJ().LJ.LIZIZ;
        AwemeRawAd awemeRawAdLJI3 = LJI();
        c1040770dBrLJII.LIZIZ(creativeIdStr, logExtra, str2, awemeRawAdLJI3 != null ? awemeRawAdLJI3.getRedirectOriginUrl() : null);
        if (!zLJFF) {
            C2214201BlK.LIZLLL().LJJLJLI(new AfS152S0200000_16(c1040770dBrLJII, this, 4));
        }
        Context contextLIZLLL = LIZLLL();
        String str3 = LJ().LIZIZ.LIZ;
        Boolean boolValueOf = Boolean.valueOf(LJ().LIZIZ.LJJIJIIJIL);
        Integer numLIZ = C1025770cnf.LIZ(LJ().LIZ.LJIIJJI, EnumC1027330cqB.APP2APP);
        if (numLIZ != null && (string = numLIZ.toString()) != null) {
            str = string;
        }
        boolean zLJJII = AbstractC1025070cmX.LJJII(contextLIZLLL, str3, str, boolValueOf);
        if (zLJJII && (iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null)) != null) {
            iBOCFrequencyControlUtils.LIZLLL();
        }
        return zLJJII;
    }

    public final AwemeRawAd LJI() {
        Aweme aweme;
        AwemeRawAd awemeRawAd = LJ().LIZ.LIZ;
        if (awemeRawAd != null) {
            return awemeRawAd;
        }
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ == null || (aweme = c1019830ce5LIZ.LJIIL) == null) {
            return null;
        }
        return aweme.getAwemeRawAd();
    }
}
