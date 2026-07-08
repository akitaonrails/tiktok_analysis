package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1595706Mp {
    public static final C1595706Mp LIZ = new C1595706Mp();

    public static boolean LIZ(Context context, String str, SessionInfo sessionInfo, String str2, Function0 function0) throws JSONException {
        boolean z;
        String strDecode;
        String conversationId;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Fragment fragmentLIZLLL;
        C19EG activity;
        String singleChatFromUserId;
        if (str.length() == 0) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (z) {
            strDecode = C0C64.LJIILLIIL().LJJ(31744, "im_b2c_chat_disclaimer_page_url_v3", "", true);
        } else {
            strDecode = Uri.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        Map<String, String> mapLIZJ = C018G.LIZJ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "chat");
        jSONObject.put("enter_method", str2);
        if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
            conversationId = "";
        }
        jSONObject.put("conversation_id", conversationId);
        if (sessionInfo != null && (singleChatFromUserId = sessionInfo.getSingleChatFromUserId()) != null) {
            str3 = singleChatFromUserId;
        }
        jSONObject.put("to_user_id", str3);
        for (Map.Entry entry : ((HashMap) mapLIZJ).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        if (((context == null || (activity = C1388190mED.LIZIZ(context)) == null) && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL()) == null || (activity = fragmentLIZLLL.getActivity()) == null)) || a0.LJJJIL(strDecode)) {
            return false;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.initData = strJ3;
        sparkContext.LJJLIIJ(strDecode);
        if (function0 != null) {
            sparkContext.LJJLIIIJJIZ(new C1768406wE(function0, 1));
        }
        c1537900q7g.getClass();
        new C1541950qED(activity, sparkContext).LIZIZ();
        return true;
    }
}
