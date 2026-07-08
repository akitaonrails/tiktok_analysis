package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0Ozp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC637710Ozp<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL = 20;
    public final /* synthetic */ String LLILZ;

    public CallableC637710Ozp(String str, long j, String str2) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILZ = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        C1C7U.LIZ("DuetAwemeModel@4471.fetchList$1");
        C637770Ozv c637770Ozv = C637770Ozv.LIZ;
        String str = this.LL;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        String str2 = this.LLILZ;
        c637770Ozv.getClass();
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        DuetAwemeList duetAwemeList = ((InterfaceC637720Ozq) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC637720Ozq.class) : null)).LIZ(str, j, j2, str2, 37).get();
        C1C7U.LIZIZ("DuetAwemeModel@4471.fetchList$1");
        return duetAwemeList;
    }
}
