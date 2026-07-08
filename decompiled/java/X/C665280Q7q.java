package X;

import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665280Q7q extends C09AY implements Function0<Integer> {
    public final /* synthetic */ SearchRootFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665280Q7q(SearchRootFragment searchRootFragment) {
        super(0);
        this.LL = searchRootFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        SearchRootFragment searchRootFragment = this.LL;
        C19EG c19egRequireActivity = searchRootFragment.requireActivity();
        sAFHelper.getClass();
        return SAFHelper.LJJIJIIJI(searchRootFragment, c19egRequireActivity);
    }
}
