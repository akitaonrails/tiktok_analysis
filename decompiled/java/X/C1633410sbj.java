package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$handleError$2$1", f = "StreamFetchOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C1633410sbj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1633470sbp LLILLJJLI;
    public final /* synthetic */ InterfaceC1633630sc5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633410sbj(C1633470sbp c1633470sbp, InterfaceC1633630sc5 interfaceC1633630sc5, InterfaceC1364105Vn<? super C1633410sbj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1633470sbp;
        this.LLILLL = interfaceC1633630sc5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633410sbj c1633410sbj = new C1633410sbj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1633410sbj.LL = obj;
        return c1633410sbj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StreamFetchOrchestrator@9130.handleError$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1633470sbp c1633470sbp = this.LLILLJJLI;
        try {
            c1633470sbp.LIZJ.LIZ(this.LLILLL);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1633470sbp c1633470sbp2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            Function1<String, Unit> function1 = c1633470sbp2.LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportMetrics failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.handleError$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
