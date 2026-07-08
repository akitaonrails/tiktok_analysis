package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C748802wA implements InterfaceC729102sz {
    public final List<AddonProductInfo> LIZ;

    public C748802wA() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C748802wA) && Intrinsics.LJFF(this.LIZ, ((C748802wA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsAddonOrderCompState(addonProductInfos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C748802wA(Object obj) {
        this.LIZ = C13BV.INSTANCE;
    }
}
