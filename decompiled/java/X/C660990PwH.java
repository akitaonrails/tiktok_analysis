package X;

import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660990PwH implements InterfaceC111300bX {
    public final EnumSet<EnumC657070Ppx> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C660990PwH) && Intrinsics.LJFF(this.LL, ((C660990PwH) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(elements=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C660990PwH(EnumSet<EnumC657070Ppx> enumSet) {
        this.LL = enumSet;
    }
}
