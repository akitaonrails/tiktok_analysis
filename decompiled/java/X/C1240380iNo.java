package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240380iNo {
    public static final C1240380iNo LIZ = new C1240380iNo();

    public static List LIZ(C1240380iNo c1240380iNo, List list, List list2, List list3, EnumC1240620iOC enumC1240620iOC) {
        boolean z;
        Object next;
        C0ZFW c0zfw;
        boolean z2;
        Pair pair;
        IMUser iMUser;
        boolean z3;
        String uid;
        Object next2;
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(370);
        c1240380iNo.getClass();
        ArrayList<C1240340iNk> arrayList = new ArrayList();
        Iterator it2 = list3.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next3 = it2.next();
            if (((C1240340iNk) next3).LIZIZ == 1) {
                arrayList.add(next3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1240340iNk c1240340iNk : arrayList) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((C0Y8T) next).getConversationId(), c1240340iNk.LIZJ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0Y8T c0y8t = (C0Y8T) next;
            if (c0y8t != null && !((Boolean) aFwS248S0000000_14.invoke(c1240340iNk.LIZJ)).booleanValue() && (c0zfw = C0ZFW.LIZ) != null && c0zfw.LJIIIZ(c0y8t) == z) {
                String str = c1240340iNk.LIZLLL;
                C907810ZjP c907810ZjP = C907810ZjP.LIZ;
                String name = c0y8t.getCoreInfo().getName();
                c907810ZjP.getClass();
                String strLIZLLL = C907810ZjP.LIZLLL(name);
                C743770TFn.LIZ.getClass();
                Pair pairLIZJ = C743770TFn.LIZJ(strLIZLLL, str);
                int iIntValue = ((Number) pairLIZJ.getFirst()).intValue();
                int iIntValue2 = ((Number) pairLIZJ.getSecond()).intValue();
                List<C1240300iNg> list4 = c1240340iNk.LIZ;
                ArrayList<C1240300iNg> arrayList3 = new ArrayList();
                for (C1240300iNg c1240300iNg : list4) {
                    if (c1240300iNg.LIZ == 2) {
                        arrayList3.add(c1240300iNg);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (C1240300iNg c1240300iNg2 : arrayList3) {
                    if (list != null) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                if (Intrinsics.LJFF(((BaseContact) next2).getUid(), c1240300iNg2.LIZIZ)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        iMUser = (IMUser) next2;
                    } else {
                        iMUser = null;
                    }
                    Iterator<Long> it5 = c0y8t.getMemberIds().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            String string = it5.next().toString();
                            if (iMUser != null) {
                                uid = iMUser.getUid();
                            } else {
                                uid = null;
                            }
                            if (Intrinsics.LJFF(string, uid)) {
                                z3 = true;
                                break;
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    if (iMUser != null && z3) {
                        C1240410iNr.LIZ.getClass();
                        if (C1240410iNr.LIZ(iMUser)) {
                            C743770TFn c743770TFn = C743770TFn.LIZ;
                            String nickName = iMUser.getNickName();
                            if (nickName == null) {
                                nickName = "";
                            }
                            c743770TFn.getClass();
                            arrayList4.add(new C1240390iNp(iMUser, ((Number) C743770TFn.LIZJ(nickName, str).getFirst()).intValue()));
                        }
                    }
                }
                Iterator it6 = arrayList4.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (((C1240390iNp) it6.next()).LIZIZ != -1) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (iIntValue != -1 || z2) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLLL(new Comparator<C1240390iNp>() { // from class: X.0iNq
                        public static int LIZ(C1240390iNp c1240390iNp) {
                            if (c1240390iNp == null) {
                                return 3;
                            }
                            int followStatus = c1240390iNp.LIZ.getFollowStatus();
                            if (followStatus == EnumC1240560iO6.FOLLOW_EACH_OTHER.getStatus()) {
                                return 0;
                            }
                            if (followStatus == EnumC1240560iO6.FOLLOWING.getStatus()) {
                                return 1;
                            }
                            return 2;
                        }

                        @Override // java.util.Comparator
                        public final int compare(C1240390iNp c1240390iNp, C1240390iNp c1240390iNp2) {
                            int i;
                            int i2;
                            long jLongValue;
                            Long lLJIILIIL;
                            Long lLJIILIIL2;
                            C1240390iNp c1240390iNp3 = c1240390iNp;
                            C1240390iNp c1240390iNp4 = c1240390iNp2;
                            if (c1240390iNp3 != null) {
                                if (c1240390iNp4 != null && (i = c1240390iNp3.LIZIZ) >= (i2 = c1240390iNp4.LIZIZ)) {
                                    if (i <= i2) {
                                        if (LIZ(c1240390iNp3) >= LIZ(c1240390iNp4)) {
                                            if (LIZ(c1240390iNp3) <= LIZ(c1240390iNp4)) {
                                                String uid2 = c1240390iNp3.LIZ.getUid();
                                                long jLongValue2 = 0;
                                                if (uid2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(uid2)) != null) {
                                                    jLongValue = lLJIILIIL2.longValue();
                                                } else {
                                                    jLongValue = 0;
                                                }
                                                String uid3 = c1240390iNp4.LIZ.getUid();
                                                if (uid3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid3)) != null) {
                                                    jLongValue2 = lLJIILIIL.longValue();
                                                }
                                                return (int) (jLongValue - jLongValue2);
                                            }
                                            return 1;
                                        }
                                        return -1;
                                    }
                                    return 1;
                                }
                                return -1;
                            }
                            return 1;
                        }
                    }, arrayList4), null, null, null, 0, null, new AwS598S0100000_19(c0y8t, 528), 31);
                    C743770TFn.LIZ.getClass();
                    Pair pairLIZJ2 = C743770TFn.LIZJ(strLJJLIIIJ, str);
                    int iIntValue3 = ((Number) pairLIZJ2.getFirst()).intValue();
                    C1240210iNX c1240210iNX = new C1240210iNX(c0y8t, enumC1240620iOC, new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(((Number) pairLIZJ2.getSecond()).intValue())), c0y8t.getMemberCount(), strLJJLIIIJ, new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), strLIZLLL);
                    if (iIntValue == -1) {
                        pair = new Pair(Integer.valueOf(iIntValue3), 4);
                    } else if (iIntValue3 != -1 && iIntValue >= iIntValue3 && iIntValue > iIntValue3) {
                        pair = new Pair(Integer.valueOf(iIntValue3), 4);
                    } else {
                        pair = new Pair(Integer.valueOf(iIntValue), 2);
                    }
                    arrayList2.add(new C1240530iO3(c1240210iNX, new C1240520iO2(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 0, c0y8t.getUpdatedTime(), false, true, 8), null, C0PGF.GROUP, c0y8t.getConversationId(), "accounts", 284));
                }
            }
            z = true;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (X.C1240410iNr.LIZ(r16) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1240530iO3 LIZIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r16, X.C0Y8T r17, java.lang.String r18, X.EnumC1240620iOC r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240380iNo.LIZIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.0Y8T, java.lang.String, X.0iOC, boolean, boolean):X.0iO3");
    }
}
