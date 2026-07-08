package X;

import com.bytedance.android.livesdk.api.revenue.strategy.guide.TriggerApi;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C206400qs {
    public static final /* synthetic */ C206400qs LIZ = new C206400qs();

    public static void LIZ(boolean z, String str, String str2, int i, String str3, String str4, int i2) {
        String str5;
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        Pair[] pairArr = new Pair[5];
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", str5);
        pairArr[1] = new Pair("biz_name", str);
        pairArr[2] = new Pair("trigger_type", str2);
        pairArr[3] = new Pair("error_code", Integer.valueOf(i));
        pairArr[4] = new Pair("error_message", str3);
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIIIZZ(pairArr));
        JSONObject jSONObject2 = new JSONObject(C2097908Jt.LIZJ(new Pair("log_id", str4)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_guide_request");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LIZJ("gift_guide_request", jSONObject, null, jSONObject2);
    }

    public static void LIZIZ(long j, List list, String str, long j2, String str2, String str3, String str4, String str5, String str6) {
        long j3 = j2;
        boolean zLJI = MethodIDManager.LJI(137763);
        if (j3 < 1) {
            j3 = 1;
        }
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<GiftGuideTriggerResponse.Data>> c11nzGuideTriggerRequest = ((TriggerApi) C480460Ism.LIZLLL(TriggerApi.class)).guideTriggerRequest(j, C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62), str, j3, str2, str3, str4, str5, str6);
        if (c11nzGuideTriggerRequest != null) {
            c11nzGuideTriggerRequest.LJJLL(new C516801zq(list, str, 5), new C516801zq(list, str, 6));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
