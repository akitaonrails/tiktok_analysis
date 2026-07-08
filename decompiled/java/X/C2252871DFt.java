package X;

import com.bytedance.compression.zstd.Zstd;

/* JADX INFO: renamed from: X.1DFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252871DFt extends RuntimeException {
    public final long LL;

    public long getErrorCode() {
        return this.LL;
    }

    public C2252871DFt(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public C2252871DFt(long j, String str) {
        super(str);
        this.LL = j;
    }
}
