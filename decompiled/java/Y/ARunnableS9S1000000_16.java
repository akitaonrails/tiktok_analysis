package Y;

import X.C01GW;
import X.C1020810cff;
import X.C1024760cm2;
import X.C1037010d5n;
import X.C1049030dPB;
import X.C1066190dqr;
import X.C123100dR;
import X.C1250680ieQ;
import X.C1519760peQ;
import X.C1533940q1I;
import X.C1534510q2D;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1720106oR;
import X.C19719512Dh;
import X.C19719612Di;
import X.C1C7U;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1049130dPL;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS9S1000000_16 implements Runnable {
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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        List<C1024760cm2> list = C1037010d5n.LJI;
        String str = this.s0;
        for (C1024760cm2 c1024760cm2 : list) {
            if (Intrinsics.LJFF(c1024760cm2.LIZ, str)) {
                if (c1024760cm2 == null) {
                    return;
                }
                List<C1024760cm2> list2 = C1037010d5n.LJI;
                int iIndexOf = ((ArrayList) list2).indexOf(c1024760cm2);
                if (iIndexOf == -1) {
                    return;
                }
                ((ArrayList) list2).size();
                if (iIndexOf < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    C19719612Di.LJJIIZI(C1037010d5n.LJI);
                    if (i == iIndexOf) {
                        return;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void LIZ$2() {
        int iIntValue;
        Map map = (Map) ((LinkedHashMap) C1020810cff.LIZLLL).get(this.s0);
        Map map2 = (Map) ((LinkedHashMap) C1020810cff.LJ).get(this.s0);
        int iIntValue2 = 0;
        if ((map == null || map.isEmpty()) && (map2 == null || map2.isEmpty())) {
            return;
        }
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (map != null) {
                iIntValue = 0;
                for (Map.Entry entry : map.entrySet()) {
                    c2344009Gk.LIZJ(((Number) entry.getValue()).intValue(), (String) entry.getKey());
                    iIntValue += ((Number) entry.getValue()).intValue();
                }
            } else {
                iIntValue = 0;
            }
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) entry2.getKey());
                    sbLIZ.append("_back_slide");
                    c2344009Gk.LIZJ(((Number) entry2.getValue()).intValue(), C2188811AlT.LIZIZ(sbLIZ));
                    iIntValue2 += ((Number) entry2.getValue()).intValue();
                }
            }
            c2344009Gk.LIZJ(iIntValue, "other_load_all_size");
            c2344009Gk.LIZJ(iIntValue2, "other_slide_back_all_size");
            c2344009Gk.LJ(Boolean.FALSE, "is_my_profile");
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            Map<String, String> map3 = c2344009Gk.LIZ;
            c1250680ieQ.getClass();
            C20684815ws.LJIILLIIL("profile_aweme_statistic_info", map3);
            C19719512Dh.LIZJ(C1020810cff.LIZLLL).remove(this.s0);
            C19719512Dh.LIZJ(C1020810cff.LJ).remove(this.s0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("Profile_ProfileAwemeInfoStatistics", "reportOtherProfile exception: " + e.getMessage() + ", cause: " + e.getCause());
        }
    }

    public final void LIZ$0() {
        C1551950qUL c1551950qULLJIIIZ;
        try {
            String strLIZ = C1553670qX7.LIZ();
            if (C123100dR.LIZ(C1552050qUV.LJ(strLIZ, this.s0)) || (c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(strLIZ)) == null) {
                return;
            }
            c1551950qULLJIIIZ.LIZIZ(null, null, C2097908Jt.LIZJ(new Pair(strLIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(this.s0)))), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public ARunnableS9S1000000_16(int i) {
        this.$t = i;
        this.s0 = "tiktok_web_creation_promote";
    }

    public static final void run$0(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("H5LoadUtil@1cbd.prefetchGecko$1");
        try {
            aRunnableS9S1000000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("H5LoadUtil@1cbd.prefetchGecko$1");
    }

    public static final void run$1(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("HeaderLowImgRep@b961.delayGcTask$runnable$1");
        try {
            C01GW c01gw = C1066190dqr.LIZ;
            C1066190dqr.LJI(aRunnableS9S1000000_16.s0, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HeaderLowImgRep@b961.delayGcTask$runnable$1");
    }

    public static final void run$2(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("HttpResponseCache@c328.expiredTime$1");
        try {
            C1534510q2D c1534510q2D = C1533940q1I.LIZJ().LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aRunnableS9S1000000_16.s0);
            sbLIZ.append("-false-false");
            c1534510q2D.remove(C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HttpResponseCache@c328.expiredTime$1");
    }

    public static final void run$3(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("LandPagePreWarmHandler@d096.removeAdAweme$1");
        try {
            aRunnableS9S1000000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandPagePreWarmHandler@d096.removeAdAweme$1");
    }

    public static final void run$4(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileAwemeInfoStatistics@1930.reportOtherProfile$1");
        try {
            aRunnableS9S1000000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileAwemeInfoStatistics@1930.reportOtherProfile$1");
    }

    public static final void run$5(ARunnableS9S1000000_16 aRunnableS9S1000000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdExtensionShownAdRecords@f4a3.onRealtimeClick$1");
        try {
            C1519760peQ<InterfaceC1049130dPL> c1519760peQ = C1049030dPB.LIZLLL;
            String str = aRunnableS9S1000000_16.s0;
            Iterator<InterfaceC1049130dPL> it2 = c1519760peQ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdExtensionShownAdRecords@f4a3.onRealtimeClick$1");
    }

    public ARunnableS9S1000000_16(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
