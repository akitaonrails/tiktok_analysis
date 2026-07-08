package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ara, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192601Ara extends AbstractC2192621Arc {
    public final EnumC2008307tp LIZ;
    public final List<InterfaceC2197321AzC> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2192601Ara)) {
            return false;
        }
        C2192601Ara c2192601Ara = (C2192601Ara) obj;
        return this.LIZ == c2192601Ara.LIZ && Intrinsics.LJFF(this.LIZIZ, c2192601Ara.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TempBlocked(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tempInterceptors=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2192601Ara(EnumC2008307tp enumC2008307tp, List<? extends InterfaceC2197321AzC> list) {
        this.LIZ = enumC2008307tp;
        this.LIZIZ = list;
    }
}
