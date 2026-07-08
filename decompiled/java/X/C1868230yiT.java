package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868230yiT implements InterfaceC951240arS<Object> {
    public final Function0<Integer> LIZ;

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868230yiT) && Intrinsics.LJFF(this.LIZ, ((C1868230yiT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorModifyStepsItem(steps=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868230yiT(AwS575S0100000_31 awS575S0100000_31) {
        this.LIZ = awS575S0100000_31;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868230yiT;
    }
}
