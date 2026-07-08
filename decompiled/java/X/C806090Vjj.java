package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.trace.TraceLogUploadResponse;
import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$uploadRightNowWith10kbLimit$2", f = "TraceLogImpl.kt", l = {257, 265}, m = "invokeSuspend")
public final class C806090Vjj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TraceLogUploadResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TraceLogImpl LLILLL;
    public final /* synthetic */ List<TraceItem> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806090Vjj(TraceLogImpl traceLogImpl, List<TraceItem> list, InterfaceC1364105Vn<? super C806090Vjj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = traceLogImpl;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C806090Vjj c806090Vjj = new C806090Vjj(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c806090Vjj.LLILLJJLI = obj;
        return c806090Vjj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c098200Yq = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$2");
                    return c189200o6M1boximpl;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TraceLogImpl traceLogImpl = this.LLILLL;
            C806080Vji c806080Vji = new C806080Vji(this.LLILZ, null);
            this.LL = 1;
            obj = traceLogImpl.LJ(3, this, c806080Vji);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$2");
                return objLJFF;
            }
        }
        c098200Yq = (TraceLogUploadResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        TraceLogImpl traceLogImpl2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C806020Vjc c806020Vjc = traceLogImpl2.LJIIJJI;
            this.LLILLJJLI = c098200Yq;
            this.LL = 2;
            if (c806020Vjc.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$2");
                return objLJFF;
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("TraceLogImpl@8707.uploadRightNowWith10kbLimit$2");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TraceLogUploadResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
