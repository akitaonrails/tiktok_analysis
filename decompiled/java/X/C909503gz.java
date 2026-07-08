package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$payResultProcess$handleFailed$2$1", f = "PaymentResultProcess.kt", l = {1356}, m = "invokeSuspend")
public final class C909503gz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C912503hT LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C909503gz(C912503hT c912503hT, Context context, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C909503gz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c912503hT;
        this.LLILLL = context;
        this.LLILZ = function0;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909503gz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$2$1");
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
            C05XL<Boolean> c05xl = this.LLILLJJLI.LJII;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$2$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C842803Ra c842803Ra = C842803Ra.LIZ;
            String string = this.LLILLL.getString(2131832545);
            c842803Ra.getClass();
            C842803Ra.LIZJ(null, string);
        }
        this.LLILZ.invoke();
        C05XL<Unit> c05xl2 = this.LLILLJJLI.LJI;
        Unit unit = Unit.LIZ;
        c05xl2.LJIIZILJ(unit);
        Function1<Boolean, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(false);
        }
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
