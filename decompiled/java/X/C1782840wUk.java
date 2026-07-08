package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782840wUk implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final float LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782840wUk)) {
            return false;
        }
        C1782840wUk c1782840wUk = (C1782840wUk) obj;
        return this.LL == c1782840wUk.LL && Intrinsics.LJFF(this.LLILLJJLI, c1782840wUk.LLILLJJLI) && this.LLILLL == c1782840wUk.LLILLL && Float.compare(this.LLILZ, c1782840wUk.LLILZ) == 0 && Intrinsics.LJFF(this.LLILZIL, c1782840wUk.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1782840wUk.LLILZLL) && this.LLIZ == c1782840wUk.LLIZ && this.LLIZLLLIL == c1782840wUk.LLIZLLLIL && this.LLJ == c1782840wUk.LLJ && this.LLJI == c1782840wUk.LLJI && this.LLJIJIL == c1782840wUk.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1782840wUk.LLJILJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        return "MyClipsItem(fragmentId=" + this.LL + ", coverUrl=" + this.LLILLJJLI + ", createTime=" + this.LLILLL + ", videoDuration=" + this.LLILZ + ", roomId=" + this.LLILZIL + ", anchorId=" + this.LLILZLL + ", videoStatus=" + this.LLIZ + ", videoWidth=" + this.LLIZLLLIL + ", videoHeight=" + this.LLJ + ", supportBbDownload=" + this.LLJI + ", isBBFans=" + this.LLJIJIL + ", userType=" + this.LLJILJIL + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1782840wUk(long j, String str, long j2, float f, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2, String str4) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = j2;
        this.LLILZ = f;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = str4;
    }
}
