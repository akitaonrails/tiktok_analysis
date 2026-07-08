package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoPreloadCache$preloadIfNeeded$1$3", f = "TakoAIVideoPreloadCache.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C326570Cr9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TakoAIVideoResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C326570Cr9(InterfaceC1364105Vn<? super C326570Cr9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C326570Cr9 c326570Cr9 = new C326570Cr9(interfaceC1364105Vn);
        c326570Cr9.LLILLJJLI = obj;
        return c326570Cr9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TakoAIVideoPreloadCache@2fdb.preloadIfNeeded$1$3");
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
                C326590CrB c326590CrB = new C326580CrA().LLILLJJLI;
                this.LL = 1;
                obj = c326590CrB.z(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoAIVideoPreloadCache@2fdb.preloadIfNeeded$1$3");
                    return objLJFF;
                }
            }
            c098200Yq = (TakoAIVideoResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("TakoAIVideoPreloadCache@2fdb.preloadIfNeeded$1$3");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TakoAIVideoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
