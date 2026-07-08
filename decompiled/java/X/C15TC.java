package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15TC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TC extends C09AY implements Function2<Integer, C150D, Unit> {
    public final /* synthetic */ ExploreFeedListViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15TC(ExploreFeedListViewModel exploreFeedListViewModel, long j, String str) {
        super(2);
        this.LL = exploreFeedListViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, C150D c150d) {
        int iIntValue = num.intValue();
        C150D c150d2 = c150d;
        if (c150d2 instanceof C20525915Tl) {
            C20525915Tl c20525915Tl = (C20525915Tl) c150d2;
            ArrayList arrayList = new ArrayList(c20525915Tl.LLILZ);
            long j = this.LLILLJJLI;
            String str = this.LLILLL;
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ExploreCustomTopicStruct exploreCustomTopicStruct = (ExploreCustomTopicStruct) it2.next();
                Long l = exploreCustomTopicStruct.topicId;
                if (l != null && l.longValue() == j && Intrinsics.LJFF(exploreCustomTopicStruct.topicName, str)) {
                    if (i >= 0 && i < arrayList.size()) {
                        if (arrayList.size() <= 4) {
                            this.LL.listRemoveItemAt(iIntValue);
                        } else {
                            ListProtector.set(arrayList, i, ListProtector.remove(arrayList, 4));
                            this.LL.listSetItemAt(iIntValue, C20525915Tl.LIZ(c20525915Tl, arrayList));
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return Unit.LIZ;
    }
}
