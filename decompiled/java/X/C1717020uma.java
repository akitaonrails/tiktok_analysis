package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InitializeAgreementRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InitializeAgreementResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssemViewModel$enableGeneralPostPayment$1", f = "GeneralPostPaymentAssemViewModel.kt", l = {55}, m = "invokeSuspend")
public final class C1717020uma extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GeneralPostPaymentGuideModel LLILLJJLI;
    public final /* synthetic */ InitializeAgreementRequest LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717020uma(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, InitializeAgreementRequest initializeAgreementRequest, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C1717020uma> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = generalPostPaymentGuideModel;
        this.LLILLL = initializeAgreementRequest;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717020uma(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralPostPaymentAssemViewModel@abe7.enableGeneralPostPayment$1");
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
            C1717050umd c1717050umd = GeneralPostPaymentApi.LIZ;
            GeneralPostPaymentGuideModel generalPostPaymentGuideModel = this.LLILLJJLI;
            String str = generalPostPaymentGuideModel.host;
            String str2 = generalPostPaymentGuideModel.token;
            InitializeAgreementRequest initializeAgreementRequest = this.LLILLL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LL = 1;
            c1717050umd.getClass();
            GeneralPostPaymentApi generalPostPaymentApiLIZ = C1717050umd.LIZ(str);
            if (generalPostPaymentApiLIZ != null) {
                obj = generalPostPaymentApiLIZ.initializeAgreement(str2, jCurrentTimeMillis, initializeAgreementRequest, this);
                if (obj != C099R.LJFF()) {
                    obj = (C0X52) obj;
                }
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GeneralPostPaymentAssemViewModel@abe7.enableGeneralPostPayment$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && c0x52.LIZJ() && Intrinsics.LJFF(((InitializeAgreementResponse) c0x52.LIZIZ).resultCode, "success")) {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = this.LLILZIL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralPostPaymentAssemViewModel@abe7.enableGeneralPostPayment$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
