package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.SMBVerificationInfoResponse;

/* JADX INFO: renamed from: X.0wXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784660wXg implements InterfaceC0148002o {
    public final AbstractC1411370mpb LL;
    public final List<C1781540wSe> LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final boolean LLJ;
    public final List<C1781540wSe> LLJI;
    public final SMBVerificationInfoResponse.Data LLJIJIL;
    public final Set<Long> LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;

    public C1784660wXg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1784660wXg)) {
            return false;
        }
        C1784660wXg c1784660wXg = (C1784660wXg) obj;
        return Intrinsics.LJFF(this.LL, c1784660wXg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1784660wXg.LLILLJJLI) && this.LLILLL == c1784660wXg.LLILLL && Intrinsics.LJFF(this.LLILZ, c1784660wXg.LLILZ) && this.LLILZIL == c1784660wXg.LLILZIL && this.LLILZLL == c1784660wXg.LLILZLL && this.LLIZ == c1784660wXg.LLIZ && this.LLIZLLLIL == c1784660wXg.LLIZLLLIL && this.LLJ == c1784660wXg.LLJ && Intrinsics.LJFF(this.LLJI, c1784660wXg.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1784660wXg.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1784660wXg.LLJILJIL) && this.LLJILJILJ == c1784660wXg.LLJILJILJ && this.LLJILLL == c1784660wXg.LLJILLL && this.LLJJ == c1784660wXg.LLJJ && this.LLJJI == c1784660wXg.LLJJI && this.LLJJIII == c1784660wXg.LLJJIII && this.LLJJIJI == c1784660wXg.LLJJIJI && this.LLJJIJIIJIL == c1784660wXg.LLJJIJIIJIL && this.LLJJIJIL == c1784660wXg.LLJJIJIL && this.LLJJJ == c1784660wXg.LLJJJ && this.LLJJJIL == c1784660wXg.LLJJJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31;
        SMBVerificationInfoResponse.Data data = this.LLJIJIL;
        return ((((((((((((((((((((((iHashCode + (data == null ? 0 : data.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL);
    }

    public final String toString() {
        return "PcsIndustrySelectState(loadStatus=" + this.LL + ", industries=" + this.LLILLJJLI + ", selectedIndustryId=" + this.LLILLL + ", selectedIndustryName=" + this.LLILZ + ", existingVerificationStatus=" + this.LLILZIL + ", canReselect=" + this.LLILZLL + ", submitLoading=" + this.LLIZ + ", backendSelectedIndustryId=" + this.LLIZLLLIL + ", canSelect=" + this.LLJ + ", allL1Industries=" + this.LLJI + ", verificationInfo=" + this.LLJIJIL + ", allL2IndustryIds=" + this.LLJILJIL + ", userSupportsIndustryVerification=" + this.LLJILJILJ + ", canInstantApply=" + this.LLJILLL + ", hasSelectedL2Industry=" + this.LLJJ + ", showServiceCateUpdateNote=" + this.LLJJI + ", isKybUser=" + this.LLJJIII + ", isKycUser=" + this.LLJJIJI + ", selectedIndustrySupportsVerification=" + this.LLJJIJIIJIL + ", hasApprovedIndustryVerification=" + this.LLJJIJIL + ", guideIndustryVerify=" + this.LLJJJ + ", guideIndustryStatusCheck=" + this.LLJJJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1784660wXg(int i) {
        C1411360mpa c1411360mpa = C1411360mpa.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        this(c1411360mpa, c13bv, 0L, "", 0, true, false, 0L, true, c13bv, null, C08CX.INSTANCE, false, false, false, false, false, false, false, false, false, false);
    }

    public C1784660wXg(AbstractC1411370mpb abstractC1411370mpb, List<C1781540wSe> list, long j, String str, int i, boolean z, boolean z2, long j2, boolean z3, List<C1781540wSe> list2, SMBVerificationInfoResponse.Data data, Set<Long> set, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.LL = abstractC1411370mpb;
        this.LLILLJJLI = list;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = j2;
        this.LLJ = z3;
        this.LLJI = list2;
        this.LLJIJIL = data;
        this.LLJILJIL = set;
        this.LLJILJILJ = z4;
        this.LLJILLL = z5;
        this.LLJJ = z6;
        this.LLJJI = z7;
        this.LLJJIII = z8;
        this.LLJJIJI = z9;
        this.LLJJIJIIJIL = z10;
        this.LLJJIJIL = z11;
        this.LLJJJ = z12;
        this.LLJJJIL = z13;
    }

    public static C1784660wXg LIZ(C1784660wXg c1784660wXg, AbstractC1411370mpb abstractC1411370mpb, List list, long j, String str, int i, boolean z, boolean z2, long j2, boolean z3, List list2, SMBVerificationInfoResponse.Data data, Set set, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i2) {
        boolean z14 = z12;
        boolean z15 = z8;
        boolean z16 = z7;
        SMBVerificationInfoResponse.Data data2 = data;
        boolean z17 = z6;
        boolean z18 = z11;
        boolean z19 = z5;
        boolean z20 = z3;
        long j3 = j2;
        boolean z21 = z;
        boolean z22 = z4;
        boolean z23 = z2;
        boolean z24 = z10;
        Set set2 = set;
        String str2 = str;
        boolean z25 = z9;
        long j4 = j;
        List list3 = list;
        int i3 = i;
        List list4 = list2;
        boolean z26 = z13;
        AbstractC1411370mpb abstractC1411370mpb2 = abstractC1411370mpb;
        if ((i2 & 1) != 0) {
            abstractC1411370mpb2 = c1784660wXg.LL;
        }
        if ((i2 & 2) != 0) {
            list3 = c1784660wXg.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            j4 = c1784660wXg.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str2 = c1784660wXg.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1784660wXg.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z21 = c1784660wXg.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z23 = c1784660wXg.LLIZ;
        }
        if ((i2 & 128) != 0) {
            j3 = c1784660wXg.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            z20 = c1784660wXg.LLJ;
        }
        if ((i2 & 512) != 0) {
            list4 = c1784660wXg.LLJI;
        }
        if ((i2 & 1024) != 0) {
            data2 = c1784660wXg.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            set2 = c1784660wXg.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z22 = c1784660wXg.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            z19 = c1784660wXg.LLJILLL;
        }
        if ((i2 & 16384) != 0) {
            z17 = c1784660wXg.LLJJ;
        }
        if ((32768 & i2) != 0) {
            z16 = c1784660wXg.LLJJI;
        }
        if ((65536 & i2) != 0) {
            z15 = c1784660wXg.LLJJIII;
        }
        if ((131072 & i2) != 0) {
            z25 = c1784660wXg.LLJJIJI;
        }
        if ((262144 & i2) != 0) {
            z24 = c1784660wXg.LLJJIJIIJIL;
        }
        if ((524288 & i2) != 0) {
            z18 = c1784660wXg.LLJJIJIL;
        }
        if ((1048576 & i2) != 0) {
            z14 = c1784660wXg.LLJJJ;
        }
        if ((i2 & 2097152) != 0) {
            z26 = c1784660wXg.LLJJJIL;
        }
        c1784660wXg.getClass();
        boolean z27 = z14;
        boolean z28 = z26;
        return new C1784660wXg(abstractC1411370mpb2, list3, j4, str2, i3, z21, z23, j3, z20, list4, data2, set2, z22, z19, z17, z16, z15, z25, z24, z18, z27, z28);
    }
}
