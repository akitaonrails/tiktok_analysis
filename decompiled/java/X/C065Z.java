package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.v2.QuickShareRecord;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.065Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C065Z {
    public static final Set<C0180003u> LIZ(List<QuickShareRecord.Candidate> list) {
        Object quickShareCandidate;
        Object c098200Yq;
        List<IMContact> listLJIILJJIL;
        String conversationId;
        boolean z;
        Long l;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return C08CX.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            quickShareCandidate = null;
            if (!it2.hasNext()) {
                break;
            }
            QuickShareRecord.Candidate candidate = (QuickShareRecord.Candidate) it2.next();
            String str = candidate.candidateId;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = null;
                }
                if (str != null && (l = candidate.type) != null) {
                    long jLongValue = l.longValue();
                    Double d = candidate.rateScore;
                    if (d != null) {
                        quickShareCandidate = new QuickShareCandidate(str, jLongValue, Double.valueOf(d.doubleValue()), null);
                    }
                }
            }
            if (quickShareCandidate != null) {
                arrayList2.add(quickShareCandidate);
            }
        }
        if (arrayList2.isEmpty()) {
            return C08CX.INSTANCE;
        }
        HashSet hashSet = new HashSet();
        if (C15504065e.LIZ()) {
            try {
                c098200Yq = (List) C23250099c.LJ(C23271099x.INSTANCE, new C065X(arrayList2, null));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                quickShareCandidate = c098200Yq;
            }
            listLJIILJJIL = (List) quickShareCandidate;
            if (listLJIILJJIL == null) {
                listLJIILJJIL = C13BV.INSTANCE;
            }
        } else {
            C1366830lfl.LL.getClass();
            listLJIILJJIL = C1366830lfl.LJIILJJIL(arrayList2);
        }
        for (IMContact iMContact : listLJIILJJIL) {
            if (iMContact instanceof IMUser) {
                String uid = iMContact.getUid();
                if (uid != null) {
                    hashSet.add(new C0180003u(uid, 0L));
                }
            } else if ((iMContact instanceof IMConversation) && (conversationId = ((IMConversation) iMContact).getConversationId()) != null) {
                hashSet.add(new C0180003u(conversationId, 1L));
            }
        }
        return hashSet;
    }

    public static final boolean LIZIZ(QuickShareCandidate quickShareCandidate, IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            if (Intrinsics.LJFF(quickShareCandidate.candidateId, iMContact.getUid()) && quickShareCandidate.type == 0) {
                return true;
            }
            return false;
        }
        if ((iMContact instanceof IMConversation) && Intrinsics.LJFF(quickShareCandidate.candidateId, ((IMConversation) iMContact).getConversationId()) && quickShareCandidate.type == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(IMContact iMContact, String str) {
        Long lValueOf;
        C869590Y9l lastShowMessage;
        if (iMContact instanceof IMUser) {
            if (Intrinsics.LJFF(str, iMContact.getUid()) || ((IMUser) iMContact).getFollowStatus() != 2) {
                return false;
            }
        } else if (iMContact instanceof IMConversation) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((IMConversation) iMContact).getConversationId());
            if (c0y8tLIZ != null && c0y8tLIZ.getInboxType() == 5 && c0y8tLIZ.getConversationTags().contains("_remix_")) {
                return false;
            }
            C01GW c01gw = C15500065a.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                if (c0y8tLIZ != null && (lastShowMessage = c0y8tLIZ.getLastShowMessage()) != null) {
                    lValueOf = Long.valueOf(lastShowMessage.getCreatedAt());
                } else {
                    lValueOf = null;
                }
                int iIntValue = ((Number) c01gw.getValue()).intValue();
                if (lValueOf != null) {
                    lValueOf.longValue();
                    if (System.currentTimeMillis() - lValueOf.longValue() >= ((long) (iIntValue * 24 * 60 * 60)) * 1000) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(java.util.List<com.ss.android.ugc.aweme.base.share.QuickShareCandidate> r11, boolean r12, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r13) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C065Z.LIZJ(java.util.List, boolean, X.05Vn):java.lang.Object");
    }
}
