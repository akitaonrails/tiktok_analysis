package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.incentive.track.IncentiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.interfaces.IConfigService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893790zNh {
    public static String LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static int LJFF;
    public static String LJI;
    public static InterfaceC1893800zNi LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static boolean LJIIL;
    public static String LJIILIIL;
    public static String LJIILJJIL;
    public static Function0<Unit> LJIILL;
    public static Function0<Unit> LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final C1893790zNh LIZ = new C1893790zNh();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("tiktok_now_share", "now_feature_share", "referral");
    public static final List<String> LJIJ = new ArrayList();
    public static final List<Long> LJIJI = new ArrayList();

    public static String LJI() {
        C1893780zNg c1893780zNg = C1893780zNg.LIZIZ;
        return (c1893780zNg == null || !c1893780zNg.isLogin()) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public static void LJII() {
        InterfaceC1893800zNi interfaceC1893800zNi = LJII;
        if (interfaceC1893800zNi != null) {
            interfaceC1893800zNi.LIZ("onelink_flow", C2097608Jq.LJIIJ(new Pair("inc_id", LIZJ), new Pair("event_flow", LJIJ.toString()), new Pair("events_time_interval", LJIJI.toString()), new Pair("inc_is_first_launch", String.valueOf(LJFF))));
        }
        ((ArrayList) LJIJ).clear();
        ((ArrayList) LJIJI).clear();
    }

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (a0.LJJIIZI(str, "referral_onelink_", false) || LIZIZ.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        Object c098200Yq;
        Object obj;
        if (str == null) {
            return true;
        }
        try {
            Uri uri = UriProtector.parse(str);
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "media_source");
            if (c098200Yq == null && (c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pid")) == null) {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inc_pid");
            }
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = null;
        }
        String strLIZLLL = (String) obj;
        if (strLIZLLL == null || strLIZLLL.length() == 0) {
            strLIZLLL = LIZLLL(str);
        }
        if (str.length() > 0 && LIZ(strLIZLLL)) {
            return true;
        }
        return false;
    }

    public static Map LIZJ(C1893790zNh c1893790zNh) {
        String str;
        c1893790zNh.getClass();
        String str2 = LIZJ;
        if (str2 != null && str2.length() != 0 && LIZIZ(null)) {
            ((ArrayList) LJIJ).add("touch_point_show");
            long jElapsedRealtime = SystemClock.elapsedRealtime() - LIZLLL;
            ((ArrayList) LJIJI).add(Long.valueOf(jElapsedRealtime));
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("inc_id", LIZJ);
            pairArr[1] = new Pair("inc_duration", String.valueOf(jElapsedRealtime));
            pairArr[2] = new Pair("inc_region", LJI);
            pairArr[3] = new Pair("inc_is_first_launch", String.valueOf(LJFF));
            pairArr[4] = new Pair("inc_url", null);
            pairArr[5] = new Pair("inc_pid", LJIIIZ);
            pairArr[6] = new Pair("inc_path", LJIIJ);
            pairArr[7] = new Pair("inc_is_login", LJI());
            pairArr[8] = new Pair("inc_source", LJIIJJI);
            if (LJIIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[9] = new Pair("inc_new_user", str);
            pairArr[10] = new Pair("utm_source", LJIILIIL);
            pairArr[11] = new Pair("wid", LJIILJJIL);
            pairArr[12] = new Pair("first_install_duration", String.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - LJ));
            return C2097608Jq.LJIIJ(pairArr);
        }
        return new LinkedHashMap();
    }

    public static String LIZLLL(String str) {
        boolean z;
        Object obj = null;
        try {
            LIZ.getClass();
            String strLJIILIIL = LJIILIIL(str);
            String strLJ = LJ(str);
            boolean z2 = true;
            if (strLJ.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                strLJ = null;
            }
            if (strLJ == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                strLJ = LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            if (strLJ.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                return strLJ;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIILIIL), "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIILIIL), "surl");
            }
            Uri uri = UriProtector.parse(Uri.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pid");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inc_pid");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    return "";
                }
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            Object obj2 = (Void) obj;
            if (obj2 == null || C189200o6.m5exceptionOrNullimpl(((C189200o6) obj2).m10unboximpl()) != null) {
                return "";
            }
            throw new C2197108jB();
        }
    }

    public static String LJ(String str) {
        Object c098200Yq;
        boolean z;
        boolean z2;
        Object obj = null;
        try {
            LIZ.getClass();
            Uri uri = UriProtector.parse(LJIILIIL(str));
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "media_source");
                if (c098200Yq == null && (c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pid")) == null) {
                    c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inc_pid");
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
            String str2 = (String) c098200Yq;
            boolean z3 = false;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return str2;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                Uri uri2 = UriProtector.parse(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "utf-8"));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "media_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "pid")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "inc_pid");
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pid");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inc_pid");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    return "";
                }
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Object obj2 = (Void) obj;
            if (obj2 == null || C189200o6.m5exceptionOrNullimpl(((C189200o6) obj2).m10unboximpl()) != null) {
                return "";
            }
            throw new C2197108jB();
        }
    }

    public static String LJFF(String str) {
        String host;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String path;
        Uri uri = UriProtector.parse(str);
        String host2 = uri.getHost();
        if (((host2 == null || !a0.LJJIIZI(host2, "webview", false)) && ((host = uri.getHost()) == null || !a0.LJJIIZI(host, "lynxview", false))) || (((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl")) == null) || (path = UriProtector.parse(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "utf-8")).getPath()) == null)) {
            return "";
        }
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJIILIIL(String str) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = str;
        C01U6.LIZIZ(new AwS175S1100000_26(str, (String) c259800zU, (C259800zU<String>) 7));
        return (String) c259800zU.element;
    }

    public static void LJIIIZ(String str, InterfaceC1893800zNi interfaceC1893800zNi) {
        LJI = str;
        LJII = interfaceC1893800zNi;
        IConfigService iConfigService = (IConfigService) PluggableExtentionKt.pluggableSpi$default(IConfigService.class, false, false, false, 14, null);
        if (iConfigService != null) {
            iConfigService.LIZLLL();
        }
    }

    public static void LJIIL(String str, C1893840zNm c1893840zNm) {
        long jLJIIJJI;
        String str2;
        if (LIZIZ(str)) {
            C1893780zNg c1893780zNg = C1893780zNg.LIZIZ;
            if (c1893780zNg != null) {
                jLJIIJJI = c1893780zNg.LJIIJJI();
            } else {
                jLJIIJJI = 0;
            }
            Pair[] pairArr = new Pair[10];
            pairArr[0] = new Pair("inc_duration", String.valueOf(System.currentTimeMillis() - jLJIIJJI));
            pairArr[1] = new Pair("inc_url", str);
            pairArr[2] = new Pair("inc_pid", LIZLLL(str));
            pairArr[3] = new Pair("inc_path", LJFF(str));
            pairArr[4] = new Pair("inc_is_login", LJI());
            pairArr[5] = new Pair("inc_source", LJIIJJI);
            if (LJIIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[6] = new Pair("inc_new_user", str2);
            pairArr[7] = new Pair("utm_source", LJIILIIL);
            pairArr[8] = new Pair("wid", LJIILJJIL);
            pairArr[9] = new Pair("first_install_duration", String.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - LJ));
            c1893840zNm.LIZ("inc_activity_deep_link_receive", C2097608Jq.LJIIJ(pairArr));
        }
    }

    public static void LJIIJ(String str, String str2, Map map) {
        String str3;
        Object c098200Yq;
        String str4 = LIZJ;
        if (str4 != null && str4.length() != 0 && LIZIZ(str2)) {
            ((ArrayList) LJIJ).add(str);
            ((ArrayList) LJIJI).add(Long.valueOf(SystemClock.elapsedRealtime() - LIZLLL));
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("inc_id", LIZJ);
            pairArr[1] = new Pair("inc_duration", String.valueOf(SystemClock.elapsedRealtime() - LIZLLL));
            pairArr[2] = new Pair("inc_region", LJI);
            pairArr[3] = new Pair("inc_is_first_launch", String.valueOf(LJFF));
            pairArr[4] = new Pair("inc_url", str2);
            pairArr[5] = new Pair("inc_pid", LJIIIZ);
            pairArr[6] = new Pair("inc_path", LJIIJ);
            pairArr[7] = new Pair("inc_is_login", LJI());
            pairArr[8] = new Pair("inc_source", LJIIJJI);
            if (LJIIL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[9] = new Pair("inc_new_user", str3);
            pairArr[10] = new Pair("utm_source", LJIILIIL);
            pairArr[11] = new Pair("wid", LJIILJJIL);
            pairArr[12] = new Pair("first_install_duration", String.valueOf((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - LJ));
            map.putAll(C2097608Jq.LJIIJ(pairArr));
            InterfaceC1893800zNi interfaceC1893800zNi = LJII;
            if (interfaceC1893800zNi != null) {
                interfaceC1893800zNi.LIZ(str, map);
            }
            InterfaceC1893800zNi interfaceC1893800zNi2 = LJII;
            if (interfaceC1893800zNi2 != null && interfaceC1893800zNi2.isDebug()) {
                IncentiveEvent incentiveEvent = new IncentiveEvent(str, C20484080s.LIZJ(map));
                List<IncentiveEvent> list = C1887710zDt.LIZ;
                ((ArrayList) list).add(incentiveEvent);
                ((Keva) C1887710zDt.LIZIZ.getValue()).storeString("event_stream", C20484080s.LIZJ(list));
            }
            if (Intrinsics.LJFF(str, "inc_activity_start")) {
                LJIIZILJ = false;
                if ((str2 != null || (str2 = LJIIIIZZ) != null) && str2.length() != 0) {
                    try {
                        Uri uri = UriProtector.parse(str2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        String host = uri.getHost();
                        String str5 = "";
                        if (host == null) {
                            host = "";
                        }
                        sbLIZ.append(host);
                        String path = uri.getPath();
                        if (path != null) {
                            str5 = path;
                        }
                        sbLIZ.append(str5);
                        c098200Yq = Boolean.valueOf(Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "incentive/general_pure_logic"));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    if (((Boolean) c098200Yq).booleanValue()) {
                        return;
                    }
                }
                Function0<Unit> function0 = LJIILL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1893790zNh.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
