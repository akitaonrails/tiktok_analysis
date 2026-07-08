package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.logicslice.track.ECMMKTrackReporter$reportBffEventGroup$4", f = "ECMMKTrackReporter.kt", l = {115}, m = "invokeSuspend")
public final class C862340XsG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1774890wHv LLILLJJLI;
    public final /* synthetic */ C1774920wHy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862340XsG(C1774890wHv c1774890wHv, C1774920wHy c1774920wHy, InterfaceC1364105Vn<? super C862340XsG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1774890wHv;
        this.LLILLL = c1774920wHy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862340XsG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKTrackReporter@1e09.reportBffEventGroup$4");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LIZJ;
            C1774920wHy c1774920wHy = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c1774920wHy, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKTrackReporter@1e09.reportBffEventGroup$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKTrackReporter@1e09.reportBffEventGroup$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
