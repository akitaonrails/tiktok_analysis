package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220000hqw {
    public static final Function0<ViewModelProvider.Factory> LIZ(HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory) {
        if (hasDefaultViewModelProviderFactory != null) {
            return new C1219990hqv(hasDefaultViewModelProviderFactory);
        }
        return C1143000fqk.LIZ;
    }
}
