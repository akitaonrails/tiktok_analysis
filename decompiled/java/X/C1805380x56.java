package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805380x56 implements InterfaceC1806790x7N {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final String LJI;
    public final C1805380x56 LJII;
    public final int LJIIIIZZ;
    public final double LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final Long LJIIL;
    public final boolean LJIILIIL;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805380x56)) {
            return false;
        }
        C1805380x56 c1805380x56 = (C1805380x56) obj;
        return Intrinsics.LJFF(this.LIZ, c1805380x56.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805380x56.LIZIZ) && this.LIZJ == c1805380x56.LIZJ && this.LIZLLL == c1805380x56.LIZLLL && Intrinsics.LJFF(this.LJ, c1805380x56.LJ) && this.LJFF == c1805380x56.LJFF && Intrinsics.LJFF(this.LJI, c1805380x56.LJI) && Intrinsics.LJFF(this.LJII, c1805380x56.LJII) && this.LJIIIIZZ == c1805380x56.LJIIIIZZ && Double.compare(this.LJIIIZ, c1805380x56.LJIIIZ) == 0 && Intrinsics.LJFF(this.LJIIJ, c1805380x56.LJIIJ) && this.LJIIJJI == c1805380x56.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1805380x56.LJIIL) && this.LJIILIIL == c1805380x56.LJIILIIL;
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31;
        C1805380x56 c1805380x56 = this.LJII;
        int iHashCode2 = (((((((((iHashCode + (c1805380x56 == null ? 0 : c1805380x56.hashCode())) * 31) + this.LJIIIIZZ) * 31) + C786410Ut5.X2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31;
        Long l = this.LJIIL;
        return ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "WalletRechargeDiamondItemData(iapId=" + this.LIZ + ", countText=" + this.LIZIZ + ", isRecommended=" + this.LIZJ + ", canShowRecommendationMark=" + this.LIZLLL + ", priceText=" + this.LJ + ", isSelected=" + this.LJFF + ", contentDescription=" + this.LJI + ", prevTabMatchedDiamond=" + this.LJII + ", count=" + this.LJIIIIZZ + ", originalLocalPrice=" + this.LJIIIZ + ", localCurrency=" + this.LJIIJ + ", isTiktok=" + this.LJIIJJI + ", priceUsd=" + this.LJIIL + ", isEnabled=" + this.LJIILIIL + ')';
    }

    public static C1805380x56 LIZIZ(C1805380x56 c1805380x56, boolean z, boolean z2, C1805380x56 c1805380x562, boolean z3, int i) {
        String str;
        String str2;
        boolean z4;
        String str3;
        String str4;
        int i2;
        double d;
        String str5;
        boolean z5;
        boolean z6 = z3;
        boolean z7 = z2;
        C1805380x56 c1805380x563 = c1805380x562;
        boolean z8 = z;
        Long l = null;
        if ((i & 1) != 0) {
            str = c1805380x56.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c1805380x56.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z8 = c1805380x56.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c1805380x56.LIZLLL;
        } else {
            z4 = false;
        }
        if ((i & 16) != 0) {
            str3 = c1805380x56.LJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z7 = c1805380x56.LJFF;
        }
        if ((i & 64) != 0) {
            str4 = c1805380x56.LJI;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            c1805380x563 = c1805380x56.LJII;
        }
        if ((i & 256) != 0) {
            i2 = c1805380x56.LJIIIIZZ;
        } else {
            i2 = 0;
        }
        if ((i & 512) != 0) {
            d = c1805380x56.LJIIIZ;
        } else {
            d = 0.0d;
        }
        if ((i & 1024) != 0) {
            str5 = c1805380x56.LJIIJ;
        } else {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z5 = c1805380x56.LJIIJJI;
        } else {
            z5 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            l = c1805380x56.LJIIL;
        }
        if ((i & 8192) != 0) {
            z6 = c1805380x56.LJIILIIL;
        }
        c1805380x56.getClass();
        return new C1805380x56(str, str2, z8, z4, str3, z7, str4, c1805380x563, i2, d, str5, z5, l, z6);
    }

    public C1805380x56(String str, String str2, boolean z, boolean z2, String str3, boolean z3, String str4, C1805380x56 c1805380x56, int i, double d, String str5, boolean z4, Long l, boolean z5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str3;
        this.LJFF = z3;
        this.LJI = str4;
        this.LJII = c1805380x56;
        this.LJIIIIZZ = i;
        this.LJIIIZ = d;
        this.LJIIJ = str5;
        this.LJIIJJI = z4;
        this.LJIIL = l;
        this.LJIILIIL = z5;
    }
}
