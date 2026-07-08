package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0YCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870470YCv extends AbstractC867440Y1e<C1885607a2> {
    public boolean LJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        Response response;
        ResponseBody responseBody;
        BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody;
        if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && (batchGetConversationParticipantsReadIndexResponseBody = responseBody.batch_get_conversation_participants_readindex) != null && batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex != null) {
            return true;
        }
        return false;
    }

    public C870470YCv(C0YEM c0yem, C914130Ztb c914130Ztb) {
        super(c0yem, C0YMR.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), c914130Ztb);
        this.LJ = false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            Object[] objArr = c0yin.LLILZIL;
            if (objArr != null && objArr.length != 0) {
                this.LIZJ.LJIIJJI().LIZIZ(new C914040ZtS(this, c0yin, 17), new C914020ZtQ(c0yin, this, 6));
                return;
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BatchGetReadIndexHandler");
            sbLIZ.append(", handleResponse, no params, return");
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZ(c0yin);
    }

    public final void LJIIJJI(String str, boolean z, List list) {
        C0Y8T c0y8tLIZ;
        this.LJ = z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        int inboxType = 0;
        while (it2.hasNext()) {
            C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
            arrayList.add(c869590Y9l);
            String conversationId = c869590Y9l.getConversationId();
            if (conversationId != null && (((c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(conversationId)) != null && c0y8tLIZ.getConversationShortId() != 0) || (c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LJJLIIIIJ(conversationId)) != null)) {
                if (c0y8tLIZ.getConversationShortId() != 0) {
                    inboxType = c0y8tLIZ.getInboxType();
                    arrayList2.add(conversationId);
                    arrayList3.add(Long.valueOf(c0y8tLIZ.getConversationShortId()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BatchGetReadIndexHandler");
            sbLIZ.append(" get, messageList is null, return");
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C870480YCw c870480YCw = new C870480YCw();
        C1516540pZE.LIZ(arrayList2);
        c870480YCw.LIZLLL = arrayList2;
        C1516540pZE.LIZ(arrayList3);
        c870480YCw.LJ = arrayList3;
        c870480YCw.LJFF = str;
        this.LIZJ.LJIIIZ().getClass();
        c870480YCw.LJI = Boolean.FALSE;
        BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBodyBuild = c870480YCw.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJLJLI = batchGetConversationParticipantsReadIndexRequestBodyBuild;
        LJIIIZ(inboxType, c1es0.build(), null, arrayList);
    }
}
