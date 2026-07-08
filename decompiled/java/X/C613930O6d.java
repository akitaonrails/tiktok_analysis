package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.runner.network.NetworkRunner$onNetworkStateChange$1", f = "NetworkRunner.kt", l = {148}, m = "invokeSuspend")
public final class C613930O6d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0O68 LLILLJJLI;
    public final /* synthetic */ C614000O6k LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613930O6d(C0O68 c0o68, C614000O6k c614000O6k, InterfaceC1364105Vn<? super C613930O6d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0o68;
        this.LLILLL = c614000O6k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613930O6d(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkRunner@7f7b.onNetworkStateChange$1");
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
            if (this.LLILLJJLI == C0O68.AVAILABLE) {
                C1DEK c1dek = this.LLILLL.LIZIZ;
                this.LL = 1;
                if (c1dek.LJIJI(true, this) == objLJFF) {
                    C1C7U.LIZIZ("NetworkRunner@7f7b.onNetworkStateChange$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkRunner@7f7b.onNetworkStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
