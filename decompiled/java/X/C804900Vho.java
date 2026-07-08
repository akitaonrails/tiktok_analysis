package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cache.FollowingHvrStrategyExp;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804900Vho {
    public static final C804900Vho LIZ = new C804900Vho();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0VLT());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0VLU());
    public static boolean LIZLLL;

    public static C0VLY LIZIZ() {
        return (C0VLY) LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) C0BBQ.LIZIZ.getValue()).booleanValue();
    }

    public static String LIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    public static String LIZJ() {
        ArrayList arrayList;
        List<C0VLN> listLIZJ;
        String strLJIILL = null;
        if (!LIZLLL()) {
            return null;
        }
        C01GW c01gw = FollowingHvrStrategyExp.LIZIZ;
        if (!((FollowingHvrStrategyExp.FollowingHvrStrategyConfigModel) c01gw.getValue()).enableDeliverServer) {
            return null;
        }
        int i = ((FollowingHvrStrategyExp.FollowingHvrStrategyConfigModel) c01gw.getValue()).limitCount;
        try {
            InterfaceC804960Vhu interfaceC804960Vhu = (InterfaceC804960Vhu) LIZJ.getValue();
            if (interfaceC804960Vhu == null || (listLIZJ = interfaceC804960Vhu.LIZJ(i, LIZ())) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
                for (C0VLN c0vln : listLIZJ) {
                    arrayList.add(new FollowFeedApiV2.FollowingFrequentUser(c0vln.LIZJ, null, Boolean.valueOf(c0vln.LIZLLL), Boolean.valueOf(c0vln.LJ)));
                }
            }
            C1227904rF.LIZ.getClass();
            strLJIILL = C1227904rF.LIZLLL().LJIILL(arrayList);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0Vhu] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0VLY] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804900Vho.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r6, java.lang.String r7) {
        /*
            X.01GW r0 = X.C2277061EAu.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 1
            if (r0 == 0) goto L10
            return r5
        L10:
            boolean r1 = X.C804900Vho.LIZLLL
            r0 = 0
            if (r1 != 0) goto L16
            return r0
        L16:
            X.0VLY r2 = LIZIZ()     // Catch: java.lang.Throwable -> L64
            r4 = 0
            if (r2 == 0) goto L56
            java.lang.String r1 = LIZ()     // Catch: java.lang.Throwable -> L64
            X.01GW r0 = X.C2277061EAu.LJ     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L64
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L64
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L64
            java.util.List r0 = r2.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L56
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        L37:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L58
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r1 = r2
            X.0VLP r1 = (X.C0VLP) r1     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L64
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L54
            java.lang.String r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L64
            boolean r0 = android.text.TextUtils.equals(r0, r7)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L37
        L54:
            r4 = r2
            goto L58
        L56:
            r5 = 0
            goto L5c
        L58:
            X.0VLP r4 = (X.C0VLP) r4     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L56
        L5c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L70:
            X.C189200o6.m5exceptionOrNullimpl(r2)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L7c
            r2 = r1
        L7c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804900Vho.LJ(java.lang.String, java.lang.String):boolean");
    }
}
