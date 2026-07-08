package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330570kjH extends C1321250kUF {
    public final InterfaceC658750Psf LIZIZ;
    public final C1331510kkn LIZJ;
    public long LIZLLL = -1;

    public C1330570kjH(C1331510kkn c1331510kkn) {
        this.LIZJ = c1331510kkn;
        this.LIZIZ = c1331510kkn.LJJJJ;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        if (this.LIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", false);
                jSONObject.put("scene_tag", this.LIZJ.LJJIIJ);
                if (th != null) {
                    jSONObject.put("err_msg", th.getMessage());
                }
                this.LIZIZ.Ck(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        this.LIZLLL = System.currentTimeMillis();
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(this.LIZJ.hashCode(), "FrescoSensibleListener", "onSubmit");
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJIIJ(String str, C1325710kbR c1325710kbR) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id:");
        sbLIZ.append(str);
        C1330590kjJ.LJIIIIZZ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onRelease", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJII(String str, C1325710kbR c1325710kbR, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable:");
        sbLIZ.append(th);
        C1330590kjJ.LIZLLL(this.LIZJ.hashCode(), "FrescoSensibleListener", "onFailure", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", false);
                jSONObject.put("scene_tag", this.LIZJ.LJJIIJ);
                if (th != null) {
                    jSONObject.put("err_msg", th.getMessage());
                }
                this.LIZIZ.Ck(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIJJI(String str, Object obj, C1325710kbR c1325710kbR, Map map) {
        int height;
        int width;
        int iCurrentTimeMillis;
        C1330000kiM imageFormat;
        int i;
        int imageCount;
        String str2;
        if (C1330590kjJ.LIZ) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("id: ");
            sbLIZ.append(str);
            sbLIZ.append("   imageRequest:");
            sbLIZ.append(c1325710kbR);
            C1330590kjJ.LIZ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onFinalImageSet", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("id: ");
            sbLIZ2.append(str);
            C1330590kjJ.LIZ(this.LIZJ.hashCode(), "FrescoSensibleListener", "onFinalImageSet", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (c1325710kbR == null) {
            return;
        }
        C1322050kVX c1322050kVX = c1325710kbR.LJJ;
        if (c1322050kVX != null) {
            height = c1322050kVX.LJFF().getHeight();
            width = c1322050kVX.LJFF().getWidth();
        } else {
            height = 0;
            width = 0;
        }
        new Rect();
        String string = c1325710kbR.LIZIZ.toString();
        if (this.LIZLLL > 0) {
            iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZLLL);
        } else {
            iCurrentTimeMillis = -1;
        }
        int i4 = 1;
        if (obj instanceof AbstractC1327750kej) {
            AbstractC1327750kej abstractC1327750kej = (AbstractC1327750kej) obj;
            imageCount = abstractC1327750kej.getImageCount();
            imageFormat = abstractC1327750kej.getImageFormat();
            if (abstractC1327750kej.isRequestInternet) {
                i = 0;
            } else if (abstractC1327750kej.isHitDiskCache) {
                i = 2;
            } else if (abstractC1327750kej.isHitMemoryCache()) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            imageFormat = null;
            i = -1;
            imageCount = -1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSuccess", true);
            jSONObject.put("view_width", width);
            jSONObject.put("view_height", height);
            HashMap map2 = (HashMap) map;
            jSONObject.put("image_width", map2.get("drawableWidth"));
            jSONObject.put("image_height", map2.get("drawableHeight"));
            jSONObject.put("duration", iCurrentTimeMillis);
            jSONObject.put("from", i);
            if (imageFormat == null) {
                str2 = "undefined";
            } else {
                str2 = imageFormat.LIZIZ;
            }
            jSONObject.put("image_type", str2);
            jSONObject.put("image_sdk_version", "1.15.07.4-tiktok");
            jSONObject.put("image_count", imageCount);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("uri", string);
            jSONObject.put("scene_tag", map2.get("scene_tag"));
            if (TextUtils.isEmpty(jSONObject.optString("biz_tag"))) {
                Uri uri = UriProtector.parse(string);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_tag");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    try {
                        jSONObject.put("biz_tag", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (c1322050kVX != null) {
                Context context = c1322050kVX.LJFF().getContext();
                if (context instanceof Activity) {
                    jSONObject.put("page_tag", context.getClass().getSimpleName());
                }
            }
            jSONObject.put("exception_tag", 1);
            if (i != 2 && i != 1) {
                i4 = 0;
            }
            jSONObject.put("hit_cache", i4);
            if (i == -1) {
                i = 0;
            }
            jSONObject.put("hit_type", i);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        InterfaceC658750Psf interfaceC658750Psf = this.LIZIZ;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.Ck(jSONObject);
        }
    }

    @Override // X.C1321250kUF, X.C1320700kTM
    public final void LJIIIIZZ(String str, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        if (c1325710kbR != null) {
            try {
                Uri uri = c1325710kbR.LIZIZ;
                if (C1326230kcH.LJIILL(uri.getHost()) || C1326230kcH.LJIILJJIL(uri)) {
                    C1326230kcH.LJIIL(c1325710kbR, Long.valueOf(Long.valueOf(this.LIZLLL).longValue()), (String) ((HashMap) map).get("scene_tag"));
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
        }
        LJIIJJI(str, obj, c1325710kbR, map);
    }
}
