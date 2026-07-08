package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.aigc.NoticeService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS194S0000000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542380LOy {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"business_type", "task_type", "payload", "redirect_url"});
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(482));

    public static final String LIZ(Uri uri) throws JSONException {
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!LIZ.contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : arrayList) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            jSONObject.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static final <T> T LIZIZ(Class<T> cls, String str) {
        try {
            T t = (T) ((Gson) LIZIZ.getValue()).LJII("{}", cls);
            if (t == null) {
                return null;
            }
            List listLIZ = C20714089o.LIZ(t);
            if (!((ArrayList) listLIZ).isEmpty()) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deserializeParams failed: payload missing and class has required fields: ");
                sbLIZ.append(listLIZ);
                sbLIZ.append(", class=");
                sbLIZ.append(cls.getSimpleName());
                sbLIZ.append(", url=");
                sbLIZ.append(str);
                c547140Ld2.LIZIZ("AIGCInnerPushDelegate", C2188811AlT.LIZIZ(sbLIZ), null);
                return null;
            }
            C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deserializeParams: payload missing, created default instance for ");
            sbLIZ2.append(cls.getSimpleName());
            c547140Ld22.LIZ("AIGCInnerPushDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            return t;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("deserializeParams failed: payload missing, class=");
            sbLIZ3.append(cls.getSimpleName());
            sbLIZ3.append(", url=");
            sbLIZ3.append(str);
            c547140Ld23.LIZIZ("AIGCInnerPushDelegate", C2188811AlT.LIZIZ(sbLIZ3), null);
            return null;
        }
    }

    public static final void LIZJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        C542370LOx.LIZ.getClass();
        NoticeService noticeServiceLIZ = C542370LOx.LIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(innerPushMessage.getType(), "type");
        String label = innerPushMessage.getLabel();
        if (label == null) {
            label = "";
        }
        c0lab.LJ("push_label", label);
        c0lab.LJFF("accept", z);
        c0lab.LJ("msg", str);
        noticeServiceLIZ.onEventV3("aikit_notice_inner_push_accept", c0lab.LIZ);
    }
}
