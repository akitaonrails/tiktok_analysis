package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0e1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072930e1j {
    public static final C1072930e1j LIZ = new C1072930e1j();
    public static final Keva LIZIZ = Keva.getRepo("repo_new_version_journey");
    public static Boolean LIZJ;
    public static Boolean LIZLLL;

    public static void LIZ() {
        Keva keva = LIZIZ;
        keva.storeBoolean("key_new_version", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_cache_ready_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static final boolean LIZJ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_rec_friends_has_shown_");
        LIZ.getClass();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL() {
        /*
            java.lang.Boolean r0 = X.C1072930e1j.LIZLLL
            if (r0 != 0) goto L33
            X.0e6h r0 = X.C1076010e6h.LIZJ
            X.0dxv r0 = r0.LJIIJ()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto L3a
            X.0e1j r0 = X.C1072930e1j.LIZ
            r0.getClass()
            r1 = 1
            boolean r0 = LIZIZ(r1)
            if (r0 != 0) goto L3a
            boolean r0 = X.C1073090e1z.LIZ()
            if (r0 == 0) goto L3a
            X.0e1G r0 = X.C1072640e1G.LIZ
            r0.getClass()
            boolean r0 = X.C1072640e1G.LIZIZ()
            if (r0 == 0) goto L3a
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C1072930e1j.LIZLLL = r0
        L33:
            java.lang.Boolean r0 = X.C1072930e1j.LIZLLL
            boolean r0 = r0.booleanValue()
            return r0
        L3a:
            r1 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1072930e1j.LIZLLL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ() {
        /*
            java.lang.Boolean r0 = X.C1072930e1j.LIZJ
            r3 = 0
            if (r0 != 0) goto L50
            X.1Bz1 r0 = X.C2222691Bz1.LIZ
            r0.getClass()
            java.lang.String r0 = X.C2222691Bz1.LJ()
            java.lang.String r2 = "RU"
            r1 = 1
            boolean r0 = kotlin.text.u.LJIJI(r2, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = X.C2222691Bz1.LIZIZ()
            boolean r0 = kotlin.text.u.LJIJI(r2, r0, r1)
            if (r0 != 0) goto L5f
            X.0e6h r0 = X.C1076010e6h.LIZJ
            X.0dzo r0 = r0.LJII()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto L5d
            X.0e1j r0 = X.C1072930e1j.LIZ
            r0.getClass()
            r0 = 2
            boolean r0 = LIZIZ(r0)
            if (r0 != 0) goto L5d
            boolean r0 = X.C1073090e1z.LIZ()
            if (r0 == 0) goto L5d
            X.0e1G r0 = X.C1072640e1G.LIZ
            r0.getClass()
            boolean r0 = X.C1072640e1G.LIZIZ()
            if (r0 == 0) goto L5d
        L4a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L4e:
            X.C1072930e1j.LIZJ = r0
        L50:
            com.ss.android.ugc.aweme.relation.service.ISocialMonoFreqControlService r1 = com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService.LIZIZ()
            X.1E7L r0 = X.C1E7L.AUTH_FB
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto L62
            return r3
        L5d:
            r1 = 0
            goto L4a
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L4e
        L62:
            java.lang.Boolean r0 = X.C1072930e1j.LIZJ
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1072930e1j.LJ():boolean");
    }

    public static boolean LIZIZ(int i) {
        Pair<Boolean, Long> pairLJII;
        ISocialFriendsService iSocialFriendsServiceLJIIZILJ = C1076010e6h.LIZJ.LJIIZILJ();
        if (iSocialFriendsServiceLJIIZILJ != null && (pairLJII = iSocialFriendsServiceLJIIZILJ.LJII(i)) != null && pairLJII.getFirst().booleanValue() && System.currentTimeMillis() < pairLJII.getSecond().longValue() + 2592000000L) {
            return true;
        }
        return false;
    }
}
