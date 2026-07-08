package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003G {
    public final Unit LIZ;

    public C003G() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C003G) && Intrinsics.LJFF(this.LIZ, ((C003G) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealSocialProofSceneActions(placeholder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C003G(int i) {
        this.LIZ = Unit.LIZ;
    }
}
