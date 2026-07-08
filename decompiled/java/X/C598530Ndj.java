package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.api.utils.ActivityStatusClientLazyRef$replaceAllObserverOpt$1", f = "ActivityStatusClientLazyRef.kt", l = {82}, m = "invokeSuspend")
public final class C598530Ndj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, Object> LLILLJJLI;
    public final /* synthetic */ C897520ZIw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598530Ndj(Function1<? super InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, ? extends Object> function1, C897520ZIw c897520ZIw, InterfaceC1364105Vn<? super C598530Ndj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = c897520ZIw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598530Ndj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusClientLazyRef@daa.replaceAllObserverOpt$1");
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
            Function1<InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusClientLazyRef@daa.replaceAllObserverOpt$1");
                return objLJFF;
            }
        }
        this.LLILLL.LJIIIIZZ((List) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusClientLazyRef@daa.replaceAllObserverOpt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
