package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS161S1200000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15T6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15T6 extends C09AY implements Function1<C15SM, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ExploreFeedListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15T6(ExploreFeedListViewModel exploreFeedListViewModel, String str) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = exploreFeedListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C15SM c15sm) {
        Object aid;
        List<ExplorePostItem> list;
        String aid2;
        C20526015Tm c20526015Tm;
        Aweme aweme;
        List<C150D> list2 = c15sm.LLILZ.LLILZ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            int size = list2.size();
            int i = 0;
            while (true) {
                aid = null;
                if (i >= size) {
                    break;
                }
                Object obj = ListProtector.get(list2, i);
                if ((obj instanceof C20526015Tm) && (c20526015Tm = (C20526015Tm) obj) != null && (aweme = c20526015Tm.LL) != null) {
                    aid = aweme.getAid();
                }
                if (Intrinsics.LJFF(aid, this.LL)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
                i++;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.LLILLJJLI.listRemoveItemAt(((Number) ListProtector.get(arrayList, i2)).intValue());
            }
            final String str = this.LL;
            if (str != null) {
                C15T8.LL.getClass();
                try {
                    ExploreAwemeList exploreAwemeList = C15T8.LLILLJJLI;
                    if (exploreAwemeList != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            List<ExplorePostItem> list3 = exploreAwemeList.items;
                            if (list3 != null) {
                                list3.removeIf(new Predicate() { // from class: X.14ST
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj2) {
                                        String aid3;
                                        Aweme aweme2 = ((ExplorePostItem) obj2).aweme;
                                        if (aweme2 != null) {
                                            aid3 = aweme2.getAid();
                                        } else {
                                            aid3 = null;
                                        }
                                        return Intrinsics.LJFF(aid3, str);
                                    }
                                });
                            }
                        } else {
                            List<ExplorePostItem> list4 = exploreAwemeList.items;
                            if (list4 != null) {
                                Iterator<ExplorePostItem> it2 = list4.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    ExplorePostItem next = it2.next();
                                    Aweme aweme2 = next.aweme;
                                    if (aweme2 != null) {
                                        aid2 = aweme2.getAid();
                                    } else {
                                        aid2 = null;
                                    }
                                    if (Intrinsics.LJFF(aid2, str)) {
                                        aid = next;
                                        break;
                                    }
                                }
                                ExplorePostItem explorePostItem = (ExplorePostItem) aid;
                                if (explorePostItem != null && (list = exploreAwemeList.items) != null) {
                                    list.remove(explorePostItem);
                                }
                            }
                        }
                        C15T8 c15t8 = C15T8.LL;
                        int value = EnumC1568370qup.NO_PREFETCH.getValue();
                        c15t8.getClass();
                        C15T8.LIZ(value, exploreAwemeList);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            ExploreFeedListViewModel exploreFeedListViewModel = this.LLILLJJLI;
            String str2 = this.LL;
            exploreFeedListViewModel.getClass();
            if (C07MS.LIZ() && str2 != null) {
                exploreFeedListViewModel.withState(new AwS397S0200000_31(exploreFeedListViewModel, (ExploreFeedListViewModel) new AwS161S1200000_31(new C013C(), exploreFeedListViewModel, str2, 0), (Function2<? super Integer, ? super C150D, Unit>) 81));
            }
        }
        return Unit.LIZ;
    }
}
