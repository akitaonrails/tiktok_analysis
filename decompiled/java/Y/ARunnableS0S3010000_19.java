package Y;

import X.C1245340iVo;
import X.C1C7U;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS0S3010000_19 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S3010000_19 aRunnableS0S3010000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateComponentFullShowList$1");
        try {
            if (!aRunnableS0S3010000_19.z3) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                String str = aRunnableS0S3010000_19.s0;
                String str2 = aRunnableS0S3010000_19.s1;
                String str3 = aRunnableS0S3010000_19.s2;
                c1245340iVo.getClass();
                C1245340iVo.LJIIIZ(str, str2, str3, C1245340iVo.LJIIJ);
            } else {
                C1245340iVo c1245340iVo2 = C1245340iVo.LIZ;
                String str4 = aRunnableS0S3010000_19.s0;
                String str5 = aRunnableS0S3010000_19.s1;
                c1245340iVo2.getClass();
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1245340iVo.LJIILIIL;
                List<String> arrayList = concurrentHashMap.get(str4);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    concurrentHashMap.put(str4, arrayList);
                }
                arrayList.add(str5);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateComponentFullShowList$1");
    }

    public static final void run$1(ARunnableS0S3010000_19 aRunnableS0S3010000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateComponentShowList$1");
        try {
            if (!aRunnableS0S3010000_19.z3) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                String str = aRunnableS0S3010000_19.s0;
                String str2 = aRunnableS0S3010000_19.s1;
                String str3 = aRunnableS0S3010000_19.s2;
                c1245340iVo.getClass();
                C1245340iVo.LJIIIZ(str, str2, str3, C1245340iVo.LJIIJJI);
            } else {
                C1245340iVo c1245340iVo2 = C1245340iVo.LIZ;
                String str4 = aRunnableS0S3010000_19.s0;
                String str5 = aRunnableS0S3010000_19.s1;
                c1245340iVo2.getClass();
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1245340iVo.LJIILJJIL;
                List<String> arrayList = concurrentHashMap.get(str4);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    concurrentHashMap.put(str4, arrayList);
                }
                arrayList.add(str5);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateComponentShowList$1");
    }

    public ARunnableS0S3010000_19(boolean z, String str, String str2, String str3, int i) {
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
