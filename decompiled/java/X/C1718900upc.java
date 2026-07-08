package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718900upc {
    public static final C1718900upc LIZ = new C1718900upc();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final Stack<String> LIZJ = new Stack<>();

    public static void LIZ() {
        for (String str : LIZJ) {
            SparkContext.Companion.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
            if (interfaceC1059280dfiLIZ != null) {
                interfaceC1059280dfiLIZ.close();
            }
        }
        LIZJ.clear();
    }

    public static void LIZIZ() {
        Stack<String> stack = LIZJ;
        if (stack.isEmpty()) {
            return;
        }
        String strPeek = stack.peek();
        for (String str : stack) {
            if (!Intrinsics.LJFF(str, strPeek)) {
                SparkContext.Companion.getClass();
                InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
                if (interfaceC1059280dfiLIZ != null) {
                    interfaceC1059280dfiLIZ.close();
                }
            }
        }
        Stack<String> stack2 = LIZJ;
        stack2.clear();
        stack2.push(strPeek);
    }

    public static void LJ() {
        IPipoService iPipoService;
        List<Class<? extends InterfaceC1063710dmr>> listLIZJ;
        if (LIZIZ.compareAndSet(false, true) && (iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && iPipoService.LJFF(EnumC743970TGh.BNPL)) {
            IBNPLService iBNPLService = (IBNPLService) PluggableExtentionKt.pluggableSpi$default(IBNPLService.class, false, false, false, 14, null);
            Unit unit = null;
            if (iBNPLService != null && (listLIZJ = iBNPLService.LIZJ()) != null) {
                Iterator<Class<? extends InterfaceC1063710dmr>> it2 = listLIZJ.iterator();
                while (it2.hasNext()) {
                    C1543490qGh.LIZIZ(it2.next(), null, 6);
                }
            }
            try {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                C1718920upe c1718920upe = new C1718920upe();
                c1537900q7g.getClass();
                C1537900q7g.LJIIIIZZ(c1718920upe);
                IPipoContainerService iPipoContainerService = (IPipoContainerService) PluggableExtentionKt.pluggableSpi$default(IPipoContainerService.class, false, false, false, 14, null);
                if (iPipoContainerService != null) {
                    iPipoContainerService.init();
                    iPipoContainerService.LJIIIIZZ(C1718920upe.LIZJ);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJFF(Context context, String str, Map map, boolean z) {
        if (str.length() == 0) {
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        if (z) {
            sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0upd
                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJJJI() {
                    return new C1725480v0E(0, 0);
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJLI() {
                    return new C1725480v0E(0, 0);
                }
            });
        }
        sparkContext.LJJLIIIJILLIZJL(map);
        sparkContext.LJJLIIIJILLIZJL(C2097608Jq.LJIIJ(new Pair("tt_uid", C1716590ult.LIZ())));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public static String LIZJ(String str, String str2, String str3, String str4, String str5, Map map, boolean z, boolean z2) {
        String strLIZIZ;
        String str6;
        Uri uri = UriProtector.parse(str);
        if (!UriProtector.getQueryParameterNames(uri).contains("priority_region")) {
            str = uri.buildUpon().appendQueryParameter("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode()).build().toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview/?url=");
        sbLIZ.append(Uri.encode(str));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append("&hide_nav_bar=1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append("&title= ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (z2) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("&block_back_press=1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (str3.length() > 0) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("&business_from=");
            sbLIZ5.append(str3);
            sbLIZ5.append("&target_handler=");
            sbLIZ5.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append("&insert_loading_below_kitview=1");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ3);
        sbLIZ7.append("&spark_perf_bid=pipo_spark_biz");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(strLIZIZ4);
        sbLIZ8.append("&bdhm_bid=");
        sbLIZ8.append(str2);
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(strLIZIZ5);
        sbLIZ9.append("&keyboard_adjust=2");
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ9);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(strLIZIZ6);
        sbLIZ10.append("&keyboard_compat=1");
        String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ10);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(strLIZIZ7);
        sbLIZ11.append("&session_id=");
        C1716550ulp.LIZ.getClass();
        sbLIZ11.append(C1716550ulp.LJ(str4));
        String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ11);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(strLIZIZ8);
        sbLIZ12.append("&priority_region=");
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF("TTS_BNPL");
        if (c1717080umgLJFF == null || (str6 = c1717080umgLJFF.LJ) == null) {
            str6 = "";
        }
        sbLIZ12.append(str6);
        String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ12);
        if (str5 != null) {
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append(strLIZIZ9);
            sbLIZ13.append("&source_btm_token=");
            sbLIZ13.append(str5);
            strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ13);
        }
        Uri uriLIZJ = UriProtector.parse(strLIZIZ9);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                uriLIZJ = C1719940urI.LIZJ(uriLIZJ, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        return uriLIZJ.buildUpon().build().toString();
    }
}
