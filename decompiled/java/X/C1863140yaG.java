package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863140yaG implements InterfaceC0148002o {
    public final TakoOnBoardingResponse LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC1863020ya4 LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Integer LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    public C1863140yaG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863140yaG)) {
            return false;
        }
        C1863140yaG c1863140yaG = (C1863140yaG) obj;
        return Intrinsics.LJFF(this.LL, c1863140yaG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1863140yaG.LLILLJJLI) && this.LLILLL == c1863140yaG.LLILLL && this.LLILZ == c1863140yaG.LLILZ && this.LLILZIL == c1863140yaG.LLILZIL && this.LLILZLL == c1863140yaG.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1863140yaG.LLIZ) && this.LLIZLLLIL == c1863140yaG.LLIZLLLIL && this.LLJ == c1863140yaG.LLJ;
    }

    public final int hashCode() {
        TakoOnBoardingResponse takoOnBoardingResponse = this.LL;
        int iHashCode = (takoOnBoardingResponse == null ? 0 : takoOnBoardingResponse.hashCode()) * 31;
        List<InterfaceC1891350zJl> list = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        EnumC1863020ya4 enumC1863020ya4 = this.LLILZ;
        int iHashCode3 = (((((iHashCode2 + (enumC1863020ya4 == null ? 0 : enumC1863020ya4.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        Integer num = this.LLIZ;
        return ((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnboardingState(responseData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", animateStart=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", attachEligibility=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", currentSubConversationType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasAskedQuestion=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", hasSentMessageInCurrentPage=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1863140yaG(int i) {
        this(null, null, false, null, false, false, null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1863140yaG(TakoOnBoardingResponse takoOnBoardingResponse, List<? extends InterfaceC1891350zJl> list, boolean z, EnumC1863020ya4 enumC1863020ya4, boolean z2, boolean z3, Integer num, boolean z4, boolean z5) {
        this.LL = takoOnBoardingResponse;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = enumC1863020ya4;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = num;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
    }

    public static C1863140yaG LIZ(C1863140yaG c1863140yaG, TakoOnBoardingResponse takoOnBoardingResponse, List list, boolean z, EnumC1863020ya4 enumC1863020ya4, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z4;
        Integer num2 = num;
        boolean z8 = z3;
        boolean z9 = z2;
        EnumC1863020ya4 enumC1863020ya42 = enumC1863020ya4;
        boolean z10 = z;
        List list2 = list;
        TakoOnBoardingResponse takoOnBoardingResponse2 = takoOnBoardingResponse;
        if ((i & 1) != 0) {
            takoOnBoardingResponse2 = c1863140yaG.LL;
        }
        if ((i & 2) != 0) {
            list2 = c1863140yaG.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z10 = c1863140yaG.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1863020ya42 = c1863140yaG.LLILZ;
        }
        if ((i & 16) != 0) {
            z9 = c1863140yaG.LLILZIL;
        }
        if ((i & 32) != 0) {
            z8 = c1863140yaG.LLILZLL;
        }
        if ((i & 64) != 0) {
            num2 = c1863140yaG.LLIZ;
        }
        if ((i & 128) != 0) {
            z7 = c1863140yaG.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z6 = c1863140yaG.LLJ;
        }
        c1863140yaG.getClass();
        return new C1863140yaG(takoOnBoardingResponse2, list2, z10, enumC1863020ya42, z9, z8, num2, z7, z6);
    }
}
