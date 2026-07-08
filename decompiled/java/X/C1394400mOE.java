package X;

import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;

/* JADX INFO: renamed from: X.0mOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394400mOE {
    public static final C1394400mOE LIZ = new C1394400mOE();

    public static void LIZIZ(Aweme aweme, String str, MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            iRecordMobService.LIZLLL(new C1449410nox(str, "mdp_square", "music_detail", aid, null, null, null, null, 240), LIZ(aweme, null, null, mDPRecommendTemplateInfo));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[PHI: r5
      0x004f: PHI (r5v7 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) = 
      (r5v3 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
      (r5v10 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
     binds: [B:19:0x004d, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, java.lang.String r8, com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394400mOE.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo):java.util.Map");
    }
}
