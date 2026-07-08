package Y;

import X.C0T6Q;
import X.C1C7U;
import X.C786410Ut5;
import android.content.Context;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS3S2200000_12 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
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

    public static final void run$0(ARunnableS3S2200000_12 aRunnableS3S2200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CacheRepository@34a7.saveJSONObject$1");
        try {
            C0T6Q.LIZJ((Context) aRunnableS3S2200000_12.l2, aRunnableS3S2200000_12.s0).edit().putString(aRunnableS3S2200000_12.s1, C786410Ut5.J3((JSONObject) aRunnableS3S2200000_12.l3)).apply();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CacheRepository@34a7.saveJSONObject$1");
    }

    public static final void run$1(ARunnableS3S2200000_12 aRunnableS3S2200000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CacheRepository@34a7.saveStringSet$1");
        try {
            C0T6Q.LIZJ((Context) aRunnableS3S2200000_12.l2, aRunnableS3S2200000_12.s0).edit().putStringSet(aRunnableS3S2200000_12.s1, (Set) aRunnableS3S2200000_12.l3).apply();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CacheRepository@34a7.saveStringSet$1");
    }

    public ARunnableS3S2200000_12(Context context, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = context;
        this.s0 = "SP_EXPERIMENT_CACHE";
        this.s1 = "SP_EXPERIMENT_CACHE";
        this.l3 = jSONObject;
    }

    public ARunnableS3S2200000_12(Context context, String str, Set set, int i) {
        this.$t = i;
        this.l2 = context;
        this.s0 = "SP_EXPERIMENT_CACHE";
        this.s1 = str;
        this.l3 = set;
    }
}
