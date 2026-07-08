package androidx.biometric;

import X.AbstractC21643419n6;
import X.C14BY;
import X.C1836530xtL;
import X.C1836540xtM;
import X.C20223714Bf;
import X.C21567919av;
import X.C21643219n4;
import X.C21643319n5;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC21641319ml;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public class BiometricViewModel extends ViewModel {
    public Executor LL;
    public AbstractC21643419n6 LLILLJJLI;
    public C1836540xtM LLILLL;
    public C14BY LLILZ;
    public C21643219n4 LLILZIL;
    public C21643319n5 LLILZLL;
    public DialogInterfaceOnClickListenerC21641319ml LLIZ;
    public CharSequence LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public MutableLiveData<C20223714Bf> LLJJI;
    public MutableLiveData<C21567919av> LLJJIII;
    public MutableLiveData<CharSequence> LLJJIJI;
    public MutableLiveData<Boolean> LLJJIJIIJIL;
    public MutableLiveData<Boolean> LLJJIJIL;
    public boolean LLJJJ = true;
    public MutableLiveData<Boolean> LLJJJIL;
    public int LLJJJJ;
    public MutableLiveData<Integer> LLJJJJJIL;
    public MutableLiveData<CharSequence> LLJJJJLIIL;

    public final int vQ2() {
        C1836540xtM c1836540xtM = this.LLILLL;
        if (c1836540xtM != null) {
            return C1836530xtL.LIZ(c1836540xtM, this.LLILZ);
        }
        return 0;
    }

    public final CharSequence wQ2() {
        CharSequence charSequence = this.LLIZLLLIL;
        if (charSequence != null) {
            return charSequence;
        }
        C1836540xtM c1836540xtM = this.LLILLL;
        if (c1836540xtM == null) {
            return null;
        }
        CharSequence charSequence2 = c1836540xtM.LIZIZ;
        return charSequence2 == null ? "" : charSequence2;
    }

    public final void AQ2(boolean z) {
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new MutableLiveData<>();
        }
        BQ2(this.LLJJIJIL, Boolean.valueOf(z));
    }

    public final void xQ2(C21567919av c21567919av) {
        if (this.LLJJIII == null) {
            this.LLJJIII = new MutableLiveData<>();
        }
        BQ2(this.LLJJIII, c21567919av);
    }

    public final void yQ2(CharSequence charSequence) {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new MutableLiveData<>();
        }
        BQ2(this.LLJJJJLIIL, charSequence);
    }

    public final void zQ2(int i) {
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new MutableLiveData<>();
        }
        BQ2(this.LLJJJJJIL, Integer.valueOf(i));
    }

    public static <T> void BQ2(MutableLiveData<T> mutableLiveData, T t) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
