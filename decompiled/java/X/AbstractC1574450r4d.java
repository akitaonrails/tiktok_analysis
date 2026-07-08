package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1574450r4d {
    public final String LIZ() {
        if (Intrinsics.LJFF(this, C1574380r4W.LIZ)) {
            return "last_watch";
        }
        if (Intrinsics.LJFF(this, C1574440r4c.LIZ)) {
            return "from_begin";
        }
        if (!(this instanceof C1574370r4V)) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_");
        sbLIZ.append(((C1574370r4V) this).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
