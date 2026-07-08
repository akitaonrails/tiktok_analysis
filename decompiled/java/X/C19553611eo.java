package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19553611eo {
    public final Pair<Integer, Integer> LIZ;
    public final EnumC19554111et LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19553611eo)) {
            return false;
        }
        C19553611eo c19553611eo = (C19553611eo) obj;
        return Intrinsics.LJFF(this.LIZ, c19553611eo.LIZ) && this.LIZIZ == c19553611eo.LIZIZ && this.LIZJ == c19553611eo.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundEffectItem(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19553611eo(Pair<Integer, Integer> pair, EnumC19554111et enumC19554111et, int i) {
        this.LIZ = pair;
        this.LIZIZ = enumC19554111et;
        this.LIZJ = i;
    }
}
