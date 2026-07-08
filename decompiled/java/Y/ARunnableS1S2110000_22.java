package Y;

import X.C1C7U;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS1S2110000_22 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S2110000_22 aRunnableS1S2110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchResource$taskId$singleCallback$1$onSuccess$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS1S2110000_22.l2;
            if (nLEResourceCallback != null) {
                String str = aRunnableS1S2110000_22.s0;
                String str2 = aRunnableS1S2110000_22.s1;
                if (str2 == null) {
                    str2 = "";
                }
                nLEResourceCallback.onSuccess(str, str2, aRunnableS1S2110000_22.z3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchResource$taskId$singleCallback$1$onSuccess$1");
    }

    public static final void run$1(ARunnableS1S2110000_22 aRunnableS1S2110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onSuccess$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS1S2110000_22.l2;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onSuccess(aRunnableS1S2110000_22.s0, aRunnableS1S2110000_22.s1, aRunnableS1S2110000_22.z3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onSuccess$1");
    }

    public static final void run$2(ARunnableS1S2110000_22 aRunnableS1S2110000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$3$onSuccess$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS1S2110000_22.l2;
            if (nLEResourceCallback != null) {
                String str = aRunnableS1S2110000_22.s0;
                String str2 = aRunnableS1S2110000_22.s1;
                if (str2 == null) {
                    str2 = "";
                }
                nLEResourceCallback.onSuccess(str, str2, aRunnableS1S2110000_22.z3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$3$onSuccess$1");
    }

    public ARunnableS1S2110000_22(NLEResourceCallback nLEResourceCallback, String str, String str2, boolean z, int i) {
        this.$t = i;
        this.l2 = nLEResourceCallback;
        this.s0 = str;
        this.s1 = str2;
        this.z3 = z;
    }
}
