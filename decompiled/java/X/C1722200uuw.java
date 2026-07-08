package X;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0uuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722200uuw {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC1722210uux interfaceC1722210uux) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        try {
            try {
                String btmCode = interfaceC1722210uux.getBtmCode();
                if (btmCode != null) {
                    String name = null;
                    if (interfaceC1722210uux instanceof Activity) {
                        BtmSDK btmSDK = BtmSDK.INSTANCE;
                        Activity activity = (Activity) interfaceC1722210uux;
                        Intent intent = ((Activity) interfaceC1722210uux).getIntent();
                        if (intent != null) {
                            try {
                                name = intent.getStringExtra("source_btm_token");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        btmSDK.registerBtmPageOnCreate(activity, btmCode, name);
                        return;
                    }
                    if (interfaceC1722210uux instanceof Fragment) {
                        BtmSDK.INSTANCE.registerBtmPageOnCreate((Fragment) interfaceC1722210uux, btmCode, C817703Hj.LIZ((Fragment) interfaceC1722210uux));
                        return;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                        IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                        if (iECommerceHostService2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService2 != null) {
                            name = iECommerceHostService2.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                        iECommerceHostService = (IECommerceHostService) service;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
                        C1AF0.LIZJ("this is not validate Btm Page， btm page is fragment or activity!");
                        return;
                    }
                    throw new IllegalAccessError("this is not validate Btm Page， btm page is fragment or activity!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }
}
