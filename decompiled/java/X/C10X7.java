package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.10X7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.preinstall.attribution.manager.PreInstallTrackingManager$executeAllTrackingTasks$1$1", f = "PreInstallTrackingManager.kt", l = {}, m = "invokeSuspend")
public final class C10X7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C10X0 LL;
    public final /* synthetic */ C259800zU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10X7(C10X0 c10x0, C259800zU c259800zU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c10x0;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10X7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.10XK] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.10X9] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreInstallTrackingManager@d78e.executeAllTrackingTasks$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = this.LLILLJJLI;
        C10X0 c10x0 = this.LL;
        C19259510Wj c19259510Wj = c10x0.LLILLL;
        final Context context = c10x0.LLILZ;
        final String str = c10x0.LLILZIL;
        C10X2 c10x2 = c10x0.LLILZLL;
        c19259510Wj.getClass();
        final ArrayList<C10XM> arrayList = new ArrayList();
        arrayList.add(new C10XM(context) { // from class: X.10XR
            public final Context LIZ;

            @Override // X.C10XM
            public final boolean LIZ() {
                return true;
            }

            {
                this.LIZ = context;
            }

            @Override // X.C10XM
            public final C10XK LIZIZ(C10XK c10xk) throws InterruptedException {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.LIZ).build();
                installReferrerClientBuild.startConnection(new C10XQ(this, installReferrerClientBuild, c10xk, countDownLatch));
                countDownLatch.await();
                return c10xk;
            }
        });
        String str2 = Build.MANUFACTURER;
        if (u.LJIJI("huawei", str2, true) || u.LJIJI("honor", str2, true)) {
            arrayList.add(new C10XM(context) { // from class: X.10XS
                public final Context LIZ;

                @Override // X.C10XM
                public final boolean LIZ() {
                    return true;
                }

                {
                    this.LIZ = context;
                }

                public static void LIZJ(C10XK c10xk) {
                    C10XT c10xt = c10xk.LJFF;
                    Map<String, String> map = c10xk.LIZLLL.LJFF;
                    String strDecode = c10xt.LIZ;
                    try {
                        strDecode = URLDecoder.decode(strDecode, "UTF-8");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    String strDecode2 = c10xt.LJFF;
                    try {
                        strDecode2 = URLDecoder.decode(strDecode2, "UTF-8");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    map.put("referrer", strDecode);
                    map.put("click_ts", String.valueOf(c10xt.LIZIZ));
                    map.put("install_end_ts", String.valueOf(c10xt.LIZJ));
                    map.put("install_begin_ts", String.valueOf(c10xt.LIZLLL));
                    map.put("track_id", c10xt.LJ);
                    map.put("referrer_ex", strDecode2);
                }

                @Override // X.C10XM
                public final C10XK LIZIZ(C10XK c10xk) {
                    Cursor cursorLJJJ = null;
                    try {
                        try {
                            cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{this.LIZ.getPackageName()}, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUdBINYxK7h46izHq1l627x8nUzjPESskcPmlKuwgV9t9O+Ffy2ncXE0X9", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (cursorLJJJ != null) {
                            }
                            return c10xk;
                        }
                        if (cursorLJJJ == null) {
                            return c10xk;
                        }
                        cursorLJJJ.moveToFirst();
                        C10XT c10xt = c10xk.LJFF;
                        String string = cursorLJJJ.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        c10xt.LIZ = string;
                        c10xt.LIZIZ = cursorLJJJ.getLong(1);
                        c10xt.LIZJ = cursorLJJJ.getLong(2);
                        if (cursorLJJJ.getColumnCount() > 3) {
                            c10xt.LIZLLL = cursorLJJJ.getLong(3);
                            if (cursorLJJJ.getString(4) != null) {
                                c10xt.LJ = cursorLJJJ.getString(4);
                            }
                            c10xt.LJFF = cursorLJJJ.getString(5);
                        }
                        LIZJ(c10xk);
                        cursorLJJJ.close();
                        return c10xk;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (cursorLJJJ != null) {
                            cursorLJJJ.close();
                        }
                        throw th;
                    }
                }
            });
        }
        final String[] strArr = c10x2.LJ;
        final boolean z = c10x2.LJI;
        arrayList.add(new C10XM(context, strArr, z) { // from class: X.10XA
            public final Context LIZ;
            public final String[] LIZIZ;
            public final boolean LIZJ;

            @Override // X.C10XM
            public final boolean LIZ() {
                return true;
            }

            @Override // X.C10XM
            public final C10XK LIZIZ(C10XK c10xk) {
                String strValueOf;
                boolean z2;
                try {
                    Bundle bundle = C786410Ut5.V3(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 128).metaData;
                    String string = bundle.getString("AF_PRE_INSTALL_NAME", "");
                    boolean z3 = false;
                    if (string != null && string.length() != 0) {
                        if (bundle.getInt("AF_PRE_INSTALL_CAMPAIGN", 0) == 0) {
                            strValueOf = bundle.getString("AF_PRE_INSTALL_CAMPAIGN", "");
                        } else {
                            strValueOf = String.valueOf(bundle.getInt("AF_PRE_INSTALL_CAMPAIGN"));
                        }
                        String string2 = bundle.getString("AF_PRE_INSTALL_SITE_ID", "");
                        C10XH c10xh = c10xk.LIZ;
                        c10xh.LJIIJJI = 1;
                        c10xh.LJIIIZ = string;
                        String[] strArr2 = this.LIZIZ;
                        if (strArr2 != null && C13LQ.LJJIJIIJI(string, strArr2) >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c10xh.LJIIJ = z2;
                        if ((!TextUtils.isEmpty(strValueOf) || !TextUtils.isEmpty(string2)) && this.LIZJ) {
                            z3 = true;
                        }
                        if (!TextUtils.isEmpty(string) && z3) {
                            c10xh.LIZ = string;
                            c10xh.LIZIZ = strValueOf;
                            c10xh.LIZJ = string2;
                            c10xk.LJ = true;
                        }
                        Map<String, String> map = c10xk.LIZLLL.LJ;
                        map.put("channel", string);
                        map.put("campaign", strValueOf);
                        map.put("siteId", string2);
                        return c10xk;
                    }
                    return c10xk;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return c10xk;
                }
            }

            {
                this.LIZ = context;
                this.LIZIZ = strArr;
                this.LIZJ = z;
            }
        });
        final String[] strArr2 = c10x2.LJFF;
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.BRAND;
        if (!u.LJIJI("xiaomi", str3, true) && !u.LJIJI("redmi", str3, true)) {
            if (!TextUtils.isEmpty(str3) && u.LJIJI("samsung", str3, true)) {
                arrayList2.add(new C10XM(context, strArr2) { // from class: X.10XC
                    public final Context LIZ;
                    public final String[] LIZIZ;

                    @Override // X.C10XM
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.C10XM
                    public final C10XK LIZIZ(C10XK c10xk) {
                        String str4;
                        Object obj2 = "";
                        C10XH c10xh = c10xk.LIZ;
                        C10X4 c10x4 = c10xk.LIZLLL;
                        try {
                            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                            Object objInvoke = method.invoke(null, "ro.csc.tiktok.entertainment.partnerid", "");
                            if (objInvoke == null) {
                                objInvoke = "";
                            }
                            str4 = (String) objInvoke;
                            if (TextUtils.isEmpty(str4)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ro.channelId.");
                                sbLIZ.append(C786410Ut5.N3(this.LIZ).getPackageName());
                                Object objInvoke2 = method.invoke(null, C2188811AlT.LIZIZ(sbLIZ), "");
                                if (objInvoke2 != null) {
                                    obj2 = objInvoke2;
                                }
                                str4 = (String) obj2;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            c10xh.LJIIJJI = 5;
                            c10xh.LIZ = str4;
                            c10xh.LJIIJ = false;
                            c10xk.LJ = true;
                            return c10xk;
                        }
                        String[] strArr3 = this.LIZIZ;
                        if (strArr3 != null && LIZJ(this.LIZ, c10xh, c10x4, strArr3)) {
                            c10xh.LJIIJJI = 6;
                            c10xk.LJ = true;
                            return c10xk;
                        }
                        return c10xk;
                    }

                    {
                        this.LIZ = context;
                        this.LIZIZ = strArr2;
                    }

                    public static boolean LIZJ(Context context2, C10XH c10xh, C10X4 c10x4, String[] strArr3) {
                        Uri uri = UriProtector.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
                        Bundle bundle = new Bundle();
                        Cursor cursorLJJJ = null;
                        try {
                            try {
                                cursorLJJJ = C2204961BRm.LJJJ(context2.getContentResolver(), uri, null, context2.getPackageName(), strArr3, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUdBINYxK7h46izHq1l627x8nUzjPESskcPmlKuxMjycldTQmS7igBJIsmfBpSeYI=", null));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (cursorLJJJ != null) {
                                    break;
                                }
                            }
                            if (cursorLJJJ != null) {
                                cursorLJJJ.moveToFirst();
                                int columnCount = cursorLJJJ.getColumnCount();
                                if (columnCount >= 0) {
                                    int i = 0;
                                    while (true) {
                                        C786410Ut5.LJJJI(cursorLJJJ.getColumnName(i), cursorLJJJ.getString(i), bundle);
                                        if (i == columnCount) {
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                cursorLJJJ.close();
                            }
                            if (bundle.isEmpty()) {
                                C786410Ut5.LJJJI("RESULT", "false", bundle);
                                C786410Ut5.LJJJI("REASON", "Perhaps the ContentProvider call was failed.", bundle);
                            }
                            boolean z2 = Boolean.parseBoolean(bundle.getString("RESULT", "false"));
                            String string = bundle.getString("APP_TRACKING_ID", "");
                            String string2 = bundle.getString("REASON", "");
                            Locale locale = Locale.ROOT;
                            if (string2 != null) {
                                if (a0.LJJIIZI(string2.toLowerCase(locale), "uninstalled", false)) {
                                    z2 = true;
                                    c10xh.LJIIIIZZ = true;
                                    string = "preload_uninstall_samsung";
                                } else {
                                    if (z2) {
                                    }
                                    return z2;
                                }
                                c10xh.LIZ = string;
                                Map<String, String> map = c10x4.LIZLLL;
                                map.put("channel", bundle.getString("APP_TRACKING_ID", ""));
                                map.put("failure_reason", bundle.getString("REASON", ""));
                                map.put("promotion_id", bundle.getString("MAPS_ID", ""));
                                map.put("campaign_id", bundle.getString("APP_TRACKING_ID", ""));
                                map.put("installed_time", bundle.getString("INSTALLED_TIME_TEXT", ""));
                                map.put("activated_time", bundle.getString("ACTIVATED_TIME_TEXT", ""));
                                map.put("country", bundle.getString("COUNTRY", ""));
                                map.put("device_name", bundle.getString("DEVICE_NAME", ""));
                                map.put("is_first_query", bundle.getString("FIRST_QUERY", "false"));
                                if (!c10xh.LJIIIIZZ) {
                                    c10xh.LJIIJ = false;
                                }
                                return z2;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (cursorLJJJ != null) {
                                cursorLJJJ.close();
                            }
                            throw th;
                        }
                    }
                });
            } else {
                try {
                    PackageManager packageManager = C786410Ut5.N3(context).getPackageManager();
                    if (packageManager != null) {
                        if (packageManager.hasSystemFeature("com.microsoft.device.display.displaymask")) {
                            arrayList2.add(new C10XM() { // from class: X.10XF
                                @Override // X.C10XM
                                public final boolean LIZ() {
                                    return false;
                                }

                                @Override // X.C10XM
                                public final C10XK LIZIZ(C10XK c10xk) {
                                    Object objInvoke;
                                    try {
                                        objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.product.tiktok.partnerid", "");
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (objInvoke != null) {
                                        String str4 = (String) objInvoke;
                                        if (!TextUtils.isEmpty(str4)) {
                                            C10XH c10xh = c10xk.LIZ;
                                            c10xh.LIZ = str4;
                                            c10xh.LJIIJ = false;
                                            c10xk.LJ = true;
                                            return c10xk;
                                        }
                                        return c10xk;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            });
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            arrayList2.add(new C10XM(context) { // from class: X.10XE
                public final Context LIZ;

                @Override // X.C10XM
                public final boolean LIZ() {
                    return false;
                }

                {
                    this.LIZ = context;
                }

                @Override // X.C10XM
                public final C10XK LIZIZ(C10XK c10xk) {
                    C10XN c10xn = c10xk.LIZIZ;
                    try {
                        String str4 = C786410Ut5.Y3(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 0).packageName;
                        Class<?> cls = Class.forName("miui.os.MiuiInit");
                        Method method = cls.getMethod("isPreinstalledPackage", String.class);
                        Method method2 = cls.getMethod("isPreinstalledPAIPackage", String.class);
                        Object objInvoke = method.invoke(null, str4);
                        if (objInvoke != null) {
                            c10xn.LIZ = (String) objInvoke;
                            Object objInvoke2 = method2.invoke(null, str4);
                            if (objInvoke2 != null) {
                                c10xn.LIZIZ = (String) objInvoke2;
                                return c10xk;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c10xn.LIZ = "error";
                        c10xn.LIZIZ = "error";
                        return c10xk;
                    }
                }
            });
        }
        C19719612Di.LJJI(arrayList2, arrayList);
        arrayList.add(new C10XM(context) { // from class: X.10XJ
            public final Context LIZ;

            @Override // X.C10XM
            public final boolean LIZ() {
                return false;
            }

            {
                this.LIZ = context;
            }

            @Override // X.C10XM
            public final C10XK LIZIZ(C10XK c10xk) {
                C10XH c10xh = c10xk.LIZ;
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LIZ, 0, "preinsatll_appflyer");
                String str4 = "";
                String string = sharedPreferencesLIZJ.getString("preinsatll_channel", "");
                if (string == null) {
                    string = "";
                }
                if (string.length() > 0) {
                    c10xh.LJIIJJI = 4;
                    c10xk.LJ = true;
                    String string2 = sharedPreferencesLIZJ.getString("preinsatll_campaign", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    c10xh.LIZIZ = string2;
                    String string3 = sharedPreferencesLIZJ.getString("preinsatll_site_id", "");
                    if (string3 != null) {
                        str4 = string3;
                    }
                    c10xh.LIZJ = str4;
                    c10xh.LJIIJ = false;
                }
                c10xh.LIZ = string;
                return c10xk;
            }
        });
        final boolean z2 = c10x2.LIZIZ;
        arrayList.add(new C10XM(context, str, z2) { // from class: X.10X8
            public final Context LIZ;
            public final String LIZIZ;
            public final boolean LIZJ;

            @Override // X.C10XM
            public final boolean LIZ() {
                return false;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:13|87|(2:84|14)|(8:94|15|(1:17)|18|80|19|22|(2:25|23))|89|32|35|(2:37|(11:39|78|40|43|(1:45)(1:47)|46|82|48|(2:50|53)|54|(2:60|(2:62|63)(2:64|65))))|66) */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
             */
            /* JADX WARN: Not initialized variable reg: 4, insn: 0x0163: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777571), block:B:68:0x0163 */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
            @Override // X.C10XM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C10XK LIZIZ(X.C10XK r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 373
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C10X8.LIZIZ(X.10XK):X.10XK");
            }

            {
                this.LIZ = context;
                this.LIZIZ = str;
                this.LIZJ = z2;
            }
        });
        final String[] strArr3 = c10x2.LIZLLL;
        if (strArr3 != null && strArr3.length != 0) {
            arrayList.add(new C10XM(strArr3) { // from class: X.10XD
                public final String[] LIZ;

                @Override // X.C10XM
                public final boolean LIZ() {
                    return false;
                }

                {
                    this.LIZ = strArr3;
                }

                @Override // X.C10XM
                public final C10XK LIZIZ(C10XK c10xk) {
                    String[] strArr4;
                    String[] strArr5;
                    C10XH c10xh = c10xk.LIZ;
                    if (c10xh.LIZ.length() <= 0 && (strArr4 = this.LIZ) != null && strArr4.length != 0) {
                        String str4 = c10xk.LIZJ.LIZIZ;
                        HashMap map = new HashMap();
                        for (String str5 : a0.LJJLIIIJILLIZJL(str4, new String[]{"&"}, 0, 6)) {
                            if (a0.LJJIIZI(str5, "=", false)) {
                                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str5, new String[]{"="}, 0, 6);
                                if (listLJJLIIIJILLIZJL.size() > 1) {
                                    map.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                                }
                            }
                        }
                        Object obj2 = map.get("utm_source");
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        Object obj3 = map.get("utm_medium");
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        if (Intrinsics.LJFF("play-auto-installs", obj2) && Intrinsics.LJFF("preload", obj3)) {
                            c10xh.LJIIJJI = 3;
                            c10xh.LJIIJ = false;
                        }
                        if (!map.containsKey("utm_campaign")) {
                            return c10xk;
                        }
                        String str6 = (String) map.get("utm_campaign");
                        if (str6 == null) {
                            str6 = "";
                        }
                        if (str6.length() != 0 && (strArr5 = this.LIZ) != null && strArr5.length != 0) {
                            for (String str7 : strArr5) {
                                String strLJJLIL = a0.LJJLIL(str6, str7, "");
                                if (!TextUtils.isEmpty(strLJJLIL)) {
                                    c10xh.LJIIJJI = 2;
                                    c10xh.LIZ = strLJJLIL;
                                    c10xh.LIZIZ = "TT PAI";
                                    c10xh.LJIIJ = false;
                                    c10xk.LJ = true;
                                    return c10xk;
                                }
                            }
                        }
                    }
                    return c10xk;
                }
            });
        }
        arrayList.add(new C10XM(context) { // from class: X.10XG
            public final Context LIZ;

            @Override // X.C10XM
            public final boolean LIZ() {
                return false;
            }

            {
                this.LIZ = context;
            }

            @Override // X.C10XM
            public final C10XK LIZIZ(C10XK c10xk) throws Throwable {
                String string;
                C10XH c10xh = c10xk.LIZ;
                Cursor cursorLJJIZ = C2204961BRm.LJJIZ(this.LIZ.getContentResolver(), UriProtector.parse("content://com.orange.update.provider.attributionprovider/" + this.LIZ.getPackageName()), null, null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUdBINYxK7h46izHq1l627x8nUzjPESskcPmlKuw8wxdRPZncNorfPbzILSl+OEA==", null));
                try {
                    if (cursorLJJIZ != null) {
                        try {
                            if (cursorLJJIZ.getCount() > 0) {
                                while (cursorLJJIZ.moveToNext()) {
                                    int columnIndex = cursorLJJIZ.getColumnIndex("preinstalled_version");
                                    String str4 = "";
                                    if (columnIndex < 0) {
                                        string = "";
                                    } else {
                                        string = cursorLJJIZ.getString(columnIndex);
                                    }
                                    int columnIndex2 = cursorLJJIZ.getColumnIndex("is_virtual_preload");
                                    if (columnIndex2 >= 0) {
                                        if (cursorLJJIZ.getInt(columnIndex2) == 1) {
                                            str4 = "virtualpreload";
                                        } else {
                                            str4 = "appcenterstore";
                                        }
                                    }
                                    c10xh.LJIIJJI = 7;
                                    c10xh.LIZIZ = str4;
                                    c10xh.LIZLLL = string;
                                    c10xh.LIZ = "orange_int";
                                    c10xh.LJIIJ = false;
                                    c10xk.LJ = true;
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        cursorLJJIZ.close();
                    }
                    C786410Ut5.u3().getId();
                    Looper.getMainLooper().getThread().getId();
                    return c10xk;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorLJJIZ.close();
                    throw th;
                }
            }
        });
        C19719612Di.LJJI(c10x2.LIZ, arrayList);
        ?? r3 = new Object(context, arrayList) { // from class: X.10X9
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(629));
            public final List<C10XM> LIZIZ;
            public final Context LIZJ;

            public final C10XK LIZ() {
                return (C10XK) this.LIZ.getValue();
            }

            public final void LIZIZ(Map<String, String> map) {
                long j;
                C10XH c10xh = LIZ().LIZ;
                C10XN c10xn = LIZ().LIZIZ;
                PackageInfo packageInfoY3 = C786410Ut5.Y3(C786410Ut5.N3(this.LIZJ).getPackageManager(), C786410Ut5.N3(this.LIZJ).getPackageName(), 0);
                map.put("preinstall_channel", c10xh.LIZ);
                Context context2 = this.LIZJ;
                PackageInfo packageInfoY32 = null;
                try {
                    packageInfoY32 = C786410Ut5.Y3(context2.getPackageManager(), context2.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                long j2 = -1;
                if (packageInfoY32 != null) {
                    j = packageInfoY32.firstInstallTime;
                } else {
                    j = -1;
                }
                map.put("apk_first_install_time", String.valueOf(j));
                Context context3 = this.LIZJ;
                try {
                    PackageInfo packageInfoY33 = C786410Ut5.Y3(context3.getPackageManager(), context3.getPackageName(), 0);
                    if (packageInfoY33 != null) {
                        j2 = packageInfoY33.lastUpdateTime;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                map.put("apk_last_update_time", String.valueOf(j2));
                map.put("app_version", packageInfoY3.versionName);
                map.put("is_factory_preload", c10xn.LIZ);
                map.put("is_online_preload", c10xn.LIZIZ);
                map.put("is_uninstall_user", String.valueOf(c10xh.LJIIIIZZ));
                map.put("device_elapsed_real_time", String.valueOf(SystemClock.elapsedRealtime()));
                map.put("campaign", c10xh.LIZIZ);
                map.put("site_id", c10xh.LIZJ);
                map.put("preinstall_version", c10xh.LIZLLL);
                map.put("df_code", String.valueOf(c10xh.LJIIL));
            }

            {
                this.LIZIZ = arrayList;
                this.LIZJ = context;
            }
        };
        for (C10XM c10xm : arrayList) {
            try {
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                System.out.println((Object) e2.getMessage());
            }
            if (!r3.LIZ().LJ || c10xm.LIZ()) {
                c10xm.LIZIZ(r3.LIZ());
            }
        }
        C10XK c10xkLIZ = r3.LIZ();
        if (c10xkLIZ.LIZ.LIZ.length() != 0) {
            r3.LIZIZ(c10xkLIZ.LIZLLL.LIZ);
        }
        C10XK c10xkLIZ2 = r3.LIZ();
        Map<String, String> map = c10xkLIZ2.LIZLLL.LJII;
        r3.LIZIZ(map);
        map.putAll(c10xkLIZ2.LIZLLL.LIZLLL);
        map.putAll(c10xkLIZ2.LIZLLL.LIZJ);
        map.putAll(c10xkLIZ2.LIZLLL.LIZIZ);
        map.putAll(c10xkLIZ2.LIZLLL.LIZLLL);
        map.put("manifest_channel", c10xkLIZ2.LIZ.LJIIIZ);
        c259800zU.element = r3.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreInstallTrackingManager@d78e.executeAllTrackingTasks$1$1");
        return unit;
    }
}
