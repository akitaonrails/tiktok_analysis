package Y;

import X.C15O7;
import X.C1915720zx4;
import X.C1915790zxB;
import X.C19645011tY;
import X.C1C7U;
import X.C259800zU;
import X.CallableC1915740zx6;
import X.InterfaceC1915880zxK;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AwS463S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS22S1300000_28 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final void run$0(ARunnableS22S1300000_28 aRunnableS22S1300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ConsentApiManager@24f3.createConsentRecord$1$1$1");
        try {
            C1915790zxB c1915790zxB = (C1915790zxB) aRunnableS22S1300000_28.l1;
            String str = aRunnableS22S1300000_28.s0;
            List list = (List) aRunnableS22S1300000_28.l2;
            InterfaceC1915880zxK interfaceC1915880zxK = (InterfaceC1915880zxK) aRunnableS22S1300000_28.l3;
            c1915790zxB.getClass();
            C15O7.LIZJ(new CallableC1915740zx6(interfaceC1915880zxK, c1915790zxB, str, list));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsentApiManager@24f3.createConsentRecord$1$1$1");
    }

    public static final void run$1(ARunnableS22S1300000_28 aRunnableS22S1300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ConsentApiManager@24f3.fetchConsentRecordAfterDidReady$3$1");
        try {
            ((C1915790zxB) aRunnableS22S1300000_28.l1).LIZ((C1915720zx4) aRunnableS22S1300000_28.l2, aRunnableS22S1300000_28.s0, (InterfaceC1915880zxK) aRunnableS22S1300000_28.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsentApiManager@24f3.fetchConsentRecordAfterDidReady$3$1");
    }

    public static final void run$2(ARunnableS22S1300000_28 aRunnableS22S1300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ArticleLinkEditorVM@3843.createParseUrlTitleTask$2$1");
        try {
            ((C19645011tY) aRunnableS22S1300000_28.l1).LIZLLL.LIZ(aRunnableS22S1300000_28.s0, new AwS463S0200000_28((C259800zU) aRunnableS22S1300000_28.l2, (C259800zU<String>) aRunnableS22S1300000_28.l3, (CountDownLatch) 6));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ArticleLinkEditorVM@3843.createParseUrlTitleTask$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS22S1300000_28(Object obj, C19645011tY c19645011tY, String str, C259800zU<String> c259800zU, CountDownLatch countDownLatch) {
        this.$t = countDownLatch;
        this.l1 = obj;
        this.s0 = c19645011tY;
        this.l2 = str;
        this.l3 = c259800zU;
    }
}
