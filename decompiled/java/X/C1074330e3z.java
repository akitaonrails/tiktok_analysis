package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074330e3z {
    public static final /* synthetic */ int LIZ = 0;

    public static ViewModel LIZ(Class cls, ViewModelStoreOwner viewModelStoreOwner, final Function0 function0) {
        ViewModelProvider.Factory newInstanceFactory;
        if (function0 != null) {
            newInstanceFactory = new ViewModelProvider.Factory() { // from class: X.0e3y
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls2, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls2, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls2) {
                    return (T) function0.invoke();
                }
            };
        } else {
            newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
        }
        return new ViewModelProvider(viewModelStoreOwner, newInstanceFactory).get(cls);
    }
}
