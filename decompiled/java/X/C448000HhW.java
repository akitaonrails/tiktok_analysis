package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448000HhW {
    public final List<StickerItem> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C448000HhW() {
        this(null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448000HhW)) {
            return false;
        }
        C448000HhW c448000HhW = (C448000HhW) obj;
        return Intrinsics.LJFF(this.LIZ, c448000HhW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c448000HhW.LIZIZ) && this.LIZJ == c448000HhW.LIZJ && this.LIZLLL == c448000HhW.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoCommentStickerState(stickerList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasCandidate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C448000HhW(String str, boolean z, int i) {
        C13BV c13bv;
        if ((i & 1) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this((i & 2) != 0 ? null : str, c13bv, (i & 4) != 0 ? false : z, false);
    }

    public C448000HhW(String str, List list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
