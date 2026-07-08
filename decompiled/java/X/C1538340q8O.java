package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538340q8O {
    public static final C1538340q8O LIZ = new C1538340q8O();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C1541470qDR LIZJ = new InterfaceC1538750q93<WebKitView>() { // from class: X.0qDR
        public final EnumC1067640dtC LIZ = EnumC1067640dtC.WEB;

        @Override // X.InterfaceC1538750q93
        public final EnumC1067640dtC getViewType() {
            return this.LIZ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:145:0x03a1  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x04a8  */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        @Override // X.InterfaceC1538750q93
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.InterfaceC1541990qEH LIZ(com.bytedance.lynx.hybrid.param.HybridSchemaParam r22, X.C1537480q70 r23, android.content.Context r24, X.AbstractC1537870q7d r25) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 1629
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1541470qDR.LIZ(com.bytedance.lynx.hybrid.param.HybridSchemaParam, X.0q70, android.content.Context, X.0q7d):X.0qEH");
        }
    };

    public static void LIZIZ() {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                LIZ(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0q9Y] */
    public static void LIZ(C1537480q70 c1537480q70) {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        C1529360ptu c1529360ptu = C1529360ptu.LIZ;
        if (!c1529360ptu.LIZLLL(c1537480q70)) {
            atomicBoolean.set(false);
            return;
        }
        C1520080pew.LIZIZ.add(new InterfaceC1520110pez() { // from class: X.0q8t
            @Override // X.InterfaceC1520110pez
            public final boolean LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                return interfaceC1541990qEH instanceof WebView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1520110pez
            public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, C1520350pfN c1520350pfN) {
                if (!(interfaceC1541990qEH instanceof WebView)) {
                    return;
                }
                WebViewMonitorHelper.getInstance().customReport((WebView) interfaceC1541990qEH, c1520350pfN);
            }
        });
        c1529360ptu.LIZ();
        C1521250pgp c1521250pgpBuildConfig = WebViewMonitorHelper.getInstance().buildConfig();
        C1541490qDT.LIZ = c1521250pgpBuildConfig;
        if (c1521250pgpBuildConfig != null) {
            c1521250pgpBuildConfig.LIZJ = new C1520400pfS();
            c1521250pgpBuildConfig.LJ = true;
            c1521250pgpBuildConfig.LIZ = new String[]{WebKitView.class.getName()};
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
        if (C1541610qDf.LJI == null) {
            C1541610qDf.LJI = C786410Ut5.N3(applicationLIZJ);
            C1541610qDf.LJII = new Object() { // from class: X.0q9Y
            };
        }
        AbstractC1541720qDq abstractC1541720qDq = new AbstractC1541720qDq() { // from class: X.0qDm
            @Override // X.AbstractC1541720qDq
            public final void LIZ(C1541630qDh c1541630qDh) {
                LinkedHashSet<Class<? extends AbstractC1541650qDj>> linkedHashSet;
                if (InterfaceC1541850qE3.class.isAssignableFrom(C1536260q52.class)) {
                    linkedHashSet = c1541630qDh.LIZ;
                } else if (InterfaceC1524070plN.class.isAssignableFrom(C1536260q52.class)) {
                    linkedHashSet = c1541630qDh.LIZIZ;
                } else {
                    throw new Error();
                }
                linkedHashSet.add(C1536260q52.class);
            }
        };
        Map<String, List<Pair<Class<? extends InterfaceC1541860qE4>, AbstractC1541720qDq>>> map = C1541610qDf.LJIIIIZZ;
        List arrayList = (List) ((HashMap) map).get("hybrid_web_extension_webkit");
        if (arrayList == null) {
            synchronized (C1541610qDf.class) {
                try {
                    arrayList = (List) ((HashMap) map).get("hybrid_web_extension_webkit");
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        ((HashMap) map).put("hybrid_web_extension_webkit", arrayList);
                    }
                } finally {
                }
            }
        }
        Pair pair = new Pair(C1542590qFF.class, abstractC1541720qDq);
        synchronized (C1541610qDf.class) {
            try {
                arrayList.add(pair);
            } finally {
            }
        }
        C0W9Z.LIZ.add(new C0W7Z() { // from class: X.0W7Y
            @Override // X.C0W7Z
            public final void LIZ(C818000W7a c818000W7a) {
                C0W7X.LIZ.getClass();
                C01GW c01gw2 = C818010W7b.LIZ;
                String string = ((SharedPreferences) c01gw2.getValue()).getString("user_id_key", "");
                String str = c818000W7a.LIZ;
                if (str != null && str.length() != 0) {
                    if (C1533950q1J.LJ(string) && Intrinsics.LJFF(c818000W7a.LIZ, string)) {
                        return;
                    }
                    ((SharedPreferences) c01gw2.getValue()).edit().putString("user_id_key", c818000W7a.LIZ).apply();
                    for (String str2 : C0W7X.LIZIZ) {
                        C0W7X.LIZ.getClass();
                        C0W7X.LIZIZ(str2);
                    }
                    Set<String> set = C0W7X.LIZIZ;
                    set.clear();
                    ((SharedPreferences) C818010W7b.LIZ.getValue()).edit().putStringSet("cookie_url_set_key", set).apply();
                    for (String str3 : C0W7X.LIZJ) {
                        C0W7X.LIZ.getClass();
                        C0W7X.LIZIZ(str3);
                    }
                }
            }
        });
        C1541490qDT.LJ = new C1541700qDo() { // from class: X.0q8j
            @Override // X.C1541700qDo
            public final boolean LIZ(WebKitView webKitView) {
                try {
                    return ((Boolean) webKitView.getTag(R.id.web_proxy)).booleanValue();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return true;
                }
            }

            @Override // X.C1541700qDo
            public final void LIZIZ(boolean z) {
                WebViewHooker.LJIIZILJ = z;
            }
        };
        atomicBoolean.compareAndSet(false, true);
        c1529360ptu.LIZJ();
    }
}
