package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520080pew {
    public static Function2<? super String, ? super Map<String, ? extends Object>, Unit> LIZ;
    public static final CopyOnWriteArraySet<InterfaceC1520110pez> LIZIZ = new CopyOnWriteArraySet<>();

    public static String LIZIZ(String str) {
        if (u.LJJIIJZLJL(str, "http", false)) {
            return str;
        }
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                return str;
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return str;
        }
    }

    public static void LJI(AFwS287S0000000_4 aFwS287S0000000_4) {
        LIZ = aFwS287S0000000_4;
    }

    public static void LIZ(final String str, final C1520350pfN c1520350pfN) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0pey
            public final void LIZ() {
                InterfaceC1541990qEH interfaceC1541990qEHLJFF;
                String str2 = str;
                InterfaceC1520110pez interfaceC1520110pez = null;
                if (str2 != null) {
                    C1529870puj.LIZ.getClass();
                    interfaceC1541990qEHLJFF = C1529870puj.LJFF(str2);
                } else {
                    interfaceC1541990qEHLJFF = null;
                }
                Iterator<InterfaceC1520110pez> it2 = C1520080pew.LIZIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1520110pez next = it2.next();
                    if (next.LIZ(interfaceC1541990qEHLJFF)) {
                        interfaceC1520110pez = next;
                        break;
                    }
                }
                InterfaceC1520110pez interfaceC1520110pez2 = interfaceC1520110pez;
                if (interfaceC1520110pez2 != null) {
                    interfaceC1520110pez2.LIZIZ(interfaceC1541990qEHLJFF, c1520350pfN);
                    return;
                }
                C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                C1520350pfN c1520350pfN2 = c1520350pfN;
                c1520380pfQ.getClass();
                C1520380pfQ.LIZ(c1520350pfN2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MonitorUtils@f119.customReport$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MonitorUtils@f119.customReport$1");
            }
        });
    }

    public static void LIZLLL(final String str, final Map map) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0NBw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MonitorUtils@f119.reportAppLog$1");
                try {
                    Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = C1520080pew.LIZ;
                    if (function2 != null) {
                        function2.invoke(str, map);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MonitorUtils@f119.reportAppLog$1");
            }
        });
    }

    public static void LJ(final View view, final String str, final C1520180pf6 c1520180pf6) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0peu
            public final void LIZ() {
                C1491800ovK c1491800ovKLIZ;
                C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                View view2 = view;
                String str2 = str;
                C1520180pf6 c1520180pf62 = c1520180pf6;
                c1520200pf8.getClass();
                if (view2 != null) {
                    AbstractC1514820pWS abstractC1514820pWSLIZLLL = C1514790pWP.LIZLLL(view2);
                    if ((abstractC1514820pWSLIZLLL == null && (abstractC1514820pWSLIZLLL = C1514790pWP.LIZJ(str2)) == null) || (c1491800ovKLIZ = abstractC1514820pWSLIZLLL.LIZ()) == null) {
                        EnumC1521110pgb.Companion.getClass();
                        C1520200pf8.LIZIZ(view2, str2, C1491790ovJ.LIZ(str2), c1520180pf62);
                    } else {
                        C1520200pf8.LIZIZ(view2, str2, c1491800ovKLIZ, c1520180pf62);
                    }
                }
                C1514690pWF.LIZIZ(str2, "containerError", c1520180pf62.LIZ().LIZIZ());
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MonitorUtils@f119.reportContainerError$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MonitorUtils@f119.reportContainerError$1");
            }
        });
    }

    public static void LIZJ(final String str, final String str2, final String str3, final JSONObject jSONObject) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0Wen
            public final void LIZ() {
                String str4 = str2;
                if (str4 == null) {
                    str4 = "";
                }
                C1520360pfO c1520360pfO = new C1520360pfO(str);
                c1520360pfO.LIZIZ = "tiktok_hybrid_default";
                c1520360pfO.LIZ = str3;
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LIZIZ(0);
                C1520080pew.LIZ(str4, c1520360pfO.LIZ());
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MonitorUtils@f119.innerReportCustom$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MonitorUtils@f119.innerReportCustom$1");
            }
        });
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str7;
        String str10 = str5;
        String str11 = str4;
        String str12 = str6;
        String str13 = str;
        String str14 = "";
        if ((i & 1) != 0) {
            str13 = "";
        }
        if ((i & 8) != 0) {
            str11 = "";
        }
        if ((i & 16) != 0) {
            str10 = "";
        }
        if ((i & 32) != 0) {
            str12 = "";
        }
        if ((i & 64) != 0) {
            str9 = "";
        }
        if ((i & 128) == 0) {
            str14 = str8;
        }
        C1514680pWE.LIZ(str13, str2, str3, str11, str10, str12, str9, str14);
    }
}
