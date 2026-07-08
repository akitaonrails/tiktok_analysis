package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.EcomSearchListPlayer;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import com.ss.android.ugc.aweme.search.pages.result.common.searchcomment.ui.SearchBigCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R42, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R42 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0R42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        view.removeOnLayoutChangeListener(c0r42);
        if (((EcomSearchListPlayer) c0r42.l0).LLIZ == null) {
            EcomSearchListPlayer ecomSearchListPlayer = (EcomSearchListPlayer) c0r42.l0;
            Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIL = ecomSearchListPlayer.LJJIL(ecomSearchListPlayer.vi());
            EcomSearchListPlayer ecomSearchListPlayer2 = (EcomSearchListPlayer) c0r42.l0;
            C653210Pjj c653210Pjj = ecomSearchListPlayer2.LL.LJJII;
            if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(ecomSearchListPlayer2.LLILZLL, 0, mapLJJIL.keySet())) != null && (searchServiceCenter$AutoPlayAbility = mapLJJIL.get(interfaceC652740PiyLIZIZ)) != null) {
                ((EcomSearchListPlayer) c0r42.l0).LJJIJIIJIL(searchServiceCenter$AutoPlayAbility);
            }
        }
    }

    public static final void onLayoutChange$1(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerViewLLII;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ;
        view.removeOnLayoutChangeListener(c0r42);
        if (((SearchListPlayer) c0r42.l0).LLIZ == null) {
            SearchListPlayer searchListPlayer = (SearchListPlayer) c0r42.l0;
            Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = searchListPlayer.LJJIZ(searchListPlayer.vi());
            SearchListPlayer searchListPlayer2 = (SearchListPlayer) c0r42.l0;
            C653210Pjj c653210Pjj = searchListPlayer2.LLILLJJLI.LJJII;
            if (c653210Pjj != null && (interfaceC652740PiyLIZIZ = c653210Pjj.LIZIZ(searchListPlayer2.LLILZIL, 0, mapLJJIZ.keySet())) != null) {
                ((SearchListPlayer) c0r42.l0).LJJIL(interfaceC652740PiyLIZIZ, mapLJJIZ.get(interfaceC652740PiyLIZIZ), true);
            }
            if (C301440Bri.LIZ()) {
                SearchListPlayer searchListPlayer3 = (SearchListPlayer) c0r42.l0;
                C653210Pjj c653210Pjj2 = searchListPlayer3.LLILLJJLI.LJJII;
                if (c653210Pjj2 != null) {
                    SearchTopFragmentAbility searchTopFragmentAbilityLJJIJIIJIL = searchListPlayer3.LJJIJIIJIL(searchListPlayer3.LLILZIL);
                    if (searchTopFragmentAbilityLJJIJIIJIL != null) {
                        recyclerViewLLII = searchTopFragmentAbilityLJJIJIIJIL.LLII();
                    } else {
                        recyclerViewLLII = null;
                    }
                    InterfaceC652740Piy interfaceC652740PiyLJII = c653210Pjj2.LJII(recyclerViewLLII, ((SearchListPlayer) c0r42.l0).LLILZIL, mapLJJIZ.keySet());
                    if (interfaceC652740PiyLJII != null) {
                        ((SearchListPlayer) c0r42.l0).LJJIL(interfaceC652740PiyLJII, mapLJJIZ.get(interfaceC652740PiyLJII), true);
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$2(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchBigCommentAnchorAssem searchBigCommentAnchorAssem = (SearchBigCommentAnchorAssem) c0r42.l0;
        if (searchBigCommentAnchorAssem.LLLIILIL && i8 - i6 != i4 - i2) {
            ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) searchBigCommentAnchorAssem.LLL.getValue();
            if (iSearchVideoHolderAbility != null) {
                iSearchVideoHolderAbility.Ri1(null);
            }
            ISearchPhotoHolderAbility iSearchPhotoHolderAbility = (ISearchPhotoHolderAbility) ((SearchBigCommentAnchorAssem) c0r42.l0).LLLF.getValue();
            if (iSearchPhotoHolderAbility != null) {
                iSearchPhotoHolderAbility.gE2(null);
            }
        }
    }

    public static final void onLayoutChange$3(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0r42);
        C0PCO c0pco = ((SearchFeedFragment) c0r42.l0).LLLLLLZZ;
        if (c0pco != null) {
            c0pco.LJFF();
        }
    }

    public static final void onLayoutChange$4(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0r42);
        C0PCO c0pco = ((SearchFeedFragment) c0r42.l0).LLLLLLZZ;
        if (c0pco != null) {
            c0pco.LJFF();
        }
    }

    public static final void onLayoutChange$5(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0r42);
        C641860PFo c641860PFo = C641860PFo.LIZ;
        ViewGroup viewGroup = (ViewGroup) c0r42.l0;
        c641860PFo.getClass();
        C641860PFo.LIZJ(viewGroup);
    }

    public static final void onLayoutChange$6(C0R42 c0r42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String word;
        Word word2;
        C0QW4 value = ((C671930QXf) c0r42.l0).getCurrentSearchHintWord().getValue();
        if (value != null && (word2 = value.LIZ) != null) {
            word = word2.getWord();
        } else {
            word = null;
        }
        if ((i7 - i5 != i3 - i || !((C671930QXf) c0r42.l0).LLJJI) && word != null && !Intrinsics.LJFF(word, ((C671930QXf) c0r42.l0).getDefaultHintWord())) {
            int width = (((C671930QXf) c0r42.l0).getWidth() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)))) - ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            Iterator it2 = C1697810uHb.LJIIJJI(41, 51, 61, 71).iterator();
            while (it2.hasNext()) {
                ((C671930QXf) c0r42.l0).getTvSearchInputEnhanceFromXml().setTuxFont(((Number) it2.next()).intValue());
                if (((C671930QXf) c0r42.l0).getTvSearchInputEnhanceFromXml().getPaint().measureText(word) < width) {
                    break;
                }
            }
            ((C671930QXf) c0r42.l0).LLJJI = true;
        }
    }
}
