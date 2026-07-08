package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.settings.PnsOpenThirdWebModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065550dpp extends AbstractC1065590dpt {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(176));

    public static final boolean LIZJ(Context context, String str) {
        String scheme;
        String scheme2;
        if (str == null || str.length() == 0) {
            return false;
        }
        final AwS165S1100000_16 awS165S1100000_16 = new AwS165S1100000_16(context, str, 20);
        if (!u.LJJIIJZLJL(str, "aweme://lynxview", false)) {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                scheme = uri.getScheme();
            } else {
                scheme = null;
            }
            if (!Intrinsics.LJFF(scheme, "http")) {
                if (uri != null) {
                    scheme2 = uri.getScheme();
                } else {
                    scheme2 = null;
                }
                if (!Intrinsics.LJFF(scheme2, "https")) {
                    uri = (uri == null || UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") == null) ? null : UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                }
            }
            if (context != null && uri != null) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                PnsOpenThirdWebModel pnsOpenThirdWebModel = C1886207a8.LIZ;
                PnsOpenThirdWebModel pnsOpenThirdWebModel2 = (PnsOpenThirdWebModel) settingsManagerLIZLLL.LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel2 == null) {
                    pnsOpenThirdWebModel2 = pnsOpenThirdWebModel;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel2.sysDomainList)) {
                    new C828330WeV(new ThirdPartyBizCert(0)).LIZIZ(context, uri.toString(), new InterfaceC828360WeY() { // from class: X.0dpx
                        @Override // X.InterfaceC828360WeY
                        public final void LIZ(Context context2, String str2) {
                            awS165S1100000_16.invoke();
                        }
                    }, null);
                    return true;
                }
                PnsOpenThirdWebModel pnsOpenThirdWebModel3 = (PnsOpenThirdWebModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_openthirdweb", PnsOpenThirdWebModel.class, pnsOpenThirdWebModel);
                if (pnsOpenThirdWebModel3 != null) {
                    pnsOpenThirdWebModel = pnsOpenThirdWebModel3;
                }
                if (C1886207a8.LIZ(uri, pnsOpenThirdWebModel.iabDomainList)) {
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = uri.toString();
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(0);
                    C1554300qY8.LIZIZ(context, sparkThirdContext);
                    return true;
                }
            }
        }
        return ((Boolean) awS165S1100000_16.invoke()).booleanValue();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object obj;
        Map map;
        JSONObject jSONObject;
        Object obj2;
        Context context;
        Context baseContext;
        ContextWrapper contextWrapper;
        String str;
        int iHashCode;
        LifecycleOwner lifecycleOwner;
        View view;
        View view2;
        Object c098200Yq;
        Object c098200Yq2;
        View view3;
        InterfaceC1065570dpr interfaceC1065570dpr = (InterfaceC1065570dpr) xBaseParamModel;
        String schema = interfaceC1065570dpr.getSchema();
        Map<String, Object> logParams = interfaceC1065570dpr.getLogParams();
        String containerID = null;
        if (((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
            Uri uri = UriProtector.parse(schema);
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            try {
                c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            String str3 = (String) c098200Yq2;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view3 = interfaceC634840OvC.getView()) != null) {
                if (str2 == null) {
                    if (str3 != null) {
                        str2 = "c0";
                    }
                } else if (str3 == null) {
                    str3 = "d0";
                }
                C2211631BhB.LJIJ(view3, str2, str3, null, null);
            }
        }
        Map<String, Object> extra = interfaceC1065570dpr.getExtra();
        if (extra != null) {
            obj = extra.get("btm_params");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("btm");
        if (strOptString != null && strOptString.length() != 0) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bcm");
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = strOptString;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                view2 = interfaceC634840OvC2.getView();
            } else {
                view2 = null;
            }
            c21244318Bt.LIZIZ = PageFinder.via(view2);
            BcmParams.Companion.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject);
            String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
            if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                Uri.Builder builderBuildUpon = UriProtector.parse(schema).buildUpon();
                builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                schema = builderBuildUpon.build().toString();
            }
        }
        if (logParams != null) {
            obj2 = logParams.get("from_card_type");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str = (String) obj2) != null && ((iHashCode = str.hashCode()) == -157761233 ? str.equals("music_card_shot") : iHashCode == 745819626 ? str.equals("trending_card") : !(iHashCode != 1563961651 || !str.equals("related_search_card")))) {
            ComponentCallbacks2 componentCallbacks2LJFF = C2214201BlK.LJFF();
            if ((componentCallbacks2LJFF instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LJFF) != null) {
                C1ER1 c1er1 = C1ER1.LIZIZ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    view = interfaceC634840OvC3.getView();
                } else {
                    view = null;
                }
                c1er1.LLZLL(view, lifecycleOwner);
            }
        }
        InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
        if (interfaceC634840OvC4 != null && (context = interfaceC634840OvC4.getContext()) != null) {
            if (context instanceof Activity) {
                baseContext = context;
            } else {
                if ((context instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
                    baseContext = contextWrapper.getBaseContext();
                } else {
                    baseContext = null;
                }
                if (!(baseContext instanceof Activity)) {
                    baseContext = null;
                }
            }
            if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZLLL(baseContext, schema).booleanValue() && !LIZJ(baseContext, schema)) {
                if (!TextUtils.isEmpty(schema) && a0.LJJIIZI(schema, "shoutouts/publish", false)) {
                    schema = u.LJJIII(schema, "aweme", "sslocal", false);
                } else if (!((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJI(schema)) {
                    if (schema != null) {
                        schema = u.LJJIFFI(schema, "aweme", "sslocal", false);
                    } else {
                        schema = null;
                    }
                }
                ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue();
                if (iCommercializeFromMainOutService != null) {
                    iCommercializeFromMainOutService.LJFF(context, schema, null, false);
                }
            }
        } else {
            LIZJ(null, schema);
        }
        InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
        if (interfaceC634840OvC5 != null) {
            containerID = interfaceC634840OvC5.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1065650dpz.class, containerID), "");
    }
}
