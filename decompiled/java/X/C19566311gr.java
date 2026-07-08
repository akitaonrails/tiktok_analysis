package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.11gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19566311gr {
    public static ViewModelProvider.Factory LIZLLL(C19566111gp<?>... c19566111gpArr) {
        return ViewModelProvider.Factory.Companion.from(c19566111gpArr);
    }

    public static ViewModel LIZIZ(ViewModelProvider.Factory factory, Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static ViewModel LIZ(ViewModelProvider.Factory factory, C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return factory.create(C09R7.LIZ(c13iq), abstractC903280Zc6);
    }

    public static ViewModel LIZJ(ViewModelProvider.Factory factory, Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return factory.create(cls);
    }
}
