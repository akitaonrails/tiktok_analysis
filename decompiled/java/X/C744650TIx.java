package X;

import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;

/* JADX INFO: renamed from: X.0TIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744650TIx {
    public static EnumC744660TIy LIZ(NotInterestedTutorialData notInterestedTutorialData) {
        int i = notInterestedTutorialData.style;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return EnumC744660TIy.BOTTOM_SHEET;
        }
        return EnumC744660TIy.OVERLAY;
    }
}
