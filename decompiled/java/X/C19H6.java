package X;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;

/* JADX INFO: renamed from: X.19H6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19H6 implements ViewModelProvider.Factory {
    public final Application LIZ;
    public final C19H9 LIZIZ;
    public final C1B3S LIZJ;
    public final C1B3J LIZLLL;

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
        return new AuthCommonViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C19H6(Application application, AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, C19H9 c19h9, C1B3S c1b3s, C1B3J c1b3j) {
        this.LIZ = application;
        this.LIZIZ = c19h9;
        this.LIZJ = c1b3s;
        this.LIZLLL = c1b3j;
    }
}
