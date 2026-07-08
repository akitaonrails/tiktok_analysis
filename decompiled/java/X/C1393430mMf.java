package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393430mMf {
    public static final C1393430mMf LIZ = new C1393430mMf();
    public static final List<Pair<String, String>> LIZIZ = new ArrayList();
    public static String LIZJ;
    public static boolean LIZLLL;

    public static String LIZJ(Uri uri) {
        List listLJJLIIIJILLIZJL;
        String host = uri.getHost();
        String path = uri.getPath();
        if (!Intrinsics.LJFF(host, "item") && !Intrinsics.LJFF(host, "musical")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(host);
            sbLIZ.append(path);
            if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/video") && !Intrinsics.LJFF(host, "detail")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(host);
                sbLIZ2.append(path);
                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2), "aweme/detail/", false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(host);
                    sbLIZ3.append(path);
                    if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ3), "tuwen/detail/", false)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(host);
                        sbLIZ4.append(path);
                        if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ4), "story/detail/", false)) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(host);
                            sbLIZ5.append(path);
                            if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ5), "aweme/push_detail")) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(host);
                                sbLIZ6.append(path);
                                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ6), "aweme/detail_list", false)) {
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(host);
                                    sbLIZ7.append(path);
                                    if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ7), "tuwen/detail_list", false)) {
                                        return null;
                                    }
                                }
                            }
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_params");
                            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                                try {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = JSONObjectProtectorUtils.getString(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), "gids");
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new String[]{","}, 0, 6)) == null) {
                                return null;
                            }
                            return (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                        }
                    }
                }
                return uri.getLastPathSegment();
            }
        }
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        String strLIZIZ = C0Q68.LIZIZ(str, jSONObject);
        if (strLIZIZ != null) {
            List<Pair<String, String>> list = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("push:");
            sbLIZ.append(str);
            ((ArrayList) list).add(new Pair(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ));
        }
    }

    public static void LIZ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            ((ArrayList) LIZIZ).add(new Pair(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
    }
}
