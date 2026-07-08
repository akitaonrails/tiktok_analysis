package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.0Zi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906980Zi4 implements ViewModelProvider.Factory {
    public static final C906980Zi4 LIZ = new C906980Zi4();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return C19566311gr.LIZIZ(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return (T) C1968307nN.LIZ(C09R7.LIZ(c13iq));
    }
}
