package X;

import com.bytedance.ttminisnative.PackageDecoderKt;
import java.io.Closeable;

/* JADX INFO: renamed from: X.0jmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293950jmD implements Closeable {
    public long LL = PackageDecoderKt.CreateHandle("TTMG_NATIVE");

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.LL;
        if (j != 0) {
            PackageDecoderKt.DestroyHandle(j);
            this.LL = 0L;
        }
    }
}
