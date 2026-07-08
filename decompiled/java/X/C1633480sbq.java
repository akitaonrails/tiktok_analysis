package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$collectStreamWithRetry$2$1$7", f = "StreamFetchOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C1633480sbq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1633470sbp LLILLJJLI;
    public final /* synthetic */ C1633600sc2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633480sbq(C1633470sbp c1633470sbp, C1633600sc2 c1633600sc2, InterfaceC1364105Vn<? super C1633480sbq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1633470sbp;
        this.LLILLL = c1633600sc2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633480sbq c1633480sbq = new C1633480sbq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1633480sbq.LL = obj;
        return c1633480sbq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LLILLJJLI.LIZJ.LIZIZ(this.LLILLL.LIZ, EnumC1641410sod.COMBINED);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            thM5exceptionOrNullimpl.toString();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
