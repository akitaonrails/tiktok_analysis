package X;

import android.content.Context;
import com.ss.android.ugc.aweme.vibefeed.database.SharedFeedDatabase;

/* JADX INFO: renamed from: X.0Nxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611090Nxz {
    public static SharedFeedDatabase LIZ(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("db_shared_feed_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(contextN3, SharedFeedDatabase.class, C2188811AlT.LIZIZ(sbLIZ));
        c796500VMiLIZ.LJIIIIZZ = EnumC611420NyW.TRUNCATE;
        c796500VMiLIZ.LIZJ();
        return (SharedFeedDatabase) c796500VMiLIZ.LIZIZ();
    }
}
