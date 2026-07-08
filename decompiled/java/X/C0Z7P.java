package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.vibefeed.database.SharedFeedDatabase;

/* JADX INFO: renamed from: X.0Z7P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7P {
    public static final /* synthetic */ C0Z7P LIZ = new C0Z7P();

    public static C0Z7U LIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        SharedFeedDatabase sharedFeedDatabaseLIZ = SharedFeedDatabase.LL;
        if (sharedFeedDatabaseLIZ == null) {
            synchronized (SharedFeedDatabase.LLILLJJLI) {
                try {
                    sharedFeedDatabaseLIZ = SharedFeedDatabase.LL;
                    if (sharedFeedDatabaseLIZ == null) {
                        sharedFeedDatabaseLIZ = C611090Nxz.LIZ(contextLIZ);
                        SharedFeedDatabase.LL = sharedFeedDatabaseLIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sharedFeedDatabaseLIZ.LIZ();
    }
}
