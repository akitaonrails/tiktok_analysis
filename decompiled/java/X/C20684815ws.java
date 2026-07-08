package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.explore.track.IExploreMobTrackExtension;
import com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachMonitorServiceImpl;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService;
import com.ss.android.ugc.aweme.performanceopt.api.IAccessibilityEventTrackingService;
import com.ss.android.ugc.aweme.texttoimage.track.IText2ImageMobTrackExtension;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20684815ws {
    public static ExecutorService LIZ;
    public static volatile CopyOnWriteArrayList<InterfaceC20685415wy> LIZIZ;
    public static final Object LIZJ = new Object();
    public static volatile boolean LIZLLL;
    public static volatile C2189301AmG LJ;
    public static volatile C2184561Aec LJFF;

    static {
        new Random();
        LIZLLL = true;
    }

    public static ExecutorService LJFF() {
        if (LIZ == null) {
            synchronized (C20684815ws.class) {
                try {
                    if (LIZ == null) {
                        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
                        c2123408ToLIZ.LIZIZ = "EventUpload";
                        LIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LIZ(InterfaceC20685415wy interfaceC20685415wy) {
        if (!LIZLLL) {
            return;
        }
        if (LIZIZ == null) {
            synchronized (LIZJ) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new CopyOnWriteArrayList<>();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LIZIZ.add(interfaceC20685415wy);
    }

    public static boolean LJI(String str) {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.isDebug() || C2093608Ic.LIZJ(c2213981Bky.getChannel(), "local_test") || LJ == null) {
            return true;
        }
        if (((Boolean) C258880ACo.LIZ.getValue()).booleanValue()) {
            return !LJ.LIZ(LJFF, str, new JSONObject());
        }
        return LJ.LIZ(LJFF, str, new JSONObject());
    }

    public static void LJIJJLI(InterfaceC20685415wy interfaceC20685415wy) {
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.remove(interfaceC20685415wy);
    }

    public static void onEvent(MobClick mobClick) {
        if (C2213981Bky.LIZIZ.isDebug() && C2211941Bhg.LIZ.LIZLLL()) {
            return;
        }
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            try {
                LJIILJJIL(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtJson(), CastLongProtector.parseLong(mobClick.getExtValueStr()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            LJIILJJIL(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtJson(), mobClick.getExtValueLong());
        }
        mobClick.recycle();
    }

    public static void onEventV3(String str) {
        try {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            if (c2213981Bky.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) {
                return;
            }
            AppLogNewUtils.onEventV3(str, C20512115Od.LIZ.LIZIZ(str, new JSONObject()));
            c2213981Bky.isDebug();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (LIZLLL && LIZIZ != null) {
            Iterator<InterfaceC20685415wy> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onEvent(str);
            }
        }
    }

    public static void LIZIZ(String str, Map<String, String> map) {
        try {
            if (C2213981Bky.LIZIZ.LIZLLL()) {
                C2211941Bhg c2211941Bhg = C2211941Bhg.LIZ;
                if (c2211941Bhg.LIZLLL()) {
                    return;
                } else {
                    c2211941Bhg.addDebugInfo(map);
                }
            }
            JSONObject jSONObjectLIZIZ = C20512115Od.LIZ.LIZIZ(str, new JSONObject());
            if (jSONObjectLIZIZ == null) {
                jSONObjectLIZIZ = new JSONObject();
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObjectLIZIZ.put(entry.getKey(), entry.getValue());
                }
            }
            if (((Boolean) C282810B6p.LIZIZ.getValue()).booleanValue()) {
                AppLogNewUtils.LJFF(str, jSONObjectLIZIZ);
            } else {
                AppLogNewUtils.onEventV3(str, jSONObjectLIZIZ);
            }
            C2213981Bky.LIZIZ.isDebug();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJII(str, map);
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        String strJ3;
        C1770180wAK c1770180wAK = C1770180wAK.LIZ;
        c1770180wAK.getClass();
        if (jSONObject != null && Intrinsics.LJFF(str, "trending_words_show") && Intrinsics.LJFF(jSONObject.optString("words_source"), "comment_related_search") && C1202904nD.LIZ()) {
            String strOptString = jSONObject.optString("words_content");
            c1770180wAK.getClass();
            C1770180wAK.LIZIZ = strOptString;
        }
        try {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            if (c2213981Bky.LIZLLL()) {
                C2211941Bhg c2211941Bhg = C2211941Bhg.LIZ;
                if (!c2211941Bhg.LIZLLL()) {
                    c2211941Bhg.addDebugInfo(jSONObject);
                } else {
                    return;
                }
            }
            JSONObject jSONObjectLIZIZ = C20512115Od.LIZ.LIZIZ(str, jSONObject);
            AppLogNewUtils.onEventV3(str, jSONObjectLIZIZ);
            if (c2213981Bky.isDebug()) {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                if (jSONObject != null) {
                    strJ3 = C786410Ut5.J3(jSONObjectLIZIZ);
                } else {
                    strJ3 = "";
                }
                objArr[1] = strJ3;
                C786410Ut5.j4("onEventV3() called with: eventName:%s with params:%s", objArr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIIIZZ(str, jSONObject);
    }

    public static void LIZLLL(final String str, final Map map) {
        final EnumC2252111DCv enumC2252111DCv;
        String str2;
        if (((Boolean) C0BPT.LIZ.getValue()).booleanValue()) {
            IAccessibilityEventTrackingService iAccessibilityEventTrackingServiceLIZJ = AccessibilityEventTrackingService.LIZJ();
            if (((HashSet) C20545915aT.LIZ).contains(str) && map != null) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            if (C0BPR.LIZ() && C308190C6f.LIZIZ.contains(str) && (str2 = C308190C6f.LIZJ) != null && !TextUtils.isEmpty(str2)) {
                map.put("precise_exposure_vids", str2);
            }
            try {
                C20685015wu.LIZ(str, map);
                LIZIZ(str, map);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJFF(e2, "ExploreMobLancet onEventV3 exception");
            }
            if (C300610BqN.LIZ()) {
                C2252051DCp.LIZ.getClass();
                C2252051DCp.LJIIIZ(str, map);
                C01GW c01gw = C2252101DCu.LIZ;
                if (!TextUtils.isEmpty(str) && (enumC2252111DCv = C2252101DCu.LJ.get(str)) != null) {
                    C2252051DCp.LJFF().execute(new Runnable() { // from class: X.1DCr
                        /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ() {
                            /*
                                Method dump skipped, instruction units count: 215
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2252071DCr.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ConsumeManager@fa78.handleLancetEventV3$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ConsumeManager@fa78.handleLancetEventV3$2");
                        }
                    });
                }
                IOutreachMonitorService iOutreachMonitorServiceLIZ = OutreachMonitorServiceImpl.LIZ();
                if (iOutreachMonitorServiceLIZ != null) {
                    iOutreachMonitorServiceLIZ.onEventV3(str, (Map<String, String>) map);
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1AF0.LJFF(e3, "MobClickConsumeLancet onEventV3 exception");
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        String str2;
        if (((Boolean) C0BPT.LIZ.getValue()).booleanValue()) {
            IAccessibilityEventTrackingService iAccessibilityEventTrackingServiceLIZJ = AccessibilityEventTrackingService.LIZJ();
            if (((HashSet) C20545915aT.LIZ).contains(str) && jSONObject != null) {
                try {
                    jSONObject.put("a11y_setting_params", C786410Ut5.J3(iAccessibilityEventTrackingServiceLIZJ.LIZ()));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            if (C0BPR.LIZ() && C308190C6f.LIZIZ.contains(str) && jSONObject != null && (str2 = C308190C6f.LIZJ) != null && !TextUtils.isEmpty(str2)) {
                jSONObject.put("precise_exposure_vids", str2);
            }
            try {
                for (IExploreMobTrackExtension iExploreMobTrackExtension : (Set) C20685015wu.LIZ.getValue()) {
                    if (iExploreMobTrackExtension.LIZIZ(str, jSONObject)) {
                        iExploreMobTrackExtension.LIZJ(str, jSONObject);
                    }
                }
                LIZJ(str, jSONObject);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJFF(e2, "ExploreMobLancet onEventV3 exception");
            }
            C0QO9.LIZ(str, jSONObject);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1AF0.LJFF(e3, "MobClickConsumeLancet onEventV3 exception");
        }
    }

    public static void LJII(String str, Map<String, String> map) {
        if (LIZLLL && LIZIZ != null) {
            Iterator<InterfaceC20685415wy> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(str, map);
            }
        }
    }

    public static void LJIIIIZZ(String str, JSONObject jSONObject) {
        if (LIZLLL && LIZIZ != null) {
            Iterator<InterfaceC20685415wy> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onEvent(str, jSONObject);
            }
        }
    }

    public static void LJIILL(String str, Bundle bundle) {
        String string;
        try {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            if (c2213981Bky.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) {
                return;
            }
            C20512115Od.LIZ.LIZ(bundle);
            AppLogNewUtils.LJ(str, bundle);
            if (c2213981Bky.isDebug()) {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                if (bundle == null) {
                    string = "";
                } else {
                    string = bundle.toString();
                }
                objArr[1] = string;
                C786410Ut5.j4("onEventV3() called with: eventName:%s with params:%s", objArr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILLIIL(String str, Map map) {
        if (map != null) {
            try {
                C20685115wv.LIZ(str, map);
                try {
                    LIZLLL(str, map);
                    if (C1896740zSS.LJ.contains(str) && C1896740zSS.LIZ == null) {
                        C1896740zSS.LIZJ.put(str, map);
                    }
                    if (((Boolean) C286270BJx.LIZ.getValue()).booleanValue() && C1896840zSc.LIZIZ.contains(str)) {
                        C1896840zSc.LIZ.put(str, map);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJFF(e2, "Text2ImageMobLancet onEventV3 exception");
            }
        }
    }

    public static void LJIJ(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                for (IText2ImageMobTrackExtension iText2ImageMobTrackExtension : (Set) C20685115wv.LIZ.getValue()) {
                    if (iText2ImageMobTrackExtension.LIZLLL(str)) {
                        iText2ImageMobTrackExtension.LIZJ(jSONObject);
                    }
                }
                LJ(str, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "Text2ImageMobLancet onEventV3 exception");
            }
        }
    }

    public static void LJIJI(String str, Pair<Object, String>... pairArr) {
        String second;
        String string;
        if (C2213981Bky.LIZIZ.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) {
            return;
        }
        HashMap map = new HashMap(pairArr.length);
        for (Pair<Object, String> pair : pairArr) {
            if (pair != null && (second = pair.getSecond()) != null) {
                Object first = pair.getFirst();
                if (first == null) {
                    string = "";
                } else {
                    string = first.toString();
                }
                map.put(second, string);
            }
        }
        LJIILLIIL(str, map);
        LJII(str, map);
    }

    public static void LJIJJ(String str, JSONObject jSONObject) {
        try {
            if (C2213981Bky.LIZIZ.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) {
                return;
            } else {
                AppLogNewUtils.onEventV3(str, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIIIZZ(str, jSONObject);
    }

    public static void LJIIZILJ(String str, Map map, boolean z) {
        if (C2213981Bky.LIZIZ.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) {
            return;
        }
        if (z && !C05GY.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C05GY.LIZJ), null, null, new C05GV(new C05GX(str, map, System.currentTimeMillis()), null), 3);
        } else {
            LJIILLIIL(str, map);
        }
    }

    public static void LJIIIZ(long j, long j2, String str, String str2) {
        try {
            try {
                C20684915wt.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), "event_v1", str, str2, j, j2, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJIIJJI(String str, long j, String str2, String str3) {
        try {
            try {
                C20684915wt.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), "event_v1", str, str2, CastLongProtector.parseLong(str3), j, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJIIL(String str, String str2, String str3, String str4) {
        try {
            try {
                C20684915wt.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), "event_v1", str, str2, CastLongProtector.parseLong(str3), CastLongProtector.parseLong(str4), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJIIJ(long j, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            C20684915wt.LJ(C2213981Bky.LIZIZ.getApplicationContext(), str, str2, CastLongProtector.parseLong(str3), j, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C20684915wt.LJ(C2213981Bky.LIZIZ.getApplicationContext(), str, str2, CastLongProtector.parseLong(str3), CastLongProtector.parseLong(str4), jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILJJIL(String str, String str2, String str3, String str4, JSONObject jSONObject, long j) {
        try {
            try {
                C20684915wt.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), str, str2, str3, CastLongProtector.parseLong(str4), j, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
