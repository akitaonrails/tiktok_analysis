package X;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C442101nn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GeneralPostPaymentGuideModel LL;
    public final /* synthetic */ GeneralPostPaymentAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442101nn(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, GeneralPostPaymentAssem generalPostPaymentAssem, View view) {
        super(0);
        this.LL = generalPostPaymentGuideModel;
        this.LLILLJJLI = generalPostPaymentAssem;
        this.LLILLL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        LifecycleCoroutineScope lifecycleScope;
        String str = this.LL.failToast;
        if (str != null) {
            GeneralPostPaymentAssem generalPostPaymentAssem = this.LLILLJJLI;
            View view = this.LLILLL;
            C19EG c19egLIZ = C724240Sb0.LIZ(generalPostPaymentAssem);
            if (c19egLIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZ)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C435601mk(view, str, null), 3);
            }
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", "backup_payment");
            jSONObject.put("action", "enable");
            jSONObject.put("result", false);
            iEventCenter.LIZ("ec_checkout_guide_exit", C786410Ut5.J3(jSONObject));
        }
        this.LLILLJJLI.Lo();
        return Unit.LIZ;
    }
}
