package Y;

import X.C1001830cB3;
import X.C1042640dEs;
import X.C1042680dEw;
import X.C1042730dF1;
import X.C1490740otc;
import X.C1C7U;
import X.C2188811AlT;
import X.C989070bqT;
import X.EnumC992050bvH;
import X.InterfaceC1041500dD2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS8S2100000_16 implements Runnable {
    public final int $t;
    public Object l2;
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

    public final void LIZ$0() {
        String realCreativeIdStr;
        InterfaceC1041500dD2 interfaceC1041500dD2 = (InterfaceC1041500dD2) this.l2;
        if (interfaceC1041500dD2 == null || (realCreativeIdStr = interfaceC1041500dD2.getRealCreativeIdStr()) == null) {
            realCreativeIdStr = "";
        }
        Map<String, Pair<Set<String>, Set<String>>> map = C1042640dEs.LLILLJJLI;
        Pair pair = (Pair) ((LinkedHashMap) map).get(realCreativeIdStr);
        if (pair != null) {
            String str = this.s0;
            InterfaceC1041500dD2 interfaceC1041500dD22 = (InterfaceC1041500dD2) this.l2;
            String str2 = this.s1;
            int size = ((Set) pair.getFirst()).size();
            int size2 = ((Set) pair.getSecond()).size();
            double d = size == 0 ? 0.0d : ((double) size2) / ((double) size);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("submit=");
            sbLIZ.append(size);
            sbLIZ.append(", hit=");
            sbLIZ.append(size2);
            sbLIZ.append(", schema:");
            sbLIZ.append(str);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageTTWebModule_", 2);
            C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
            C1042680dEw.LIZ.getClass();
            c1001830cB3.log(C1042680dEw.LJFF, new C1042730dF1(str, interfaceC1041500dD22, str2, size, size2, d));
            map.remove(realCreativeIdStr);
        }
    }

    public final void LIZ$1() {
        String str = this.s0;
        if (str == null || str.length() == 0) {
            return;
        }
        if (Intrinsics.LJFF(C989070bqT.LIZIZ, this.s0) && ((EnumC992050bvH) this.l2) == EnumC992050bvH.PREFETCH_DONE) {
            C989070bqT.LIZJ(this.s0, EnumC992050bvH.PREFETCH_DONE_AFTER_ENTER, this.s1);
        } else {
            C989070bqT.LIZJ(this.s0, (EnumC992050bvH) this.l2, this.s1);
        }
    }

    public static final void run$0(ARunnableS8S2100000_16 aRunnableS8S2100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageTTWebModule@fad7.onExitWebPage$1");
        try {
            aRunnableS8S2100000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageTTWebModule@fad7.onExitWebPage$1");
    }

    public static final void run$1(ARunnableS8S2100000_16 aRunnableS8S2100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PrefetchHTMLStatusRecorder@4c5c.record$1");
        try {
            aRunnableS8S2100000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchHTMLStatusRecorder@4c5c.record$1");
    }

    public ARunnableS8S2100000_16(String str, Object obj, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.s1 = str2;
    }
}
