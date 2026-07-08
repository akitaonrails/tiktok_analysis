package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1761680vwc {
    public final int LIZ;
    public final C1761690vwd LIZIZ;

    public C1761680vwc() {
        this(3);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZ;
    }

    public /* synthetic */ C1761680vwc(int i) {
        this((i & 1) != 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761680vwc)) {
            return false;
        }
        C1761680vwc c1761680vwc = (C1761680vwc) obj;
        if (Intrinsics.LJFF(this.LIZIZ, c1761680vwc.LIZIZ) && this.LIZ == c1761680vwc.LIZ) {
            return true;
        }
        return false;
    }

    public C1761680vwc(boolean z, int i) {
        this.LIZ = i;
        this.LIZIZ = new C1761690vwd(z);
    }
}
