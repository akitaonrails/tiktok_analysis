package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HKV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKV implements C0HOM {
    public final Float LIZIZ;
    public final Long LIZJ;

    @Override // X.C0HOM
    public final C0HOM<? extends List> LIZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HKV)) {
            return false;
        }
        C0HKV c0hkv = (C0HKV) obj;
        return Intrinsics.LJFF(this.LIZIZ, c0hkv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hkv.LIZJ);
    }

    public final int hashCode() {
        Float f = this.LIZIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Long l = this.LIZJ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InProgress(percentage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeRemaining=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HKV(Float f, Long l) {
        this.LIZIZ = f;
        this.LIZJ = l;
    }
}
