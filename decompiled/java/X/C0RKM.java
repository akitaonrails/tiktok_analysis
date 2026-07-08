package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0RKM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKM {
    public static boolean LIZ(Context context, Aweme aweme, String str) {
        boolean zLJIIZILJ = C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme));
        if (!(context instanceof C19EG)) {
            return false;
        }
        if ((C300940Bqu.LIZ() || C299470BoX.LIZ()) && !zLJIIZILJ) {
            return false;
        }
        return C1618440sDa.LIZIZ.LJJIIJ().LIZJ(aweme, str);
    }
}
