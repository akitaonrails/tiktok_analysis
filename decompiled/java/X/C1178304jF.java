package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1178304jF {
    public final List<AbstractC191840103i> LIZ;

    public C1178304jF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1178304jF) && Intrinsics.LJFF(this.LIZ, ((C1178304jF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyRadioGroupState(viewItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1178304jF(int i) {
        this(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1178304jF(List<? extends AbstractC191840103i> list) {
        this.LIZ = list;
    }
}
