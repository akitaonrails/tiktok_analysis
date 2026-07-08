package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ReportActionApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NT5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.util.EcGuidanceCard$genButtonClickListener$1$1$1", f = "EcGuidanceCard.kt", l = {248, 254, 261}, m = "invokeSuspend")
public final class C0NT5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C604680Nne LLILLL;
    public final /* synthetic */ ECGuidanceButton LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C770770ULj LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NT5(int i, C604680Nne c604680Nne, ECGuidanceButton eCGuidanceButton, Context context, C770770ULj c770770ULj, Function0<Unit> function0, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C0NT5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c604680Nne;
        this.LLILZ = eCGuidanceButton;
        this.LLILZIL = context;
        this.LLILZLL = c770770ULj;
        this.LLIZ = function0;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NT5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0NT3 c0nt3 = ReportActionApi.LIZ;
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c0nt3.LIZ(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.isSuccess()) {
            this.LLILLL.LIZLLL = true;
            if (C123100dR.LIZ(this.LLILZ.schema)) {
                SmartRouter.buildRoute(this.LLILZIL, this.LLILZ.schema).open();
            }
            C2238608ps c2238608ps = C2126308Ur.LJFF;
            C0NT7 c0nt7 = new C0NT7(this.LLILZLL, this.LLIZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, c2238608ps, c0nt7) == objLJFF) {
                C1C7U.LIZIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
                return objLJFF;
            }
        } else {
            String message = baseResponse.getMessage();
            if (message.length() <= 0) {
                message = this.LLILZIL.getString(2131848597);
            }
            C2238608ps c2238608ps2 = C2126308Ur.LJFF;
            C0NT6 c0nt6 = new C0NT6(this.LLILZLL, this.LLIZLLLIL, message, null);
            this.LL = 3;
            if (C23250099c.LJI(this, c2238608ps2, c0nt6) == objLJFF) {
                C1C7U.LIZIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcGuidanceCard@cba2.genButtonClickListener$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
