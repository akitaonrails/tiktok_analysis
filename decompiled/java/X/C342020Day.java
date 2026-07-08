package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;

/* JADX INFO: renamed from: X.0Day, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342020Day {
    public static SearchMarkdownContentCacheVM LIZ(Fragment fragment) {
        if (fragment == null || !C0PPZ.LIZ() || fragment.getActivity() == null) {
            return null;
        }
        return (SearchMarkdownContentCacheVM) new ViewModelProvider(fragment).get(SearchMarkdownContentCacheVM.class);
    }
}
