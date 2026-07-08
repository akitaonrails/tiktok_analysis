package Y;

import X.C0PQZ;
import X.C0Q7E;
import X.C0QGS;
import X.C1C7U;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS6S1000000_10 implements Runnable {
    public final int $t;
    public String s0;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS6S1000000_10 aRunnableS6S1000000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImageLoadManager@b294.applyV2OptimizationsNoIntercept$1");
        try {
            C0PQZ c0pqz = C0PQZ.LIZ;
            String str = aRunnableS6S1000000_10.s0;
            c0pqz.getClass();
            C0PQZ.LIZJ(str, null, "", -1, -1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImageLoadManager@b294.applyV2OptimizationsNoIntercept$1");
    }

    public static final void run$1(ARunnableS6S1000000_10 aRunnableS6S1000000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchTakoNewBotCardAssem@ddd1.trackPerformance$1$2");
        try {
            C0Q7E.LIZ(aRunnableS6S1000000_10.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTakoNewBotCardAssem@ddd1.trackPerformance$1$2");
    }

    public static final void run$2(ARunnableS6S1000000_10 aRunnableS6S1000000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchRecommendCacheHelper@ccb5.updateCache$1");
        try {
            C0QGS.LIZIZ().storeString("search_intermediate_recom_reponse", aRunnableS6S1000000_10.s0);
            C0QGS.LIZIZ().storeLong("search_intermediate_recom_reponse_time", System.currentTimeMillis());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchRecommendCacheHelper@ccb5.updateCache$1");
    }

    public static final void run$3(ARunnableS6S1000000_10 aRunnableS6S1000000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchTakoCardAssem@eb7e.trackPerformance$1$2");
        try {
            C0Q7E.LIZ(aRunnableS6S1000000_10.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTakoCardAssem@eb7e.trackPerformance$1$2");
    }

    public ARunnableS6S1000000_10(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
