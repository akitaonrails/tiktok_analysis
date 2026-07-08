package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: renamed from: X.15Om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20513015Om {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final EnigmaProductsResponse.Data.EnigmaIAPProductDetails LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20513015Om() {
        String str = null;
        this(str, str, str, str, str, str, false, str, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20513015Om)) {
            return false;
        }
        C20513015Om c20513015Om = (C20513015Om) obj;
        return Intrinsics.LJFF(this.LIZ, c20513015Om.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20513015Om.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20513015Om.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20513015Om.LIZLLL) && Intrinsics.LJFF(this.LJ, c20513015Om.LJ) && Intrinsics.LJFF(this.LJFF, c20513015Om.LJFF) && Intrinsics.LJFF(this.LJI, c20513015Om.LJI) && Intrinsics.LJFF(this.LJII, c20513015Om.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c20513015Om.LJIIIIZZ) && this.LJIIIZ == c20513015Om.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c20513015Om.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c20513015Om.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails = this.LJIIIIZZ;
        return ((((((iHashCode + (enigmaIAPProductDetails == null ? 0 : enigmaIAPProductDetails.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "CardInfo(title=" + this.LIZ + ", price=" + this.LIZIZ + ", priceStrike=" + this.LIZJ + ", subPrice=" + this.LIZLLL + ", discount=" + this.LJ + ", totalPrice=" + this.LJFF + ", productId=" + this.LJI + ", mpSkuId=" + this.LJII + ", productDetail=" + this.LJIIIIZZ + ", isMonthly=" + this.LJIIIZ + ", discountedPrice=" + this.LJIIJ + ", termsAndConditions=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20513015Om(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, int i) {
        String str8;
        String str9;
        boolean z2 = z;
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = (i & 1) != 0 ? "" : str;
        str14 = (i & 2) != 0 ? "" : str14;
        str13 = (i & 4) != 0 ? "" : str13;
        str12 = (i & 8) != 0 ? "" : str12;
        str11 = (i & 16) != 0 ? "" : str11;
        str10 = (i & 32) != 0 ? "" : str10;
        if ((i & 64) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i & 128) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        this(str15, str14, str13, str12, str11, str10, str8, str9, null, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? "" : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str7 : "");
    }

    public static C20513015Om LIZ(C20513015Om c20513015Om, String str, String str2, String str3, String str4, String str5, String str6, String str7, EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, String str8, int i) {
        String str9;
        boolean z;
        String str10 = str6;
        String str11 = str8;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails2 = enigmaIAPProductDetails;
        String str15 = str2;
        String str16 = str7;
        String str17 = str;
        if ((i & 1) != 0) {
            str17 = c20513015Om.LIZ;
        }
        if ((i & 2) != 0) {
            str15 = c20513015Om.LIZIZ;
        }
        if ((i & 4) != 0) {
            str14 = c20513015Om.LIZJ;
        }
        if ((i & 8) != 0) {
            str12 = c20513015Om.LIZLLL;
        }
        String str18 = null;
        if ((i & 16) != 0) {
            str9 = c20513015Om.LJ;
        } else {
            str9 = null;
        }
        if ((i & 32) != 0) {
            str13 = c20513015Om.LJFF;
        }
        if ((i & 64) != 0) {
            str10 = c20513015Om.LJI;
        }
        if ((i & 128) != 0) {
            str16 = c20513015Om.LJII;
        }
        if ((i & 256) != 0) {
            enigmaIAPProductDetails2 = c20513015Om.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z = c20513015Om.LJIIIZ;
        } else {
            z = false;
        }
        if ((i & 1024) != 0) {
            str11 = c20513015Om.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str18 = c20513015Om.LJIIJJI;
        }
        c20513015Om.getClass();
        return new C20513015Om(str17, str15, str14, str12, str9, str13, str10, str16, enigmaIAPProductDetails2, z, str11, str18);
    }

    public C20513015Om(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, boolean z, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = enigmaIAPProductDetails;
        this.LJIIIZ = z;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
    }
}
