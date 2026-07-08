package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C906803gY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C897703f5 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906803gY(String str, C897703f5 c897703f5, String str2, String str3, boolean z, String str4, Context context) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c897703f5;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = str4;
        this.LLIZ = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        PaymentMethod paymentMethod;
        String strLJJIIZ = null;
        if (C925303jX.LIZ()) {
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            String value = EnumC899203fK.FAIL.getValue();
            String str = this.LL;
            PaymentInfo paymentInfo = this.LLILLJJLI.LJI;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            }
            iEventCenter.LIZ("ec_common_pay_result", C1741890vQh.LJIIIIZZ(new EcomPaymentInterceptor.CommonPayResultEvent(value, str, strLJJIIZ, "h5", this.LLILLL, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.TRUE, this.LLILZ, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE)));
        } else if (this.LLILZIL) {
            PaymentResult paymentResult = new PaymentResult("fail", this.LL);
            String str2 = this.LLILZLL;
            HashMap map = new HashMap();
            map.put("pay_route", "h5");
            map.put("pay_result", paymentResult);
            String string = C919503ib.LIZLLL(str2, map).toString();
            Context context = this.LLIZ;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IBusinessDependencyService.class.getName(), anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
            }
            IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime2, 1, IComplianceDependencyService.class.getName(), anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            iBusinessDependencyService.bulletStart(context, string, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
        }
        return Unit.LIZ;
    }
}
