package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665330Q7v extends C09AY implements Function0<C445430HdN> {
    public final /* synthetic */ SearchRootFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665330Q7v(SearchRootFragment searchRootFragment) {
        super(0);
        this.LL = searchRootFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0HdN, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C445430HdN invoke() {
        View view = this.LL.getView();
        if (view != null) {
            return view.findViewById(R.id.iiv);
        }
        return null;
    }
}
