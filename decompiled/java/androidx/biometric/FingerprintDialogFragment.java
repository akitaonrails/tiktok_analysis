package androidx.biometric;

import X.C1389600mGU;
import X.C1836530xtL;
import X.C1836540xtM;
import X.C21560119Zf;
import X.C21560219Zg;
import X.C21641219mk;
import X.C446980Hfs;
import X.C786410Ut5;
import X.DialogInterfaceC21560019Ze;
import X.DialogInterfaceOnClickListenerC2189611Aml;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public class FingerprintDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KSsoOyA6LD1iKyY8JSA4OyYwZgMlJyHELIOSg2OjU+ICEnDCwtJSA0DjctLiI2JjE=";
    public final Handler LL = new Handler(Looper.getMainLooper());
    public final ARunnableS133S0100000_33 LLILLJJLI = new ARunnableS133S0100000_33(this, 8);
    public BiometricViewModel LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public ImageView LLILZLL;
    public TextView LLIZ;

    public static FingerprintDialogFragment NR() {
        return new FingerprintDialogFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LL.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BiometricViewModel biometricViewModel = this.LLILLL;
        biometricViewModel.LLJJJJ = 0;
        biometricViewModel.zQ2(1);
        this.LLILLL.yQ2(getString(2131834686));
    }

    public final int MR(int i) {
        Context context = getContext();
        Context contextLIZIZ = BiometricPrompt.LIZIZ(this);
        if (context == null || contextLIZIZ == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = contextLIZIZ.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        BiometricViewModel biometricViewModel = this.LLILLL;
        if (biometricViewModel.LLJJJIL == null) {
            biometricViewModel.LLJJJIL = new MutableLiveData<>();
        }
        BiometricViewModel.BQ2(biometricViewModel.LLJJJIL, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int iLIZ;
        super.onCreate(bundle);
        Context contextLIZIZ = BiometricPrompt.LIZIZ(this);
        if (contextLIZIZ != null) {
            BiometricViewModel biometricViewModelLIZJ = BiometricPrompt.LIZJ(contextLIZIZ);
            this.LLILLL = biometricViewModelLIZJ;
            if (biometricViewModelLIZJ.LLJJJJJIL == null) {
                biometricViewModelLIZJ.LLJJJJJIL = new MutableLiveData<>();
            }
            biometricViewModelLIZJ.LLJJJJJIL.observe(this, new AObserverS235S0100000_33(this, 0));
            BiometricViewModel biometricViewModel = this.LLILLL;
            if (biometricViewModel.LLJJJJLIIL == null) {
                biometricViewModel.LLJJJJLIIL = new MutableLiveData<>();
            }
            biometricViewModel.LLJJJJLIIL.observe(this, new AObserverS235S0100000_33(this, 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.LLILZ = MR(C21641219mk.LIZ());
        } else {
            Context context = getContext();
            if (context != null) {
                iLIZ = C446980Hfs.LIZ(context, R.color.fv);
            } else {
                iLIZ = 0;
            }
            this.LLILZ = iLIZ;
        }
        this.LLILZIL = MR(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequenceWQ2;
        View decorView;
        C21560119Zf c21560119Zf = new C21560119Zf(requireContext());
        C1836540xtM c1836540xtM = this.LLILLL.LLILLL;
        if (c1836540xtM != null) {
            charSequence = c1836540xtM.LIZ;
        } else {
            charSequence = null;
        }
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LIZLLL = charSequence;
        View viewSd = C786410Ut5.Sd(R.layout.c7i, C786410Ut5.ne(c21560219Zg.LIZ), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.hz1);
        if (textView != null) {
            this.LLILLL.getClass();
            if (TextUtils.isEmpty(null)) {
                C786410Ut5.LLIL(textView, 8);
            } else {
                C786410Ut5.LLIL(textView, 0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewSd.findViewById(R.id.hyy);
        if (textView2 != null) {
            this.LLILLL.getClass();
            if (TextUtils.isEmpty(null)) {
                C786410Ut5.LLIL(textView2, 8);
            } else {
                C786410Ut5.LLIL(textView2, 0);
                textView2.setText((CharSequence) null);
            }
        }
        this.LLILZLL = (ImageView) viewSd.findViewById(R.id.hz0);
        this.LLIZ = (TextView) viewSd.findViewById(R.id.hyz);
        if (C1836530xtL.LIZIZ(this.LLILLL.vQ2())) {
            charSequenceWQ2 = getString(2131829422);
        } else {
            charSequenceWQ2 = this.LLILLL.wQ2();
        }
        DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml = new DialogInterfaceOnClickListenerC2189611Aml(this, 0);
        C21560219Zg c21560219Zg2 = c21560119Zf.LIZ;
        c21560219Zg2.LJIIIIZZ = charSequenceWQ2;
        c21560219Zg2.LJIIIZ = dialogInterfaceOnClickListenerC2189611Aml;
        c21560219Zg2.LJIJI = viewSd;
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        dialogInterfaceC21560019ZeLIZ.setCanceledOnTouchOutside(false);
        Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogInterfaceC21560019ZeLIZ);
        return dialogInterfaceC21560019ZeLIZ;
    }
}
