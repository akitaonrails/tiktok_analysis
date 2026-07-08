package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HOB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOB {
    public final Function1<InterfaceC440090HNn, Boolean> LIZ;
    public final InterfaceC440050HNj LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HOB)) {
            return false;
        }
        C0HOB c0hob = (C0HOB) obj;
        return Intrinsics.LJFF(this.LIZ, c0hob.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hob.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupportedElementInformation(elementChecker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultElement=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HOB(Function1 function1, C440030HNh c440030HNh) {
        this.LIZ = function1;
        this.LIZIZ = c440030HNh;
    }
}
