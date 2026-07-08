package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8X extends C0M8P {
    public final C563580M8m LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0M8X) && Intrinsics.LJFF(this.LIZIZ, ((C0M8X) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaBucketClicked(mediaBucket=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M8X(C563580M8m c563580M8m) {
        super(false);
        this.LIZIZ = c563580M8m;
    }
}
