package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0Q42, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q42 implements Runnable {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    public C0Q42(Context context, String str, long j, String str2) {
        this.LL = context;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    public final void LIZ() {
        Context context;
        C19EG c19egLIZIZ;
        Object objLIZIZ;
        Context context2 = this.LL;
        Fragment fragment = (context2 == null || (c19egLIZIZ = C1388190mED.LIZIZ(context2)) == null || (objLIZIZ = C651580Ph6.LIZIZ(c19egLIZIZ)) == null) ? null : (Fragment) objLIZIZ;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context3 = this.LL;
        Activity activityLIZ = context3 != null ? C1388190mED.LIZ(context3) : null;
        sAFHelper.getClass();
        C667750QHd c667750QHd = (!SAFHelper.LJJJJL(activityLIZ, fragment) || (context = this.LL) == null) ? new C667750QHd() : new C667750QHd(context, fragment);
        c667750QHd.LIZ(new C0Q43(this.LLILLJJLI, this.LLILLL, this.LLILZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchSignalHelper$Companion@c527.handlePlayFinishEventForRecoLogicUpdate$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchSignalHelper$Companion@c527.handlePlayFinishEventForRecoLogicUpdate$1");
    }
}
