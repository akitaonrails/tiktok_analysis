package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006T {
    public final ImageModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C006T) && Intrinsics.LJFF(this.LIZ, ((C006T) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerAvatarSlot(avatarThumb=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C006T(ImageModel imageModel) {
        this.LIZ = imageModel;
    }
}
