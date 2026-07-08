package X;

import Y.AfS193S0100000_24;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0sCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617670sCL extends AbstractC1255880imo<Aweme, ExploreAwemeList> {
    public String LL;
    public List<C1617730sCR> LLILLJJLI;
    public Long LLILLL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    public final void LJIIJ() {
        C11JN c11jnLIZLLL;
        List<C1617730sCR> list = this.LLILLJJLI;
        if (list == null || (c11jnLIZLLL = C15UV.LIZLLL(list, 12, 0, this.LLILLL)) == null) {
            return;
        }
        c11jnLIZLLL.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS193S0100000_24(this, 51), new AfS193S0100000_24(this, 52));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List list;
        ExploreAwemeList exploreAwemeList = (ExploreAwemeList) this.mData;
        if (exploreAwemeList == null || (list = exploreAwemeList.items) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = ((ExplorePostItem) it2.next()).aweme;
            if (aweme == null) {
                aweme = new Aweme();
            }
            arrayList.add(aweme);
        }
        return new ArrayList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t;
        Integer num;
        return (C0B1Y.LIZ() || (t = this.mData) == 0 || (num = ((ExploreAwemeList) t).hasMore) == null || num.intValue() != 1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        List<ExplorePostItem> list;
        Aweme aweme2 = aweme;
        List<Aweme> items = getItems();
        List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
        int iLIZ = C729980SkG.LIZ(aweme2, items);
        C729980SkG.LJIIL(aweme2, list2, iLIZ);
        if (iLIZ >= 0 && (list = ((ExploreAwemeList) this.mData).items) != null && ListProtector.remove(list, iLIZ) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ExploreAwemeList exploreAwemeList;
        ExploreAwemeList exploreAwemeList2 = (ExploreAwemeList) obj;
        if (exploreAwemeList2 != null && (exploreAwemeList = (ExploreAwemeList) this.mData) != null) {
            exploreAwemeList.hasMore = exploreAwemeList2.hasMore;
            if (exploreAwemeList.items == null) {
                exploreAwemeList.items = exploreAwemeList2.items;
                return;
            }
            List<ExplorePostItem> list = exploreAwemeList2.items;
            if (list == null) {
                return;
            }
            Iterator<ExplorePostItem> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().aweme;
                if (aweme != null) {
                    AwemeBizExtKt.setExploreClientExtra(aweme, new ExploreClientExtra(1, null, true));
                }
            }
            List<ExplorePostItem> list2 = exploreAwemeList.items;
            if (list2 == null) {
                return;
            }
            list2.addAll(list);
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        if (C123100dR.LIZ(this.LL)) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1617680sCM(this, null), 3);
        } else {
            LJIIJ();
        }
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (C0B1Y.LIZ()) {
            return false;
        }
        return super.sendRequest(Arrays.copyOf(objArr, objArr.length));
    }
}
