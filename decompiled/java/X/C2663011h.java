package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.011h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2663011h {
    public static final /* synthetic */ int LIZ = 0;

    public static Boolean LIZ(String str) {
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3569038) {
                    if (iHashCode != 97196323 || !lowerCase.equals("false")) {
                        return null;
                    }
                } else if (!lowerCase.equals("true")) {
                    return null;
                }
            } else if (!lowerCase.equals("1")) {
                return null;
            }
            return Boolean.TRUE;
        }
        if (!lowerCase.equals(CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        return Boolean.FALSE;
    }
}
