package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.goda.v2.model.vo.ClientScreen;
import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0vrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758390vrJ implements InterfaceC1018003yU {
    public static Object LIZLLL;
    public C11JF LIZIZ;
    public long LIZJ = -1;

    public static final C1758370vrH LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        boolean z3;
        String name;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        Float fValueOf = Float.valueOf(C1336100ksC.LIZJ(applicationContext));
        Float fValueOf2 = Float.valueOf(C1336100ksC.LIZIZ(applicationContext));
        Float fValueOf3 = Float.valueOf(1.0f);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name2 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ClientScreen clientScreen = new ClientScreen(fValueOf, fValueOf2, fValueOf3, Boolean.valueOf(((IApplicationDependencyService) iECommerceHostService2).isPad()));
        InterfaceC1758450vrP.LIZ.getClass();
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        return C1758310vrB.LJJJJ(pdpEnterParam, false, 0, z, Boolean.TRUE, pdpEnterParam.selectedAddressId, 1, new C04J0(), new GodaV2RequestParams(clientScreen, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C19EG r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r26) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758390vrJ.LIZJ(X.19EG, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    public static final boolean LIZIZ(C19EG c19eg, C1758370vrH c1758370vrH, IPdpStarter.PdpEnterParam pdpEnterParam, long j) throws Throwable {
        ProductPackStruct productPackStruct;
        String str;
        if (c1758370vrH.LIZLLL != null) {
            if (TextUtils.isEmpty(pdpEnterParam.chainKey) && (productPackStruct = c1758370vrH.LIZLLL) != null && (str = productPackStruct.chainKey) != null) {
                Map<String, Object> map = pdpEnterParam.visitReportParams;
                if (map != null) {
                    map.put("chain_key", str);
                }
                pdpEnterParam.setChainKey(str);
            }
            InterfaceC1758450vrP.LIZ.getClass();
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            C1758310vrB.LJJIL(c1758370vrH.LIZ);
            LIZLLL(c19eg, pdpEnterParam, c1758370vrH.LIZLLL, j, c1758370vrH.LIZIZ, 0);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C19EG r10, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r11, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r12, long r13, int r15, int r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758390vrJ.LIZLLL(X.19EG, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, long, int, int):void");
    }
}
