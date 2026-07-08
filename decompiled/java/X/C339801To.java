package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.handler.MallHistoryRecordHandler$loadAsync$2", f = "MallHistoryRecordHandler.kt", l = {37}, m = "invokeSuspend")
public final class C339801To extends C09AX implements Function2<Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C339801To(Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C339801To> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C339801To c339801To = new C339801To(this.LLILLL, interfaceC1364105Vn);
        c339801To.LLILLJJLI = obj;
        return c339801To;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MallHistoryRecordHandler@be23.loadAsync$2");
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
            Throwable th = (Throwable) this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C339901Tp c339901Tp = new C339901Tp(th, null, this.LLILLL);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c339901Tp) == objLJFF) {
                C1C7U.LIZIZ("MallHistoryRecordHandler@be23.loadAsync$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MallHistoryRecordHandler@be23.loadAsync$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(th, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
