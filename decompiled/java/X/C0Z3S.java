package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z3S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3S implements InterfaceC888500YtM {
    public static final int $stable = 8;
    public final C878950Ydx LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public CharSequence LLILZIL;
    public String LLILZLL;
    public Object LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final transient String LLJIJIL;
    public final int LLJILJIL;
    public long LLJILJILJ;
    public final long LLJILLL;
    public final AbstractC884010Ym7 LLJJ;
    public boolean LLJJI;
    public final int LLJJIII = 2;
    public final int LLJJIJI = 107;

    public final C0Z3S copy(C878950Ydx c878950Ydx, boolean z, String str, String str2, CharSequence charSequence, String str3, Object obj, boolean z2, boolean z3, boolean z4, String str4, int i, long j, long j2, AbstractC884010Ym7 abstractC884010Ym7, boolean z5) {
        return new C0Z3S(c878950Ydx, z, str, str2, charSequence, str3, obj, z2, z3, z4, str4, i, j, j2, abstractC884010Ym7, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z3S)) {
            return false;
        }
        C0Z3S c0z3s = (C0Z3S) obj;
        return Intrinsics.LJFF(this.LL, c0z3s.LL) && this.LLILLJJLI == c0z3s.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0z3s.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0z3s.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0z3s.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0z3s.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0z3s.LLIZ) && this.LLIZLLLIL == c0z3s.LLIZLLLIL && this.LLJ == c0z3s.LLJ && this.LLJI == c0z3s.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0z3s.LLJIJIL) && this.LLJILJIL == c0z3s.LLJILJIL && this.LLJILJILJ == c0z3s.LLJILJILJ && this.LLJILLL == c0z3s.LLJILLL && Intrinsics.LJFF(this.LLJJ, c0z3s.LLJJ) && this.LLJJI == c0z3s.LLJJI;
    }

    public int hashCode() {
        C878950Ydx c878950Ydx = this.LL;
        int iHashCode = (((((((((c878950Ydx == null ? 0 : c878950Ydx.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.LLIZ;
        int iHashCode3 = (((((((iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        String str2 = this.LLJIJIL;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Y2(this.LLJILJILJ)) * 31) + C786410Ut5.Y2(this.LLJILLL)) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLJJ;
        return ((iHashCode4 + (abstractC884010Ym7 != null ? abstractC884010Ym7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJI);
    }

    public String toString() {
        return "MessageRequestCellVO(pageKey=" + this.LL + ", showRightArrow=" + this.LLILLJJLI + ", sessionId=" + this.LLILLL + ", name=" + this.LLILZ + ", content=" + ((Object) this.LLILZIL) + ", previewContentType=" + this.LLILZLL + ", avatar=" + this.LLIZ + ", isSupportMute=" + this.LLIZLLLIL + ", isMute=" + this.LLJ + ", isCheckEmoji=" + this.LLJI + ", sessionUpdateTime=" + this.LLJIJIL + ", priority=" + this.LLJILJIL + ", sortOrder=" + this.LLJILJILJ + ", conversationUpdatedAt=" + this.LLJILLL + ", sessionUnreadViewState=" + this.LLJJ + ", isSnapshot=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC888500YtM
    public C0Z3S copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI);
    }

    @Override // X.InterfaceC888500YtM
    public boolean getHasUnreadMsg() {
        return C880320YgA.LIZ(getSessionUnreadViewState());
    }

    @Override // X.InterfaceC888500YtM
    public Object getAvatar() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC888500YtM
    public CharSequence getContent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC888500YtM
    public long getConversationUpdatedAt() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC888500YtM
    public String getName() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC888500YtM
    public String getPreviewContentType() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC888500YtM
    public int getPriority() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC888500YtM
    public String getSessionId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC888500YtM
    public int getSessionType() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC888500YtM
    public AbstractC884010Ym7 getSessionUnreadViewState() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC888500YtM
    public String getSessionUpdateTime() {
        return this.LLJIJIL;
    }

    public final boolean getShowRightArrow() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC888500YtM
    public long getSortOrder() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC888500YtM
    public int getViewHolderType() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC888500YtM
    public boolean isCheckEmoji() {
        return this.LLJI;
    }

    @Override // X.InterfaceC888500YtM
    public boolean isMute() {
        return this.LLJ;
    }

    @Override // X.InterfaceC888500YtM
    public boolean isSnapshot() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC888500YtM
    public boolean isSupportMute() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC888500YtM
    public C878950Ydx getPageKey() {
        return this.LL;
    }

    @Override // X.InterfaceC888500YtM
    public void setAvatar(Object obj) {
        this.LLIZ = obj;
    }

    @Override // X.InterfaceC888500YtM
    public void setContent(CharSequence charSequence) {
        this.LLILZIL = charSequence;
    }

    @Override // X.InterfaceC888500YtM
    public void setPreviewContentType(String str) {
        this.LLILZLL = str;
    }

    @Override // X.InterfaceC888500YtM
    public void setSnapshot(boolean z) {
        this.LLJJI = z;
    }

    @Override // X.InterfaceC888500YtM
    public void setSortOrder(long j) {
        this.LLJILJILJ = j;
    }

    public C0Z3S(C878950Ydx c878950Ydx, boolean z, String str, String str2, CharSequence charSequence, String str3, Object obj, boolean z2, boolean z3, boolean z4, String str4, int i, long j, long j2, AbstractC884010Ym7 abstractC884010Ym7, boolean z5) {
        this.LL = c878950Ydx;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = charSequence;
        this.LLILZLL = str3;
        this.LLIZ = obj;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = str4;
        this.LLJILJIL = i;
        this.LLJILJILJ = j;
        this.LLJILLL = j2;
        this.LLJJ = abstractC884010Ym7;
        this.LLJJI = z5;
    }
}
