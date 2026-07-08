package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper$handleAppealClick$1$appealLink$1", f = "PaymentAppealHelper.kt", l = {253}, m = "invokeSuspend")
public final class C912803hW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC913203ha LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912803hW(String str, PaymentMethod paymentMethod, String str2, EnumC913203ha enumC913203ha, String str3, InterfaceC1364105Vn<? super C912803hW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = paymentMethod;
        this.LLILZ = str2;
        this.LLILZIL = enumC913203ha;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912803hW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("PaymentAppealHelper@457b.handleAppealClick$1$appealLink$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PaymentAppealHelper paymentAppealHelper = PaymentAppealHelper.LIZ;
            String str2 = this.LLILLJJLI;
            PaymentMethod paymentMethod = this.LLILLL;
            String str3 = paymentMethod.token;
            String str4 = this.LLILZ;
            EnumC913203ha enumC913203ha = this.LLILZIL;
            String str5 = paymentMethod.appealId;
            String str6 = this.LLILZLL;
            this.LL = 1;
            obj = paymentAppealHelper.LIZJ(str2, str3, str4, enumC913203ha, str5, str6, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1$appealLink$1");
                return objLJFF;
            }
        }
        PaymentAppealHelper.AppealInfo appealInfo = (PaymentAppealHelper.AppealInfo) obj;
        if (appealInfo != null) {
            str = appealInfo.appealLink;
        } else {
            str = null;
        }
        C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1$appealLink$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
