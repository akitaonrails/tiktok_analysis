package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;

/* JADX INFO: renamed from: X.0Y5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y5Y {
    public static final boolean LIZIZ(MessageBody messageBody) {
        Integer num;
        if (messageBody != null && (num = messageBody.message_type) != null) {
            if (num.intValue() == EnumC868450Y5b.MESSAGE_TYPE_STATUS.getValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final InterfaceC868830Y6n LIZ(C0YEM c0yem, StatusMessage statusMessage, String str, int i, int i2, C0Y82 c0y82, long j) {
        Integer num = statusMessage.type;
        int value = C0Y5Z.MarkConversationRead.getValue();
        if (num != null && num.intValue() == value) {
            return new C0Y24(c0yem, str);
        }
        int value2 = C0Y5Z.DeleteMessage.getValue();
        if (num != null && num.intValue() == value2) {
            return new C0Y23(c0yem, str);
        }
        int value3 = C0Y5Z.DeleteConversation.getValue();
        if (num != null && num.intValue() == value3) {
            return new C0Y2C(c0yem, str);
        }
        int value4 = C0Y5Z.UpdateConversationSetting.getValue();
        if (num != null && num.intValue() == value4) {
            return new C0Y27(c0yem);
        }
        int value5 = C0Y5Z.UpdateConversationCoreInfo.getValue();
        if (num != null && num.intValue() == value5) {
            return new C0Y26(c0yem);
        }
        int value6 = C0Y5Z.UpdateConversationParticipant.getValue();
        if (num != null && num.intValue() == value6) {
            return new C0Y2B(c0yem);
        }
        int value7 = C0Y5Z.UpdateMessageExt.getValue();
        if (num != null && num.intValue() == value7) {
            return new C0Y3F(c0yem);
        }
        int value8 = C0Y5Z.DissolveConversation.getValue();
        if (num != null && num.intValue() == value8) {
            return new C0Y22(c0yem);
        }
        int value9 = C0Y5Z.ModeChange.getValue();
        if (num != null && num.intValue() == value9) {
            return new C868620Y5s(i, statusMessage.type.intValue(), j, c0yem, c0y82, str);
        }
        int value10 = C0Y5Z.MultiPushModeChange.getValue();
        if (num != null && num.intValue() == value10) {
            return new C868720Y6c(i, statusMessage.type.intValue(), j, c0yem, c0y82, str);
        }
        int value11 = C0Y5Z.RefreshMessage.getValue();
        if (num == null || num.intValue() != value11) {
            int value12 = C0Y5Z.ReFetchMessage.getValue();
            if (num == null || num.intValue() != value12) {
                int value13 = C0Y5Z.HideViolativeMessage.getValue();
                if (num != null && num.intValue() == value13) {
                    return new C0Y3G(c0yem);
                }
                int value14 = C0Y5Z.RecallMessage.getValue();
                if (num != null && num.intValue() == value14) {
                    return new C868500Y5g(i, i2, j, c0yem, c0y82, str);
                }
                int value15 = C0Y5Z.UpdateMessageProperty.getValue();
                if (num != null && num.intValue() == value15) {
                    return new C0Y3H(c0yem);
                }
                int value16 = C0Y5Z.RefreshAllMessage.getValue();
                if (num != null && num.intValue() == value16) {
                    return new C868550Y5l(c0yem);
                }
                int value17 = C0Y5Z.FirstMessage.getValue();
                if (num != null && num.intValue() == value17) {
                    return new C0Y25(c0yem);
                }
                if (c0yem.LJ().getMessage().LIZLLL().contains(num)) {
                    return new C0Y8R(i, i2, j, c0yem, c0y82, str);
                }
                return null;
            }
        }
        return new C868630Y5t(c0yem, i, str, i2, c0y82, statusMessage.type.intValue(), j);
    }
}
