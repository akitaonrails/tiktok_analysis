package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.AiClipWidget;

/* JADX INFO: renamed from: X.0xro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835580xro implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final AiClipWidget LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1835580xro)) {
            return false;
        }
        C1835580xro c1835580xro = (C1835580xro) obj;
        return this.LL == c1835580xro.LL && Intrinsics.LJFF(this.LLILLJJLI, c1835580xro.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1835580xro.LLILLL) && this.LLILZ == c1835580xro.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1835580xro.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1835580xro.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1835580xro.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1835580xro.LLIZLLLIL) && this.LLJ == c1835580xro.LLJ && this.LLJI == c1835580xro.LLJI && this.LLJIJIL == c1835580xro.LLJIJIL && this.LLJILJIL == c1835580xro.LLJILJIL && this.LLJILJILJ == c1835580xro.LLJILJILJ && this.LLJILLL == c1835580xro.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1835580xro.LLJJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        AiClipWidget aiClipWidget = this.LLILZLL;
        return ((((((((((((((((((iHashCode + (aiClipWidget != null ? aiClipWidget.hashCode() : 0)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + this.LLJJ.hashCode();
    }

    public final String toString() {
        return "HighLightItem(fragmentId=" + this.LL + ", downloadUrl=" + this.LLILLJJLI + ", coverUrl=" + this.LLILLL + ", createTime=" + this.LLILZ + ", title=" + this.LLILZIL + ", aiClipWidget=" + this.LLILZLL + ", roomId=" + this.LLIZ + ", anchorId=" + this.LLIZLLLIL + ", fragmentType=" + this.LLJ + ", videoStatus=" + this.LLJI + ", videoWidth=" + this.LLJIJIL + ", videoHeight=" + this.LLJILJIL + ", supportBbDownload=" + this.LLJILJILJ + ", isBBFans=" + this.LLJILLL + ", userType=" + this.LLJJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1835580xro(long j, String str, String str2, long j2, String str3, AiClipWidget aiClipWidget, String str4, String str5, int i, int i2, int i3, int i4, boolean z, boolean z2, String str6) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j2;
        this.LLILZIL = str3;
        this.LLILZLL = aiClipWidget;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = i4;
        this.LLJILJILJ = z;
        this.LLJILLL = z2;
        this.LLJJ = str6;
    }
}
