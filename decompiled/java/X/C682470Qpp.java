package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService;
import com.ss.android.ugc.aweme.search.df.api.choosemusic.SearchChooseMusicServiceDefaultImpl;

/* JADX INFO: renamed from: X.0Qpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682470Qpp {
    public static final C682470Qpp LIZ = new C682470Qpp();
    public static volatile ISearchChooseMusicService LIZIZ = LIZ(true);

    public static ISearchChooseMusicService LIZ(boolean z) {
        if (!C0BQ6.LIZ()) {
            return (ISearchChooseMusicService) ServiceManager.get().getService(ISearchChooseMusicService.class, false, false);
        }
        try {
            ISearchChooseMusicService iSearchChooseMusicService = (ISearchChooseMusicService) PluggableExtentionKt.pluggableSpi$default(ISearchChooseMusicService.class, false, false, false, 14, null);
            if (iSearchChooseMusicService != null) {
                if (C0BQ6.LIZ() && !C673090Qah.LIZIZ.checkPluginInstalled("choosemusic")) {
                    throw new NullPointerException("search aab not found");
                }
                return iSearchChooseMusicService;
            }
            throw new NullPointerException("not found");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                C673090Qah.LIZIZ.LIZ();
            }
            return new SearchChooseMusicServiceDefaultImpl();
        }
    }
}
