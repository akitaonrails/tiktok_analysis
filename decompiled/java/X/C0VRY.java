package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase;

/* JADX INFO: renamed from: X.0VRY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRY {
    public static AwemeRecordDatabase LIZ(Context context) {
        if (AwemeRecordDatabase.LL == null) {
            synchronized (C13LE.LIZ(AwemeRecordDatabase.class)) {
                try {
                    if (AwemeRecordDatabase.LL == null) {
                        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), AwemeRecordDatabase.class, "aweme_record");
                        c796500VMiLIZ.LIZJ();
                        c796500VMiLIZ.LIZ(AwemeRecordDatabase.LLILLJJLI, AwemeRecordDatabase.LLILLL, AwemeRecordDatabase.LLILZ, AwemeRecordDatabase.LLILZIL);
                        AwemeRecordDatabase.LL = (AwemeRecordDatabase) c796500VMiLIZ.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return AwemeRecordDatabase.LL;
    }
}
