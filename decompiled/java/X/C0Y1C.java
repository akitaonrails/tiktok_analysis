package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;

/* JADX INFO: renamed from: X.0Y1C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1C extends AbstractC867440Y1e<C0Y8T> {
    public volatile boolean LJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody;
        Integer num;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (setConversationSettingInfoResponseBody = responseBody.set_conversation_setting_info_body) != null && (num = setConversationSettingInfoResponseBody.status) != null && num.intValue() == C0YOD.OP_SUCCEED.getValue() && c0yin.LLIZ.body.set_conversation_setting_info_body.setting_info != null) {
            return true;
        }
        return false;
    }

    public C0Y1C(C0YEM c0yem, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        super(c0yem, C0YMR.SET_CONVERSATION_SETTING_INFO.getValue(), interfaceC863600XuI);
        this.LJ = false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        Object[] objArr = c0yin.LLILZIL;
        String str = (String) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str2 = (String) c0yin.LLILZIL[2];
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final ConversationSettingInfo conversationSettingInfo = c0yin.LLIZ.body.set_conversation_setting_info_body.setting_info;
            this.LIZJ.LJIIJJI().LIZIZ(new InterfaceC872410YKh<C0Y8T>() { // from class: X.0Y1m
                @Override // X.InterfaceC872410YKh
                public final C0Y8T LIZ() {
                    Integer num;
                    int iIntValue;
                    boolean zLJII = this.LIZLLL.LIZLLL.LIZ().LJII(C0Y8V.LJFF(this.LIZLLL.LIZLLL.LIZ().LJ(conversationSettingInfo.conversation_id), conversationSettingInfo));
                    boolean z = c0yin.LLILZLL.body.set_conversation_setting_info_body.set_fake_unread_count != null;
                    if (zBooleanValue || z) {
                        C0Y8T c0y8tLIZ = this.LIZLLL.LIZLLL.LJIIJJI().LIZ(conversationSettingInfo.conversation_id, true);
                        if (zBooleanValue) {
                            if (!this.LIZLLL.LIZJ.LJIIIZ().LJIIZILJ || c0y8tLIZ == null || c0y8tLIZ.getLastShowMessage() == null) {
                                this.LIZLLL.LIZLLL.LJIIJJI().LJJJJ(System.currentTimeMillis(), conversationSettingInfo.conversation_id);
                            } else {
                                this.LIZLLL.LIZLLL.LJIIJJI().LJJJJ(c0y8tLIZ.getLastShowMessage().getCreatedAt(), conversationSettingInfo.conversation_id);
                            }
                        }
                        if (z && c0y8tLIZ != null && (num = conversationSettingInfo.fake_unread_count) != null && (iIntValue = num.intValue()) > 0) {
                            c0y8tLIZ.setFakeUnreadCount(iIntValue);
                            c0y8tLIZ.setUnreadCount(C0Y2U.LIZ(c0y8tLIZ, this.LIZLLL.LIZJ, "mark_as_unread", "local", true, null));
                            this.LIZLLL.LIZLLL.LJIIJJI().LJJJJLI(c0y8tLIZ);
                        }
                    }
                    if (zLJII) {
                        return this.LIZLLL.LIZLLL.LJIIJJI().LIZ(conversationSettingInfo.conversation_id, true);
                    }
                    return null;
                }
            }, new C914020ZtQ(c0y1g, this, 10));
        } else if (!this.LJ && C0Y81.LJ(c0yin.LLIZ, this.LIZJ.LJIIIZ().LJJJJJ)) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJLLLLLLLZ(c0yin.LJI(), new C914130Ztb(this, c0yin, c0y1g, str, str2, 5), str);
        } else {
            LIZ(c0yin);
            c0y1g.run();
        }
    }
}
