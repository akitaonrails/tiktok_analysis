package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0XHI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XHI<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI = false;
    public final /* synthetic */ boolean LLILLL;

    public C0XHI(String str, boolean z) {
        this.LL = str;
        this.LLILLL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("UserApiPresenter@8386.queryUser$1");
        String str = C0XHH.LIZ;
        User userLIZ = C0XHH.LIZ(this.LL, this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("UserApiPresenter@8386.queryUser$1");
        return userLIZ;
    }
}
