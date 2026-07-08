package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0CPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC313210CPn<V> implements Callable {
    public final /* synthetic */ C143W LL;
    public final /* synthetic */ boolean LLILLJJLI;

    public CallableC313210CPn(C143W c143w, boolean z) {
        this.LL = c143w;
        this.LLILLJJLI = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("MusicFileDownloadTask@a2d.showDownloadFailToast$1");
        if (this.LL.LIZLLL) {
            int i = this.LLILLJJLI ? 2131830703 : 2131837756;
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                i = 2131837962;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(this.LL.LJII);
            c1233040iBy.LIZIZ(i);
            c1233040iBy.LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicFileDownloadTask@a2d.showDownloadFailToast$1");
        return unit;
    }
}
