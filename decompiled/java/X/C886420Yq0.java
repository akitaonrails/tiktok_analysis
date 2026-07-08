package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886420Yq0 extends AbstractC885530YoZ {
    public static final int $stable = 8;
    public final InterfaceC879010Ye3 LL;
    public final C1709506mj LLILLJJLI;
    public final C878630YdR LLILLL;
    public final long LLILZ;
    public final int LLILZIL;
    public final UrlModel LLILZLL;
    public final InterfaceC879500Yeq LLIZ;
    public final C881260Yhg LLIZLLLIL;
    public final C886440Yq2 LLJ;
    public final C879630Yf3 LLJI;
    public final Long LLJIJIL;
    public final List<C880460YgO> LLJILJIL;
    public final AbstractC884010Ym7 LLJILJILJ;
    public final MatchedFriendStruct LLJILLL;
    public final C788490UwR LLJJ;
    public final C429270GsP LLJJI;

    public final C886420Yq0 copy(InterfaceC879010Ye3 interfaceC879010Ye3, C1709506mj c1709506mj, C878630YdR c878630YdR, long j, int i, UrlModel urlModel, InterfaceC879500Yeq interfaceC879500Yeq, C881260Yhg c881260Yhg, C886440Yq2 c886440Yq2, C879630Yf3 c879630Yf3, Long l, List<C880460YgO> list, AbstractC884010Ym7 abstractC884010Ym7, MatchedFriendStruct matchedFriendStruct, C788490UwR c788490UwR, C429270GsP c429270GsP) {
        return new C886420Yq0(interfaceC879010Ye3, c1709506mj, c878630YdR, j, i, urlModel, interfaceC879500Yeq, c881260Yhg, c886440Yq2, c879630Yf3, l, list, abstractC884010Ym7, matchedFriendStruct, c788490UwR, c429270GsP);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C886420Yq0)) {
            return false;
        }
        C886420Yq0 c886420Yq0 = (C886420Yq0) obj;
        return Intrinsics.LJFF(this.LL, c886420Yq0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c886420Yq0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c886420Yq0.LLILLL) && this.LLILZ == c886420Yq0.LLILZ && this.LLILZIL == c886420Yq0.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c886420Yq0.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c886420Yq0.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c886420Yq0.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c886420Yq0.LLJ) && Intrinsics.LJFF(this.LLJI, c886420Yq0.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c886420Yq0.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c886420Yq0.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c886420Yq0.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c886420Yq0.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c886420Yq0.LLJJ) && Intrinsics.LJFF(this.LLJJI, c886420Yq0.LLJJI);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + this.LLILZIL) * 31;
        UrlModel urlModel = this.LLILZLL;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        InterfaceC879500Yeq interfaceC879500Yeq = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (interfaceC879500Yeq == null ? 0 : interfaceC879500Yeq.hashCode())) * 31;
        C881260Yhg c881260Yhg = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (c881260Yhg == null ? 0 : c881260Yhg.hashCode())) * 31;
        C886440Yq2 c886440Yq2 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (c886440Yq2 == null ? 0 : c886440Yq2.hashCode())) * 31;
        C879630Yf3 c879630Yf3 = this.LLJI;
        int iHashCode6 = (iHashCode5 + (c879630Yf3 == null ? 0 : c879630Yf3.hashCode())) * 31;
        Long l = this.LLJIJIL;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        List<C880460YgO> list = this.LLJILJIL;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLJILJILJ;
        int iHashCode9 = (iHashCode8 + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode())) * 31;
        MatchedFriendStruct matchedFriendStruct = this.LLJILLL;
        int iHashCode10 = (iHashCode9 + (matchedFriendStruct == null ? 0 : matchedFriendStruct.hashCode())) * 31;
        C788490UwR c788490UwR = this.LLJJ;
        int iHashCode11 = (iHashCode10 + (c788490UwR == null ? 0 : c788490UwR.hashCode())) * 31;
        C429270GsP c429270GsP = this.LLJJI;
        return iHashCode11 + (c429270GsP != null ? c429270GsP.hashCode() : 0);
    }

    public String toString() {
        return "MessageRequestChatListSingleVO(pageKey=" + this.LL + ", type=" + this.LLILLJJLI + ", key=" + this.LLILLL + ", sortOrder=" + this.LLILZ + ", priority=" + this.LLILZIL + ", avatar=" + this.LLILZLL + ", nameStartAreaContent=" + this.LLIZ + ", name=" + this.LLIZLLLIL + ", chatStatus=" + this.LLJ + ", previewContent=" + this.LLJI + ", timestamp=" + this.LLJIJIL + ", chatLabels=" + this.LLJILJIL + ", unreadState=" + this.LLJILJILJ + ", relationLabel=" + this.LLJILLL + ", eventParam=" + this.LLJJ + ", activityStatusViewData=" + this.LLJJI + ')';
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C886420Yq0 copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI);
    }

    public final C429270GsP getActivityStatusViewData() {
        return this.LLJJI;
    }

    public final UrlModel getAvatar() {
        return this.LLILZLL;
    }

    public final List<C880460YgO> getChatLabels() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC885530YoZ
    public C886440Yq2 getChatStatus() {
        return this.LLJ;
    }

    @Override // X.AbstractC885530YoZ
    public C788490UwR getEventParam() {
        return this.LLJJ;
    }

    @Override // X.AbstractC885530YoZ
    public C881260Yhg getName() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC885530YoZ
    public InterfaceC879500Yeq getNameStartAreaContent() {
        return this.LLIZ;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public InterfaceC879010Ye3 getPageKey() {
        return this.LL;
    }

    @Override // X.AbstractC885530YoZ
    public C879630Yf3 getPreviewContent() {
        return this.LLJI;
    }

    @Override // X.AbstractC885530YoZ
    public int getPriority() {
        return this.LLILZIL;
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
        return this.LLJIJIL;
    }

    @Override // X.AbstractC885530YoZ
    public AbstractC884010Ym7 getUnreadState() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C878630YdR getKey() {
        return this.LLILLL;
    }

    @Override // X.AbstractC885530YoZ, X.InterfaceC884440Ymo
    public C1709506mj getType() {
        return this.LLILLJJLI;
    }

    public C886420Yq0(InterfaceC879010Ye3 interfaceC879010Ye3, C1709506mj c1709506mj, C878630YdR c878630YdR, long j, int i, UrlModel urlModel, InterfaceC879500Yeq interfaceC879500Yeq, C881260Yhg c881260Yhg, C886440Yq2 c886440Yq2, C879630Yf3 c879630Yf3, Long l, List<C880460YgO> list, AbstractC884010Ym7 abstractC884010Ym7, MatchedFriendStruct matchedFriendStruct, C788490UwR c788490UwR, C429270GsP c429270GsP) {
        this.LL = interfaceC879010Ye3;
        this.LLILLJJLI = c1709506mj;
        this.LLILLL = c878630YdR;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = urlModel;
        this.LLIZ = interfaceC879500Yeq;
        this.LLIZLLLIL = c881260Yhg;
        this.LLJ = c886440Yq2;
        this.LLJI = c879630Yf3;
        this.LLJIJIL = l;
        this.LLJILJIL = list;
        this.LLJILJILJ = abstractC884010Ym7;
        this.LLJILLL = matchedFriendStruct;
        this.LLJJ = c788490UwR;
        this.LLJJI = c429270GsP;
    }
}
