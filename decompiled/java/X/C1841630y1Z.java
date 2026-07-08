package X;

import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0y1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource$updateLatestTopicResult$1", f = "ExploreCustomTopicDataSource.kt", l = {}, m = "invokeSuspend")
public final class C1841630y1Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ExploreCustomTopicResponse> LL;
    public final /* synthetic */ ExploreCustomTopicDataSource LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841630y1Z(List<ExploreCustomTopicResponse> list, ExploreCustomTopicDataSource exploreCustomTopicDataSource, InterfaceC1364105Vn<? super C1841630y1Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = exploreCustomTopicDataSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841630y1Z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreCustomTopicDataSource@ab86.updateLatestTopicResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ExploreCustomTopicResponse> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (ExploreCustomTopicResponse exploreCustomTopicResponse : list) {
            Long l = exploreCustomTopicResponse.topicId;
            if (l == null || l.longValue() != 0) {
                arrayList.add(exploreCustomTopicResponse);
            }
        }
        if (Intrinsics.LJFF(arrayList, this.LLILLJJLI.cacheRAMResponse)) {
            this.LLILLJJLI.shouldSyncData.set(false);
        } else {
            if (C288840BTu.LIZ()) {
                CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList = this.LLILLJJLI.cacheRAMResponse;
                ArrayList arrayList2 = new ArrayList();
                Iterator<ExploreCustomTopicResponse> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    Long l2 = it2.next().topicId;
                    if (l2 != null) {
                        arrayList2.add(l2);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Long l3 = ((ExploreCustomTopicResponse) it3.next()).topicId;
                    if (l3 != null) {
                        arrayList3.add(l3);
                    }
                }
                Set setLJII = C15442062u.LJII(setLLIIJI, C13LP.LLIIJI(arrayList3));
                if (!setLJII.isEmpty()) {
                    Iterator it4 = setLJII.iterator();
                    while (it4.hasNext()) {
                        long jLongValue = ((Number) it4.next()).longValue();
                        C15T8.LL.getClass();
                        C15T8.LJIJ(jLongValue);
                    }
                }
            }
            this.LLILLJJLI.shouldSyncData.set(true);
            this.LLILLJJLI.updateResponseToMemory(arrayList);
            ExploreCustomTopicDataSource exploreCustomTopicDataSource = this.LLILLJJLI;
            exploreCustomTopicDataSource.saveToDisk(exploreCustomTopicDataSource.cacheRAMResponse);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.updateLatestTopicResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
