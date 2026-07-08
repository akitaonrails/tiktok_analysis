package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.08gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowMatchAPI$runNetWorkSafely$2", f = "ConnectNowMatchAPI.kt", l = {29}, m = "invokeSuspend")
public final class C2180008gQ<R> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super R>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super R>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2180008gQ(Function1<? super InterfaceC1364105Vn<? super R>, ? extends Object> function1, InterfaceC1364105Vn<? super C2180008gQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2180008gQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowMatchAPI@8ee2.runNetWorkSafely$2");
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
            Function1<InterfaceC1364105Vn<? super R>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ConnectNowMatchAPI@8ee2.runNetWorkSafely$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ConnectNowMatchAPI@8ee2.runNetWorkSafely$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
