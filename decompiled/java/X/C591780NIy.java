package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0NIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.store.PDPPageStateStore$getValue$1", f = "PDPPageStateStore.kt", l = {55}, m = "invokeSuspend")
public final class C591780NIy<T> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591780NIy(C0NJ9 c0nj9, String str, InterfaceC1364105Vn<? super C591780NIy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj9;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591780NIy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPPageStateStore@55c5.getValue$1");
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
            C0NJE c0nje = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0nje.LIZ(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PDPPageStateStore@55c5.getValue$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PDPPageStateStore@55c5.getValue$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
