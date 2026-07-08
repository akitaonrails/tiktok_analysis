package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGZ {
    public static int LIZIZ;
    public static C667620QGq LIZ = new C667620QGq();
    public static final List<Integer> LIZJ = new ArrayList();

    public static boolean LIZ(Fragment fragment) {
        int iHashCode;
        if (!C1823207Cc.LIZ()) {
            return false;
        }
        while (true) {
            if (fragment != null) {
                if (fragment instanceof SearchResultFragmentNew) {
                    iHashCode = fragment.hashCode();
                    break;
                }
                fragment = fragment.getParentFragment();
            } else {
                iHashCode = 0;
                break;
            }
        }
        if (iHashCode != LIZIZ) {
            return false;
        }
        C667620QGq c667620QGq = LIZ;
        if (c667620QGq.LIZ || c667620QGq.LIZIZ <= 0) {
            return false;
        }
        return true;
    }
}
