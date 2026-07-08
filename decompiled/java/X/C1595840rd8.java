package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595840rd8 {
    public static int LIZIZ(int i) {
        if (C319860CgK.LIZ() && i == 0) {
            return R.attr.a01;
        }
        return R.attr.zk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (X.C298490Bmx.LIZ() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r3, X.C1596360rdy r4) {
        /*
            X.01GW r0 = X.C0AWR.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L36
            if (r3 != r2) goto L24
            boolean r0 = X.C298490Bmx.LIZ()
            if (r0 == 0) goto L35
        L17:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            boolean r0 = X.C10EU.LJIILJJIL(r0)
            r0 = r0 ^ 1
            return r0
        L24:
            r1 = 0
            if (r3 != 0) goto L33
            boolean r0 = X.C298530Bn1.LIZ()
            if (r0 == 0) goto L33
            r0 = 1
        L2e:
            if (r1 != 0) goto L17
            if (r0 == 0) goto L35
            goto L17
        L33:
            r0 = 0
            goto L2e
        L35:
            return r2
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595840rd8.LIZJ(int, X.0rdy):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1595740rcy LIZ(java.util.List r9, int r10, X.EnumC1582650rHr r11) {
        /*
            X.0rHr r0 = X.EnumC1582650rHr.HIGH_VALUE_FOLLOW_RELATIONSHIP
            r6 = 0
            if (r11 != r0) goto L59
            r8 = 1
            if (r10 != r8) goto L59
            com.ss.android.ugc.aweme.ab.AvatarRefreshConfig r0 = X.C1595910rdF.LIZ()
            int r5 = r0.refreshTop
            r0 = r9
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            r3 = 0
        L16:
            if (r3 >= r4) goto L53
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r3)
            X.0rdI r7 = (X.InterfaceC1595940rdI) r7
            X.0rgC r1 = X.C1597740rgC.LIZ
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r7.LLIILZL()
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r2 = X.C1597740rgC.LJII(r0)
            if (r2 == 0) goto L50
            int r0 = r2.getSkylightAvatarRefresh()
            if (r0 != r8) goto L50
            if (r3 <= r5) goto L4d
            r8 = 0
            r9 = 2
        L37:
            long r0 = r2.getId()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            long r0 = r2.getOwnerUserId()
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L47:
            X.0rcy r5 = new X.0rcy
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L4d:
            r9 = 3
            r6 = r7
            goto L37
        L50:
            int r3 = r3 + 1
            goto L16
        L53:
            r7 = r6
            r10 = r6
            r11 = r6
            r8 = 0
            r9 = 3
            goto L47
        L59:
            r7 = r6
            r10 = r6
            r11 = r6
            r8 = 0
            r9 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595840rd8.LIZ(java.util.List, int, X.0rHr):X.0rcy");
    }
}
