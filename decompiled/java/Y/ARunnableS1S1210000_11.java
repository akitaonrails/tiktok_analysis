package Y;

import X.C1C7U;
import X.C2765015f;
import X.C698480RaY;
import X.C699060RbU;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS1S1210000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1210000_11.LIZ$0():void");
    }

    public static final void run$0(ARunnableS1S1210000_11 aRunnableS1S1210000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractAreaComponent@725d.changePendingState$$inlined$postOnUIThread$1");
        try {
            C699060RbU c699060RbU = ((InteractAreaComponent) aRunnableS1S1210000_11.l1).LLLFFI;
            if (c699060RbU != null) {
                c699060RbU.LJI(aRunnableS1S1210000_11.s0, (ComponentPriorityProtocol) aRunnableS1S1210000_11.l2, aRunnableS1S1210000_11.z3);
            }
            C2765015f.LIZ("InteractAreaComponent.changePendingState", new C698480RaY((InteractAreaComponent) aRunnableS1S1210000_11.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractAreaComponent@725d.changePendingState$$inlined$postOnUIThread$1");
    }

    public static final void run$1(ARunnableS1S1210000_11 aRunnableS1S1210000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ImagePlayEventTrackerV2@5fdb.logSlidesImageLoad$1");
        try {
            aRunnableS1S1210000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePlayEventTrackerV2@5fdb.logSlidesImageLoad$1");
    }

    public ARunnableS1S1210000_11(Object obj, String str, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.z3 = z;
    }
}
