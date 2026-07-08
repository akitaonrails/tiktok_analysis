package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: renamed from: X.00UL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UL implements InterfaceC951240arS<Object> {
    public final List<PlayImage> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00UL) && Intrinsics.LJFF(this.LIZ, ((C00UL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayImageList(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00UL(List<PlayImage> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C00UL;
    }
}
