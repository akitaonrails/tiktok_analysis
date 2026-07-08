package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18LC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LC {
    public static final List<C18LB> LIZ = C1697810uHb.LJIIJJI(new C18LB() { // from class: X.18LG
        @Override // X.C18LB
        public final boolean LIZ(String str, String str2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "aweme/detail/", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2), "tuwen/detail/", false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(str2);
                    if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ3), "story/detail/", false)) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // X.C18LB
        public final void LIZIZ(Uri uri, boolean z) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_campaign_info")) != null) {
                C18LI.LIZ.getClass();
                C18LI.LJFF(lastPathSegment, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z);
            }
        }
    }, new C18LB() { // from class: X.18LF
        @Override // X.C18LB
        public final boolean LIZ(String str, String str2) {
            return Intrinsics.LJFF(str, "detail");
        }

        @Override // X.C18LB
        public final void LIZIZ(Uri uri, boolean z) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_campaign_info")) != null) {
                C18LI.LIZ.getClass();
                C18LI.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z);
            }
        }
    });
}
