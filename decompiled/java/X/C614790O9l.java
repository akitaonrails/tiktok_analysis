package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0O9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614790O9l {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, String str) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" : aid=  ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", isad= ");
        sbLIZ.append(AwemeExtKt.isAdTraffic(aweme));
        sbLIZ.append(", desc= ");
        sbLIZ.append(aweme.getDesc());
        sbLIZ.append(", awemeRawAd= ");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("{ adid = ");
            sbLIZ2.append(awemeRawAd.getAdId());
            sbLIZ2.append(", cid = ");
            sbLIZ2.append(awemeRawAd.getCreativeId());
            sbLIZ2.append(", title = ");
            sbLIZ2.append(awemeRawAd.getTitle());
            sbLIZ2.append(", buttonText = ");
            sbLIZ2.append(awemeRawAd.getButtonText());
            sbLIZ2.append(" }");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", shareUrl = ");
        sbLIZ.append(aweme.getShareUrl());
        C2344809Gs.LIZLLL(3, "MaskDebugLog", C2188811AlT.LIZIZ(sbLIZ));
    }
}
