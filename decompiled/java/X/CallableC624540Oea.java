package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0Oea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC624540Oea implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        C1C7U.LIZ("FollowRequestApiManager@2cc9.approveFollowRequest$1");
        try {
            ApproveResponse approveResponse = C624530OeZ.LIZ.LIZ(this.LL, this.LLILLJJLI).get();
            C1C7U.LIZIZ("FollowRequestApiManager@2cc9.approveFollowRequest$1");
            return approveResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public CallableC624540Oea(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
