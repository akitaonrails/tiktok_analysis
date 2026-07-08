package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1737806rI implements InterfaceC1738006rK<List<? extends KeywordReply>> {
    public static final List<BusinessAutoMessage> LIZ(C869590Y9l c869590Y9l, List<KeywordReply> list) throws JSONException {
        List listLJJLIIIJILLIZJL;
        String text;
        Object next;
        List<BusinessAutoMessage> list2;
        List listLJJJJLI;
        List listLL;
        if (c869590Y9l.getMsgType() == 7) {
            String str = c869590Y9l.getLocalExt().get("a:client_reply_uuids");
            int i = 0;
            if (str == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) == null) {
                listLJJLIIIJILLIZJL = C13BV.INSTANCE;
            }
            if (listLJJLIIIJILLIZJL.isEmpty()) {
                return null;
            }
            TextContent textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class);
            if (textContent == null || (text = textContent.getText()) == null) {
                text = "";
            }
            if (text.length() > 0) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (a0.LJJIIZI(text, ((KeywordReply) next).keyword, false)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                KeywordReply keywordReply = (KeywordReply) next;
                if (keywordReply != null && (list2 = keywordReply.replies) != null && (listLJJJJLI = C13LP.LJJJJLI(list2)) != null && (listLL = C13LP.LL(listLJJJJLI, listLJJLIIIJILLIZJL.size())) != null && (!listLL.isEmpty())) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    for (Object obj : listLL) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            BusinessAutoMessage businessAutoMessage = (BusinessAutoMessage) obj;
                            String str2 = businessAutoMessage.ext;
                            if (str2 == null) {
                                str2 = "";
                            }
                            JSONObject jSONObject = new JSONObject(str2);
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
        }
        return null;
    }
}
