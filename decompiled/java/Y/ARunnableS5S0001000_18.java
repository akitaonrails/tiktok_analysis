package Y;

import X.AbstractC1196150hET;
import X.C1185040gwY;
import X.C1202100hO4;
import X.C1204880hSY;
import X.C1C7U;
import X.C2344009Gk;
import java.util.Map;
import kotlin.jvm.internal.AwS32S0001000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS5S0001000_18 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f285i0;

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

    public final void LIZ$0() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        int i = this.f285i0;
        c2344009Gk.LJIIIIZZ("action_type", i > 0 ? "slide_down" : i < 0 ? "slide_up" : "counteract_move");
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("nearby_outflow_slide", map, null);
    }

    public static final void run$0(ARunnableS5S0001000_18 aRunnableS5S0001000_18) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyDoubleColumnFeedMobHelper@6.mobOutflowSlide$1");
        try {
            aRunnableS5S0001000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyDoubleColumnFeedMobHelper@6.mobOutflowSlide$1");
    }

    public static final void run$1(ARunnableS5S0001000_18 aRunnableS5S0001000_18) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyDoubleColumnFeedCacheManager@6e26.lruSizeMob$1");
        try {
            C1202100hO4 c1202100hO4 = new AbstractC1196150hET() { // from class: X.0hO4
                public static final String LIZIZ = "nearby_cache_list";

                @Override // X.AbstractC1196150hET
                public final String LIZIZ() {
                    return LIZIZ;
                }
            };
            int i = aRunnableS5S0001000_18.f285i0;
            c1202100hO4.getClass();
            c1202100hO4.LIZJ("nearby_cache_list", new AwS32S0001000_18(i, 16));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyDoubleColumnFeedCacheManager@6e26.lruSizeMob$1");
    }

    public ARunnableS5S0001000_18(int i, int i2) {
        this.$t = i2;
        this.f285i0 = i;
    }
}
