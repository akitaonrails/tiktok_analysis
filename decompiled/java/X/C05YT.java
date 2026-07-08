package X;

import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.CancelableJobImpl$cancelAndJoin$1", f = "CancelableJobImpl.kt", l = {40}, m = "invokeSuspend")
public final class C05YT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CancelableJobImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YT(CancelableJobImpl cancelableJobImpl, InterfaceC1364105Vn<? super C05YT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cancelableJobImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05YT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CancelableJobImpl@2425.cancelAndJoin$1");
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
            C09AE job$engine_release = this.LLILLJJLI.getJob$engine_release();
            if (job$engine_release != null) {
                this.LL = 1;
                if (C23118094a.LIZLLL(job$engine_release, this) == objLJFF) {
                    C1C7U.LIZIZ("CancelableJobImpl@2425.cancelAndJoin$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("CancelableJobImpl@2425.cancelAndJoin$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("CancelableJobImpl@2425.cancelAndJoin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
