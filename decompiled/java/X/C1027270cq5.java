package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cct.IOpenCCTUtils;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0cq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027270cq5 extends AbstractC1027370cqF {
    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        BrowserConfig browserConfig;
        IOpenCCTUtils iOpenCCTUtils;
        if (!C2079308Cp.LIZ(LJ().LIZIZ.LIZ)) {
            return false;
        }
        String str = LJ().LIZIZ.LJJIJL;
        if (LJ().LJ.LIZJ != 1 && TextUtils.isEmpty(str) && ((iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null)) == null || !iOpenCCTUtils.LIZ(LJ().LIZIZ.LIZ))) {
            return false;
        }
        try {
            browserConfig = (BrowserConfig) C08JS.LIZIZ().LJII(str, BrowserConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            browserConfig = null;
        }
        if (LJ().LJ.LIZJ == 1) {
            browserConfig = new BrowserConfig(1, 0, null, null, 0L);
        }
        return ((IOpenCCTUtils) ServiceManager.get().getService(IOpenCCTUtils.class)).LIZJ(LJ().LIZIZ.LIZ, browserConfig, String.valueOf(LJ().LIZ.LIZJ), LJ().LIZ.LIZLLL);
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        BrowserConfig browserConfig;
        IOpenCCTUtils iOpenCCTUtils;
        String str = LJ().LIZIZ.LJJIJL;
        if (LJ().LJ.LIZJ != 1 && TextUtils.isEmpty(str) && ((iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null)) == null || !iOpenCCTUtils.LIZ(LJ().LIZIZ.LIZ))) {
            return false;
        }
        try {
            browserConfig = (BrowserConfig) C08JS.LIZIZ().LJII(str, BrowserConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            browserConfig = null;
        }
        if (LJ().LJ.LIZJ == 1) {
            browserConfig = new BrowserConfig(1, 0, null, null, 0L);
        }
        boolean z = LJ().LIZIZ.LJIJJ == 1 || LJ().LIZIZ.LJIJI != 1;
        IOpenCCTUtils iOpenCCTUtils2 = (IOpenCCTUtils) ServiceManager.get().getService(IOpenCCTUtils.class);
        Context contextLIZLLL = LIZLLL();
        String str2 = LJ().LIZIZ.LIZ;
        String strValueOf = String.valueOf(LJ().LIZ.LIZJ);
        String str3 = LJ().LIZ.LIZLLL;
        String str4 = LJ().LJ.LIZIZ;
        boolean z2 = LJ().LIZIZ.LJJIJIIJIL;
        Integer numLIZ = C1025770cnf.LIZ(LJ().LIZ.LJIIJJI, EnumC1027330cqB.WEBJUMP);
        return iOpenCCTUtils2.LIZIZ(contextLIZLLL, LSPassThroughRecordSizeConfig.DEFAULT, str2, browserConfig, strValueOf, str3, str4, z2, z, numLIZ != null ? numLIZ.toString() : null);
    }
}
