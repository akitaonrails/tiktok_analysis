package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.monitor.cache.ExploreTopicTabMonitor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0y1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource$syncCustomTopics$1", f = "ExploreCustomTopicDataSource.kt", l = {341}, m = "invokeSuspend")
public final class C1841650y1b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreCustomTopicDataSource LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841650y1b(ExploreCustomTopicDataSource exploreCustomTopicDataSource, InterfaceC1364105Vn<? super C1841650y1b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreCustomTopicDataSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841650y1b(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ExploreCustomTopicDataSource@ab86.syncCustomTopics$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExploreTopicTabMonitor.INSTANCE.syncEnd(false);
            C1AF0.LJ(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.shouldSyncData.get()) {
                C1841780y1o remoteCustomTopicDataSource = this.LLILLJJLI.getRemoteCustomTopicDataSource();
                List<ExploreCustomTopicResponse> topicRAMResponseWithoutRedPoint = this.LLILLJJLI.getTopicRAMResponseWithoutRedPoint();
                remoteCustomTopicDataSource.getClass();
                C11JN c11jnLIZ = C1841780y1o.LIZ(topicRAMResponseWithoutRedPoint);
                if (c11jnLIZ != null) {
                    this.LL = 1;
                    obj = C11UD.LIZJ(c11jnLIZ, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.syncCustomTopics$1");
                        return objLJFF;
                    }
                }
                ExploreTopicTabMonitor.INSTANCE.syncEnd(true);
                this.LLILLJJLI.shouldSyncData.set(false);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.syncCustomTopics$1");
            return unit;
        }
        ExploreTopicTabMonitor.INSTANCE.syncEnd(true);
        this.LLILLJJLI.shouldSyncData.set(false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.syncCustomTopics$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
