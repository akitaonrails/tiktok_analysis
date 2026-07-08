package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedsDBConfig;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806500VkO {
    public static final C806500VkO LIZ = new C806500VkO();
    public static volatile EnumC806530VkR LIZIZ = EnumC806530VkR.INIT;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(138));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(137));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(136));
    public static final int LJFF = ((FriendsV3FeedsDBConfig) C806540VkS.LIZIZ.getValue()).feedsCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse> r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806500VkO.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZIZ(X.C0VM7 r8, kotlin.jvm.functions.Function2<? super X.C0VM7, ? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r9, X.InterfaceC1364105Vn<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C805720Vj8
            if (r0 == 0) goto L59
            r5 = r10
            X.0Vj8 r5 = (X.C805720Vj8) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r6 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            java.lang.String r3 = "DB"
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L67
            if (r0 != r2) goto L5f
            X.C155000ia.LIZIZ(r6)
        L27:
            return r6
        L28:
            X.C155000ia.LIZIZ(r6)
            X.01GW r0 = X.C260190AHp.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            X.01GW r0 = X.C260220AHs.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L89
            java.lang.Object r6 = r9.invoke(r8, r5)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L89
            if (r6 != r4) goto L27
            goto L6b
        L50:
            r5.LLILLL = r2
            java.lang.Object r6 = r9.invoke(r8, r5)
            if (r6 != r4) goto L27
            return r4
        L59:
            X.0Vj8 r5 = new X.0Vj8
            r5.<init>(r7, r10)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L89
            return r6
        L6b:
            return r4
        L6c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "safelyOpt exception caught: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0W17.LIZ(r3, r0)
            r6 = 0
            return r6
        L89:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "safelyOpt CancellationException caught: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0W17.LIZ(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806500VkO.LIZIZ(X.0VM7, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
