package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835460xrc implements InterfaceC1891350zJl {
    public final String LL;
    public final ImageModel LLILLJJLI;
    public final Float LLILLL;
    public final Long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final Integer LLJI;
    public final Integer LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public final long LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1835460xrc)) {
            return false;
        }
        C1835460xrc c1835460xrc = (C1835460xrc) obj;
        return Intrinsics.LJFF(this.LL, c1835460xrc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1835460xrc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1835460xrc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1835460xrc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1835460xrc.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1835460xrc.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1835460xrc.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1835460xrc.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1835460xrc.LLJ) && Intrinsics.LJFF(this.LLJI, c1835460xrc.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1835460xrc.LLJIJIL) && this.LLJILJIL == c1835460xrc.LLJILJIL && this.LLJILJILJ == c1835460xrc.LLJILJILJ && this.LLJILLL == c1835460xrc.LLJILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        ImageModel imageModel = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        Float f = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLJIJIL;
        return ((((((iHashCode10 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Y2(this.LLJILLL);
    }

    public final String toString() {
        return "ReplayItem(roomId=" + this.LL + ", cover=" + this.LLILLJJLI + ", duration=" + this.LLILLL + ", createTime=" + this.LLILZ + ", title=" + this.LLILZIL + ", fileId=" + this.LLILZLL + ", downloadStatus=" + this.LLIZ + ", videoUrl=" + this.LLIZLLLIL + ", downloadUrl=" + this.LLJ + ", videoWidth=" + this.LLJI + ", videoHeight=" + this.LLJIJIL + ", watchStatus=" + this.LLJILJIL + ", available=" + this.LLJILJILJ + ", punishType=" + this.LLJILLL + ')';
    }

    public final boolean LIZ() {
        return this.LLJILJIL == 3 || !this.LLJILJILJ || this.LLJILLL > 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1835460xrc(String str, ImageModel imageModel, Float f, Long l, String str2, String str3, Integer num, String str4, String str5, Integer num2, Integer num3, int i, boolean z, long j) {
        this.LL = str;
        this.LLILLJJLI = imageModel;
        this.LLILLL = f;
        this.LLILZ = l;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = num2;
        this.LLJIJIL = num3;
        this.LLJILJIL = i;
        this.LLJILJILJ = z;
        this.LLJILLL = j;
    }
}
