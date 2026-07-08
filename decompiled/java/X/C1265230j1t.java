package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.FollowItemCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.RelationStatusCell;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;

/* JADX INFO: renamed from: X.0j1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265230j1t extends AbstractC1906720ziY {
    public boolean LLIZLLLIL;
    public FollowingListViewModel LLJ;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(FollowItemCell.class);
        LJIILIIL(RelationStatusCell.class);
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onDestroy() {
        this.LLJ = null;
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onPause() {
        this.LLIZLLLIL = true;
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        if (!C2277051EAt.LIZ() || ((Number) C2277051EAt.LIZLLL.getValue()).intValue() != 2 || !this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = false;
        FollowingListViewModel followingListViewModel = this.LLJ;
        if (followingListViewModel != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(followingListViewModel), C0PEM.LIZJ, null, new C0OBQ(followingListViewModel, null), 2);
        }
    }
}
