package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;

/* JADX INFO: renamed from: X.0LEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539710LEr {
    public static final String LIZ(ShortVideoContext shortVideoContext) {
        Integer numValueOf;
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            numValueOf = null;
        }
        int type = C0LG8.AIGC.getType();
        if (numValueOf != null && numValueOf.intValue() == type) {
            return "aigc_take_selfie";
        }
        int type2 = C0LG8.PHOTO_SEARCH.getType();
        if (numValueOf != null && numValueOf.intValue() == type2) {
            return "ecommerce_photo_search";
        }
        return "ecommerce_comment";
    }
}
