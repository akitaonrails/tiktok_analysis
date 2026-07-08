package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8T implements InterfaceC888420YtE {
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
    public final IMUser LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final int LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final Integer LLJJL;

    public final C0Z8T copy(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3, Integer num, String str2, int i4, boolean z4, long j2, boolean z5, boolean z6, C869590Y9l c869590Y9l, boolean z7, boolean z8, IMUser iMUser, boolean z9, boolean z10, boolean z11, boolean z12, int i5, String str3, Integer num2) {
        return new C0Z8T(i, i2, str, z, z2, z3, j, i3, num, str2, i4, z4, j2, z5, z6, c869590Y9l, z7, z8, iMUser, z9, z10, z11, z12, i5, str3, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8T)) {
            return false;
        }
        C0Z8T c0z8t = (C0Z8T) obj;
        return this.LL == c0z8t.LL && this.LLILLJJLI == c0z8t.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0z8t.LLILLL) && this.LLILZ == c0z8t.LLILZ && this.LLILZIL == c0z8t.LLILZIL && this.LLILZLL == c0z8t.LLILZLL && this.LLIZ == c0z8t.LLIZ && this.LLIZLLLIL == c0z8t.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0z8t.LLJ) && Intrinsics.LJFF(this.LLJI, c0z8t.LLJI) && this.LLJIJIL == c0z8t.LLJIJIL && this.LLJILJIL == c0z8t.LLJILJIL && this.LLJILJILJ == c0z8t.LLJILJILJ && this.LLJILLL == c0z8t.LLJILLL && this.LLJJ == c0z8t.LLJJ && Intrinsics.LJFF(this.LLJJI, c0z8t.LLJJI) && this.LLJJIII == c0z8t.LLJJIII && this.LLJJIJI == c0z8t.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c0z8t.LLJJIJIIJIL) && this.LLJJIJIL == c0z8t.LLJJIJIL && this.LLJJJ == c0z8t.LLJJJ && this.LLJJJIL == c0z8t.LLJJJIL && this.LLJJJJ == c0z8t.LLJJJJ && this.LLJJJJJIL == c0z8t.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c0z8t.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c0z8t.LLJJL);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31;
        Integer num = this.LLJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLJI;
        int iHashCode3 = (((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJIJIL) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Y2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        C869590Y9l c869590Y9l = this.LLJJI;
        int iHashCode4 = (((((iHashCode3 + (c869590Y9l == null ? 0 : c869590Y9l.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31;
        IMUser iMUser = this.LLJJIJIIJIL;
        int iHashCode5 = (((((((((((iHashCode4 + (iMUser == null ? 0 : iMUser.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31) + this.LLJJJJJIL) * 31;
        String str2 = this.LLJJJJLIIL;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LLJJL;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SingleChatChatListVOExtra(sessionType=" + this.LL + ", viewHolderType=" + this.LLILLJJLI + ", sessionId=" + this.LLILLL + ", isSupportMute=" + this.LLILZ + ", isMute=" + this.LLILZIL + ", isCheckEmoji=" + this.LLILZLL + ", conversationUpdatedAt=" + this.LLIZ + ", priority=" + this.LLIZLLLIL + ", category=" + this.LLJ + ", lastMessageScene=" + this.LLJI + ", lastMessageMsgType=" + this.LLJIJIL + ", isStickyTop=" + this.LLJILJIL + ", lastMsgCreatedAt=" + this.LLJILJILJ + ", isMediaMsgMasking=" + this.LLJILLL + ", isHighRiskConversation=" + this.LLJJ + ", lastMsg=" + this.LLJJI + ", lastMsgRecalled=" + this.LLJJIII + ", lastMsgSendBySelf=" + this.LLJJIJI + ", imUser=" + this.LLJJIJIIJIL + ", isTCM=" + this.LLJJIJIL + ", isBlock=" + this.LLJJJ + ", isBlocked=" + this.LLJJJIL + ", isAuthorSupportChat=" + this.LLJJJJ + ", chatType=" + this.LLJJJJJIL + ", contentType=" + this.LLJJJJLIIL + ", unreadCountForContentPrefix=" + this.LLJJL + ')';
    }

    @Override // X.InterfaceC888420YtE
    public Integer getCategory() {
        return this.LLJ;
    }

    public final int getChatType() {
        return this.LLJJJJJIL;
    }

    public final String getContentType() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public long getConversationUpdatedAt() {
        return this.LLIZ;
    }

    public final IMUser getImUser() {
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

    public final Integer getUnreadCountForContentPrefix() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public int getViewHolderType() {
        return this.LLILLJJLI;
    }

    public final boolean isAuthorSupportChat() {
        return this.LLJJJJ;
    }

    public final boolean isBlock() {
        return this.LLJJJ;
    }

    public final boolean isBlocked() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isCheckEmoji() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isHighRiskConversation() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isMediaMsgMasking() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isMute() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC888420YtE
    public boolean isStickyTop() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC888420YtE, X.InterfaceC888430YtF
    public boolean isSupportMute() {
        return this.LLILZ;
    }

    public final boolean isTCM() {
        return this.LLJJIJIL;
    }

    public C0Z8T(int i, int i2, String str, boolean z, boolean z2, boolean z3, long j, int i3, Integer num, String str2, int i4, boolean z4, long j2, boolean z5, boolean z6, C869590Y9l c869590Y9l, boolean z7, boolean z8, IMUser iMUser, boolean z9, boolean z10, boolean z11, boolean z12, int i5, String str3, Integer num2) {
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
        this.LLJJIJIIJIL = iMUser;
        this.LLJJIJIL = z9;
        this.LLJJJ = z10;
        this.LLJJJIL = z11;
        this.LLJJJJ = z12;
        this.LLJJJJJIL = i5;
        this.LLJJJJLIIL = str3;
        this.LLJJL = num2;
    }
}
