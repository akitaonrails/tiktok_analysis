package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;

/* JADX INFO: renamed from: X.0pvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530580pvs {
    public boolean LIZ;

    public static void LIZ(C1530580pvs c1530580pvs, Context context, String str, C1537480q70 c1537480q70) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1530600pvu c1530600pvu;
        if (!c1530580pvs.LIZ && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getEnablePrefetch() == 1) {
            if (c1537480q70.useLynxPrefetchVersion <= 0 || ((c1530600pvu = C1535630q41.LJ) != null && c1530600pvu.LIZJ)) {
                C1530570pvr.LIZIZ(c1537480q70, "spark_lynx_prefetch_runtime_init_start");
                C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
                InterfaceC1529460pu4 interfaceC1529460pu4 = (InterfaceC1529460pu4) C1075530e5v.LIZIZ().LIZIZ(InterfaceC1529460pu4.class, c1537480q70.bidFrom);
                if (interfaceC1529460pu4 != null) {
                    c1530580pvs.LIZ = true;
                    c1537480q70.useLynxPrefetchVersion = 1;
                    C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.OPT_LYNX_PREFETCH_V1_STATUS, 1);
                    c1537480q70.LJIIIZ().LIZJ("spark_lynx_prefetch_version", "1");
                    interfaceC1529460pu4.LIZ(context, str, c1537480q70);
                    C1520080pew.LJFF(c1537480q70.containerId, "lynx_prefetch", "prefetch", null, str, c1537480q70.bid, null, null, 200);
                    return;
                }
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IPrefetchService is null, bidFrom = ");
                sbLIZ.append(c1537480q70.bidFrom);
                C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
            }
        }
    }
}
