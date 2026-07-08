package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ndk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598540Ndk<T> {
    public final C05XL<C1515820pY4<T>> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C598540Ndk)) {
            return false;
        }
        C598540Ndk c598540Ndk = (C598540Ndk) obj;
        return Intrinsics.LJFF(this.LIZ, c598540Ndk.LIZ) && this.LIZIZ == c598540Ndk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PutDeferredResult(deferred=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNew=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C598540Ndk(C05XL<C1515820pY4<T>> c05xl, boolean z) {
        this.LIZ = c05xl;
        this.LIZIZ = z;
    }
}
