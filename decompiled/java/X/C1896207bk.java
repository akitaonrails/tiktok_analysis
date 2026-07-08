package X;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896207bk implements InterfaceC1896407bm {
    public final Activity LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1896207bk) && Intrinsics.LJFF(this.LIZ, ((C1896207bk) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransparentActivityData(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896207bk(Activity activity) {
        this.LIZ = activity;
    }
}
