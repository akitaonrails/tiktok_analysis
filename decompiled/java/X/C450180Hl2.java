package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450180Hl2 extends AbstractC450200Hl4 {
    public final StickerItem LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C450180Hl2) && Intrinsics.LJFF(this.LIZ, ((C450180Hl2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Add(sticker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C450180Hl2(StickerItem stickerItem) {
        this.LIZ = stickerItem;
    }
}
