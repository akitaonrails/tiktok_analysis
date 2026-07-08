package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612220Nzo<S> {
    public final S LIZ;
    public final boolean LIZIZ;
    public final EnumC612210Nzn LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612220Nzo)) {
            return false;
        }
        C612220Nzo c612220Nzo = (C612220Nzo) obj;
        return Intrinsics.LJFF(this.LIZ, c612220Nzo.LIZ) && this.LIZIZ == c612220Nzo.LIZIZ && this.LIZJ == c612220Nzo.LIZJ;
    }

    public final int hashCode() {
        S s = this.LIZ;
        return ((((s == null ? 0 : s.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateChange(newState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasOptimistic=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C612220Nzo(S s, boolean z, EnumC612210Nzn enumC612210Nzn) {
        this.LIZ = s;
        this.LIZIZ = z;
        this.LIZJ = enumC612210Nzn;
    }
}
