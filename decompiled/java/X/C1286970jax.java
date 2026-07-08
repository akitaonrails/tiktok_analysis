package X;

import Y.ARunnableS25S1100000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286970jax {
    public final WeakReference<WebView> LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public InterfaceC1286980jay LIZLLL;
    public boolean LJI;
    public volatile AtomicInteger LJ = new AtomicInteger(0);
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final String LJII = "var infinite = 1";
    public boolean LJIIIIZZ = true;

    public final void LIZ(AtomicInteger atomicInteger) {
        WebView webView;
        if (!this.LJIIIIZZ || (webView = this.LIZ.get()) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS89S0200000_20(this, atomicInteger, 21));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("infinite = ");
        sbLIZ.append(atomicInteger.get() + 1);
        webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0jaw
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C1286970jax c1286970jax = this.LIZ;
                C786410Ut5.LJJZZIII(c1286970jax.LJFF, new ARunnableS25S1100000_20(c1286970jax, (String) obj, 7));
            }
        });
        C786410Ut5.LJLIIL(this.LIZIZ, this.LJFF, new ARunnableS89S0200000_20(this, atomicInteger, 22));
    }

    public C1286970jax(WeakReference weakReference, long j, int i, C1521340pgy c1521340pgy) {
        this.LIZ = weakReference;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = c1521340pgy;
    }
}
