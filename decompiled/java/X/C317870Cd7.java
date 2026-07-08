package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Cd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.ThoughtAggregatedFeedStore$prefetchFirstPageIfNeeded$1", f = "ThoughtAggregatedFeedStore.kt", l = {172}, m = "invokeSuspend")
public final class C317870Cd7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C317870Cd7(InterfaceC1364105Vn<? super C317870Cd7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317870Cd7(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThoughtAggregatedFeedStore@18e4.prefetchFirstPageIfNeeded$1");
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
                C0DZM c0dzm = C0DZM.LIZ;
                this.LL = 1;
                obj = c0dzm.LJFF(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ThoughtAggregatedFeedStore@18e4.prefetchFirstPageIfNeeded$1");
                    return objLJFF;
                }
            }
            C0DZM.LJI.set(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ThoughtAggregatedFeedStore@18e4.prefetchFirstPageIfNeeded$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0DZM.LJI.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C317870Cd7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
