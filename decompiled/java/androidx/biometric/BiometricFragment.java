package androidx.biometric;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1836530xtL;
import X.C1836540xtM;
import X.C19EG;
import X.C19EH;
import X.C20148513sZ;
import X.C20223714Bf;
import X.C21641919mr;
import X.C21642019ms;
import X.C21642119mt;
import X.C21642219mu;
import X.C21643319n5;
import X.C21643919nB;
import X.C786410Ut5;
import X.ExecutorC21643019n2;
import Y.AObserverS192S0200000_33;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS37S0201000_33;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public class BiometricFragment extends Fragment {
    public static final String _pnsPageId = "KSsoOyA6LD1iKyY8JSA4OyYwHELIOSZgclJiI2PDclKgkhKSIhLCEn";
    public final C21641919mr LL = new C21641919mr();
    public BiometricViewModel LLILLJJLI;

    public final BiometricViewModel OR() {
        if (this.LLILLJJLI == null) {
            C21641919mr c21641919mr = this.LL;
            Context contextLIZIZ = BiometricPrompt.LIZIZ(this);
            c21641919mr.getClass();
            this.LLILLJJLI = BiometricPrompt.LIZJ(contextLIZIZ);
        }
        return this.LLILLJJLI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (X.C20144013rq.LIZIZ(r3, com.zhiliaoapp.musically.R.array.s, r1) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean RR() {
        /*
            r7 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r4 = 28
            if (r6 < r4) goto L2f
            android.content.Context r3 = androidx.biometric.BiometricPrompt.LIZIZ(r7)
            androidx.biometric.BiometricViewModel r0 = r7.OR()
            if (r3 == 0) goto L30
            if (r0 == 0) goto L30
            X.14BY r0 = r0.LLILZ
            if (r0 == 0) goto L30
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            if (r6 != r4) goto L42
            r0 = 2131034127(0x7f05000f, float:1.7678763E38)
            boolean r0 = X.C20144013rq.LIZJ(r3, r0, r2)
            if (r0 != 0) goto L2f
            r0 = 2131034126(0x7f05000e, float:1.767876E38)
            boolean r0 = X.C20144013rq.LIZIZ(r3, r0, r1)
            if (r0 == 0) goto L32
        L2f:
            return r5
        L30:
            if (r6 != r4) goto L42
        L32:
            X.19mr r1 = r7.LL
            android.content.Context r0 = r7.getContext()
            r1.getClass()
            boolean r0 = X.C21643519n7.LIZ(r0)
            if (r0 != 0) goto L42
            return r5
        L42:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.RR():boolean");
    }

    public final void SR() {
        BiometricViewModel biometricViewModelOR;
        Fragment fragment;
        Context contextLIZIZ = BiometricPrompt.LIZIZ(this);
        if (contextLIZIZ == null || (biometricViewModelOR = OR()) == null) {
            return;
        }
        KeyguardManager keyguardManagerLIZ = C21642019ms.LIZ(contextLIZIZ);
        if (keyguardManagerLIZ == null) {
            UR(12, getString(2131835081));
            return;
        }
        C1836540xtM c1836540xtM = biometricViewModelOR.LLILLL;
        Intent intentLIZ = C21642219mu.LIZ(keyguardManagerLIZ, c1836540xtM != null ? c1836540xtM.LIZ : null, null);
        if (intentLIZ == null) {
            UR(14, getString(2131835080));
            return;
        }
        int iIntValue = 1;
        biometricViewModelOR.LLJILJIL = true;
        if (RR()) {
            NR();
        }
        intentLIZ.setFlags(134742016);
        C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSV14uSBeQdBpUwqaVdRqVQEoE45JlGCpueB1Y", new String[]{"01789"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {intentLIZ, 1};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "androidx/biometric/BiometricFragment", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "androidx/biometric/BiometricFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            fragment = obj != null ? (Fragment) obj : this;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intentLIZ = (Intent) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = this;
        }
        fragment.startActivityForResult(intentLIZ, iIntValue);
        c0wst.LIZ(11087, "androidx/biometric/BiometricFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public final void NR() {
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR != null) {
            biometricViewModelOR.LLJI = false;
        }
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) parentFragmentManager.LJJJJZI("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment != null) {
                if (dialogFragment.isAdded()) {
                    dialogFragment.dismissAllowingStateLoss();
                    return;
                }
                C19EH c19ehLJIIJ = parentFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(dialogFragment);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    public final boolean PR() {
        BiometricViewModel biometricViewModelOR = OR();
        return Build.VERSION.SDK_INT <= 28 && biometricViewModelOR != null && C1836530xtL.LIZIZ(biometricViewModelOR.vQ2());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.19ml] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS() {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.aS():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dismiss() {
        /*
            r5 = this;
            r5.NR()
            androidx.biometric.BiometricViewModel r4 = r5.OR()
            r0 = 0
            if (r4 == 0) goto L16
            r4.LLJI = r0
            boolean r0 = r4.LLJILJIL
            if (r0 != 0) goto L24
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L24
        L16:
            androidx.fragment.app.FragmentManager r0 = r5.getParentFragmentManager()
            X.19EH r0 = r0.LJIIJ()
            r0.LJIIZILJ(r5)
            r0.LJIIJ()
        L24:
            android.content.Context r3 = r5.getContext()
            if (r3 == 0) goto L50
            java.lang.String r2 = android.os.Build.MODEL
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 != r0) goto L50
            r0 = 2131034130(0x7f050012, float:1.7678769E38)
            boolean r0 = X.C20144013rq.LIZ(r3, r0, r2)
            if (r0 == 0) goto L50
            if (r4 == 0) goto L40
            r0 = 1
            r4.LLJILJILJ = r0
        L40:
            X.19mr r0 = r5.LL
            android.os.Handler r3 = r0.LIZ
            X.19mn r2 = new X.19mn
            androidx.biometric.BiometricViewModel r0 = r5.LLILLJJLI
            r2.<init>(r0)
            r0 = 600(0x258, double:2.964E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.dismiss():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        final BiometricViewModel biometricViewModelOR = OR();
        if (Build.VERSION.SDK_INT == 29 && biometricViewModelOR != null && C1836530xtL.LIZIZ(biometricViewModelOR.vQ2())) {
            biometricViewModelOR.LLJILLL = true;
            C786410Ut5.LJLIIL(250L, this.LL.LIZ, new Runnable(biometricViewModelOR) { // from class: X.19mm
                public final WeakReference<BiometricViewModel> LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    try {
                        if (this.LL.get() != null) {
                            this.LL.get().LLJILLL = false;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }

                {
                    this.LL = new WeakReference<>(biometricViewModelOR);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        BiometricViewModel biometricViewModelOR = OR();
        if (Build.VERSION.SDK_INT >= 29 || biometricViewModelOR == null || biometricViewModelOR.LLJILJIL) {
            return;
        }
        C19EG activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            MR(0);
        }
    }

    public final void MR(int i) {
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR == null) {
            return;
        }
        if (i != 3 && biometricViewModelOR.LLJILLL) {
            return;
        }
        if (RR()) {
            biometricViewModelOR.LLJ = i;
            if (i == 1) {
                VR(10, C21642119mt.LIZ(10, getContext()));
            }
        }
        if (biometricViewModelOR.LLILZLL == null) {
            biometricViewModelOR.LLILZLL = new C21643319n5();
        }
        C21643319n5 c21643319n5 = biometricViewModelOR.LLILZLL;
        CancellationSignal cancellationSignal = c21643319n5.LIZIZ;
        if (cancellationSignal != null) {
            try {
                C21643919nB.LIZ(cancellationSignal);
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c21643319n5.LIZIZ = null;
        }
        C20148513sZ c20148513sZ = c21643319n5.LIZJ;
        if (c20148513sZ != null) {
            try {
                c20148513sZ.LIZ();
            } catch (NullPointerException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            c21643319n5.LIZJ = null;
        }
    }

    public final void WR(C20223714Bf c20223714Bf) {
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR != null && biometricViewModelOR.LLJIJIL) {
            biometricViewModelOR.LLJIJIL = false;
            Executor executorC21643019n2 = biometricViewModelOR.LL;
            if (executorC21643019n2 == null) {
                executorC21643019n2 = new ExecutorC21643019n2();
            }
            executorC21643019n2.execute(new ARunnableS102S0200000_33(c20223714Bf, biometricViewModelOR, 0));
        }
        dismiss();
    }

    public final void ZR(CharSequence charSequence) {
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR != null) {
            if (charSequence == null) {
                charSequence = getString(2131830514);
            }
            biometricViewModelOR.zQ2(2);
            biometricViewModelOR.yQ2(charSequence);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR != null) {
            new WeakReference(getActivity());
            if (biometricViewModelOR.LLJJI == null) {
                biometricViewModelOR.LLJJI = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJI.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 0));
            if (biometricViewModelOR.LLJJIII == null) {
                biometricViewModelOR.LLJJIII = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJIII.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 1));
            if (biometricViewModelOR.LLJJIJI == null) {
                biometricViewModelOR.LLJJIJI = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJIJI.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 2));
            if (biometricViewModelOR.LLJJIJIIJIL == null) {
                biometricViewModelOR.LLJJIJIIJIL = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJIJIIJIL.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 3));
            if (biometricViewModelOR.LLJJIJIL == null) {
                biometricViewModelOR.LLJJIJIL = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJIJIL.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 4));
            if (biometricViewModelOR.LLJJJIL == null) {
                biometricViewModelOR.LLJJJIL = new MutableLiveData<>();
            }
            biometricViewModelOR.LLJJJIL.observe(this, new AObserverS192S0200000_33(this, biometricViewModelOR, 5));
        }
    }

    public final void UR(int i, CharSequence charSequence) {
        VR(i, charSequence);
        dismiss();
    }

    public final void VR(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModelOR = OR();
        if (biometricViewModelOR == null || biometricViewModelOR.LLJILJIL || !biometricViewModelOR.LLJIJIL) {
            return;
        }
        biometricViewModelOR.LLJIJIL = false;
        Executor executorC21643019n2 = biometricViewModelOR.LL;
        if (executorC21643019n2 == null) {
            executorC21643019n2 = new ExecutorC21643019n2();
        }
        executorC21643019n2.execute(new ARunnableS37S0201000_33(biometricViewModelOR, i, charSequence, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            BiometricViewModel biometricViewModelOR = OR();
            if (biometricViewModelOR != null) {
                biometricViewModelOR.LLJILJIL = false;
            }
            if (i2 == -1) {
                BiometricViewModel biometricViewModelOR2 = OR();
                if (biometricViewModelOR2 != null && biometricViewModelOR2.LLJJ) {
                    biometricViewModelOR2.LLJJ = false;
                    i3 = -1;
                }
                WR(new C20223714Bf(null, i3));
                return;
            }
            UR(10, getString(2131835082));
        }
    }
}
