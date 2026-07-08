package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618680OOk extends BulletinBaseItem {
    public static final /* synthetic */ int LLJJL = 0;
    public final BulletinPoll LLILZLL;
    public final Long LLIZ;
    public final long LLIZLLLIL;
    public final Long LLJ;
    public final EnumC618810OOx LLJI;
    public int LLJIJIL;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final User LLJJIJIL;
    public final boolean LLJJJ;
    public final BulletinItemBottomStruct LLJJJIL;
    public final int LLJJJJ;
    public int LLJJJJJIL;
    public final String LLJJJJLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618680OOk)) {
            return false;
        }
        C618680OOk c618680OOk = (C618680OOk) obj;
        return Intrinsics.LJFF(this.LLILZLL, c618680OOk.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c618680OOk.LLIZ) && this.LLIZLLLIL == c618680OOk.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c618680OOk.LLJ) && this.LLJI == c618680OOk.LLJI && this.LLJIJIL == c618680OOk.LLJIJIL && this.LLJILJIL == c618680OOk.LLJILJIL && this.LLJILJILJ == c618680OOk.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c618680OOk.LLJILLL) && this.LLJJ == c618680OOk.LLJJ && this.LLJJI == c618680OOk.LLJJI && this.LLJJIII == c618680OOk.LLJJIII && this.LLJJIJI == c618680OOk.LLJJIJI && this.LLJJIJIIJIL == c618680OOk.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c618680OOk.LLJJIJIL) && this.LLJJJ == c618680OOk.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c618680OOk.LLJJJIL) && this.LLJJJJ == c618680OOk.LLJJJJ && this.LLJJJJJIL == c618680OOk.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c618680OOk.LLJJJJLIIL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        Long l = this.LLIZ;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31;
        Long l2 = this.LLJ;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31) + this.LLJILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI) * 31) + this.LLJJIJIIJIL) * 31;
        User user = this.LLJJIJIL;
        int iHashCode4 = (((iHashCode3 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJJJIL;
        int iHashCode5 = (((((iHashCode4 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31) + this.LLJJJJ) * 31) + this.LLJJJJJIL) * 31;
        String str = this.LLJJJJLIIL;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinPollItem(poll=" + this.LLILZLL + ", id=" + this.LLIZ + ", creatorTime=" + this.LLIZLLLIL + ", updateTime=" + this.LLJ + ", bulletinContentType=" + this.LLJI + ", viewCount=" + this.LLJIJIL + ", hasSend=" + this.LLJILJIL + ", status=" + this.LLJILJILJ + ", eventMap=" + this.LLJILLL + ", isFirstInSequence=" + this.LLJJ + ", isLastInSequence=" + this.LLJJI + ", needShowViewCount=" + this.LLJJIII + ", groupMaxViewCount=" + this.LLJJIJI + ", paddingBottom=" + this.LLJJIJIIJIL + ", publishUser=" + this.LLJJIJIL + ", hasRead=" + this.LLJJJ + ", bottomStruct=" + this.LLJJJIL + ", actionType=" + this.LLJJJJ + ", truncatedCount=" + this.LLJJJJJIL + ", publishFrom=" + this.LLJJJJLIIL + ')';
    }

    public final String LLIIJI() {
        return String.valueOf(C19374310qz.LIZ(Long.valueOf(this.LLILZLL.getNonNullTotalVoteCount()), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
    }

    public final boolean LLIIJLIL() {
        return this.LLIZLLLIL + TimeUnit.DAYS.toMillis((long) this.LLILZLL.getNonNullDuration()) < System.currentTimeMillis();
    }

    public final boolean LLILIL() {
        List<BulletinPollOption> nonNullOptions = this.LLILZLL.getNonNullOptions();
        if (!(nonNullOptions instanceof Collection) || !nonNullOptions.isEmpty()) {
            Iterator<BulletinPollOption> it2 = nonNullOptions.iterator();
            while (it2.hasNext()) {
                Boolean bool = it2.next().isVoted;
                if (bool != null && bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLZ() {
        BulletinPoll bulletinPoll;
        return super.LJLZ() && (bulletinPoll = this.LLILZLL) != null && Intrinsics.LJFF(bulletinPoll.getPollExpired(), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final EnumC618810OOx LIZLLL() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLIZLLLIL;
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
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLIZ;
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
        return this.LLJJJJLIIL;
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
        return this.LLJIJIL;
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
        if (!(bulletinBaseItem instanceof C618680OOk)) {
            return false;
        }
        C618680OOk c618680OOk = (C618680OOk) bulletinBaseItem;
        if (Intrinsics.LJFF(this.LLILZLL.getTitle(), c618680OOk.LLILZLL.getTitle()) && Intrinsics.LJFF(this.LLILZLL.getPollId(), c618680OOk.LLILZLL.getPollId()) && Intrinsics.LJFF(this.LLILZLL.getDuration(), c618680OOk.LLILZLL.getDuration()) && Intrinsics.LJFF(this.LLILZLL.getOptions(), c618680OOk.LLILZLL.getOptions()) && Intrinsics.LJFF(this.LLILZLL.getTotalVoteCount(), c618680OOk.LLILZLL.getTotalVoteCount())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLL(BulletinBaseItem bulletinBaseItem) {
        if (LJJLJ(bulletinBaseItem) || !(bulletinBaseItem instanceof C618680OOk) || this.LLJJJJ == ((C618680OOk) bulletinBaseItem).LLJJJJ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLJIJIL = i;
    }

    public static C618680OOk LLIIIL(C618680OOk c618680OOk, BulletinPoll bulletinPoll, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, String str, int i4) {
        Long l;
        long j;
        Long l2;
        EnumC618810OOx enumC618810OOx;
        int i5;
        int i6;
        Map<String, String> map;
        User user;
        boolean z5;
        BulletinItemBottomStruct bulletinItemBottomStruct;
        int i7;
        int i8 = i3;
        int i9 = i;
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        String str2 = str;
        boolean z9 = z;
        int i10 = i2;
        BulletinPoll bulletinPoll2 = bulletinPoll;
        if ((i4 & 1) != 0) {
            bulletinPoll2 = c618680OOk.LLILZLL;
        }
        if ((i4 & 2) != 0) {
            l = c618680OOk.LLIZ;
        } else {
            l = null;
        }
        if ((i4 & 4) != 0) {
            j = c618680OOk.LLIZLLLIL;
        } else {
            j = 0;
        }
        if ((i4 & 8) != 0) {
            l2 = c618680OOk.LLJ;
        } else {
            l2 = null;
        }
        if ((i4 & 16) != 0) {
            enumC618810OOx = c618680OOk.LLJI;
        } else {
            enumC618810OOx = null;
        }
        if ((i4 & 32) != 0) {
            i5 = c618680OOk.LLJIJIL;
        } else {
            i5 = 0;
        }
        if ((i4 & 64) != 0) {
            z9 = c618680OOk.LLJILJIL;
        }
        if ((i4 & 128) != 0) {
            i6 = c618680OOk.LLJILJILJ;
        } else {
            i6 = 0;
        }
        if ((i4 & 256) != 0) {
            map = c618680OOk.LLJILLL;
        } else {
            map = null;
        }
        if ((i4 & 512) != 0) {
            z8 = c618680OOk.LLJJ;
        }
        if ((i4 & 1024) != 0) {
            z7 = c618680OOk.LLJJI;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c618680OOk.LLJJIII;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i9 = c618680OOk.LLJJIJI;
        }
        if ((i4 & 8192) != 0) {
            i10 = c618680OOk.LLJJIJIIJIL;
        }
        if ((i4 & 16384) != 0) {
            user = c618680OOk.LLJJIJIL;
        } else {
            user = null;
        }
        if ((32768 & i4) != 0) {
            z5 = c618680OOk.LLJJJ;
        } else {
            z5 = false;
        }
        if ((65536 & i4) != 0) {
            bulletinItemBottomStruct = c618680OOk.LLJJJIL;
        } else {
            bulletinItemBottomStruct = null;
        }
        if ((131072 & i4) != 0) {
            i8 = c618680OOk.LLJJJJ;
        }
        if ((262144 & i4) != 0) {
            i7 = c618680OOk.LLJJJJJIL;
        } else {
            i7 = 0;
        }
        if ((i4 & 524288) != 0) {
            str2 = c618680OOk.LLJJJJLIIL;
        }
        c618680OOk.getClass();
        boolean z10 = z7;
        boolean z11 = z6;
        int i11 = i10;
        return new C618680OOk(bulletinPoll2, l, j, l2, enumC618810OOx, i5, z9, i6, map, z8, z10, z11, i9, i11, user, z5, bulletinItemBottomStruct, i8, i7, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C618680OOk(BulletinPoll bulletinPoll, Long l, long j, Long l2, EnumC618810OOx enumC618810OOx, int i, int i2, Map map, User user, boolean z, BulletinItemBottomStruct bulletinItemBottomStruct, String str, int i3) {
        int iOrdinal;
        Map mapLJ = map;
        boolean z2 = z;
        BulletinItemBottomStruct bulletinItemBottomStruct2 = bulletinItemBottomStruct;
        int i4 = i2;
        Long l3 = (i3 & 2) != 0 ? null : l;
        i4 = (i3 & 128) != 0 ? 0 : i4;
        mapLJ = (i3 & 256) != 0 ? C2097608Jq.LJ() : mapLJ;
        z2 = (32768 & i3) != 0 ? false : z2;
        bulletinItemBottomStruct2 = (65536 & i3) != 0 ? null : bulletinItemBottomStruct2;
        if ((131072 & i3) != 0) {
            iOrdinal = EnumC618730OOp.UPDATE.ordinal();
        } else {
            iOrdinal = 0;
        }
        this(bulletinPoll, l3, j, l2, enumC618810OOx, i, true, i4, mapLJ, false, false, false, 0, 0, user, z2, bulletinItemBottomStruct2, iOrdinal, 0, (i3 & 524288) == 0 ? str : null);
    }

    public C618680OOk(BulletinPoll bulletinPoll, Long l, long j, Long l2, EnumC618810OOx enumC618810OOx, int i, boolean z, int i2, Map<String, String> map, boolean z2, boolean z3, boolean z4, int i3, int i4, User user, boolean z5, BulletinItemBottomStruct bulletinItemBottomStruct, int i5, int i6, String str) {
        super(enumC618810OOx, C0OK6.CONTENT, i, z, j, l2, l, null, null, i2, map, z2, z3, false, 0, i4, user, z5, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), false, str, 0, null, null, null);
        this.LLILZLL = bulletinPoll;
        this.LLIZ = l;
        this.LLIZLLLIL = j;
        this.LLJ = l2;
        this.LLJI = enumC618810OOx;
        this.LLJIJIL = i;
        this.LLJILJIL = z;
        this.LLJILJILJ = i2;
        this.LLJILLL = map;
        this.LLJJ = z2;
        this.LLJJI = z3;
        this.LLJJIII = z4;
        this.LLJJIJI = i3;
        this.LLJJIJIIJIL = i4;
        this.LLJJIJIL = user;
        this.LLJJJ = z5;
        this.LLJJJIL = bulletinItemBottomStruct;
        this.LLJJJJ = i5;
        this.LLJJJJJIL = i6;
        this.LLJJJJLIIL = str;
    }
}
