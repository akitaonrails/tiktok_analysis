package X;

import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665310Q7t extends C09AY implements Function0<C686850Qwt> {
    public final /* synthetic */ SearchRootFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665310Q7t(SearchRootFragment searchRootFragment) {
        super(0);
        this.LL = searchRootFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C686850Qwt invoke() {
        return new C686850Qwt(this.LL.requireActivity(), this.LL);
    }
}
