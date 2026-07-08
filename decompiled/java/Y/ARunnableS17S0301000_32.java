package Y;

import X.C118300cf;
import X.C197G;
import X.C1C7U;
import X.C21155417qa;
import X.InterfaceC21155017qW;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS17S0301000_32 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void run$0(ARunnableS17S0301000_32 aRunnableS17S0301000_32) {
        boolean zLIZ;
        boolean z;
        boolean z2;
        C1C7U.LIZ("AIRewriteModule@ac9e.consumeOneFromCacheIfLoading$1");
        try {
            AIRewriteModule aIRewriteModule = (AIRewriteModule) aRunnableS17S0301000_32.l0;
            C197G c197g = aIRewriteModule.LLLIILIL;
            if (c197g != null) {
                z = c197g.LJ;
            } else {
                z = aIRewriteModule.LLLF;
            }
            if (!z) {
                ((CachePoweredTexts) aRunnableS17S0301000_32.l1).currentIndex = aRunnableS17S0301000_32.i3 + 1;
                PoweredTextItem poweredTextItem = (PoweredTextItem) aRunnableS17S0301000_32.l2;
                if (c197g != null) {
                    z2 = c197g.LIZLLL;
                } else {
                    z2 = aIRewriteModule.LLL;
                }
                aIRewriteModule.LJJIIZI(poweredTextItem, z2);
            }
            AIRewriteModule aIRewriteModule2 = (AIRewriteModule) aRunnableS17S0301000_32.l0;
            C197G c197g2 = aIRewriteModule2.LLLIILIL;
            if (c197g2 != null) {
                c197g2.LJ = false;
            } else {
                aIRewriteModule2.LLLF = false;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIRewriteModule@ac9e.consumeOneFromCacheIfLoading$1");
    }

    public static final void run$1(ARunnableS17S0301000_32 aRunnableS17S0301000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcMixMallBubblePool@a8df.submitBubble$3");
        try {
            if (((C21155417qa) aRunnableS17S0301000_32.l0).LIZ.getParent() != null) {
                ((InterfaceC21155017qW) aRunnableS17S0301000_32.l1).LJFF(((C21155417qa) aRunnableS17S0301000_32.l0).LIZIZ, ((C118300cf) aRunnableS17S0301000_32.l2).element, aRunnableS17S0301000_32.i3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcMixMallBubblePool@a8df.submitBubble$3");
    }

    public ARunnableS17S0301000_32(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
