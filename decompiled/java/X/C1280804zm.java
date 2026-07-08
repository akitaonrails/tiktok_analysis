package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280804zm {
    public final boolean LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1280804zm)) {
            return false;
        }
        C1280804zm c1280804zm = (C1280804zm) obj;
        return this.LIZ == c1280804zm.LIZ && Intrinsics.LJFF(this.LIZIZ, c1280804zm.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.LIZIZ;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "AdmissionResult(interceptApi=" + this.LIZ + ", hitSample=" + this.LIZIZ + ")";
    }

    public C1280804zm(boolean z, Boolean bool) {
        this.LIZ = z;
        this.LIZIZ = bool;
    }
}
