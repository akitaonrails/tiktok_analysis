package X;

import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896507bn implements InterfaceC1896407bm {
    public final DialogFragment LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1896507bn) && Intrinsics.LJFF(this.LIZ, ((C1896507bn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogFragmentData(dialogFragment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896507bn(DialogFragment dialogFragment) {
        this.LIZ = dialogFragment;
    }
}
