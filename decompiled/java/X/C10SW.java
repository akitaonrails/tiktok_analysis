package X;

import Y.ARunnableS0S0010000_12;
import Y.ARunnableS7S1000000_12;
import Y.ARunnableS81S0200000_12;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10SW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SW {
    public static final C10SW LIZ = new C10SW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C10TA());
    public static final List<InterfaceC19251310Tf> LIZJ;
    public static final List<C10TR> LIZLLL;
    public static Uri LJ;
    public static EnumC993850byB LJFF;
    public static EnumC993850byB LJI;
    public static EnumC993850byB LJII;
    public static EnumC993850byB LJIIIIZZ;
    public static String LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static final C01GW LJIILIIL;
    public static final C01GW LJIILJJIL;
    public static String LJIILL;
    public static String LJIILLIIL;

    public final void LJIIIIZZ() {
        getClass();
        LJIIL(null, "open_link_success", null);
    }

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZJ = new ArrayList(c13bv);
        LIZLLL = new ArrayList(c13bv);
        EnumC993850byB enumC993850byB = EnumC993850byB.NOT_RECV;
        LJFF = enumC993850byB;
        LJI = enumC993850byB;
        LJII = enumC993850byB;
        LJIIIIZZ = enumC993850byB;
        LJIILIIL = C452501pT.LIZIZ(new C739980T0y());
        LJIILJJIL = C452501pT.LIZIZ(new C739990T0z());
        LJIILL = "";
        LJIILLIIL = "";
    }

    public static String LIZJ() {
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C10TR) next).LIZ == C0TCO.AF_LINK) {
                if (next != null) {
                    return C0TCO.AF_LINK.getDesc();
                }
            }
        }
        Iterator it3 = ((ArrayList) LIZLLL).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((C10TR) next2).LIZ == C0TCO.GG_LINK) {
                if (next2 != null) {
                    return C0TCO.GG_LINK.getDesc();
                }
            }
        }
        Iterator it4 = ((ArrayList) LIZLLL).iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            if (((C10TR) next3).LIZ == C0TCO.LONG_LINK) {
                if (next3 != null) {
                    return C0TCO.LONG_LINK.getDesc();
                }
            }
        }
        Iterator it5 = ((ArrayList) LIZLLL).iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            if (((C10TR) next4).LIZ == C0TCO.SHORT_LINK) {
                return next4 != null ? C0TCO.SHORT_LINK.getDesc() : "not_link";
            }
        }
        return "not_link";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:16:0x0027, B:18:0x0035, B:20:0x0042, B:23:0x004c, B:30:0x005b, B:46:0x00a3, B:48:0x00b5, B:50:0x00bf, B:51:0x00c3, B:54:0x00cb, B:55:0x00cf, B:57:0x00d7, B:35:0x0065, B:37:0x0071, B:40:0x0079, B:42:0x0097), top: B:62:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.net.Uri r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10SW.LIZIZ(android.net.Uri):java.lang.String");
    }

    public static void LIZLLL(String str) {
        Uri uri;
        Object next;
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        C01GW c01gw = LJIILIIL;
        if (((Map) c01gw.getValue()).containsKey(str)) {
            return;
        }
        ((Map) c01gw.getValue()).put(str, Boolean.TRUE);
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (true) {
            uri = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C10TR) next).LIZ == C0TCO.AF_LINK) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C10TR c10tr = (C10TR) next;
        if (c10tr != null) {
            uri = c10tr.LIZIZ;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("deferred_type", "appsflyer");
        c2344009Gk.LJIIIIZZ("event_type", str);
        c2344009Gk.LJIIIIZZ("origin_url", String.valueOf(uri));
        c2344009Gk.LJIIIIZZ("host_path", LIZIZ(uri));
        LJI(c2344009Gk, "deferred_link_track_event");
    }

    public static void LJ(String str) {
        if (((ArrayList) LIZLLL).isEmpty()) {
            return;
        }
        ARunnableS7S1000000_12 aRunnableS7S1000000_12 = new ARunnableS7S1000000_12(str, 6);
        if (C19266010Yw.LIZ()) {
            C20684815ws.LJFF().execute(aRunnableS7S1000000_12);
        } else {
            aRunnableS7S1000000_12.run();
        }
    }

    public static void LJFF(String str) {
        Uri uri;
        Object next;
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        C01GW c01gw = LJIILJJIL;
        if (((Map) c01gw.getValue()).containsKey(str)) {
            return;
        }
        ((Map) c01gw.getValue()).put(str, Boolean.TRUE);
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (true) {
            uri = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C10TR) next).LIZ == C0TCO.GG_LINK) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C10TR c10tr = (C10TR) next;
        if (c10tr != null) {
            uri = c10tr.LIZIZ;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("deferred_type", "google_ads");
        c2344009Gk.LJIIIIZZ("event_type", str);
        c2344009Gk.LJIIIIZZ("origin_url", String.valueOf(uri));
        c2344009Gk.LJIIIIZZ("host_path", LIZIZ(uri));
        LJI(c2344009Gk, "deferred_link_track_event");
    }

    public static void LJIIJJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_type", str);
        LJI(c2344009Gk, "referrer_link_track_event");
    }

    public static Uri LJIIZILJ(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String host = uri.getHost();
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (path.length() > 0) {
            Regex regex = new Regex("/\\d+");
            if (regex.containsMatchIn(path)) {
                path = regex.replace(path, "/number");
            }
        }
        Uri uriBuild = uri.buildUpon().path(path).build();
        if (host != null) {
            if ((a0.LJJIIZI(host, "webview", false) || a0.LJJIIZI(host, "lynxview", false)) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                return UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            return uriBuild;
        }
        return uriBuild;
    }

    public final void LJII(Uri uri) {
        LJ = uri;
        getClass();
        LJIIL(null, "open_deeplink", null);
    }

    public final void LJIIJ(String str) {
        if (((ArrayList) LIZLLL).isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        getClass();
        LJIIL(null, strLIZIZ, null);
    }

    public static void LJI(C2344009Gk c2344009Gk, String str) {
        String str2;
        if (C10OE.LIZ) {
            if (C10OE.LIZIZ) {
                str2 = "v1";
            } else {
                str2 = "v0";
            }
            c2344009Gk.LJFF("deeplink_strategy_version", str2);
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) LIZIZ.getValue();
        if (iNewUserDebugService != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", params: ");
            Map<String, String> map = c2344009Gk.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                if (!a0.LJJIIZI((CharSequence) entry.getKey(), "origin", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sb.append(linkedHashMap);
            iNewUserDebugService.LJI("link_track", sb.toString());
        }
        C19249910Sr.LIZIZ.LIZIZ(c2344009Gk, str);
    }

    public static void LJIIIZ(Uri uri, C0TCO c0tco) {
        String string;
        try {
            string = URLDecoder.decode(uri.toString(), "UTF-8");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            string = uri.toString();
        }
        C1869890yl9.LIZJ(string);
        Iterator<String> it2 = UriProtector.getQueryParameters(uri, "media_source").iterator();
        while (it2.hasNext()) {
            C1869890yl9.LIZIZ(it2.next());
        }
        C0TCO c0tco2 = C0TCO.LONG_LINK;
        if (c0tco == c0tco2 || c0tco == C0TCO.SHORT_LINK) {
            if (!C1514430pVp.LIZLLL().booleanValue() && ((IAwemeApplicationService) ServiceManager.get().getService(IAwemeApplicationService.class)).isAppHot()) {
                return;
            }
            if (C1514430pVp.LIZLLL().booleanValue() && C19254610Um.LIZIZ.LJJIJIIJI() != 1) {
                return;
            }
        }
        if (c0tco == C0TCO.SHORT_LINK) {
            LJII = EnumC993850byB.RECV_LINK;
        }
        if (c0tco == c0tco2) {
            LJIIIIZZ = EnumC993850byB.RECV_LINK;
        }
        Iterator it3 = ((ArrayList) LIZLLL).iterator();
        boolean z = false;
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(LIZIZ(uri), LIZIZ(((C10TR) it3.next()).LIZIZ))) {
                z = true;
            }
        }
        ((ArrayList) LIZLLL).add(new C10TR(uri, c0tco));
        for (InterfaceC19251310Tf interfaceC19251310Tf : (ArrayList) LIZJ) {
            c0tco.getDesc();
            interfaceC19251310Tf.LIZ();
        }
        C010O.LIZ = uri;
        c0tco.getDesc();
        if (!z) {
            UGStrategyTriggerAbility.LJI().LIZLLL();
            IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI = UGStrategyTriggerAbility.LJI();
            if (iUGStrategyTriggerAbilityLJI != null) {
                iUGStrategyTriggerAbilityLJI.LIZ("link_start");
            }
        }
        ARunnableS81S0200000_12 aRunnableS81S0200000_12 = new ARunnableS81S0200000_12(uri, c0tco, 110);
        if (C19266010Yw.LIZ()) {
            C20684815ws.LJFF().execute(aRunnableS81S0200000_12);
        } else {
            aRunnableS81S0200000_12.run();
        }
    }

    public static void LJIILJJIL(boolean z, Uri uri) {
        for (Object obj : (ArrayList) LIZLLL) {
            if (Intrinsics.LJFF(((C10TR) obj).LIZIZ.toString(), uri.toString())) {
                if (obj != null) {
                    ARunnableS0S0010000_12 aRunnableS0S0010000_12 = new ARunnableS0S0010000_12(z, 1);
                    if (C19266010Yw.LIZ()) {
                        C20684815ws.LJFF().execute(aRunnableS0S0010000_12);
                        return;
                    } else {
                        aRunnableS0S0010000_12.run();
                        return;
                    }
                }
                return;
            }
        }
    }

    public static void LJIILL(boolean z, Uri uri) {
        for (Object obj : (ArrayList) LIZLLL) {
            if (Intrinsics.LJFF(((C10TR) obj).LIZIZ.toString(), uri.toString())) {
                if (obj != null) {
                    ARunnableS0S0010000_12 aRunnableS0S0010000_12 = new ARunnableS0S0010000_12(z, 2);
                    if (C19266010Yw.LIZ()) {
                        C20684815ws.LJFF().execute(aRunnableS0S0010000_12);
                        return;
                    } else {
                        aRunnableS0S0010000_12.run();
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0319, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C10SW.LJIIIZ, java.lang.String.valueOf(X.C10SW.LJ)) != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x031b, code lost:
    
        r11 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.Boolean r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10SW.LJIIL(java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public static void LJIILLIIL(Uri uri, String str, boolean z) {
        for (Object obj : (ArrayList) LIZLLL) {
            if (Intrinsics.LJFF(((C10TR) obj).LIZIZ.toString(), uri.toString())) {
                if (obj != null) {
                    LJIIIZ = str;
                    ARunnableS0S0010000_12 aRunnableS0S0010000_12 = new ARunnableS0S0010000_12(z, 0);
                    if (C19266010Yw.LIZ()) {
                        C20684815ws.LJFF().execute(aRunnableS0S0010000_12);
                        return;
                    } else {
                        aRunnableS0S0010000_12.run();
                        return;
                    }
                }
                return;
            }
        }
    }

    public static void LIZ(String str, String str2, Map map, boolean z) {
        int i;
        int i2;
        try {
            String str3 = (String) map.get("referrer_click_time_server");
            int i3 = 0;
            if (str3 != null) {
                i = CastIntegerProtector.parseInt(str3);
            } else {
                i = 0;
            }
            String str4 = (String) map.get("referer_click_time");
            if (str4 != null) {
                i2 = CastIntegerProtector.parseInt(str4);
            } else {
                i2 = 0;
            }
            int iLIZ = C0XK4.LIZ();
            int i4 = iLIZ - i;
            int i5 = iLIZ - i2;
            if (i4 < 0) {
                i4 = -1;
            }
            if (i5 < 0) {
                i5 = -1;
            }
            C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z) {
                i3 = 1;
            }
            c2344009Gk.LIZJ(i3, "is_use_gp_referrer");
            C10SW c10sw = LIZ;
            Uri uri = UriProtector.parse(str);
            c10sw.getClass();
            c2344009Gk.LJIIIIZZ("af_host_path", LIZIZ(uri));
            c2344009Gk.LJIIIIZZ("af_origin_url", str);
            c2344009Gk.LJIIIIZZ("gp_referrer_host_path", LIZIZ(UriProtector.parse(str2)));
            c2344009Gk.LJIIIIZZ("gp_referrer_origin_url", str2);
            c2344009Gk.LIZJ(i4, "time_diff_server");
            c2344009Gk.LIZJ(i5, "time_diff");
            c19249910Sr.LIZIZ(c2344009Gk, "analysis_gp_referrer_event");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
