package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8S implements InterfaceC888420YtE {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final long LLIZ;
    public final int LLIZLLLIL;
    public final Integer LLJ;
    public final String LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public final long LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final transient C869590Y9l LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final transient List<String> LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final boolean LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final boolean LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;

    public final C0Z8S copy(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3, Integer num, String str2, int i4, boolean z4, long j2, boolean z5, boolean z6, C869590Y9l c869590Y9l, boolean z7, boolean z8, boolean z9, boolean z10, List<String> list, boolean z11, boolean z12, boolean z13, int i5, boolean z14, String str3, boolean z15, boolean z16) {
        return new C0Z8S(i, i2, str, z, z2, z3, j, i3, num, str2, i4, z4, j2, z5, z6, c869590Y9l, z7, z8, z9, z10, list, z11, z12, z13, i5, z14, str3, z15, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8S)) {
            return false;
        }
        C0Z8S c0z8s = (C0Z8S) obj;
        return this.LL == c0z8s.LL && this.LLILLJJLI == c0z8s.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0z8s.LLILLL) && this.LLILZ == c0z8s.LLILZ && this.LLILZIL == c0z8s.LLILZIL && this.LLILZLL == c0z8s.LLILZLL && this.LLIZ == c0z8s.LLIZ && this.LLIZLLLIL == c0z8s.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0z8s.LLJ) && Intrinsics.LJFF(this.LLJI, c0z8s.LLJI) && this.LLJIJIL == c0z8s.LLJIJIL && this.LLJILJIL == c0z8s.LLJILJIL && this.LLJILJILJ == c0z8s.LLJILJILJ && this.LLJILLL == c0z8s.LLJILLL && this.LLJJ == c0z8s.LLJJ && Intrinsics.LJFF(this.LLJJI, c0z8s.LLJJI) && this.LLJJIII == c0z8s.LLJJIII && this.LLJJIJI == c0z8s.LLJJIJI && this.LLJJIJIIJIL == c0z8s.LLJJIJIIJIL && this.LLJJIJIL == c0z8s.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c0z8s.LLJJJ) && this.LLJJJIL == c0z8s.LLJJJIL && this.LLJJJJ == c0z8s.LLJJJJ && this.LLJJJJJIL == c0z8s.LLJJJJJIL && this.LLJJJJLIIL == c0z8s.LLJJJJLIIL && this.LLJJL == c0z8s.LLJJL && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0z8s.LLJJLIIIJLLLLLLLZ) && this.LLJL == c0z8s.LLJL && this.LLJLIL == c0z8s.LLJLIL;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31;
        Integer num = this.LLJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLJI;
        int iHashCode3 = (((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJIJIL) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Y2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        C869590Y9l c869590Y9l = this.LLJJI;
        int iHashCode4 = (((((((((iHashCode3 + (c869590Y9l == null ? 0 : c869590Y9l.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31;
        List<String> list = this.LLJJJ;
        int iHashCode5 = (((((((((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31) + this.LLJJJJLIIL) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31;
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        return ((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31) + C786410Ut5.Z2(this.LLJLIL);
    }

    public String toString() {
        return "GroupChatChatListVOExtra(sessionType=" + this.LL + ", viewHolderType=" + this.LLILLJJLI + ", sessionId=" + this.LLILLL + ", isSupportMute=" + this.LLILZ + ", isMute=" + this.LLILZIL + ", isCheckEmoji=" + this.LLILZLL + ", conversationUpdatedAt=" + this.LLIZ + ", priority=" + this.LLIZLLLIL + ", category=" + this.LLJ + ", lastMessageScene=" + this.LLJI + ", lastMessageMsgType=" + this.LLJIJIL + ", isStickyTop=" + this.LLJILJIL + ", lastMsgCreatedAt=" + this.LLJILJILJ + ", isMediaMsgMasking=" + this.LLJILLL + ", isHighRiskConversation=" + this.LLJJ + ", lastMsg=" + this.LLJJI + ", lastMsgRecalled=" + this.LLJJIII + ", lastMsgSendBySelf=" + this.LLJJIJI + ", hasUnreadMention=" + this.LLJJIJIIJIL + ", isBanned=" + this.LLJJIJIL + ", memberIdList=" + this.LLJJJ + ", isValid=" + this.LLJJJIL + ", isMember=" + this.LLJJJJ + ", isOwner=" + this.LLJJJJJIL + ", memberCount=" + this.LLJJJJLIIL + ", isDissolvedGroup=" + this.LLJJL + ", contentType=" + this.LLJJLIIIJLLLLLLLZ + ", isPublicGroup=" + this.LLJL + ", isTempConv=" + this.LLJLIL + ')';
    }

    @Override // X.InterfaceC888420YtE
    public Integer getCategory() {
        return this.LLJ;
    }

    public final String getContentType() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public long getConversationUpdatedAt() {
        return this.LLIZ;
    }

    public final boolean getHasUnreadMention() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC888420YtE
    public int getLastMessageMsgType() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC888420YtE
    public String getLastMessageScene() {
        return this.LLJI;
    }

    @Override // X.InterfaceC888420YtE
    public C869590Y9l getLastMsg() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC888420YtE
    public long getLastMsgCreatedAt() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC888420YtE
    public boolean getLastMsgRecalled() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC888420YtE
    public boolean getLastMsgSendBySelf() {
        return this.LLJJIJI;
    }

    public final int getMemberCount() {
        return this.LLJJJJLIIL;
    }

    public final List<String> getMemberIdList() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public int getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public String getSessionId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public int getSessionType() {
        return this.LL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public int getViewHolderType() {
        return this.LLILLJJLI;
    }

    public final boolean isBanned() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isCheckEmoji() {
        return this.LLILZLL;
    }

    public final boolean isDissolvedGroup() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isHighRiskConversation() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isMediaMsgMasking() {
        return this.LLJILLL;
    }

    public final boolean isMember() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isMute() {
        return this.LLILZIL;
    }

    public final boolean isOwner() {
        return this.LLJJJJJIL;
    }

    public final boolean isPublicGroup() {
        return this.LLJL;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isStickyTop() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isSupportMute() {
        return this.LLILZ;
    }

    public final boolean isTempConv() {
        return this.LLJLIL;
    }

    public final boolean isValid() {
        return this.LLJJJIL;
    }

    public C0Z8S(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3, Integer num, String str2, int i4, boolean z4, long j2, boolean z5, boolean z6, C869590Y9l c869590Y9l, boolean z7, boolean z8, boolean z9, boolean z10, List<String> list, boolean z11, boolean z12, boolean z13, int i5, boolean z14, String str3, boolean z15, boolean z16) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = j;
        this.LLIZLLLIL = i3;
        this.LLJ = num;
        this.LLJI = str2;
        this.LLJIJIL = i4;
        this.LLJILJIL = z4;
        this.LLJILJILJ = j2;
        this.LLJILLL = z5;
        this.LLJJ = z6;
        this.LLJJI = c869590Y9l;
        this.LLJJIII = z7;
        this.LLJJIJI = z8;
        this.LLJJIJIIJIL = z9;
        this.LLJJIJIL = z10;
        this.LLJJJ = list;
        this.LLJJJIL = z11;
        this.LLJJJJ = z12;
        this.LLJJJJJIL = z13;
        this.LLJJJJLIIL = i5;
        this.LLJJL = z14;
        this.LLJJLIIIJLLLLLLLZ = str3;
        this.LLJL = z15;
        this.LLJLIL = z16;
    }
}
