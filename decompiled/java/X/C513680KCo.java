package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513680KCo {
    public static final C513680KCo LJIL = new C513680KCo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, false, 4194303);
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final boolean LJIJJ;
    public final List<Object> LJIJJLI;

    public C513680KCo() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, false, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C513680KCo)) {
            return false;
        }
        C513680KCo c513680KCo = (C513680KCo) obj;
        return this.LIZ == c513680KCo.LIZ && Intrinsics.LJFF(this.LIZIZ, c513680KCo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c513680KCo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c513680KCo.LIZLLL) && Intrinsics.LJFF(this.LJ, c513680KCo.LJ) && Intrinsics.LJFF(this.LJFF, c513680KCo.LJFF) && Intrinsics.LJFF(this.LJI, c513680KCo.LJI) && Intrinsics.LJFF(this.LJII, c513680KCo.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c513680KCo.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c513680KCo.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c513680KCo.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c513680KCo.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c513680KCo.LJIIL) && this.LJIILIIL == c513680KCo.LJIILIIL && this.LJIILJJIL == c513680KCo.LJIILJJIL && this.LJIILL == c513680KCo.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c513680KCo.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c513680KCo.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c513680KCo.LJIJ) && Intrinsics.LJFF(this.LJIJI, c513680KCo.LJIJI) && this.LJIJJ == c513680KCo.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c513680KCo.LJIJJLI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + this.LJIILL) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31) + this.LJIJJLI.hashCode();
    }

    public final String toString() {
        return "SubscriptionPackageDto(creatorId=" + this.LIZ + ", creatorSecUid=" + this.LIZIZ + ", anchorName=" + this.LIZJ + ", packageId=" + this.LIZLLL + ", currentPackageId=" + this.LJ + ", fromId=" + this.LJFF + ", showEntrance=" + this.LJI + ", roomId=" + this.LJII + ", subscribeState=" + this.LJIIIIZZ + ", pageType=" + this.LJIIIZ + ", requestExtraParam=" + this.LJIIJ + ", groupId=" + this.LJIIJJI + ", fromSubEnter=" + this.LJIIL + ", allowCache=" + this.LJIILIIL + ", isInLiveRoom=" + this.LJIILJJIL + ", openBenefitPage=" + this.LJIILL + ", privilegePageType=" + this.LJIILLIIL + ", privilegeShowType=" + this.LJIIZILJ + ", anchorId=" + this.LJIJ + ", subSource=" + this.LJIJI + ", canUseDefaultPackage=" + this.LJIJJ + ", privileges=" + this.LJIJJLI + ')';
    }

    public final C0KCF LIZ() {
        String str = this.LIZIZ;
        String strValueOf = this.LJIJ;
        if (strValueOf.length() == 0) {
            strValueOf = String.valueOf(this.LIZ);
        }
        return new C0KCF(str, strValueOf, this.LJFF, this.LJIILIIL, 0, this.LJIJI, this.LIZLLL, this.LJI, this.LJIIJJI, Boolean.valueOf(this.LJIILJJIL), this.LJIIL, this.LJIIIIZZ, this.LJIIZILJ, this.LJIILLIIL, this.LJII, false, null, false, null, this.LJIILL, null, this.LJIIJ, this.LJ, this.LJIIIZ, this.LIZJ, 0, null, 0L, 0L, this.LJIJJ, -128056560, 13);
    }

    public C513680KCo(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, int i, String str13, String str14, String str15, String str16, boolean z3, int i2) {
        C13BV c13bv;
        String str17 = str2;
        String str18 = str;
        String str19 = str11;
        String str20 = str10;
        String str21 = str9;
        String str22 = str8;
        String str23 = str7;
        String str24 = str6;
        String str25 = str5;
        String str26 = str4;
        String str27 = str3;
        String str28 = str15;
        String str29 = str13;
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        int i3 = i;
        String str30 = str14;
        String str31 = str12;
        long j2 = (i2 & 1) != 0 ? 0L : j;
        str18 = (i2 & 2) != 0 ? "" : str18;
        str17 = (i2 & 4) != 0 ? "" : str17;
        str27 = (i2 & 8) != 0 ? "" : str27;
        str26 = (i2 & 16) != 0 ? "" : str26;
        str25 = (i2 & 32) != 0 ? "" : str25;
        str24 = (i2 & 64) != 0 ? "" : str24;
        str23 = (i2 & 128) != 0 ? "" : str23;
        str22 = (i2 & 256) != 0 ? "" : str22;
        str21 = (i2 & 512) != 0 ? "" : str21;
        str20 = (i2 & 1024) != 0 ? "" : str20;
        str19 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str19;
        str31 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str31;
        z6 = (i2 & 8192) != 0 ? true : z6;
        z4 = (i2 & 16384) != 0 ? false : z4;
        i3 = (32768 & i2) != 0 ? 0 : i3;
        str29 = (65536 & i2) != 0 ? "" : str29;
        str30 = (131072 & i2) != 0 ? "" : str30;
        str28 = (262144 & i2) != 0 ? "" : str28;
        String str32 = (524288 & i2) == 0 ? str16 : "";
        z5 = (1048576 & i2) != 0 ? false : z5;
        if ((i2 & 2097152) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this.LIZ = j2;
        this.LIZIZ = str18;
        this.LIZJ = str17;
        this.LIZLLL = str27;
        this.LJ = str26;
        this.LJFF = str25;
        this.LJI = str24;
        this.LJII = str23;
        this.LJIIIIZZ = str22;
        this.LJIIIZ = str21;
        this.LJIIJ = str20;
        this.LJIIJJI = str19;
        this.LJIIL = str31;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z4;
        this.LJIILL = i3;
        this.LJIILLIIL = str29;
        this.LJIIZILJ = str30;
        this.LJIJ = str28;
        this.LJIJI = str32;
        this.LJIJJ = z5;
        this.LJIJJLI = c13bv;
    }
}
