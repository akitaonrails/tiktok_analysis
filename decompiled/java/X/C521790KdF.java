package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;

/* JADX INFO: renamed from: X.0KdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521790KdF implements ViewModelProvider.Factory {
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

    public C521790KdF(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C521790KdF c521790KdF, Class cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorTabViewModel");
        sbLIZ.append(" should be created in the activity before being used.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final ViewModel create$1(C521790KdF c521790KdF, Class cls) {
        return new ScrollSwitchStateManager();
    }

    public static final ViewModel create$2(C521790KdF c521790KdF, Class cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordMVViewModel");
        sbLIZ.append(" should be created in the activity before being used.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final ViewModel create$3(C521790KdF c521790KdF, Class cls) {
        return (ViewModel) MentionFavoriteVideoVM.class.getConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
