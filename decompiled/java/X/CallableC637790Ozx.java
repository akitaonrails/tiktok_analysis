package X;

import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0Ozx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC637790Ozx<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C637780Ozw LLILLL;
    public final /* synthetic */ int LLILZ;

    public CallableC637790Ozx(String str, long j, C637780Ozw c637780Ozw, int i) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c637780Ozw;
        this.LLILZ = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        C1C7U.LIZ("MovieAwemeModel@eaa7.fetchList$1");
        String str = C0P00.LIZ;
        String str2 = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL.LL == 20 ? 1 : 2;
        int i2 = this.LLILZ;
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0P00.LIZ);
        MvDetailListModel mvDetailListModel = ((InterfaceC637800Ozy) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC637800Ozy.class) : null)).LIZIZ(str2, j, i, i2).get();
        C1C7U.LIZIZ("MovieAwemeModel@eaa7.fetchList$1");
        return mvDetailListModel;
    }
}
