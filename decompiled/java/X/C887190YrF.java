package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887190YrF implements InterfaceC885810Yp1<C0Z3U> {
    public final InterfaceC879010Ye3 LL;
    public final InterfaceC1490905sZ<?> LLILLJJLI;
    public final InterfaceC1491305sd LLILLL;
    public final long LLILZ;
    public final AbstractC884010Ym7 LLILZIL;
    public final String LLILZLL;
    public final CharSequence LLIZ;
    public final C882220YjE LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final C0Z3U LLJIJIL;

    public final C887190YrF copy(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1490905sZ<?> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, long j, AbstractC884010Ym7 abstractC884010Ym7, String str, CharSequence charSequence, C882220YjE c882220YjE, String str2, boolean z, C0Z3U c0z3u) {
        return new C887190YrF(interfaceC879010Ye3, interfaceC1490905sZ, interfaceC1491305sd, j, abstractC884010Ym7, str, charSequence, c882220YjE, str2, z, c0z3u);
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public C887190YrF copyData() {
        return copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887190YrF)) {
            return false;
        }
        C887190YrF c887190YrF = (C887190YrF) obj;
        return Intrinsics.LJFF(this.LL, c887190YrF.LL) && Intrinsics.LJFF(this.LLILLJJLI, c887190YrF.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c887190YrF.LLILLL) && this.LLILZ == c887190YrF.LLILZ && Intrinsics.LJFF(this.LLILZIL, c887190YrF.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c887190YrF.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c887190YrF.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c887190YrF.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c887190YrF.LLJ) && this.LLJI == c887190YrF.LLJI && Intrinsics.LJFF(this.LLJIJIL, c887190YrF.LLJIJIL);
    }

    public int hashCode() {
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LL;
        int iHashCode = (((((((interfaceC879010Ye3 == null ? 0 : interfaceC879010Ye3.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        AbstractC884010Ym7 abstractC884010Ym7 = this.LLILZIL;
        int iHashCode2 = (((((iHashCode + (abstractC884010Ym7 == null ? 0 : abstractC884010Ym7.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        C882220YjE c882220YjE = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (c882220YjE == null ? 0 : c882220YjE.hashCode())) * 31;
        String str = this.LLJ;
        return ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode();
    }

    public String toString() {
        return "MessageRequestEntranceChatListVO(pageKey=" + this.LL + ", type=" + this.LLILLJJLI + ", key=" + this.LLILLL + ", sortOrder=" + this.LLILZ + ", unreadViewState=" + this.LLILZIL + ", name=" + this.LLILZLL + ", content=" + ((Object) this.LLIZ) + ", avatar=" + this.LLIZLLLIL + ", sessionUpdateTime=" + this.LLJ + ", showRightArrow=" + this.LLJI + ", extra=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC885810Yp1
    public CharSequence getContent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC1491305sd getKey() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC885810Yp1
    public String getName() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC879010Ye3 getPageKey() {
        return this.LL;
    }

    @Override // X.InterfaceC885810Yp1
    public String getSessionUpdateTime() {
        return this.LLJ;
    }

    public final boolean getShowRightArrow() {
        return this.LLJI;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public long getSortOrder() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    public InterfaceC1490905sZ<?> getType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC885810Yp1
    public AbstractC884010Ym7 getUnreadViewState() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC885810Yp1
    public C882220YjE getAvatar() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC885810Yp1
    public C0Z3U getExtra() {
        return this.LLJIJIL;
    }

    public C887190YrF(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1490905sZ<?> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, long j, AbstractC884010Ym7 abstractC884010Ym7, String str, CharSequence charSequence, C882220YjE c882220YjE, String str2, boolean z, C0Z3U c0z3u) {
        this.LL = interfaceC879010Ye3;
        this.LLILLJJLI = interfaceC1490905sZ;
        this.LLILLL = interfaceC1491305sd;
        this.LLILZ = j;
        this.LLILZIL = abstractC884010Ym7;
        this.LLILZLL = str;
        this.LLIZ = charSequence;
        this.LLIZLLLIL = c882220YjE;
        this.LLJ = str2;
        this.LLJI = z;
        this.LLJIJIL = c0z3u;
    }
}
