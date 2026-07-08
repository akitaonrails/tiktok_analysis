package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ypz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886410Ypz extends AbstractC885530YoZ {
    public static final int $stable = 8;
    public final InterfaceC879010Ye3 LL;
    public final C878900Yds LLILLJJLI;
    public final C879580Yey LLILLL;
    public final long LLILZ;
    public final List<UrlModel> LLILZIL;
    public final List<String> LLILZLL;
    public final C881260Yhg LLIZ;
    public final C879630Yf3 LLIZLLLIL;
    public final Long LLJ;
    public final AbstractC884010Ym7 LLJI;
    public final int LLJIJIL;
    public final InterfaceC879500Yeq LLJILJIL;
    public final C886440Yq2 LLJILJILJ;
    public final MatchedFriendStruct LLJILLL;
    public final C788490UwR LLJJ;

    public final C886410Ypz copy(InterfaceC879010Ye3 interfaceC879010Ye3, C878900Yds c878900Yds, C879580Yey c879580Yey, long j, List<? extends UrlModel> list, List<String> list2, C881260Yhg c881260Yhg, C879630Yf3 c879630Yf3, Long l, AbstractC884010Ym7 abstractC884010Ym7, int i, InterfaceC879500Yeq interfaceC879500Yeq, C886440Yq2 c886440Yq2, MatchedFriendStruct matchedFriendStruct, C788490UwR c788490UwR) {
        return new C886410Ypz(interfaceC879010Ye3, c878900Yds, c879580Yey, j, list, list2, c881260Yhg, c879630Yf3, l, abstractC884010Ym7, i, interfaceC879500Yeq, c886440Yq2, matchedFriendStruct, c788490UwR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C886410Ypz)) {
            return false;
        }
        C886410Ypz c886410Ypz = (C886410Ypz) obj;
        return Intrinsics.LJFF(this.LL, c886410Ypz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c886410Ypz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c886410Ypz.LLILLL) && this.LLILZ == c886410Ypz.LLILZ && Intrinsics.LJFF(this.LLILZIL, c886410Ypz.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c886410Ypz.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c886410Ypz.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c886410Ypz.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c886410Ypz.LLJ) && Intrinsics.LJFF(this.LLJI, c886410Ypz.LLJI) && this.LLJIJIL == c886410Ypz.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c886410Ypz.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c886410Ypz.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c886410Ypz.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c886410Ypz.LLJJ);
    }

    public int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        List<UrlModel> list = this.LLILZIL;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        C881260Yhg c881260Yhg = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (c881260Yhg == null ? 0 : c881260Yhg.hashCode())) * 31;
        C879630Yf3 c879630Yf3 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (c879630Yf3 == null ? 0 : c879630Yf3.hashCode())) * 31;
        Long l = this.LLJ;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLJI;
        int iHashCode6 = (((iHashCode5 + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode())) * 31) + this.LLJIJIL) * 31;
        InterfaceC879500Yeq interfaceC879500Yeq = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (interfaceC879500Yeq == null ? 0 : interfaceC879500Yeq.hashCode())) * 31;
        C886440Yq2 c886440Yq2 = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (c886440Yq2 == null ? 0 : c886440Yq2.hashCode())) * 31;
        MatchedFriendStruct matchedFriendStruct = this.LLJILLL;
        int iHashCode9 = (iHashCode8 + (matchedFriendStruct == null ? 0 : matchedFriendStruct.hashCode())) * 31;
        C788490UwR c788490UwR = this.LLJJ;
        return iHashCode9 + (c788490UwR != null ? c788490UwR.hashCode() : 0);
    }

    public String toString() {
        return "MessageRequestChatListAggregationVO(pageKey=" + this.LL + ", type=" + this.LLILLJJLI + ", key=" + this.LLILLL + ", sortOrder=" + this.LLILZ + ", avatar=" + this.LLILZIL + ", conversations=" + this.LLILZLL + ", name=" + this.LLIZ + ", previewContent=" + this.LLIZLLLIL + ", timestamp=" + this.LLJ + ", unreadState=" + this.LLJI + ", priority=" + this.LLJIJIL + ", nameStartAreaContent=" + this.LLJILJIL + ", chatStatus=" + this.LLJILJILJ + ", relationLabel=" + this.LLJILLL + ", eventParam=" + this.LLJJ + ')';
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C886410Ypz copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
    }

    public final List<UrlModel> getAvatar() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC885530YoZ
    public C886440Yq2 getChatStatus() {
        return this.LLJILJILJ;
    }

    public final List<String> getConversations() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC885530YoZ
    public C788490UwR getEventParam() {
        return this.LLJJ;
    }

    @Override // X.AbstractC885530YoZ
    public C881260Yhg getName() {
        return this.LLIZ;
    }

    @Override // X.AbstractC885530YoZ
    public InterfaceC879500Yeq getNameStartAreaContent() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public InterfaceC879010Ye3 getPageKey() {
        return this.LL;
    }

    @Override // X.AbstractC885530YoZ
    public C879630Yf3 getPreviewContent() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC885530YoZ
    public int getPriority() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC885530YoZ
    public MatchedFriendStruct getRelationLabel() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public long getSortOrder() {
        return this.LLILZ;
    }

    @Override // X.AbstractC885530YoZ
    public Long getTimestamp() {
        return this.LLJ;
    }

    @Override // X.AbstractC885530YoZ
    public AbstractC884010Ym7 getUnreadState() {
        return this.LLJI;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C879580Yey getKey() {
        return this.LLILLL;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C878900Yds getType() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C886410Ypz(InterfaceC879010Ye3 interfaceC879010Ye3, C878900Yds c878900Yds, C879580Yey c879580Yey, long j, List<? extends UrlModel> list, List<String> list2, C881260Yhg c881260Yhg, C879630Yf3 c879630Yf3, Long l, AbstractC884010Ym7 abstractC884010Ym7, int i, InterfaceC879500Yeq interfaceC879500Yeq, C886440Yq2 c886440Yq2, MatchedFriendStruct matchedFriendStruct, C788490UwR c788490UwR) {
        this.LL = interfaceC879010Ye3;
        this.LLILLJJLI = c878900Yds;
        this.LLILLL = c879580Yey;
        this.LLILZ = j;
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = c881260Yhg;
        this.LLIZLLLIL = c879630Yf3;
        this.LLJ = l;
        this.LLJI = abstractC884010Ym7;
        this.LLJIJIL = i;
        this.LLJILJIL = interfaceC879500Yeq;
        this.LLJILJILJ = c886440Yq2;
        this.LLJILLL = matchedFriendStruct;
        this.LLJJ = c788490UwR;
    }
}
