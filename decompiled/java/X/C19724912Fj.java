package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19724912Fj {
    public static Application LIZIZ;
    public static C19724912Fj LJI;
    public final C686160Qvm LIZ;
    public static final LinkedHashMap<String, InterfaceC19725812Fs> LIZJ = new LinkedHashMap<>();
    public static final Set<InterfaceC196850120a> LIZLLL = new LinkedHashSet();
    public static InterfaceC1400470mY1 LJ = null;
    public static boolean LJFF = false;
    public static boolean LJII = false;

    public static void LIZJ() {
        if (LJFF) {
            return;
        }
        synchronized (LIZJ) {
            try {
                Iterator<InterfaceC196850120a> it2 = LIZLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().initialize();
                }
                LJFF = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C19724912Fj LIZLLL() {
        C19724912Fj c19724912Fj = LJI;
        if (c19724912Fj != null) {
            return c19724912Fj;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    public C19724912Fj(Application application) {
        LIZIZ = application;
        this.LIZ = new C686160Qvm();
    }

    public static boolean LIZIZ(InterfaceC19725812Fs interfaceC19725812Fs) {
        if (interfaceC19725812Fs == null) {
            C2213981Bky.LIZIZ.isDebug();
            return false;
        }
        return true;
    }

    public final boolean LJII(String str) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        C0W77.LIZ(str);
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2213981Bky.LIZIZ.getApplicationContext(), str);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fn
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        smartRouteBuildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (!TextUtils.isEmpty(str)) {
                Iterator<String> it2 = LIZJ.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        if (C018G.LIZLLL(next, str)) {
                            interfaceC19725812Fs = LIZJ.get(next);
                            break;
                        }
                    } else {
                        interfaceC19725812Fs = null;
                        break;
                    }
                }
                if (!LIZIZ(interfaceC19725812Fs)) {
                    LJ(str, false);
                } else {
                    zArr[0] = interfaceC19725812Fs.open(str);
                }
            }
            return false;
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public static void LIZ(Class cls, String str) {
        C19725012Fk c19725012Fk = new C19725012Fk(LIZIZ, cls, str);
        c19725012Fk.LLILZIL = LJII;
        LinkedHashMap<String, InterfaceC19725812Fs> linkedHashMap = LIZJ;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, c19725012Fk);
        }
    }

    public static void LJ(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put("type", str2);
            jSONObject.put("open_url", str);
            C793770VBv.LJII("in_app_router_no_matched", null, null, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJFF(String str, HashMap map) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        C0W77.LIZ(str);
        C686150Qvl c686150Qvl = new C686150Qvl(str);
        for (Map.Entry entry : map.entrySet()) {
            c686150Qvl.LIZIZ((String) entry.getKey(), (String) entry.getValue());
        }
        String strLIZJ = c686150Qvl.LIZJ();
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2213981Bky.LIZIZ.getApplicationContext(), strLIZJ);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fp
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        smartRouteBuildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (!TextUtils.isEmpty(str)) {
                Iterator<String> it2 = LIZJ.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        if (C018G.LIZLLL(next, str)) {
                            interfaceC19725812Fs = LIZJ.get(next);
                            break;
                        }
                    } else {
                        interfaceC19725812Fs = null;
                        break;
                    }
                }
                if (!LIZIZ(interfaceC19725812Fs)) {
                    LJ(strLIZJ, false);
                    return;
                }
                zArr[0] = interfaceC19725812Fs.open(strLIZJ);
            } else {
                return;
            }
        }
        if (zArr[0]) {
            return;
        }
        LJ(strLIZJ, false);
    }

    public final boolean LJI(Activity activity, String str) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        C0W77.LIZ(str);
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, str);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fm
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        smartRouteBuildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (!TextUtils.isEmpty(str)) {
                Iterator<String> it2 = LIZJ.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        if (C018G.LIZLLL(next, str)) {
                            interfaceC19725812Fs = LIZJ.get(next);
                            break;
                        }
                    } else {
                        interfaceC19725812Fs = null;
                        break;
                    }
                }
                if (!LIZIZ(interfaceC19725812Fs)) {
                    LJ(str, false);
                } else {
                    zArr[0] = interfaceC19725812Fs.LIZ(activity, str);
                }
            }
            return false;
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIJ(Bundle bundle, String str) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2213981Bky.LIZIZ.getApplicationContext(), str);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fo
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        smartRouteBuildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it2 = LIZJ.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next = it2.next();
                    if (C018G.LIZLLL(next, str)) {
                        interfaceC19725812Fs = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC19725812Fs = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC19725812Fs)) {
                LJ(str, false);
                return false;
            }
            zArr[0] = interfaceC19725812Fs.open(str);
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIIIZZ(int i, Activity activity, String str) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        C0W77.LIZ(str);
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, str);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fq
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        smartRouteBuildRoute.open(i);
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (!TextUtils.isEmpty(str)) {
                Iterator<String> it2 = LIZJ.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        if (C018G.LIZLLL(next, str)) {
                            interfaceC19725812Fs = LIZJ.get(next);
                            break;
                        }
                    } else {
                        interfaceC19725812Fs = null;
                        break;
                    }
                }
                if (!LIZIZ(interfaceC19725812Fs)) {
                    LJ(str, false);
                } else if (interfaceC19725812Fs instanceof C19725012Fk) {
                    C19725012Fk c19725012Fk = (C19725012Fk) interfaceC19725812Fs;
                    C19725712Fr c19725712Fr = new C19725712Fr();
                    c19725712Fr.LIZLLL = 1;
                    c19725712Fr.LIZ = 0;
                    c19725712Fr.LIZIZ = 0;
                    c19725712Fr.LIZJ = i;
                    c19725012Fk.LLILZ = c19725712Fr;
                    zArr[0] = c19725012Fk.LIZJ(activity, str);
                } else {
                    zArr[0] = interfaceC19725812Fs.LIZ(activity, str);
                }
            }
            return false;
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }

    public final boolean LJIIIZ(Context context, String str, Bundle bundle, InterfaceC1066580drU interfaceC1066580drU) {
        InterfaceC19725812Fs interfaceC19725812Fs;
        final boolean[] zArr = new boolean[1];
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withCallback(new AbsOpenResultCallback() { // from class: X.12Fl
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                zArr[0] = false;
                this.LIZIZ.getClass();
                C19724912Fj.LJ(str2, true);
            }
        });
        if (interfaceC1066580drU != null) {
            interfaceC1066580drU.LIZ(smartRouteBuildRoute);
        }
        smartRouteBuildRoute.open();
        if (!zArr[0]) {
            LIZJ();
            InterfaceC1400470mY1 interfaceC1400470mY1 = LJ;
            if (interfaceC1400470mY1 != null) {
                str = interfaceC1400470mY1.LIZ(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it2 = LIZJ.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next = it2.next();
                    if (C018G.LIZLLL(next, str)) {
                        interfaceC19725812Fs = LIZJ.get(next);
                        break;
                    }
                } else {
                    interfaceC19725812Fs = null;
                    break;
                }
            }
            if (!LIZIZ(interfaceC19725812Fs)) {
                LJ(str, false);
                return false;
            }
            if (context instanceof Activity) {
                zArr[0] = interfaceC19725812Fs.LIZ((Activity) context, str);
            } else {
                zArr[0] = interfaceC19725812Fs.open(str);
            }
        }
        if (!zArr[0]) {
            LJ(str, false);
        }
        return zArr[0];
    }
}
