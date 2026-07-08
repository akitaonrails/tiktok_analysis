package X;

import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01U1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM$queryBatchAweme$1$1", f = "NimbleVM.kt", l = {}, m = "invokeSuspend")
public final class C01U1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<BatchDetailList, Unit> LL;
    public final /* synthetic */ BatchDetailList LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01U1(Function1<? super BatchDetailList, Unit> function1, BatchDetailList batchDetailList, InterfaceC1364105Vn<? super C01U1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = batchDetailList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01U1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("NimbleVM@82c8.queryBatchAweme$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<BatchDetailList, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
