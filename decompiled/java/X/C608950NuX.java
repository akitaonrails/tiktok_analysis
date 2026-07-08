package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.model.Liked;
import com.ss.android.ugc.aweme.model.NotClickCount;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0NuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608950NuX {
    public static boolean LIZ() {
        String str = (String) ((LinkedHashMap) QuickExternalShareVM.LLIZLLLIL).get(1);
        boolean z = false;
        if (str == null) {
            return false;
        }
        try {
            z = ((Liked) C08JS.LIZIZ().LJII(str, Liked.class)).liked;
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return z;
        }
    }

    public static int LIZIZ() {
        String str = (String) ((LinkedHashMap) QuickExternalShareVM.LLIZ).get(6);
        if (str == null) {
            return 0;
        }
        try {
            return ((NotClickCount) C08JS.LIZIZ().LJII(str, NotClickCount.class)).noClickCount;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }
}
