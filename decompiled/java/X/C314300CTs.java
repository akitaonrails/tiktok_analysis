package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$observerEvent$2$1", f = "GoodyBagPresenter.kt", l = {255}, m = "invokeSuspend")
public final class C314300CTs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1104590eqn LLILLJJLI;
    public final /* synthetic */ AbstractC1095150ebZ LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314300CTs(C1104590eqn c1104590eqn, AbstractC1095150ebZ abstractC1095150ebZ, long j, InterfaceC1364105Vn<? super C314300CTs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1104590eqn;
        this.LLILLL = abstractC1095150ebZ;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314300CTs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoodyBagPresenter@6f83.observerEvent$2$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C314310CTt c314310CTt = new C314310CTt(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c314310CTt) == objLJFF) {
                C1C7U.LIZIZ("GoodyBagPresenter@6f83.observerEvent$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.observerEvent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
