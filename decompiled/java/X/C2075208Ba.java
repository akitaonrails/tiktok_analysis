package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.08Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075208Ba {
    public static final C08BY LIZIZ = new HashMap<String, InterfaceC2075508Bd>() { // from class: X.08BY
        {
            put("OPPO", new InterfaceC2075508Bd() { // from class: X.08Bv
                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    try {
                        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            });
            put("VIVO", new InterfaceC2075508Bd() { // from class: X.08BV
                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    boolean zBooleanValue = false;
                    try {
                        zBooleanValue = ((Boolean) Reflect.on("android.util.FtFeature").call("isFeatureSupport", new Class[]{Integer.class}, 32).get()).booleanValue();
                        return zBooleanValue;
                    } catch (C2039307yp e) {
                        TryCatchGuardChecker.doCheck(e);
                        return zBooleanValue;
                    }
                }
            });
            put("HISENSE", new InterfaceC2075508Bd() { // from class: X.08BT
                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    try {
                        String strLIZ = C2029607xG.LIZ("ro.hmct.notch_height");
                        String strLIZ2 = C2029607xG.LIZ("ro.hmct.notch_width");
                        if (!TextUtils.equals(strLIZ.trim(), CardStruct.IStatusCode.DEFAULT) && !TextUtils.isEmpty(strLIZ.trim()) && !TextUtils.equals(strLIZ2.trim(), CardStruct.IStatusCode.DEFAULT)) {
                            if (!TextUtils.isEmpty(strLIZ2.trim())) {
                                return true;
                            }
                        }
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            });
            put("HUAWEI", new C2077208Bu());
            put("XIAOMI", new InterfaceC2075508Bd() { // from class: X.08BX
                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    try {
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (CastIntegerProtector.parseInt(C2029607xG.LIZ("ro.miui.notch").trim()) != 1) {
                        return false;
                    }
                    return true;
                }
            });
            put("ASUS", new InterfaceC2075508Bd() { // from class: X.08BU
                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    try {
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (CastIntegerProtector.parseInt(C2029607xG.LIZ("persist.sys.notchui.enable").trim()) != 1) {
                        return false;
                    }
                    return true;
                }
            });
            put("ONEPLUS", new InterfaceC2075508Bd() { // from class: X.08BZ
                public static final List<String> LIZ = Arrays.asList("ONEPLUS A6000");

                @Override // X.InterfaceC2075508Bd
                public final boolean LIZJ(Context context) {
                    return LIZ.contains(Build.MODEL);
                }
            });
        }
    };
    public static final C2075308Bb LIZJ = new HashMap<String, InterfaceC2075508Bd>() { // from class: X.08Bb
        {
            put("HONOR", new C2077208Bu() { // from class: X.08Bc
            });
        }
    };
    public final boolean LIZ;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2075208Ba(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r4 = 1
            r5 = 0
            if (r7 == 0) goto L69
            X.19EG r2 = X.C1388190mED.LIZIZ(r7)
            if (r2 == 0) goto L69
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L69
            android.view.Window r0 = r2.getWindow()
            android.view.View r3 = r0.getDecorView()
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getRootWindowInsets"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getDisplayCutout"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getBoundingRects"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L5c
            if (r0 == 0) goto L69
            int r0 = r0.size()     // Catch: java.lang.Exception -> L5c
            if (r0 <= 0) goto L69
            goto Lb0
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = "DigHoleCheck"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C20441214yg.LIZIZ(r1, r0)
        L69:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Exception -> La5
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Exception -> La5
            X.08BY r0 = X.C2075208Ba.LIZIZ     // Catch: java.lang.Exception -> La5
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Exception -> La5
            X.08Bd r3 = (X.InterfaceC2075508Bd) r3     // Catch: java.lang.Exception -> La5
            X.08Bb r0 = X.C2075208Ba.LIZJ     // Catch: java.lang.Exception -> La5
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Exception -> La5
            X.08Bd r2 = (X.InterfaceC2075508Bd) r2     // Catch: java.lang.Exception -> La5
            if (r3 == 0) goto L97
            boolean r0 = r3.LIZJ(r7)     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L97
            r1 = 1
            goto L98
        L97:
            r1 = 0
        L98:
            if (r2 == 0) goto La3
            if (r3 == r2) goto La3
            boolean r0 = r2.LIZJ(r7)     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto La3
            goto Lab
        La3:
            r0 = 0
            goto Lac
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La9:
            r4 = 0
            goto Lb0
        Lab:
            r0 = 1
        Lac:
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La9
        Lb0:
            r6.LIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2075208Ba.<init>(android.content.Context):void");
    }
}
