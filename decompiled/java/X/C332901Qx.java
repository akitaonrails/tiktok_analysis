package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.utils.ECDrawableLoader$loadDrawable$3", f = "ECDrawableLoader.kt", l = {43}, m = "invokeSuspend")
public final class C332901Qx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;
    public final /* synthetic */ Function1<Object, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332901Qx(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332901Qx(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECDrawableLoader@89b4.loadDrawable$3");
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
            Object objInvoke = this.LLILLJJLI.invoke();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C333001Qy c333001Qy = new C333001Qy(objInvoke, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c333001Qy) == objLJFF) {
                C1C7U.LIZIZ("ECDrawableLoader@89b4.loadDrawable$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDrawableLoader@89b4.loadDrawable$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
