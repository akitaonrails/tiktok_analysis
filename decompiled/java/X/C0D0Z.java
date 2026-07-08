package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0Z implements InterfaceC332200D0o {
    public final List<AbstractC331870Czh> LL;

    public final C0D0Z copy(List<? extends AbstractC331870Czh> list) {
        return new C0D0Z(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D0Z) && Intrinsics.LJFF(this.LL, ((C0D0Z) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(slots=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AbstractC331870Czh> getSlots() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0D0Z(List<? extends AbstractC331870Czh> list) {
        this.LL = list;
    }
}
