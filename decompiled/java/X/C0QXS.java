package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXS {
    public static final C0QXS LIZ = new C0QXS();

    public static Integer LIZIZ(Uri uri) {
        Integer numLJIIJJI;
        String strLIZ = C416901jj.LIZ(uri, "root_enter_from_type");
        if (strLIZ == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ)) == null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, EnumC671960QXi.MALL.getValue())) {
                return Integer.valueOf(C0QXR.MALL.getValue());
            }
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, EnumC671960QXi.HOMEPAGE_MALL.getValue())) {
                return Integer.valueOf(C0QXR.HOMEPAGE_MALL.getValue());
            }
            return null;
        }
        return numLJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0750  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r23, java.util.Map r24, android.net.Uri r25) {
        /*
            Method dump skipped, instruction units count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QXS.LIZ(int, java.util.Map, android.net.Uri):void");
    }
}
