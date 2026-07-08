package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664606fU {
    public static final C1664606fU LIZ = new C1664606fU();
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(2, 4, 5);
    public static final Map<String, List<Integer>> LIZJ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("business", Collections.singletonList(1));
        linkedHashMap.put("ba", C1697810uHb.LJIIJJI(1, 2, 4, 5, 6));
        linkedHashMap.put("ad", C1697810uHb.LJIIJJI(1, 2, 3, 7));
        linkedHashMap.put("live", C1697810uHb.LJIIJJI(1, 2));
        linkedHashMap.put("oa", C1697810uHb.LJIIJJI(1, 2));
        linkedHashMap.put("mapi", Collections.singletonList(1));
        linkedHashMap.put("tts", C1697810uHb.LJIIJJI(1, 2, 3));
        LIZJ = linkedHashMap;
    }

    public static Boolean LIZ(IMUser iMUser) {
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        Integer num;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (num = userB2CAccountInfo.enableDMPermissionInbox) != null) {
            int iIntValue = num.intValue();
            boolean z = true;
            if (iIntValue != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public static Boolean LIZIZ(IMUser iMUser) {
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        Integer num;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (num = userB2CAccountInfo.enableEnterBusinessInbox) != null) {
            int iIntValue = num.intValue();
            boolean z = true;
            if (iIntValue != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: Exception -> 0x00b3, TryCatch #0 {Exception -> 0x00b3, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0021, B:14:0x0028, B:24:0x004b, B:25:0x0055, B:27:0x005b, B:29:0x0071, B:31:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009f, B:41:0x00ae, B:42:0x00b0, B:16:0x002e, B:18:0x0034), top: B:46:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r9) {
        /*
            r8 = 0
            if (r9 == 0) goto L4a
            X.06fU r0 = X.C1664606fU.LIZ
            java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> r1 = X.C1664606fU.LIZJ
            r0.getClass()
            X.013C r4 = new X.013C
            r4.<init>()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r9.getImUserBizInfo()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.userTags     // Catch: java.lang.Exception -> Lb3
            if (r2 != 0) goto L21
        L1f:
            java.lang.String r2 = ""
        L21:
            r3 = 1
            java.util.Map r5 = X.C1665206fa.LIZIZ(r9, r3)     // Catch: java.lang.Exception -> Lb3
            if (r1 == 0) goto L2e
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L4b
        L2e:
            boolean r0 = X.C866950Xzh.LIZ(r2)     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L44
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r0 = "setting user empty, open default, userTags: "
            r1.append(r0)     // Catch: java.lang.Exception -> Lb3
            r1.append(r2)     // Catch: java.lang.Exception -> Lb3
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb3
            goto L49
        L44:
            if (r1 == 0) goto L4a
            goto L4b
        L47:
            if (r0 == 0) goto L55
        L49:
            r8 = 1
        L4a:
            return r8
        L4b:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Exception -> Lb3
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Exception -> Lb3
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> Lb3
        L55:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto L4a
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Exception -> Lb3
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r0 = r2.getKey()     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Exception -> Lb3
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> Lb3
            boolean r0 = X.C866950Xzh.LIZIZ(r6)     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Exception -> Lb3
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> Lb3
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> Lb3
            if (r0 != 0) goto Lab
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Exception -> Lb3
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> Lb3
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> Lb3
        L8c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto Lad
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb3
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> Lb3
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lb3
            if (r6 == 0) goto L8c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lb3
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Exception -> Lb3
            if (r0 != r3) goto L8c
            if (r1 == 0) goto Lad
        Lab:
            r0 = 1
            goto Lae
        Lad:
            r0 = 0
        Lae:
            r4.element = r0     // Catch: java.lang.Exception -> Lb3
        Lb0:
            boolean r0 = r4.element     // Catch: java.lang.Exception -> Lb3
            goto L47
        Lb3:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.util.Log.getStackTraceString(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1664606fU.LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser):boolean");
    }

    public static boolean LIZLLL(IMUser iMUser) {
        List<Integer> list;
        if (iMUser != null) {
            Map<String, List<Integer>> mapLIZIZ = C1665206fa.LIZIZ(iMUser, true);
            if ((!mapLIZIZ.isEmpty()) && (list = mapLIZIZ.get("business")) != null && list.contains(1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(IMUser iMUser) {
        List<Integer> list;
        if (iMUser == null) {
            return false;
        }
        List<Integer> list2 = C1665206fa.LIZIZ(iMUser, true).get("ba");
        if ((list2 == null || !list2.contains(4)) && ((list = C1665206fa.LIZIZ(iMUser, true).get("ba")) == null || !list.contains(6))) {
            return false;
        }
        return true;
    }

    public static boolean LJ(SessionInfo sessionInfo, IMUser iMUser) {
        String uid;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        linkedHashSet.addAll(C1665206fa.LIZJ(uid));
        linkedHashSet.add(Integer.valueOf(sessionInfo.getEntranceType()));
        return linkedHashSet.contains(2);
    }
}
