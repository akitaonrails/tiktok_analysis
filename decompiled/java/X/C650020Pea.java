package X;

import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650020Pea extends AbstractC2361009My {
    public final /* synthetic */ SearchContainerFragment LL;

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        return false;
    }

    @Override // X.AbstractC2361009My
    public final Map<String, String> mobExtraParams() {
        return new HashMap<String, String>(this) { // from class: X.0PeV
            {
                String str;
                AbsSearchBaseFragment absSearchBaseFragmentNR;
                SearchContainerFragment searchContainerFragment = this.LL;
                if (searchContainerFragment.NR() != null && searchContainerFragment.NR().OR() != C644560PPy.LJIJJLI()) {
                    str = "search_result";
                } else {
                    str = "general_search";
                }
                put("enter_from", str);
                if ((C272130AlX.LIZ() || C272140AlY.LIZ()) && (absSearchBaseFragmentNR = this.LL.NR()) != null) {
                    putAll(absSearchBaseFragmentNR.PR());
                }
            }
        };
    }

    public C650020Pea(SearchContainerFragment searchContainerFragment) {
        this.LL = searchContainerFragment;
    }
}
