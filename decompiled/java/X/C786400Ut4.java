package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ut4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786400Ut4 extends C0IYA {
    public final int $t;
    public Object l0;

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        if (this.$t != 0) {
            super.LIZJ(i, i2, str);
        } else {
            LIZJ$0(this, i, i2, str);
        }
    }

    @Override // X.C0IYA, X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 1:
                LIZLLL$0(this, str, exc);
                break;
            case 2:
                LIZLLL$1(this, str, exc);
                break;
            case 3:
                LIZLLL$2(this, str, exc);
                break;
            case 4:
                LIZLLL$3(this, str, exc);
                break;
            case 5:
                LIZLLL$4(this, str, exc);
                break;
            default:
                super.LIZLLL(str, exc);
                break;
        }
    }

    public C786400Ut4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C786400Ut4 c786400Ut4, String str, Exception exc) {
        C1324720kZq c1324720kZq = ((C0U2O) c786400Ut4.l0).LLJJ;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.ela);
        }
    }

    public static final void LIZLLL$1(C786400Ut4 c786400Ut4, String str, Exception exc) {
        C1324720kZq c1324720kZq = (C1324720kZq) c786400Ut4.l0;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.ela);
        }
    }

    public static final void LIZLLL$2(C786400Ut4 c786400Ut4, String str, Exception exc) {
        C1324720kZq c1324720kZq = (C1324720kZq) c786400Ut4.l0;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.ela);
        }
    }

    public static final void LIZLLL$3(C786400Ut4 c786400Ut4, String str, Exception exc) {
        ((C0U3F) c786400Ut4.l0).LIZLLL.setImageResource(R.drawable.f00);
    }

    public static final void LIZLLL$4(C786400Ut4 c786400Ut4, String str, Exception exc) {
        ((C0U3F) c786400Ut4.l0).LIZJ.setImageResource(R.drawable.f00);
    }

    public static final void LIZJ$0(C786400Ut4 c786400Ut4, int i, int i2, String str) {
        ViewGroup.LayoutParams layoutParams = ((C749930TbL) c786400Ut4.l0).LLIZ.getLayoutParams();
        int iLIZIZ = (int) C497740JfY.LIZIZ(32.0f);
        layoutParams.width = iLIZIZ;
        layoutParams.height = (i2 * iLIZIZ) / i;
        C786410Ut5.u6(((C749930TbL) c786400Ut4.l0).LLIZ, layoutParams);
    }
}
