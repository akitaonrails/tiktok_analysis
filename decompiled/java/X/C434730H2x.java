package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434730H2x extends C0H30 {
    public final Image LIZ;
    public final int LIZIZ = 0;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434730H2x)) {
            return false;
        }
        C434730H2x c434730H2x = (C434730H2x) obj;
        return Intrinsics.LJFF(this.LIZ, c434730H2x.LIZ) && this.LIZIZ == c434730H2x.LIZIZ && this.LIZJ == c434730H2x.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strokeColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C434730H2x(Image image, int i) {
        this.LIZ = image;
        this.LIZJ = i;
    }
}
