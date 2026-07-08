package X;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892850Z0x {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prompt { text = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C892850Z0x(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(C892850Z0x.class, obj.getClass())) {
            return Intrinsics.LJFF(this.LIZ, ((C892850Z0x) obj).LIZ);
        }
        return false;
    }
}
