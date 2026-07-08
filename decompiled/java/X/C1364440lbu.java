package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364440lbu {
    public static final boolean LIZ(C1371590lnR c1371590lnR) {
        if (c1371590lnR == null) {
            return false;
        }
        String string = c1371590lnR.LJIJJ.extras.getString("enter_method");
        String string2 = c1371590lnR.LJIJJ.extras.getString("enter_from");
        if (!Intrinsics.LJFF(string, "long_press") || Intrinsics.LJFF(string2, "live_merge")) {
            return false;
        }
        EnumC1369720lkQ enumC1369720lkQ = c1371590lnR.LJII;
        EnumC1369720lkQ enumC1369720lkQ2 = EnumC1369720lkQ.VERTICAL;
        if (enumC1369720lkQ == enumC1369720lkQ2 || c1371590lnR.LJIIJ != enumC1369720lkQ2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.os.Bundle r2, com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            X.0Sso r0 = X.C735280Sso.LIZ
            r0.getClass()
            boolean r0 = X.C735280Sso.LJIIIIZZ(r3)
            if (r0 == 0) goto L27
            r1 = 3
        Lc:
            java.lang.String r0 = "share_im_limit_tip_type"
            r2.putInt(r0, r1)
            if (r3 == 0) goto L1f
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.getUniqueId()
            if (r1 != 0) goto L21
        L1f:
            java.lang.String r1 = ""
        L21:
            java.lang.String r0 = "author_user_name"
            X.C786410Ut5.LJJJI(r0, r1, r2)
            return
        L27:
            boolean r0 = X.C735280Sso.LIZJ(r3)
            if (r0 == 0) goto L2f
            r1 = 2
            goto Lc
        L2f:
            boolean r0 = X.C735280Sso.LJI(r3)
            if (r0 == 0) goto L45
            r1 = 1
            if (r3 == 0) goto L45
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            if (r0 == 0) goto L45
            boolean r0 = r0.isAccuratePrivateAccount()
            if (r0 != r1) goto L45
            goto Lc
        L45:
            r1 = -1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364440lbu.LIZIZ(android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
