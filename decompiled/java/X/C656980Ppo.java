package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ppo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656980Ppo extends AbstractC656960Ppm {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C656980Ppo)) {
            return false;
        }
        C656980Ppo c656980Ppo = (C656980Ppo) obj;
        return Intrinsics.LJFF(this.LIZ, c656980Ppo.LIZ) && this.LIZIZ == c656980Ppo.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Desc(test=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalLine=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C656980Ppo(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
