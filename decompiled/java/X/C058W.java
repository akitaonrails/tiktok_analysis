package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentLifecycleListenerImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentLifecycleListenerImpl$onRecordsInvalidated$1", f = "OfflineCommentLifecycleListenerImpl.kt", l = {37}, m = "invokeSuspend")
public final class C058W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ OfflineCommentLifecycleListenerImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058W(List<String> list, OfflineCommentLifecycleListenerImpl offlineCommentLifecycleListenerImpl, InterfaceC1364105Vn<? super C058W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = offlineCommentLifecycleListenerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C058W c058w = new C058W(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c058w.LLILLJJLI = obj;
        return c058w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("OfflineCommentLifecycleListenerImpl@3dd4.onRecordsInvalidated$1");
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
                List<String> list = this.LLILLL;
                C1396050mQt c1396050mQt = C1396050mQt.LIZ;
                this.LL = 1;
                if (c1396050mQt.LIZJ(list, this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineCommentLifecycleListenerImpl@3dd4.onRecordsInvalidated$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentLifecycleListenerImpl@3dd4.onRecordsInvalidated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
