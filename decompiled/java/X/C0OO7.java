package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OO7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OO7 extends BulletinBaseItem {
    public final Long LLILZLL;
    public final int LLIZ;
    public final EnumC618810OOx LLIZLLLIL;
    public final long LLJ;
    public final Long LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public final User LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OO7)) {
            return false;
        }
        C0OO7 c0oo7 = (C0OO7) obj;
        return Intrinsics.LJFF(this.LLILZLL, c0oo7.LLILZLL) && this.LLIZ == c0oo7.LLIZ && this.LLIZLLLIL == c0oo7.LLIZLLLIL && this.LLJ == c0oo7.LLJ && Intrinsics.LJFF(this.LLJI, c0oo7.LLJI) && this.LLJIJIL == c0oo7.LLJIJIL && this.LLJILJIL == c0oo7.LLJILJIL && this.LLJILJILJ == c0oo7.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c0oo7.LLJILLL);
    }

    public final int hashCode() {
        Long l = this.LLILZLL;
        int iHashCode = (((((((l == null ? 0 : l.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJ)) * 31;
        Long l2 = this.LLJI;
        int iHashCode2 = (((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31;
        User user = this.LLJILLL;
        return iHashCode2 + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinUnavailableItem(id=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", bulletinContentType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", creatorTime=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", isFirstInSequence=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", isLastInSequence=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", publishUser=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final EnumC618810OOx LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJILJIL;
    }

    public C0OO7(Long l, int i, EnumC618810OOx enumC618810OOx, long j, Long l2, boolean z, boolean z2, int i2, User user) {
        super(enumC618810OOx, C0OK6.CONTENT, 0, true, j, l2, l, null, null, i, C2097608Jq.LJ(), z, z2, false, 0, i2, user, false, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, null, 0, null, null, null);
        this.LLILZLL = l;
        this.LLIZ = i;
        this.LLIZLLLIL = enumC618810OOx;
        this.LLJ = j;
        this.LLJI = l2;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = i2;
        this.LLJILLL = user;
    }
}
