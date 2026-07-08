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
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C442201no extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GeneralPostPaymentGuideModel LL;
    public final /* synthetic */ GeneralPostPaymentAssem LLILLJJLI;
    public final /* synthetic */ C1722180uuu LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442201no(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, GeneralPostPaymentAssem generalPostPaymentAssem, C1722180uuu c1722180uuu, View view) {
        super(0);
        this.LL = generalPostPaymentGuideModel;
        this.LLILLJJLI = generalPostPaymentAssem;
        this.LLILLL = c1722180uuu;
        this.LLILZ = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        LifecycleCoroutineScope lifecycleScope;
        String str = this.LL.successToast;
        if (str != null) {
            GeneralPostPaymentAssem generalPostPaymentAssem = this.LLILLJJLI;
            C1722180uuu c1722180uuu = this.LLILLL;
            generalPostPaymentAssem.getClass();
            if (!Intrinsics.LJFF(c1722180uuu.LLIZLLLIL, "BACKUP_PAYMENT") || !c1722180uuu.LLILLJJLI) {
                GeneralPostPaymentAssem generalPostPaymentAssem2 = this.LLILLJJLI;
                View view = this.LLILZ;
                generalPostPaymentAssem2.getClass();
                C19EG c19egLIZ = C724240Sb0.LIZ(generalPostPaymentAssem2);
                if (c19egLIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZ)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, null, null, new C435501mj(view, str, null), 3);
                }
            }
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject = new JSONObject();
            GeneralPostPaymentGuideModel generalPostPaymentGuideModel = this.LL;
            GeneralPostPaymentAssem generalPostPaymentAssem3 = this.LLILLJJLI;
            C1722180uuu c1722180uuu2 = this.LLILLL;
            jSONObject.put("from", "info_collect");
            jSONObject.put("action", "enable");
            jSONObject.put("result", true);
            String str2 = generalPostPaymentGuideModel.successToast;
            if (str2 != null) {
                generalPostPaymentAssem3.getClass();
                if (Intrinsics.LJFF(c1722180uuu2.LLIZLLLIL, "BACKUP_PAYMENT") && c1722180uuu2.LLILLJJLI) {
                    jSONObject.put("success_toast", str2);
                }
            }
            iEventCenter.LIZ("ec_checkout_guide_exit", C786410Ut5.J3(jSONObject));
        }
        this.LLILLJJLI.Lo();
        return Unit.LIZ;
    }
}
