package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21350518gx {
    public final String LIZ;
    public final String LIZIZ;
    public final CharSequence LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final CharSequence LJFF;
    public final CharSequence LJI;
    public final CharSequence LJII;
    public final CharSequence LJIIIIZZ;
    public final CharSequence LJIIIZ;
    public final CharSequence LJIIJ;
    public final Map<String, Object> LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;

    public C21350518gx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21350518gx)) {
            return false;
        }
        C21350518gx c21350518gx = (C21350518gx) obj;
        return Intrinsics.LJFF(this.LIZ, c21350518gx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c21350518gx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c21350518gx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21350518gx.LIZLLL) && Intrinsics.LJFF(this.LJ, c21350518gx.LJ) && Intrinsics.LJFF(this.LJFF, c21350518gx.LJFF) && Intrinsics.LJFF(this.LJI, c21350518gx.LJI) && Intrinsics.LJFF(this.LJII, c21350518gx.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c21350518gx.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c21350518gx.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c21350518gx.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c21350518gx.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c21350518gx.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c21350518gx.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        CharSequence charSequence = this.LIZJ;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.LJI;
        int iHashCode6 = (iHashCode5 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.LJII;
        int iHashCode7 = (iHashCode6 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        CharSequence charSequence7 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (charSequence7 == null ? 0 : charSequence7.hashCode())) * 31;
        CharSequence charSequence8 = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (charSequence8 == null ? 0 : charSequence8.hashCode())) * 31;
        CharSequence charSequence9 = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (charSequence9 == null ? 0 : charSequence9.hashCode())) * 31;
        Map<String, Object> map = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LJIIL;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIILIIL;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "InviteCardConfig(aiBiz=" + this.LIZ + ", scene=" + this.LIZIZ + ", dialogTitle=" + ((Object) this.LIZJ) + ", dialogMessage=" + ((Object) this.LIZLLL) + ", primaryActionText=" + ((Object) this.LJ) + ", secondActionText=" + ((Object) this.LJFF) + ", sheetTitle=" + ((Object) this.LJI) + ", sheetMessage=" + ((Object) this.LJII) + ", sheetBtnEnableText=" + ((Object) this.LJIIIIZZ) + ", sheetBtnDisableText=" + ((Object) this.LJIIIZ) + ", buildCardFailToast=" + ((Object) this.LJIIJ) + ", extras=" + this.LJIIJJI + ", enterFrom=" + this.LJIIL + ", enterMethod=" + this.LJIILIIL + ')';
    }

    public C21350518gx(String str, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, CharSequence charSequence8, CharSequence charSequence9, Map map, String str3, String str4, int i) {
        CharSequence charSequence10 = charSequence2;
        CharSequence charSequence11 = charSequence3;
        CharSequence charSequence12 = charSequence4;
        CharSequence charSequence13 = charSequence5;
        CharSequence charSequence14 = charSequence6;
        CharSequence charSequence15 = charSequence7;
        CharSequence charSequence16 = charSequence8;
        CharSequence charSequence17 = charSequence9;
        Map mapLJ = map;
        String str5 = str3;
        CharSequence charSequence18 = (i & 4) != 0 ? null : charSequence;
        charSequence10 = (i & 8) != 0 ? null : charSequence10;
        charSequence11 = (i & 16) != 0 ? null : charSequence11;
        charSequence12 = (i & 32) != 0 ? null : charSequence12;
        charSequence13 = (i & 64) != 0 ? null : charSequence13;
        charSequence14 = (i & 128) != 0 ? null : charSequence14;
        charSequence15 = (i & 256) != 0 ? null : charSequence15;
        charSequence16 = (i & 512) != 0 ? null : charSequence16;
        charSequence17 = (i & 1024) != 0 ? null : charSequence17;
        mapLJ = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : mapLJ;
        str5 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5;
        String str6 = (i & 8192) == 0 ? str4 : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = charSequence18;
        this.LIZLLL = charSequence10;
        this.LJ = charSequence11;
        this.LJFF = charSequence12;
        this.LJI = charSequence13;
        this.LJII = charSequence14;
        this.LJIIIIZZ = charSequence15;
        this.LJIIIZ = charSequence16;
        this.LJIIJ = charSequence17;
        this.LJIIJJI = mapLJ;
        this.LJIIL = str5;
        this.LJIILIIL = str6;
    }
}
