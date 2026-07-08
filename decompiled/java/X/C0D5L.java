package X;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0D5L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5L {
    public static final SignupViewModel LIZ(C19EG c19eg) {
        final Intent intent = c19eg.getIntent();
        SignupViewModel signupViewModel = (SignupViewModel) new ViewModelProvider(c19eg, new ViewModelProvider.Factory(intent) { // from class: X.0D57
            public final Intent LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = intent;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(SignupViewModel.class)) {
                    return new SignupViewModel(this.LIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown ViewModel class: ");
                sbLIZ.append(cls.getName());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }).get(SignupViewModel.class);
        signupViewModel.LLILLJJLI = new WeakReference<>(c19eg);
        return signupViewModel;
    }

    public static final void LIZIZ(C19EG c19eg) {
        SignupViewModel signupViewModelLIZ = LIZ(c19eg);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(signupViewModelLIZ), null, null, new C0D5M(signupViewModelLIZ, null), 3);
    }
}
