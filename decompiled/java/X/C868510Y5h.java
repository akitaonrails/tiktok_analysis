package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Y5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868510Y5h {
    public static long LIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return -1L;
        }
        Map<String, String> ext = c869590Y9l.getExt();
        if (ext != null && ext.containsKey("s:do_not_pop_conversation") && "true".equals(ext.get("s:do_not_pop_conversation"))) {
            return -1L;
        }
        return c869590Y9l.getCreatedAt();
    }

    public static long LIZIZ(List<C869590Y9l> list) {
        if (list != null && !list.isEmpty()) {
            long index = ((C869590Y9l) ListProtector.get(list, 0)).getIndex();
            for (C869590Y9l c869590Y9l : list) {
                if (c869590Y9l.getIndex() < index) {
                    index = c869590Y9l.getIndex();
                }
            }
            return index;
        }
        return 0L;
    }

    public static C0Y72 LIZJ(MessageBody messageBody) {
        if (messageBody == null) {
            return new C0Y72(EnumC868520Y5i.MESSAGE_BODY_NULL, "");
        }
        Integer num = messageBody.message_type;
        if (num == null) {
            return new C0Y72(EnumC868520Y5i.MESSAGE_TYPE_NULL, "");
        }
        EnumC868450Y5b enumC868450Y5bFromValue = EnumC868450Y5b.fromValue(num.intValue());
        if (enumC868450Y5bFromValue != null) {
            switch (C868440Y5a.LIZ[enumC868450Y5bFromValue.ordinal()]) {
                case 1:
                    EnumC868520Y5i enumC868520Y5i = EnumC868520Y5i.MESSAGE_TYPE_NOT_USED;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type is ");
                    sbLIZ.append(enumC868450Y5bFromValue);
                    return new C0Y72(enumC868520Y5i, C2188811AlT.LIZIZ(sbLIZ));
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    return C0Y72.LIZ();
            }
        }
        IntRange intRange = C0Y5X.LIZ;
        Integer num2 = messageBody.message_type;
        if (num2 != null) {
            IntRange intRange2 = C0Y5X.LIZ;
            int i = intRange2.LL;
            int i2 = intRange2.LLILLJJLI;
            int iIntValue = num2.intValue();
            if (i <= iIntValue && iIntValue <= i2) {
                return C0Y72.LIZ();
            }
        }
        if (messageBody.message_type.intValue() < EnumC868450Y5b.MESSAGE_TYPE_STATUS.getValue()) {
            return C0Y72.LIZ();
        }
        EnumC868520Y5i enumC868520Y5i2 = EnumC868520Y5i.MESSAGE_TYPE_CMD_TYPE;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("type is ");
        sbLIZ2.append(messageBody.message_type);
        return new C0Y72(enumC868520Y5i2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static boolean LJFF(C0YEM c0yem, C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && c869590Y9l.getSvrStatus() == 0) {
            if ("true".equals(c869590Y9l.getExtValue("s:do_not_update_last_show_msg"))) {
                c0yem.LIZLLL().LJIIJJI("MessageUtils isUpdateLastMsg:false, has ext s:do_not_update_last_msg");
                return false;
            }
            return true;
        }
        c0yem.LIZLLL().LJIIJJI("MessageUtils isUpdateLastMsg:false, svrStatus not enable");
        return false;
    }

    public static boolean LIZLLL(C0YEM c0yem, C869590Y9l c869590Y9l, Boolean bool) {
        long jLJJ;
        boolean z;
        if (c869590Y9l != null && c869590Y9l.getSvrStatus() == 0) {
            if ("true".equals(c869590Y9l.getExtValue("s:do_not_increase_unread"))) {
                c0yem.LIZLLL().LJIIJJI("MessageUtils isMsgUnread:false, has ext s:do_not_increase_unread");
                return false;
            }
            C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(c869590Y9l.getConversationId());
            if (c0y8tLIZ != null && c0y8tLIZ.getReadIndex() > 0) {
                jLJJ = c0y8tLIZ.getReadIndex();
            } else if (bool.booleanValue()) {
                jLJJ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LJJ(c869590Y9l.getConversationId());
            } else {
                c0yem.LIZLLL().LJIIJJI("MessageUtils isMsgUnread:true, conversation is null in ConversationListModel");
                return true;
            }
            if (c869590Y9l.getIndex() > jLJJ) {
                z = true;
            } else {
                z = false;
            }
            C0Y1U c0y1uLIZLLL = c0yem.LJIIZILJ().LIZLLL().LIZLLL();
            boolean zLJJIJLIJ = c0y1uLIZLLL.LJJIJLIJ(c869590Y9l.getConversationId());
            boolean zLJJJJI = c0y1uLIZLLL.LJJJJI(c869590Y9l.getConversationId());
            boolean zIsSelf = c869590Y9l.isSelf(c0yem.getUid());
            boolean zEquals = "1".equals(c869590Y9l.getExtValue("s:ignore_sender_id"));
            if (zLJJIJLIJ && !zLJJJJI) {
                return false;
            }
            if ((zIsSelf && !zEquals) || !z) {
                return false;
            }
            return true;
        }
        c0yem.LIZLLL().LJIIJJI("MessageUtils isMsgUnread:false, svrStatus not enable");
        return false;
    }

    public static C0Y72 LJ(C0YEM c0yem, C869590Y9l c869590Y9l, MessageBody messageBody, int i) {
        boolean z;
        if (c869590Y9l == null) {
            c0yem.LIZLLL().LJIIL("MessageUtils ", "valid new message, no localMsg with same uuid found in DB");
            return C0Y72.LIZ();
        }
        if (messageBody == null) {
            c0yem.LIZLLL().LJIIL("MessageUtils ", "invalid new message, reason: null new message");
            return new C0Y72(EnumC868520Y5i.NEW_MSG_BODY_NULL, "");
        }
        long msgId = c869590Y9l.getMsgId();
        if (msgId == 0) {
            c0yem.LIZLLL().LJIIL("MessageUtils ", "valid new message, expected for updating the status of previously sent message");
            return C0Y72.LIZ();
        }
        if (i == 6 && c869590Y9l.getMsgStatus() != 6) {
            return new C0Y72(EnumC868520Y5i.TEMPORARY_MESSAGE_CANNOT_REPLACE_PERMANENT, "Temporary message cannot override permanent message");
        }
        if (c0yem.LJIIIZ().LJJL && c869590Y9l.getMsgType() != messageBody.message_type.intValue()) {
            EnumC868520Y5i enumC868520Y5i = EnumC868520Y5i.MESSAGE_TYPE_MISMATCH;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg type error, new msg_type: ");
            sbLIZ.append(messageBody.message_type);
            sbLIZ.append(", cur msg_type:");
            sbLIZ.append(c869590Y9l.getMsgType());
            return new C0Y72(enumC868520Y5i, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i == 5 && c869590Y9l.getMsgStatus() == 6) {
            z = true;
        } else {
            z = false;
        }
        if (msgId != messageBody.server_message_id.longValue()) {
            if (messageBody.create_time == null) {
                EnumC868520Y5i enumC868520Y5i2 = EnumC868520Y5i.NEW_MSG_CREATE_TIME_NULL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("local svr id is ");
                sbLIZ2.append(msgId);
                return new C0Y72(enumC868520Y5i2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (c869590Y9l.getCreatedAt() >= messageBody.create_time.longValue()) {
                c0yem.LIZLLL().LJIIL("MessageUtils ", "valid new message, expected when the modified message was saved first and retrieved as the localMsg param, after that the original message is processed and passed in as the newMessage param");
                return C0Y72.LIZ();
            }
            if (z) {
                c0yem.LIZLLL().LJIIL("MessageUtils ", "valid new message, normal message can always override temporary message");
                return C0Y72.LIZ();
            }
            c0yem.LIZLLL().LJIIL("MessageUtils ", "invalid new message, reason: create_time too new");
            EnumC868520Y5i enumC868520Y5i3 = EnumC868520Y5i.NEW_MSG_CREATE_TIME_TOO_NEW;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("local created at ");
            sbLIZ3.append(c869590Y9l.getCreatedAt());
            sbLIZ3.append(", new created at ");
            sbLIZ3.append(messageBody.create_time);
            return new C0Y72(enumC868520Y5i3, C2188811AlT.LIZIZ(sbLIZ3));
        }
        Long l = messageBody.version;
        if (l == null) {
            return new C0Y72(EnumC868520Y5i.NEW_MSG_VERSION_NULL, "");
        }
        if (!z && c869590Y9l.getVersion() > l.longValue()) {
            c0yem.LIZLLL().LJIIL("MessageUtils ", "invalid new message, reason: invalid version");
            EnumC868520Y5i enumC868520Y5i4 = EnumC868520Y5i.NEW_MSG_VERSION_TOO_OLD;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("local version ");
            sbLIZ4.append(c869590Y9l.getVersion());
            sbLIZ4.append(", new version ");
            sbLIZ4.append(l);
            return new C0Y72(enumC868520Y5i4, C2188811AlT.LIZIZ(sbLIZ4));
        }
        return C0Y72.LIZ();
    }
}
