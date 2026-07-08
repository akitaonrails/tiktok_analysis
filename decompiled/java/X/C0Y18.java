package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* JADX INFO: renamed from: X.0Y18, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y18 extends AbstractC867440Y1e<List<C0Y8T>> {
    public final int LJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        GetUserConversationListResponseBody getUserConversationListResponseBody;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (getUserConversationListResponseBody = responseBody.get_conversation_list_body) != null && getUserConversationListResponseBody.list != null) {
            return true;
        }
        return false;
    }

    public C0Y18(C0YEM c0yem, C1226400i1G c1226400i1G) {
        super(c0yem, C0YMR.GET_USER_CONVERSATION_LIST.getValue(), c1226400i1G);
        this.LJ = 1;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            GetUserConversationListResponseBody getUserConversationListResponseBody = c0yin.LLIZ.body.get_conversation_list_body;
            List<ConversationInfoV2> list = getUserConversationListResponseBody.list;
            final boolean zBooleanValue = getUserConversationListResponseBody.has_more.booleanValue();
            final long jLongValue = c0yin.LLIZ.body.get_conversation_list_body.next_cursor.longValue();
            this.LIZJ.LJIIJJI().LIZIZ(new C914040ZtS(this, list, 14), new InterfaceC864800XwE<List<C0Y8T>>() { // from class: X.0Y16
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.InterfaceC864800XwE
                public final void LIZ(List<C0Y8T> list2) {
                    List<C0Y8T> list3 = list2;
                    if (list3 != null && !list3.isEmpty()) {
                        for (C0Y8T c0y8t : list3) {
                            if (c0y8t != null && c0y8t.getConversationId() != null && this.LIZJ.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(c0y8t.getConversationId()) == null) {
                                this.LIZJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJL(c0y8t);
                            }
                        }
                    }
                    C0Y18 c0y18 = this.LIZJ;
                    long j = jLongValue;
                    boolean z = zBooleanValue;
                    InterfaceC863600XuI<T> interfaceC863600XuI = c0y18.LIZIZ;
                    if (interfaceC863600XuI != 0) {
                        if (interfaceC863600XuI instanceof C0Y17) {
                            ((C0Y17) interfaceC863600XuI).LJII(j, list3, z);
                        } else {
                            interfaceC863600XuI.onSuccess((T) list3);
                        }
                    }
                }
            });
            return;
        }
        LIZ(c0yin);
    }
}
