package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280904zn {
    public final List<InterfaceC546470Lbx<Object>> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1280904zn) && Intrinsics.LJFF(this.LIZ, ((C1280904zn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftRouteConfig(handlers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1280904zn() {
        this(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1280904zn(List<? extends InterfaceC546470Lbx<Object>> list) {
        this.LIZ = list;
    }
}
