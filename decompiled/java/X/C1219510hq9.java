package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.network.model.ConversationAudit;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219510hq9 {
    public static C1218180ho0 LIZ(ConversationAudit conversationAudit, List list) {
        Object obj;
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((BaseContact) next).getUid(), String.valueOf(conversationAudit.applyUserId))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMUser iMUser = (IMUser) next;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(((BaseContact) next2).getUid(), String.valueOf(conversationAudit.inviteUser))) {
                obj = next2;
                break;
            }
        }
        IMUser iMUser2 = (IMUser) obj;
        String strValueOf = String.valueOf(conversationAudit.applyUserId);
        long j = conversationAudit.applyId;
        long j2 = conversationAudit.createTimeInMs;
        String strValueOf2 = String.valueOf(conversationAudit.inviteUser);
        String str = conversationAudit.applyReason;
        if (str == null) {
            str = "";
        }
        return new C1218180ho0(iMUser, strValueOf, C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(String.valueOf(conversationAudit.conversationShortId)), j, j2, strValueOf2, iMUser2, str);
    }
}
