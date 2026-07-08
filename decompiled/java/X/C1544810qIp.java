package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.security.web_js.setting.InlineInjectOptSettings;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544810qIp {
    public static final JSInjectConfig LIZ = new JSInjectConfig(null, null, 0, null, null, null, null, null, null, false, 1023, null);
    public static volatile ConcurrentHashMap<String, JSInjectConfig> LIZIZ = new ConcurrentHashMap<>();
    public static InlineInjectOptSettings LIZJ = new InlineInjectOptSettings(false, false, InlineInjectOptSettings.LIZ);

    public static JSInjectGlobalConfig LIZ() {
        JSInjectGlobalConfig jSInjectGlobalConfigLIZ;
        InterfaceC1544790qIn interfaceC1544790qIn = C1544770qIl.LIZIZ;
        return (interfaceC1544790qIn == null || (jSInjectGlobalConfigLIZ = interfaceC1544790qIn.LIZ()) == null) ? new JSInjectGlobalConfig(null, null, C13LQ.LJLIIL(new String[]{"_jsmanage_tt_js_auth", "_jsmanage_ad_autofill_secondversion"}), Collections.singleton("_jsmanage_tt_oldwebview_reactid"), null, false, 51, null) : jSInjectGlobalConfigLIZ;
    }

    public static boolean LIZLLL(Uri uri, JSInjectGlobalConfig jSInjectGlobalConfig) {
        String strLIZ = C20509081r.LIZ(uri);
        if (strLIZ == null) {
            return true;
        }
        if (jSInjectGlobalConfig.LIZ(strLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Manual] Disable by global block. Uri: ");
            sbLIZ.append(uri);
            C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Uri uri, JSInjectConfig jSInjectConfig, C1544870qIv c1544870qIv) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = C20509081r.LIZ(uri);
        if (strLIZ == null) {
            return false;
        }
        Iterator<String> it2 = jSInjectConfig.blockList.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (u.LJJIIJZLJL(strLIZ, it2.next(), false)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Manual] Block by JS Config. JSName: ");
            sbLIZ.append(jSInjectConfig.name);
            sbLIZ.append(", Uri: ");
            sbLIZ.append(uri);
            C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        Iterator<String> it3 = jSInjectConfig.allowList.iterator();
        while (it3.hasNext()) {
            if (a0.LJJIIZI(strLIZ, it3.next(), false)) {
                C1544820qIq c1544820qIq = c1544870qIv.LJ;
                if (c1544820qIq != null) {
                    c1544820qIq.LIZLLL = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                }
                return true;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Manual] Not allow by config. JSName: ");
        sbLIZ2.append(jSInjectConfig.name);
        sbLIZ2.append(", Uri: ");
        sbLIZ2.append(uri);
        C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public static JSInjectConfig LIZIZ(String str, AbstractC1544900qIy abstractC1544900qIy, C1544870qIv c1544870qIv, boolean z, boolean z2) {
        Object c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC1544560qIQ interfaceC1544560qIQ = C1544770qIl.LIZJ;
            if (interfaceC1544560qIQ != null) {
                c098200Yq = (JSInjectConfig) interfaceC1544560qIQ.LIZ(str, JSInjectConfig.class, LIZ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSInjectConfig jSInjectConfigLIZ = (JSInjectConfig) c098200Yq;
        if (jSInjectConfigLIZ != null && !Intrinsics.LJFF(jSInjectConfigLIZ, LIZ)) {
            C1544820qIq c1544820qIq = c1544870qIv.LJ;
            if (c1544820qIq != null) {
                c1544820qIq.LIZIZ = 1;
            }
        } else {
            if (abstractC1544900qIy != null) {
                jSInjectConfigLIZ = abstractC1544900qIy.LIZ();
            } else {
                jSInjectConfigLIZ = null;
            }
            if (jSInjectConfigLIZ == null) {
                C1544820qIq c1544820qIq2 = c1544870qIv.LJ;
                if (c1544820qIq2 != null) {
                    c1544820qIq2.LIZ = 0;
                }
                C1544820qIq c1544820qIq3 = c1544870qIv.LJ;
                if (c1544820qIq3 != null) {
                    c1544820qIq3.LIZJ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                }
                return null;
            }
            C1544820qIq c1544820qIq4 = c1544870qIv.LJ;
            if (c1544820qIq4 != null) {
                c1544820qIq4.LIZIZ = 0;
            }
        }
        if ((Intrinsics.LJFF(jSInjectConfigLIZ.injectTime, EnumC1544890qIx.VERY_BEGINNING.getValue()) || (!z && Intrinsics.LJFF(jSInjectConfigLIZ.injectTime, EnumC1544890qIx.MANUAL.getValue()))) && z2) {
            LIZIZ.put(jSInjectConfigLIZ.geckoUrl, jSInjectConfigLIZ);
        }
        C1544820qIq c1544820qIq5 = c1544870qIv.LJ;
        if (c1544820qIq5 != null) {
            c1544820qIq5.LIZ = 1;
        }
        C1544820qIq c1544820qIq6 = c1544870qIv.LJ;
        if (c1544820qIq6 != null) {
            c1544820qIq6.LIZJ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSInjectConfigLIZ;
    }
}
