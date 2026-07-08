package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201790hNZ implements InterfaceC1891350zJl {
    public final LocationRegion LL;

    public C1201790hNZ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1201790hNZ) && Intrinsics.LJFF(this.LL, ((C1201790hNZ) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        LocationRegion locationRegion = this.LL;
        if (locationRegion == null) {
            return 0;
        }
        return locationRegion.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrentRegion(regionItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1201790hNZ(LocationRegion locationRegion) {
        this.LL = locationRegion;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
