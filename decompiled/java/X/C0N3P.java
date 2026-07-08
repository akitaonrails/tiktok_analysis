package X;

import Y.ARunnableS109S0100000_9;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0N3P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3P implements InterfaceC1272840jEA {
    public Handler LLILLJJLI;
    public final String LL = "RecorderLooper";
    public final Map<Runnable, C0N3O> LLILLL = new LinkedHashMap();

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        Handler handler = this.LLILLJJLI;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS109S0100000_9(this, 189));
        }
    }
}
