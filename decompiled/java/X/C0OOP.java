package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOP extends BulletinBaseItem {
    public final EnumC618810OOx LLILZLL;
    public int LLIZ;
    public final boolean LLIZLLLIL;
    public final long LLJ;
    public final Long LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final List<String> LLJILJILJ;
    public final BulletinStyleStruct LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;
    public final Long LLJJIII;
    public final int LLJJIJI;
    public final Map<String, String> LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final User LLJJJJLIIL;
    public final boolean LLJJL;
    public List<BulletinEmojiItem> LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public List<InterfaceC1891350zJl> LLJLIL;
    public final String LLJLILLLLZIIL;
    public final BulletinItemBottomStruct LLJLL;
    public BulletinCommentUIOverview LLJLLIL;
    public String LLJLLL;

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLZ() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OOP)) {
            return false;
        }
        C0OOP c0oop = (C0OOP) obj;
        return this.LLILZLL == c0oop.LLILZLL && this.LLIZ == c0oop.LLIZ && this.LLIZLLLIL == c0oop.LLIZLLLIL && this.LLJ == c0oop.LLJ && Intrinsics.LJFF(this.LLJI, c0oop.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0oop.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0oop.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0oop.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0oop.LLJILLL) && this.LLJJ == c0oop.LLJJ && Intrinsics.LJFF(this.LLJJI, c0oop.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c0oop.LLJJIII) && this.LLJJIJI == c0oop.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c0oop.LLJJIJIIJIL) && this.LLJJIJIL == c0oop.LLJJIJIL && this.LLJJJ == c0oop.LLJJJ && this.LLJJJIL == c0oop.LLJJJIL && this.LLJJJJ == c0oop.LLJJJJ && this.LLJJJJJIL == c0oop.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c0oop.LLJJJJLIIL) && this.LLJJL == c0oop.LLJJL && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0oop.LLJJLIIIJLLLLLLLZ) && this.LLJL == c0oop.LLJL && Intrinsics.LJFF(this.LLJLIL, c0oop.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c0oop.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c0oop.LLJLL) && Intrinsics.LJFF(this.LLJLLIL, c0oop.LLJLLIL) && Intrinsics.LJFF(this.LLJLLL, c0oop.LLJLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLILZLL.hashCode() * 31) + this.LLIZ) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Y2(this.LLJ)) * 31;
        Long l = this.LLJI;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LLJIJIL;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31;
        List<String> list = this.LLJILJILJ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BulletinStyleStruct bulletinStyleStruct = this.LLJILLL;
        int iHashCode5 = (((iHashCode4 + (bulletinStyleStruct == null ? 0 : bulletinStyleStruct.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        String str2 = this.LLJJI;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.LLJJIII;
        int iHashCode7 = (((((((((((((((iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJJIJI) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + this.LLJJJJ) * 31) + this.LLJJJJJIL) * 31;
        User user = this.LLJJJJLIIL;
        int iHashCode8 = (((((((((iHashCode7 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31) + this.LLJJLIIIJLLLLLLLZ.hashCode()) * 31) + this.LLJL) * 31) + this.LLJLIL.hashCode()) * 31;
        String str3 = this.LLJLILLLLZIIL;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJLL;
        int iHashCode10 = (iHashCode9 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        BulletinCommentUIOverview bulletinCommentUIOverview = this.LLJLLIL;
        int iHashCode11 = (iHashCode10 + (bulletinCommentUIOverview == null ? 0 : bulletinCommentUIOverview.hashCode())) * 31;
        String str4 = this.LLJLLL;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinTextItem(bulletinContentType=" + this.LLILZLL + ", viewCount=" + this.LLIZ + ", hasSend=" + this.LLIZLLLIL + ", creatorTime=" + this.LLJ + ", updateTime=" + this.LLJI + ", styleId=" + this.LLJIJIL + ", text=" + this.LLJILJIL + ", links=" + this.LLJILJILJ + ", bulletinStyleStruct=" + this.LLJILLL + ", needDisplayAnimator=" + this.LLJJ + ", publishExtra=" + this.LLJJI + ", id=" + this.LLJJIII + ", status=" + this.LLJJIJI + ", eventMap=" + this.LLJJIJIIJIL + ", isFirstInSequence=" + this.LLJJIJIL + ", isLastInSequence=" + this.LLJJJ + ", needShowViewCount=" + this.LLJJJIL + ", groupMaxViewCount=" + this.LLJJJJ + ", paddingBottom=" + this.LLJJJJJIL + ", publishUser=" + this.LLJJJJLIIL + ", hasRead=" + this.LLJJL + ", emojiList=" + this.LLJJLIIIJLLLLLLLZ + ", emojiOrderNum=" + this.LLJL + ", emojiSnapshot=" + this.LLJLIL + ", publishFrom=" + this.LLJLILLLLZIIL + ", bottomStruct=" + this.LLJLL + ", commentUIOverView=" + this.LLJLLIL + ", inspirationCardUniqueKey=" + this.LLJLLL + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final EnumC618810OOx LIZLLL() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinStyleStruct LJ() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinCommentUIOverview LJIILIIL() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJIL() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJL() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJLIIIJ() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLIIIJJI(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem instanceof C0OOP) {
            C0OOP c0oop = (C0OOP) bulletinBaseItem;
            if (this.LLJJIJIL == c0oop.LLJJIJIL && this.LLJJJ == c0oop.LLJJJ && Intrinsics.LJFF(this.LLJIJIL, c0oop.LLJIJIL)) {
                return false;
            }
            return true;
        }
        return super.LJJLIIIJJI(bulletinBaseItem);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (!(bulletinBaseItem instanceof C0OOP)) {
            return false;
        }
        C0OOP c0oop = (C0OOP) bulletinBaseItem;
        if (Intrinsics.LJFF(this.LLJILJIL, c0oop.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0oop.LLJILJILJ)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZ(BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.LLJLLIL = bulletinCommentUIOverview;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJJLIIIJLLLLLLLZ = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJL = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJLIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFII(String str) {
        this.LLJLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0OOP)) {
            return false;
        }
        C0OOP c0oop = (C0OOP) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLJJIII, c0oop.LLJJIII)) {
            Long l = this.LLJJIII;
            Long l2 = c0oop.LLJJIII;
            if (l == null) {
                return false;
            }
            l.longValue();
            if (l2 == null) {
                return false;
            }
            l2.longValue();
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_text_item_diff_setting", true, true) || l.longValue() >= 0 || l2.longValue() <= 0) {
                return false;
            }
        }
        if (this.LLILZLL != c0oop.LLILZLL || this.itemType != c0oop.itemType) {
            return false;
        }
        return true;
    }

    public static C0OOP LLIIIL(C0OOP c0oop, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, List list, String str, BulletinCommentUIOverview bulletinCommentUIOverview, int i3) {
        EnumC618810OOx enumC618810OOx;
        int i4;
        long j;
        Long l;
        String str2;
        String str3;
        List<String> list2;
        BulletinStyleStruct bulletinStyleStruct;
        boolean z5;
        String str4;
        Long l2;
        int i5;
        Map<String, String> map;
        User user;
        boolean z6;
        int i6;
        List<InterfaceC1891350zJl> list3;
        BulletinItemBottomStruct bulletinItemBottomStruct;
        String str5 = str;
        List list4 = list;
        int i7 = i2;
        int i8 = i;
        boolean z7 = z;
        boolean z8 = z4;
        boolean z9 = z2;
        BulletinCommentUIOverview bulletinCommentUIOverview2 = bulletinCommentUIOverview;
        boolean z10 = z3;
        String str6 = null;
        if ((i3 & 1) != 0) {
            enumC618810OOx = c0oop.LLILZLL;
        } else {
            enumC618810OOx = null;
        }
        if ((i3 & 2) != 0) {
            i4 = c0oop.LLIZ;
        } else {
            i4 = 0;
        }
        if ((i3 & 4) != 0) {
            z7 = c0oop.LLIZLLLIL;
        }
        if ((i3 & 8) != 0) {
            j = c0oop.LLJ;
        } else {
            j = 0;
        }
        if ((i3 & 16) != 0) {
            l = c0oop.LLJI;
        } else {
            l = null;
        }
        if ((i3 & 32) != 0) {
            str2 = c0oop.LLJIJIL;
        } else {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            str3 = c0oop.LLJILJIL;
        } else {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            list2 = c0oop.LLJILJILJ;
        } else {
            list2 = null;
        }
        if ((i3 & 256) != 0) {
            bulletinStyleStruct = c0oop.LLJILLL;
        } else {
            bulletinStyleStruct = null;
        }
        if ((i3 & 512) != 0) {
            z5 = c0oop.LLJJ;
        } else {
            z5 = false;
        }
        if ((i3 & 1024) != 0) {
            str4 = c0oop.LLJJI;
        } else {
            str4 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            l2 = c0oop.LLJJIII;
        } else {
            l2 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i5 = c0oop.LLJJIJI;
        } else {
            i5 = 0;
        }
        if ((i3 & 8192) != 0) {
            map = c0oop.LLJJIJIIJIL;
        } else {
            map = null;
        }
        if ((i3 & 16384) != 0) {
            z9 = c0oop.LLJJIJIL;
        }
        if ((32768 & i3) != 0) {
            z10 = c0oop.LLJJJ;
        }
        if ((65536 & i3) != 0) {
            z8 = c0oop.LLJJJIL;
        }
        if ((131072 & i3) != 0) {
            i8 = c0oop.LLJJJJ;
        }
        if ((262144 & i3) != 0) {
            i7 = c0oop.LLJJJJJIL;
        }
        if ((524288 & i3) != 0) {
            user = c0oop.LLJJJJLIIL;
        } else {
            user = null;
        }
        if ((1048576 & i3) != 0) {
            z6 = c0oop.LLJJL;
        } else {
            z6 = false;
        }
        if ((2097152 & i3) != 0) {
            list4 = c0oop.LLJJLIIIJLLLLLLLZ;
        }
        if ((4194304 & i3) != 0) {
            i6 = c0oop.LLJL;
        } else {
            i6 = 0;
        }
        if ((8388608 & i3) != 0) {
            list3 = c0oop.LLJLIL;
        } else {
            list3 = null;
        }
        if ((16777216 & i3) != 0) {
            str5 = c0oop.LLJLILLLLZIIL;
        }
        if ((33554432 & i3) != 0) {
            bulletinItemBottomStruct = c0oop.LLJLL;
        } else {
            bulletinItemBottomStruct = null;
        }
        if ((67108864 & i3) != 0) {
            bulletinCommentUIOverview2 = c0oop.LLJLLIL;
        }
        if ((i3 & 134217728) != 0) {
            str6 = c0oop.LLJLLL;
        }
        c0oop.getClass();
        return new C0OOP(enumC618810OOx, i4, z7, j, l, str2, str3, list2, bulletinStyleStruct, z5, str4, l2, i5, map, z9, z10, z8, i8, i7, user, z6, list4, i6, list3, str5, bulletinItemBottomStruct, bulletinCommentUIOverview2, str6);
    }

    public /* synthetic */ C0OOP(EnumC618810OOx enumC618810OOx, int i, long j, Long l, String str, String str2, List list, BulletinStyleStruct bulletinStyleStruct, String str3, Long l2, int i2, Map map, User user, boolean z, List list2, int i3, List list3, String str4, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentUIOverview bulletinCommentUIOverview, String str5, int i4) {
        this(enumC618810OOx, i, true, j, l, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? "" : str2, (i4 & 128) != 0 ? null : list, (i4 & 256) != 0 ? null : bulletinStyleStruct, false, (i4 & 1024) != 0 ? null : str3, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l2, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i2, (i4 & 8192) != 0 ? C2097608Jq.LJ() : map, false, false, false, 0, 0, user, (1048576 & i4) != 0 ? false : z, (2097152 & i4) != 0 ? new ArrayList() : list2, (4194304 & i4) != 0 ? 0 : i3, (8388608 & i4) != 0 ? new ArrayList() : list3, (16777216 & i4) != 0 ? null : str4, (33554432 & i4) != 0 ? null : bulletinItemBottomStruct, (67108864 & i4) != 0 ? null : bulletinCommentUIOverview, (i4 & 134217728) == 0 ? str5 : null);
    }

    public C0OOP(EnumC618810OOx enumC618810OOx, int i, boolean z, long j, Long l, String str, String str2, List<String> list, BulletinStyleStruct bulletinStyleStruct, boolean z2, String str3, Long l2, int i2, Map<String, String> map, boolean z3, boolean z4, boolean z5, int i3, int i4, User user, boolean z6, List<BulletinEmojiItem> list2, int i5, List<InterfaceC1891350zJl> list3, String str4, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentUIOverview bulletinCommentUIOverview, String str5) {
        super(enumC618810OOx, C0OK6.CONTENT, i, z, j, l, l2, str, bulletinStyleStruct, i2, map, z3, z4, false, 0, i4, user, z6, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str4, 0, null, str5, null);
        this.LLILZLL = enumC618810OOx;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
        this.LLJ = j;
        this.LLJI = l;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = list;
        this.LLJILLL = bulletinStyleStruct;
        this.LLJJ = z2;
        this.LLJJI = str3;
        this.LLJJIII = l2;
        this.LLJJIJI = i2;
        this.LLJJIJIIJIL = map;
        this.LLJJIJIL = z3;
        this.LLJJJ = z4;
        this.LLJJJIL = z5;
        this.LLJJJJ = i3;
        this.LLJJJJJIL = i4;
        this.LLJJJJLIIL = user;
        this.LLJJL = z6;
        this.LLJJLIIIJLLLLLLLZ = list2;
        this.LLJL = i5;
        this.LLJLIL = list3;
        this.LLJLILLLLZIIL = str4;
        this.LLJLL = bulletinItemBottomStruct;
        this.LLJLLIL = bulletinCommentUIOverview;
        this.LLJLLL = str5;
    }
}
