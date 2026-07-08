package Y;

import X.C1C7U;
import X.C529740Kq4;
import X.C529750Kq5;
import X.C530420KrA;
import X.C530470KrF;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS15S0201000_8 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS15S0201000_8 aRunnableS15S0201000_8) {
        C530420KrA c530420KrA = (C530420KrA) aRunnableS15S0201000_8.l0;
        C530470KrF c530470KrF = (C530470KrF) aRunnableS15S0201000_8.l1;
        int i = aRunnableS15S0201000_8.i2;
        c530420KrA.getClass();
        C1C7U.LIZ("MediaAdapter@4186.handleVideoSelected$1L");
        C786410Ut5.LJLLLLLL(4, c530470KrF.LLILZLL);
        C786410Ut5.T4(c530470KrF.LLILZLL, 1.0f);
        c530420KrA.notifyItemChanged(i);
        c530420KrA.LL = false;
        C1C7U.LIZIZ("MediaAdapter@4186.handleVideoSelected$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS15S0201000_8 r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0201000_8.run$1(Y.ARunnableS15S0201000_8):void");
    }

    public static final void run$2(ARunnableS15S0201000_8 aRunnableS15S0201000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aRunnableS15S0201000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aRunnableS15S0201000_8.l1;
        int i = aRunnableS15S0201000_8.i2;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.onSetDuration$1L");
        c529750Kq5.N5(c529740Kq4.LLILZLL);
        if (c529750Kq5.LLIZ.getParent() != null) {
            c529750Kq5.LLIZ.setText(C529740Kq4.LLLILZLLLI(i));
        }
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.onSetDuration$1L");
    }

    public static final void run$3(ARunnableS15S0201000_8 aRunnableS15S0201000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aRunnableS15S0201000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aRunnableS15S0201000_8.l1;
        int i = aRunnableS15S0201000_8.i2;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.onSetDuration$2L");
        c529750Kq5.LLIZ.setText(C529740Kq4.LLLILZLLLI(i));
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.onSetDuration$2L");
    }

    public static final void run$4(ARunnableS15S0201000_8 aRunnableS15S0201000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior@6d00.setState$2");
        try {
            ((ViewPagerBottomSheetBehavior) aRunnableS15S0201000_8.l1).startSettlingAnimation((View) aRunnableS15S0201000_8.l0, aRunnableS15S0201000_8.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior@6d00.setState$2");
    }

    public ARunnableS15S0201000_8(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
