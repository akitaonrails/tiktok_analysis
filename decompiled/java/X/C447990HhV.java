package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447990HhV {
    public final List<StickerItem> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C447990HhV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447990HhV)) {
            return false;
        }
        C447990HhV c447990HhV = (C447990HhV) obj;
        return Intrinsics.LJFF(this.LIZ, c447990HhV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c447990HhV.LIZIZ) && this.LIZJ == c447990HhV.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyToStickerState(stickerList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447990HhV(int i) {
        this(C13BV.INSTANCE, "", false);
    }

    public C447990HhV(List<StickerItem> list, String str, boolean z) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
