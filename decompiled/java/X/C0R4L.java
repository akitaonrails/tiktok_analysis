package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SugPreInfoResponse;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.repo.SearchEffectListResponse;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel.SearchEffectListViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R4L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4L implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C0R4L c0r4l, C15O7 c15o7) {
        C1C7U.LIZ("SearchEffectListViewModel@1e62.fetch$1");
        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
            SearchEffectListResponse searchEffectListResponse = (SearchEffectListResponse) c15o7.LJIIL();
            if (searchEffectListResponse.status_code == 0) {
                ((SearchEffectListViewModel) c0r4l.l0).LL.setValue(searchEffectListResponse.propsList);
                Function1 function1 = (Function1) c0r4l.l1;
                if (function1 != null) {
                    function1.invoke(searchEffectListResponse);
                }
            } else {
                ((SearchEffectListViewModel) c0r4l.l0).LL.setValue(null);
            }
        } else {
            ((SearchEffectListViewModel) c0r4l.l0).LL.setValue(null);
        }
        C1C7U.LIZIZ("SearchEffectListViewModel@1e62.fetch$1");
        return null;
    }

    public static final Object then$1(C0R4L c0r4l, C15O7 c15o7) {
        C0XIR c0xir;
        Integer numValueOf;
        int errorCode;
        String errorMsg;
        List<SearchLiveStruct> listLJI;
        InterfaceC644520PPu interfaceC644520PPu;
        C1C7U.LIZ("LiveLoadMoreImpl@a288.onTryLoadMore$2");
        if (C09UZ.LIZLLL(c15o7) && (listLJI = ((SearchLiveList) ((Pair) c15o7.LJIIL()).getFirst()).LJI()) != null && (!((ArrayList) listLJI).isEmpty())) {
            SearchLiveList searchLiveList = (SearchLiveList) ((Pair) c15o7.LJIIL()).getFirst();
            List<? extends Aweme> list = (List) ((Pair) c15o7.LJIIL()).getSecond();
            ArrayList arrayList = new ArrayList();
            C644510PPt c644510PPt = (C644510PPt) c0r4l.l0;
            for (Aweme aweme : list) {
                if (aweme.getAid() != null && (interfaceC644520PPu = c644510PPt.LJ) != null && !interfaceC644520PPu.sq(aweme.getAid())) {
                    arrayList.add(aweme);
                }
            }
            InterfaceC644520PPu interfaceC644520PPu2 = ((C644510PPt) c0r4l.l0).LJ;
            if (interfaceC644520PPu2 != null) {
                interfaceC644520PPu2.rq(searchLiveList, list, searchLiveList.hasMore);
            }
            ((C644510PPt) c0r4l.l0).LJFF = Boolean.valueOf(searchLiveList.hasMore);
            ((C0J5P) c0r4l.l1).LIZ(arrayList, ((C644510PPt) c0r4l.l0).LJI);
        } else {
            Exception excLJIIJJI = c15o7.LJIIJJI();
            String errorMsg2 = null;
            if (excLJIIJJI instanceof C0XIR) {
                c0xir = (C0XIR) excLJIIJJI;
            } else {
                c0xir = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTryLoadMore fail, code: ");
            if (c0xir != null) {
                numValueOf = Integer.valueOf(c0xir.getErrorCode());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", msg: ");
            if (c0xir != null) {
                errorMsg2 = c0xir.getErrorMsg();
            }
            sbLIZ.append(errorMsg2);
            sbLIZ.append(", exception: ");
            sbLIZ.append(c15o7.LJIIJJI());
            C2188811AlT.LIZIZ(sbLIZ);
            C0J5P c0j5p = (C0J5P) c0r4l.l1;
            if (c0xir != null) {
                errorCode = c0xir.getErrorCode();
                errorMsg = c0xir.getErrorMsg();
                if (errorMsg == null) {
                }
                c0j5p.onFail(errorCode, errorMsg);
            } else {
                errorCode = -1;
            }
            errorMsg = "";
            c0j5p.onFail(errorCode, errorMsg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveLoadMoreImpl@a288.onTryLoadMore$2");
        return unit;
    }

    public static final Object then$2(C0R4L c0r4l, C15O7 c15o7) {
        int size;
        String requestId;
        List<SearchMixFeed> list;
        int size2;
        List<SearchMixFeed> list2;
        String str;
        C1C7U.LIZ("SearchMixFeedRequest@6c33.call$1");
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = ((C0POK) c0r4l.l0).LL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LJIILIIL();
        boolean z = C0PYW.LIZ;
        C0PYW.LIZ(C644560PPy.LJIJJLI());
        if (((C15O7) c0r4l.l1).LJIILL()) {
            Exception excLJIIJJI = ((C15O7) c0r4l.l1).LJIIJJI();
            C0POK c0pok = (C0POK) c0r4l.l0;
            Long l = c0pok.LLLIILIL;
            if (l != null) {
                Long lValueOf = Long.valueOf(l.longValue());
                String str2 = c0pok.LLILLJJLI;
                if (C0PP3.LIZIZ(excLJIIJJI)) {
                    str = "timeout";
                } else {
                    str = "error";
                }
                C0PP3.LIZJ(0, str2, "single", lValueOf, str);
            }
            c0po5LJII.LJIL(1);
            c0po5LJII.LJ(excLJIIJJI.getMessage());
            c0po5LJII.LJIJI(excLJIIJJI);
            C644210POp c644210POp = C644210POp.LIZ;
            AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(excLJIIJJI, 304);
            c644210POp.getClass();
            awS589S0100000_10.invoke(C644210POp.LJ);
        } else if (((C15O7) c0r4l.l1).LJIILIIL()) {
            c0po5LJII.LJIL(2);
            c0po5LJII.LIZLLL();
        } else {
            SearchMixFeedList searchMixFeedList = (SearchMixFeedList) ((C15O7) c0r4l.l1).LJIIL();
            C0POK c0pok2 = (C0POK) c0r4l.l0;
            Long l2 = c0pok2.LLLIILIL;
            if (l2 != null) {
                Long lValueOf2 = Long.valueOf(l2.longValue());
                String str3 = c0pok2.LLILLJJLI;
                if (searchMixFeedList != null && (list2 = searchMixFeedList.mItems) != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                C0PP3.LIZJ(Integer.valueOf(size2), str3, "single", lValueOf2, "success");
            }
            if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c0po5LJII.LIZIZ(size);
            if (searchMixFeedList != null) {
                requestId = searchMixFeedList.getRequestId();
            } else {
                requestId = null;
            }
            c0po5LJII.LJII(requestId);
            Integer numValueOf = Integer.valueOf(searchMixFeedList.cursor);
            if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                c0po5LJII.LJJIJ = numValueOf;
            }
            c0po5LJII.LJIJ(searchMixFeedList);
            c0po5LJII.LJIL(0);
        }
        if (((C0POK) c0r4l.l0).LLLII) {
            c15o7 = null;
        }
        C1C7U.LIZIZ("SearchMixFeedRequest@6c33.call$1");
        return c15o7;
    }

    public static final Object then$3(C0R4L c0r4l, C15O7 c15o7) {
        SugPreInfoResponse sugPreInfoResponse;
        C1C7U.LIZ("SearchSugPresenter@ac4.updatePreInfo$1L$1");
        if (c15o7 != null && c15o7.LJIILJJIL() && ((C15O7) c0r4l.l0) == ((C0QJX) c0r4l.l1).LLJJJJ && (sugPreInfoResponse = (SugPreInfoResponse) c15o7.LJIIL()) != null && !TextUtils.isEmpty(sugPreInfoResponse.preInfoId)) {
            sugPreInfoResponse.LIZ = System.currentTimeMillis() + (sugPreInfoResponse.ttl * 1000);
            ((C0QJX) c0r4l.l1).LLJJJIL = sugPreInfoResponse;
        }
        C1C7U.LIZIZ("SearchSugPresenter@ac4.updatePreInfo$1L$1");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0R4L(Object obj, SearchEffectListViewModel searchEffectListViewModel, Function1<? super SearchEffectListResponse, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = searchEffectListViewModel;
    }
}
