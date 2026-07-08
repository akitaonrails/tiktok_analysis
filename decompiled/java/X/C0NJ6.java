package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0NJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.store.PDPOptionalStateDelegate$getValue$1", f = "PDPOptionalStateDelegate.kt", l = {23}, m = "invokeSuspend")
public final class C0NJ6<T> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ8<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJ6(C0NJ8<T> c0nj8, InterfaceC1364105Vn<? super C0NJ6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJ6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPOptionalStateDelegate@81cb.getValue$1");
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
            C0NJ8<T> c0nj8 = this.LLILLJJLI;
            C0NJE c0nje = c0nj8.LL;
            String str = c0nj8.LLILLJJLI;
            this.LL = 1;
            obj = c0nje.LIZ(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PDPOptionalStateDelegate@81cb.getValue$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PDPOptionalStateDelegate@81cb.getValue$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
