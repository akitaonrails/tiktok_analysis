package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725240uzq {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C1725240uzq LIZ = new C1725240uzq();
    public static final Map<String, InterfaceC1725210uzn> LIZLLL = new LinkedHashMap();
    public static final Map<String, Function2<SparkContext, String, Unit>> LJ = new LinkedHashMap();
    public static final Map<String, InterfaceC759720Tr8> LJFF = new LinkedHashMap();
    public static final Map<String, InterfaceC924803jS> LJI = new LinkedHashMap();

    public final void LIZJ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZIZ) {
                    C1725190uzl c1725190uzl = new C1725190uzl();
                    C1541950qED.LIZJ.getClass();
                    C1537900q7g.LJIIIIZZ(c1725190uzl);
                    C1537900q7g.LJIIIIZZ(new C1725190uzl() { // from class: X.0uzj
                        @Override // X.C1725190uzl, X.AbstractC1538690q8x
                        public final String LJI() {
                            return "pipo_hybrid_v2";
                        }

                        public static boolean LJIILL(SparkContext sparkContext) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            Uri uriLIZLLL = C759510Tqn.LIZLLL(sparkContext.LJIJI(), "check if use pipo container");
                            if (uriLIZLLL != null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "pipo_container_scene");
                            } else {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                            }
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || !C1948507kB.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                return false;
                            }
                            return ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJIILJJIL(uriLIZLLL.toString(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).LIZIZ;
                        }

                        @Override // X.C1725190uzl, X.AbstractC1538690q8x
                        public final void LJ(SparkContext sparkContext, String str) {
                            if (LJIILL(sparkContext)) {
                                super.LJ(sparkContext, str);
                            } else {
                                C1725190uzl.LJII(sparkContext);
                            }
                        }

                        @Override // X.C1725190uzl, X.AbstractC1538690q8x
                        public final void LJFF(SparkContext sparkContext, String str) {
                            if (LJIILL(sparkContext)) {
                                super.LJFF(sparkContext, str);
                            } else {
                                C1725190uzl.LJII(sparkContext);
                            }
                        }
                    });
                    LIZIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        LIZJ();
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LIZ = "pipo_container_preload";
        c1097680efe.LJIJ = Integer.MAX_VALUE;
        c1097680efe.LJIJI = -1;
        c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(18);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }

    public static String LIZ(Boolean bool, String str, String str2, String str3, boolean z) {
        boolean z2;
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().scheme("pipo_hybrid").authority("webview").appendQueryParameter("bid", "pipo_hybrid").appendQueryParameter("target_handler", "pipo_hybrid").appendQueryParameter("pipo_hybrid_biz", str2).appendQueryParameter("pipo_global_props_space", str2).appendQueryParameter("use_forest", "1").appendQueryParameter("proxy_enabled_runtime_type", "1");
            if (z) {
                builderAppendQueryParameter.appendQueryParameter("spark_perf_bid", "pipo_container_preload");
            }
            if (str3 != null) {
                if (str3.length() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    str3 = null;
                }
                if (str3 != null) {
                    builderAppendQueryParameter.appendQueryParameter("pipo_nav_bar_image", str3);
                }
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                builderAppendQueryParameter.appendQueryParameter("auto_play_bgm", "1");
            }
            return builderAppendQueryParameter.build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to open pipo container, msg: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", scheme: ");
            sbLIZ.append(str);
            sbLIZ.append(", biz: ");
            sbLIZ.append(str2);
            C1725270uzt.LJFF("204", C2188811AlT.LIZIZ(sbLIZ), null, null);
            return null;
        }
    }
}
