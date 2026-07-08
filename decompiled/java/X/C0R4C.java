package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;

/* JADX INFO: renamed from: X.0R4C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4C implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C0R4C(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C0R4C c0r4c, Class cls) {
        return new HomePageDataViewModel();
    }

    public static final ViewModel create$1(C0R4C c0r4c, Class cls) {
        return new HomePageDataViewModel();
    }

    public static final ViewModel create$2(C0R4C c0r4c, Class cls) {
        return new HomePageDataViewModel();
    }

    public static final ViewModel create$3(C0R4C c0r4c, Class cls) {
        return new HomePageDataViewModel();
    }
}
