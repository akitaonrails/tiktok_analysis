package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;

/* JADX INFO: renamed from: X.0e8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077360e8s implements ViewModelProvider.Factory {
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

    public C1077360e8s(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C1077360e8s c1077360e8s, Class cls) {
        return new ProfileViewModel();
    }

    public static final ViewModel create$1(C1077360e8s c1077360e8s, Class cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getSimpleName());
        sbLIZ.append(" should be created in the host before being used.");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        throw new IllegalStateException(strLIZIZ) { // from class: X.0e74
        };
    }
}
