package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinLiveRoomCard;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OON, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OON extends BulletinBaseItem {
    public static final /* synthetic */ int LLJL = 0;
    public int LLILZLL;
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final Long LLJ;
    public final BulletinLiveRoomCard LLJI;
    public final BulletinCardInfo LLJIJIL;
    public final Long LLJILJIL;
    public final int LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final User LLJJIJIL;
    public final boolean LLJJJ;
    public List<BulletinEmojiItem> LLJJJIL;
    public int LLJJJJ;
    public List<InterfaceC1891350zJl> LLJJJJJIL;
    public final BulletinItemBottomStruct LLJJJJLIIL;
    public final String LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OON)) {
            return false;
        }
        C0OON c0oon = (C0OON) obj;
        return this.LLILZLL == c0oon.LLILZLL && this.LLIZ == c0oon.LLIZ && this.LLIZLLLIL == c0oon.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0oon.LLJ) && Intrinsics.LJFF(this.LLJI, c0oon.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0oon.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0oon.LLJILJIL) && this.LLJILJILJ == c0oon.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c0oon.LLJILLL) && this.LLJJ == c0oon.LLJJ && this.LLJJI == c0oon.LLJJI && this.LLJJIII == c0oon.LLJJIII && this.LLJJIJI == c0oon.LLJJIJI && this.LLJJIJIIJIL == c0oon.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c0oon.LLJJIJIL) && this.LLJJJ == c0oon.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c0oon.LLJJJIL) && this.LLJJJJ == c0oon.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c0oon.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c0oon.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c0oon.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0oon.LLJJLIIIJLLLLLLLZ);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LLILZLL * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31;
        Long l = this.LLJ;
        int iHashCode = (iZ2 + (l == null ? 0 : l.hashCode())) * 31;
        BulletinLiveRoomCard bulletinLiveRoomCard = this.LLJI;
        int iHashCode2 = (iHashCode + (bulletinLiveRoomCard == null ? 0 : bulletinLiveRoomCard.hashCode())) * 31;
        BulletinCardInfo bulletinCardInfo = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (bulletinCardInfo == null ? 0 : bulletinCardInfo.hashCode())) * 31;
        Long l2 = this.LLJILJIL;
        int iHashCode4 = (((((((((((((((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJILJILJ) * 31) + this.LLJILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI) * 31) + this.LLJJIJIIJIL) * 31;
        User user = this.LLJJIJIL;
        int iHashCode5 = (((((((((iHashCode4 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ) * 31) + this.LLJJJJJIL.hashCode()) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJJJJLIIL;
        int iHashCode6 = (iHashCode5 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        String str = this.LLJJL;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinLiveRoomItem(viewCount=" + this.LLILZLL + ", hasSend=" + this.LLIZ + ", creatorTime=" + this.LLIZLLLIL + ", updateTime=" + this.LLJ + ", liveRoomCard=" + this.LLJI + ", cardInfo=" + this.LLJIJIL + ", id=" + this.LLJILJIL + ", status=" + this.LLJILJILJ + ", eventMap=" + this.LLJILLL + ", isFirstInSequence=" + this.LLJJ + ", isLastInSequence=" + this.LLJJI + ", needShowViewCount=" + this.LLJJIII + ", groupMaxViewCount=" + this.LLJJIJI + ", paddingBottom=" + this.LLJJIJIIJIL + ", publishUser=" + this.LLJJIJIL + ", hasRead=" + this.LLJJJ + ", emojiList=" + this.LLJJJIL + ", emojiOrderNum=" + this.LLJJJJ + ", emojiSnapshot=" + this.LLJJJJJIL + ", bottomStruct=" + this.LLJJJJLIIL + ", publishExtra=" + this.LLJJL + ", publishFrom=" + this.LLJJLIIIJLLLLLLLZ + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJI() {
        BulletinCardInfo bulletinCardInfo = this.LLJIJIL;
        if (bulletinCardInfo != null) {
            return Long.valueOf(bulletinCardInfo.cardType);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJIIIIZZ() {
        List<BulletinCardKV> list;
        Object obj;
        String str;
        BulletinCardInfo bulletinCardInfo = this.LLJIJIL;
        if (bulletinCardInfo != null && (list = bulletinCardInfo.eventParams) != null) {
            Iterator<BulletinCardKV> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BulletinCardKV next = it2.next();
                BulletinCardKV bulletinCardKV = next;
                if (Intrinsics.LJFF(bulletinCardKV != null ? bulletinCardKV.key : null, "content_type")) {
                    obj = next;
                    break;
                }
            }
            BulletinCardKV bulletinCardKV2 = (BulletinCardKV) obj;
            if (bulletinCardKV2 != null && (str = bulletinCardKV2.value) != null) {
                return str;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJLIIIJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem instanceof C0OON) {
            return !Intrinsics.LJFF(this.LLJI, ((C0OON) bulletinBaseItem).LLJI);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJJJIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJJJJ = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJJJJJIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLILZLL = i;
    }

    public C0OON(int i, boolean z, long j, Long l, BulletinLiveRoomCard bulletinLiveRoomCard, BulletinCardInfo bulletinCardInfo, Long l2, int i2, Map<String, String> map, boolean z2, boolean z3, boolean z4, int i3, int i4, User user, boolean z5, List<BulletinEmojiItem> list, int i5, List<InterfaceC1891350zJl> list2, BulletinItemBottomStruct bulletinItemBottomStruct, String str, String str2) {
        super(EnumC618810OOx.LIVE_ROOM, C0OK6.CONTENT, i, z, j, l, l2, null, null, i2, map, z2, z3, false, 0, i4, user, z5, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str2, 0, null, null, null);
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = j;
        this.LLJ = l;
        this.LLJI = bulletinLiveRoomCard;
        this.LLJIJIL = bulletinCardInfo;
        this.LLJILJIL = l2;
        this.LLJILJILJ = i2;
        this.LLJILLL = map;
        this.LLJJ = z2;
        this.LLJJI = z3;
        this.LLJJIII = z4;
        this.LLJJIJI = i3;
        this.LLJJIJIIJIL = i4;
        this.LLJJIJIL = user;
        this.LLJJJ = z5;
        this.LLJJJIL = list;
        this.LLJJJJ = i5;
        this.LLJJJJJIL = list2;
        this.LLJJJJLIIL = bulletinItemBottomStruct;
        this.LLJJL = str;
        this.LLJJLIIIJLLLLLLLZ = str2;
    }
}
