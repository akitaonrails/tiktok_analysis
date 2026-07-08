package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM;

/* JADX INFO: renamed from: X.01OH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01OH implements ViewModelProvider.Factory {
    public final String LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C01OH(String str) {
        this.LIZ = str;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        return new PrivacyItemVM(this.LIZ);
    }
}
