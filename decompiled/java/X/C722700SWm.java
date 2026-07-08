package X;

import com.ss.android.ugc.aweme.comment.model.HolidayModel;

/* JADX INFO: renamed from: X.0SWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722700SWm {
    public static final C722700SWm LIZ = new C722700SWm();
    public static final HolidayModel[] LIZIZ = new HolidayModel[0];

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[PHI: r7 r11
      0x0044: PHI (r7v3 java.lang.Long) = (r7v1 java.lang.Long), (r7v6 java.lang.Long) binds: [B:15:0x003b, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r11v3 com.ss.android.ugc.aweme.comment.model.HolidayModel) = 
      (r11v1 com.ss.android.ugc.aweme.comment.model.HolidayModel)
      (r11v5 com.ss.android.ugc.aweme.comment.model.HolidayModel)
     binds: [B:15:0x003b, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.comment.model.HolidayModel LIZ() {
        /*
            long r12 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r12 = r12 / r0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.HolidayModel[]> r1 = com.ss.android.ugc.aweme.comment.model.HolidayModel[].class
            com.ss.android.ugc.aweme.comment.model.HolidayModel[] r10 = X.C722700SWm.LIZIZ
            java.lang.String r0 = "comment_holiday_champaigns"
            java.lang.Object r0 = r2.LJIIIIZZ(r0, r1, r10)
            com.ss.android.ugc.aweme.comment.model.HolidayModel[] r0 = (com.ss.android.ugc.aweme.comment.model.HolidayModel[]) r0
            if (r0 == 0) goto L1b
            r10 = r0
        L1b:
            int r9 = r10.length
            r11 = 0
            r8 = 0
            r7 = r11
        L1f:
            if (r8 >= r9) goto L5f
            r6 = r10[r8]
            java.lang.Long r0 = r6.startTimeStamp
            if (r0 == 0) goto L5a
            long r3 = r0.longValue()
            java.lang.Long r0 = r6.endTimeStamp
            if (r0 == 0) goto L5a
            long r1 = r0.longValue()
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 > 0) goto L5a
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L5a
            if (r7 != 0) goto L44
            if (r11 != 0) goto L5a
            java.lang.Long r7 = r6.priority
            r11 = r6
            if (r7 == 0) goto L5a
        L44:
            long r4 = r7.longValue()
            java.lang.Long r0 = r6.priority
            if (r0 == 0) goto L5a
            long r2 = r0.longValue()
            java.lang.Long r1 = r6.priority
            if (r1 == 0) goto L5d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r7 = r1
        L59:
            r11 = r6
        L5a:
            int r8 = r8 + 1
            goto L1f
        L5d:
            r6 = r11
            goto L59
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722700SWm.LIZ():com.ss.android.ugc.aweme.comment.model.HolidayModel");
    }
}
