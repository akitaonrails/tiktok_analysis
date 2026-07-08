package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12835050n {
    public final InterfaceC12836050o LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12835050n)) {
            return false;
        }
        C12835050n c12835050n = (C12835050n) obj;
        return Intrinsics.LJFF(this.LIZ, c12835050n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12835050n.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecutionScope(checker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12835050n(InterfaceC12836050o interfaceC12836050o, String str) {
        this.LIZ = interfaceC12836050o;
        this.LIZIZ = str;
    }

    public final void LIZ(String str, Map<String, ? extends Object> map) {
        this.LIZ.LIZ(this.LIZIZ, str, map);
    }
}
