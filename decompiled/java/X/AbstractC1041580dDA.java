package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;

/* JADX INFO: renamed from: X.0dDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1041580dDA {
    public static boolean LJII(String str) {
        if (!C2093608Ic.LJ(str) && "1".equals(str)) {
            return true;
        }
        return false;
    }

    public static Intent LJFF(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                return null;
            }
            boolean zLJII = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "no_hw"));
            boolean zLJII2 = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_more"));
            boolean zLJII3 = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_bar"));
            boolean zLJII4 = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_status_bar"));
            boolean zLJII5 = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_nav_bar"));
            boolean zLJII6 = LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hide_more"));
            if (zLJII3 || zLJII5) {
                intent.putExtra("hide_nav_bar", true);
            }
            if (zLJII4) {
                intent.putExtra("hide_status_bar", true);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ad_id");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                try {
                    intent.putExtra("ad_id", CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String strDecode = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "UTF-8");
            intent.setData(UriProtector.parse(strDecode));
            intent.putExtra("swipe_mode", 2);
            intent.putExtra("show_toolbar", true);
            if (zLJII) {
                intent.putExtra("bundle_no_hw_acceleration", true);
            }
            if (zLJII2) {
                intent.putExtra("hide_more", true);
            }
            if (!zLJII6) {
                intent.putExtra("hide_more", zLJII6);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
            if (C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strDecode), "title");
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title_extra");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
            }
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                intent.putExtra("title", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("use_webview_title", true);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                intent.putExtra("gd_label", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_ext_json");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) {
                intent.putExtra("gd_ext_json", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "webview_track_key");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) {
                intent.putExtra("webview_track_key", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "wap_headers");
            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8)) {
                intent.putExtra("wap_headers", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                return intent;
            }
            return intent;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static boolean LIZIZ(Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str))) {
            if (!UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str).equals("1") && !UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str).equals("true")) {
                return false;
            }
            return true;
        }
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(android.net.Uri r3, android.os.Bundle r4, java.lang.String r5) {
        /*
            java.lang.String r2 = "#"
            if (r3 == 0) goto L5
            goto L7
        L5:
            r1 = 0
            goto L17
        L7:
            boolean r0 = r3.isHierarchical()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L5
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r5)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L5
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r5)     // Catch: java.lang.Exception -> L4e
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            java.lang.String r0 = r4.getString(r5)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L29
            java.lang.String r1 = r4.getString(r5)     // Catch: java.lang.Exception -> L4e
        L29:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L43
            boolean r0 = r1.contains(r2)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L43
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L4e
            r0.append(r2)     // Catch: java.lang.Exception -> L4e
            r0.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Exception -> L4e
        L43:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L52
            int r0 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L4e
            return r0
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            r0 = -2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1041580dDA.LIZJ(android.net.Uri, android.os.Bundle, java.lang.String):int");
    }

    public static int LIZLLL(Uri uri, Bundle bundle, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri == null || !uri.isHierarchical() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) == null) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(str);
        }
    }

    public static String LJ(Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str))) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        }
        if (bundle != null && !TextUtils.isEmpty(bundle.getString(str))) {
            return bundle.getString(str);
        }
        return null;
    }

    public static Object LJIIIIZZ(Uri uri, String str, Class cls) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return null;
        }
        if (cls == String.class) {
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        if (cls == Integer.class) {
            return Integer.valueOf(CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        if (cls == Long.class) {
            return Long.valueOf(CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        if (cls == Boolean.class) {
            return Boolean.valueOf(Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        if (cls == Float.class) {
            return Float.valueOf(CastFloatProtector.parseFloat(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        if (cls == Double.class) {
            return Double.valueOf(CastDoubleProtector.parseDouble(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        return null;
    }

    public static boolean LIZ(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri != null && uri.isHierarchical() && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str) != null) {
            return TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), "1");
        }
        if (bundle != null) {
            return bundle.getBoolean(str, z);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T LJI(android.net.Uri r1, java.lang.String r2, android.os.Bundle r3, java.lang.String r4, java.lang.Class<T> r5, T r6) {
        /*
            if (r1 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L1f
            boolean r0 = r1.isHierarchical()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L1f
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r2)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L1f
            java.lang.Object r1 = LJIIIIZZ(r1, r2, r5)     // Catch: java.lang.Exception -> L36
            boolean r0 = r5.isInstance(r1)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L1f
            goto L3b
        L1f:
            if (r3 == 0) goto L3a
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L3a
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.OutOfMemoryError -> L2c java.lang.Exception -> L31
            goto L3b
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L36
            goto L3a
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L36
            goto L3a
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3a:
            r1 = 0
        L3b:
            if (r1 == 0) goto L3e
            return r1
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1041580dDA.LJI(android.net.Uri, java.lang.String, android.os.Bundle, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }
}
