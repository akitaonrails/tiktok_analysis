package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0JKB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0JKB implements InterfaceC490020JJo {
    @Override // X.InterfaceC490020JJo
    public boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        String string;
        String path;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        for (C0JK4 c0jk4 : LIZ()) {
            if (c0jk4.LIZIZ == C0JKP.COMPULSORY && ((uri2 = c2436109gd.LIZ) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, c0jk4.LIZ)) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0)) {
                C0JKC.LIZ(C0JJR.MISSING_COMPULSORY_PARAM, c2436109gd.LIZ);
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Schema error: Missing P0 param ");
                    sbLIZ.append(c0jk4.LIZ);
                    C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            }
            if (c0jk4.LIZIZ == C0JKP.IMPORTANT && ((uri = c2436109gd.LIZ) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, c0jk4.LIZ)) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0)) {
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Schema warning: Missing P1 param ");
                    sbLIZ2.append(c0jk4.LIZ);
                    C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        Uri uri3 = c2436109gd.LIZ;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("ttlive_pcs_schema_parser_success");
        String str = "";
        if (uri3 == null || (string = uri3.toString()) == null) {
            string = "";
        }
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        string.toString();
        map2.put("url", string);
        if (uri3 == null || (path = uri3.getPath()) == null) {
            path = "";
        }
        c512030K6fLIZ.LIZIZ.put("path", path);
        if (uri3 != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "show_entrance");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
            } else {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            }
        }
        c512030K6fLIZ.LIZIZ.put("show_entrance", str);
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        return false;
    }
}
