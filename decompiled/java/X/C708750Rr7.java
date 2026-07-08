package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0Rr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708750Rr7 extends AbstractC1335900krs {
    public final WeakReference<InterfaceC691060R8u> LL;
    public final String LLILLJJLI;
    public final C0R5B LLILLL;

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        this.LL.clear();
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        System.currentTimeMillis();
        C15O7.LIZIZ(new Callable<Object>() { // from class: X.0Rr8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MobImageRequestControllerListener@4107.onStart$1");
                this.LL.LL.get();
                C1C7U.LIZIZ("MobImageRequestControllerListener@4107.onStart$1");
                return null;
            }
        }, C20684815ws.LJFF(), null);
    }

    public C708750Rr7(InterfaceC691060R8u interfaceC691060R8u, Aweme aweme, C0R5B c0r5b) {
        this.LL = new WeakReference<>(interfaceC691060R8u);
        this.LLILLJJLI = aweme.getAid();
        this.LLILLL = c0r5b;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        if (this.LL.get() != null) {
            this.LL.get().LIZ();
        }
        this.LL.get();
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1150504el.LIZ().LJI("feed_cover_total", false);
        if (this.LLILLL != null) {
            SystemClock.elapsedRealtime();
        }
        if (C305550ByL.LIZJ()) {
            C1440005kM.LIZ(new C737030Svd(102, this.LLILLJJLI));
        }
        if (this.LL.get() != null) {
            this.LL.get().LIZ();
        }
        this.LL.get();
    }
}
