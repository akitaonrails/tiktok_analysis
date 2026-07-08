package X;

import androidx.biometric.BiometricViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21642319mv extends C20223514Bd {
    public final WeakReference<BiometricViewModel> LIZ;

    @Override // X.C20223514Bd
    public final void LIZIZ() {
        if (this.LIZ.get() == null || !this.LIZ.get().LLJIJIL) {
            return;
        }
        BiometricViewModel biometricViewModel = this.LIZ.get();
        if (biometricViewModel.LLJJIJIIJIL == null) {
            biometricViewModel.LLJJIJIIJIL = new MutableLiveData<>();
        }
        BiometricViewModel.BQ2(biometricViewModel.LLJJIJIIJIL, Boolean.TRUE);
    }

    public C21642319mv(BiometricViewModel biometricViewModel) {
        this.LIZ = new WeakReference<>(biometricViewModel);
    }

    @Override // X.C20223514Bd
    public final void LIZJ(C20223714Bf c20223714Bf) {
        if (this.LIZ.get() != null && this.LIZ.get().LLJIJIL) {
            int i = -1;
            if (c20223714Bf.LIZIZ == -1) {
                C14BY c14by = c20223714Bf.LIZ;
                int iVQ2 = this.LIZ.get().vQ2();
                if ((iVQ2 & 32767) != 0 && !C1836530xtL.LIZIZ(iVQ2)) {
                    i = 2;
                }
                c20223714Bf = new C20223714Bf(c14by, i);
            }
            BiometricViewModel biometricViewModel = this.LIZ.get();
            if (biometricViewModel.LLJJI == null) {
                biometricViewModel.LLJJI = new MutableLiveData<>();
            }
            BiometricViewModel.BQ2(biometricViewModel.LLJJI, c20223714Bf);
        }
    }

    @Override // X.C20223514Bd
    public final void LIZ(int i, CharSequence charSequence) {
        if (this.LIZ.get() != null && !this.LIZ.get().LLJILJIL && this.LIZ.get().LLJIJIL) {
            this.LIZ.get().xQ2(new C21567919av(i, charSequence));
        }
    }
}
