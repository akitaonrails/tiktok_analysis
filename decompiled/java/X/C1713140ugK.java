package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ugK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713140ugK extends AbstractC1713100ugG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final Activity activityLIZ;
        final String path;
        final InterfaceC1713110ugH interfaceC1713110ugH = (InterfaceC1713110ugH) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String hybridUrl = getHybridUrl(enumC1063300dmC);
            if (hybridUrl != null) {
                path = C1946007jm.LJ(hybridUrl).getPath();
            } else {
                path = null;
            }
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                interfaceC1713110ugH.getEnterFrom();
                abstractC1896090zRP.LJJIL(activityLIZ, -1, new InterfaceC1904030zeD() { // from class: X.0ugJ
                    @Override // X.InterfaceC1904030zeD
                    public final void v() {
                        C2382909Vj.LIZ(completionBlock, 1, "scan_code_fail", null, 4);
                    }

                    @Override // X.InterfaceC1904030zeD
                    public final void LIZ(Uri uri) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl")) == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = uri.toString();
                        }
                        String path2 = C1946007jm.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath();
                        InterfaceC1713110ugH interfaceC1713110ugH2 = interfaceC1713110ugH;
                        String str = path;
                        boolean z = true;
                        if (!interfaceC1713110ugH2.getShouldCloseCurrentIncentivePage() || TextUtils.isEmpty(path2) || !TextUtils.equals(str, path2)) {
                            z = false;
                        }
                        if (z && path2 != null) {
                            activityLIZ.finish();
                        }
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1713090ugF.class, null), "");
                    }
                });
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        C2382909Vj.LIZ(completionBlock, 1, "activity_is_null", null, 4);
    }
}
