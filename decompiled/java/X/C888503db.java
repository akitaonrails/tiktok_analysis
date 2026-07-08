package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.StorePaymentMethodRespContent;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888503db {
    public static Function0<Unit> LIZJ;
    public static IEventCenter LIZLLL;
    public static final C888503db LIZ = new C888503db();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"after_payment_title", "after_payment_instruction", "after_payment_enable_btn", "after_payment_source", "after_payment_scene", "after_payment_host", "after_payment_token"});
    public static final C889803do LJ = new InterfaceC1164530gPT() { // from class: X.03do
        @Override // X.InterfaceC1164530gPT
        public final void onEvent(String str, String str2) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive payment guide exit event ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            Function0<Unit> function0 = C888503db.LIZJ;
            C888503db.LIZ.getClass();
            C888503db.LIZ();
            if (function0 != null) {
                function0.invoke();
            }
        }
    };

    public static void LIZ() {
        IEventCenter iEventCenter = LIZLLL;
        LIZJ = null;
        LIZLLL = null;
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_checkout_guide_exit", LJ);
        }
    }

    public static MaterialCollectionInfo LIZIZ(StorePaymentMethodRespContent storePaymentMethodRespContent) {
        List<MaterialCollectionInfo> list;
        Object obj = null;
        if (storePaymentMethodRespContent == null || (list = storePaymentMethodRespContent.actionInfoList) == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) C13LP.LJJJJLI(list)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C888503db c888503db = LIZ;
            String str = ((MaterialCollectionInfo) next).action;
            c888503db.getClass();
            if (Intrinsics.LJFF(str, "BIOMETRIC") || Intrinsics.LJFF(str, "COLLECT_INFO")) {
                if (C123100dR.LIZ(str)) {
                    obj = next;
                    break;
                }
            }
        }
        return (MaterialCollectionInfo) obj;
    }

    public static String LIZLLL(String str) {
        Object obj;
        Object obj2 = null;
        try {
            if (str == null) {
                str = "";
            }
            String strOptString = new JSONObject(str).optString("redirect_url");
            boolean zLIZ = C123100dR.LIZ(strOptString);
            String str2 = strOptString;
            if (!zLIZ) {
                str2 = null;
            }
            C189200o6.m2constructorimpl(str2);
            obj = str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public static boolean LJ(EnterParams enterParams) {
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        if (enterParams == null) {
            return true;
        }
        if (!enterParams.LIZJ() && (((paymentMethodsData = enterParams.paymentData) == null || !paymentMethodsData.LJJII()) && !enterParams.LIZ() && ((paymentMethodsData2 = enterParams.paymentData) == null || !paymentMethodsData2.LJJIFFI()))) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Context context, String str, Map map, String str2, String str3, AwS545S0100000_1 awS545S0100000_1) {
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        String name;
        try {
            String string = C919503ib.LIZJ(str, map).toString();
            if (!SmartRouter.canOpen(string)) {
                awS545S0100000_1.invoke();
                return;
            }
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter == null) {
                awS545S0100000_1.invoke();
                return;
            }
            LIZ();
            LIZJ = awS545S0100000_1;
            LIZLLL = iEventCenter;
            iEventCenter.LIZLLL("ec_checkout_guide_exit", LJ);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, string);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IComplianceDependencyService.class.getName();
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
            smartRouteBuildRoute.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ();
            C1AF0.LJFF(e, str3);
            awS545S0100000_1.invoke();
        }
    }
}
