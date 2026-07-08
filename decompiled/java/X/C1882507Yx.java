package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882507Yx extends AbstractC1882307Yv {
    public final EnumC942650adb LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1882507Yx)) {
            return false;
        }
        C1882507Yx c1882507Yx = (C1882507Yx) obj;
        return this.LIZ == c1882507Yx.LIZ && Intrinsics.LJFF(this.LIZIZ, c1882507Yx.LIZIZ) && this.LIZJ == c1882507Yx.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamePlayContent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", abilityName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasStartedPlay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882507Yx(EnumC942650adb enumC942650adb, String str, boolean z) {
        this.LIZ = enumC942650adb;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
