package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.recording.js.RecordingNativeContextHandler;
import defpackage.l;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042450dEZ {
    public static final C1042450dEZ LIZ = new C1042450dEZ();
    public static final C1912607eO LIZIZ = new C1912607eO();
    public static final RecordingNativeContextHandler LIZJ = new RecordingNativeContextHandler();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(204));

    public static boolean LIZLLL(C1035880d3y c1035880d3y) {
        FeatureCenterModel feature;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if ((awemeRawAd == null || (feature = awemeRawAd.getFeature()) == null || !Intrinsics.LJFF(feature.iabRecordingJsEvent, Boolean.TRUE) || !C1042260dEG.LIZ().enableJsEvent) && !C1042260dEG.LIZ().forceEnableJsEvent) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1042500dEe
            if (r0 == 0) goto L42
            r3 = r9
            X.0dEe r3 = (X.C1042500dEe) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L74
            X.C155000ia.LIZIZ(r2)
        L22:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L48
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.01GW r0 = X.C1042450dEZ.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.01wW r0 = (X.C496201wW) r0
            r3.LL = r7
            r3.LLILZ = r5
            java.lang.Object r2 = r0.LIZ(r8, r7, r3)
            if (r2 != r1) goto L22
            return r1
        L42:
            X.0dEe r3 = new X.0dEe
            r3.<init>(r6, r9)
            goto L12
        L48:
            X.07eO r4 = X.C1042450dEZ.LIZIZ
            r4.getClass()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            android.util.LruCache<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.LIZ
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L55
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1042450dEZ.LIZIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    public static void LIZJ(WebView webView, final C1035880d3y c1035880d3y, InterfaceC497601wk interfaceC497601wk, String str, final String str2) {
        long jLongValue;
        String str3;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        AwemeRawAd awemeRawAd2;
        FeatureCenterModel feature2;
        Long l;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C259800zU c259800zU = new C259800zU();
        Object obj = "";
        c259800zU.element = "";
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("platform", "android");
            if (c1035880d3y != null && (awemeRawAd2 = c1035880d3y.getAwemeRawAd()) != null && (feature2 = awemeRawAd2.getFeature()) != null && (l = feature2.deviceOverallScoreLayer) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            pairArr[1] = new Pair("device_score", Long.valueOf(jLongValue));
            pairArr[2] = new Pair("settings", (Map) C07NP.LIZIZ.getValue());
            if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (feature = awemeRawAd.getFeature()) == null || (str3 = feature.iabRecordingJsSettings) == null) {
                str3 = "";
            }
            pairArr[3] = new Pair("pack_settings", str3);
            c259800zU.element = gsonLIZLLL.LJIILL(C2097608Jq.LJIIIIZZ(pairArr));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1544770qIl.LIZ(webView, new l() { // from class: X.0dEd
            @Override // X.AbstractC1544900qIy
            public final void LJIIIZ(C1047860dNI c1047860dNI) {
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIIIZZ(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inject-failed-");
                sbLIZ.append(iJSInjectCallback$ErrorCode);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str4 = str2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(true, c1035880d3y2, false, strLIZIZ, str4, jCurrentTimeMillis2, null);
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIJJI(Object obj2) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                String str4 = str2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(true, c1035880d3y2, true, "", str4, jCurrentTimeMillis2, obj2);
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView2) {
                return c259800zU.element;
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIJ(int i, Object obj2, String str4) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive-failed-");
                sbLIZ.append(i);
                sbLIZ.append('-');
                sbLIZ.append(str4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str5 = str2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(true, c1035880d3y2, false, strLIZIZ, str5, jCurrentTimeMillis2, obj2);
            }
        });
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Map<String, Object> mapLIZ = LIZIZ.LIZ(str);
        if (mapLIZ != null) {
            Object obj2 = mapLIZ.get("fail_reason");
            if (obj2 != null) {
                obj = obj2;
            }
            LIZ(mapLIZ, webView, true, jCurrentTimeMillis2, c1035880d3y, obj.toString());
            return;
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1042460dEa(jCurrentTimeMillis2, webView, c1035880d3y, str, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public static void LIZ(Map map, WebView webView, boolean z, final long j, final C1035880d3y c1035880d3y, final String str) {
        final String str2;
        if (z) {
            str2 = "cache";
        } else {
            str2 = "pack";
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        try {
            C1227904rF.LIZ.getClass();
            ?? LJIILL = C1227904rF.LIZLLL().LJIILL(C2097908Jt.LIZJ(new Pair("rules", map)));
            LJIILL.toString();
            c259800zU.element = LJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1544770qIl.LIZ(webView, new AbstractC1043230dFp() { // from class: X.0dEc
            @Override // X.AbstractC1544900qIy
            public final void LJIIIZ(C1047860dNI c1047860dNI) {
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIIIZZ(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inject-failed-");
                sbLIZ.append(iJSInjectCallback$ErrorCode);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str3 = str2;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(false, c1035880d3y2, false, strLIZIZ, str3, jCurrentTimeMillis, null);
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIJJI(Object obj) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                String str3 = str;
                String str4 = str2;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(false, c1035880d3y2, true, str3, str4, jCurrentTimeMillis, obj);
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView2) {
                return c259800zU.element;
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIJ(int i, Object obj, String str3) {
                C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive-failed-");
                sbLIZ.append(i);
                sbLIZ.append('-');
                sbLIZ.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str4 = str2;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                c1042450dEZ.getClass();
                C1042450dEZ.LJ(false, c1035880d3y2, false, strLIZIZ, str4, jCurrentTimeMillis, obj);
            }
        });
        if (map.get("enable_html_upload") != null) {
            map.put("enable_html_upload", Boolean.FALSE);
        }
    }

    public static Object LJ(boolean z, C1035880d3y c1035880d3y, boolean z2, String str, String str2, long j, Object obj) {
        String str3;
        String strLJI;
        if (c1035880d3y != null) {
            if (z) {
                str3 = "js_main";
            } else {
                str3 = "js_rule";
            }
            if (obj != null) {
                try {
                    if (obj instanceof String) {
                        strLJI = (String) obj;
                    } else {
                        C1227904rF.LIZ.getClass();
                        strLJI = C1227904rF.LJI(obj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    return c098200Yq;
                }
            } else {
                strLJI = "null";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hasLoadFinishOrError: ");
            sbLIZ.append(c1035880d3y.getAdCommonData().hasLoadFinishOrError);
            sbLIZ.append(", data: ");
            sbLIZ.append(strLJI);
            new AdWebEventLogger(c1035880d3y).logAd(C1E1Z.LIZ, c1035880d3y.getAwemeRawAd(), new C1052800dVG(str3, z2, str, str2, j, c1035880d3y, C2188811AlT.LIZIZ(sbLIZ)));
        }
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        return unit;
    }
}
