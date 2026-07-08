package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationAllTabResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel;

/* JADX INFO: renamed from: X.0zZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901250zZj implements ViewModelProvider.Factory {
    public final boolean LIZ;
    public final boolean LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (this.LIZ) {
            return new NotificationCreatorResultViewModel();
        }
        if (this.LIZIZ) {
            return new NotificationAllTabResultViewModel();
        }
        return new NotificationResultViewModel();
    }

    public C1901250zZj(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
