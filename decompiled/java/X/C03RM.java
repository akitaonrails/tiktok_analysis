package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03RM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RM extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ PaymentMethod LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CommuteType LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C03WH LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03RM(Context context, PaymentMethod paymentMethod, String str, CommuteType commuteType, String str2, String str3, boolean z, C03WH c03wh) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = paymentMethod;
        this.LLILLL = str;
        this.LLILZ = commuteType;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = z;
        this.LLIZLLLIL = c03wh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C03WH c03wh;
        String str2;
        String str3 = str;
        if (str3 != null && C770702zh.LIZ(str3)) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = this.LL;
            PaymentMethod paymentMethod = this.LLILLJJLI;
            PaymentBindHelper.LJI(paymentBindHelper, context, paymentMethod.LJIILLIIL, this.LLILLL, str3, this.LLILZ, this.LLILZIL, paymentMethod.id, this.LLILZLL, null, null, null, false, null, null, paymentMethod.displayName, 16128);
            if (this.LLIZ && (c03wh = this.LLIZLLLIL) != null) {
                String strLJJIIZ = this.LLILLJJLI.LJJIIZ();
                Boolean boolValueOf = Boolean.valueOf(C770702zh.LIZ(this.LLILLJJLI.extraInfo));
                PaymentMethod paymentMethod2 = this.LLILLJJLI;
                BindInfo bindInfo = paymentMethod2.bindInfo;
                if (bindInfo != null) {
                    str2 = bindInfo.bindStatus;
                } else {
                    str2 = null;
                }
                C03WH.LJ(c03wh, strLJJIIZ, boolValueOf, str2, null, paymentMethod2, null, 40);
            }
        }
        return Unit.LIZ;
    }
}
