package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2457909k9 {
    public abstract long LIZ();

    public abstract int LIZJ();

    public abstract PendingIntent LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract long LJIIIIZZ();

    public abstract List LJIIIZ();

    public abstract List LJIIJ();

    public abstract List LJIIJJI();

    public final List<String> LIZLLL() {
        return LJIIIZ() != null ? new ArrayList(LJIIIZ()) : new ArrayList();
    }

    public final List<String> LJ() {
        return LJIIJ() != null ? new ArrayList(LJIIJ()) : new ArrayList();
    }

    public static C2458109kB LJIIL(Bundle bundle) {
        return new C2458109kB(bundle.getInt("session_id"), bundle.getInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public static C2458109kB LIZIZ(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new C2458109kB(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }
}
