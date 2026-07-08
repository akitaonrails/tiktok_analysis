package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XG1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XG1 extends AbstractC845740XFs {
    public final C0XO2 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0XG1) && Intrinsics.LJFF(this.LIZ, ((C0XG1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoginSuccess(userInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XG1(C0XO3 c0xo3) {
        this.LIZ = c0xo3;
    }
}
