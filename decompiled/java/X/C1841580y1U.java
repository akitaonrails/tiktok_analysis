package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.protocol.ExploreTopicGeneralFeedProtocol;
import com.ss.android.ugc.aweme.explore.topic.protocol.ExploreTopicMainFeedProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0y1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent$onCacheAvailable$1", f = "ExploreViewPagerComponent.kt", l = {}, m = "invokeSuspend")
public final class C1841580y1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CopyOnWriteArrayList<ExploreCustomTopicResponse> LL;
    public final /* synthetic */ ExploreViewPagerComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841580y1U(CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList, ExploreViewPagerComponent exploreViewPagerComponent, InterfaceC1364105Vn<? super C1841580y1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = exploreViewPagerComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841580y1U(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.onCacheAvailable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if ((!this.LL.isEmpty()) && !Intrinsics.LJFF(this.LLILLJJLI.LLJJI, this.LL)) {
            ((ArrayList) this.LLILLJJLI.LLJJI).clear();
            ((ArrayList) this.LLILLJJLI.LLJJIII).clear();
            ExploreTopicMainFeedProtocol exploreTopicMainFeedProtocol = new ExploreTopicMainFeedProtocol();
            List<ExploreCustomTopicResponse> list = this.LLILLJJLI.LLJJI;
            C844470XAv.LIZ.getClass();
            ((ArrayList) list).add(new ExploreCustomTopicResponse(exploreTopicMainFeedProtocol.mc(C844470XAv.LIZ()), C2286608xc.LJFF(0L), false, null));
            ((ArrayList) this.LLILLJJLI.LLJJIII).add(exploreTopicMainFeedProtocol);
            CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList = this.LL;
            ExploreViewPagerComponent exploreViewPagerComponent = this.LLILLJJLI;
            for (ExploreCustomTopicResponse exploreCustomTopicResponse : copyOnWriteArrayList) {
                Long l = exploreCustomTopicResponse.topicId;
                if (l != null) {
                    long jLongValue = l.longValue();
                    String str = exploreCustomTopicResponse.topicName;
                    if (str != null) {
                        ((ArrayList) exploreViewPagerComponent.LLJJI).add(new ExploreCustomTopicResponse(str, C2286608xc.LJFF(jLongValue), false, exploreCustomTopicResponse.customRelatedItemsUpdatedCount));
                        ((ArrayList) exploreViewPagerComponent.LLJJIII).add(new ExploreTopicGeneralFeedProtocol(jLongValue, str));
                    }
                }
            }
            C717620SCy c717620SCyLLIIL = C13LP.LLIIL(this.LLILLJJLI.LLJJI);
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator it2 = c717620SCyLLIIL.iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (!c717610SCx.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                Pair pair = new Pair(((ExploreCustomTopicResponse) indexedValue.LIZIZ).topicId, C2286608xc.LJ(indexedValue.LIZ));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            Integer num = (Integer) linkedHashMap.get(C2286608xc.LJFF(this.LLILLJJLI.LLJJIJIL));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLILLJJLI.hp(false, C2286608xc.LJ(iIntValue), false);
        }
        ExploreViewPagerComponent exploreViewPagerComponent2 = this.LLILLJJLI;
        exploreViewPagerComponent2.LLJJJJ = true;
        Long l2 = exploreViewPagerComponent2.LLJJJJJIL;
        String str2 = exploreViewPagerComponent2.LLJJJJLIIL;
        if (l2 != null && str2 != null && !a0.LJJJIL(str2)) {
            exploreViewPagerComponent2.LLJJJJJIL = null;
            exploreViewPagerComponent2.LLJJJJLIIL = null;
            exploreViewPagerComponent2.Lo(l2, str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.onCacheAvailable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
