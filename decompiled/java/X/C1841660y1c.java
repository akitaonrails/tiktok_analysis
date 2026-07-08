package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreTopicTabMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource$fetchUserCustomTopics$4", f = "ExploreCustomTopicDataSource.kt", l = {169, 170}, m = "invokeSuspend")
public final class C1841660y1c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreCustomTopicDataSource LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841660y1c(ExploreCustomTopicDataSource exploreCustomTopicDataSource, InterfaceC1364105Vn<? super C1841660y1c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreCustomTopicDataSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841660y1c(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreCustomTopicDataSource@ab86.fetchUserCustomTopics$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1841670y1d fetchInRAMJob = this.LLILLJJLI.getFetchInRAMJob();
            if (fetchInRAMJob != null) {
                Boolean.valueOf(fetchInRAMJob.LJFF());
            }
            this.LLILLJJLI._initState.set(C0NJK.COMPLETE);
            C1AF0.LJ(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                this.LLILLJJLI._initState.set(C0NJK.COMPLETE);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.fetchUserCustomTopics$4");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ExploreTopicTabMonitor.INSTANCE.start();
            ExploreCustomTopicDataSource exploreCustomTopicDataSource = this.LLILLJJLI;
            this.LL = 1;
            if (exploreCustomTopicDataSource.loadCache(this) == objLJFF) {
                C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.fetchUserCustomTopics$4");
                return objLJFF;
            }
        }
        ExploreCustomTopicDataSource exploreCustomTopicDataSource2 = this.LLILLJJLI;
        this.LL = 2;
        if (exploreCustomTopicDataSource2.processApi(this) == objLJFF) {
            C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.fetchUserCustomTopics$4");
            return objLJFF;
        }
        this.LLILLJJLI._initState.set(C0NJK.COMPLETE);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.fetchUserCustomTopics$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
