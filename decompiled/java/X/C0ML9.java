package X;

import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ML9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ML9 {
    public static final String LJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        int celebrationType;
        boolean z;
        String strLIZ;
        Integer celebrationType2;
        CelebrationData celebrationData = creativeModel.celebrationData;
        if (celebrationData != null && (celebrationType2 = celebrationData.getCelebrationType()) != null) {
            celebrationType = celebrationType2.intValue();
        } else {
            celebrationType = creativeModel.onThisDayData.getCelebrationType();
        }
        Integer numValueOf = Integer.valueOf(celebrationType);
        String entranceType = null;
        if (numValueOf != null && (strLIZ = C0MLA.LIZ(numValueOf)) != null) {
            c0lab.LJ("story_theme", strLIZ);
        }
        if (celebrationType == 2) {
            z = true;
        } else {
            z = false;
        }
        c0lab.LJ("is_eoy", LJ(z));
        CelebrationData celebrationData2 = creativeModel.celebrationData;
        if (celebrationData2 != null) {
            entranceType = celebrationData2.getEntranceType();
        }
        c0lab.LJ("eoy_entrance_type", entranceType);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r5, X.C0LAB r6) {
        /*
            r2 = 0
            if (r5 == 0) goto L83
            com.ss.android.ugc.aweme.creative.model.CelebrationData r0 = r5.celebrationData
            if (r0 == 0) goto L7c
            java.lang.Integer r0 = r0.getCelebrationType()
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
        L11:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto L83
            java.lang.String r1 = X.C0MLA.LIZ(r4)
            r3 = 1
            if (r1 == 0) goto L56
            java.lang.String r0 = "story_theme"
            r6.LJ(r0, r1)
            if (r5 == 0) goto L7a
            com.ss.android.ugc.aweme.creative.model.CelebrationData r0 = r5.celebrationData
            if (r0 == 0) goto L7a
            boolean r0 = r0.getHasPoster()
            if (r0 != r3) goto L7a
            r0 = 1
        L30:
            java.lang.String r1 = LJ(r0)
            java.lang.String r0 = "has_poster"
            r6.LJ(r0, r1)
            if (r5 == 0) goto L78
            com.ss.android.ugc.aweme.creative.model.CelebrationData r0 = r5.celebrationData
            if (r0 == 0) goto L78
            boolean r0 = r0.getOutPush()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L56
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "out_push"
            r6.LJ(r1, r0)
        L56:
            if (r4 == 0) goto L83
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L83
        L5f:
            java.lang.String r1 = LJ(r3)
            java.lang.String r0 = "is_eoy"
            r6.LJ(r0, r1)
            if (r5 == 0) goto L72
            com.ss.android.ugc.aweme.creative.model.CelebrationData r0 = r5.celebrationData
            if (r0 == 0) goto L72
            java.lang.String r2 = r0.getEntranceType()
        L72:
            java.lang.String r0 = "eoy_entrance_type"
            r6.LJ(r0, r2)
            return
        L78:
            r1 = r2
            goto L47
        L7a:
            r0 = 0
            goto L30
        L7c:
            com.ss.android.ugc.aweme.creative.model.OnThisDayData r0 = r5.onThisDayData
            int r0 = r0.getCelebrationType()
            goto L11
        L83:
            r3 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ML9.LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0LAB):void");
    }

    public static final void LIZLLL(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return;
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "on_this_day") || Intrinsics.LJFF(shortVideoContext.shootWay, "end_of_year")) {
            c0lab.LJ("previous_page", shortVideoContext.enterFrom);
        }
    }

    public static final void LIZJ(C0LAB c0lab, int i, boolean z, String str) {
        String strLIZ;
        String str2;
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null && (strLIZ = C0MLA.LIZ(numValueOf)) != null) {
            c0lab.LJ("story_theme", strLIZ);
            if (z) {
                str2 = "2";
            } else {
                str2 = "1";
            }
            c0lab.LJ("cover_type", str2);
            c0lab.LJ("enter_method", str);
        }
    }
}
