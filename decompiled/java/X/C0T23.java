package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;

/* JADX INFO: renamed from: X.0T23, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T23 {
    public final C0RF0 LIZ;

    public C0T23(C0RF0 c0rf0) {
        this.LIZ = c0rf0;
    }

    public static String LIZIZ(Aweme aweme) {
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo == null) {
            return "";
        }
        int cardSource = cardInsertInfo.getCardSource();
        if (cardSource != 1) {
            if (cardSource != 2) {
                if (cardSource != 3) {
                    return "";
                }
                return cardInsertInfo.getDiffType();
            }
            return "fyp_server";
        }
        return String.valueOf(cardInsertInfo.getCardType());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0T23.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
