package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;

/* JADX INFO: renamed from: X.0Ped, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650050Ped implements InterfaceC650130Pel {
    public final /* synthetic */ SearchContainerFragment LIZ;

    public C650050Ped(SearchContainerFragment searchContainerFragment) {
        this.LIZ = searchContainerFragment;
    }

    public final void LIZ(boolean z) {
        ((LiveData) this.LIZ.LLJILLL.LLJI.getValue()).postValue(Boolean.valueOf(z));
    }
}
