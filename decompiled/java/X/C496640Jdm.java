package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496640Jdm implements InterfaceC1117210fB9 {
    @Override // X.InterfaceC1117210fB9
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    @Override // X.InterfaceC1117210fB9
    public final boolean handle(Context context, Uri uri) {
        long j;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } else {
            j = 0;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_user_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_enigma");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "click_user_position");
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            map.put("sec_user_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        }
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
            map.put("is_enigma", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
        }
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
            map.put("click_user_position", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
        }
        LIZIZ(j, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type"), map);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: Exception -> 0x013d, PHI: r5
      0x010d: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v7 java.lang.String) binds: [B:37:0x0102, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x013d, blocks: (B:36:0x00ef, B:38:0x0104, B:40:0x010d, B:45:0x011d, B:47:0x0123, B:51:0x013a, B:48:0x012b, B:50:0x0133), top: B:120:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a A[Catch: Exception -> 0x013d, TRY_LEAVE, TryCatch #1 {Exception -> 0x013d, blocks: (B:36:0x00ef, B:38:0x0104, B:40:0x010d, B:45:0x011d, B:47:0x0123, B:51:0x013a, B:48:0x012b, B:50:0x0133), top: B:120:0x00ef }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(long r11, java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496640Jdm.LIZIZ(long, java.lang.String, java.util.Map):void");
    }

    @Override // X.InterfaceC1117210fB9
    public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
        handle(context, uri);
        return true;
    }
}
