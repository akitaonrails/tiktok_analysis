package Y;

import X.C1425400nCE;
import X.C1429740nJE;
import X.C1C7U;
import android.view.TextureView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS9S0102000_22 implements Runnable {
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

    public static final void run$0(ARunnableS9S0102000_22 aRunnableS9S0102000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateFeedItemView@2028.initVideoVideoComponent$1$2$onVideoSizeChanged$1$1");
        try {
            if (((TextureView) aRunnableS9S0102000_22.l0).getParent() != null) {
                C1429740nJE.LIZ(aRunnableS9S0102000_22.i1 / aRunnableS9S0102000_22.i2, (TextureView) aRunnableS9S0102000_22.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateFeedItemView@2028.initVideoVideoComponent$1$2$onVideoSizeChanged$1$1");
    }

    public static final void run$1(ARunnableS9S0102000_22 aRunnableS9S0102000_22) {
        boolean zLIZ;
        C1C7U.LIZ("CameraFocusCallback@a1be.onFocus$1");
        try {
            ((C1425400nCE) aRunnableS9S0102000_22.l0).LIZIZ.LJIIJ(new Pair<>(Integer.valueOf(aRunnableS9S0102000_22.i1), Integer.valueOf(aRunnableS9S0102000_22.i2)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraFocusCallback@a1be.onFocus$1");
    }

    public static final void run$2(ARunnableS9S0102000_22 aRunnableS9S0102000_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateItemViewHolder@95ba.initVideoViewComponent$2$onVideoSizeChanged$1$1");
        try {
            if (((TextureView) aRunnableS9S0102000_22.l0).getParent() != null) {
                C1429740nJE.LIZ(aRunnableS9S0102000_22.i1 / aRunnableS9S0102000_22.i2, (TextureView) aRunnableS9S0102000_22.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateItemViewHolder@95ba.initVideoViewComponent$2$onVideoSizeChanged$1$1");
    }

    public ARunnableS9S0102000_22(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
