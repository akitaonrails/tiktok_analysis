package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614530s7H extends AbstractC1614570s7L {
    public final EnumC1614520s7G LIZ;
    public final int LIZIZ;
    public final List<Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614530s7H)) {
            return false;
        }
        C1614530s7H c1614530s7H = (C1614530s7H) obj;
        return this.LIZ == c1614530s7H.LIZ && this.LIZIZ == c1614530s7H.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1614530s7H.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithStringRes(sourceScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageArgs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1614570s7L
    public final EnumC1614520s7G LIZ() {
        return this.LIZ;
    }

    public C1614530s7H(EnumC1614520s7G enumC1614520s7G, int i) {
        this(enumC1614520s7G, i, C13BV.INSTANCE);
    }

    public C1614530s7H(EnumC1614520s7G enumC1614520s7G, int i, List<? extends Object> list) {
        this.LIZ = enumC1614520s7G;
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}
