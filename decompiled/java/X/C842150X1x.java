package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS100S0110000_13;
import kotlin.jvm.internal.AwS379S0200000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842150X1x {
    public static void LJI(C842160X1y c842160X1y) {
        try {
            JSONObject jSONObject = new JSONObject();
            float f = c842160X1y.LIZIZ;
            if (f > 0.0f) {
                jSONObject.put("checkCostTime", Float.valueOf(f));
            }
            jSONObject.put("isBlocked", c842160X1y.LIZJ);
            jSONObject.put("needAlarm", c842160X1y.LIZLLL);
            jSONObject.put("isHitCache", c842160X1y.LJ);
            jSONObject.put("isSafeCanvas", c842160X1y.LJFF);
            jSONObject.put("abnormalType", c842160X1y.LJIIIIZZ);
            jSONObject.put("abnormalDomain", c842160X1y.LJI);
            jSONObject.put("abnormalClass", c842160X1y.LJII);
            C839960WxG c839960WxG = C839960WxG.LIZ;
            c839960WxG.LIZ(jSONObject);
            if (c842160X1y.LIZLLL) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("isBlocked", String.valueOf(c842160X1y.LIZJ));
                linkedHashMap.put("needAlarm", String.valueOf(c842160X1y.LIZLLL));
                linkedHashMap.put("abnormalType", String.valueOf(c842160X1y.LJIIIIZZ));
                String str = c842160X1y.LJI;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("abnormalDomain", str);
                String str3 = c842160X1y.LJII;
                if (str3 != null) {
                    str2 = str3;
                }
                linkedHashMap.put("abnormalClass", str2);
                Throwable th = c842160X1y.LJIIIZ;
                if (th == null) {
                    th = new Throwable();
                }
                c839960WxG.LIZIZ(th, linkedHashMap);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static C825940Wae LIZ(Cert cert, String str) {
        return new C825940Wae(cert, str, new String[]{"screenShot"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.graphics.Canvas r9, android.view.View r10) {
        /*
            boolean r0 = X.C839810Wx1.LIZ
            if (r0 != 0) goto L8
            r10.draw(r9)
            return
        L8:
            X.0X1y r4 = new X.0X1y
            r4.<init>()
            long r0 = java.lang.System.nanoTime()
            r4.LIZ = r0
            r5 = 2131385068(0x7f0a5aec, float:1.8390556E38)
            java.lang.Object r1 = r10.getTag(r5)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lbc
            r6 = 0
            if (r0 == 0) goto L41
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lbc
        L21:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)     // Catch: java.lang.Throwable -> Lbc
            r7 = 2131385069(0x7f0a5aed, float:1.8390558E38)
            r8 = 0
            r2 = 1
            if (r0 == 0) goto L45
            java.lang.Object r1 = r10.getTag(r7)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L3f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lbc
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L45
            goto L43
        L3f:
            r1 = r6
            goto L38
        L41:
            r1 = r6
            goto L21
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r4.LJ = r0     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto La7
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbc
            r0 = 29
            if (r1 < r0) goto L55
            boolean r8 = r9 instanceof android.graphics.RecordingCanvas     // Catch: java.lang.Throwable -> Lbc
        L52:
            r4.LJFF = r8     // Catch: java.lang.Throwable -> Lbc
            goto L77
        L55:
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "android.view.DisplayListCanvas"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L75
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "android.view.GLES20RecordingCanvas"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L52
        L75:
            r8 = 1
            goto L52
        L77:
            if (r8 != 0) goto L93
            boolean r0 = LJFF(r10, r10, r4)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L93
            r4.LIZLLL = r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Throwable -> Lbc
            r0.<init>()     // Catch: java.lang.Throwable -> Lbc
            r4.LJIIIZ = r0     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = X.C839810Wx1.LIZIZ     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L8f
            r4.LIZJ = r2     // Catch: java.lang.Throwable -> Lbc
            goto Lb8
        L8f:
            r10.draw(r9)     // Catch: java.lang.Throwable -> Lbc
            goto Lb8
        L93:
            java.lang.Object r1 = r10.getTag(r7)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L9e
            r6 = r1
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lbc
        L9e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto La7
            r10.setTag(r5, r3)     // Catch: java.lang.Throwable -> Lbc
        La7:
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lbc
            long r0 = r4.LIZ     // Catch: java.lang.Throwable -> Lbc
            long r2 = r2 - r0
            float r1 = (float) r2     // Catch: java.lang.Throwable -> Lbc
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r0
            r4.LIZIZ = r1     // Catch: java.lang.Throwable -> Lbc
            r10.draw(r9)     // Catch: java.lang.Throwable -> Lbc
        Lb8:
            LJI(r4)
            return
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbc
            LJI(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842150X1x.LIZIZ(android.graphics.Canvas, android.view.View):void");
    }

    public static Bitmap LIZLLL(View view, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert, "View_getDrawingCache");
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/View", "getDrawingCache()Landroid/graphics/Bitmap;", null);
        return (Bitmap) C838080WuE.LIZ(c825940WaeLIZ, new AwS592S0100000_13(view, 97));
    }

    public static void LIZJ(View view, Canvas canvas, Cert cert) {
        if (!C839810Wx1.LIZ) {
            view.draw(canvas);
            return;
        }
        C825940Wae c825940WaeLIZ = LIZ(cert, "View_checkDrawForCaptureView");
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/View", "draw(Landroid/graphics/Canvas;)V", C2097908Jt.LIZJ(new Pair("canvas", canvas)));
        C838080WuE.LIZ(c825940WaeLIZ, new AwS379S0200000_13(canvas, view, 22));
    }

    public static Bitmap LJ(View view, boolean z, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert, "View_getDrawingCache");
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/View", "getDrawingCache(Z)Landroid/graphics/Bitmap;", C2097908Jt.LIZJ(new Pair("autoScale", Boolean.valueOf(z))));
        return (Bitmap) C838080WuE.LIZ(c825940WaeLIZ, new AwS100S0110000_13(view, z, 2));
    }

    public static boolean LJFF(View view, View view2, C842160X1y c842160X1y) {
        String lowerCase = null;
        if (view instanceof WebView) {
            view2.setTag(R.id.qvt, Boolean.TRUE);
            String url = ((WebView) view).getUrl();
            if (url != null) {
                if (url.length() != 0) {
                    String host = UriProtector.parse(url).getHost();
                    if (host != null) {
                        lowerCase = host.toLowerCase(Locale.ROOT);
                    }
                    for (String str : C0X56.LIZIZ) {
                        if (lowerCase == null || !u.LJIIZILJ(lowerCase, str, false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('.');
                            sbLIZ.append(lowerCase);
                            if (!u.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ), str, false)) {
                            }
                        }
                    }
                }
                String host2 = UriProtector.parse(url).getHost();
                c842160X1y.LJIIIIZZ = 1;
                c842160X1y.LJI = host2;
                return false;
            }
        }
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            return false;
        }
        Iterator<String> it2 = C0X56.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (u.LJJIIJZLJL(canonicalName, next, false)) {
                if (next != null) {
                    c842160X1y.LJIIIIZZ = 2;
                    c842160X1y.LJII = canonicalName;
                    return false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!LJFF(viewGroup.getChildAt(i), view2, c842160X1y)) {
                    return false;
                }
            }
        }
        return true;
    }
}
