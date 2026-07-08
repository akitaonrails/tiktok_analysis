package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0N0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586930N0h {
    public static String LIZ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if ((aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) || aweme.getMusic() == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getMusic().getId());
        sbLIZ.append("");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
