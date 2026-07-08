package X;

import Y.ARunnableS18S1200000_13;
import Y.ARunnableS19S0201000_13;
import Y.ARunnableS82S0200000_13;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W56, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W56 extends C0W55 {
    public final Handler LLILLJJLI = new Handler(Looper.getMainLooper());
    public final /* synthetic */ C0W58 LLILLL;

    public C0W56(C0W58 c0w58) {
        this.LLILLL = c0w58;
    }

    @Override // X.InterfaceC2463809l6
    public final void LLJILJILJ(Bundle bundle) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS82S0200000_13(this, bundle, 8));
    }

    @Override // X.InterfaceC2463809l6
    public final void LLJZIJLIL(Bundle bundle, String str) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS18S1200000_13(bundle, this, str, 0));
    }

    @Override // X.InterfaceC2463809l6
    public final void LLLFZ(Bundle bundle, String str) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS18S1200000_13(bundle, this, str, 1));
    }

    @Override // X.InterfaceC2463809l6
    public final void LLLILZJ(int i, Bundle bundle) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS19S0201000_13(i, bundle, this, 0));
    }

    @Override // X.InterfaceC2463809l6
    public final Bundle u(Bundle bundle, String str) {
        C0W58 c0w58 = this.LLILLL;
        if (c0w58 == null) {
            return null;
        }
        return c0w58.LIZIZ(bundle, str);
    }

    @Override // X.InterfaceC2463809l6
    public final void LLLLLZL(final int i, final Uri uri, final boolean z, final Bundle bundle) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new Runnable() { // from class: X.0W57
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LLILZIL.LLILLL.LJFF(i, uri, z, bundle);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
