package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649040Pd0 {
    public final DynamicPatch LIZ;
    public WeakReference<InterfaceC655620Pnc> LIZIZ;
    public List<SearchLiveStruct> LIZJ;
    public InterfaceC641090PCp LIZLLL;
    public boolean LJ;
    public String LJFF;
    public Map<Integer, List<Aweme>> LJI;
    public Map<Integer, List<Map<?, ?>>> LJII;
    public List<DynamicPatch.SearchMultiTabListData> LJIIIIZZ;

    public C649040Pd0(DynamicPatch dynamicPatch) {
        this.LIZ = dynamicPatch;
        new ArrayList();
        this.LJFF = "";
    }

    public final List<Aweme> LIZ(int i) {
        Map<Integer, List<Aweme>> map = this.LJI;
        if (map != null) {
            return (List) ((HashMap) map).get(Integer.valueOf(i));
        }
        return null;
    }

    public final void LIZIZ(int i, SearchHorizontalData searchHorizontalData) {
        if (searchHorizontalData != null && searchHorizontalData.awemeListRaw != null && i >= 0) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new ArrayList();
            }
            List<DynamicPatch.SearchMultiTabListData> list = this.LJIIIIZZ;
            if (list != null) {
                boolean zBooleanValue = true;
                if (list.size() - 1 < i) {
                    return;
                }
                long jLongValue = ((DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i)).cursor;
                if (((DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i)).tabAwemeList.isEmpty()) {
                    ((DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i)).tabAwemeList = searchHorizontalData.LJ();
                } else {
                    List<Aweme> listLJ = searchHorizontalData.LJ();
                    if (listLJ != null) {
                        ((DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i)).tabAwemeList.addAll(listLJ);
                    }
                }
                DynamicPatch.SearchMultiTabListData searchMultiTabListData = (DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i);
                Boolean bool = searchHorizontalData.hasMore;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                searchMultiTabListData.hasMore = zBooleanValue;
                DynamicPatch.SearchMultiTabListData searchMultiTabListData2 = (DynamicPatch.SearchMultiTabListData) ListProtector.get(list, i);
                Long l = searchHorizontalData.newCursor;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                searchMultiTabListData2.cursor = jLongValue;
                List<? extends Map<?, ?>> list2 = searchHorizontalData.awemeListRaw;
                if (list2 != null) {
                    Map<Integer, List<Map<?, ?>>> map = this.LJII;
                    if (map != null) {
                        List list3 = (List) ((HashMap) map).get(Integer.valueOf(i));
                        if (list3 != null) {
                            list3.addAll(C19719512Dh.LIZIZ(list2));
                        }
                    }
                    Map<Integer, List<Aweme>> map2 = this.LJI;
                    if (map2 != null) {
                        List list4 = (List) ((HashMap) map2).get(Integer.valueOf(i));
                        if (list4 != null) {
                            list4.addAll(searchHorizontalData.LJ());
                        }
                    }
                }
            }
        }
    }
}
