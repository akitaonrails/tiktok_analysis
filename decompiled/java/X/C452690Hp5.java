package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452690Hp5 implements Serializable {
    public final boolean hasMore;
    public final int nextCursor;
    public final int requestCursor;
    public final ArrayList<StickerItem> stickers;
    public final int version;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452690Hp5)) {
            return false;
        }
        C452690Hp5 c452690Hp5 = (C452690Hp5) obj;
        return this.version == c452690Hp5.version && this.requestCursor == c452690Hp5.requestCursor && Intrinsics.LJFF(this.stickers, c452690Hp5.stickers) && this.nextCursor == c452690Hp5.nextCursor && this.hasMore == c452690Hp5.hasMore;
    }

    public int hashCode() {
        int i = ((this.version * 31) + this.requestCursor) * 31;
        ArrayList<StickerItem> arrayList = this.stickers;
        return ((((i + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.nextCursor) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedTabPage(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", requestCursor=");
        sbLIZ.append(this.requestCursor);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C452690Hp5(int i, int i2, ArrayList<StickerItem> arrayList, int i3, boolean z) {
        this.version = i;
        this.requestCursor = i2;
        this.stickers = arrayList;
        this.nextCursor = i3;
        this.hasMore = z;
    }
}
