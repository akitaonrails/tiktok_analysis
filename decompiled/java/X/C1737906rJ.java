package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1737906rJ implements InterfaceC1738006rK<List<? extends SuggestedQuestion>> {
    public static final List<BusinessAutoMessage> LIZ(C869590Y9l c869590Y9l, List<SuggestedQuestion> list) throws JSONException {
        List listLJJLIIIJILLIZJL;
        Object next;
        List<BusinessAutoMessage> list2;
        List listLL;
        String str = c869590Y9l.getExt().get("a:sq_id");
        if (str == null) {
            str = "";
        }
        String str2 = c869590Y9l.getLocalExt().get("a:client_reply_uuids");
        int i = 0;
        if (str2 == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        if (!listLJJLIIIJILLIZJL.isEmpty() && C123100dR.LIZ(str)) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(String.valueOf(((SuggestedQuestion) next).id), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SuggestedQuestion suggestedQuestion = (SuggestedQuestion) next;
            if (suggestedQuestion != null && (list2 = suggestedQuestion.replies) != null && (listLL = C13LP.LL(C13LP.LJJJJLI(list2), listLJJLIIIJILLIZJL.size())) != null && (!listLL.isEmpty())) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                for (Object obj : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        BusinessAutoMessage businessAutoMessage = (BusinessAutoMessage) obj;
                        String str3 = businessAutoMessage.ext;
                        if (str3 == null) {
                            str3 = "";
                        }
                        JSONObject jSONObject = new JSONObject(str3);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("query_client_message_id", c869590Y9l.getUuid());
                        jSONObject2.put("is_mock", "1");
                        jSONObject.put("a:auto_reply_latency", C786410Ut5.J3(jSONObject2));
                        arrayList.add(BusinessAutoMessage.LIZ(businessAutoMessage, (String) ListProtector.get(listLJJLIIIJILLIZJL, i), C786410Ut5.J3(jSONObject)));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return arrayList;
            }
        }
        return null;
    }
}
