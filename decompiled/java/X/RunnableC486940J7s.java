package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0J7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC486940J7s implements Runnable {
    public static final RunnableC486940J7s LL = new RunnableC486940J7s();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ConsumeManager@fa78.updateUserId$1");
        try {
            IAccountService iAccountService = C2252051DCp.LIZLLL;
            C2252051DCp.LJ = TextUtils.isEmpty(iAccountService.LJIIJ().getCurUserId()) ? CardStruct.IStatusCode.DEFAULT : iAccountService.LJIIJ().getCurUserId();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsumeManager@fa78.updateUserId$1");
    }
}
