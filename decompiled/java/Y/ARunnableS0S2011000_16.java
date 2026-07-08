package Y;

import X.C1020810cff;
import X.C1C7U;
import X.C2292508yZ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS0S2011000_16 implements Runnable {
    public final int $t;
    public int i3;
    public String s0;
    public String s1;
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

    public final void LIZ$0() {
        String str;
        if (this.z2) {
            Map<String, Integer> map = C1020810cff.LIZJ;
            Integer num = (Integer) ((LinkedHashMap) map).get(this.s0);
            int iIntValue = num != null ? num.intValue() : 0;
            int i = this.i3;
            if (iIntValue < i) {
                map.put(this.s0, Integer.valueOf(i));
                C1020810cff.LIZ.getClass();
                C1020810cff.LIZIZ().storeString("profile_my_aweme_slide_back_info_statistics", GsonProtectorUtils.toJson(C2292508yZ.LIZIZ(), map));
                return;
            }
        }
        if (this.z2 || (str = this.s1) == null || str.length() == 0) {
            return;
        }
        Map<String, Map<String, Integer>> map2 = C1020810cff.LJ;
        Map map3 = (Map) ((LinkedHashMap) map2).get(this.s1);
        if (map3 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            map2.put(this.s1, linkedHashMap);
            linkedHashMap.put(this.s0, Integer.valueOf(this.i3));
        } else {
            Integer num2 = (Integer) map3.get(this.s0);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            int i2 = this.i3;
            if (iIntValue2 < i2) {
                map3.put(this.s0, Integer.valueOf(i2));
            }
        }
    }

    public final void LIZ$1() {
        String str;
        if (this.z2) {
            Map<String, Integer> map = C1020810cff.LIZIZ;
            Integer num = (Integer) ((LinkedHashMap) map).get(this.s0);
            int iIntValue = num != null ? num.intValue() : 0;
            int i = this.i3;
            if (iIntValue < i) {
                map.put(this.s0, Integer.valueOf(i));
                C1020810cff.LIZ.getClass();
                C1020810cff.LIZIZ().storeString("profile_my_aweme_info_statistics", GsonProtectorUtils.toJson(C2292508yZ.LIZIZ(), map));
                return;
            }
        }
        if (this.z2 || (str = this.s1) == null || str.length() == 0) {
            return;
        }
        Map<String, Map<String, Integer>> map2 = C1020810cff.LIZLLL;
        Map map3 = (Map) ((LinkedHashMap) map2).get(this.s1);
        if (map3 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            map2.put(this.s1, linkedHashMap);
            linkedHashMap.put(this.s0, Integer.valueOf(this.i3));
        } else {
            Integer num2 = (Integer) map3.get(this.s0);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            int i2 = this.i3;
            if (iIntValue2 < i2) {
                map3.put(this.s0, Integer.valueOf(i2));
            }
        }
    }

    public static final void run$0(ARunnableS0S2011000_16 aRunnableS0S2011000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileAwemeInfoStatistics@1930.storeAwemeBackSlidesInfo$1");
        try {
            aRunnableS0S2011000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileAwemeInfoStatistics@1930.storeAwemeBackSlidesInfo$1");
    }

    public static final void run$1(ARunnableS0S2011000_16 aRunnableS0S2011000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileAwemeInfoStatistics@1930.storeAwemeInfo$1");
        try {
            aRunnableS0S2011000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileAwemeInfoStatistics@1930.storeAwemeInfo$1");
    }

    public ARunnableS0S2011000_16(boolean z, String str, int i, String str2, int i2) {
        this.$t = i2;
        this.z2 = z;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
    }
}
