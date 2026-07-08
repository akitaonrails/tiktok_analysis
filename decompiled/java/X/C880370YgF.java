package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0YgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880370YgF {
    public static boolean LIZJ(C0Y8T c0y8t) {
        int i = C880500YgS.LIZJ[C19212010Ec.LIZJ.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!C879070Ye9.LIZIZ(c0y8t)) {
                        return true;
                    }
                    return false;
                }
                throw new C1954807lC();
            }
            if (!C879070Ye9.LIZIZ(c0y8t) && !C879070Ye9.LJ(c0y8t, true)) {
                return true;
            }
            return false;
        }
        return C879070Ye9.LIZJ(c0y8t, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x016d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.inbox.filter.FilterTabType r7, X.C0Y8T r8) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880370YgF.LIZLLL(com.ss.android.ugc.aweme.inbox.filter.FilterTabType, X.0Y8T):boolean");
    }

    public static boolean LJ(EnumC880480YgQ enumC880480YgQ, C0Y8T c0y8t) {
        int msgType;
        boolean z;
        C869590Y9l lastShowMessage;
        boolean zLIZLLL = C19212010Ec.LIZJ.LIZLLL();
        if (enumC880480YgQ == EnumC880480YgQ.ALL || enumC880480YgQ == EnumC880480YgQ.SAME_WITH_TAB) {
            return true;
        }
        if (enumC880480YgQ == EnumC880480YgQ.PRIMARY) {
            return C879070Ye9.LIZJ(c0y8t, zLIZLLL);
        }
        if (enumC880480YgQ == EnumC880480YgQ.SECONDARY) {
            return C879070Ye9.LIZLLL(c0y8t, zLIZLLL);
        }
        if (C880490YgR.LLILLL.contains(enumC880480YgQ)) {
            if (c0y8t.getConversationType() == AbstractC1711506n3.LIZ) {
                return true;
            }
            return false;
        }
        if (enumC880480YgQ == EnumC880480YgQ.SPAM) {
            return C879070Ye9.LJ(c0y8t, false);
        }
        if (enumC880480YgQ == EnumC880480YgQ.STARRED) {
            return C879070Ye9.LJFF(c0y8t);
        }
        if (enumC880480YgQ == EnumC880480YgQ.UNREAD) {
            return true;
        }
        if (enumC880480YgQ == EnumC880480YgQ.NOT_REPLIED) {
            C878680YdW c878680YdW = C878680YdW.LIZ;
            int unreadCount = (int) c0y8t.getUnreadCount();
            C869590Y9l lastShowMessage2 = c0y8t.getLastShowMessage();
            if (lastShowMessage2 != null) {
                msgType = lastShowMessage2.getMsgType();
            } else {
                msgType = 0;
            }
            C869590Y9l lastShowMessage3 = c0y8t.getLastShowMessage();
            if (lastShowMessage3 == null || !C0ZDX.LJJJJIZL(lastShowMessage3) || ((lastShowMessage = c0y8t.getLastShowMessage()) != null && C0ZDX.LJJJJL(lastShowMessage))) {
                z = false;
            } else {
                z = true;
            }
            c878680YdW.getClass();
            if (unreadCount == 0 && !z && msgType != 0 && msgType != 1 && msgType != 15 && msgType != 1031 && msgType != 1032 && msgType < 4000) {
                return true;
            }
            return false;
        }
        if (enumC880480YgQ == EnumC880480YgQ.ALL_FOR_BUSINESS) {
            return true;
        }
        if (enumC880480YgQ == EnumC880480YgQ.LEAD) {
            return c0y8t.getConversationTags().contains(EnumC879080YeA.LEAD.getValue());
        }
        if (enumC880480YgQ == EnumC880480YgQ.AD) {
            return C879070Ye9.LIZ(c0y8t);
        }
        if (enumC880480YgQ == EnumC880480YgQ.SERVICE_PLUS) {
            return C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIJI().LIZIZ(c0y8t);
        }
        if (enumC880480YgQ == EnumC880480YgQ.BUYER) {
            return true;
        }
        C1AF0.LIZJ("invalid filterOption");
        return true;
    }

    public static boolean LJI(EnumC880480YgQ enumC880480YgQ, C880150Yft c880150Yft) {
        if (C880500YgS.LIZIZ[enumC880480YgQ.ordinal()] == 1) {
            if (C19212010Ec.LIZJ.LIZLLL()) {
                if (c880150Yft == null || c880150Yft.LIZJ <= 0) {
                    return false;
                }
            } else {
                if (c880150Yft != null && c880150Yft.LIZIZ != EnumC880300Yg8.NONE && c880150Yft.LIZ > 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIIIZZ(FilterTabType filterTabType, Set set) {
        if (!C880490YgR.LLILZ.contains(filterTabType)) {
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C880490YgR.LLILLL.contains(it2.next())) {
                        break;
                    }
                } else if (!C880490YgR.LLILZLL.contains(filterTabType)) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        if (C880490YgR.LLIZ.contains(it3.next())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJFF(C0Y8T c0y8t, FilterTabType filterTabType, Set set) {
        if (LIZLLL(filterTabType, c0y8t) && (!(set instanceof Collection) || !set.isEmpty())) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                EnumC880480YgQ enumC880480YgQ = (EnumC880480YgQ) it2.next();
                Set<EnumC880480YgQ> set2 = C880490YgR.LLILLL;
                if (LJ(enumC880480YgQ, c0y8t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean LJII(EnumC880480YgQ enumC880480YgQ, IMUser iMUser, C0Y8T c0y8t) throws Throwable {
        InterfaceC877200Yb8 interfaceC877200Yb8LJIJI;
        Boolean boolLIZ;
        InterfaceC1670106gN interfaceC1670106gNLJIIZILJ;
        IMUserBizInfo imUserBizInfo;
        if (C880490YgR.LLILZIL.contains(enumC880480YgQ) && (iMUser == null || (imUserBizInfo = iMUser.getImUserBizInfo()) == null || imUserBizInfo.getUserB2CAccountInfo() == null)) {
            C23250099c.LJ(C23271099x.INSTANCE, new C1335005Ki(iMUser, null));
        }
        switch (C880500YgS.LIZIZ[enumC880480YgQ.ordinal()]) {
            case 2:
                if (iMUser != null) {
                    if (iMUser.getFollowStatus() == 1 || iMUser.getFollowStatus() == 2) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 3:
                return C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF().LJFF(iMUser);
            case 4:
                return C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF().LJIIIIZZ(iMUser);
            case 5:
                List<C1669906gL> listLIZJ = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZJ(iMUser);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
                Iterator<C1669906gL> it2 = listLIZJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                return arrayList.contains(EnumC880470YgP.SUBSCRIBER);
            case 6:
                List<C1669906gL> listLIZJ2 = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZJ(iMUser);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
                Iterator<C1669906gL> it3 = listLIZJ2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().LIZ);
                }
                return arrayList2.contains(EnumC880470YgP.HIGH_LEVEL_MEMBER);
            case 7:
                List<C1669906gL> listLIZJ3 = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZJ(iMUser);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZJ3, 10));
                Iterator<C1669906gL> it4 = listLIZJ3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().LIZ);
                }
                return arrayList3.contains(EnumC880470YgP.LONG_TIME_FOLLOWER);
            case 8:
                List<C1669906gL> listLIZJ4 = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZJ(iMUser);
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLIZJ4, 10));
                Iterator<C1669906gL> it5 = listLIZJ4.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(it5.next().LIZ);
                }
                return arrayList4.contains(EnumC880470YgP.WITH_MUTUAL_FRIEND);
            case BdTuring.TYPE_ECAF /* 9 */:
                List<C1669906gL> listLIZJ5 = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZJ(iMUser);
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLIZJ5, 10));
                Iterator<C1669906gL> it6 = listLIZJ5.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(it6.next().LIZ);
                }
                return arrayList5.contains(EnumC880470YgP.ONE_WAY_FOLLOWER);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                IIMBusinessChatService.LIZ.getClass();
                IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                if (iIMBusinessChatService != null && (interfaceC877200Yb8LJIJI = iIMBusinessChatService.LJIJI()) != null && (boolLIZ = interfaceC877200Yb8LJIJI.LIZ(c0y8t, iMUser)) != null) {
                    if (iIMBusinessChatService != null && (interfaceC1670106gNLJIIZILJ = iIMBusinessChatService.LJIIZILJ()) != null) {
                        interfaceC1670106gNLJIIZILJ.LIZ(c0y8t.getConversationId(), EnumC877180Yb6.BUYER, boolLIZ.booleanValue());
                    }
                    return boolLIZ.booleanValue();
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.inbox.filter.FilterTabType r4, java.util.Set r5, X.C0Y8T r6, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r7, java.lang.String r8, X.C880150Yft r9) {
        /*
            boolean r0 = LJIIIIZZ(r4, r5)
            if (r0 == 0) goto L2a
            if (r7 != 0) goto L2a
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            if (r8 != 0) goto L23
            java.lang.String r0 = r6.getConversationId()
            long r0 = X.C0YNP.LJII(r0)
            java.lang.String r8 = java.lang.String.valueOf(r0)
        L23:
            r1 = 0
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r7 = r2.LJIIL(r8, r1, r0)
        L2a:
            java.util.Set<com.ss.android.ugc.aweme.inbox.filter.FilterTabType> r0 = X.C880490YgR.LLILZLL
            boolean r0 = r0.contains(r4)
            r3 = 1
            if (r0 != 0) goto L49
            java.util.Iterator r2 = r5.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()
            java.util.Set<X.0YgQ> r0 = X.C880490YgR.LLIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L37
        L49:
            if (r9 != 0) goto L64
            boolean r0 = r6.isSingleChat()
            if (r0 == 0) goto Lc0
            X.0Yj3 r2 = X.C882110Yj3.INSTANCE
        L53:
            X.01GW<X.0Yfs> r0 = X.C880130Yfr.LLJJ
            java.lang.Object r1 = r0.getValue()
            X.0Yfs r1 = (X.C880140Yfs) r1
            X.0Yfu r0 = new X.0Yfu
            r0.<init>(r2, r6, r7, r4)
            X.0Yft r9 = r1.LIZIZ(r0)
        L64:
            boolean r0 = LIZLLL(r4, r6)
            if (r0 == 0) goto L99
            X.10Ec r1 = X.C19212010Ec.LIZJ
            boolean r0 = r1.LIZLLL()
            if (r0 == 0) goto L7c
            X.0YgQ r0 = X.C880510YgT.LIZ(r4)
            boolean r0 = LJI(r0, r9)
            if (r0 == 0) goto L99
        L7c:
            boolean r0 = r1.LIZLLL()
            if (r0 == 0) goto L8c
            X.0YgQ r0 = X.C880510YgT.LIZ(r4)
            boolean r0 = LJII(r0, r7, r6)
            if (r0 == 0) goto L99
        L8c:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L9b
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9b
        L99:
            r3 = 0
            return r3
        L9b:
            java.util.Iterator r2 = r5.iterator()
        L9f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            X.0YgQ r1 = (X.EnumC880480YgQ) r1
            java.util.Set<X.0YgQ> r0 = X.C880490YgR.LLILLL
            boolean r0 = LJ(r1, r6)
            if (r0 == 0) goto L9f
            boolean r0 = LJI(r1, r9)
            if (r0 == 0) goto L9f
            boolean r0 = LJII(r1, r7, r6)
            if (r0 == 0) goto L9f
            return r3
        Lc0:
            X.06Qr r2 = X.C1606306Qr.INSTANCE
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880370YgF.LIZ(com.ss.android.ugc.aweme.inbox.filter.FilterTabType, java.util.Set, X.0Y8T, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, java.lang.String, X.0Yft):boolean");
    }
}
