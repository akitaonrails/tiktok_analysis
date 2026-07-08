package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452650Hp1 {
    public final List<StickerItem> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452650Hp1)) {
            return false;
        }
        C452650Hp1 c452650Hp1 = (C452650Hp1) obj;
        return Intrinsics.LJFF(this.LIZ, c452650Hp1.LIZ) && this.LIZIZ == c452650Hp1.LIZIZ && this.LIZJ == c452650Hp1.LIZJ;
    }

    public final int hashCode() {
        List<StickerItem> list = this.LIZ;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopularStickerPage(stickers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C452650Hp1(List<StickerItem> list, int i, boolean z) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
