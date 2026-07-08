package X;

import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;

/* JADX INFO: renamed from: X.0Y1F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1F extends AbstractC867440Y1e<C0Y8T> {
    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody;
        Integer num;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (setConversationCoreInfoResponseBody = responseBody.set_conversation_core_info_body) != null && (num = setConversationCoreInfoResponseBody.status) != null && num.intValue() == C0YOD.OP_SUCCEED.getValue() && c0yin.LLIZ.body.set_conversation_core_info_body.conversation_core_info != null) {
            return true;
        }
        return false;
    }

    public C0Y1F(C0YEM c0yem, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        super(c0yem, C0YMR.SET_CONVERSATION_CORE_INFO.getValue(), interfaceC863600XuI);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            this.LIZJ.LJIIJJI().LIZIZ(new C914040ZtS(this, c0yin.LLIZ.body.set_conversation_core_info_body.conversation_core_info, 18), new C914020ZtQ(c0y1g, this, 8));
        } else {
            LIZ(c0yin);
            c0y1g.run();
        }
    }
}
