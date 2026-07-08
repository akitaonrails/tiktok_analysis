package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138370fjH {
    public static final C1138370fjH LIZ = new C1138370fjH();

    public static long LIZIZ(long j, Uri uri) {
        if (uri != null) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "max_ready_duration");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    return j;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Object objValueOf = Long.valueOf(j);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = objValueOf;
                }
                return ((Number) c098200Yq).longValue();
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [REQ extends X.0fmT, X.0fmT] */
    /* JADX WARN: Type inference failed for: r0v20, types: [REQ extends X.0fmT, X.0fmT] */
    /* JADX WARN: Type inference failed for: r0v7, types: [REQ extends X.0fmT, X.0fmT] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1140030flx LIZ(final com.bytedance.ies.sdk.datachannel.DataChannel r41, com.bytedance.android.livesdk.gift.assets.AssetsModel r42, X.C1135280feI r43, android.net.Uri r44) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1138370fjH.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.gift.assets.AssetsModel, X.0feI, android.net.Uri):X.0flx");
    }
}
