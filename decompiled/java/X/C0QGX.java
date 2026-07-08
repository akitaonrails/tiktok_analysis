package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGX implements InterfaceC663910Q2j {
    public final Map<?, ?> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QGX) && Intrinsics.LJFF(this.LIZ, ((C0QGX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestWordUpdateAction(suggestWords=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QGX(Map<?, ?> map) {
        this.LIZ = map;
    }
}
