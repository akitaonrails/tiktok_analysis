package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1208204o4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(156));

    public static String LIZ(Word word) {
        if (((Number) LIZ.getValue()).intValue() == 1) {
            return word.getRealId();
        }
        return word.getId();
    }
}
