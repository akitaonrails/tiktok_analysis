package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1171504i9 extends AbstractC1171404i8 {
    public final Bundle LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1171504i9) && Intrinsics.LJFF(this.LIZ, ((C1171504i9) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnSaveState(outState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1171504i9(Bundle bundle) {
        this.LIZ = bundle;
    }
}
