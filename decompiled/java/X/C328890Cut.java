package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreAssem$StartupStateListener$onStateChange$1", f = "ExploreAssem.kt", l = {130}, m = "invokeSuspend")
public final class C328890Cut extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328890Cut(ExploreAssem exploreAssem, InterfaceC1364105Vn<? super C328890Cut> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328890Cut(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreAssem$StartupStateListener@9286.onStateChange$1");
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
            long jLongValue = ((Number) C18014073s.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreAssem$StartupStateListener@9286.onStateChange$1");
                return objLJFF;
            }
        }
        ExploreCustomTopicDataSource.Companion.getClass();
        ExploreCustomTopicDataSource exploreCustomTopicDataSource = C1841760y1m.LIZ;
        exploreCustomTopicDataSource.initialize();
        exploreCustomTopicDataSource.fetchUserCustomTopics();
        this.LLILLJJLI.getClass();
        if (!C296240BjK.LIZ() && C15T0.LIZ.compareAndSet(false, true)) {
            C2493709pv.LIZ.getClass();
            C2493709pv.LIZIZ();
        }
        if (((Number) C04WX.LIZ.getValue()).intValue() == 1) {
            C15T0.LIZ(RunnableC329370Cvf.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreAssem$StartupStateListener@9286.onStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
