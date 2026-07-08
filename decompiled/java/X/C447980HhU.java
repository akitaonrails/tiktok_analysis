package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447980HhU implements InterfaceC447930HhP {
    public final C448010HhX LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C447980HhU) && Intrinsics.LJFF(this.LIZ, ((C447980HhU) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendationAvailable(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447980HhU(C448010HhX c448010HhX) {
        this.LIZ = c448010HhX;
    }
}
