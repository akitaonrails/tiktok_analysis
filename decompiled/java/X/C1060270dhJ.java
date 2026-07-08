package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060270dhJ extends AbstractC1060280dhK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Context context;
        JSONObject jSONObjectOptJSONObject;
        View view;
        InterfaceC1060290dhL interfaceC1060290dhL = (InterfaceC1060290dhL) xBaseParamModel;
        String type = interfaceC1060290dhL.getType();
        if (type != null && type.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "type is empty", null, 4);
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = interfaceC1060290dhL.toJSON().optJSONObject("args");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        if (Intrinsics.LJFF(type, "scheme")) {
            String string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject2, "url");
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            Uri uri = UriProtector.parse(string);
            if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_label"))) {
                string = uri.buildUpon().build().toString();
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("extra");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("btm_params")) != null) {
                String strOptString = jSONObjectOptJSONObject.optString("btm");
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("bcm");
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    view = interfaceC634840OvC2.getView();
                } else {
                    view = null;
                }
                if (strOptString.length() > 0 && view != null) {
                    C21244318Bt c21244318Bt = new C21244318Bt();
                    c21244318Bt.LIZ = strOptString;
                    c21244318Bt.LIZIZ = PageFinder.via(view);
                    BcmParams.Companion.getClass();
                    c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject4);
                    String strCreateJumpSourceBtmTokenForJSB = BtmSDK.INSTANCE.createJumpSourceBtmTokenForJSB(c21244318Bt);
                    if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                        Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                        builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                        string = builderBuildUpon.build().toString();
                    }
                }
            }
            boolean z2 = JSONObjectProtectorUtils.getBoolean(jSONObjectOptJSONObject2, "is_enigma");
            String string2 = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject2, "click_user_position");
            if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_enigma"))) {
                Uri.Builder builderBuildUpon2 = UriProtector.parse(string).buildUpon();
                builderBuildUpon2.appendQueryParameter("is_enigma", String.valueOf(z2));
                string = builderBuildUpon2.build().toString();
            }
            if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "click_user_position"))) {
                Uri.Builder builderBuildUpon3 = UriProtector.parse(string).buildUpon();
                builderBuildUpon3.appendQueryParameter("click_user_position", string2);
                string = builderBuildUpon3.build().toString();
            }
            if (context != null) {
                SmartRouter.buildRoute(context, string).open();
                InterfaceC1060300dhM interfaceC1060300dhM = (InterfaceC1060300dhM) C1909107dp.LIZJ(InterfaceC1060300dhM.class, null);
                interfaceC1060300dhM.setCode(1);
                completionBlock.onSuccess(interfaceC1060300dhM, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        InterfaceC1060300dhM interfaceC1060300dhM2 = (InterfaceC1060300dhM) C1909107dp.LIZJ(InterfaceC1060300dhM.class, null);
        interfaceC1060300dhM2.setCode(1);
        completionBlock.onSuccess(interfaceC1060300dhM2, "");
    }
}
