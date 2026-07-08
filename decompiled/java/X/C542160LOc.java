package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import java.util.Locale;

/* JADX INFO: renamed from: X.0LOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542160LOc {
    public static AIGC.RecallWay.Custom LIZ(String str) {
        String lowerCase;
        if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        return new AIGC.RecallWay.Custom(lowerCase);
    }
}
