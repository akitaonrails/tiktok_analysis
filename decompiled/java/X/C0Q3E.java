package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0Q3E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3E {
    public static final ISearchContextAbility LJFF() {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().LJJI();
    }

    public static final ISearchContextAbility LJI() {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().A();
    }

    public static final ISearchContextAbility LIZ(View view) {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().d0(view);
    }

    public static final ISearchContextAbility LIZIZ(Fragment fragment) {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().A0(fragment);
    }

    public static final ISearchContextAbility LIZJ(Aweme aweme) {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().D(aweme);
    }

    public static final ISearchContextAbility LIZLLL(SearchResultParam searchResultParam) {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().p0(searchResultParam);
    }

    public static final ISearchContextAbility LJ(LifecycleOwner lifecycleOwner) {
        C646640PXy.LIZ.getClass();
        return C646640PXy.LIZ().A0(lifecycleOwner);
    }
}
