package Y;

import X.C1C7U;
import X.C989060bqS;
import X.C989070bqT;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS5S2000000_16 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

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

    public static final void run$0(ARunnableS5S2000000_16 aRunnableS5S2000000_16) {
        boolean zLIZ;
        C989060bqS c989060bqS;
        C1C7U.LIZ("PrefetchHTMLStatusRecorder@4c5c.recordMissingHTMLIntercept$1");
        try {
            String str = aRunnableS5S2000000_16.s0;
            if (str != null && str.length() != 0 && (c989060bqS = (C989060bqS) C989070bqT.LIZ.get(aRunnableS5S2000000_16.s0)) != null) {
                c989060bqS.LJFF = aRunnableS5S2000000_16.s1;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchHTMLStatusRecorder@4c5c.recordMissingHTMLIntercept$1");
    }

    public static final void run$1(ARunnableS5S2000000_16 aRunnableS5S2000000_16) {
        boolean zLIZ;
        C989060bqS c989060bqS;
        C1C7U.LIZ("PrefetchHTMLStatusRecorder@4c5c.recordRedirect$1");
        try {
            String str = aRunnableS5S2000000_16.s0;
            if (str != null && str.length() != 0 && (c989060bqS = (C989060bqS) C989070bqT.LIZ.get(aRunnableS5S2000000_16.s0)) != null) {
                String str2 = aRunnableS5S2000000_16.s1;
                c989060bqS.LIZIZ = true;
                c989060bqS.LIZJ = str2;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchHTMLStatusRecorder@4c5c.recordRedirect$1");
    }

    public ARunnableS5S2000000_16(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
