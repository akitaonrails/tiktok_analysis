package X;

import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1577606Fq {
    public static final C1577606Fq LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C054G LJFF;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1577606Fq.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1577606Fq c1577606Fq = new C1577606Fq();
        LIZIZ = c1577606Fq;
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(548));
        LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(549));
        C1598406Nq c1598406Nq = c1577606Fq.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1577606Fq) {
                c1598406Nq = c1577606Fq.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1577606Fq.LIZ = c1598406Nq;
                }
            }
        }
        LJFF = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static boolean LIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r4, X.EnumC1578706Gb r5) {
        /*
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.String r2 = java.lang.String.valueOf(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "result"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            java.lang.String r2 = r5.toString()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "badge_style"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            java.util.Map r4 = X.C2097608Jq.LJIIIIZZ(r3)
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L37
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L4c
        L37:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "streak_badge_show_error, "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
        L4c:
            boolean r0 = LIZ()
            if (r0 != 0) goto L53
            return
        L53:
            X.054G r3 = X.C1577606Fq.LJFF
            X.05uF r2 = new X.05uF
            r1 = 0
            r2.<init>(r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577606Fq.LIZIZ(int, X.06Gb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r4, java.lang.String r5, long r6, com.ss.android.ugc.aweme.im.streak.api.StreakData r8) {
        /*
            r0 = 6
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "result"
            r1.<init>(r0, r4)
            r0 = 0
            r3[r0] = r1
            java.lang.String r2 = java.lang.String.valueOf(r6)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "end_time"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            int r0 = r8.streak
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "streak_days"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            long r0 = r8.restoreAvailableTime
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "restorable_before"
            r1.<init>(r0, r2)
            r4 = 3
            r3[r4] = r1
            int r0 = r8.remainRestoreCnt
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "remain_restore_count"
            r1.<init>(r0, r2)
            r0 = 4
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r5)
            r0 = 5
            r3[r0] = r1
            java.util.Map r3 = X.C2097608Jq.LJIIIIZZ(r3)
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L6d
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L82
        L6d:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "streak_insert_end_inline, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
        L82:
            boolean r0 = LIZ()
            if (r0 != 0) goto L89
            return
        L89:
            X.054G r2 = X.C1577606Fq.LJFF
            X.05uG r1 = new X.05uG
            r0 = 0
            r1.<init>(r3, r0)
            X.C23250099c.LIZLLL(r2, r0, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577606Fq.LIZJ(java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.im.streak.api.StreakData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            X.0I0B r2 = X.C0I0B.LJFF
            r2.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L14
            r2.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L29
        L14:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "streak_invalid_data, "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
        L29:
            r2.LIZIZ()
            r0 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "result"
            r1.<init>(r0, r4)
            r0 = 0
            r3[r0] = r1
            java.lang.String r2 = ""
            if (r5 != 0) goto L3e
            r5 = r2
        L3e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r5)
            r0 = 1
            r3[r0] = r1
            if (r6 != 0) goto L4b
            r6 = r2
        L4b:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "log_id"
            r1.<init>(r0, r6)
            r0 = 2
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pull_type"
            r1.<init>(r0, r7)
            r0 = 3
            r3[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r3)
            java.lang.String r0 = "streak_invalid_data"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577606Fq.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r8, X.C06ET r9, java.lang.String r10, java.lang.String r11) {
        /*
            X.0I0B r7 = X.C0I0B.LJFF
            X.0I8r r0 = r7.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r3 = r0.getCurUserId()
            if (r3 != 0) goto L10
            java.lang.String r3 = ""
        L10:
            r0 = 6
            kotlin.Pair[] r2 = new kotlin.Pair[r0]
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r3)
            java.lang.String r6 = "1"
            java.lang.String r5 = "0"
            if (r0 == 0) goto L98
            r4 = r6
        L1e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "error_peer_uid"
            r1.<init>(r0, r4)
            r0 = 0
            r2[r0] = r1
            r4 = 1
            if (r8 == 0) goto L96
            int r0 = r8.length()
            if (r0 != 0) goto L96
        L31:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_peer_uid_empty"
            r1.<init>(r0, r6)
            r2[r4] = r1
            java.lang.String r4 = r9.LIZ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "panel_type"
            r1.<init>(r0, r4)
            r0 = 2
            r2[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r10)
            r4 = 3
            r2[r4] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r11)
            r0 = 4
            r2[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "cur_uid"
            r1.<init>(r0, r3)
            r0 = 5
            r2[r0] = r1
            java.util.Map r3 = X.C2097608Jq.LJIIIIZZ(r2)
            r7.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L7a
            r7.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L8f
        L7a:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "streak_panel_params_error, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
        L8f:
            boolean r0 = LIZ()
            if (r0 != 0) goto L9a
            return
        L96:
            r6 = r5
            goto L31
        L98:
            r4 = r5
            goto L1e
        L9a:
            X.054G r2 = X.C1577606Fq.LJFF
            X.05uH r1 = new X.05uH
            r0 = 0
            r1.<init>(r3, r0)
            X.C23250099c.LIZLLL(r2, r0, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577606Fq.LJ(java.lang.String, X.06ET, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C2272721DxW r11, int r12, java.lang.String r13, long r14) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577606Fq.LJFF(X.1DxW, int, java.lang.String, long):void");
    }
}
