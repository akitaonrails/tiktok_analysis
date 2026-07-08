package Y;

import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C21359318iN;
import X.C21365518jN;
import X.C21365818jQ;
import X.C21366318jV;
import X.C214827195l;
import X.C2188811AlT;
import X.C955080axe;
import android.text.TextUtils;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS8S1201000_32 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C214827195l c214827195l = (C214827195l) this.l1;
        if (c214827195l.LIZJ == null) {
            C20441214yg.LJIIIZ("LayoutGeometryComponent", "zeroSizeRecoverySkipped reason=component_unloaded");
            return;
        }
        if (this.i3 != c214827195l.LJIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("zeroSizeRecoverySkipped reason=stale_epoch scheduled=");
            sbLIZ.append(this.i3);
            sbLIZ.append(" current=");
            sbLIZ.append(((C214827195l) this.l1).LJIIL);
            C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c214827195l.LJI != ((View) this.l2)) {
            C20441214yg.LJIIIZ("LayoutGeometryComponent", "zeroSizeRecoverySkipped reason=parent_changed");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("zeroSizeRecoveryExecuting epoch=");
        sbLIZ2.append(this.i3);
        sbLIZ2.append(" phase=");
        sbLIZ2.append(this.s0);
        C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ2));
        List<C955080axe> list = ((C214827195l) this.l1).LJFF;
        if (list != null) {
            ((C214827195l) this.l1).LIZ(list);
        }
    }

    public static final void run$0(ARunnableS8S1201000_32 aRunnableS8S1201000_32) {
        C21365818jQ c21365818jQ = (C21365818jQ) aRunnableS8S1201000_32.l1;
        int i = aRunnableS8S1201000_32.i3;
        Integer num = (Integer) aRunnableS8S1201000_32.l2;
        String str = aRunnableS8S1201000_32.s0;
        c21365818jQ.getClass();
        C1C7U.LIZ("ARTextModule@7492.lambda$showText$1$1L");
        int i2 = c21365818jQ.LJII;
        if (i2 <= 0) {
            if (i == 1) {
                C19EG c19eg = c21365818jQ.LJFF;
                String string = c19eg.getResources().getString(2131845840);
                C21366318jV.LIZLLL.getClass();
                new C21366318jV(c19eg, string, 0, 3).LIZ();
                C1C7U.LIZIZ("ARTextModule@7492.lambda$showText$1$1L");
                return;
            }
            if (i2 == -1) {
                c21365818jQ.LJII = num.intValue() + str.length();
            }
        }
        if (i == 2) {
            c21365818jQ.LJII = 9999;
        }
        C21359318iN c21359318iN = c21365818jQ.LIZ;
        if (c21359318iN != null) {
            c21359318iN.setMaxTextCount(c21365818jQ.LJII);
        }
        C1C7U.LIZIZ("ARTextModule@7492.lambda$showText$1$1L");
    }

    public static final void run$1(ARunnableS8S1201000_32 aRunnableS8S1201000_32) {
        C21365518jN c21365518jN = (C21365518jN) aRunnableS8S1201000_32.l1;
        Integer num = (Integer) aRunnableS8S1201000_32.l2;
        int i = aRunnableS8S1201000_32.i3;
        String str = aRunnableS8S1201000_32.s0;
        c21365518jN.getClass();
        C1C7U.LIZ("BubbleTextModule@cca5.lambda$showText$1$1L");
        int iIntValue = num.intValue();
        c21365518jN.LJII = iIntValue;
        if (iIntValue <= 0 && i == 1) {
            C19EG c19eg = c21365518jN.LJFF;
            String string = c19eg.getResources().getString(2131845840);
            C21366318jV.LIZLLL.getClass();
            new C21366318jV(c19eg, string, 0, 3).LIZ();
            C1C7U.LIZIZ("BubbleTextModule@cca5.lambda$showText$1$1L");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            c21365518jN.LJII += str.length();
        }
        if (i == 2) {
            c21365518jN.LJII = 9999;
        }
        C21359318iN c21359318iN = c21365518jN.LIZ;
        if (c21359318iN != null) {
            c21359318iN.setMaxTextCount(c21365518jN.LJII);
        }
        C1C7U.LIZIZ("BubbleTextModule@cca5.lambda$showText$1$1L");
    }

    public static final void run$2(ARunnableS8S1201000_32 aRunnableS8S1201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutGeometryComponent@b6ef.scheduleZeroSizeRecovery$1");
        try {
            aRunnableS8S1201000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutGeometryComponent@b6ef.scheduleZeroSizeRecovery$1");
    }

    public ARunnableS8S1201000_32(int i, Object obj, Object obj2, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i3 = i;
        this.l2 = obj2;
        this.s0 = str;
    }
}
