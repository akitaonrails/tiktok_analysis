package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007E {
    public final long LIZ = 7934;
    public final ImageModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C007E)) {
            return false;
        }
        C007E c007e = (C007E) obj;
        return this.LIZ == c007e.LIZ && Intrinsics.LJFF(this.LIZIZ, c007e.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftIconInfoEntity(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C007E(ImageModel imageModel) {
        this.LIZIZ = imageModel;
    }
}
