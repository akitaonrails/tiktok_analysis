package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OKH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OKH extends BulletinBaseItem {
    public final long LLILZLL;
    public final Long LLIZ;
    public final int LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OKH)) {
            return false;
        }
        C0OKH c0okh = (C0OKH) obj;
        return this.LLILZLL == c0okh.LLILZLL && Intrinsics.LJFF(this.LLIZ, c0okh.LLIZ) && this.LLIZLLLIL == c0okh.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0okh.LLJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LLILZLL) * 31;
        Long l = this.LLIZ;
        return ((((iY2 + (l == null ? 0 : l.hashCode())) * 31) + this.LLIZLLLIL) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTimeStampItem(creatorTime=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", formattedTimestamp=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLIZ;
    }

    public C0OKH(Long l, long j, int i, String str) {
        super(EnumC618810OOx.NONE, C0OK6.TIMESTAMP, 0, true, j, l, null, null, null, 0, C2097608Jq.LJ(), false, false, false, 0, 0, null, false, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, null, 0, null, null, null);
        this.LLILZLL = j;
        this.LLIZ = l;
        this.LLIZLLLIL = i;
        this.LLJ = str;
    }
}
