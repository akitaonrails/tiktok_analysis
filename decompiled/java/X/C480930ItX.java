package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ItX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480930ItX {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C480590Isz LIZLLL;
    public final Long LJ;
    public final String LJFF;
    public final boolean LJI;
    public final List<String> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final EnumC480960Ita LJIIJJI;
    public final boolean LJIIL;
    public final long LJIILIIL;
    public final InterfaceC463820IGu LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;

    public C480930ItX() {
        this(null, null, 0, null, null, null, false, null, null, null, null, EnumC480960Ita.PRECREATE, false, Mp4ScreenVideoLoadTimeout.CONTROL, null, false, false, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C480930ItX)) {
            return false;
        }
        C480930ItX c480930ItX = (C480930ItX) obj;
        return Intrinsics.LJFF(this.LIZ, c480930ItX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c480930ItX.LIZIZ) && this.LIZJ == c480930ItX.LIZJ && Intrinsics.LJFF(this.LIZLLL, c480930ItX.LIZLLL) && Intrinsics.LJFF(this.LJ, c480930ItX.LJ) && Intrinsics.LJFF(this.LJFF, c480930ItX.LJFF) && this.LJI == c480930ItX.LJI && Intrinsics.LJFF(this.LJII, c480930ItX.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c480930ItX.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c480930ItX.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c480930ItX.LJIIJ) && this.LJIIJJI == c480930ItX.LJIIJJI && this.LJIIL == c480930ItX.LJIIL && this.LJIILIIL == c480930ItX.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c480930ItX.LJIILJJIL) && this.LJIILL == c480930ItX.LJIILL && this.LJIILLIIL == c480930ItX.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c480930ItX.LJIIZILJ) && this.LJIJ == c480930ItX.LJIJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31;
        C480590Isz c480590Isz = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c480590Isz == null ? 0 : c480590Isz.hashCode())) * 31;
        Long l = this.LJ;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        List<String> list = this.LJII;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJ;
        int iHashCode9 = (((((((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.LJIIJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31;
        InterfaceC463820IGu interfaceC463820IGu = this.LJIILJJIL;
        int iHashCode10 = (((((iHashCode9 + (interfaceC463820IGu == null ? 0 : interfaceC463820IGu.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31;
        String str7 = this.LJIIZILJ;
        return ((iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIJ);
    }

    public final String toString() {
        return "PrewarmConfig(streamData=" + this.LIZ + ", defaultResolution=" + this.LIZIZ + ", streamType=" + this.LIZJ + ", srOptions=" + this.LIZLLL + ", roomId=" + this.LJ + ", sessionId=" + this.LJFF + ", canPlayWithSoftDecoder=" + this.LJI + ", preloadList=" + this.LJII + ", sdkParams=" + this.LJIIIIZZ + ", url=" + this.LJIIIZ + ", playerTag=" + this.LJIIJ + ", operationMode=" + this.LJIIJJI + ", muteInitial=" + this.LJIIL + ", preIoKeepMs=" + this.LJIILIIL + ", textureView=" + this.LJIILJJIL + ", useSeiUpdateV2=" + this.LJIILL + ", enableSeiFilter=" + this.LJIILLIIL + ", logId=" + this.LJIIZILJ + ", forceLowLatency=" + this.LJIJ + ')';
    }

    public C480930ItX(String str, String str2, int i, C480590Isz c480590Isz, Long l, String str3, boolean z, List<String> list, String str4, String str5, String str6, EnumC480960Ita enumC480960Ita, boolean z2, long j, InterfaceC463820IGu interfaceC463820IGu, boolean z3, boolean z4, String str7, boolean z5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = c480590Isz;
        this.LJ = l;
        this.LJFF = str3;
        this.LJI = z;
        this.LJII = list;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
        this.LJIIJJI = enumC480960Ita;
        this.LJIIL = z2;
        this.LJIILIIL = j;
        this.LJIILJJIL = interfaceC463820IGu;
        this.LJIILL = z3;
        this.LJIILLIIL = z4;
        this.LJIIZILJ = str7;
        this.LJIJ = z5;
    }
}
