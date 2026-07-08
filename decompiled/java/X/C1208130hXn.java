package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.i18n.location.control.SystemPermissionPromoter$lifecycleWatcher$2$1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208130hXn extends C1207210hWJ {
    public static C1208260hY0 LJFF;
    public static C1208470hYL LJI;
    public static C1208170hXr LJII;
    public static String LJIIJJI;
    public static final C1208130hXn LIZJ = new C1208130hXn();
    public static C1208190hXt LIZLLL = C1208190hXt.LJIIJ;
    public static Map<String, ? extends List<String>> LJ = C2097608Jq.LJ();
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static int LJIIJ = -4;
    public static Map<String, C1207710hX7> LJIIL = C2097608Jq.LJ();

    public static Pair LJJIL() {
        switch (LIZLLL.LJII) {
            case -10004:
                return new Pair(-10004, "not_initialized_config_query_failed");
            case -10003:
                return new Pair(-10003, "not_initialized_config_not_found");
            case -10002:
                return new Pair(-10002, "not_initialized_yu");
            case -10001:
                return new Pair(-10001, "not_initialized_nl");
            default:
                return new Pair(-10000, "not_initialized");
        }
    }

    public static C1208210hXv LJJJI() {
        C1208260hY0 c1208260hY0 = LJFF;
        if (c1208260hY0 != null) {
            return c1208260hY0.LIZIZ;
        }
        return null;
    }

    public static C1208420hYG LJJJIL() {
        C1208260hY0 c1208260hY0 = LJFF;
        if (c1208260hY0 != null) {
            return c1208260hY0.LIZLLL;
        }
        return null;
    }

    public static InterfaceC1235640iGA LJJJJ() {
        C1208260hY0 c1208260hY0 = LJFF;
        if (c1208260hY0 != null) {
            return c1208260hY0.LIZ;
        }
        return null;
    }

    @Override // X.C1207210hWJ
    public final List<String> LIZIZ() {
        return !LJJIJL("allowedPermissions") ? C13BV.INSTANCE : LIZ() == 2 ? C1697810uHb.LJIIJJI("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION") : LIZ() == 1 ? Collections.singletonList("android.permission.ACCESS_COARSE_LOCATION") : C13BV.INSTANCE;
    }

    @Override // X.C1207210hWJ
    public final List LIZLLL() {
        Map<String, ? extends List<String>> map = LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains("fyp")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C13LP.LLIIII(linkedHashMap.keySet());
    }

    @Override // X.C1207210hWJ
    public final int LJ() {
        if (LJJJJIZL(LIZLLL)) {
            return -10000;
        }
        return LIZLLL.LJII;
    }

    @Override // X.C1207210hWJ
    public final String LJFF() {
        if (LJJJJIZL(LIZLLL)) {
            return "not_initialized";
        }
        C1208190hXt c1208190hXt = LIZLLL;
        String str = c1208190hXt.LJIIIIZZ;
        return str == null ? C1208580hYW.LIZIZ(c1208190hXt.LJII) : str;
    }

    @Override // X.C1207210hWJ
    public final List LJIIIIZZ() {
        return LJ.get("poi");
    }

    @Override // X.C1207210hWJ
    public final boolean LJIIJ() {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLocationFetchAllowed: ");
        sbLIZ.append(LIZLLL.LJI);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        return LIZLLL.LIZ != null;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIILLIIL() {
        return LJ.isEmpty();
    }

    @Override // X.C1207210hWJ
    public final boolean LJIIZILJ() {
        C1208210hXv c1208210hXvLJJJI;
        C1798620wuC.LIZLLL("LocationController", "needConsent: ");
        if (!LJJIJL("needConsent") || (c1208210hXvLJJJI = LJJJI()) == null) {
            return false;
        }
        if (!c1208210hXvLJJJI.LIZJ) {
            C1798620wuC.LIZLLL("LocationController", "needConsent: consent not enabled, false");
            return false;
        }
        C1208210hXv c1208210hXvLJJJI2 = LJJJI();
        if (c1208210hXvLJJJI2 != null && LJJIZ(c1208210hXvLJJJI2.LIZIZ) == 2) {
            return LJIJ();
        }
        C1798620wuC.LIZLLL("LocationController", "needPrivacySettings: system permission level not fine, false");
        return false;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIJ() {
        C1798620wuC.LIZLLL("LocationController", "needPrivacySettings: ");
        if (LIZLLL.LIZ == null) {
            return false;
        }
        int i = LJJJJJ() ? 1 : 2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needPrivacySettings: accuracy=");
        sbLIZ.append(i);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        return LJJJJJ();
    }

    public static boolean LJJJJJ() {
        Function0<String> function0;
        String strInvoke;
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI == null || (function0 = c1208210hXvLJJJI.LJIIJ) == null || (strInvoke = function0.invoke()) == null) {
            return false;
        }
        return c1208210hXvLJJJI.LJIIL.contains(strInvoke.toUpperCase(Locale.ROOT));
    }

    @Override // X.C1207210hWJ
    public final int LIZ() {
        Function0<String> function0;
        String strInvoke;
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI == null) {
            return 0;
        }
        C0V0R c0v0r = LIZLLL.LIZ;
        int i = c0v0r != null ? c0v0r.LJI : 0;
        if (c1208210hXvLJJJI.LIZLLL <= 0) {
            C1208210hXv c1208210hXvLJJJI2 = LJJJI();
            return (c1208210hXvLJJJI2 == null || (function0 = c1208210hXvLJJJI2.LJIIJ) == null || (strInvoke = function0.invoke()) == null || !c1208210hXvLJJJI2.LJIIJJI.contains(strInvoke.toUpperCase(Locale.ROOT))) ? 1 : 2;
        }
        if (LJJJJJ()) {
            return 1;
        }
        return Math.min(c1208210hXvLJJJI.LIZLLL, i);
    }

    @Override // X.C1207210hWJ
    public final int LJI() {
        InterfaceC1798670wuH interfaceC1798670wuH;
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI == null || (interfaceC1798670wuH = c1208210hXvLJJJI.LJII) == null) {
            return 0;
        }
        return interfaceC1798670wuH.get();
    }

    @Override // X.C1207210hWJ
    public final boolean LJIILJJIL() {
        return LIZ() == 2;
    }

    @Override // X.C1207210hWJ
    public final C1208190hXt LJII() {
        return LIZLLL;
    }

    public static void LJJIIJ(boolean z) {
        LJIIIZ.set(false);
        if (z) {
            LIZLLL = C1208190hXt.LJIIJ;
        }
        LJ = C2097608Jq.LJ();
        LJI = null;
        LJII = null;
        LJIIJ = -4;
        LJIIJJI = null;
        LJIIL = C2097608Jq.LJ();
    }

    public static boolean LJJIJL(String str) {
        if (!LJIIIZ.get()) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": controller not initialized");
            C1798620wuC.LJ("LocationController", C2188811AlT.LIZIZ(sbLIZ), null);
            return false;
        }
        return true;
    }

    public static String LJJIJLIJ(EnumC1207930hXT enumC1207930hXT) {
        int i = C1208220hXw.LIZIZ[enumC1207930hXT.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                return "cancel";
            }
            return "deny";
        }
        return "allow";
    }

    public static int LJJIZ(Context context) {
        if (C1194170hBH.LIZJ(context)) {
            if (C1194170hBH.LIZIZ(context)) {
                return 2;
            }
            if (C1194170hBH.LIZ(context)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public static int LJJJ(EnumC2192761Arq enumC2192761Arq) {
        if (C1208220hXw.LIZ[enumC2192761Arq.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    public static void LJJJJI(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77ltPZlVsAuvdlro9FWXU32fnk2XXGUd9q7nwqyw==", null));
    }

    public static boolean LJJJJIZL(C1208190hXt c1208190hXt) {
        if (c1208190hXt.LIZ == null && c1208190hXt.LJII == C1208190hXt.LJIIJ.LJII && c1208190hXt.LJI == null && c1208190hXt.LJFF == null && c1208190hXt.LIZIZ.isEmpty() && c1208190hXt.LIZJ.isEmpty() && c1208190hXt.LIZLLL.isEmpty() && c1208190hXt.LJ.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJL(Cert cert) {
        if (LIZLLL.LIZIZ.get(cert.certToken()) != null) {
            return true;
        }
        C185100nR c185100nR = C185100nR.LIZ;
        C185100nR.LIZLLL(cert.certToken(), "popup", "missing");
        return false;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIIJJI(String str) {
        C1208470hYL c1208470hYL;
        if (!LJJIJL("isPermissionConsented") || (c1208470hYL = LJI) == null || c1208470hYL.LIZ(str) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIIL(Cert cert) {
        C1208420hYG c1208420hYGLJJJIL = LJJJIL();
        if ((c1208420hYGLJJJIL != null && c1208420hYGLJJJIL.LIZIZ(cert) == 0) || LJIILL(cert)) {
            return true;
        }
        return false;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIILIIL(Cert cert) {
        if (LIZLLL.LIZIZ.get(cert.certToken()) != null) {
            return true;
        }
        return false;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIILL(Cert cert) {
        C1208420hYG c1208420hYGLJJJIL = LJJJIL();
        if (c1208420hYGLJJJIL == null) {
            return false;
        }
        if (c1208420hYGLJJJIL.LIZJ(cert) != 0 && c1208420hYGLJJJIL.LIZ(cert) != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIJI(Context context) {
        InterfaceC1798670wuH interfaceC1798670wuH;
        if (!LJIIJ() || LIZ() < 2 || !C1194170hBH.LIZ(context)) {
            return false;
        }
        if (!C1194170hBH.LIZIZ(context)) {
            return true;
        }
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI == null || (interfaceC1798670wuH = c1208210hXvLJJJI.LJII) == null || interfaceC1798670wuH.get() == 1) {
            return false;
        }
        return true;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIJJ(Context context) {
        C1208210hXv c1208210hXvLJJJI;
        InterfaceC1798670wuH interfaceC1798670wuH;
        if (!LJIIJ() || LIZ() < 2 || !C1194170hBH.LIZ(context) || !C1194170hBH.LIZIZ(context) || (c1208210hXvLJJJI = LJJJI()) == null || (interfaceC1798670wuH = c1208210hXvLJJJI.LJII) == null || interfaceC1798670wuH.get() == 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJJJJL(Activity activity, String[] strArr) {
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ = LJJJJ();
        if (interfaceC1235640iGALJJJJ == null) {
            return false;
        }
        for (String str : strArr) {
            if (interfaceC1235640iGALJJJJ.LIZ(activity, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C1207210hWJ
    public final boolean LJIIIZ(String str, String str2) {
        List<String> list = LJ.get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    @Override // X.C1207210hWJ
    public final void LJIJJLI(Activity activity, C1207150hWD c1207150hWD) {
        Cert cert;
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI != null) {
            cert = c1208210hXvLJJJI.LJIILJJIL;
        } else {
            cert = null;
        }
        LJJJLL(activity, cert, c1207150hWD, "biz");
    }

    public static C1207220hWK LJJIJIL(C1208130hXn c1208130hXn, EnumC2192761Arq enumC2192761Arq, long j) {
        int i;
        int iLJJIZ;
        boolean z;
        long jCurrentTimeMillis;
        InterfaceC1798670wuH interfaceC1798670wuH;
        c1208130hXn.getClass();
        C1208420hYG c1208420hYGLJJJIL = LJJJIL();
        if (c1208420hYGLJJJIL != null && c1208420hYGLJJJIL.LIZIZ) {
            i = c1208420hYGLJJJIL.LIZLLL(enumC2192761Arq).LIZLLL().LIZJ;
        } else {
            i = 0;
        }
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI != null) {
            C1208130hXn c1208130hXn2 = LIZJ;
            Context context = c1208210hXvLJJJI.LIZIZ;
            c1208130hXn2.getClass();
            iLJJIZ = LJJIZ(context);
        } else {
            iLJJIZ = 0;
        }
        C1208210hXv c1208210hXvLJJJI2 = LJJJI();
        if (c1208210hXvLJJJI2 != null && (interfaceC1798670wuH = c1208210hXvLJJJI2.LJII) != null && interfaceC1798670wuH.get() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            jCurrentTimeMillis = 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        }
        return new C1207220hWK(iLJJIZ, jCurrentTimeMillis, 0L, z, i + 1, -1);
    }

    public static void LJJJJLL(int i, String str, String str2) {
        String btm;
        C18JF c18jf = C1208460hYK.LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("popup_type", str2), new Pair("trigger_type", String.valueOf(i)));
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        C1208460hYK.LIZIZ("pns_location_popup_show", mapLJIIJ, C2097608Jq.LJ());
    }

    @Override // X.C1207210hWJ
    public final void LJIL(Activity activity, C1207150hWD c1207150hWD, String str) {
        Cert cert;
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI != null) {
            cert = c1208210hXvLJJJI.LJIILJJIL;
        } else {
            cert = null;
        }
        LJJJLL(activity, cert, c1207150hWD, str);
    }

    @Override // X.C1207210hWJ
    public final boolean LJJ(C1158340gFU c1158340gFU, EnumC1800110wwb enumC1800110wwb, InterfaceC1207170hWF interfaceC1207170hWF) {
        Activity c098200Yq;
        Object c098200Yq2;
        Object obj = null;
        if (LJIIIZ.get() && LJFF != null) {
            C1208210hXv c1208210hXvLJJJI = LJJJI();
            if (c1208210hXvLJJJI == null) {
                return false;
            }
            int i = c1208210hXvLJJJI.LJII.get();
            if (i == 0) {
                int iLIZ = LIZ();
                if (iLIZ < 2) {
                    C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("promoteInAppPreciseConsent: fine not allowed, accuracy=");
                    sbLIZ.append(iLIZ);
                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                boolean zLIZIZ = C1194170hBH.LIZIZ(c1208210hXvLJJJI.LIZIZ);
                if (!zLIZIZ) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPreciseConsent: system fine permission missing");
                    return false;
                }
                try {
                    c098200Yq = c1208210hXvLJJJI.LJIIIIZZ.invoke();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                    C1798620wuC.LIZJ("LocationController", "promoteInAppPreciseConsent: activityGetter failed", thM5exceptionOrNullimpl);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                Activity activity = (Activity) obj;
                if (activity == null) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPreciseConsent: activity missing");
                    return false;
                }
                C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
                C1798620wuC.LIZLLL("LocationController", "promoteInAppPreciseConsent: start, trigger=" + enumC1800110wwb + ", mode=" + i + ", accuracy=" + iLIZ + ", finePermissionGranted=" + zLIZIZ);
                try {
                    c098200Yq2 = Boolean.valueOf(c1158340gFU.LIZIZ.LIZ(activity, enumC1800110wwb, interfaceC1207170hWF));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl2 != null) {
                    C1798620wuC c1798620wuC4 = C1798620wuC.LIZ;
                    C1798620wuC.LIZJ("LocationController", "promoteInAppPreciseConsent: promoteHandler failed", thM5exceptionOrNullimpl2);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = bool;
                }
                boolean zBooleanValue = ((Boolean) c098200Yq2).booleanValue();
                C1798620wuC c1798620wuC5 = C1798620wuC.LIZ;
                C1798620wuC.LIZLLL("LocationController", "promoteInAppPreciseConsent: started=" + zBooleanValue + ", trigger=" + enumC1800110wwb);
                return zBooleanValue;
            }
            C1798620wuC c1798620wuC6 = C1798620wuC.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("promoteInAppPreciseConsent: mode not eligible: ");
            sbLIZ2.append(i);
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        C1798620wuC c1798620wuC7 = C1798620wuC.LIZ;
        C1798620wuC.LJ("LocationController", "promoteInAppPreciseConsent: controller not initialized", null);
        return false;
    }

    @Override // X.C1207210hWJ
    public final void LJJI(Activity activity, Cert cert, C1207200hWI c1207200hWI) throws JSONException {
        EnumC2192761Arq enumC2192761Arq;
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ;
        String strLIZ;
        C1208270hY1 c1208270hY1;
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ2;
        String strLIZ2;
        C1208270hY1 c1208270hY12;
        Pair pair;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("promoteSystemPermission: ");
        sbLIZ.append(cert);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        AtomicBoolean atomicBoolean = LJIIIZ;
        if (atomicBoolean.get() && c1208210hXvLJJJI != null && C1194170hBH.LIZIZ(activity)) {
            C1798620wuC.LJ("LocationController", "promoteSystemPermission: already fine, forwarding to promoteInAppPermission", null);
            LJJJLL(activity, c1208210hXvLJJJI.LJIILJJIL, c1207200hWI, "biz");
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1208160hXq c1208160hXqLIZ = LIZLLL.LIZ(cert);
        if (c1208160hXqLIZ == null || (enumC2192761Arq = c1208160hXqLIZ.LJ) == null) {
            enumC2192761Arq = EnumC2192761Arq.Active;
        }
        String strCertToken = cert.certToken();
        String str = "unknown";
        if (strCertToken == null) {
            strCertToken = "unknown";
        }
        LJJJLIIL(LJJJ(enumC2192761Arq), strCertToken, "system_conversion", "biz");
        if (atomicBoolean.get() && LJFF != null) {
            if (!LJJJJL(cert)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("promoteSystemPermission: not allowed ");
                sbLIZ2.append(cert.certToken());
                C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ2), null);
                EnumC1207930hXT enumC1207930hXT = EnumC1207930hXT.CertInvalid;
                LJJIIZI(-2001, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(enumC1207930hXT, EnumC1207420hWe.System), enumC1207930hXT, enumC2192761Arq, "system_conversion", "cert_invalid", null);
                return;
            }
            if (!C1194170hBH.LIZ(activity)) {
                C1798620wuC.LIZJ("LocationController", "promoteSystemPermission: no coarse permission", null);
                EnumC1207930hXT enumC1207930hXT2 = EnumC1207930hXT.Cancel;
                LJJIIZI(-1001, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(enumC1207930hXT2, EnumC1207420hWe.System), enumC1207930hXT2, enumC2192761Arq, "system_conversion", "no_coarse_permission", "No coarse");
                return;
            }
            if (LIZ() < 2) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("promoteSystemPermission: accuracyLevel ");
                sbLIZ3.append(LIZ());
                C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ3), null);
                EnumC1207930hXT enumC1207930hXT3 = EnumC1207930hXT.Cancel;
                LJJIIZI(-1002, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(enumC1207930hXT3, EnumC1207420hWe.System), enumC1207930hXT3, enumC2192761Arq, "system_conversion", "accuracy_level_too_low", "accuracyLevel<2");
                return;
            }
            C1208420hYG c1208420hYGLJJJIL = LJJJIL();
            if (c1208420hYGLJJJIL == null) {
                return;
            }
            int iLIZJ = c1208420hYGLJJJIL.LIZJ(cert);
            if (iLIZJ != 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("promoteSystemPermission: over limit, result=");
                sbLIZ4.append(iLIZJ);
                C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ4), null);
                if (iLIZJ == 1 || iLIZJ != 2) {
                    pair = new Pair(-3001, "global_over_limit");
                } else {
                    pair = new Pair(-3002, "cert_over_limit");
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                String str2 = (String) pair.getSecond();
                EnumC1207930hXT enumC1207930hXT4 = EnumC1207930hXT.OverLimit;
                LJJIIZI(iIntValue, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(enumC1207930hXT4, EnumC1207420hWe.System), enumC1207930hXT4, enumC2192761Arq, "system_conversion", str2, null);
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C1208210hXv c1208210hXvLJJJI2 = LJJJI();
                if (c1208210hXvLJJJI2 != null && (interfaceC1235640iGALJJJJ2 = LJJJJ()) != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("promoteSystemPermissionAboveS: ");
                    sbLIZ5.append(cert.certToken());
                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ5));
                    C1208160hXq c1208160hXqLIZ2 = LIZLLL.LIZ(cert);
                    C1208170hXr c1208170hXr = LJII;
                    if (c1208170hXr == null) {
                        C1798620wuC.LIZJ("LocationController", "promoteSystemPermissionAboveS: dialogManager is null", null);
                        Pair pairLJJIL = LJJIL();
                        LJJIIZI(((Number) pairLJJIL.getFirst()).intValue(), jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZIZ(EnumC1207420hWe.System), null, enumC2192761Arq, "system_conversion", (String) pairLJJIL.getSecond(), null);
                        return;
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("promoteSystemPermissionAboveS: ");
                    sbLIZ6.append(cert.certToken());
                    sbLIZ6.append(' ');
                    sbLIZ6.append(c1208160hXqLIZ2);
                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ6));
                    C185100nR c185100nR = C185100nR.LIZ;
                    String strCertToken2 = cert.certToken();
                    if (c1208160hXqLIZ2 != null) {
                        strLIZ2 = c1208160hXqLIZ2.LIZ();
                    } else {
                        strLIZ2 = null;
                    }
                    C185100nR.LJ(strCertToken2, strLIZ2);
                    if (c1208160hXqLIZ2 != null && (c1208270hY12 = c1208160hXqLIZ2.LJFF) != null) {
                        C1208130hXn c1208130hXn = LIZJ;
                        EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.SystemPromote;
                        String str3 = c1208270hY12.LIZLLL;
                        c1208130hXn.getClass();
                        C12Q8 c12q8LJJLI = LJJLI(activity, c1208170hXr, enumC1208400hYE, str3, cert, enumC2192761Arq, jUptimeMillis, c1207200hWI);
                        if (c12q8LJJLI == null) {
                            return;
                        }
                        C1208080hXi c1208080hXi = new C1208080hXi(c1207200hWI, cert, c1208160hXqLIZ2.LJ, jUptimeMillis);
                        final C1208290hY3 c1208290hY3 = new C1208290hY3(interfaceC1235640iGALJJJJ2, activity, cert, c1208270hY12, c1208080hXi, c12q8LJJLI, c1208210hXvLJJJI2.LJII, c1208210hXvLJJJI2.LJI, new AwS384S0200000_18(c1208080hXi, cert, 170));
                        final C259800zU c259800zU = new C259800zU();
                        final C238400w2 c238400w2 = new C238400w2();
                        final boolean zLJJJJJL = LJJJJJL(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                        final boolean zLJIIJ = C0VE9.LJIIJ(activity, "android.permission.ACCESS_FINE_LOCATION");
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("promoteAboveS: shouldShowRationale1=");
                        sbLIZ7.append(zLJIIJ);
                        sbLIZ7.append(" fineDeniedForEver1=");
                        sbLIZ7.append(zLJJJJJL);
                        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ7));
                        interfaceC1235640iGALJJJJ2.LIZIZ(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, cert, new InterfaceC1208110hXl() { // from class: X.0hY2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC1208110hXl
                            public final void LIZ(C1208240hXy c1208240hXy) {
                                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("promote: onRequest ");
                                sbLIZ8.append(c1208240hXy);
                                C1798620wuC.LIZIZ("LocationController", C2188811AlT.LIZIZ(sbLIZ8));
                                c259800zU.element = c1208240hXy;
                                c238400w2.element = System.currentTimeMillis();
                            }

                            @Override // X.InterfaceC1208110hXl
                            public final void LIZIZ(Pair<String, ? extends EnumC1207930hXT>... pairArr) {
                                Pair<String, ? extends EnumC1207930hXT> pair2;
                                EnumC1207930hXT second;
                                EnumC1207930hXT second2;
                                EnumC1207930hXT second3;
                                C12QB c12qb;
                                C12QB c12qb2;
                                int length = pairArr.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        pair2 = pairArr[i];
                                        if (Intrinsics.LJFF(pair2.getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        pair2 = null;
                                        break;
                                    }
                                }
                                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("promote: onResult results=");
                                if (pair2 != null) {
                                    second = pair2.getSecond();
                                } else {
                                    second = null;
                                }
                                sbLIZ8.append(second);
                                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ8));
                                if (pair2 != null) {
                                    second2 = pair2.getSecond();
                                } else {
                                    second2 = null;
                                }
                                EnumC1207930hXT enumC1207930hXT5 = EnumC1207930hXT.Granted;
                                if (second2 == enumC1207930hXT5) {
                                    C1208240hXy c1208240hXy = c259800zU.element;
                                    if (c1208240hXy != null) {
                                        c1208290hY3.LIZ(c1208240hXy, new C1208000hXa(enumC1207930hXT5, c1208240hXy.LIZ, null, null, 12), Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                }
                                if (pair2 != null) {
                                    second3 = pair2.getSecond();
                                } else {
                                    second3 = null;
                                }
                                EnumC1207930hXT enumC1207930hXT6 = EnumC1207930hXT.Denied;
                                if (second3 == enumC1207930hXT6) {
                                    List listLJJLL = C13LQ.LJJLL(pairArr);
                                    boolean zLJIIJ2 = C0VE9.LJIIJ(c1208290hY3.LIZ, "android.permission.ACCESS_FINE_LOCATION");
                                    C1208130hXn.LIZJ.getClass();
                                    boolean zLJJJJJL2 = C1208130hXn.LJJJJJL(c1208290hY3.LIZ, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                                    long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("promote: denied shouldShowRationale2=");
                                    sbLIZ9.append(zLJIIJ2);
                                    sbLIZ9.append(" fineDeniedForEver2=");
                                    sbLIZ9.append(zLJJJJJL2);
                                    sbLIZ9.append(" elapsed=");
                                    sbLIZ9.append(jCurrentTimeMillis);
                                    C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ9));
                                    C1208290hY3 c1208290hY32 = c1208290hY3;
                                    long j = c238400w2.element;
                                    boolean z = zLJIIJ;
                                    boolean z2 = zLJJJJJL;
                                    c1208290hY32.getClass();
                                    if (j > 0 && jCurrentTimeMillis > c1208290hY32.LJI && z == zLJIIJ2 && z2 == zLJJJJJL2) {
                                        C1798620wuC.LIZLLL("LocationController", "promote: denied with unchanged permission state, returning Cancel");
                                        C1208240hXy c1208240hXy2 = c259800zU.element;
                                        if (c1208240hXy2 == null) {
                                            return;
                                        }
                                        c1208290hY3.LIZ(c1208240hXy2, new C1208000hXa(EnumC1207930hXT.Cancel, c1208240hXy2.LIZ, null, listLJJLL, 4), Boolean.FALSE);
                                        return;
                                    }
                                    C1208240hXy c1208240hXy3 = c259800zU.element;
                                    if (c1208240hXy3 == null) {
                                        return;
                                    }
                                    c1208290hY3.LIZ(c1208240hXy3, new C1208000hXa(enumC1207930hXT6, c1208240hXy3.LIZ, null, null, 12), Boolean.FALSE);
                                    return;
                                }
                                List listLJJLL2 = C13LQ.LJJLL(pairArr);
                                boolean zLJIIJ3 = C0VE9.LJIIJ(c1208290hY3.LIZ, "android.permission.ACCESS_FINE_LOCATION");
                                C1208130hXn.LIZJ.getClass();
                                boolean zLJJJJJL3 = C1208130hXn.LJJJJJL(c1208290hY3.LIZ, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - c238400w2.element;
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("promote: shouldShowRationale2=");
                                sbLIZ10.append(zLJIIJ3);
                                sbLIZ10.append(" fineDeniedForEver2=");
                                sbLIZ10.append(zLJJJJJL3);
                                sbLIZ10.append(" elapsed=");
                                sbLIZ10.append(jCurrentTimeMillis2);
                                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ10));
                                if (zLJJJJJL3) {
                                    if (zLJJJJJL) {
                                        C1798620wuC.LIZLLL("LocationController", "promote: already permanently denied, showing promote dialog");
                                        C1208290hY3 c1208290hY33 = c1208290hY3;
                                        C1208270hY1 c1208270hY13 = c1208290hY33.LIZJ;
                                        final C12QM c12qm = new C12QM(c1208290hY33, c1208270hY13);
                                        C1798620wuC.LIZLLL("LocationController", "promote: showSystemPromoteDialog");
                                        final C1210150hb3 c1210150hb3 = c1208270hY13.LJ;
                                        final C12Q8 c12q8 = c1208290hY33.LJ;
                                        final Cert cert2 = c1208290hY33.LIZIZ;
                                        final Activity activity2 = c1208290hY33.LIZ;
                                        C12QJ c12qj = c1210150hb3.LIZIZ;
                                        C12QJ c12qj2 = C12QJ.NONE;
                                        if (c12qj == c12qj2) {
                                            c12qb = null;
                                        } else {
                                            c12qb = new C12QB() { // from class: X.0hY4
                                                @Override // X.C12QB
                                                public final void LIZ() {
                                                    C12QM c12qm2 = c12qm;
                                                    C12Q8 c12q82 = c12q8;
                                                    C12QJ c12qj3 = c1210150hb3.LIZIZ;
                                                    Activity activity3 = activity2;
                                                    c12qm2.getClass();
                                                    int i2 = C12QK.LIZ[c12qj3.ordinal()];
                                                    if (i2 == 1 || i2 == 2) {
                                                        Function1<String, Unit> function1 = c12qm2.LIZ.LJII;
                                                        if (function1 != null) {
                                                            function1.invoke("open_settings");
                                                        }
                                                        C1208130hXn.LIZJ.getClass();
                                                        C1208130hXn.LJJJJI(activity3);
                                                        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver((SystemPermissionPromoter$lifecycleWatcher$2$1) c12qm2.LIZ.LJIIIIZZ.getValue());
                                                        return;
                                                    }
                                                    if (i2 == 3) {
                                                        Function1<String, Unit> function12 = c12qm2.LIZ.LJII;
                                                        if (function12 != null) {
                                                            function12.invoke("cancel");
                                                        }
                                                        c12q82.LIZIZ(new AwS579S0100000_35(c12qm2.LIZ, 193));
                                                    }
                                                }

                                                @Override // X.C12QB
                                                public final String LIZIZ() {
                                                    return c1210150hb3.LIZ;
                                                }

                                                @Override // X.C12QB
                                                public final C12QJ type() {
                                                    return c1210150hb3.LIZIZ;
                                                }
                                            };
                                        }
                                        final C1210150hb3 c1210150hb32 = c1208270hY13.LJFF;
                                        if (c1210150hb32 == null || c1210150hb32.LIZIZ == c12qj2) {
                                            c12qb2 = null;
                                        } else {
                                            c12qb2 = new C12QB() { // from class: X.0hY4
                                                @Override // X.C12QB
                                                public final void LIZ() {
                                                    C12QM c12qm2 = c12qm;
                                                    C12Q8 c12q82 = c12q8;
                                                    C12QJ c12qj3 = c1210150hb32.LIZIZ;
                                                    Activity activity3 = activity2;
                                                    c12qm2.getClass();
                                                    int i2 = C12QK.LIZ[c12qj3.ordinal()];
                                                    if (i2 == 1 || i2 == 2) {
                                                        Function1<String, Unit> function1 = c12qm2.LIZ.LJII;
                                                        if (function1 != null) {
                                                            function1.invoke("open_settings");
                                                        }
                                                        C1208130hXn.LIZJ.getClass();
                                                        C1208130hXn.LJJJJI(activity3);
                                                        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver((SystemPermissionPromoter$lifecycleWatcher$2$1) c12qm2.LIZ.LJIIIIZZ.getValue());
                                                        return;
                                                    }
                                                    if (i2 == 3) {
                                                        Function1<String, Unit> function12 = c12qm2.LIZ.LJII;
                                                        if (function12 != null) {
                                                            function12.invoke("cancel");
                                                        }
                                                        c12q82.LIZIZ(new AwS579S0100000_35(c12qm2.LIZ, 193));
                                                    }
                                                }

                                                @Override // X.C12QB
                                                public final String LIZIZ() {
                                                    return c1210150hb32.LIZ;
                                                }

                                                @Override // X.C12QB
                                                public final C12QJ type() {
                                                    return c1210150hb32.LIZIZ;
                                                }
                                            };
                                        }
                                        c12q8.LIZJ(c1208270hY13.LIZ, c1208270hY13.LIZIZ, c12qb, c12qb2, c1208270hY13.LIZJ, new AwS579S0100000_35(c1208290hY33, 194));
                                        return;
                                    }
                                    C1798620wuC.LIZLLL("LocationController", "promote: permanently denied (first time)");
                                    C1208240hXy c1208240hXy4 = c259800zU.element;
                                    if (c1208240hXy4 == null) {
                                        return;
                                    }
                                    C1208290hY3 c1208290hY34 = c1208290hY3;
                                    C1208000hXa c1208000hXa = new C1208000hXa(EnumC1207930hXT.DeniedPermanently, c1208240hXy4.LIZ, null, listLJJLL2, 4);
                                    c1208290hY34.getClass();
                                    c1208290hY34.LIZ(c1208240hXy4, c1208000hXa, C1208290hY3.LIZIZ(pair2));
                                    return;
                                }
                                C1798620wuC.LIZLLL("LocationController", "promote: other case, returning denied (non-permanent)");
                                C1208240hXy c1208240hXy5 = c259800zU.element;
                                if (c1208240hXy5 == null) {
                                    return;
                                }
                                C1208290hY3 c1208290hY35 = c1208290hY3;
                                C1208000hXa c1208000hXa2 = new C1208000hXa(enumC1207930hXT6, c1208240hXy5.LIZ, null, listLJJLL2, 4);
                                c1208290hY35.getClass();
                                c1208290hY35.LIZ(c1208240hXy5, c1208000hXa2, C1208290hY3.LIZIZ(pair2));
                            }
                        });
                        return;
                    }
                    C1798620wuC.LIZJ("LocationController", "promoteSystemPermissionAboveS: no sysConversionConfig", null);
                    C185100nR.LIZLLL(cert.certToken(), "locate", "missing sysConversionConfig");
                    LJJIIZI(-2004, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(EnumC1207930hXT.CertInvalid, EnumC1207420hWe.System), null, enumC2192761Arq, "system_conversion", "no_sys_conversion_config", null);
                    return;
                }
                return;
            }
            C1208210hXv c1208210hXvLJJJI3 = LJJJI();
            if (c1208210hXvLJJJI3 == null || (interfaceC1235640iGALJJJJ = LJJJJ()) == null) {
                return;
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("promoteSystemPermissionUnderS: ");
            sbLIZ8.append(cert.certToken());
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ8));
            Cert cert2 = c1208210hXvLJJJI3.LJIILJJIL;
            C1208170hXr c1208170hXr2 = LJII;
            if (c1208170hXr2 == null) {
                C1798620wuC.LIZJ("LocationController", "promoteSystemPermissionUnderS: dialogManager is null", null);
                Pair pairLJJIL2 = LJJIL();
                LJJIIZI(((Number) pairLJJIL2.getFirst()).intValue(), jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZIZ(EnumC1207420hWe.System), null, enumC2192761Arq, "system_conversion", (String) pairLJJIL2.getSecond(), null);
                return;
            }
            C1208160hXq c1208160hXqLIZ3 = LIZLLL.LIZ(cert2);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("promoteSystemPermissionUnderS: ");
            sbLIZ9.append(cert.certToken());
            sbLIZ9.append(' ');
            sbLIZ9.append(c1208160hXqLIZ3);
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ9));
            C185100nR c185100nR2 = C185100nR.LIZ;
            String strCertToken3 = cert.certToken();
            if (c1208160hXqLIZ3 != null) {
                strLIZ = c1208160hXqLIZ3.LIZ();
            } else {
                strLIZ = null;
            }
            C185100nR.LJ(strCertToken3, strLIZ);
            if (c1208160hXqLIZ3 != null && (c1208270hY1 = c1208160hXqLIZ3.LJI) != null) {
                C1208130hXn c1208130hXn2 = LIZJ;
                EnumC1208400hYE enumC1208400hYE2 = EnumC1208400hYE.InAppPromote;
                String str4 = c1208270hY1.LIZLLL;
                c1208130hXn2.getClass();
                C12Q8 c12q8LJJLI2 = LJJLI(activity, c1208170hXr2, enumC1208400hYE2, str4, cert, enumC2192761Arq, jUptimeMillis, c1207200hWI);
                if (c12q8LJJLI2 == null) {
                    return;
                }
                new C1208310hY5(interfaceC1235640iGALJJJJ, activity, cert2, c1208270hY1, new C1208080hXi(c1207200hWI, cert, enumC2192761Arq, jUptimeMillis), c12q8LJJLI2, c1208210hXvLJJJI3.LJII).LIZ();
                return;
            }
            C1798620wuC.LIZJ("LocationController", "promoteSystemPermissionUnderS: no inAppConversionConfig", null);
            C185100nR.LIZLLL(cert.certToken(), "locate", "missing sysConversionConfig");
            LJJIIZI(-2004, jUptimeMillis, cert, c1207200hWI, C1207290hWR.LIZJ(EnumC1207930hXT.CertInvalid, EnumC1207420hWe.System), null, enumC2192761Arq, "system_conversion", "no_sys_conversion_config", null);
            return;
        }
        C1798620wuC.LIZJ("LocationController", "promoteSystemPermission: controller not initialized", null);
        Pair pairLJJIL3 = LJJIL();
        int iIntValue2 = ((Number) pairLJJIL3.getFirst()).intValue();
        String str5 = (String) pairLJJIL3.getSecond();
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        String strCertToken4 = cert.certToken();
        if (strCertToken4 != null) {
            str = strCertToken4;
        }
        int iLJJJ = LJJJ(enumC2192761Arq);
        getClass();
        LJJJJZ(iLJJJ, iIntValue2, jUptimeMillis2, jUptimeMillis2, str, "system_conversion", "fail", str5, "biz");
        c1207200hWI.LIZIZ(C1207290hWR.LIZJ(EnumC1207930hXT.CertInvalid, EnumC1207420hWe.System));
    }

    public static C1207220hWK LJJIJIIJI(EnumC2192761Arq enumC2192761Arq, Cert cert, long j, long j2) {
        int i;
        int iLJJIZ;
        boolean z;
        long jCurrentTimeMillis;
        int i2;
        long jCurrentTimeMillis2;
        InterfaceC1798670wuH interfaceC1798670wuH;
        C1208420hYG c1208420hYGLJJJIL = LJJJIL();
        int iLIZ = 0;
        if (c1208420hYGLJJJIL != null && c1208420hYGLJJJIL.LIZIZ) {
            i = c1208420hYGLJJJIL.LIZLLL(enumC2192761Arq).LIZJ().LIZJ;
        } else {
            i = 0;
        }
        C1208210hXv c1208210hXvLJJJI = LJJJI();
        if (c1208210hXvLJJJI != null) {
            C1208130hXn c1208130hXn = LIZJ;
            Context context = c1208210hXvLJJJI.LIZIZ;
            c1208130hXn.getClass();
            iLJJIZ = LJJIZ(context);
        } else {
            iLJJIZ = 0;
        }
        C1208210hXv c1208210hXvLJJJI2 = LJJJI();
        if (c1208210hXvLJJJI2 != null && (interfaceC1798670wuH = c1208210hXvLJJJI2.LJII) != null && interfaceC1798670wuH.get() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            jCurrentTimeMillis = 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        }
        int i3 = i + 1;
        C1208420hYG c1208420hYGLJJJIL2 = LJJJIL();
        if (c1208420hYGLJJJIL2 != null) {
            if (c1208420hYGLJJJIL2.LIZIZ) {
                iLIZ = c1208420hYGLJJJIL2.LIZLLL(enumC2192761Arq).LIZIZ().LIZ(cert);
            }
            i2 = iLIZ + 1;
        } else {
            i2 = -1;
        }
        if (j2 == 0) {
            jCurrentTimeMillis2 = 0;
        } else {
            jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
        }
        return new C1207220hWK(iLJJIZ, jCurrentTimeMillis, jCurrentTimeMillis2, z, i3, i2);
    }

    public static void LJJJJLI(long j, String str, String str2, String str3) {
        String btm;
        C18JF c18jf = C1208460hYK.LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("popup_type", str2), new Pair("action_type", str3));
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        C1208460hYK.LIZIZ("pns_location_popup_click", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("show_to_click_duration", Long.valueOf(j))));
    }

    public static void LJJJLIIL(int i, String str, String str2, String str3) {
        String btm;
        C18JF c18jf = C1208460hYK.LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("popup_type", str2), new Pair("trigger_scene", str3));
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        C1208460hYK.LIZIZ("pns_location_popup_load_start", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("trigger_type", Long.valueOf(i))));
    }

    @Override // X.C1207210hWJ
    public final void LJJIII(final Activity activity, final Cert cert, final C12Q8 c12q8, InterfaceC1207310hWT interfaceC1207310hWT) {
        Integer numValueOf;
        C1208210hXv c1208210hXvLJJJI;
        String strInvoke;
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestConsent: ");
        C1208210hXv c1208210hXvLJJJI2 = LJJJI();
        C12QB c12qb = null;
        if (c1208210hXvLJJJI2 != null) {
            numValueOf = Integer.valueOf(c1208210hXvLJJJI2.LIZLLL);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(cert);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LJJIJL("requestConsent")) {
            interfaceC1207310hWT.LIZ(EnumC1208550hYT.Unknown);
            return;
        }
        if (LJIIIIZZ.get()) {
            interfaceC1207310hWT.LIZ(EnumC1208550hYT.Unknown);
            return;
        }
        C1208260hY0 c1208260hY0 = LJFF;
        if (c1208260hY0 == null) {
            interfaceC1207310hWT.LIZ(EnumC1208550hYT.Unknown);
            return;
        }
        C1798380wto c1798380wto = c1208260hY0.LIZJ;
        if (c1798380wto == null || (c1208210hXvLJJJI = LJJJI()) == null) {
            return;
        }
        C1208470hYL c1208470hYL = LJI;
        if (c1208470hYL == null) {
            interfaceC1207310hWT.LIZ(EnumC1208550hYT.Unknown);
            return;
        }
        C1208190hXt c1208190hXt = LIZLLL;
        if (cert != null) {
            C1208180hXs c1208180hXs = c1208190hXt.LIZLLL.get(cert.certToken());
            if (c1208180hXs != null) {
                String strInvoke2 = c1208210hXvLJJJI.LJIIIZ.invoke();
                Function0<String> function0 = c1208210hXvLJJJI.LJIIJ;
                if (function0 == null || (strInvoke = function0.invoke()) == null) {
                    strInvoke = "na";
                }
                final C1208540hYS c1208540hYS = new C1208540hYS(c1208180hXs, c1208470hYL, c1798380wto, strInvoke2, strInvoke, new AwS614S0100000_35(activity, 124), interfaceC1207310hWT, AFwS226S0000000_35.get$arr$(356), AFwS226S0000000_35.get$arr$(357));
                int iLIZ = c1208470hYL.LIZ(strInvoke2);
                SharedPreferences sharedPreferences = c1208470hYL.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("consent_time_");
                sbLIZ2.append(strInvoke2);
                long j = sharedPreferences.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (iLIZ >= c1208180hXs.LIZJ.size()) {
                    jLongValue = ((Number) C13LP.LJJLIIIJJI(c1208180hXs.LIZJ)).longValue();
                } else {
                    jLongValue = ((Number) ListProtector.get(c1208180hXs.LIZJ, iLIZ)).longValue();
                }
                long j2 = jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if ((iLIZ == 0 && j == 0) || (iLIZ < c1208180hXs.LIZIZ && jCurrentTimeMillis - j >= j2)) {
                    final C1210150hb3 c1210150hb3 = c1208180hXs.LJI;
                    C12QB c12qb2 = new C12QB() { // from class: X.0hYR
                        @Override // X.C12QB
                        public final void LIZ() {
                            C1208540hYS c1208540hYS2 = c1208540hYS;
                            C12Q8 c12q82 = c12q8;
                            Cert cert2 = cert;
                            C12QJ c12qj = c1210150hb3.LIZIZ;
                            Activity activity2 = activity;
                            c1208540hYS2.getClass();
                            int i = C12QG.LIZ[c12qj.ordinal()];
                            if (i == 1) {
                                InterfaceC1207310hWT interfaceC1207310hWT2 = c1208540hYS2.LJFF;
                                c12q82.LIZIZ(new AwS571S0100000_27(c1208540hYS2, 1035));
                                if (interfaceC1207310hWT2 != null) {
                                    interfaceC1207310hWT2.LIZ(EnumC1208550hYT.Granted);
                                }
                                c1208540hYS2.LIZ(cert2, C12QJ.OK, EnumC1208550hYT.Granted);
                                c1208540hYS2.LIZ.LIZIZ(c1208540hYS2.LIZJ, true);
                                return;
                            }
                            if (i != 2) {
                                if (i != 3) {
                                    C185100nR c185100nR = C185100nR.LIZ;
                                    C185100nR.LJFF(null, String.valueOf(c12qj.getValue()));
                                    return;
                                } else {
                                    c12q82.LIZIZ(null);
                                    c1208540hYS2.LJ.invoke(activity2);
                                    return;
                                }
                            }
                            InterfaceC1207310hWT interfaceC1207310hWT3 = c1208540hYS2.LJFF;
                            c12q82.LIZIZ(null);
                            if (interfaceC1207310hWT3 != null) {
                                interfaceC1207310hWT3.LIZ(EnumC1208550hYT.Denied);
                            }
                            c1208540hYS2.LIZ(cert2, C12QJ.CANCEL, EnumC1208550hYT.Denied);
                            c1208540hYS2.LIZ.LIZIZ(c1208540hYS2.LIZJ, false);
                        }

                        @Override // X.C12QB
                        public final String LIZIZ() {
                            return c1210150hb3.LIZ;
                        }

                        @Override // X.C12QB
                        public final C12QJ type() {
                            return c1210150hb3.LIZIZ;
                        }
                    };
                    final C1210150hb3 c1210150hb32 = c1208180hXs.LJII;
                    if (c1210150hb32 != null) {
                        c12qb = new C12QB() { // from class: X.0hYR
                            @Override // X.C12QB
                            public final void LIZ() {
                                C1208540hYS c1208540hYS2 = c1208540hYS;
                                C12Q8 c12q82 = c12q8;
                                Cert cert2 = cert;
                                C12QJ c12qj = c1210150hb32.LIZIZ;
                                Activity activity2 = activity;
                                c1208540hYS2.getClass();
                                int i = C12QG.LIZ[c12qj.ordinal()];
                                if (i == 1) {
                                    InterfaceC1207310hWT interfaceC1207310hWT2 = c1208540hYS2.LJFF;
                                    c12q82.LIZIZ(new AwS571S0100000_27(c1208540hYS2, 1035));
                                    if (interfaceC1207310hWT2 != null) {
                                        interfaceC1207310hWT2.LIZ(EnumC1208550hYT.Granted);
                                    }
                                    c1208540hYS2.LIZ(cert2, C12QJ.OK, EnumC1208550hYT.Granted);
                                    c1208540hYS2.LIZ.LIZIZ(c1208540hYS2.LIZJ, true);
                                    return;
                                }
                                if (i != 2) {
                                    if (i != 3) {
                                        C185100nR c185100nR = C185100nR.LIZ;
                                        C185100nR.LJFF(null, String.valueOf(c12qj.getValue()));
                                        return;
                                    } else {
                                        c12q82.LIZIZ(null);
                                        c1208540hYS2.LJ.invoke(activity2);
                                        return;
                                    }
                                }
                                InterfaceC1207310hWT interfaceC1207310hWT3 = c1208540hYS2.LJFF;
                                c12q82.LIZIZ(null);
                                if (interfaceC1207310hWT3 != null) {
                                    interfaceC1207310hWT3.LIZ(EnumC1208550hYT.Denied);
                                }
                                c1208540hYS2.LIZ(cert2, C12QJ.CANCEL, EnumC1208550hYT.Denied);
                                c1208540hYS2.LIZ.LIZIZ(c1208540hYS2.LIZJ, false);
                            }

                            @Override // X.C12QB
                            public final String LIZIZ() {
                                return c1210150hb32.LIZ;
                            }

                            @Override // X.C12QB
                            public final C12QJ type() {
                                return c1210150hb32.LIZIZ;
                            }
                        };
                    }
                    c12q8.LIZJ(c1208180hXs.LIZLLL, c1208180hXs.LJ, c12qb2, c12qb, c1208180hXs.LJFF, new AwS428S0200000_27(c1208540hYS, cert, 52));
                    return;
                }
                interfaceC1207310hWT.LIZ(EnumC1208550hYT.AlreadyConsented);
                return;
            }
        } else {
            c1208190hXt.getClass();
        }
        C185100nR c185100nR = C185100nR.LIZ;
        C185100nR.LJFF("NA", "No consent config");
    }

    public final void LJJJLL(Activity activity, final Cert cert, final InterfaceC1207170hWF interfaceC1207170hWF, final String str) {
        EnumC2192761Arq enumC2192761Arq;
        String strCertToken;
        C1208270hY1 c1208270hY1;
        C1208210hXv c1208210hXvLJJJI;
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ;
        C1208270hY1 c1208270hY12;
        C1208270hY1 c1208270hY13;
        Pair pair;
        C1208160hXq c1208160hXqLIZ;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (cert == null || (c1208160hXqLIZ = LIZLLL.LIZ(cert)) == null || (enumC2192761Arq = c1208160hXqLIZ.LJ) == null) {
            enumC2192761Arq = EnumC2192761Arq.Active;
        }
        if (cert == null || (strCertToken = cert.certToken()) == null) {
            strCertToken = "unknown";
        }
        LJJJLIIL(LJJJ(enumC2192761Arq), strCertToken, "in_app_conversion", str);
        if (LJIIIZ.get() && cert != null && LJFF != null) {
            C1208160hXq c1208160hXq = LIZLLL.LIZIZ.get(cert.certToken());
            if (c1208160hXq != null) {
                c1208270hY1 = c1208160hXq.LJI;
            } else {
                c1208270hY1 = null;
            }
            if (c1208270hY1 == null) {
                C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("promoteInAppPermission: not allowed ");
                sbLIZ.append(cert.certToken());
                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
                EnumC1207930hXT enumC1207930hXT = EnumC1207930hXT.CertInvalid;
                LJJIIJZLJL(-2005, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT, EnumC1207420hWe.InApp), enumC1207930hXT, enumC2192761Arq, "fail", "no_inapp_config", "missing inAppConversionConfig", str);
                return;
            }
            C1208420hYG c1208420hYGLJJJIL = LJJJIL();
            if (c1208420hYGLJJJIL == null || (c1208210hXvLJJJI = LJJJI()) == null || (interfaceC1235640iGALJJJJ = LJJJJ()) == null) {
                return;
            }
            int iLIZ = c1208420hYGLJJJIL.LIZ(cert);
            if (iLIZ != 0) {
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("promoteInAppPermission: over limit ");
                sbLIZ2.append(cert.certToken());
                sbLIZ2.append(", result=");
                sbLIZ2.append(iLIZ);
                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ2));
                if (iLIZ == 1 || iLIZ != 2) {
                    pair = new Pair(-3001, "global_over_limit");
                } else {
                    pair = new Pair(-3002, "cert_over_limit");
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                String str2 = (String) pair.getSecond();
                EnumC1207930hXT enumC1207930hXT2 = EnumC1207930hXT.OverLimit;
                C1208000hXa c1208000hXaLIZJ = C1207290hWR.LIZJ(enumC1207930hXT2, EnumC1207420hWe.InApp);
                getClass();
                LJJIIJZLJL(iIntValue, jUptimeMillis, cert, interfaceC1207170hWF, c1208000hXaLIZJ, enumC1207930hXT2, enumC2192761Arq, "fail", str2, null, str);
                return;
            }
            if (!C1194170hBH.LIZ(activity)) {
                C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: no coarse permission");
                EnumC1207930hXT enumC1207930hXT3 = EnumC1207930hXT.Cancel;
                LJJIIJZLJL(-1001, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT3, EnumC1207420hWe.InApp), enumC1207930hXT3, enumC2192761Arq, "fail", "no_coarse_permission", "No coarse", str);
                return;
            }
            if (LIZ() < 2) {
                C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("promoteInAppPermission: accuracyLevel ");
                sbLIZ3.append(LIZ());
                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ3));
                EnumC1207930hXT enumC1207930hXT4 = EnumC1207930hXT.Cancel;
                LJJIIJZLJL(-1002, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT4, EnumC1207420hWe.InApp), enumC1207930hXT4, enumC2192761Arq, "fail", "fine_not_allowed", "accuracyLevel<2", str);
                return;
            }
            boolean zLIZIZ = C1194170hBH.LIZIZ(activity);
            C1798620wuC c1798620wuC4 = C1798620wuC.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("promoteInAppPermission: fineGranted=");
            sbLIZ4.append(zLIZIZ);
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ4));
            if (zLIZIZ) {
                if (c1208210hXvLJJJI.LJII.get() == 1) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: inAppPreciseMode already fine");
                    EnumC1207930hXT enumC1207930hXT5 = EnumC1207930hXT.Granted;
                    C1208000hXa c1208000hXaLIZJ2 = C1207290hWR.LIZJ(enumC1207930hXT5, EnumC1207420hWe.InApp);
                    getClass();
                    LJJIIJZLJL(0, jUptimeMillis, cert, interfaceC1207170hWF, c1208000hXaLIZJ2, enumC1207930hXT5, enumC2192761Arq, "success", null, null, str);
                    return;
                }
                C1208170hXr c1208170hXr = LJII;
                if (c1208170hXr == null) {
                    C1798620wuC.LIZJ("LocationController", "promoteInAppPermission: dialogManager is null", null);
                    Pair pairLJJIL = LJJIL();
                    int iIntValue2 = ((Number) pairLJJIL.getFirst()).intValue();
                    String str3 = (String) pairLJJIL.getSecond();
                    C1208000hXa c1208000hXaLIZIZ = C1207290hWR.LIZIZ(EnumC1207420hWe.InApp);
                    getClass();
                    LJJIIJZLJL(iIntValue2, jUptimeMillis, cert, interfaceC1207170hWF, c1208000hXaLIZIZ, null, enumC2192761Arq, "fail", str3, null, str);
                    return;
                }
                C1208160hXq c1208160hXqLIZ2 = LIZLLL.LIZ(cert);
                if (c1208160hXqLIZ2 != null && (c1208270hY13 = c1208160hXqLIZ2.LJI) != null) {
                    C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: request");
                    C1208130hXn c1208130hXn = LIZJ;
                    String str4 = c1208270hY13.LIZLLL;
                    c1208130hXn.getClass();
                    C12Q8 c12q8LJJL = LJJL(activity, c1208170hXr, str4, cert, enumC2192761Arq, jUptimeMillis, interfaceC1207170hWF, str);
                    if (c12q8LJJL != null) {
                        final EnumC2192761Arq enumC2192761Arq2 = c1208160hXqLIZ2.LJ;
                        new C1208310hY5(interfaceC1235640iGALJJJJ, activity, cert, c1208270hY13, new InterfaceC1207170hWF(interfaceC1207170hWF, cert, enumC2192761Arq2, jUptimeMillis, str) { // from class: X.0hXm
                            public final InterfaceC1207170hWF LIZ;
                            public final Cert LIZIZ;
                            public final EnumC2192761Arq LIZJ;
                            public final long LIZLLL;
                            public final String LJ;
                            public long LJFF;

                            @Override // X.InterfaceC1207170hWF
                            public final void LIZ(C1208240hXy c1208240hXy) {
                                C1798620wuC c1798620wuC5 = C1798620wuC.LIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("onRequest: ");
                                sbLIZ5.append(c1208240hXy);
                                C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ5));
                                EnumC1207420hWe enumC1207420hWe = c1208240hXy.LIZ;
                                long j = c1208240hXy.LIZIZ;
                                C1208130hXn c1208130hXn2 = C1208130hXn.LIZJ;
                                EnumC2192761Arq enumC2192761Arq3 = this.LIZJ;
                                c1208130hXn2.getClass();
                                C1208420hYG c1208420hYGLJJJIL2 = C1208130hXn.LJJJIL();
                                long j2 = 0;
                                if (c1208420hYGLJJJIL2 != null) {
                                    EnumC2192761Arq enumC2192761Arq4 = this.LIZJ;
                                    if (c1208420hYGLJJJIL2.LIZIZ) {
                                        j2 = c1208420hYGLJJJIL2.LIZLLL(enumC2192761Arq4).LIZLLL().LIZLLL;
                                    }
                                }
                                C1208240hXy c1208240hXy2 = new C1208240hXy(enumC1207420hWe, j, C1208130hXn.LJJIJIL(c1208130hXn2, enumC2192761Arq3, j2));
                                this.LJFF = SystemClock.uptimeMillis();
                                String strCertToken2 = this.LIZIZ.certToken();
                                if (strCertToken2 == null) {
                                    strCertToken2 = "unknown";
                                }
                                C1208130hXn.LJJJJLL(C1208130hXn.LJJJ(this.LIZJ), strCertToken2, "in_app_conversion");
                                this.LIZ.LIZ(c1208240hXy2);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
                            @Override // X.InterfaceC1207170hWF
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZIZ(X.C1208000hXa r22) {
                                /*
                                    Method dump skipped, instruction units count: 274
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1208120hXm.LIZIZ(X.0hXa):void");
                            }

                            {
                                this.LIZ = interfaceC1207170hWF;
                                this.LIZIZ = cert;
                                this.LIZJ = enumC2192761Arq2;
                                this.LIZLLL = jUptimeMillis;
                                this.LJ = str;
                            }
                        }, c12q8LJJL, c1208210hXvLJJJI.LJII).LIZ();
                        return;
                    }
                    return;
                }
                C1798620wuC.LIZJ("LocationController", "promoteInAppPermission: no inAppConversionConfig", null);
                EnumC1207930hXT enumC1207930hXT6 = EnumC1207930hXT.CertInvalid;
                LJJIIJZLJL(-2005, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT6, EnumC1207420hWe.InApp), enumC1207930hXT6, enumC2192761Arq, "fail", "no_inapp_config", "missing inAppConversionConfig", str);
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: fine permission not granted above S");
                EnumC1207930hXT enumC1207930hXT7 = EnumC1207930hXT.Cancel;
                LJJIIJZLJL(-1002, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT7, EnumC1207420hWe.InApp), enumC1207930hXT7, enumC2192761Arq, "fail", "fine_not_allowed", "No fine above S", str);
                return;
            }
            C1208170hXr c1208170hXr2 = LJII;
            if (c1208170hXr2 == null) {
                C1798620wuC.LIZJ("LocationController", "promoteInAppPermission: dialogManager is null", null);
                Pair pairLJJIL2 = LJJIL();
                int iIntValue3 = ((Number) pairLJJIL2.getFirst()).intValue();
                String str5 = (String) pairLJJIL2.getSecond();
                C1208000hXa c1208000hXaLIZIZ2 = C1207290hWR.LIZIZ(EnumC1207420hWe.InApp);
                getClass();
                LJJIIJZLJL(iIntValue3, jUptimeMillis, cert, interfaceC1207170hWF, c1208000hXaLIZIZ2, null, enumC2192761Arq, "fail", str5, null, str);
                return;
            }
            C1798620wuC.LIZLLL("LocationController", "promoteInAppPermission: no fine permission below S, request");
            C1208160hXq c1208160hXqLIZ3 = LIZLLL.LIZ(cert);
            if (c1208160hXqLIZ3 != null && (c1208270hY12 = c1208160hXqLIZ3.LJI) != null) {
                C1208130hXn c1208130hXn2 = LIZJ;
                String str6 = c1208270hY12.LIZLLL;
                c1208130hXn2.getClass();
                C12Q8 c12q8LJJL2 = LJJL(activity, c1208170hXr2, str6, cert, enumC2192761Arq, jUptimeMillis, interfaceC1207170hWF, str);
                if (c12q8LJJL2 == null) {
                    return;
                }
                new C1208310hY5(interfaceC1235640iGALJJJJ, activity, cert, c1208270hY12, new C1208080hXi(interfaceC1207170hWF, cert, c1208160hXqLIZ3.LJ, "in_app_conversion", jUptimeMillis, str), c12q8LJJL2, c1208210hXvLJJJI.LJII).LIZ();
                return;
            }
            EnumC1207930hXT enumC1207930hXT8 = EnumC1207930hXT.CertInvalid;
            LJJIIJZLJL(-2005, jUptimeMillis, cert, interfaceC1207170hWF, C1207290hWR.LIZJ(enumC1207930hXT8, EnumC1207420hWe.InApp), enumC1207930hXT8, enumC2192761Arq, "fail", "no_inapp_config", "missing inAppConversionConfig", str);
            return;
        }
        C1208000hXa c1208000hXaLIZIZ3 = C1207290hWR.LIZIZ(EnumC1207420hWe.InApp);
        getClass();
        LJJIIJZLJL(-10000, jUptimeMillis, cert, interfaceC1207170hWF, c1208000hXaLIZIZ3, null, enumC2192761Arq, "fail", "not_initialized", null, str);
    }

    public static void LJJJZ(final Activity activity, final Cert cert, final InterfaceC1208110hXl interfaceC1208110hXl, final EnumC2192761Arq enumC2192761Arq, final String[] strArr) {
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ = LJJJJ();
        if (interfaceC1235640iGALJJJJ == null) {
            return;
        }
        interfaceC1235640iGALJJJJ.LIZIZ(activity, strArr, cert, new InterfaceC1208110hXl(activity, cert, interfaceC1208110hXl, enumC2192761Arq, strArr) { // from class: X.0hXj
            public final Activity LIZ;
            public final EnumC2192761Arq LIZIZ;
            public final Cert LIZJ;
            public final InterfaceC1208110hXl LIZLLL;
            public final int LJ;
            public long LJFF;

            @Override // X.InterfaceC1208110hXl
            public final void LIZ(C1208240hXy c1208240hXy) {
                long jLJI;
                EnumC1207420hWe enumC1207420hWe = c1208240hXy.LIZ;
                long j = c1208240hXy.LIZIZ;
                C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
                EnumC2192761Arq enumC2192761Arq2 = this.LIZIZ;
                Cert cert2 = this.LIZJ;
                c1208130hXn.getClass();
                C1208420hYG c1208420hYGLJJJIL = C1208130hXn.LJJJIL();
                if (c1208420hYGLJJJIL != null) {
                    jLJI = c1208420hYGLJJJIL.LJI(this.LIZIZ);
                } else {
                    jLJI = 0;
                }
                c1208130hXn.getClass();
                C1208240hXy c1208240hXy2 = new C1208240hXy(enumC1207420hWe, j, C1208130hXn.LJJIJIIJI(enumC2192761Arq2, cert2, jLJI, 0L));
                this.LJFF = SystemClock.uptimeMillis();
                String strCertToken = this.LIZJ.certToken();
                if (strCertToken == null) {
                    strCertToken = "unknown";
                }
                C1208130hXn.LJJJJLL(C1208130hXn.LJJJ(this.LIZIZ), strCertToken, "system");
                this.LIZLLL.LIZ(c1208240hXy2);
            }

            @Override // X.InterfaceC1208110hXl
            public final void LIZIZ(Pair<String, ? extends EnumC1207930hXT>... pairArr) {
                long jUptimeMillis;
                String str;
                InterfaceC1798670wuH interfaceC1798670wuH;
                boolean z = false;
                final int i = 0;
                for (Pair<String, ? extends EnumC1207930hXT> pair : pairArr) {
                    if (pair.getSecond() == EnumC1207930hXT.Granted) {
                        if (Intrinsics.LJFF(pair.getFirst(), "android.permission.ACCESS_COARSE_LOCATION")) {
                            if (i < 1) {
                                i = 1;
                            }
                        } else if (Intrinsics.LJFF(pair.getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                            i = 2;
                        }
                    }
                }
                int length = pairArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (pairArr[i2].getSecond() == EnumC1207930hXT.Granted) {
                            C1208130hXn.LIZJ.getClass();
                            C1208420hYG c1208420hYGLJJJIL = C1208130hXn.LJJJIL();
                            if (c1208420hYGLJJJIL != null) {
                                c1208420hYGLJJJIL.LJIIJJI(this.LIZIZ, 1, this.LIZJ, System.currentTimeMillis());
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        for (Pair<String, ? extends EnumC1207930hXT> pair2 : pairArr) {
                            if (pair2.getSecond() == EnumC1207930hXT.Denied || pair2.getSecond() == EnumC1207930hXT.DeniedPermanently || pair2.getSecond() == EnumC1207930hXT.DeniedPermanentlyNoPopup) {
                                C1208130hXn.LIZJ.getClass();
                                C1208420hYG c1208420hYGLJJJIL2 = C1208130hXn.LJJJIL();
                                if (c1208420hYGLJJJIL2 != null) {
                                    c1208420hYGLJJJIL2.LJIIJJI(this.LIZIZ, 0, this.LIZJ, System.currentTimeMillis());
                                }
                            }
                        }
                    }
                }
                if (this.LJFF > 0) {
                    jUptimeMillis = SystemClock.uptimeMillis() - this.LJFF;
                } else {
                    jUptimeMillis = 0;
                }
                int length2 = pairArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        if (pairArr[i3].getSecond() == EnumC1207930hXT.Granted) {
                            str = "allow";
                            break;
                        }
                        i3++;
                    } else {
                        str = "deny";
                        break;
                    }
                }
                C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
                String strCertToken = this.LIZJ.certToken();
                if (strCertToken == null) {
                    strCertToken = "unknown";
                }
                c1208130hXn.getClass();
                C1208130hXn.LJJJJLI(jUptimeMillis, strCertToken, "system", str);
                C1208210hXv c1208210hXvLJJJI = C1208130hXn.LJJJI();
                Boolean boolValueOf = null;
                if (c1208210hXvLJJJI != null) {
                    interfaceC1798670wuH = c1208210hXvLJJJI.LJII;
                } else {
                    interfaceC1798670wuH = null;
                }
                if (this.LJFF > 0 && interfaceC1798670wuH != null) {
                    int length3 = pairArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length3) {
                            break;
                        }
                        Pair<String, ? extends EnumC1207930hXT> pair3 = pairArr[i4];
                        if (Intrinsics.LJFF(pair3.getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                            EnumC1207930hXT second = pair3.getSecond();
                            if (second != null) {
                                if (second == EnumC1207930hXT.Granted) {
                                    z = true;
                                }
                                boolValueOf = Boolean.valueOf(z);
                            }
                        } else {
                            i4++;
                        }
                    }
                    if (boolValueOf != null) {
                        C1798660wuG.LIZ(interfaceC1798670wuH, boolValueOf.booleanValue(), "legacy_system_permission_result");
                    } else {
                        C1798660wuG.LIZ(interfaceC1798670wuH, C1194170hBH.LIZIZ(this.LIZ), "legacy_system_permission_result");
                    }
                }
                this.LIZLLL.LIZIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                C185100nR c185100nR = C185100nR.LIZ;
                final int i5 = this.LJ;
                C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportPermissionStatus: ");
                sbLIZ.append(i5);
                sbLIZ.append(' ');
                sbLIZ.append(i);
                C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
                if (!C185100nR.LIZ()) {
                    C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPermissionStatus: not initialized");
                } else {
                    C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nF
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SdkMonitorWrapper@f316.reportPermissionStatus$2");
                            try {
                                JSONObject jSONObject = new JSONObject();
                                int i6 = i5;
                                int i7 = i;
                                jSONObject.put("request_level", i6);
                                jSONObject.put("result_level", i7);
                                C185100nR.LIZIZ(C185100nR.LIZ, "perm_request_status", jSONObject, null, 12);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportPermissionStatus$2");
                        }
                    });
                }
            }

            {
                this.LIZ = activity;
                this.LIZIZ = enumC2192761Arq;
                this.LIZJ = cert;
                this.LIZLLL = interfaceC1208110hXl;
                this.LJ = C13LQ.LJJIJIIJI("android.permission.ACCESS_FINE_LOCATION", strArr) >= 0 ? 2 : 1;
            }
        });
    }

    @Override // X.C1207210hWJ
    public final void LIZJ(final String str, final String str2, final String str3, final boolean z, final boolean z2) {
        C185100nR c185100nR = C185100nR.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportConfigDiff: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(str3);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportConfigDiff: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nb
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    boolean z3 = z;
                    boolean z4 = z2;
                    jSONObject.put("business", str4);
                    if (str5 != null) {
                        jSONObject.put(Scene.SCENE_SERVICE, str5);
                    }
                    jSONObject.put("method", str6);
                    jSONObject.put("old_value", z3 ? 1 : 0);
                    jSONObject.put("new_value", z4 ? 1 : 0);
                    jSONObject.put("is_same", z3 == z4 ? 1 : 0);
                    C185100nR.LIZIZ(C185100nR.LIZ, "config_diff", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportConfigDiff$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportConfigDiff$1");
                }
            });
        }
    }

    @Override // X.C1207210hWJ
    public final void LJJIFFI(final String str, final String str2, final boolean z, final String str3, final Integer num) {
        C185100nR c185100nR = C185100nR.LIZ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportPopupShowingStatus");
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZJ("SdkMonitorWrapper", "reportPopupShowingStatus, not initialized", null);
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nY
                public final /* synthetic */ String LL = "request_location_permission";

                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str4 = this.LL;
                    boolean z2 = z;
                    Integer num2 = num;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    jSONObject.put(Scene.SCENE_SERVICE, str4);
                    jSONObject.put("has_popup_showing", z2);
                    if (num2 != null) {
                        jSONObject.put("err_code", num2.intValue());
                    }
                    if (str5 != null) {
                        jSONObject.put("err_msg", str5);
                    }
                    if (str6 != null) {
                        jSONObject.put("element_label", str6);
                    }
                    if (str7 != null) {
                        jSONObject.put("trigger_id", str7);
                    }
                    C185100nR.LIZIZ(C185100nR.LIZ, "popup_task_status", jSONObject, null, 12);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportPopupTaskStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportPopupTaskStatus$1");
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [X.0hXk, X.0hXl] */
    public final void LJJJLZIJ(final Activity activity, final String[] strArr, final Cert cert, InterfaceC1208110hXl interfaceC1208110hXl, C12Q8 c12q8) throws JSONException {
        EnumC2192761Arq enumC2192761Arq;
        String strLIZ;
        C1208350hY9 c1208350hY9;
        Pair pair;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestPermissions: ");
        sbLIZ.append(cert);
        sbLIZ.append(' ');
        sbLIZ.append(strArr);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final C1208160hXq c1208160hXqLIZ = LIZLLL.LIZ(cert);
        if (c1208160hXqLIZ == null || (enumC2192761Arq = c1208160hXqLIZ.LJ) == null) {
            enumC2192761Arq = EnumC2192761Arq.Active;
        }
        String strCertToken = cert.certToken();
        String str = "unknown";
        if (strCertToken == null) {
            strCertToken = "unknown";
        }
        LJJJLIIL(LJJJ(enumC2192761Arq), strCertToken, "system", "biz");
        C12QB c12qb = null;
        if (LJIIIZ.get() && LJJJIL() != null) {
            if (!LJJJJL(cert)) {
                C1798620wuC.LIZJ("LocationController", "requestPermissions: cert invalid", null);
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str2 : strArr) {
                    arrayList.add(new Pair(str2, EnumC1207930hXT.CertInvalid));
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                ((C1207880hXO) interfaceC1208110hXl).LIZIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                String strCertToken2 = cert.certToken();
                if (strCertToken2 != null) {
                    str = strCertToken2;
                }
                int iLJJJ = LJJJ(enumC2192761Arq);
                getClass();
                LJJJJZ(iLJJJ, -2001, jUptimeMillis2, jUptimeMillis2, str, "system", "fail", "cert_invalid", "biz");
                return;
            }
            C1208420hYG c1208420hYGLJJJIL = LJJJIL();
            if (c1208420hYGLJJJIL == null) {
                return;
            }
            int iLIZIZ = c1208420hYGLJJJIL.LIZIZ(cert);
            if (iLIZIZ != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("requestPermissions: not allowed by freqManager, result=");
                sbLIZ2.append(iLIZIZ);
                C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ2), null);
                ArrayList arrayList2 = new ArrayList(strArr.length);
                for (String str3 : strArr) {
                    arrayList2.add(new Pair(str3, EnumC1207930hXT.OverLimit));
                }
                Pair[] pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
                ((C1207880hXO) interfaceC1208110hXl).LIZIZ((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (iLIZIZ == 1 || iLIZIZ != 2) {
                    pair = new Pair(-3001, "global_over_limit");
                } else {
                    pair = new Pair(-3002, "cert_over_limit");
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                String str4 = (String) pair.getSecond();
                String strCertToken3 = cert.certToken();
                if (strCertToken3 != null) {
                    str = strCertToken3;
                }
                int iLJJJ2 = LJJJ(enumC2192761Arq);
                getClass();
                LJJJJZ(iLJJJ2, iIntValue, jUptimeMillis3, jUptimeMillis3, str, "system", "fail", str4, "biz");
                return;
            }
            C185100nR c185100nR = C185100nR.LIZ;
            String strCertToken4 = cert.certToken();
            if (c1208160hXqLIZ != null) {
                strLIZ = c1208160hXqLIZ.LIZ();
            } else {
                strLIZ = null;
            }
            C185100nR.LJ(strCertToken4, strLIZ);
            if (c1208160hXqLIZ != null) {
                final C1207880hXO c1207880hXO = (C1207880hXO) interfaceC1208110hXl;
                final ?? r5 = new InterfaceC1208110hXl() { // from class: X.0hXk
                    public long LIZ;

                    @Override // X.InterfaceC1208110hXl
                    public final void LIZ(C1208240hXy c1208240hXy) {
                        C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("requestPermissions: onRequest ");
                        sbLIZ3.append(c1208240hXy);
                        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ3));
                        this.LIZ = SystemClock.uptimeMillis();
                        c1207880hXO.LIZ(c1208240hXy);
                    }

                    @Override // X.InterfaceC1208110hXl
                    public final void LIZIZ(Pair<String, ? extends EnumC1207930hXT>... pairArr3) {
                        C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("requestPermissions: onResult ");
                        sbLIZ3.append(pairArr3);
                        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ3));
                        long j = this.LIZ;
                        long j2 = 0;
                        if (j > 0) {
                            j2 = j - jUptimeMillis;
                        }
                        long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                        C1208130hXn c1208130hXn = C1208130hXn.LIZJ;
                        String strCertToken5 = cert.certToken();
                        if (strCertToken5 == null) {
                            strCertToken5 = "unknown";
                        }
                        EnumC2192761Arq enumC2192761Arq2 = c1208160hXqLIZ.LJ;
                        c1208130hXn.getClass();
                        int iLJJJ3 = C1208130hXn.LJJJ(enumC2192761Arq2);
                        c1208130hXn.getClass();
                        C1208130hXn.LJJJJZ(iLJJJ3, 0, j2, jUptimeMillis4, strCertToken5, "system", "success", null, "biz");
                        c1207880hXO.LIZIZ((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                    }
                };
                if (c12q8 != null) {
                    C1798620wuC.LIZIZ("LocationController", "requestPermissions: showRationaleDialog");
                    C1208130hXn c1208130hXn = LIZJ;
                    final C1208350hY9 c1208350hY92 = c1208160hXqLIZ.LIZ;
                    final EnumC2192761Arq enumC2192761Arq2 = c1208160hXqLIZ.LJ;
                    c1208130hXn.getClass();
                    if (c1208350hY92.LIZ()) {
                        c1208350hY9 = c1208350hY92;
                        c12qb = new C12QB() { // from class: X.0hYB
                            @Override // X.C12QB
                            public final String LIZIZ() {
                                return null;
                            }

                            @Override // X.C12QB
                            public final void LIZ() {
                                if (c1208350hY92.LIZ()) {
                                    C1208130hXn c1208130hXn2 = C1208130hXn.LIZJ;
                                    Activity activity2 = activity;
                                    String[] strArr2 = strArr;
                                    Cert cert2 = cert;
                                    EnumC2192761Arq enumC2192761Arq3 = enumC2192761Arq2;
                                    InterfaceC1208110hXl interfaceC1208110hXl2 = r5;
                                    c1208130hXn2.getClass();
                                    C1208130hXn.LJJJZ(activity2, cert2, interfaceC1208110hXl2, enumC2192761Arq3, strArr2);
                                }
                            }

                            @Override // X.C12QB
                            public final C12QJ type() {
                                return C12QJ.OK;
                            }
                        };
                    } else {
                        c1208350hY9 = c1208350hY92;
                    }
                    if (c1208350hY9.LIZ == EnumC1216870hlt.Cover) {
                        c12q8.LIZJ(c1208350hY9.LIZIZ, c1208350hY9.LIZJ, c12qb, null, null, null);
                        String strCertToken5 = cert.certToken();
                        if (strCertToken5 != null) {
                            str = strCertToken5;
                        }
                        LJJJJLL(LJJJ(enumC2192761Arq2), str, "rationale_cover");
                        LJJJZ(activity, cert, r5, enumC2192761Arq2, strArr);
                        return;
                    }
                    if (c1208350hY9.LIZ()) {
                        c12q8.LIZJ(c1208350hY9.LIZIZ, c1208350hY9.LIZJ, c12qb, null, null, null);
                        String strCertToken6 = cert.certToken();
                        if (strCertToken6 != null) {
                            str = strCertToken6;
                        }
                        LJJJJLL(LJJJ(enumC2192761Arq2), str, "rationale_dialog");
                        return;
                    }
                    LJJJZ(activity, cert, r5, enumC2192761Arq2, strArr);
                    return;
                }
                C1798620wuC.LIZIZ("LocationController", "requestPermissions: requestPermissions directly");
                C1208130hXn c1208130hXn2 = LIZJ;
                EnumC2192761Arq enumC2192761Arq3 = c1208160hXqLIZ.LJ;
                c1208130hXn2.getClass();
                LJJJZ(activity, cert, r5, enumC2192761Arq3, strArr);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("requestPermissions: no permission config for ");
            sbLIZ3.append(cert.certToken());
            C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ3), null);
            long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
            String strCertToken7 = cert.certToken();
            if (strCertToken7 != null) {
                str = strCertToken7;
            }
            int iLJJJ3 = LJJJ(enumC2192761Arq);
            getClass();
            LJJJJZ(iLJJJ3, -2003, jUptimeMillis4, jUptimeMillis4, str, "system", "fail", "no_permission_config", "biz");
            return;
        }
        C1798620wuC.LIZJ("LocationController", "requestPermissions: controller not initialized", null);
        ArrayList arrayList3 = new ArrayList(strArr.length);
        for (String str5 : strArr) {
            arrayList3.add(new Pair(str5, EnumC1207930hXT.NotInitialized));
        }
        Pair[] pairArr3 = (Pair[]) arrayList3.toArray(new Pair[0]);
        ((C1207880hXO) interfaceC1208110hXl).LIZIZ((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
        Pair pairLJJIL = LJJIL();
        int iIntValue2 = ((Number) pairLJJIL.getFirst()).intValue();
        String str6 = (String) pairLJJIL.getSecond();
        long jUptimeMillis5 = SystemClock.uptimeMillis() - jUptimeMillis;
        String strCertToken8 = cert.certToken();
        if (strCertToken8 != null) {
            str = strCertToken8;
        }
        int iLJJJ4 = LJJJ(enumC2192761Arq);
        getClass();
        LJJJJZ(iLJJJ4, iIntValue2, jUptimeMillis5, jUptimeMillis5, str, "system", "fail", str6, "biz");
    }

    public static C12Q8 LJJL(Activity activity, C1208170hXr c1208170hXr, String str, Cert cert, EnumC2192761Arq enumC2192761Arq, long j, InterfaceC1207170hWF interfaceC1207170hWF, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = c1208170hXr.LIZ(activity, EnumC1208400hYE.InAppPromote, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolvePromoteDialogOrFail: dialog unavailable, dialogName=");
            sbLIZ.append(str);
            C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            LIZJ.getClass();
            LJJIIJZLJL(-2006, j, cert, interfaceC1207170hWF, C1207290hWR.LIZ(EnumC1207420hWe.InApp), EnumC1207930hXT.InnerPopupFailed, enumC2192761Arq, "fail", "dialog_unavailable", "dialog unavailable", str2);
            c098200Yq = null;
        }
        return (C12Q8) c098200Yq;
    }

    public static C12Q8 LJJLI(Activity activity, C1208170hXr c1208170hXr, EnumC1208400hYE enumC1208400hYE, String str, Cert cert, EnumC2192761Arq enumC2192761Arq, long j, C1207200hWI c1207200hWI) {
        Object c098200Yq;
        try {
            c098200Yq = c1208170hXr.LIZ(activity, enumC1208400hYE, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveSystemPromoteDialogOrFail: dialog unavailable, target=");
            sbLIZ.append(enumC1208400hYE);
            sbLIZ.append(", dialogName=");
            sbLIZ.append(str);
            C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            C1208130hXn c1208130hXn = LIZJ;
            c1208130hXn.getClass();
            c1208130hXn.LJJIIZI(-2006, j, cert, c1207200hWI, C1207290hWR.LIZ(EnumC1207420hWe.System), EnumC1207930hXT.InnerPopupFailed, enumC2192761Arq, "system_conversion", "dialog_unavailable", "dialog unavailable");
            c098200Yq = null;
        }
        return (C12Q8) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJZ(int r9, int r10, long r11, long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208130hXn.LJJJJZ(int, int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void LJJIIZI(int i, long j, Cert cert, C1207200hWI c1207200hWI, C1208000hXa c1208000hXa, EnumC1207930hXT enumC1207930hXT, EnumC2192761Arq enumC2192761Arq, String str, String str2, String str3) {
        String strInvoke;
        Function0<String> function0;
        c1207200hWI.LIZIZ(c1208000hXa);
        if (enumC1207930hXT != null) {
            C185100nR c185100nR = C185100nR.LIZ;
            EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.SystemPromote;
            EnumC1207420hWe enumC1207420hWe = EnumC1207420hWe.System;
            String strCertToken = cert.certToken();
            LIZJ.getClass();
            C1208210hXv c1208210hXvLJJJI = LJJJI();
            if (c1208210hXvLJJJI != null && (function0 = c1208210hXvLJJJI.LJIIJ) != null) {
                strInvoke = function0.invoke();
            } else {
                strInvoke = null;
            }
            C185100nR.LJIILJJIL(enumC1207420hWe, enumC1207930hXT, enumC1208400hYE, null, null, strCertToken, strInvoke, str3);
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        String strCertToken2 = cert.certToken();
        if (strCertToken2 == null) {
            strCertToken2 = "unknown";
        }
        int iLJJJ = LJJJ(enumC2192761Arq);
        getClass();
        LJJJJZ(iLJJJ, i, jUptimeMillis, jUptimeMillis, strCertToken2, str, "fail", str2, "biz");
    }

    public static void LJJIIJZLJL(int i, long j, Cert cert, InterfaceC1207170hWF interfaceC1207170hWF, C1208000hXa c1208000hXa, EnumC1207930hXT enumC1207930hXT, EnumC2192761Arq enumC2192761Arq, String str, String str2, String str3, String str4) {
        String strCertToken;
        String strCertToken2;
        String strInvoke;
        Function0<String> function0;
        interfaceC1207170hWF.LIZIZ(c1208000hXa);
        String str5 = "unknown";
        if (enumC1207930hXT != null) {
            C185100nR c185100nR = C185100nR.LIZ;
            EnumC1208400hYE enumC1208400hYE = EnumC1208400hYE.InAppPromote;
            EnumC1207420hWe enumC1207420hWe = EnumC1207420hWe.InApp;
            if (cert == null || (strCertToken2 = cert.certToken()) == null) {
                strCertToken2 = "unknown";
            }
            LIZJ.getClass();
            C1208210hXv c1208210hXvLJJJI = LJJJI();
            if (c1208210hXvLJJJI != null && (function0 = c1208210hXvLJJJI.LJIIJ) != null) {
                strInvoke = function0.invoke();
            } else {
                strInvoke = null;
            }
            C185100nR.LJIILJJIL(enumC1207420hWe, enumC1207930hXT, enumC1208400hYE, null, null, strCertToken2, strInvoke, str3);
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (cert != null && (strCertToken = cert.certToken()) != null) {
            str5 = strCertToken;
        }
        LJJJJZ(LJJJ(enumC2192761Arq), i, jUptimeMillis, jUptimeMillis, str5, "in_app_conversion", str, str2, str4);
    }
}
