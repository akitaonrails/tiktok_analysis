package Y;

import X.C0NAL;
import X.C0NB9;
import X.C1C7U;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS11S0000100_9 implements Runnable {
    public final int $t;
    public long j0;

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

    public static final void run$0(ARunnableS11S0000100_9 aRunnableS11S0000100_9) {
        boolean zLIZ;
        C1C7U.LIZ("ClientAIFeatureHelper@1ae7.getBatchInputLabeledByGroup$2");
        try {
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.reportEvent("ml_scene_run", new JSONObject().put(Scene.SCENE_SERVICE, "getBatchInputLabeledByGroup").put("data_cost", aRunnableS11S0000100_9.j0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientAIFeatureHelper@1ae7.getBatchInputLabeledByGroup$2");
    }

    public static final void run$1(ARunnableS11S0000100_9 aRunnableS11S0000100_9) {
        boolean zLIZ;
        C1C7U.LIZ("MobClickDispatcher@e8a9.dispatchWithTimeout$watchdogFuture$1");
        try {
            C0NB9.LIZIZ.remove(Long.valueOf(aRunnableS11S0000100_9.j0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MobClickDispatcher@e8a9.dispatchWithTimeout$watchdogFuture$1");
    }

    public ARunnableS11S0000100_9(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
