package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBZ implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<C442001nm> LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final C291001Au<C0YMW> LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZBZ)) {
            return false;
        }
        C0ZBZ c0zbz = (C0ZBZ) obj;
        return Intrinsics.LJFF(this.LL, c0zbz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zbz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zbz.LLILLL) && this.LLILZ == c0zbz.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0zbz.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0zbz.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0zbz.LLIZ) && this.LLIZLLLIL == c0zbz.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0zbz.LLJ) && this.LLJI == c0zbz.LLJI && this.LLJIJIL == c0zbz.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c0zbz.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<C442001nm> c291001Au = this.LLILZLL;
        int iHashCode4 = (((((((((((iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        C291001Au<C0YMW> c291001Au2 = this.LLJILJIL;
        return iHashCode4 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        return "EditGroupInfoState(avatar=" + this.LL + ", curEditingAvatarFilePath=" + this.LLILLJJLI + ", curEditingAvatarUri=" + this.LLILLL + ", showLoading=" + this.LLILZ + ", quitPage=" + this.LLILZIL + ", showToast=" + this.LLILZLL + ", name=" + this.LLIZ + ", showNameErrorHint=" + this.LLIZLLLIL + ", desc=" + this.LLJ + ", showDescErrorHint=" + this.LLJI + ", enableSave=" + this.LLJIJIL + ", updateError=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZBZ(String str, String str2, String str3, boolean z, C291001Au<Boolean> c291001Au, C291001Au<C442001nm> c291001Au2, String str4, boolean z2, String str5, boolean z3, boolean z4, C291001Au<? extends C0YMW> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = str4;
        this.LLIZLLLIL = z2;
        this.LLJ = str5;
        this.LLJI = z3;
        this.LLJIJIL = z4;
        this.LLJILJIL = c291001Au3;
    }

    public static C0ZBZ LIZ(C0ZBZ c0zbz, String str, String str2, boolean z, C291001Au c291001Au, C291001Au c291001Au2, String str3, boolean z2, String str4, boolean z3, boolean z4, C291001Au c291001Au3, int i) {
        String str5;
        C291001Au c291001Au4 = c291001Au3;
        boolean z5 = z4;
        boolean z6 = z3;
        String str6 = str4;
        boolean z7 = z2;
        String str7 = str3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        boolean z8 = z;
        String str8 = str2;
        String str9 = str;
        if ((i & 1) != 0) {
            str5 = c0zbz.LL;
        } else {
            str5 = null;
        }
        if ((i & 2) != 0) {
            str9 = c0zbz.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str8 = c0zbz.LLILLL;
        }
        if ((i & 8) != 0) {
            z8 = c0zbz.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c0zbz.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c0zbz.LLILZLL;
        }
        if ((i & 64) != 0) {
            str7 = c0zbz.LLIZ;
        }
        if ((i & 128) != 0) {
            z7 = c0zbz.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str6 = c0zbz.LLJ;
        }
        if ((i & 512) != 0) {
            z6 = c0zbz.LLJI;
        }
        if ((i & 1024) != 0) {
            z5 = c0zbz.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au4 = c0zbz.LLJILJIL;
        }
        c0zbz.getClass();
        return new C0ZBZ(str5, str9, str8, z8, c291001Au6, c291001Au5, str7, z7, str6, z6, z5, c291001Au4);
    }
}
