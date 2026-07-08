package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898510ZMr {
    public final C898520ZMs LIZ;
    public final C898520ZMs LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898510ZMr)) {
            return false;
        }
        C898510ZMr c898510ZMr = (C898510ZMr) obj;
        return Intrinsics.LJFF(this.LIZ, c898510ZMr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c898510ZMr.LIZIZ);
    }

    public C898510ZMr(C898520ZMs c898520ZMs, C898520ZMs c898520ZMs2) {
        this.LIZ = c898520ZMs;
        this.LIZIZ = c898520ZMs2;
    }
}
