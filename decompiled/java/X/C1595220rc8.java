package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595220rc8 {
    public static final C1595220rc8 LIZ = new C1595220rc8();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> LIZJ = new ConcurrentHashMap<>();
    public static String LIZLLL = C0XQ7.LJFF().getCurUserId();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(533));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(532));

    public static void LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (Intrinsics.LJFF(curUserId, LIZLLL)) {
            return;
        }
        LIZLLL = curUserId;
        LIZIZ.clear();
        LIZJ.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZIZ(String str) {
        switch (str.hashCode()) {
            case -1572049565:
                if (!str.equals("notification_page")) {
                    return -1;
                }
                return 3;
            case -1271119582:
                if (!str.equals("homepage_follow")) {
                    return -1;
                }
                return 2;
            case -667094460:
                if (!str.equals("homepage_friends")) {
                    return -1;
                }
                return 0;
            case 1691937916:
                if (!str.equals("homepage_hot")) {
                    return -1;
                }
                return 1;
            default:
                return -1;
        }
    }

    public static String LIZJ(InterfaceC1595240rcA interfaceC1595240rcA) {
        String cellType;
        if (interfaceC1595240rcA == null || (cellType = interfaceC1595240rcA.getCellType()) == null) {
            return "";
        }
        return cellType;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.InterfaceC1595240rcA r2) {
        /*
            if (r2 == 0) goto L21
            boolean r1 = r2.isSingleUser()
            java.lang.String r0 = r2.getUid()
            if (r0 != 0) goto Le
        Lc:
            java.lang.String r0 = ""
        Le:
            if (r1 != 0) goto L20
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "_2"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
        L20:
            return r0
        L21:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595220rc8.LIZLLL(X.0rcA):java.lang.String");
    }

    public static void LJ(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (!Intrinsics.LJFF(str, "notification_page")) {
            return;
        }
        String str3 = C0NBD.LIZ;
        if (str3 != null) {
            jSONObject.put("inbox_session_id", str3);
        }
        jSONObject.put("is_first_screen", C1599780rjU.LIZ.LIZJ(str2));
        jSONObject.put("enter_method", C1595250rcB.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[PHI: r9
      0x004e: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:19:0x004b, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.InterfaceC1891350zJl r11, java.lang.String r12, int r13, X.InterfaceC1595240rcA r14) {
        /*
            boolean r0 = r11 instanceof X.InterfaceC1595240rcA
            r10 = 0
            if (r0 == 0) goto L50
            X.0rcA r11 = (X.InterfaceC1595240rcA) r11
        L7:
            java.lang.String r2 = LIZLLL(r11)
            java.lang.String r7 = LIZJ(r11)
            if (r14 == 0) goto L4a
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.getUser()
            if (r0 == 0) goto L4a
            java.lang.String r9 = r0.getUid()
        L1b:
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.getUser()
            if (r0 == 0) goto L4e
            long r0 = r0.roomId
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L27:
            LIZ()
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r7)
            r0.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>> r3 = X.C1595220rc8.LIZIZ
            r6 = r12
            java.lang.Object r0 = r3.get(r6)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L52
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L52
            return
        L4a:
            r9 = r10
            if (r14 == 0) goto L4e
            goto L1b
        L4e:
            r5 = r10
            goto L27
        L50:
            r11 = r10
            goto L7
        L52:
            int r4 = LIZIZ(r6)
            X.0rdb r1 = X.C1596130rdb.LIZ
            int r0 = LIZIZ(r6)
            r1.getClass()
            X.0rda r0 = X.C1596130rdb.LJFF(r0)
            if (r0 == 0) goto Lb9
            java.lang.String r8 = r0.LIZ()
        L69:
            java.util.concurrent.ConcurrentHashMap r1 = X.C1596130rdb.LIZLLL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.get(r0)
            X.0rda r0 = (X.C1596120rda) r0
            if (r0 == 0) goto Lb7
            long r0 = r0.LJIILL
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L7f:
            java.lang.Object r1 = r3.get(r6)
            if (r1 != 0) goto L91
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.lang.Object r0 = r3.putIfAbsent(r6, r1)
            if (r0 == 0) goto L91
            r1 = r0
        L91:
            java.util.Map r1 = (java.util.Map) r1
            r3 = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r0)
            java.lang.String r0 = "notification_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto Lac
            java.lang.String r10 = X.C1181204ji.LIZ(r7, r9)
            X.0rjU r0 = X.C1599780rjU.LIZ
            r0.LIZLLL(r10)
        Lac:
            X.0TrR r2 = new X.0TrR
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "topwindow_cell_show"
            X.C994000byQ.LIZIZ(r0, r2)
            return
        Lb7:
            r4 = r10
            goto L7f
        Lb9:
            r8 = r10
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595220rc8.LJI(X.0zJl, java.lang.String, int, X.0rcA):void");
    }

    public static void LJFF(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        String strLIZ;
        C1596130rdb c1596130rdb = C1596130rdb.LIZ;
        int iLIZIZ = LIZIZ(str);
        c1596130rdb.getClass();
        C1596120rda c1596120rdaLJFF = C1596130rdb.LJFF(iLIZIZ);
        if (c1596120rdaLJFF != null) {
            strLIZ = c1596120rdaLJFF.LIZ();
        } else {
            strLIZ = null;
        }
        C994000byQ.LIZIZ("enter_topwindow", new C743860TFw(str, str2, i, i2, i3, i4, i5, i6, i7, i8, z, strLIZ));
    }
}
