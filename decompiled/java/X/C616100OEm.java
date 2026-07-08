package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616100OEm implements InterfaceC0148002o {
    public final double LL;
    public final int LLILLJJLI;
    public final EnumC624770Oex LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final List<String> LLILZLL;
    public final EnumC624750Oev LLIZ;
    public final C291001Au<EnumC624950OfF> LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<EnumC624780Oey> LLJI;
    public final C291001Au<EnumC624830Of3> LLJIJIL;
    public final C291001Au<C0OEU> LLJILJIL;
    public final C291001Au<Unit> LLJILJILJ;
    public final C291001Au<Long> LLJILLL;
    public final List<Aweme> LLJJ;
    public final Pair<String, Float> LLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C616100OEm)) {
            return false;
        }
        C616100OEm c616100OEm = (C616100OEm) obj;
        return Double.compare(this.LL, c616100OEm.LL) == 0 && this.LLILLJJLI == c616100OEm.LLILLJJLI && this.LLILLL == c616100OEm.LLILLL && this.LLILZ == c616100OEm.LLILZ && this.LLILZIL == c616100OEm.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c616100OEm.LLILZLL) && this.LLIZ == c616100OEm.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c616100OEm.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c616100OEm.LLJ) && Intrinsics.LJFF(this.LLJI, c616100OEm.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c616100OEm.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c616100OEm.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c616100OEm.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c616100OEm.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c616100OEm.LLJJ) && Intrinsics.LJFF(this.LLJJI, c616100OEm.LLJJI);
    }

    public final int hashCode() {
        int iX2 = ((((((((C786410Ut5.X2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31;
        List<String> list = this.LLILZLL;
        int iHashCode = (iX2 + (list == null ? 0 : list.hashCode())) * 31;
        EnumC624750Oev enumC624750Oev = this.LLIZ;
        int iHashCode2 = (iHashCode + (enumC624750Oev == null ? 0 : enumC624750Oev.hashCode())) * 31;
        C291001Au<EnumC624950OfF> c291001Au = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<EnumC624780Oey> c291001Au3 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<EnumC624830Of3> c291001Au4 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C0OEU> c291001Au5 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLJILJILJ;
        int iHashCode8 = (((iHashCode7 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31) + this.LLJILLL.hashCode()) * 31;
        List<Aweme> list2 = this.LLJJ;
        return ((iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.LLJJI.hashCode();
    }

    public final String toString() {
        return "OfflineModeManagerState(cachedVideoSize=" + this.LL + ", cachedVideoCount=" + this.LLILLJJLI + ", downloadState=" + this.LLILLL + ", isWifiOnly=" + this.LLILZ + ", cacheCount=" + this.LLILZIL + ", watchedList=" + this.LLILZLL + ", sheetStyle=" + this.LLIZ + ", sheetUpdateEvent=" + this.LLIZLLLIL + ", backPressEvent=" + this.LLJ + ", popupVideoToastEvent=" + this.LLJI + ", popupSheetToastEvent=" + this.LLJIJIL + ", popupDialogEvent=" + this.LLJILJIL + ", returnFypEvent=" + this.LLJILJILJ + ", stableNetVideoCount=" + this.LLJILLL + ", coverAwemeList=" + this.LLJJ + ", currentScore=" + this.LLJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C616100OEm(double d, int i, EnumC624770Oex enumC624770Oex, boolean z, int i2, List<String> list, EnumC624750Oev enumC624750Oev, C291001Au<? extends EnumC624950OfF> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<? extends EnumC624780Oey> c291001Au3, C291001Au<? extends EnumC624830Of3> c291001Au4, C291001Au<? extends C0OEU> c291001Au5, C291001Au<Unit> c291001Au6, C291001Au<Long> c291001Au7, List<? extends Aweme> list2, Pair<String, Float> pair) {
        this.LL = d;
        this.LLILLJJLI = i;
        this.LLILLL = enumC624770Oex;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = list;
        this.LLIZ = enumC624750Oev;
        this.LLIZLLLIL = c291001Au;
        this.LLJ = c291001Au2;
        this.LLJI = c291001Au3;
        this.LLJIJIL = c291001Au4;
        this.LLJILJIL = c291001Au5;
        this.LLJILJILJ = c291001Au6;
        this.LLJILLL = c291001Au7;
        this.LLJJ = list2;
        this.LLJJI = pair;
    }

    public static C616100OEm LIZ(C616100OEm c616100OEm, double d, int i, EnumC624770Oex enumC624770Oex, boolean z, int i2, List list, EnumC624750Oev enumC624750Oev, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, List list2, Pair pair, int i3) {
        Pair pair2 = pair;
        List list3 = list2;
        C291001Au c291001Au8 = c291001Au7;
        C291001Au c291001Au9 = c291001Au6;
        C291001Au c291001Au10 = c291001Au5;
        C291001Au c291001Au11 = c291001Au3;
        C291001Au c291001Au12 = c291001Au2;
        C291001Au c291001Au13 = c291001Au;
        EnumC624750Oev enumC624750Oev2 = enumC624750Oev;
        List list4 = list;
        boolean z2 = z;
        EnumC624770Oex enumC624770Oex2 = enumC624770Oex;
        int i4 = i;
        int i5 = i2;
        C291001Au c291001Au14 = c291001Au4;
        double d2 = d;
        if ((i3 & 1) != 0) {
            d2 = c616100OEm.LL;
        }
        if ((i3 & 2) != 0) {
            i4 = c616100OEm.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            enumC624770Oex2 = c616100OEm.LLILLL;
        }
        if ((i3 & 8) != 0) {
            z2 = c616100OEm.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i5 = c616100OEm.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            list4 = c616100OEm.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            enumC624750Oev2 = c616100OEm.LLIZ;
        }
        if ((i3 & 128) != 0) {
            c291001Au13 = c616100OEm.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            c291001Au12 = c616100OEm.LLJ;
        }
        if ((i3 & 512) != 0) {
            c291001Au11 = c616100OEm.LLJI;
        }
        if ((i3 & 1024) != 0) {
            c291001Au14 = c616100OEm.LLJIJIL;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au10 = c616100OEm.LLJILJIL;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au9 = c616100OEm.LLJILJILJ;
        }
        if ((i3 & 8192) != 0) {
            c291001Au8 = c616100OEm.LLJILLL;
        }
        if ((i3 & 16384) != 0) {
            list3 = c616100OEm.LLJJ;
        }
        if ((i3 & 32768) != 0) {
            pair2 = c616100OEm.LLJJI;
        }
        c616100OEm.getClass();
        int i6 = i5;
        return new C616100OEm(d2, i4, enumC624770Oex2, z2, i6, list4, enumC624750Oev2, c291001Au13, c291001Au12, c291001Au11, c291001Au14, c291001Au10, c291001Au9, c291001Au8, list3, pair2);
    }
}
