package X;

import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YB6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YB6 extends AbstractC867440Y1e<Pair<List<MessageBody>, String>> {
    public final C0Y8T LJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && responseBody.get_messages_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        boolean z;
        int size;
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            final GetMessagesResponseBody getMessagesResponseBody = c0yin.LLIZ.body.get_messages_body;
            List<MessageBody> list = getMessagesResponseBody.messages;
            if (list == null) {
                size = -1;
            } else {
                size = list.size();
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("response isSuccess: ");
            sbLIZ.append(z);
            sbLIZ.append(" messages size: ");
            sbLIZ.append(size);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "GetMessagesByMsgIDsHandler ", strLIZIZ, 4);
            this.LIZJ.LJIIJJI().LIZIZ(new InterfaceC872410YKh<List<MessageBody>>() { // from class: X.0YB7
                @Override // X.InterfaceC872410YKh
                public final List<MessageBody> LIZ() {
                    String str = c0yin.LLIZ.region;
                    if (str == null) {
                        str = "";
                    }
                    ArrayList arrayList = new ArrayList();
                    List<MessageBody> list2 = getMessagesResponseBody.messages;
                    if (list2 != null && !list2.isEmpty()) {
                        arrayList.addAll(getMessagesResponseBody.messages);
                    }
                    this.LIZJ.LIZJ(new Pair(arrayList, str));
                    return arrayList;
                }
            }, new C914010ZtP(9));
            return;
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("response isSuccess: ");
        sbLIZ2.append(z);
        sbLIZ2.append(" messages size: -1");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c868780Y6iLIZLLL2.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "GetMessagesByMsgIDsHandler ", strLIZIZ2, 4);
        LIZ(c0yin);
    }

    public C0YB6(C0YEM c0yem, C0Y8T c0y8t, InterfaceC863600XuI<Pair<List<MessageBody>, String>> interfaceC863600XuI) {
        super(c0yem, C0YMR.GET_MESSAGES.getValue(), interfaceC863600XuI);
        this.LJ = c0y8t;
    }
}
