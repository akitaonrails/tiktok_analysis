package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ptp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659470Ptp {
    public static C659830PuP LIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        String str;
        int iK;
        boolean z3 = false;
        int i = 1;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && photoModeImageInfo.getSearchOutflowDisplayImage() != null) {
            z2 = true;
            if (1 != 0 && (iK = C1ER1.LIZIZ.k(aweme)) != -1) {
                z3 = true;
                if (iK != -1) {
                    i = iK + 1;
                    if (iK != -1 && iK != 0) {
                        str = "from_article";
                    }
                }
            }
            return new C659830PuP(i, str, z2, z3);
        }
        z2 = false;
        str = "original_cover";
        return new C659830PuP(i, str, z2, z3);
    }

    public static Map LIZIZ(Aweme aweme) {
        Object obj;
        C659830PuP c659830PuPLIZ = LIZ(aweme);
        if (c659830PuPLIZ == null) {
            return C2097608Jq.LJ();
        }
        C13DA c13da = new C13DA();
        String str = "1";
        if (c659830PuPLIZ.LIZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_photo_cover_change", obj);
        if (c659830PuPLIZ.LIZ) {
            if (!c659830PuPLIZ.LIZIZ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("photo_cover_changed_success", str);
            c13da.put("article_cover_pic", String.valueOf(c659830PuPLIZ.LIZJ));
            c13da.put("photo_cover_changed_type", c659830PuPLIZ.LIZLLL);
        }
        return c13da.build();
    }
}
