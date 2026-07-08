package Y;

import X.C09JN;
import X.C0P7M;
import X.C0Q73;
import X.C0QW4;
import X.C0QXZ;
import X.C0R4T;
import X.C13LP;
import X.C19EG;
import X.C1C7U;
import X.C606810Nr5;
import X.C645110PSb;
import X.C674850QdX;
import X.C675090Qdv;
import X.C675430QeT;
import X.C675460QeW;
import X.C676050QfT;
import X.C689760R3u;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.SearchDetailRelatedSearchCellComponent;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class AfS146S0200000_10 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        PhotoSearchEnterParams photoSearchEnterParams;
        MutableLiveData mutableLiveDataDQ2;
        C1C7U.LIZ("PhotoSearchFragment@f74c.refreshPage$1$requestByUri$1$1$subscriber$1");
        C676050QfT c676050QfT = (C676050QfT) obj;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchFragment) afS146S0200000_10.l0).LLJIJIL;
        if (photoSearchBaseVM != null) {
            photoSearchEnterParams = photoSearchBaseVM.LLILLL;
        } else {
            photoSearchEnterParams = null;
        }
        C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams, c676050QfT);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchFragment) afS146S0200000_10.l0).LLJIJIL;
        if (photoSearchBaseVM2 != null) {
            photoSearchBaseVM2.FQ2();
        }
        PhotoSearchBaseVM photoSearchBaseVM3 = ((PhotoSearchFragment) afS146S0200000_10.l0).LLJIJIL;
        if (photoSearchBaseVM3 != null && (mutableLiveDataDQ2 = photoSearchBaseVM3.DQ2(c674850QdXLIZIZ)) != null) {
            mutableLiveDataDQ2.observe((C19EG) afS146S0200000_10.l1, ((PhotoSearchFragment) afS146S0200000_10.l0).LLJJJIL);
        }
        C1C7U.LIZIZ("PhotoSearchFragment@f74c.refreshPage$1$requestByUri$1$1$subscriber$1");
    }

    public static final void accept$1(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        C1C7U.LIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$4");
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        if (c606810Nr5.LIZIZ && Intrinsics.LJFF(c606810Nr5.LIZ.LIZ, C645110PSb.LIZ((Fragment) afS146S0200000_10.l0))) {
            ((C0P7M) afS146S0200000_10.l1).LIZLLL("other");
        }
        C1C7U.LIZIZ("SearchFirstPageStayTimeHelper@7b8d.initLifecycleObserver$4");
    }

    public static final void accept$2(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        TypeWords typeWords;
        List<Word> list;
        Word word;
        C1C7U.LIZ("ECSearchBasicView@14cd.refreshHintWord$2$2");
        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
        List<TypeWords> list2 = suggestWordResponse.data;
        if (list2 != null && (typeWords = (TypeWords) C13LP.LJJJLL(list2)) != null && (list = typeWords.words) != null && (word = (Word) C13LP.LJJJLL(list)) != null) {
            C0QXZ c0qxz = (C0QXZ) afS146S0200000_10.l1;
            Function1 function1 = (Function1) afS146S0200000_10.l0;
            word.setImplId(suggestWordResponse.logId);
            c0qxz.getCurrentSearchHintWord().setValue(new C0QW4(word, 0));
            function1.invoke(Boolean.TRUE);
        } else {
            ((Function1) afS146S0200000_10.l0).invoke(Boolean.FALSE);
        }
        List<Function1<C0QW4, Unit>> callbacksWhenRefreshResult = ((C0QXZ) afS146S0200000_10.l1).getCallbacksWhenRefreshResult();
        C0QXZ c0qxz2 = (C0QXZ) afS146S0200000_10.l1;
        Iterator<Function1<C0QW4, Unit>> it2 = callbacksWhenRefreshResult.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(c0qxz2.getCurrentSearchHintWord().getValue());
        }
        C1C7U.LIZIZ("ECSearchBasicView@14cd.refreshHintWord$2$2");
    }

    public static final void accept$3(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        C1C7U.LIZ("ECSearchBasicView@14cd.refreshHintWord$2$3");
        ((Function1) afS146S0200000_10.l0).invoke(Boolean.FALSE);
        Iterator<Function1<C0QW4, Unit>> it2 = ((C0QXZ) afS146S0200000_10.l1).getCallbacksWhenRefreshResult().iterator();
        while (it2.hasNext()) {
            it2.next().invoke(null);
        }
        C1C7U.LIZIZ("ECSearchBasicView@14cd.refreshHintWord$2$3");
    }

    public static final void accept$4(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        C1C7U.LIZ("SearchDetailRelatedSearchCellComponent@240a.registerLifeCycleObserver$1");
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        if (c606810Nr5.LIZIZ && Intrinsics.LJFF(c606810Nr5.LIZ, afS146S0200000_10.l0)) {
            ((SearchDetailRelatedSearchCellComponent) afS146S0200000_10.l1).ep("switch_background");
        }
        C1C7U.LIZIZ("SearchDetailRelatedSearchCellComponent@240a.registerLifeCycleObserver$1");
    }

    public static final void accept$5(AfS146S0200000_10 afS146S0200000_10, Object obj) {
        C1C7U.LIZ("ShopLegacySparkView@8dc2.loadDynamicView$2");
        TemplateData templateData = (TemplateData) obj;
        C675430QeT c675430QeT = (C675430QeT) afS146S0200000_10.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS146S0200000_10.l1;
        c675430QeT.LJIIJJI = dynamicPatch;
        c675430QeT.getClass();
        C0Q73 c0q73 = C0Q73.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c675430QeT.LJIILIIL;
        String str = dynamicPatch.schema;
        C0R4T c0r4t = new C0R4T(c675430QeT, 15);
        C689760R3u c689760R3u = new C689760R3u(c675430QeT, 2);
        C675460QeW c675460QeW = new C675460QeW(c675430QeT);
        c0q73.getClass();
        C0Q73.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, str, templateData, false, c0r4t, c689760R3u, null, c675460QeW);
        C1C7U.LIZIZ("ShopLegacySparkView@8dc2.loadDynamicView$2");
    }

    public AfS146S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
