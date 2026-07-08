package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.settings.PnsOpenThirdWebModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065540dpo extends AbstractC1065580dps {
    public static final Map<String, String> LIZJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return linkedHashMap;
    }

    public static final boolean LJ(Context context, String str) {
        String scheme;
        String scheme2;
        if (str == null || str.length() == 0) {
            return false;
        }
        final AwS165S1100000_16 awS165S1100000_16 = new AwS165S1100000_16(context, str, 25);
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
                    new C828330WeV(new ThirdPartyBizCert(0)).LIZIZ(context, uri.toString(), new InterfaceC828360WeY() { // from class: X.0dpv
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r13, X.InterfaceC1065560dpq r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1065540dpo.LIZLLL(java.lang.String, X.0dpq):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r19, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r20, X.EnumC1063300dmC r21) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1065540dpo.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
