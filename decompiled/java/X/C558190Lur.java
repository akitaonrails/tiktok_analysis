package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558190Lur extends AbstractC558210Lut {
    public final boolean LLILZLL;
    public String LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public String LLJILJILJ;
    public final String LLJILLL;
    public Integer LLJJ;
    public EnumC554770LpL LLJJI;
    public final String LLJJIII;
    public String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C558190Lur() {
        boolean z = false;
        this(z, null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C558190Lur)) {
            return false;
        }
        C558190Lur c558190Lur = (C558190Lur) obj;
        return this.LLILZLL == c558190Lur.LLILZLL && Intrinsics.LJFF(this.LLIZ, c558190Lur.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c558190Lur.LLIZLLLIL) && this.LLJ == c558190Lur.LLJ && Intrinsics.LJFF(this.LLJI, c558190Lur.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c558190Lur.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c558190Lur.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c558190Lur.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c558190Lur.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c558190Lur.LLJJ) && this.LLJJI == c558190Lur.LLJJI && Intrinsics.LJFF(this.LLJJIII, c558190Lur.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c558190Lur.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c558190Lur.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c558190Lur.LLJJIJIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LLILZLL) * 31;
        String str = this.LLIZ;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        String str2 = this.LLJI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJILJIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJILJILJ;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJILLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.LLJJ;
        return ((((((((((iHashCode6 + (num != null ? num.hashCode() : 0)) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL.hashCode();
    }

    public final String toString() {
        return "Text2ImageAIItem(isSelected=" + this.LLILZLL + ", uri=" + this.LLIZ + ", textKey=" + this.LLIZLLLIL + ", isDefault=" + this.LLJ + ", aiTaskId=" + this.LLJI + ", placeholderUrl=" + this.LLJIJIL + ", coverUrl=" + this.LLJILJIL + ", asyncTaskId=" + this.LLJILJILJ + ", aiName=" + this.LLJILLL + ", progress=" + this.LLJJ + ", status=" + this.LLJJI + ", errCode=" + this.LLJJIII + ", errMessage=" + this.LLJJIJI + ", titleErr=" + this.LLJJIJIIJIL + ", textErr=" + this.LLJJIJIL + ')';
    }

    @Override // X.AbstractC558210Lut
    public final String LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC558210Lut
    public final String LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC558210Lut
    public final String LJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC558210Lut
    public final boolean LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC558210Lut
    public final boolean isSelected() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC558210Lut
    public final AbstractC558210Lut LIZ(boolean z) {
        return new C558190Lur(z, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL);
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C558190Lur)) {
            return false;
        }
        C558190Lur c558190Lur = (C558190Lur) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c558190Lur.LLIZ, this.LLIZ) || c558190Lur.LLILZLL != this.LLILZLL || !Intrinsics.LJFF(c558190Lur.LLIZLLLIL, this.LLIZLLLIL) || !Intrinsics.LJFF(c558190Lur.LLJILJILJ, this.LLJILJILJ) || !Intrinsics.LJFF(c558190Lur.LLJILLL, this.LLJILLL) || !Intrinsics.LJFF(c558190Lur.LLJJ, this.LLJJ) || c558190Lur.LLJJI != this.LLJJI || !Intrinsics.LJFF(c558190Lur.LLJJIII, this.LLJJIII) || !Intrinsics.LJFF(c558190Lur.LLJJIJIIJIL, this.LLJJIJIIJIL) || !Intrinsics.LJFF(c558190Lur.LLJJIJIL, this.LLJJIJIL)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C558190Lur)) {
            return false;
        }
        C558190Lur c558190Lur = (C558190Lur) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c558190Lur.LLIZ, this.LLIZ) || !Intrinsics.LJFF(c558190Lur.LLJILJILJ, this.LLJILJILJ) || !Intrinsics.LJFF(c558190Lur.LLJILLL, this.LLJILLL)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C558190Lur) {
            return new Object() { // from class: X.0Luy
            };
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C558190Lur(boolean z, String str, String str2, boolean z2, String str3, String str4, String str5, String str6, String str7, Integer num, EnumC554770LpL enumC554770LpL, int i) {
        String str8;
        String str9;
        String str10;
        Integer num2 = num;
        String str11 = str7;
        String str12 = str6;
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        boolean z3 = z2;
        EnumC554770LpL enumC554770LpL2 = enumC554770LpL;
        String str16 = str2;
        String str17 = str;
        boolean z4 = (i & 1) != 0 ? false : z;
        str17 = (i & 2) != 0 ? "" : str17;
        str16 = (i & 4) != 0 ? "" : str16;
        z3 = (i & 8) != 0 ? false : z3;
        str15 = (i & 16) != 0 ? null : str15;
        str14 = (i & 32) != 0 ? "" : str14;
        str13 = (i & 64) != 0 ? "" : str13;
        str12 = (i & 128) != 0 ? null : str12;
        str11 = (i & 256) != 0 ? null : str11;
        num2 = (i & 512) != 0 ? null : num2;
        enumC554770LpL2 = (i & 1024) != 0 ? EnumC554770LpL.UNSTARTED : enumC554770LpL2;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((i & 8192) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        this(z4, str17, str16, z3, str15, str14, str13, str12, str11, num2, enumC554770LpL2, str8, str9, str10, (i & 16384) == 0 ? null : "");
    }

    public C558190Lur(boolean z, String str, String str2, boolean z2, String str3, String str4, String str5, String str6, String str7, Integer num, EnumC554770LpL enumC554770LpL, String str8, String str9, String str10, String str11) {
        super(0);
        this.LLILZLL = z;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = z2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = str6;
        this.LLJILLL = str7;
        this.LLJJ = num;
        this.LLJJI = enumC554770LpL;
        this.LLJJIII = str8;
        this.LLJJIJI = str9;
        this.LLJJIJIIJIL = str10;
        this.LLJJIJIL = str11;
    }
}
