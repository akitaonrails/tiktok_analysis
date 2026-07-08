package X;

import java.lang.Enum;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912900Zrc<E extends Enum<E>> implements C18YK {
    public final List<C1562980qm8<E>> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C912900Zrc) && Intrinsics.LJFF(this.LIZ, ((C912900Zrc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultLongPressViewProtocolState(actionList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18YK
    public final boolean LJJII() {
        return !this.LIZ.isEmpty();
    }

    public C912900Zrc(List<C1562980qm8<E>> list) {
        this.LIZ = list;
    }
}
