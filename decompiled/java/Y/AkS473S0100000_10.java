package Y;

import X.C0PI4;
import X.C0PI9;
import X.C0PM5;
import X.C0PN8;
import X.C0QDD;
import X.C0QR9;
import X.C0QRA;
import X.C11NZ;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1875707Wh;
import X.C284420BCu;
import X.C292480BdG;
import X.C584850Mwl;
import X.C643520PLy;
import X.EnumC1993807rU;
import X.InterfaceC1487280oo2;
import X.InterfaceC668100QIm;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionRecommendResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class AkS473S0100000_10 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public AkS473S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS473S0100000_10 akS473S0100000_10, Object obj) {
        String string;
        CollectionRecommendResponse collectionRecommendResponse = (CollectionRecommendResponse) obj;
        Bundle arguments = ((EditCollectionFragment) akS473S0100000_10.l0).getArguments();
        ArrayList arrayList = null;
        if (arguments != null) {
            string = arguments.getString("enterFrom");
        } else {
            string = null;
        }
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10((EditCollectionFragment) akS473S0100000_10.l0, 102);
        EditCollectionFragment editCollectionFragment = (EditCollectionFragment) akS473S0100000_10.l0;
        List<String> list = collectionRecommendResponse.nameList;
        editCollectionFragment.LLJJJ = list;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1875707Wh(it2.next(), string, awS589S0100000_10));
            }
        }
        return arrayList;
    }

    public static final Object apply$1(AkS473S0100000_10 akS473S0100000_10, Object obj) {
        String string;
        CollectionRecommendResponse collectionRecommendResponse = (CollectionRecommendResponse) obj;
        Bundle arguments = ((InputNameSheetFragment) akS473S0100000_10.l0).getArguments();
        ArrayList arrayList = null;
        if (arguments != null) {
            string = arguments.getString("enterFrom");
        } else {
            string = null;
        }
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10((InputNameSheetFragment) akS473S0100000_10.l0, 104);
        InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) akS473S0100000_10.l0;
        List<String> list = collectionRecommendResponse.nameList;
        inputNameSheetFragment.LLJILLL = list;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1875707Wh(it2.next(), string, awS589S0100000_10));
            }
        }
        return arrayList;
    }

    public static final Object apply$2(AkS473S0100000_10 akS473S0100000_10, Object obj) {
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) obj;
        if (C292480BdG.LIZ()) {
            C643520PLy c643520PLy = (C643520PLy) akS473S0100000_10.l0;
            C0PI9 c0pi9 = c643520PLy.LJIIJJI;
            if (c0pi9 == null) {
                c0pi9 = new C0PI9(c643520PLy.LJ);
                c643520PLy.LJIIJJI = c0pi9;
            }
            if (searchMixFeedList != null) {
                List<SearchMixFeed> list = searchMixFeedList.mItems;
                int i = 0;
                if (list != null && !list.isEmpty()) {
                    C0PN8.LJJIJL(searchMixFeedList);
                    c0pi9.LIZIZ = C0PI4.LIZJ(searchMixFeedList);
                    for (Object obj2 : (ArrayList) C13LP.LJJJJLI(C0PN8.LJJI(searchMixFeedList.mItems))) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Aweme aweme = (Aweme) obj2;
                            if (!C0PM5.LIZIZ(null)) {
                                if (aweme != null) {
                                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "dual_stream_inner_item_mark", "inner");
                                }
                                String str = c0pi9.LIZIZ;
                                if (aweme != null) {
                                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "dual_stream_inner_search_id", str);
                                }
                                String str2 = c0pi9.LIZ.LIZIZ;
                                if (aweme != null) {
                                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "dual_stream_enter_aid", str2);
                                }
                                EnumC1993807rU enumC1993807rU = c0pi9.LIZ.LIZLLL;
                                if (aweme != null) {
                                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "dual_stream_inner_item_enter_scene", enumC1993807rU.name());
                                }
                                if (!((Boolean) C284420BCu.LIZ.getValue()).booleanValue() && aweme != null) {
                                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "dual_stream_no_continue_play", "inner");
                                }
                                int i3 = C0QDD.LLJI;
                                AwemeExtKt.appendExtraParamUseInSearch(aweme, "___inner_search_id", c0pi9.LIZIZ);
                            }
                            C0PI4.LIZLLL(aweme);
                            try {
                                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C584850Mwl.LIZ.LJI(searchMixFeedList.getRequestId(), searchMixFeedList.logPb);
                }
            }
        }
        return searchMixFeedList;
    }

    public static final Object apply$3(AkS473S0100000_10 akS473S0100000_10, Object obj) {
        C0QR9.LIZ.getClass();
        C11NZ<SuggestWordResponse> c11nzLIZ = ((InterfaceC668100QIm) C0QR9.LIZIZ.getValue()).LIZ(((C0QRA) akS473S0100000_10.l0).LIZ, C0QR9.LIZ(), ((C0QRA) akS473S0100000_10.l0).LIZIZ, ((ISearchService) ServiceManager.get().getService(ISearchService.class)).q0(), ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLFFI(true, false), ((C0QRA) akS473S0100000_10.l0).LIZJ);
        C0QR9.LIZJ.set(true);
        return c11nzLIZ;
    }
}
