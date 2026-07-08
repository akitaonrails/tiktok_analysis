package Y;

import X.C20223714Bf;
import X.ExecutorC21643019n2;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public class AObserverS192S0200000_33 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS192S0200000_33 aObserverS192S0200000_33, Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) aObserverS192S0200000_33.l0;
        BiometricViewModel biometricViewModel = (BiometricViewModel) aObserverS192S0200000_33.l1;
        C20223714Bf c20223714Bf = (C20223714Bf) obj;
        if (c20223714Bf != null) {
            biometricFragment.WR(c20223714Bf);
            if (biometricViewModel.LLJJI == null) {
                biometricViewModel.LLJJI = new MutableLiveData<>();
            }
            BiometricViewModel.BQ2(biometricViewModel.LLJJI, null);
            return;
        }
        biometricFragment.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS192S0200000_33 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS192S0200000_33.onChanged$1(Y.AObserverS192S0200000_33, java.lang.Object):void");
    }

    public static final void onChanged$2(AObserverS192S0200000_33 aObserverS192S0200000_33, Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) aObserverS192S0200000_33.l0;
        BiometricViewModel biometricViewModel = (BiometricViewModel) aObserverS192S0200000_33.l1;
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence != null) {
            if (biometricFragment.RR()) {
                biometricFragment.ZR(charSequence);
            }
            biometricViewModel.xQ2(null);
            return;
        }
        biometricFragment.getClass();
    }

    public static final void onChanged$3(AObserverS192S0200000_33 aObserverS192S0200000_33, Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) aObserverS192S0200000_33.l0;
        BiometricViewModel biometricViewModel = (BiometricViewModel) aObserverS192S0200000_33.l1;
        biometricFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (biometricFragment.RR()) {
                biometricFragment.ZR(biometricFragment.getString(2131834692));
            }
            BiometricViewModel biometricViewModelOR = biometricFragment.OR();
            if (biometricViewModelOR != null && biometricViewModelOR.LLJIJIL) {
                Executor executorC21643019n2 = biometricViewModelOR.LL;
                if (executorC21643019n2 == null) {
                    executorC21643019n2 = new ExecutorC21643019n2();
                }
                executorC21643019n2.execute(new ARunnableS133S0100000_33(biometricViewModelOR, 10));
            }
            if (biometricViewModel.LLJJIJIIJIL == null) {
                biometricViewModel.LLJJIJIIJIL = new MutableLiveData<>();
            }
            BiometricViewModel.BQ2(biometricViewModel.LLJJIJIIJIL, Boolean.FALSE);
        }
    }

    public static final void onChanged$4(AObserverS192S0200000_33 aObserverS192S0200000_33, Object obj) {
        CharSequence string;
        BiometricFragment biometricFragment = (BiometricFragment) aObserverS192S0200000_33.l0;
        BiometricViewModel biometricViewModel = (BiometricViewModel) aObserverS192S0200000_33.l1;
        biometricFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (biometricFragment.PR()) {
                biometricFragment.SR();
            } else {
                BiometricViewModel biometricViewModelOR = biometricFragment.OR();
                if (biometricViewModelOR == null || (string = biometricViewModelOR.wQ2()) == null) {
                    string = biometricFragment.getString(2131830514);
                }
                biometricFragment.UR(13, string);
                biometricFragment.MR(2);
            }
            biometricViewModel.AQ2(false);
        }
    }

    public static final void onChanged$5(AObserverS192S0200000_33 aObserverS192S0200000_33, Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) aObserverS192S0200000_33.l0;
        BiometricViewModel biometricViewModel = (BiometricViewModel) aObserverS192S0200000_33.l1;
        biometricFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            biometricFragment.MR(1);
            biometricFragment.dismiss();
            if (biometricViewModel.LLJJJIL == null) {
                biometricViewModel.LLJJJIL = new MutableLiveData<>();
            }
            BiometricViewModel.BQ2(biometricViewModel.LLJJJIL, Boolean.FALSE);
        }
    }

    public AObserverS192S0200000_33(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel, int i) {
        this.$t = i;
        this.l0 = biometricFragment;
        this.l1 = biometricViewModel;
    }
}
