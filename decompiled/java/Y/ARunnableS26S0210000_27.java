package Y;

import X.C1842270y2b;
import X.C1858660yT2;
import X.C1C7U;
import X.C2174781A9k;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS26S0210000_27 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS26S0210000_27 aRunnableS26S0210000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.onBind$4");
        try {
            if (((TakoAnswerBaseAssem) aRunnableS26S0210000_27.l0).LJJIJL().getParent() != null && aRunnableS26S0210000_27.z2) {
                TakoAnswerBaseAssem takoAnswerBaseAssem = (TakoAnswerBaseAssem) aRunnableS26S0210000_27.l0;
                C1858660yT2 c1858660yT2 = (C1858660yT2) aRunnableS26S0210000_27.l1;
                takoAnswerBaseAssem.getClass();
                TakoAnswerBaseAssem.Tr(c1858660yT2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.onBind$4");
    }

    public static final void run$1(ARunnableS26S0210000_27 aRunnableS26S0210000_27) {
        boolean zLIZ;
        C1C7U.LIZ("InputInnerAssem@e064.showSoftKeyboardOnInput$1");
        try {
            ((C1842270y2b) aRunnableS26S0210000_27.l0).requestFocus();
            if (aRunnableS26S0210000_27.z2) {
                C2174781A9k.LIZIZ((C1842270y2b) aRunnableS26S0210000_27.l0);
            } else {
                InputMethodManager inputMethodManager = ((InputInnerAssem) aRunnableS26S0210000_27.l1).LLJJJJJIL;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((C1842270y2b) aRunnableS26S0210000_27.l0, 1);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputInnerAssem@e064.showSoftKeyboardOnInput$1");
    }

    public ARunnableS26S0210000_27(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
