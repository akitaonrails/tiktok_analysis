package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834130xpT implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final long LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834130xpT)) {
            return false;
        }
        C1834130xpT c1834130xpT = (C1834130xpT) obj;
        return Intrinsics.LJFF(this.LL, c1834130xpT.LL) && this.LLILLJJLI == c1834130xpT.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1834130xpT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1834130xpT.LLILZ) && this.LLILZIL == c1834130xpT.LLILZIL && this.LLILZLL == c1834130xpT.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1834130xpT.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1834130xpT.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1834130xpT.LLJ) && this.LLJI == c1834130xpT.LLJI && this.LLJIJIL == c1834130xpT.LLJIJIL && this.LLJILJIL == c1834130xpT.LLJILJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL);
    }

    public final String toString() {
        return "FragmentCoverItem(coverUrl=" + this.LL + ", isPosted=" + this.LLILLJJLI + ", icon=" + this.LLILLL + ", desc=" + this.LLILZ + ", videoStatus=" + this.LLILZIL + ", fragmentId=" + this.LLILZLL + ", replayRoomId=" + this.LLIZ + ", replayTitle=" + this.LLIZLLLIL + ", ownerUserId=" + this.LLJ + ", supportBbDownload=" + this.LLJI + ", isBBFans=" + this.LLJIJIL + ", isFromCampaign=" + this.LLJILJIL + ')';
    }

    public C1834130xpT() {
        this("", false, "", "", 0, 0L, "", "", "", false, true, false);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834130xpT c1834130xpT;
        String str = null;
        if (interfaceC1891350zJl instanceof C1834130xpT) {
            c1834130xpT = (C1834130xpT) interfaceC1891350zJl;
        } else {
            c1834130xpT = null;
        }
        String str2 = this.LL;
        if (c1834130xpT != null) {
            str = c1834130xpT.LL;
        }
        if (Intrinsics.LJFF(str2, str) && this.LLILLJJLI == c1834130xpT.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1834130xpT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1834130xpT.LLILZ) && this.LLILZIL == c1834130xpT.LLILZIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834130xpT c1834130xpT;
        if (interfaceC1891350zJl instanceof C1834130xpT) {
            c1834130xpT = (C1834130xpT) interfaceC1891350zJl;
        } else {
            c1834130xpT = null;
        }
        if (c1834130xpT == null || this.LLILZLL != c1834130xpT.LLILZLL) {
            return false;
        }
        return true;
    }

    public C1834130xpT(String str, boolean z, String str2, String str3, int i, long j, String str4, String str5, String str6, boolean z2, boolean z3, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = j;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = z4;
    }
}
