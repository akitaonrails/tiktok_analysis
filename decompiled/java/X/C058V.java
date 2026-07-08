package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentLifecycleListenerImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentLifecycleListenerImpl$onVideoCacheSucceeded$1", f = "OfflineCommentLifecycleListenerImpl.kt", l = {25}, m = "invokeSuspend")
public final class C058V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ OfflineCommentLifecycleListenerImpl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058V(String str, Aweme aweme, OfflineCommentLifecycleListenerImpl offlineCommentLifecycleListenerImpl, InterfaceC1364105Vn<? super C058V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = offlineCommentLifecycleListenerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C058V c058v = new C058V(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c058v.LLILLJJLI = obj;
        return c058v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("OfflineCommentLifecycleListenerImpl@3dd4.onVideoCacheSucceeded$1");
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
                String str = this.LLILLL;
                Aweme aweme = this.LLILZ;
                C1396050mQt c1396050mQt = C1396050mQt.LIZ;
                this.LL = 1;
                if (c1396050mQt.LJII(aweme, str, this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineCommentLifecycleListenerImpl@3dd4.onVideoCacheSucceeded$1");
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
        C1C7U.LIZIZ("OfflineCommentLifecycleListenerImpl@3dd4.onVideoCacheSucceeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
