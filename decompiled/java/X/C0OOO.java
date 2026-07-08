package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOO extends BulletinBaseItem {
    public int LLILZLL;
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final Long LLJ;
    public final Aweme LLJI;
    public final Long LLJIJIL;
    public final int LLJILJIL;
    public final Map<String, String> LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final User LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public List<BulletinEmojiItem> LLJJJ;
    public int LLJJJIL;
    public List<InterfaceC1891350zJl> LLJJJJ;
    public final String LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final BulletinItemBottomStruct LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final int LLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OOO)) {
            return false;
        }
        C0OOO c0ooo = (C0OOO) obj;
        return this.LLILZLL == c0ooo.LLILZLL && this.LLIZ == c0ooo.LLIZ && this.LLIZLLLIL == c0ooo.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0ooo.LLJ) && Intrinsics.LJFF(this.LLJI, c0ooo.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0ooo.LLJIJIL) && this.LLJILJIL == c0ooo.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c0ooo.LLJILJILJ) && this.LLJILLL == c0ooo.LLJILLL && this.LLJJ == c0ooo.LLJJ && this.LLJJI == c0ooo.LLJJI && this.LLJJIII == c0ooo.LLJJIII && this.LLJJIJI == c0ooo.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c0ooo.LLJJIJIIJIL) && this.LLJJIJIL == c0ooo.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c0ooo.LLJJJ) && this.LLJJJIL == c0ooo.LLJJJIL && Intrinsics.LJFF(this.LLJJJJ, c0ooo.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c0ooo.LLJJJJJIL) && this.LLJJJJLIIL == c0ooo.LLJJJJLIIL && Intrinsics.LJFF(this.LLJJL, c0ooo.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0ooo.LLJJLIIIJLLLLLLLZ) && this.LLJL == c0ooo.LLJL;
    }

    public final int hashCode() {
        int iZ2 = ((((this.LLILZLL * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31;
        Long l = this.LLJ;
        int iHashCode = (((iZ2 + (l == null ? 0 : l.hashCode())) * 31) + this.LLJI.hashCode()) * 31;
        Long l2 = this.LLJIJIL;
        int iHashCode2 = (((((((((((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJILJIL) * 31) + this.LLJILJILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + this.LLJJIII) * 31) + this.LLJJIJI) * 31;
        User user = this.LLJJIJIIJIL;
        int iHashCode3 = (((((((((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL) * 31) + this.LLJJJJ.hashCode()) * 31;
        String str = this.LLJJJJJIL;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJJJJLIIL) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJJL;
        int iHashCode5 = (iHashCode4 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        return ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLJL;
    }

    public final String toString() {
        return "BulletinVideoItem(viewCount=" + this.LLILZLL + ", hasSend=" + this.LLIZ + ", creatorTime=" + this.LLIZLLLIL + ", updateTime=" + this.LLJ + ", aweme=" + this.LLJI + ", id=" + this.LLJIJIL + ", status=" + this.LLJILJIL + ", eventMap=" + this.LLJILJILJ + ", isFirstInSequence=" + this.LLJILLL + ", isLastInSequence=" + this.LLJJ + ", needShowViewCount=" + this.LLJJI + ", groupMaxViewCount=" + this.LLJJIII + ", paddingBottom=" + this.LLJJIJI + ", publishUser=" + this.LLJJIJIIJIL + ", hasRead=" + this.LLJJIJIL + ", emojiList=" + this.LLJJJ + ", emojiOrderNum=" + this.LLJJJIL + ", emojiSnapshot=" + this.LLJJJJ + ", publishFrom=" + this.LLJJJJJIL + ", statusCode=" + this.LLJJJJLIIL + ", bottomStruct=" + this.LLJJL + ", inspirationCardUniqueKey=" + this.LLJJLIIIJLLLLLLLZ + ", source=" + this.LLJL + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLZIJ() {
        return this.LLJJJJLIIL;
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
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem instanceof C0OOO) {
            return !Intrinsics.LJFF(this.LLJI, ((C0OOO) bulletinBaseItem).LLJI);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJJJ = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJJJIL = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJJJJ = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFII(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLILZLL = i;
    }

    public static C0OOO LLIIIL(C0OOO c0ooo, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, List list, String str, int i3, int i4) {
        int i5;
        long j;
        Long l;
        Aweme aweme;
        Long l2;
        int i6;
        Map<String, String> map;
        User user;
        boolean z5;
        int i7;
        List<InterfaceC1891350zJl> list2;
        BulletinItemBottomStruct bulletinItemBottomStruct;
        int i8 = i3;
        String str2 = str;
        int i9 = i2;
        int i10 = i;
        boolean z6 = z4;
        List list3 = list;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        int i11 = 0;
        if ((i4 & 1) != 0) {
            i5 = c0ooo.LLILZLL;
        } else {
            i5 = 0;
        }
        if ((i4 & 2) != 0) {
            z7 = c0ooo.LLIZ;
        }
        if ((i4 & 4) != 0) {
            j = c0ooo.LLIZLLLIL;
        } else {
            j = 0;
        }
        String str3 = null;
        if ((i4 & 8) != 0) {
            l = c0ooo.LLJ;
        } else {
            l = null;
        }
        if ((i4 & 16) != 0) {
            aweme = c0ooo.LLJI;
        } else {
            aweme = null;
        }
        if ((i4 & 32) != 0) {
            l2 = c0ooo.LLJIJIL;
        } else {
            l2 = null;
        }
        if ((i4 & 64) != 0) {
            i6 = c0ooo.LLJILJIL;
        } else {
            i6 = 0;
        }
        if ((i4 & 128) != 0) {
            map = c0ooo.LLJILJILJ;
        } else {
            map = null;
        }
        if ((i4 & 256) != 0) {
            z8 = c0ooo.LLJILLL;
        }
        if ((i4 & 512) != 0) {
            z9 = c0ooo.LLJJ;
        }
        if ((i4 & 1024) != 0) {
            z6 = c0ooo.LLJJI;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i10 = c0ooo.LLJJIII;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i9 = c0ooo.LLJJIJI;
        }
        if ((i4 & 8192) != 0) {
            user = c0ooo.LLJJIJIIJIL;
        } else {
            user = null;
        }
        if ((i4 & 16384) != 0) {
            z5 = c0ooo.LLJJIJIL;
        } else {
            z5 = false;
        }
        if ((32768 & i4) != 0) {
            list3 = c0ooo.LLJJJ;
        }
        if ((65536 & i4) != 0) {
            i7 = c0ooo.LLJJJIL;
        } else {
            i7 = 0;
        }
        if ((131072 & i4) != 0) {
            list2 = c0ooo.LLJJJJ;
        } else {
            list2 = null;
        }
        if ((262144 & i4) != 0) {
            str2 = c0ooo.LLJJJJJIL;
        }
        if ((524288 & i4) != 0) {
            i8 = c0ooo.LLJJJJLIIL;
        }
        if ((1048576 & i4) != 0) {
            bulletinItemBottomStruct = c0ooo.LLJJL;
        } else {
            bulletinItemBottomStruct = null;
        }
        if ((2097152 & i4) != 0) {
            str3 = c0ooo.LLJJLIIIJLLLLLLLZ;
        }
        if ((i4 & 4194304) != 0) {
            i11 = c0ooo.LLJL;
        }
        c0ooo.getClass();
        return new C0OOO(i5, z7, j, l, aweme, l2, i6, map, z8, z9, z6, i10, i9, user, z5, list3, i7, list2, str2, i8, bulletinItemBottomStruct, str3, i11);
    }

    public /* synthetic */ C0OOO(int i, long j, Long l, Aweme aweme, Long l2, int i2, Map map, User user, boolean z, List list, int i3, List list2, String str, BulletinItemBottomStruct bulletinItemBottomStruct, String str2, int i4, int i5) {
        this(i, true, j, l, aweme, (i5 & 32) != 0 ? null : l2, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? C2097608Jq.LJ() : map, false, false, false, 0, 0, user, (i5 & 16384) != 0 ? false : z, (32768 & i5) != 0 ? new ArrayList() : list, (65536 & i5) != 0 ? 0 : i3, (131072 & i5) != 0 ? new ArrayList() : list2, (262144 & i5) != 0 ? null : str, 0, (1048576 & i5) != 0 ? null : bulletinItemBottomStruct, (2097152 & i5) == 0 ? str2 : null, (i5 & 4194304) != 0 ? C0OP0.DEFAULT.getType() : i4);
    }

    public C0OOO(int i, boolean z, long j, Long l, Aweme aweme, Long l2, int i2, Map<String, String> map, boolean z2, boolean z3, boolean z4, int i3, int i4, User user, boolean z5, List<BulletinEmojiItem> list, int i5, List<InterfaceC1891350zJl> list2, String str, int i6, BulletinItemBottomStruct bulletinItemBottomStruct, String str2, int i7) {
        super(EnumC618810OOx.FORWARD, C0OK6.CONTENT, i, z, j, l, l2, null, null, i2, map, z2, z3, false, 0, i4, user, z5, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str, i6, null, str2, null);
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = j;
        this.LLJ = l;
        this.LLJI = aweme;
        this.LLJIJIL = l2;
        this.LLJILJIL = i2;
        this.LLJILJILJ = map;
        this.LLJILLL = z2;
        this.LLJJ = z3;
        this.LLJJI = z4;
        this.LLJJIII = i3;
        this.LLJJIJI = i4;
        this.LLJJIJIIJIL = user;
        this.LLJJIJIL = z5;
        this.LLJJJ = list;
        this.LLJJJIL = i5;
        this.LLJJJJ = list2;
        this.LLJJJJJIL = str;
        this.LLJJJJLIIL = i6;
        this.LLJJL = bulletinItemBottomStruct;
        this.LLJJLIIIJLLLLLLLZ = str2;
        this.LLJL = i7;
    }
}
