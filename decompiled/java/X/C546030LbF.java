package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0LbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546030LbF {
    public static final C546030LbF LIZ = new C546030LbF();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0LQ4 r14, java.lang.String r15, java.lang.Boolean r16, java.lang.Boolean r17, X.EnumC546020LbE r18, com.ss.android.ugc.aweme.creative.model.CreativeModel r19) {
        /*
            r15 = r15
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6 = r16
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r7)
            r9 = 1
            r11 = 0
            r5 = r17
            if (r0 != 0) goto La2
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r7)
            if (r0 != 0) goto La2
            r3 = 0
        L16:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r2)
            if (r0 != 0) goto La0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            if (r0 != 0) goto La0
            r1 = 0
        L25:
            r8 = 2
            r4 = r18
            if (r3 == 0) goto L96
            X.0LbE r0 = X.EnumC546020LbE.READY
            if (r4 != r0) goto L9c
            X.0LbE r0 = X.EnumC546020LbE.READY
            if (r4 != r0) goto L96
        L32:
            r10 = 1
        L33:
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "server_task_id"
            r1.<init>(r0, r15)
            r3[r11] = r1
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r7)
            if (r0 != 0) goto L94
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r7)
            if (r0 != 0) goto L94
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r2)
            if (r0 != 0) goto L92
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            if (r0 != 0) goto L92
            r0 = -1
        L58:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "auth_result"
            r1.<init>(r0, r2)
            r3[r9] = r1
            java.lang.String r2 = r4.getTag()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "local_state"
            r1.<init>(r0, r2)
            r3[r8] = r1
            java.util.Map r13 = X.C2097608Jq.LJIIIIZZ(r3)
            r1 = r19
            if (r1 == 0) goto La5
            X.0LdT r0 = X.C547410LdT.LIZ
            X.0LTe r2 = X.EnumC543480LTe.RECONCILE
            java.lang.String r3 = r14.getBranchName()
            java.lang.String r6 = ""
            java.util.Map r8 = X.C2097608Jq.LJ()
            r0.getClass()
            r4 = r10
            r5 = r11
            r7 = r13
            X.C547410LdT.LIZJ(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L92:
            r0 = 0
            goto L58
        L94:
            r0 = 1
            goto L58
        L96:
            if (r1 == 0) goto L9e
            X.0LbE r0 = X.EnumC546020LbE.READY
            if (r4 != r0) goto L32
        L9c:
            r10 = 0
            goto L33
        L9e:
            r10 = 2
            goto L33
        La0:
            r1 = 1
            goto L25
        La2:
            r3 = 1
            goto L16
        La5:
            X.0LdT r1 = X.C547410LdT.LIZ
            X.0LTe r6 = X.EnumC543480LTe.RECONCILE
            java.lang.String r7 = ""
            java.lang.String r8 = "ai_theater"
            java.lang.String r9 = r14.getBranchName()
            int r0 = r15.length()
            if (r0 != 0) goto Lbb
            java.lang.String r15 = r14.getBranchName()
        Lbb:
            java.lang.String r12 = ""
            java.util.Map r14 = X.C2097608Jq.LJ()
            r1.getClass()
            X.C547410LdT.LJ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C546030LbF.LIZ(X.0LQ4, java.lang.String, java.lang.Boolean, java.lang.Boolean, X.0LbE, com.ss.android.ugc.aweme.creative.model.CreativeModel):void");
    }

    public static void LIZIZ(C546030LbF c546030LbF, CreativeModel creativeModel, EnumC546550Lc5 enumC546550Lc5, int i, String str, Map map, int i2) {
        Map mapLJ = map;
        String str2 = str;
        if ((i2 & 16) != 0) {
            str2 = "";
        }
        if ((i2 & 32) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        c546030LbF.getClass();
        String branchName = enumC546550Lc5.getBranchName();
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
        Map mapLJ2 = C2097608Jq.LJ();
        c547410LdT.getClass();
        C547410LdT.LIZJ(creativeModel, enumC543480LTe, branchName, i, 0, str2, mapLJ, mapLJ2);
    }

    public static void LIZJ(C546030LbF c546030LbF, CreativeModel creativeModel, EnumC548240Leo enumC548240Leo, int i, int i2, String str, Map map, int i3) {
        String str2 = str;
        Map mapLJ = map;
        int i4 = i2;
        if ((i3 & 8) != 0) {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            str2 = "";
        }
        if ((i3 & 32) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        c546030LbF.getClass();
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.SAVE;
        String branchName = enumC548240Leo.getBranchName();
        Map mapLJ2 = C2097608Jq.LJ();
        c547410LdT.getClass();
        C547410LdT.LIZJ(creativeModel, enumC543480LTe, branchName, i, i4, str2, mapLJ, mapLJ2);
    }
}
