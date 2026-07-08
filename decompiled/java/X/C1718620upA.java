package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinForgotConsultResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718620upA implements InterfaceC0148002o {
    public final PinForgotConsultResult LL;
    public final HintPageMsg LLILLJJLI;
    public final C1718700upI LLILLL;
    public final EnumC488160JCk LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final long LLIZ;

    public C1718620upA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718620upA)) {
            return false;
        }
        C1718620upA c1718620upA = (C1718620upA) obj;
        return Intrinsics.LJFF(this.LL, c1718620upA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718620upA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718620upA.LLILLL) && this.LLILZ == c1718620upA.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1718620upA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718620upA.LLILZLL) && this.LLIZ == c1718620upA.LLIZ;
    }

    public final int hashCode() {
        PinForgotConsultResult pinForgotConsultResult = this.LL;
        int iHashCode = (pinForgotConsultResult == null ? 0 : pinForgotConsultResult.hashCode()) * 31;
        HintPageMsg hintPageMsg = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (hintPageMsg == null ? 0 : hintPageMsg.hashCode())) * 31;
        C1718700upI c1718700upI = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1718700upI == null ? 0 : c1718700upI.hashCode())) * 31;
        EnumC488160JCk enumC488160JCk = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZLL;
        return ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinForgotViewState(pinForgotConsultInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hintPageMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", alertInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", consultStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", interfaceReturnCost=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1718620upA(int i) {
        this(null, null, null, null, null, null, 0L);
    }

    public C1718620upA(PinForgotConsultResult pinForgotConsultResult, HintPageMsg hintPageMsg, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, String str, String str2, long j) {
        this.LL = pinForgotConsultResult;
        this.LLILLJJLI = hintPageMsg;
        this.LLILLL = c1718700upI;
        this.LLILZ = enumC488160JCk;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = j;
    }

    public static C1718620upA LIZ(C1718620upA c1718620upA, PinForgotConsultResult pinForgotConsultResult, HintPageMsg hintPageMsg, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, String str, String str2, long j, int i) {
        long j2 = j;
        String str3 = str2;
        String str4 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        C1718700upI c1718700upI2 = c1718700upI;
        HintPageMsg hintPageMsg2 = hintPageMsg;
        PinForgotConsultResult pinForgotConsultResult2 = pinForgotConsultResult;
        if ((i & 1) != 0) {
            pinForgotConsultResult2 = c1718620upA.LL;
        }
        if ((i & 2) != 0) {
            hintPageMsg2 = c1718620upA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1718700upI2 = c1718620upA.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC488160JCk2 = c1718620upA.LLILZ;
        }
        if ((i & 16) != 0) {
            str4 = c1718620upA.LLILZIL;
        }
        if ((i & 32) != 0) {
            str3 = c1718620upA.LLILZLL;
        }
        if ((i & 64) != 0) {
            j2 = c1718620upA.LLIZ;
        }
        c1718620upA.getClass();
        return new C1718620upA(pinForgotConsultResult2, hintPageMsg2, c1718700upI2, enumC488160JCk2, str4, str3, j2);
    }
}
