package Y;

import X.C1425090nBj;
import X.C1C7U;
import X.C786410Ut5;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS2S0100001_12 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

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

    public static final void run$0(ARunnableS2S0100001_12 aRunnableS2S0100001_12) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateFeedItemAdapter@a29f.instantiateItem$2");
        try {
            if (((C1425090nBj) aRunnableS2S0100001_12.l0).getParent() != null) {
                ((C1425090nBj) aRunnableS2S0100001_12.l0).LJ(aRunnableS2S0100001_12.f1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateFeedItemAdapter@a29f.instantiateItem$2");
    }

    public static final void run$1(ARunnableS2S0100001_12 aRunnableS2S0100001_12) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateFeedItemAdapter@a29f.playVideoAllowPost$1");
        try {
            if (((C1425090nBj) aRunnableS2S0100001_12.l0).getParent() != null) {
                ((C1425090nBj) aRunnableS2S0100001_12.l0).LJ(aRunnableS2S0100001_12.f1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateFeedItemAdapter@a29f.playVideoAllowPost$1");
    }

    public static final void run$2(ARunnableS2S0100001_12 aRunnableS2S0100001_12) {
        boolean zLIZ;
        C1C7U.LIZ("PausePanelComponent@619c.fadeOut$1");
        try {
            C786410Ut5.T4((View) aRunnableS2S0100001_12.l0, aRunnableS2S0100001_12.f1);
            C786410Ut5.LJLLLLLL(8, (View) aRunnableS2S0100001_12.l0);
            ((View) aRunnableS2S0100001_12.l0).setTag(null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PausePanelComponent@619c.fadeOut$1");
    }

    public ARunnableS2S0100001_12(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
