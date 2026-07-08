package X;

import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ability.ISearchContainerPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Q0K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0K {
    public static final C0Q0K LIZ = new C0Q0K();
    public static final ConcurrentHashMap<String, TakoSearchCarryInItem> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, TakoSearchCarryInItem>> LIZJ = new ConcurrentHashMap<>();

    public static void LJI(SearchMixFeed searchMixFeed, String str) {
        TakoSearchCarryInItem takoSearchCarryInItemLIZ;
        if (C07C2.LIZ()) {
            TakoSearchCarryInItem takoSearchCarryInItemLIZ2 = C0PLR.LIZ(searchMixFeed);
            if (takoSearchCarryInItemLIZ2 != null) {
                ConcurrentHashMap<String, ConcurrentHashMap<String, TakoSearchCarryInItem>> concurrentHashMap = LIZJ;
                ConcurrentHashMap<String, TakoSearchCarryInItem> concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap<>();
                }
                String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
                if (providerDocIdStr != null) {
                    concurrentHashMap2.put(providerDocIdStr, takoSearchCarryInItemLIZ2);
                }
                concurrentHashMap2.put("default_doc_id", takoSearchCarryInItemLIZ2);
                concurrentHashMap.put(str, concurrentHashMap2);
                return;
            }
            return;
        }
        ConcurrentHashMap<String, TakoSearchCarryInItem> concurrentHashMap3 = LIZIZ;
        if (concurrentHashMap3.get(str) == null || (takoSearchCarryInItemLIZ = C0PLR.LIZ(searchMixFeed)) == null) {
            return;
        }
        concurrentHashMap3.put(str, takoSearchCarryInItemLIZ);
    }

    public static TakoSearchCarryInItem LIZ(String str, String str2, String str3) {
        ConcurrentHashMap<String, TakoSearchCarryInItem> concurrentHashMap;
        ConcurrentHashMap<String, TakoSearchCarryInItem> concurrentHashMap2 = LIZIZ;
        if ((concurrentHashMap2.isEmpty() && !C07C2.LIZ()) || !Intrinsics.LJFF(str2, EnumC669620QOi.TOP.getTabName())) {
            return null;
        }
        if (C07C2.LIZ()) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, TakoSearchCarryInItem>> concurrentHashMap3 = LIZJ;
            if (!concurrentHashMap3.containsKey(str) || (concurrentHashMap = concurrentHashMap3.get(str)) == null) {
                return null;
            }
            if (str3 == null) {
                str3 = "default_doc_id";
            }
            return concurrentHashMap.get(str3);
        }
        if (concurrentHashMap2.containsKey(str)) {
            return concurrentHashMap2.get(str);
        }
        return null;
    }

    public static void LJ(Fragment fragment, C19EG c19eg, final String str) {
        final C013C c013c = new C013C();
        c013c.element = true;
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStateViewModel.class);
        SAFHelper.LIZ.getClass();
        LifecycleOwner lifecycleOwnerLJJIIZ = SAFHelper.LJJIIZ(fragment, c19eg);
        if (!C1110704Wb.LIZ()) {
            searchStateViewModel.backToMiddle.observe(lifecycleOwnerLJJIIZ, new AObserverS214S0100000_10(c013c, 119));
        }
        searchStateViewModel.searchState.observe(lifecycleOwnerLJJIIZ, new Observer() { // from class: X.0Q0L
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Integer num = (Integer) obj;
                if (C1110704Wb.LIZ()) {
                    if (num != null) {
                        if (num.intValue() == 3) {
                            c013c.element = true;
                        }
                    } else {
                        return;
                    }
                } else if (num == null) {
                    return;
                }
                if (num.intValue() == 2) {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        c013c2.element = false;
                        C0Q7O c0q7o = new C0Q7O();
                        String str2 = str;
                        c0q7o.LJIJJ(C14TF.LIZIZ.LJJJLIIL());
                        c0q7o.LJIIZILJ("entrance_type", str2);
                        c0q7o.LJIIZILJ("icon_state", "origin");
                        c0q7o.LJIIZILJ("group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
                        c0q7o.LJIILJJIL();
                    }
                }
            }
        });
    }

    public static final void LIZJ(C1846060y8i c1846060y8i, boolean z, View view, Rect rect) {
        if (z) {
            View childAt = c1846060y8i.getChildAt(0);
            if (childAt != null) {
                childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), view.getWidth(), childAt.getPaddingBottom());
            }
            rect.set(0, 0, c1846060y8i.getWidth() - view.getWidth(), c1846060y8i.getHeight());
        } else {
            View childAt2 = c1846060y8i.getChildAt(0);
            if (childAt2 != null) {
                childAt2.setPadding(view.getWidth(), childAt2.getPaddingTop(), childAt2.getPaddingRight(), childAt2.getPaddingBottom());
            }
            rect.set(view.getWidth(), 0, c1846060y8i.getWidth(), c1846060y8i.getHeight());
        }
        c1846060y8i.setClipBounds(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.widget.FrameLayout r18, com.ss.android.ugc.aweme.search.model.SearchResultParam r19, java.lang.Boolean r20, java.lang.Integer r21) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q0K.LJFF(android.widget.FrameLayout, com.ss.android.ugc.aweme.search.model.SearchResultParam, java.lang.Boolean, java.lang.Integer):void");
    }

    public final void LIZLLL(View view, SearchResultParam searchResultParam, Context context, String str, String str2) {
        String strLJI;
        String str3;
        C0QER searchEnterParam;
        ISearchContainerPageAbility iSearchContainerPageAbility;
        List<Map<String, Object>> listTw1;
        if (view != null && (iSearchContainerPageAbility = (ISearchContainerPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ISearchContainerPageAbility.class, null)) != null && (listTw1 = iSearchContainerPageAbility.tw1()) != null) {
            C1227904rF.LIZ.getClass();
            strLJI = C1227904rF.LJI(listTw1);
        } else {
            strLJI = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        String keyword = c0prc.LLJ;
        if (!(!a0.LJJJIL(keyword)) || keyword == null) {
            if (searchResultParam != null) {
                keyword = searchResultParam.getKeyword();
            } else {
                keyword = null;
            }
        }
        String strLJIILLIIL = C644560PPy.LJIILLIIL(c0prc.LL);
        String str4 = c0prc.LLILLL;
        getClass();
        LIZ(str4, strLJIILLIIL, "default_doc_id");
        Pair[] pairArr = new Pair[3];
        String groupId = ((C0Q39) C0Q3E.LJI().P70().LIZJ()).LLILLJJLI;
        if (!C123100dR.LIZ(groupId)) {
            groupId = null;
        }
        String str5 = "";
        if (groupId == null && (searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (groupId = searchEnterParam.getGroupId()) == null)) {
            groupId = "";
        }
        pairArr[0] = new Pair("last_gid", groupId);
        pairArr[1] = new Pair("search_source", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJLL);
        if (keyword != null) {
            str5 = keyword;
        }
        pairArr[2] = new Pair("search_query", str5);
        String strLIZIZ = C178200mK.LIZIZ(C2097608Jq.LJIIIIZZ(pairArr));
        if (C07CQ.LIZ()) {
            C0Q13 c0q13 = new C0Q13();
            c0q13.LJIJJ(C14TF.LIZIZ.LJJJLIIL());
            c0q13.LJJIIZI(c0prc.LLILLL);
            c0q13.LJJIJ(keyword);
            c0q13.LJJIJIIJIL(strLJIILLIIL);
            c0q13.LJIIZILJ("entrance_type", str);
            if (str2 == null) {
                str3 = "origin";
            } else {
                str3 = str2;
            }
            c0q13.LJIIZILJ("icon_state", str3);
            c0q13.LJIL(((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
            c0q13.LJIILJJIL();
        }
        String strLJJJLIIL = C14TF.LIZIZ.LJJJLIIL();
        String str6 = c0prc.LLILLL;
        if (context != null) {
            C682830QqP.LIZ(strLJJJLIIL, str, new C20233714Fb(keyword, str, jCurrentTimeMillis, strLJI, str6, strLIZIZ, strLJIILLIIL, str2)).LJII(context);
        }
    }
}
