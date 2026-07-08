package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764100w0W extends AbstractC1764660w1Q {
    public final Image LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1764100w0W)) {
            return false;
        }
        C1764100w0W c1764100w0W = (C1764100w0W) obj;
        return Intrinsics.LJFF(this.LIZ, c1764100w0W.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1764100w0W.LIZIZ);
    }

    public final int hashCode() {
        Image image = this.LIZ;
        return ((image == null ? 0 : image.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageModel(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1764660w1Q
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C1764100w0W(Image image, String str) {
        this.LIZ = image;
        this.LIZIZ = str;
    }
}
