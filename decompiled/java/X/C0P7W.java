package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;

/* JADX INFO: renamed from: X.0P7W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P7W implements InterfaceC641090PCp {
    public final /* synthetic */ SearchFeedFragment LIZ;

    @Override // X.InterfaceC641090PCp
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC641090PCp
    public final String getIdentifier() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFeedFragment_");
        sbLIZ.append(this.LIZ.hS());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC641090PCp
    public final Fragment LIZ() {
        return this.LIZ;
    }

    public C0P7W(SearchFeedFragment searchFeedFragment) {
        this.LIZ = searchFeedFragment;
    }
}
