package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724230uyD {
    public static JSONObject LIZIZ;
    public static final String LIZLLL;
    public static final C1724230uyD LIZ = new C1724230uyD();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    static {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2;
        String strLJI;
        SettingsManager.LIZLLL().getClass();
        if (u.LJJIIJZLJL(SettingsManager.LJI("ecom_dynamic_pipo_host", ""), "http", false)) {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ecom_dynamic_pipo_host", "");
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            if (((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).isUS()) {
                strLJI = "https://fp.pipopayment.us";
            } else {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                }
                strLJI = !((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2).isInTikTokRegion() ? "https://f-p-va.isnssdk.com" : "https://f-p.sgsnssdk.com";
            }
        }
        LIZLLL = strLJI;
    }

    public static C931003kS LIZ() {
        C931003kS c931003kS = C932203ke.LIZ;
        c931003kS.getClass();
        if (!C1724150uy5.LJIIL.LJIIJJI) {
            C1AF0.LIZJ("EcommerceService hasn't init");
        }
        return c931003kS;
    }

    public static List LIZIZ(PaymentMethodsData paymentMethodsData) {
        ArrayList arrayList;
        Integer numValueOf;
        List<PaymentMethod> list;
        List<PaymentMethod> list2 = paymentMethodsData.paymentMethods;
        PaymentMethod paymentMethod = null;
        if (list2 != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = null;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentSdkProcess init methods len ");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (C03YW.LIZ()) {
            boolean z = false;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((PaymentMethod) it2.next()).id, "pm_pi_ccdc_all")) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("needAddCardCCDC ");
            sbLIZ2.append(z);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            CreditInfo creditInfo = paymentMethodsData.creditInfo;
            if (creditInfo != null && (list = creditInfo.paymentMethods) != null) {
                Iterator<PaymentMethod> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    PaymentMethod next = it3.next();
                    if (Intrinsics.LJFF(next.id, "pm_pi_ccdc_all")) {
                        paymentMethod = next;
                        break;
                    }
                }
            }
            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("creditCCDC ");
            sbLIZ3.append(paymentMethod);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c2341109Fh3.getClass();
            C2341109Fh.LIZ(strLIZIZ3);
            if (z && paymentMethod != null) {
                if (arrayList != null) {
                    arrayList.add(paymentMethod);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("add creditCCDC ");
                sbLIZ4.append(arrayList);
                C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r14) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1724230uyD.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[PHI: r2
      0x0078: PHI (r2v11 java.util.Map<java.lang.String, java.lang.String>) = (r2v10 java.util.Map<java.lang.String, java.lang.String>), (r2v46 java.util.Map<java.lang.String, java.lang.String>) binds: [B:12:0x0073, B:14:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C1724230uyD r20, X.C1724180uy8 r21) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1724230uyD.LIZLLL(X.0uyD, X.0uy8):void");
    }
}
