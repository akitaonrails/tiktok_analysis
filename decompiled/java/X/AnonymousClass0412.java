package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.0412, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0412 implements ViewModelProvider.Factory {
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
        return cls.newInstance();
    }
}
