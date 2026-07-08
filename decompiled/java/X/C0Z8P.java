package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8P implements C0Z86 {
    public static final int $stable = 8;
    public final C878950Ydx LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public transient CharSequence LLILZ;
    public transient boolean LLILZIL;
    public transient InterfaceC894890Z8t LLILZLL;
    public final IMUser LLIZ;
    public final transient EnumC881770YiV LLIZLLLIL;
    public transient CharSequence LLJ;
    public transient boolean LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public CharSequence LLJILJILJ;
    public String LLJILLL;
    public final boolean LLJJ;
    public Object LLJJI;
    public final AbstractC884010Ym7 LLJJIII;
    public final Integer LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final transient String LLJJJJJIL;
    public final int LLJJJJLIIL;
    public long LLJJL;
    public final long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C0I3B LLJLIL;
    public final C869590Y9l LLJLILLLLZIIL;
    public final String LLJLL;
    public final int LLJLLIL;
    public final Integer LLJLLL;
    public final SystemContent LLJZ;
    public transient C894790Z8j LLJZIJLIL;
    public transient C0Z72 LLL;
    public transient C0Z74 LLLF;
    public transient boolean LLLFF;
    public int LLLFFI;
    public final int LLLFZ = 108;
    public VOLightInteractionEntryConf LLLI;

    public final C0Z8P copy(C878950Ydx c878950Ydx, long j, boolean z, CharSequence charSequence, boolean z2, InterfaceC894890Z8t interfaceC894890Z8t, IMUser iMUser, EnumC881770YiV enumC881770YiV, CharSequence charSequence2, boolean z3, String str, String str2, CharSequence charSequence3, String str3, boolean z4, Object obj, AbstractC884010Ym7 abstractC884010Ym7, Integer num, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str4, int i, long j2, long j3, boolean z10, C0I3B c0i3b, C869590Y9l c869590Y9l, String str5, int i2, Integer num2, SystemContent systemContent, C894790Z8j c894790Z8j, C0Z72 c0z72, C0Z74 c0z74, boolean z11, int i3) {
        return new C0Z8P(c878950Ydx, j, z, charSequence, z2, interfaceC894890Z8t, iMUser, enumC881770YiV, charSequence2, z3, str, str2, charSequence3, str3, z4, obj, abstractC884010Ym7, num, z5, z6, z7, z8, z9, str4, i, j2, j3, z10, c0i3b, c869590Y9l, str5, i2, num2, systemContent, c894790Z8j, c0z72, c0z74, z11, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8P)) {
            return false;
        }
        C0Z8P c0z8p = (C0Z8P) obj;
        return Intrinsics.LJFF(this.LL, c0z8p.LL) && this.LLILLJJLI == c0z8p.LLILLJJLI && this.LLILLL == c0z8p.LLILLL && Intrinsics.LJFF(this.LLILZ, c0z8p.LLILZ) && this.LLILZIL == c0z8p.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0z8p.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0z8p.LLIZ) && this.LLIZLLLIL == c0z8p.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0z8p.LLJ) && this.LLJI == c0z8p.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0z8p.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0z8p.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0z8p.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0z8p.LLJILLL) && this.LLJJ == c0z8p.LLJJ && Intrinsics.LJFF(this.LLJJI, c0z8p.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c0z8p.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c0z8p.LLJJIJI) && this.LLJJIJIIJIL == c0z8p.LLJJIJIIJIL && this.LLJJIJIL == c0z8p.LLJJIJIL && this.LLJJJ == c0z8p.LLJJJ && this.LLJJJIL == c0z8p.LLJJJIL && this.LLJJJJ == c0z8p.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c0z8p.LLJJJJJIL) && this.LLJJJJLIIL == c0z8p.LLJJJJLIIL && this.LLJJL == c0z8p.LLJJL && this.LLJJLIIIJLLLLLLLZ == c0z8p.LLJJLIIIJLLLLLLLZ && this.LLJL == c0z8p.LLJL && Intrinsics.LJFF(this.LLJLIL, c0z8p.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c0z8p.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c0z8p.LLJLL) && this.LLJLLIL == c0z8p.LLJLLIL && Intrinsics.LJFF(this.LLJLLL, c0z8p.LLJLLL) && Intrinsics.LJFF(this.LLJZ, c0z8p.LLJZ) && Intrinsics.LJFF(this.LLJZIJLIL, c0z8p.LLJZIJLIL) && Intrinsics.LJFF(this.LLL, c0z8p.LLL) && Intrinsics.LJFF(this.LLLF, c0z8p.LLLF) && this.LLLFF == c0z8p.LLLFF && this.LLLFFI == c0z8p.LLLFFI;
    }

    @Override // X.C0Z86
    public C894700Z8a getActivityStatusTextWithType() {
        return null;
    }

    @Override // X.C0Z86
    public C429270GsP getActivityStatusViewData() {
        return null;
    }

    @Override // X.C0Z86
    public String getActivityText() {
        return null;
    }

    @Override // X.C0Z86
    public C887540Yro getChatListCameraStatus() {
        return null;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public int getSessionType() {
        return 0;
    }

    @Override // X.C0Z86
    public boolean getShowStarIcon() {
        return false;
    }

    public int hashCode() {
        C878950Ydx c878950Ydx = this.LL;
        int iHashCode = (((((c878950Ydx == null ? 0 : c878950Ydx.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        CharSequence charSequence = this.LLILZ;
        int iHashCode2 = (((((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31;
        IMUser iMUser = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (iMUser == null ? 0 : iMUser.hashCode())) * 31;
        EnumC881770YiV enumC881770YiV = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (enumC881770YiV == null ? 0 : enumC881770YiV.hashCode())) * 31;
        CharSequence charSequence2 = this.LLJ;
        int iHashCode5 = (((((((((iHashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
        String str = this.LLJILLL;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        Object obj = this.LLJJI;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLJJIII;
        int iHashCode8 = (iHashCode7 + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode())) * 31;
        Integer num = this.LLJJIJI;
        int iHashCode9 = (((((((((((iHashCode8 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        String str2 = this.LLJJJJJIL;
        int iHashCode10 = (((((((((iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJJJJLIIL) * 31) + C786410Ut5.Y2(this.LLJJL)) * 31) + C786410Ut5.Y2(this.LLJJLIIIJLLLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31;
        C0I3B c0i3b = this.LLJLIL;
        int iHashCode11 = (iHashCode10 + (c0i3b == null ? 0 : c0i3b.hashCode())) * 31;
        C869590Y9l c869590Y9l = this.LLJLILLLLZIIL;
        int iHashCode12 = (iHashCode11 + (c869590Y9l == null ? 0 : c869590Y9l.hashCode())) * 31;
        String str3 = this.LLJLL;
        int iHashCode13 = (((iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJLLIL) * 31;
        Integer num2 = this.LLJLLL;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SystemContent systemContent = this.LLJZ;
        int iHashCode15 = (iHashCode14 + (systemContent == null ? 0 : systemContent.hashCode())) * 31;
        C894790Z8j c894790Z8j = this.LLJZIJLIL;
        int iHashCode16 = (iHashCode15 + (c894790Z8j == null ? 0 : c894790Z8j.hashCode())) * 31;
        C0Z72 c0z72 = this.LLL;
        int iHashCode17 = (iHashCode16 + (c0z72 == null ? 0 : c0z72.hashCode())) * 31;
        C0Z74 c0z74 = this.LLLF;
        return ((((iHashCode17 + (c0z74 != null ? c0z74.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLLFF)) * 31) + this.LLLFFI;
    }

    public String toString() {
        return "BotChatSessionVOWrapper(pageKey=" + this.LL + ", lastMsgCreatedAt=" + this.LLILLJJLI + ", lastMsgSendBySelf=" + this.LLILLL + ", typingStatusText=" + ((Object) this.LLILZ) + ", isShowingTypingStatus=" + this.LLILZIL + ", typingIndicatorInboxData=" + this.LLILZLL + ", imUser=" + this.LLIZ + ", readStatus=" + this.LLIZLLLIL + ", readText=" + ((Object) this.LLJ) + ", showReadStatus=" + this.LLJI + ", sessionId=" + this.LLJIJIL + ", name=" + this.LLJILJIL + ", content=" + ((Object) this.LLJILJILJ) + ", previewContentType=" + this.LLJILLL + ", lastMsgRecalled=" + this.LLJJ + ", avatar=" + this.LLJJI + ", sessionUnreadViewState=" + this.LLJJIII + ", unreadCountForContentPrefix=" + this.LLJJIJI + ", isBlock=" + this.LLJJIJIIJIL + ", isBlocked=" + this.LLJJIJIL + ", isSupportMute=" + this.LLJJJ + ", isMute=" + this.LLJJJIL + ", isCheckEmoji=" + this.LLJJJJ + ", sessionUpdateTime=" + this.LLJJJJJIL + ", priority=" + this.LLJJJJLIIL + ", sortOrder=" + this.LLJJL + ", conversationUpdatedAt=" + this.LLJJLIIIJLLLLLLLZ + ", isSnapshot=" + this.LLJL + ", msgDraft=" + this.LLJLIL + ", lastMsg=" + this.LLJLILLLLZIIL + ", lastMessageScene=" + this.LLJLL + ", lastMessageMsgType=" + this.LLJLLIL + ", category=" + this.LLJLLL + ", systemContentOfLastMsg=" + this.LLJZ + ", leftViewVO=" + this.LLJZIJLIL + ", middleViewVO=" + this.LLL + ", rightViewVO=" + this.LLLF + ", isNotSupportSelectable=" + this.LLLFF + ", chatType=" + this.LLLFFI + ')';
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public C0Z8P copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, this.LLJLLL, this.LLJZ, this.LLJZIJLIL, this.LLL, this.LLLF, this.LLLFF, this.LLLFFI);
    }

    public final String getUid() {
        String uid;
        IMUser iMUser = this.LLIZ;
        return (iMUser == null || (uid = iMUser.getUid()) == null) ? String.valueOf(C0YNP.LJII(getSessionId())) : uid;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public boolean getHasUnreadMsg() {
        return C880320YgA.LIZ(getSessionUnreadViewState());
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public Object getAvatar() {
        return this.LLJJI;
    }

    @Override // X.C0Z86
    public Integer getCategory() {
        return this.LLJLLL;
    }

    public final int getChatType() {
        return this.LLLFFI;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public CharSequence getContent() {
        return this.LLJILJILJ;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public long getConversationUpdatedAt() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final IMUser getImUser() {
        return this.LLIZ;
    }

    @Override // X.C0Z86
    public int getLastMessageMsgType() {
        return this.LLJLLIL;
    }

    @Override // X.C0Z86
    public String getLastMessageScene() {
        return this.LLJLL;
    }

    @Override // X.C0Z86
    public C869590Y9l getLastMsg() {
        return this.LLJLILLLLZIIL;
    }

    public final long getLastMsgCreatedAt() {
        return this.LLILLJJLI;
    }

    public final boolean getLastMsgRecalled() {
        return this.LLJJ;
    }

    public final boolean getLastMsgSendBySelf() {
        return this.LLILLL;
    }

    @Override // X.C0Z86
    public C894790Z8j getLeftViewVO() {
        return this.LLJZIJLIL;
    }

    @Override // X.C0Z86
    public VOLightInteractionEntryConf getLightInteractionEntryConf() {
        return this.LLLI;
    }

    @Override // X.C0Z86
    public C0Z72 getMiddleViewVO() {
        return this.LLL;
    }

    @Override // X.C0Z86
    public C0I3B getMsgDraft() {
        return this.LLJLIL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public String getName() {
        return this.LLJILJIL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public String getPreviewContentType() {
        return this.LLJILLL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public int getPriority() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0Z86
    public EnumC881770YiV getReadStatus() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0Z86
    public CharSequence getReadText() {
        return this.LLJ;
    }

    @Override // X.C0Z86
    public C0Z74 getRightViewVO() {
        return this.LLLF;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public String getSessionId() {
        return this.LLJIJIL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public AbstractC884010Ym7 getSessionUnreadViewState() {
        return this.LLJJIII;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public String getSessionUpdateTime() {
        return this.LLJJJJJIL;
    }

    @Override // X.C0Z86
    public boolean getShowReadStatus() {
        return this.LLJI;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public long getSortOrder() {
        return this.LLJJL;
    }

    @Override // X.C0Z86
    public SystemContent getSystemContentOfLastMsg() {
        return this.LLJZ;
    }

    public final InterfaceC894890Z8t getTypingIndicatorInboxData() {
        return this.LLILZLL;
    }

    public final CharSequence getTypingStatusText() {
        return this.LLILZ;
    }

    public final Integer getUnreadCountForContentPrefix() {
        return this.LLJJIJI;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public int getViewHolderType() {
        return this.LLLFZ;
    }

    public final boolean isBlock() {
        return this.LLJJIJIIJIL;
    }

    public final boolean isBlocked() {
        return this.LLJJIJIL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public boolean isCheckEmoji() {
        return this.LLJJJJ;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public boolean isMute() {
        return this.LLJJJIL;
    }

    public final boolean isNotSupportSelectable() {
        return this.LLLFF;
    }

    public final boolean isShowingTypingStatus() {
        return this.LLILZIL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public boolean isSnapshot() {
        return this.LLJL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public boolean isSupportMute() {
        return this.LLJJJ;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public C878950Ydx getPageKey() {
        return this.LL;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public void setAvatar(Object obj) {
        this.LLJJI = obj;
    }

    public final void setChatType(int i) {
        this.LLLFFI = i;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public void setContent(CharSequence charSequence) {
        this.LLJILJILJ = charSequence;
    }

    @Override // X.C0Z86
    public void setLeftViewVO(C894790Z8j c894790Z8j) {
        this.LLJZIJLIL = c894790Z8j;
    }

    @Override // X.C0Z86
    public void setLightInteractionEntryConf(VOLightInteractionEntryConf vOLightInteractionEntryConf) {
        this.LLLI = vOLightInteractionEntryConf;
    }

    @Override // X.C0Z86
    public void setMiddleViewVO(C0Z72 c0z72) {
        this.LLL = c0z72;
    }

    public final void setNotSupportSelectable(boolean z) {
        this.LLLFF = z;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public void setPreviewContentType(String str) {
        this.LLJILLL = str;
    }

    @Override // X.C0Z86
    public void setReadText(CharSequence charSequence) {
        this.LLJ = charSequence;
    }

    @Override // X.C0Z86
    public void setRightViewVO(C0Z74 c0z74) {
        this.LLLF = c0z74;
    }

    @Override // X.C0Z86
    public void setShowReadStatus(boolean z) {
        this.LLJI = z;
    }

    public final void setShowingTypingStatus(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public void setSnapshot(boolean z) {
        this.LLJL = z;
    }

    @Override // X.C0Z86, X.InterfaceC888500YtM
    public void setSortOrder(long j) {
        this.LLJJL = j;
    }

    public final void setTypingIndicatorInboxData(InterfaceC894890Z8t interfaceC894890Z8t) {
        this.LLILZLL = interfaceC894890Z8t;
    }

    public final void setTypingStatusText(CharSequence charSequence) {
        this.LLILZ = charSequence;
    }

    public C0Z8P(C878950Ydx c878950Ydx, long j, boolean z, CharSequence charSequence, boolean z2, InterfaceC894890Z8t interfaceC894890Z8t, IMUser iMUser, EnumC881770YiV enumC881770YiV, CharSequence charSequence2, boolean z3, String str, String str2, CharSequence charSequence3, String str3, boolean z4, Object obj, AbstractC884010Ym7 abstractC884010Ym7, Integer num, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str4, int i, long j2, long j3, boolean z10, C0I3B c0i3b, C869590Y9l c869590Y9l, String str5, int i2, Integer num2, SystemContent systemContent, C894790Z8j c894790Z8j, C0Z72 c0z72, C0Z74 c0z74, boolean z11, int i3) {
        this.LL = c878950Ydx;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = charSequence;
        this.LLILZIL = z2;
        this.LLILZLL = interfaceC894890Z8t;
        this.LLIZ = iMUser;
        this.LLIZLLLIL = enumC881770YiV;
        this.LLJ = charSequence2;
        this.LLJI = z3;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = charSequence3;
        this.LLJILLL = str3;
        this.LLJJ = z4;
        this.LLJJI = obj;
        this.LLJJIII = abstractC884010Ym7;
        this.LLJJIJI = num;
        this.LLJJIJIIJIL = z5;
        this.LLJJIJIL = z6;
        this.LLJJJ = z7;
        this.LLJJJIL = z8;
        this.LLJJJJ = z9;
        this.LLJJJJJIL = str4;
        this.LLJJJJLIIL = i;
        this.LLJJL = j2;
        this.LLJJLIIIJLLLLLLLZ = j3;
        this.LLJL = z10;
        this.LLJLIL = c0i3b;
        this.LLJLILLLLZIIL = c869590Y9l;
        this.LLJLL = str5;
        this.LLJLLIL = i2;
        this.LLJLLL = num2;
        this.LLJZ = systemContent;
        this.LLJZIJLIL = c894790Z8j;
        this.LLL = c0z72;
        this.LLLF = c0z74;
        this.LLLFF = z11;
        this.LLLFFI = i3;
    }
}
