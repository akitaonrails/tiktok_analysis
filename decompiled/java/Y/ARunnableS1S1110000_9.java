package Y;

import X.C0O4M;
import X.C1C7U;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS1S1110000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final void run$0(ARunnableS1S1110000_9 aRunnableS1S1110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSeekEnd$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS1S1110000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekEnd(aRunnableS1S1110000_9.s0, aRunnableS1S1110000_9.z2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSeekEnd$1");
    }

    public static final void run$1(ARunnableS1S1110000_9 aRunnableS1S1110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TopicCollectionCenter@54ea.updateCollectionStatus$1$1");
        try {
            ((C0O4M) aRunnableS1S1110000_9.l1).LIZ(aRunnableS1S1110000_9.s0, aRunnableS1S1110000_9.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopicCollectionCenter@54ea.updateCollectionStatus$1$1");
    }

    public ARunnableS1S1110000_9(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
