package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS36S0200100_4;

/* JADX INFO: renamed from: X.0DVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340370DVz {
    public static final C340370DVz LIZ = new C340370DVz();

    public static Map LIZ() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("current_region", C2222691Bz1.LIZ());
        pairArr[1] = new Pair("sim_region", C2222691Bz1.LJ());
        pairArr[2] = new Pair("sys_region", C2222691Bz1.LJFF());
        pairArr[3] = new Pair("region", C2222691Bz1.LIZIZ());
        C2280581EOi.Companion.getClass();
        String storeIdc = C0DW0.LLILLJJLI.LL.getStoreIdc();
        if (storeIdc == null) {
            storeIdc = "";
        }
        pairArr[4] = new Pair("store_idc", storeIdc);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LIZIZ(long j, String str, boolean z) {
        int i;
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Pair[] pairArr = new Pair[3];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair("is_success", Integer.valueOf(i));
        pairArr[1] = new Pair("duration", Long.valueOf(j));
        pairArr[2] = new Pair("rd_mix_page", 1);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1008603wy.LIZ(mapLJIIJ, new Pair("error_msg", str));
        LIZ.getClass();
        mapLJIIJ.putAll(LIZ());
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_force_show_shop_tab_end", mapLJIIJ);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C00IM c00im = new C00IM(z, str, j);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(c00im);
    }

    public static void LIZJ(C0CUZ c0cuz, EnumC314460CUi enumC314460CUi, long j) {
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("stage", c0cuz.getValue()), new Pair("step", enumC314460CUi.getValue()), new Pair("duration", Long.valueOf(j)));
        LIZ.getClass();
        mapLJIIJ.putAll(LIZ());
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_force_show_shop_tab_stage", mapLJIIJ);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS36S0200100_4 awS36S0200100_4 = new AwS36S0200100_4(c0cuz, enumC314460CUi, j, 3);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(awS36S0200100_4);
    }
}
