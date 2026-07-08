package X;

import com.ss.android.ugc.aweme.setting.model.BlackList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.01ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC448001ok implements Callable {
    public final /* synthetic */ C684310Qsn LL;
    public final /* synthetic */ int LLILLJJLI;

    public /* synthetic */ CallableC448001ok(C684310Qsn c684310Qsn, int i, int i2, int i3) {
        this.LL = c684310Qsn;
        this.LLILLJJLI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C684310Qsn c684310Qsn = this.LL;
        int i = this.LLILLJJLI;
        c684310Qsn.getClass();
        C1C7U.LIZ("BlackListModel@b712.fetchBlackList$1L");
        BlackList blackListLIZ = C313180CPk.LIZ(i, 10);
        C1C7U.LIZIZ("BlackListModel@b712.fetchBlackList$1L");
        return blackListLIZ;
    }
}
