package Y;

import X.C0SPV;
import X.C1C7U;
import X.C720840SPi;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS1S0202000_11 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S0202000_11 aRunnableS1S0202000_11) {
        boolean zLIZ;
        C1C7U.LIZ("CommentDescView@e42c.setTextExtraList$3$1");
        try {
            ((C0SPV) aRunnableS1S0202000_11.l0).LLILLJJLI.LJJJJI(aRunnableS1S0202000_11.i2, aRunnableS1S0202000_11.i3, aRunnableS1S0202000_11.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentDescView@e42c.setTextExtraList$3$1");
    }

    public static final void run$1(ARunnableS1S0202000_11 aRunnableS1S0202000_11) {
        boolean zLIZ;
        C1C7U.LIZ("BubbleDescView@9e7f.setTextExtraList$2$1");
        try {
            ((C720840SPi) aRunnableS1S0202000_11.l0).LJJJJI(aRunnableS1S0202000_11.i2, aRunnableS1S0202000_11.i3, aRunnableS1S0202000_11.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BubbleDescView@9e7f.setTextExtraList$2$1");
    }

    public ARunnableS1S0202000_11(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = obj2;
    }
}
