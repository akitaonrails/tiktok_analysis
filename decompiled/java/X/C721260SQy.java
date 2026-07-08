package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;

/* JADX INFO: renamed from: X.0SQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721260SQy {
    public static final C721260SQy LIZ = new C721260SQy();

    public static void LIZ(Aweme aweme, PostModeDetailParams postModeDetailParams) {
        String str;
        String str2;
        int awemeType;
        String aid;
        C735750StZ c735750StZ = new C735750StZ();
        c735750StZ.LJIILLIIL = aweme;
        c735750StZ.LJIIZILJ = "graphic_detail";
        if (postModeDetailParams != null) {
            str = postModeDetailParams.exploreFromGroupId;
        } else {
            str = null;
        }
        c735750StZ.LJIJI = str;
        String str3 = "";
        if (postModeDetailParams == null || (str2 = postModeDetailParams.eventType) == null) {
            str2 = "";
        }
        c735750StZ.LIZLLL = str2;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c735750StZ.LJFF("group_id", str3, InterfaceC1210900hcG.LIZ);
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = -1;
        }
        c735750StZ.LIZLLL(awemeType, "aweme_type");
        c735750StZ.LIZLLL(C735370Ssx.LIZ(aweme), "has_title");
        c735750StZ.LIZLLL(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c735750StZ.LJIILJJIL();
    }
}
