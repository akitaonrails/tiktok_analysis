package X;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302740k0O extends AbstractC1302730k0N {
    public final C1302260jzc LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return "AddCallResult(SuccessCallSessionLegacy)";
    }

    public C1302740k0O(C1302260jzc c1302260jzc) {
        this.LIZ = c1302260jzc;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1302740k0O) && Intrinsics.LJFF(this.LIZ, ((C1302740k0O) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
