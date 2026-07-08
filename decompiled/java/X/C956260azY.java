package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0azY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956260azY {
    public final String LIZ;
    public final C957030b0n LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C956260azY)) {
            return false;
        }
        C956260azY c956260azY = (C956260azY) obj;
        return Intrinsics.LJFF(this.LIZ, c956260azY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c956260azY.LIZIZ);
    }

    public C956260azY(C957030b0n c957030b0n, String str) {
        this.LIZ = str;
        this.LIZIZ = c957030b0n;
    }
}
