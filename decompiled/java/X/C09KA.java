package X;

import Y.AgS284S0100000_3;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09KA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DCStateBinderKt$bindDCToState$1", f = "DCStateBinder.kt", l = {90}, m = "invokeSuspend")
public final class C09KA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0OI6<Object> LLILLJJLI;
    public final /* synthetic */ Function1<Function1<Object, Object>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09KA(C0OI6<Object> c0oi6, Function1<? super Function1<Object, Object>, Unit> function1, InterfaceC1364105Vn<? super C09KA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0oi6;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09KA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DCStateBinderKt@f3f.bindDCToState$1");
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
            InterfaceC346201Wa[] interfaceC346201WaArr = (InterfaceC346201Wa[]) ((ArrayList) this.LLILLJJLI.LIZIZ).toArray(new InterfaceC346201Wa[0]);
            C23127094j c23127094jLJJII = C09IC.LJJII((InterfaceC346201Wa[]) Arrays.copyOf(interfaceC346201WaArr, interfaceC346201WaArr.length));
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLL, 6);
            this.LL = 1;
            if (c23127094jLJJII.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("DCStateBinderKt@f3f.bindDCToState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DCStateBinderKt@f3f.bindDCToState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
