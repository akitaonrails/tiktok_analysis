package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8R implements InterfaceC885810Yp1<C0Z8U> {
    public final InterfaceC879010Ye3 LL;
    public final InterfaceC1490905sZ<?> LLILLJJLI;
    public final InterfaceC1491305sd LLILLL;
    public final long LLILZ;
    public final AbstractC884010Ym7 LLILZIL;
    public final String LLILZLL;
    public CharSequence LLIZ;
    public C886430Yq1 LLIZLLLIL;
    public final String LLJ;
    public final C0I3B LLJI;
    public final SystemContent LLJIJIL;
    public final C886440Yq2 LLJILJIL;
    public final transient EnumC881770YiV LLJILJILJ;
    public final transient CharSequence LLJILLL;
    public final transient boolean LLJJ;
    public final transient InterfaceC894890Z8t LLJJI;
    public transient C0Z8A LLJJIII;
    public transient String LLJJIJI;
    public transient VORightOperationType LLJJIJIIJIL;
    public final transient CharSequence LLJJIJIL;
    public final transient boolean LLJJJ;
    public final C0Z8U LLJJJIL;

    public final C0Z8R copy(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1490905sZ<?> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, long j, AbstractC884010Ym7 abstractC884010Ym7, String str, CharSequence charSequence, C886430Yq1 c886430Yq1, String str2, C0I3B c0i3b, SystemContent systemContent, C886440Yq2 c886440Yq2, EnumC881770YiV enumC881770YiV, CharSequence charSequence2, boolean z, InterfaceC894890Z8t interfaceC894890Z8t, C0Z8A c0z8a, String str3, VORightOperationType vORightOperationType, CharSequence charSequence3, boolean z2, C0Z8U c0z8u) {
        return new C0Z8R(interfaceC879010Ye3, interfaceC1490905sZ, interfaceC1491305sd, j, abstractC884010Ym7, str, charSequence, c886430Yq1, str2, c0i3b, systemContent, c886440Yq2, enumC881770YiV, charSequence2, z, interfaceC894890Z8t, c0z8a, str3, vORightOperationType, charSequence3, z2, c0z8u);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8R)) {
            return false;
        }
        C0Z8R c0z8r = (C0Z8R) obj;
        return Intrinsics.LJFF(this.LL, c0z8r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0z8r.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0z8r.LLILLL) && this.LLILZ == c0z8r.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0z8r.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0z8r.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0z8r.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0z8r.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0z8r.LLJ) && Intrinsics.LJFF(this.LLJI, c0z8r.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0z8r.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0z8r.LLJILJIL) && this.LLJILJILJ == c0z8r.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c0z8r.LLJILLL) && this.LLJJ == c0z8r.LLJJ && Intrinsics.LJFF(this.LLJJI, c0z8r.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c0z8r.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c0z8r.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c0z8r.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c0z8r.LLJJIJIL) && this.LLJJJ == c0z8r.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c0z8r.LLJJJIL);
    }

    public int hashCode() {
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LL;
        int iHashCode = (((((((interfaceC879010Ye3 == null ? 0 : interfaceC879010Ye3.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLILZIL;
        int iHashCode2 = (((((iHashCode + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        C886430Yq1 c886430Yq1 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (c886430Yq1 == null ? 0 : c886430Yq1.hashCode())) * 31;
        String str = this.LLJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C0I3B c0i3b = this.LLJI;
        int iHashCode5 = (iHashCode4 + (c0i3b == null ? 0 : c0i3b.hashCode())) * 31;
        SystemContent systemContent = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (systemContent == null ? 0 : systemContent.hashCode())) * 31;
        C886440Yq2 c886440Yq2 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (c886440Yq2 == null ? 0 : c886440Yq2.hashCode())) * 31;
        EnumC881770YiV enumC881770YiV = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (enumC881770YiV == null ? 0 : enumC881770YiV.hashCode())) * 31;
        CharSequence charSequence = this.LLJILLL;
        int iHashCode9 = (((iHashCode8 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        InterfaceC894890Z8t interfaceC894890Z8t = this.LLJJI;
        int iHashCode10 = (iHashCode9 + (interfaceC894890Z8t == null ? 0 : interfaceC894890Z8t.hashCode())) * 31;
        C0Z8A c0z8a = this.LLJJIII;
        int iHashCode11 = (iHashCode10 + (c0z8a == null ? 0 : c0z8a.hashCode())) * 31;
        String str2 = this.LLJJIJI;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VORightOperationType vORightOperationType = this.LLJJIJIIJIL;
        int iHashCode13 = (iHashCode12 + (vORightOperationType == null ? 0 : vORightOperationType.hashCode())) * 31;
        CharSequence charSequence2 = this.LLJJIJIL;
        return ((((iHashCode13 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + this.LLJJJIL.hashCode();
    }

    public String toString() {
        return "BotChatChatListVO(pageKey=" + this.LL + ", type=" + this.LLILLJJLI + ", key=" + this.LLILLL + ", sortOrder=" + this.LLILZ + ", unreadViewState=" + this.LLILZIL + ", name=" + this.LLILZLL + ", content=" + ((Object) this.LLIZ) + ", avatar=" + this.LLIZLLLIL + ", sessionUpdateTime=" + this.LLJ + ", msgDraft=" + this.LLJI + ", systemContentOfLastMsg=" + this.LLJIJIL + ", chatStatus=" + this.LLJILJIL + ", readStatus=" + this.LLJILJILJ + ", readText=" + ((Object) this.LLJILLL) + ", showReadStatus=" + this.LLJJ + ", typingIndicatorInboxData=" + this.LLJJI + ", voContentType=" + this.LLJJIII + ", timestamp=" + this.LLJJIJI + ", rightOperationType=" + this.LLJJIJIIJIL + ", typingStatusText=" + ((Object) this.LLJJIJIL) + ", isShowingTypingStatus=" + this.LLJJJ + ", extra=" + this.LLJJJIL + ')';
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public C0Z8R copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL);
    }

    public final C886440Yq2 getChatStatus() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC885810Yp1
    public CharSequence getContent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC1491305sd getKey() {
        return this.LLILLL;
    }

    public final C0I3B getMsgDraft() {
        return this.LLJI;
    }

    @Override // X.InterfaceC885810Yp1
    public String getName() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC879010Ye3 getPageKey() {
        return this.LL;
    }

    public final EnumC881770YiV getReadStatus() {
        return this.LLJILJILJ;
    }

    public final CharSequence getReadText() {
        return this.LLJILLL;
    }

    public final VORightOperationType getRightOperationType() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC885810Yp1
    public String getSessionUpdateTime() {
        return this.LLJ;
    }

    public final boolean getShowReadStatus() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public long getSortOrder() {
        return this.LLILZ;
    }

    public final SystemContent getSystemContentOfLastMsg() {
        return this.LLJIJIL;
    }

    public final String getTimestamp() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC1490905sZ<?> getType() {
        return this.LLILLJJLI;
    }

    public final InterfaceC894890Z8t getTypingIndicatorInboxData() {
        return this.LLJJI;
    }

    public final CharSequence getTypingStatusText() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC885810Yp1
    public AbstractC884010Ym7 getUnreadViewState() {
        return this.LLILZIL;
    }

    public final C0Z8A getVoContentType() {
        return this.LLJJIII;
    }

    public final boolean isShowingTypingStatus() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC885810Yp1
    public C886430Yq1 getAvatar() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC885810Yp1
    public C0Z8U getExtra() {
        return this.LLJJJIL;
    }

    public void setAvatar(C886430Yq1 c886430Yq1) {
        this.LLIZLLLIL = c886430Yq1;
    }

    public void setContent(CharSequence charSequence) {
        this.LLIZ = charSequence;
    }

    public final void setRightOperationType(VORightOperationType vORightOperationType) {
        this.LLJJIJIIJIL = vORightOperationType;
    }

    public final void setTimestamp(String str) {
        this.LLJJIJI = str;
    }

    public final void setVoContentType(C0Z8A c0z8a) {
        this.LLJJIII = c0z8a;
    }

    public C0Z8R(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1490905sZ<?> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, long j, AbstractC884010Ym7 abstractC884010Ym7, String str, CharSequence charSequence, C886430Yq1 c886430Yq1, String str2, C0I3B c0i3b, SystemContent systemContent, C886440Yq2 c886440Yq2, EnumC881770YiV enumC881770YiV, CharSequence charSequence2, boolean z, InterfaceC894890Z8t interfaceC894890Z8t, C0Z8A c0z8a, String str3, VORightOperationType vORightOperationType, CharSequence charSequence3, boolean z2, C0Z8U c0z8u) {
        this.LL = interfaceC879010Ye3;
        this.LLILLJJLI = interfaceC1490905sZ;
        this.LLILLL = interfaceC1491305sd;
        this.LLILZ = j;
        this.LLILZIL = abstractC884010Ym7;
        this.LLILZLL = str;
        this.LLIZ = charSequence;
        this.LLIZLLLIL = c886430Yq1;
        this.LLJ = str2;
        this.LLJI = c0i3b;
        this.LLJIJIL = systemContent;
        this.LLJILJIL = c886440Yq2;
        this.LLJILJILJ = enumC881770YiV;
        this.LLJILLL = charSequence2;
        this.LLJJ = z;
        this.LLJJI = interfaceC894890Z8t;
        this.LLJJIII = c0z8a;
        this.LLJJIJI = str3;
        this.LLJJIJIIJIL = vORightOperationType;
        this.LLJJIJIL = charSequence3;
        this.LLJJJ = z2;
        this.LLJJJIL = c0z8u;
    }
}
