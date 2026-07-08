package X;

import android.os.StrictMode;
import java.io.Closeable;

/* JADX INFO: renamed from: X.09NE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NE implements Closeable {
    public final StrictMode.ThreadPolicy LL;
    public final StrictMode.VmPolicy LLILLJJLI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.LL;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.LLILLJJLI;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public C09NE(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.LL = threadPolicy;
        this.LLILLJJLI = vmPolicy;
    }
}
