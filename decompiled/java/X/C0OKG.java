package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OKG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OKG extends BulletinBaseItem {
    public final String LLILZLL;
    public final int LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OKG)) {
            return false;
        }
        C0OKG c0okg = (C0OKG) obj;
        return Intrinsics.LJFF(this.LLILZLL, c0okg.LLILZLL) && this.LLIZ == c0okg.LLIZ;
    }

    public final int hashCode() {
        return (this.LLILZLL.hashCode() * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTipsItem(itemTips=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLIZ;
    }

    public C0OKG(String str, int i) {
        super(EnumC618810OOx.NONE, C0OK6.TIPS, 0, true, 0L, 0L, null, null, null, 0, C2097608Jq.LJ(), false, false, false, 0, i, null, false, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, null, 0, null, null, null);
        this.LLILZLL = str;
        this.LLIZ = i;
    }
}
