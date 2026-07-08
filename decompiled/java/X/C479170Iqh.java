package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleTab;
import webcast.data.CardTag;

/* JADX INFO: renamed from: X.0Iqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479170Iqh {
    public final long LIZ;
    public final String LIZIZ;
    public final CardTag LIZJ;
    public final CardTag LIZLLL;
    public final List<User> LJ;
    public final Room LJFF;
    public final MGModuleTab LJI;
    public final CardTag LJII;
    public final Integer LJIIIIZZ;
    public final List<Long> LJIIIZ;
    public final List<CardTag> LJIIJ;
    public final FeedItem LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C479170Iqh)) {
            return false;
        }
        C479170Iqh c479170Iqh = (C479170Iqh) obj;
        return this.LIZ == c479170Iqh.LIZ && Intrinsics.LJFF(this.LIZIZ, c479170Iqh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c479170Iqh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c479170Iqh.LIZLLL) && Intrinsics.LJFF(this.LJ, c479170Iqh.LJ) && Intrinsics.LJFF(this.LJFF, c479170Iqh.LJFF) && Intrinsics.LJFF(this.LJI, c479170Iqh.LJI) && Intrinsics.LJFF(this.LJII, c479170Iqh.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c479170Iqh.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c479170Iqh.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c479170Iqh.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c479170Iqh.LJIIJJI);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        CardTag cardTag = this.LIZJ;
        int iHashCode = (iY2 + (cardTag == null ? 0 : cardTag.hashCode())) * 31;
        CardTag cardTag2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (cardTag2 == null ? 0 : cardTag2.hashCode())) * 31;
        List<User> list = this.LJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Room room = this.LJFF;
        int iHashCode4 = (iHashCode3 + (room == null ? 0 : room.hashCode())) * 31;
        MGModuleTab mGModuleTab = this.LJI;
        int iHashCode5 = (iHashCode4 + (mGModuleTab == null ? 0 : mGModuleTab.hashCode())) * 31;
        CardTag cardTag3 = this.LJII;
        int iHashCode6 = (iHashCode5 + (cardTag3 == null ? 0 : cardTag3.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list2 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CardTag> list3 = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FeedItem feedItem = this.LJIIJJI;
        return iHashCode9 + (feedItem != null ? feedItem.hashCode() : 0);
    }

    public final String toString() {
        return "PlayFeedDataItem(roomId=" + this.LIZ + ", cardTitle=" + this.LIZIZ + ", playTag=" + this.LIZJ + ", relationTag=" + this.LIZLLL + ", linkedUserList=" + this.LJ + ", room=" + this.LJFF + ", currentPlayTab=" + this.LJI + ", describeMessage=" + this.LJII + ", cardType=" + this.LJIIIIZZ + ", linkedFriendList=" + this.LJIIIZ + ", hangoutCardTagList=" + this.LJIIJ + ", feedItem=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C479170Iqh(long j, String str, CardTag cardTag, CardTag cardTag2, List<? extends User> list, Room room, MGModuleTab mGModuleTab, CardTag cardTag3, Integer num, List<Long> list2, List<CardTag> list3, FeedItem feedItem) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = cardTag;
        this.LIZLLL = cardTag2;
        this.LJ = list;
        this.LJFF = room;
        this.LJI = mGModuleTab;
        this.LJII = cardTag3;
        this.LJIIIIZZ = num;
        this.LJIIIZ = list2;
        this.LJIIJ = list3;
        this.LJIIJJI = feedItem;
    }
}
