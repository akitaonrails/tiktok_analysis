package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889560zGs {
    public final List<InterfaceC1891350zJl> LIZ;
    public final EnumC1889520zGo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889560zGs)) {
            return false;
        }
        C1889560zGs c1889560zGs = (C1889560zGs) obj;
        return Intrinsics.LJFF(this.LIZ, c1889560zGs.LIZ) && this.LIZIZ == c1889560zGs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WidgetDataSnapshot(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1889560zGs(List<? extends InterfaceC1891350zJl> list, EnumC1889520zGo enumC1889520zGo) {
        this.LIZ = list;
        this.LIZIZ = enumC1889520zGo;
    }
}
