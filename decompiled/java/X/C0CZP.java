package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import com.ss.android.ugc.aweme.model.MentionCheckResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0CZP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CZP {
    public static final List<MentionCheckResult> LIZ(List<com.ss.android.ugc.aweme.mention.model.MentionCheckResult> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (com.ss.android.ugc.aweme.mention.model.MentionCheckResult mentionCheckResult : list) {
            String str = mentionCheckResult.uid;
            List<MentionCheckSingleTypeResult> list2 = mentionCheckResult.userBlockedResults;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (MentionCheckSingleTypeResult mentionCheckSingleTypeResult : list2) {
                arrayList2.add(new com.ss.android.ugc.aweme.model.MentionCheckSingleTypeResult(mentionCheckSingleTypeResult.mentionType, mentionCheckSingleTypeResult.blockType));
            }
            arrayList.add(new MentionCheckResult(str, arrayList2));
        }
        return arrayList;
    }

    public static final void LIZIZ(long j, long j2, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CZQ(j, j2, z, null), 3);
    }

    public static final void LIZJ(int i, int i2, int i3, long j) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CZO(i, i2, i3, j, null), 3);
    }

    public static final void LIZLLL(List<? extends IMUser> list, List<? extends IMUser> list2, MentionGeneralCheckResponse mentionGeneralCheckResponse, long j) {
        List<com.ss.android.ugc.aweme.mention.model.MentionCheckResult> list3;
        boolean z;
        if (mentionGeneralCheckResponse != null && (list3 = mentionGeneralCheckResponse.blockResults) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (com.ss.android.ugc.aweme.mention.model.MentionCheckResult mentionCheckResult : list3) {
                for (MentionCheckSingleTypeResult mentionCheckSingleTypeResult : mentionCheckResult.userBlockedResults) {
                    if (mentionCheckSingleTypeResult.mentionType == j) {
                        linkedHashMap.put(mentionCheckResult.uid, Long.valueOf(mentionCheckSingleTypeResult.blockType));
                    }
                }
            }
            Iterator<? extends IMUser> it2 = list.iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                IMUser next = it2.next();
                String uid = next.getUid();
                if (uid != null) {
                    Long l = (Long) linkedHashMap.get(uid);
                    if (l == null || l.longValue() == 0) {
                        z2 = true;
                    }
                    next.setMentionEnabled(z2);
                }
            }
            for (IMUser iMUser : list2) {
                String uid2 = iMUser.getUid();
                if (uid2 != null) {
                    Long l2 = (Long) linkedHashMap.get(uid2);
                    if (l2 != null && l2.longValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    iMUser.setMentionEnabled(z);
                }
            }
        }
    }
}
