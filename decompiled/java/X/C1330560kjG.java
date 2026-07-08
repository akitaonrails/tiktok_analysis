package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330560kjG extends C1321250kUF {
    public static boolean LIZIZ;
    public static final HashMap<C1325710kbR, Long> LIZJ = new HashMap<>();
    public static final SparseArray<Long> LIZLLL = new SparseArray<>();
    public static boolean LJ = false;

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJI(C1325710kbR c1325710kbR, long j) {
        try {
            if (LJ) {
                if (c1325710kbR != null) {
                    LIZLLL.put(c1325710kbR.hashCode(), Long.valueOf(j));
                    return;
                }
                return;
            }
            LIZJ.put(c1325710kbR, Long.valueOf(j));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onControllerStart mImageLoadDurationMap put element failed! t = ");
            sbLIZ.append(th);
            C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJIIJ(String str, C1325710kbR c1325710kbR) {
        try {
            if (!LJ) {
                LIZJ.remove(c1325710kbR);
            } else if (c1325710kbR != null) {
                LIZLLL.remove(c1325710kbR.hashCode());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRelease mImageLoadDurationMap put element failed! t = ");
            sbLIZ.append(th);
            C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIJJI(JSONObject jSONObject, C1325710kbR c1325710kbR, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        } else {
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "s");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && c1325710kbR != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1325710kbR.LJJJJI;
        }
        jSONObject.putOpt(Scene.SCENE_SERVICE, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sc");
        }
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && c1325710kbR != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = c1325710kbR.LJJJJIZL;
        }
        jSONObject.putOpt("scene_category", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
    }

    public static void LJIIL(JSONObject jSONObject, String str, C1325710kbR c1325710kbR) {
        Map map;
        List<InterfaceC589610NAp> list = C1330620kjM.LIZLLL;
        synchronized (list) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    Pair pairLIZ = ((InterfaceC589610NAp) it2.next()).LIZ(null, null, jSONObject, true, false);
                    if (pairLIZ != null && (map = (Map) pairLIZ.second) != null) {
                        try {
                            for (String str2 : map.keySet()) {
                                jSONObject.put(str2, map.get(str2));
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String strOptString = jSONObject.optString("biz_tag");
        Uri uri = UriProtector.parse(str);
        if (TextUtils.isEmpty(strOptString)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_tag");
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
            }
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && c1325710kbR != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1325710kbR.LJJJJ;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                try {
                    jSONObject.put("biz_tag", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } catch (JSONException e2) {
                }
            }
        }
        LJIIJJI(jSONObject, c1325710kbR, uri);
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJII(String str, C1325710kbR c1325710kbR, Throwable th) {
        try {
            if (!LJ) {
                LIZJ.remove(c1325710kbR);
            } else if (c1325710kbR != null) {
                LIZLLL.remove(c1325710kbR.hashCode());
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFailure mImageLoadDurationMap put element failed! t = ");
            sbLIZ.append(th2);
            C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:58:0x00fe, B:60:0x0102, B:62:0x010c), top: B:76:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:58:0x00fe, B:60:0x0102, B:62:0x010c), top: B:76:0x00fe }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.Object r22, final X.C1325710kbR r23, final java.util.Map r24) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1330560kjG.LJIILIIL(java.lang.Object, X.0kbR, java.util.Map):void");
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJIIIIZZ(String str, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        if (c1325710kbR != null) {
            try {
                C1326230kcH.LJIILL(c1325710kbR.LIZIZ.getHost());
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
        }
        LJIILIIL(obj, c1325710kbR, map);
    }

    public static void LJIILJJIL(int i, int i2, Map map, int i3, C1330000kiM c1330000kiM, String str, boolean z, int i4, int i5, C1322050kVX c1322050kVX, C1325710kbR c1325710kbR) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("view_width", i);
            jSONObject.put("view_height", i2);
            jSONObject.put("image_width", map.get("drawableWidth"));
            jSONObject.put("image_height", map.get("drawableHeight"));
            jSONObject.put("duration", i3);
            jSONObject.put("from", i5);
            if (c1330000kiM == null) {
                str2 = "undefined";
            } else {
                str2 = c1330000kiM.LIZIZ;
            }
            jSONObject.put("image_type", str2);
            jSONObject.put("image_sdk_version", "1.15.07.4-tiktok");
            jSONObject.put("log_type", "image_sensible_monitor");
            jSONObject.put("image_count", i4);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("uri", str);
            jSONObject.put("scene_tag", map.get("scene_tag"));
            LJIIL(jSONObject, str, c1325710kbR);
            Context context = c1322050kVX.LJFF().getContext();
            if (context instanceof Activity) {
                jSONObject.put("page_tag", context.getClass().getSimpleName());
            }
            int i6 = 1;
            jSONObject.put("exception_tag", 1);
            int i7 = 0;
            if (i5 != 2 && i5 != 1 && i5 != 3) {
                i6 = 0;
            }
            jSONObject.put("hit_cache", i6);
            if (i5 != -1) {
                i7 = i5;
            }
            jSONObject.put("hit_type", i7);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1328570kg3.LIZ.LIZIZ(5)) {
                C1328570kg3.LIZ.w("UserSenceListener", "JSONException in FrescoControllerListener");
            }
        }
        if (z) {
            if (C1328730kgJ.LJIIIIZZ) {
                if (i3 > 0) {
                    for (InterfaceC1330840kji interfaceC1330840kji : (ArrayList) C1330620kjM.LIZJ) {
                        if (interfaceC1330840kji != null) {
                            interfaceC1330840kji.LIZIZ();
                        }
                    }
                    if (C1330620kjM.LJIIIIZZ.LJFF) {
                        AppLogNewUtils.onEventV3("image_sensible_monitor_v3", jSONObject);
                    } else {
                        C793770VBv.LJ("image_sensible_monitor", jSONObject);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("User sence tracking upload successful, content: ");
                    sbLIZ.append(jSONObject);
                    C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            for (InterfaceC1330840kji interfaceC1330840kji2 : (ArrayList) C1330620kjM.LIZJ) {
                if (interfaceC1330840kji2 != null) {
                    interfaceC1330840kji2.LIZIZ();
                }
            }
            if (C1330620kjM.LJIIIIZZ.LJFF) {
                AppLogNewUtils.onEventV3("image_sensible_monitor_v3", jSONObject);
            } else {
                C793770VBv.LJ("image_sensible_monitor", jSONObject);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("User sence tracking upload successful, content: ");
            sbLIZ2.append(jSONObject);
            C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c1322050kVX.LJFF();
        for (InterfaceC1330840kji interfaceC1330840kji3 : (ArrayList) C1330620kjM.LIZJ) {
            if (interfaceC1330840kji3 != null) {
                interfaceC1330840kji3.LIZ();
            }
        }
    }
}
