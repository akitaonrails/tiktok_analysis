package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$collectStreamWithRetry$2$1$2", f = "StreamFetchOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C1633490sbr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1633470sbp LLILLJJLI;
    public final /* synthetic */ InterfaceC1633610sc3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633490sbr(C1633470sbp c1633470sbp, InterfaceC1633610sc3 interfaceC1633610sc3, InterfaceC1364105Vn<? super C1633490sbr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1633470sbp;
        this.LLILLL = interfaceC1633610sc3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633490sbr c1633490sbr = new C1633490sbr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1633490sbr.LL = obj;
        return c1633490sbr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LLILLJJLI.LIZJ.LIZIZ(((C1633580sc0) this.LLILLL).LIZIZ, EnumC1641410sod.HORIZONTAL);
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
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
