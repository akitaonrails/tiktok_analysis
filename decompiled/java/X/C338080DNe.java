package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338080DNe implements InterfaceC0148002o {
    public final String LL;
    public final C0DHZ LLILLJJLI;
    public final String LLILLL;
    public final AbstractC1623806Xk<VerifyEmailResponse> LLILZ;
    public final AbstractC1623806Xk<Unit> LLILZIL;
    public final AbstractC1623806Xk<Unit> LLILZLL;
    public final List<C331430Cyz> LLIZ;
    public final Long LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;

    public C338080DNe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C338080DNe)) {
            return false;
        }
        C338080DNe c338080DNe = (C338080DNe) obj;
        return Intrinsics.LJFF(this.LL, c338080DNe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c338080DNe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c338080DNe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c338080DNe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c338080DNe.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c338080DNe.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c338080DNe.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c338080DNe.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c338080DNe.LLJ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0DHZ c0dhz = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0dhz == null ? 0 : c0dhz.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        Long l = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLJ;
        return iHashCode4 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifySchoolVMState(schoolEmail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", correctedSchool=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentAffiliatedId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emailVerificationRequest=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", correctSchoolRequest=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", resendCodeRequest=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", correctionSchools=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", currentSendCodeTime=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", enableSchoolGroup=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C338080DNe(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(null, null, null, c491101vh, c491101vh, c491101vh, C13BV.INSTANCE, null, null);
    }

    public C338080DNe(String str, C0DHZ c0dhz, String str2, AbstractC1623806Xk<VerifyEmailResponse> abstractC1623806Xk, AbstractC1623806Xk<Unit> abstractC1623806Xk2, AbstractC1623806Xk<Unit> abstractC1623806Xk3, List<C331430Cyz> list, Long l, C291001Au<Boolean> c291001Au) {
        this.LL = str;
        this.LLILLJJLI = c0dhz;
        this.LLILLL = str2;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = abstractC1623806Xk2;
        this.LLILZLL = abstractC1623806Xk3;
        this.LLIZ = list;
        this.LLIZLLLIL = l;
        this.LLJ = c291001Au;
    }

    public static C338080DNe LIZ(C338080DNe c338080DNe, String str, C0DHZ c0dhz, String str2, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, List list, Long l, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        Long l2 = l;
        List list2 = list;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk;
        String str3 = str2;
        C0DHZ c0dhz2 = c0dhz;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c338080DNe.LL;
        }
        if ((i & 2) != 0) {
            c0dhz2 = c338080DNe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str3 = c338080DNe.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk6 = c338080DNe.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk5 = c338080DNe.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk4 = c338080DNe.LLILZLL;
        }
        if ((i & 64) != 0) {
            list2 = c338080DNe.LLIZ;
        }
        if ((i & 128) != 0) {
            l2 = c338080DNe.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au2 = c338080DNe.LLJ;
        }
        c338080DNe.getClass();
        return new C338080DNe(str4, c0dhz2, str3, abstractC1623806Xk6, abstractC1623806Xk5, abstractC1623806Xk4, list2, l2, c291001Au2);
    }
}
