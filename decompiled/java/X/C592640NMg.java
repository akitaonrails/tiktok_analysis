package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.trill.feedback.api.HistoryResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.trill.feedback.control.RequestManager$fetchFaqHistoryRecord$1", f = "RequestManager.kt", l = {59}, m = "invokeSuspend")
public final class C592640NMg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<HistoryResponse, Unit> LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C592640NMg(Function1<? super HistoryResponse, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C592640NMg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592640NMg c592640NMg = new C592640NMg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c592640NMg.LLILLJJLI = obj;
        return c592640NMg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RequestManager@5ba.fetchFaqHistoryRecord$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC592660NMi interfaceC592660NMi = (InterfaceC592660NMi) C592650NMh.LIZIZ.getValue();
                this.LL = 1;
                obj = interfaceC592660NMi.LIZ("tiktok-android", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RequestManager@5ba.fetchFaqHistoryRecord$1");
                    return objLJFF;
                }
            }
            c098200Yq = (HistoryResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<HistoryResponse, Unit> function1 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq) && function1 != null) {
            function1.invoke((HistoryResponse) c098200Yq);
        }
        Function1<Throwable, Unit> function12 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && function12 != null) {
            function12.invoke(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestManager@5ba.fetchFaqHistoryRecord$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
