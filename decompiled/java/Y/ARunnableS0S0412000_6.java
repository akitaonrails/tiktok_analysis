package Y;

import X.C1C7U;
import X.C429940GtU;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S0412000_6 implements Runnable {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final void run$0(ARunnableS0S0412000_6 aRunnableS0S0412000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EcUsernameWithVerifyAndRelation@b8fb.settleSugUserNameLayout$1");
        try {
            ((C429940GtU) aRunnableS0S0412000_6.l0).h0((View) aRunnableS0S0412000_6.l1, aRunnableS0S0412000_6.i5, (TuxTextView) aRunnableS0S0412000_6.l2, (TuxTextView) aRunnableS0S0412000_6.l3, aRunnableS0S0412000_6.i6, false, aRunnableS0S0412000_6.z4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUsernameWithVerifyAndRelation@b8fb.settleSugUserNameLayout$1");
    }

    public static final void run$1(ARunnableS0S0412000_6 aRunnableS0S0412000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EcUsernameWithVerifyAndRelation@b8fb.updateSugUserNameLayout$1");
        try {
            ((C429940GtU) aRunnableS0S0412000_6.l0).h0((View) aRunnableS0S0412000_6.l1, aRunnableS0S0412000_6.i5, (TuxTextView) aRunnableS0S0412000_6.l2, (TuxTextView) aRunnableS0S0412000_6.l3, aRunnableS0S0412000_6.i6, true, aRunnableS0S0412000_6.z4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUsernameWithVerifyAndRelation@b8fb.updateSugUserNameLayout$1");
    }

    public ARunnableS0S0412000_6(C429940GtU c429940GtU, View view, int i, TuxTextView tuxTextView, TuxTextView tuxTextView2, int i2, boolean z, int i3) {
        this.$t = i3;
        this.l0 = c429940GtU;
        this.l1 = view;
        this.i5 = i;
        this.l2 = tuxTextView;
        this.l3 = tuxTextView2;
        this.i6 = i2;
        this.z4 = z;
    }
}
