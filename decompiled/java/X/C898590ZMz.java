package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;

/* JADX INFO: renamed from: X.0ZMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898590ZMz {
    public static final C898590ZMz LIZ = new C898590ZMz();

    public static String LIZ(C0ZN0 c0zn0) {
        if (!(c0zn0 instanceof C0ZN3) && !(c0zn0 instanceof C0ZN2)) {
            if (c0zn0 instanceof C0ZN4) {
                return "friends_only";
            }
            if (!(c0zn0 instanceof C0ZN5)) {
                if (c0zn0 instanceof C0ZND) {
                    return "story_expired";
                }
                if (!(c0zn0 instanceof C0ZNE) && !(c0zn0 instanceof C0ZN1)) {
                    throw new C1954807lC();
                }
                return "other";
            }
            return "other";
        }
        return "other";
    }

    public static void LIZIZ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, String str, String str2, long j, C0ZN0 c0zn0, String str3) {
        String str4;
        String enterFromForMob = sessionInfo.getEnterFromForMob();
        String enterMethod = sessionInfo.getEnterMethod();
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(sessionInfo.getChatType());
        String messageTypeForEventTracking = ShareAwemeContent.Companion.getMessageTypeForEventTracking(c869590Y9l);
        final InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        final C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", enterFromForMob);
        c830490Whz.put("enter_method", enterMethod);
        c830490Whz.put("group_id", str);
        c830490Whz.put("action_type", str3);
        c830490Whz.put("author_id", str2);
        c830490Whz.put("video_card_type", LIZ(c0zn0));
        c830490Whz.put("message_type", messageTypeForEventTracking);
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLongValue), null, "im_local_db");
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(iMUserLJIIL)) {
                str4 = "";
            } else if (iMUserLJIIL != null && iMUserLJIIL.getFollowStatus() == 2) {
                str4 = "muf";
            } else if (C1336205Ku.LIZ(false).getImMafService().LIZJ(String.valueOf(jLongValue))) {
                str4 = "maf";
            }
            c830490Whz.put("follow_type", str4);
        }
        if (numValueOf != null) {
            c830490Whz.put("chat_type", C1677606ha.LIZ(numValueOf.intValue()));
            if (numValueOf.intValue() == 3) {
                c830490Whz.put("relation_tag", "null");
                C20684815ws.LJIILLIIL("unavailable_video_card", c830490Whz);
                return;
            }
        }
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.05wQ
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                c830490Whz.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
                interfaceC1493505szLIZIZ.sendEvent("unavailable_video_card", c830490Whz);
            }
        }, String.valueOf(lValueOf), null, "im_chat_unavailable_card", false);
    }
}
