package X;

import android.nfc.tech.IsoDep;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722580uvY implements Closeable {
    public final IsoDep LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object c098200Yq;
        try {
            if (this.LL.isConnected()) {
                try {
                    this.LL.close();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public C1722580uvY(IsoDep isoDep) {
        this.LL = isoDep;
    }
}
