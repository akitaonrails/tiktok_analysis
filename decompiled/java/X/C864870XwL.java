package X;

import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0XwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864870XwL extends AbstractC867440Y1e {
    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        return true;
    }

    public C864870XwL(C0YEM c0yem) {
        super(c0yem, C0YMR.MARK_CONVERSATION_READ_V3.getValue(), null);
    }

    public static void LJIILIIL(C0YEM c0yem, C0Y8T... c0y8tArr) {
        C0Y8T c0y8tLIZ;
        if (c0y8tArr != null && c0y8tArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C0Y8T c0y8t : c0y8tArr) {
                if (c0y8t != null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(c0y8t.getConversationId())) != null) {
                    c0y8tLIZ.setFakeUnreadCount(c0y8t.getFakeUnreadCount());
                    c0y8tLIZ.setUnreadCount(c0y8t.getUnreadCount());
                    c0y8tLIZ.setReadIndex(c0y8t.getReadIndex());
                    c0y8tLIZ.setReadIndexV2(c0y8t.getReadIndexV2());
                    c0y8tLIZ.setReadBadgeCount(c0y8t.getReadBadgeCount());
                    c0y8tLIZ.setUnreadSelfMentionedMessages(c0y8t.getUnreadSelfMentionedMessages());
                    arrayList.add(c0y8tLIZ);
                }
            }
            c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJLI(3, (C0Y8T[]) arrayList.toArray(new C0Y8T[0]));
        }
    }

    public static boolean LJIILLIIL(C0Y8T c0y8t, C0YEM c0yem) throws Throwable {
        boolean z = false;
        if (c0y8t.getReadIndex() < 9223372036854774807L && c0y8t.getReadIndexV2() < 9223372036854774807L) {
            if (c0y8t.getUnreadCount() != 0 || c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJII(c0y8t.getConversationId()) > c0y8t.getReadIndex() || c0y8t.getFakeUnreadCount() > 0) {
                return false;
            }
            C0YA1 c0ya1LJFF = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJ().LJFF(c0y8t.getConversationId());
            if (c0ya1LJFF != null && c0ya1LJFF.createTimeMicros > c0y8t.getReadIndex()) {
                z = true;
            }
            return !z;
        }
        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skipMarkReadRequest: corrupted read_index detected, readIndex=");
        sbLIZ.append(c0y8t.getReadIndex());
        sbLIZ.append(", readIndexV2=");
        sbLIZ.append(c0y8t.getReadIndexV2());
        sbLIZ.append(", convId=");
        sbLIZ.append(c0y8t.getConversationId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILLIIL(c868780Y6iLIZLLL, "MarkConversationReadHandler", strLIZIZ, 4);
        return false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        EnumC864390XvZ enumC864390XvZ;
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response is ");
        sbLIZ.append(c0yin.LLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MarkConversationReadHandler", strLIZIZ, 4);
        if (c0yin.LJIIJJI()) {
            enumC864390XvZ = EnumC864390XvZ.SUCCESS;
        } else {
            enumC864390XvZ = EnumC864390XvZ.ERROR;
        }
        Object[] objArr = c0yin.LLILZIL;
        LJIILL(enumC864390XvZ, c0yin.LLJ, (String) objArr[0], ((Integer) objArr[1]).intValue(), c0yin.LJIIIZ());
    }

    public final void LJIILJJIL(int i, String str) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_mark_read_request");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i), "conversation_type");
        c0yj9.LJ(0.1f);
    }

    public final void LJIIJJI(int i, MarkConversationReadRequestBody markConversationReadRequestBody, String str, int i2) {
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIJI = markConversationReadRequestBody;
        LJIIIZ(i, c1es0.build(), null, str, Integer.valueOf(i2));
    }

    public static MarkConversationReadRequestBody LJIIL(C0YEM c0yem, C0Y8T c0y8t, AbstractC864890XwN abstractC864890XwN, Boolean bool, int i) throws Throwable {
        C0Y13 c0y13 = new C0Y13();
        c0y13.LIZLLL = c0y8t.getConversationId();
        c0y13.LJ = Long.valueOf(c0y8t.getConversationShortId());
        c0y13.LJFF = Integer.valueOf(c0y8t.getConversationType());
        c0y13.LJIIIZ = Long.valueOf(c0y8t.getReadIndexV2());
        c0y13.LJIIJ = Integer.valueOf(c0y8t.getReadBadgeCount());
        c0y13.LJII = Long.valueOf(c0y8t.getUnreadCount());
        c0y13.LJIIZILJ = Integer.valueOf(i);
        abstractC864890XwN.LIZ(c0y13);
        if (!bool.booleanValue()) {
            c0yem.LJIIIZ().getClass();
        }
        C869590Y9l c869590Y9lLJJJIL = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJIL(c0y8t.getReadIndex(), c0y8t.getConversationId());
        if (c869590Y9lLJJJIL != null) {
            long msgId = c869590Y9lLJJJIL.getMsgId();
            if (msgId > 0) {
                c0y13.LJIIL = Long.valueOf(msgId);
            }
        }
        return c0y13.build();
    }

    public final void LJIILL(EnumC864390XvZ enumC864390XvZ, int i, String str, int i2, String str2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_mark_read_response");
        c0yj9.LIZ(Integer.valueOf(enumC864390XvZ.getCode()), "result_code");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Integer.valueOf(i2), "conversation_type");
        c0yj9.LIZ(Integer.valueOf(i), "error_code");
        c0yj9.LIZ(str2, "log_id");
        c0yj9.LJ(0.1f);
    }
}
