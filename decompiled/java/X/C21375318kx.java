package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21375318kx extends AbstractC1784370wXD {
    public final EnumC21376018l4 LIZ;
    public final Icon LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21375318kx)) {
            return false;
        }
        C21375318kx c21375318kx = (C21375318kx) obj;
        return this.LIZ == c21375318kx.LIZ && Intrinsics.LJFF(this.LIZIZ, c21375318kx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagTileImageData(labelSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tileImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21375318kx(EnumC21376018l4 enumC21376018l4, Icon icon) {
        this.LIZ = enumC21376018l4;
        this.LIZIZ = icon;
    }
}
