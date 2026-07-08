package X;

import Y.ARunnableS110S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641860PFo {
    public static final C641860PFo LIZ = new C641860PFo();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static int LIZJ;

    public static boolean LIZIZ(SearchResultParam searchResultParam) {
        String enterMethod = null;
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        }
        if (Intrinsics.LJFF(enterMethod, "entity_switch")) {
            if (searchResultParam == null || searchResultParam.getFilterOption() == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZJ(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int[] iArr = new int[2];
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS260S0100000_10(viewGroup, 8));
        valueAnimatorOfInt.start();
    }

    public static Map LIZ(SearchHubVM searchHubVM, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entity_id", String.valueOf(searchHubVM.LLILZ));
        if (z) {
            linkedHashMap.put("lynxBindTime", String.valueOf(System.currentTimeMillis()));
        }
        if (C0BRN.LIZ()) {
            linkedHashMap.put("is_first_screen", "1");
        }
        linkedHashMap.put("universalRank", 0);
        return linkedHashMap;
    }

    public static void LIZLLL(Fragment fragment, boolean z) {
        ViewGroup viewGroup;
        C0PSW c0psw;
        if (!C301130BrD.LIZ()) {
            return;
        }
        View view = fragment.getView();
        View viewFindViewById = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.i_6);
        }
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            if (z) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            if ((viewGroup instanceof C0PSW) && (c0psw = (C0PSW) viewGroup) != null) {
                c0psw.setContainAlphaForStreamPatch(z);
            }
        }
    }

    public static void LJ(DynamicPatch dynamicPatch, SearchHubVM searchHubVM, View view) {
        String str = ((C0PRC) C0Q3E.LIZ(view).Ph1().LIZJ()).LLILLL;
        long j = searchHubVM.LLILZ;
        if (C301130BrD.LIZ() && Intrinsics.LJFF(searchHubVM.LLJJ, dynamicPatch) && searchHubVM.LLJILLL == j && Intrinsics.LJFF(searchHubVM.LLJJI, str)) {
            return;
        }
        C1537720q7O c1537720q7O = searchHubVM.LLJILJILJ;
        if (c1537720q7O != null) {
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            LIZ.getClass();
            Map mapLIZ = LIZ(searchHubVM, false);
            C1537480q70 hybridContext = c1537720q7O.getHybridContext();
            c647380PaK.getClass();
            c1537720q7O.updateData(C647380PaK.LIZLLL(dynamicPatch, mapLIZ, hybridContext));
        }
        long j2 = searchHubVM.LLILZ;
        if (C301130BrD.LIZ()) {
            searchHubVM.LLJJ = dynamicPatch;
            searchHubVM.LLJILLL = j2;
            searchHubVM.LLJJI = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034f  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.0PFs, X.0rMx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.0PCu, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(final com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment r29, final androidx.recyclerview.widget.RecyclerView r30, com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard r31) {
        /*
            Method dump skipped, instruction units count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C641860PFo.LJI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment, androidx.recyclerview.widget.RecyclerView, com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard):void");
    }

    public static void LJFF(Fragment fragment, RecyclerView recyclerView, SearchHubEntityCard searchHubEntityCard, boolean z) {
        EntityCardTitle entityCardTitle;
        View viewFindViewById;
        ViewGroup viewGroup;
        SearchHubVM searchHubVM;
        EntityCardTitle entityCardTitle2;
        SearchMixFeed searchMixFeed = null;
        if (searchHubEntityCard != null) {
            entityCardTitle = searchHubEntityCard.topCardInfo;
        } else {
            entityCardTitle = null;
        }
        View view = fragment.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.i5y);
        } else {
            viewFindViewById = null;
        }
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            if (entityCardTitle != null && searchHubEntityCard != null && (entityCardTitle2 = searchHubEntityCard.topCardInfo) != null && entityCardTitle2.dynamicPatch != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                C644060POa c644060POa = C644060POa.LIZ;
                String str = ((C0PRC) C0Q3E.LIZ(recyclerView).Ph1().LIZJ()).LLJ;
                c644060POa.getClass();
                C0PO5 c0po5LJIIIIZZ = C644060POa.LJIIIIZZ(str);
                if (searchHubEntityCard != null) {
                    searchMixFeed = searchHubEntityCard.searchMixFeed;
                }
                c0po5LJIIIIZZ.getClass();
                if (!Intrinsics.LJFF(c0po5LJIIIIZZ, C640870PBt.LIZ)) {
                    c0po5LJIIIIZZ.LJJLIIIJ = searchMixFeed;
                }
                HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(recyclerView, 129));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("call scroll to position 0, current ");
                sbLIZ.append(recyclerView.computeVerticalScrollOffset());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C786410Ut5.LJLZ(8, viewGroup);
            C644060POa c644060POa2 = C644060POa.LIZ;
            String str2 = ((C0PRC) C0Q3E.LIZ(recyclerView).Ph1().LIZJ()).LLJ;
            c644060POa2.getClass();
            C0PO5 c0po5LJIIIIZZ2 = C644060POa.LJIIIIZZ(str2);
            c0po5LJIIIIZZ2.getClass();
            if (!Intrinsics.LJFF(c0po5LJIIIIZZ2, C640870PBt.LIZ)) {
                c0po5LJIIIIZZ2.LJJLIIIJ = null;
            }
            if (z) {
                C0HXV.LJFF(0, recyclerView);
                recyclerView.scrollToPosition(0);
            }
            C19EG activity = fragment.getActivity();
            if (activity != null && (searchHubVM = (SearchHubVM) C679340Qkm.LIZIZ(fragment, activity).get(SearchHubVM.class)) != null && C301130BrD.LIZ()) {
                searchHubVM.LLJJ = null;
                searchHubVM.LLJILLL = 0L;
                searchHubVM.LLJJI = "";
            }
        }
    }
}
