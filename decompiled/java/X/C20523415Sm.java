package X;

import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.15Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$scheduleLynxPrefetchOverlay$1", f = "ExploreFeedListViewModel.kt", l = {470}, m = "invokeSuspend")
public final class C20523415Sm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreLynxParams LLILLJJLI;
    public final /* synthetic */ ExploreFeedListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523415Sm(ExploreLynxParams exploreLynxParams, ExploreFeedListViewModel exploreFeedListViewModel, InterfaceC1364105Vn<? super C20523415Sm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreLynxParams;
        this.LLILLL = exploreFeedListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20523415Sm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ExploreAwemeList exploreAwemeList;
        ?? arrayList;
        List<ExplorePostItem> list;
        C1C7U.LIZ("ExploreFeedListViewModel@1463.scheduleLynxPrefetchOverlay$1");
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
            Long l = this.LLILLJJLI.lynxJumpInterestId;
            if (l != null) {
                long jLongValue = l.longValue();
                C15TW c15tw = C15TW.LIZ;
                this.LL = 1;
                if (C15TW.LIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreFeedListViewModel@1463.scheduleLynxPrefetchOverlay$1");
                    return objLJFF;
                }
            }
        }
        C15TW c15tw2 = C15TW.LIZ;
        C15T8 c15t8 = C15T8.LL;
        c15t8.getClass();
        if (!C294800Bh0.LIZ()) {
            exploreAwemeList = null;
        } else {
            exploreAwemeList = C15T8.LLILZIL;
            C15T8.LLILZIL = null;
        }
        if (exploreAwemeList != null && (list = exploreAwemeList.items) != null && !list.isEmpty()) {
            Explore0VVTrackerMonitor.INSTANCE.dataStatus(C15UL.READING_PRELOAD_CACHE);
            ExploreColdBootMonitor.INSTANCE.enterMethod(19, false);
            this.LLILLL.JQ2(exploreAwemeList, C15TI.UG_CARD.getValue(), new AwS610S0100000_31(this.LLILLJJLI, 183), false);
            ExploreFeedListViewModel exploreFeedListViewModel = this.LLILLL;
            c15t8.getClass();
            exploreFeedListViewModel.LLJILJIL = C15T8.LLILZLL;
            this.LLILLL.LLJJJJJIL = null;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ExploreFeedListViewModel@1463.scheduleLynxPrefetchOverlay$1");
            return unit;
        }
        ExploreLynxParams exploreLynxParams = this.LLILLJJLI;
        Long l2 = exploreLynxParams.lynxJumpInterestId;
        List<String> list2 = exploreLynxParams.lynxJumpAwemeIds;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a0.LJLIIIL(it2.next()).toString());
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (l2 != null) {
            ExploreFeedListViewModel exploreFeedListViewModel2 = this.LLILLL;
            C15TW c15tw3 = C15TW.LIZ;
            exploreFeedListViewModel2.LLJILLL = new ExploreFeedRequestOverride(19, arrayList, Long.valueOf(l2.longValue()));
        }
        this.LLILLL.HQ2("lynx_schema_jump");
        this.LLILLL.LLJJJJJIL = null;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.scheduleLynxPrefetchOverlay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
