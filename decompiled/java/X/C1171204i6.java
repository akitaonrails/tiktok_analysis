package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1171204i6 extends AbstractC1171404i8 {
    public final Bundle LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1171204i6) && Intrinsics.LJFF(this.LIZ, ((C1171204i6) obj).LIZ);
    }

    public final int hashCode() {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnCreate(savedInstanceState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1171204i6(Bundle bundle) {
        this.LIZ = bundle;
    }
}
