package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981160bdi {
    public final String LIZ;
    public final ImageModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C981160bdi)) {
            return false;
        }
        C981160bdi c981160bdi = (C981160bdi) obj;
        return Intrinsics.LJFF(this.LIZ, c981160bdi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c981160bdi.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        ImageModel imageModel = this.LIZIZ;
        return iHashCode + (imageModel == null ? 0 : imageModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftOnlyContent(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", giftIconImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C981160bdi(String str, ImageModel imageModel) {
        this.LIZ = str;
        this.LIZIZ = imageModel;
    }
}
