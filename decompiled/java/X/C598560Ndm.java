package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ndm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598560Ndm {
    public final Function2<InterfaceC598890NeJ, InterfaceC1364105Vn<? super Unit>, Object> LIZ;
    public final C09AE LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C598560Ndm)) {
            return false;
        }
        C598560Ndm c598560Ndm = (C598560Ndm) obj;
        return Intrinsics.LJFF(this.LIZ, c598560Ndm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c598560Ndm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HandlerRegistration(handler=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", job=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C598560Ndm(Function2 function2, AnonymousClass0956 anonymousClass0956) {
        this.LIZ = function2;
        this.LIZIZ = anonymousClass0956;
    }
}
