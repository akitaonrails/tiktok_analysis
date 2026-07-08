package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453360HqA implements InterfaceC453420HqG {
    public final StickerItem LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C453360HqA)) {
            return false;
        }
        C453360HqA c453360HqA = (C453360HqA) obj;
        return Intrinsics.LJFF(this.LIZ, c453360HqA.LIZ) && this.LIZIZ == c453360HqA.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedStickerItem(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C453360HqA(int i, StickerItem stickerItem) {
        this.LIZ = stickerItem;
        this.LIZIZ = i;
    }
}
