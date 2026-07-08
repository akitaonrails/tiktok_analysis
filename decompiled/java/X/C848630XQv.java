package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.appdiff.IDramaNonLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848630XQv extends AbstractC19263910Yb {
    public final C1962707mT LIZIZ;

    public C848630XQv(C1962707mT c1962707mT) {
        super(true);
        this.LIZIZ = c1962707mT;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // X.AbstractC19263910Yb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1950707kX r5) {
        /*
            r4 = this;
            java.lang.String r0 = "LoginNode"
            X.C19263710Xz.LIZJ(r0)
            android.app.Activity r1 = r5.LIZ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2
            if (r0 == 0) goto L3b
            java.lang.String r3 = "from_app_link"
        Ld:
            android.net.Uri r2 = r5.LIZIZ
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ICredentialManagerService> r0 = com.ss.android.ugc.aweme.ICredentialManagerService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.ICredentialManagerService r0 = (com.ss.android.ugc.aweme.ICredentialManagerService) r0
            boolean r0 = r0.LJI(r2)
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ICredentialManagerService> r0 = com.ss.android.ugc.aweme.ICredentialManagerService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ICredentialManagerService r1 = (com.ss.android.ugc.aweme.ICredentialManagerService) r1
            r0 = 1
            r1.LJIILLIIL(r0)
        L31:
            X.10ZH r2 = X.C10ZH.LIZIZ
            android.app.Activity r1 = r5.LIZ
            X.07mT r0 = r4.LIZIZ
            r2.LJJIJIL(r1, r3, r0)
            return
        L3b:
            boolean r0 = r1 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L4d
            X.07HJ r0 = X.C07HJ.LIZ
            r0.getClass()
            boolean r0 = X.C07HJ.LIZ()
            if (r0 == 0) goto L4d
            java.lang.String r3 = "from_main_activity_deep_link"
            goto Ld
        L4d:
            java.lang.String r3 = "from_deep_link"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C848630XQv.LIZIZ(X.07kX):void");
    }

    @Override // X.AbstractC19263910Yb
    public final boolean LIZJ(C1950707kX c1950707kX) {
        Object c098200Yq;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1950707kX.LIZIZ, "SHORTCUT_NEED_LOGIN");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "";
        }
        if (Intrinsics.LJFF("SHORTCUT_NEED_LOGIN_NO", c098200Yq)) {
            return false;
        }
        IDramaNonLoginService.LIZ.getClass();
        IDramaNonLoginService downgradeInstance = (IDramaNonLoginService) PluggableExtentionKt.pluggableSpi$default(IDramaNonLoginService.class, false, false, false, 14, null);
        if (downgradeInstance == null) {
            downgradeInstance = new IDramaNonLoginService.DowngradeInstance();
        }
        downgradeInstance.LIZ();
        return C848610XQt.LIZIZ(c1950707kX.LIZIZ);
    }
}
