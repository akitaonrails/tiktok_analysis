package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;

/* JADX INFO: renamed from: X.0e3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074260e3s implements ViewModelProvider.Factory {
    public final FindFriendsPageVM LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C1074260e3s(FindFriendsPageVM findFriendsPageVM) {
        this.LIZ = findFriendsPageVM;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        return new RecFriendsVM(this.LIZ);
    }
}
