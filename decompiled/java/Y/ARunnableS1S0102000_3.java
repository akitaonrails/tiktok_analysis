package Y;

import X.C13LP;
import X.C1C7U;
import X.C2228508oF;
import X.C591510NHx;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS1S0102000_3 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void run$0(ARunnableS1S0102000_3 aRunnableS1S0102000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinAudioPcmRecorder@8548.startAppend$3");
        try {
            ((C2228508oF) aRunnableS1S0102000_3.l0).LIZLLL(aRunnableS1S0102000_3.i1, aRunnableS1S0102000_3.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinAudioPcmRecorder@8548.startAppend$3");
    }

    public static final void run$1(ARunnableS1S0102000_3 aRunnableS1S0102000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinAudioPcmRecorder@8548.start$1");
        try {
            ((C2228508oF) aRunnableS1S0102000_3.l0).LIZLLL(aRunnableS1S0102000_3.i1, aRunnableS1S0102000_3.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinAudioPcmRecorder@8548.start$1");
    }

    public static final void run$2(ARunnableS1S0102000_3 aRunnableS1S0102000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreVideoPreloadService@bbfe.preloadFirstScreenResource$1");
        try {
            List listLL = C13LP.LL((List) aRunnableS1S0102000_3.l0, aRunnableS1S0102000_3.i1);
            int i = aRunnableS1S0102000_3.i2;
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                C591510NHx.LIZIZ(i, (Aweme) it2.next());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreVideoPreloadService@bbfe.preloadFirstScreenResource$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0102000_3(Object obj, List<? extends Aweme> list, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = list;
        this.i2 = i;
    }
}
