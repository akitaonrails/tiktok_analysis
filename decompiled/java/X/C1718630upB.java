package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinChangeConsultResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718630upB implements InterfaceC0148002o {
    public final PinChangeConsultResult LL;
    public final HintPageMsg LLILLJJLI;
    public final C1718700upI LLILLL;
    public final EnumC488160JCk LLILZ;
    public final String LLILZIL;
    public final long LLILZLL;

    public C1718630upB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718630upB)) {
            return false;
        }
        C1718630upB c1718630upB = (C1718630upB) obj;
        return Intrinsics.LJFF(this.LL, c1718630upB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718630upB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718630upB.LLILLL) && this.LLILZ == c1718630upB.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1718630upB.LLILZIL) && this.LLILZLL == c1718630upB.LLILZLL;
    }

    public final int hashCode() {
        PinChangeConsultResult pinChangeConsultResult = this.LL;
        int iHashCode = (pinChangeConsultResult == null ? 0 : pinChangeConsultResult.hashCode()) * 31;
        HintPageMsg hintPageMsg = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (hintPageMsg == null ? 0 : hintPageMsg.hashCode())) * 31;
        C1718700upI c1718700upI = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1718700upI == null ? 0 : c1718700upI.hashCode())) * 31;
        EnumC488160JCk enumC488160JCk = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode())) * 31;
        String str = this.LLILZIL;
        return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinChangeViewState(pinChangeConsultResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hintPageMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", alertInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", consultStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", consultErrorContent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", interfaceReturnCost=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1718630upB(int i) {
        this(null, null, null, null, null, 0L);
    }

    public C1718630upB(PinChangeConsultResult pinChangeConsultResult, HintPageMsg hintPageMsg, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, String str, long j) {
        this.LL = pinChangeConsultResult;
        this.LLILLJJLI = hintPageMsg;
        this.LLILLL = c1718700upI;
        this.LLILZ = enumC488160JCk;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    public static C1718630upB LIZ(C1718630upB c1718630upB, PinChangeConsultResult pinChangeConsultResult, HintPageMsg hintPageMsg, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, String str, long j, int i) {
        long j2 = j;
        String str2 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        C1718700upI c1718700upI2 = c1718700upI;
        HintPageMsg hintPageMsg2 = hintPageMsg;
        PinChangeConsultResult pinChangeConsultResult2 = pinChangeConsultResult;
        if ((i & 1) != 0) {
            pinChangeConsultResult2 = c1718630upB.LL;
        }
        if ((i & 2) != 0) {
            hintPageMsg2 = c1718630upB.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1718700upI2 = c1718630upB.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC488160JCk2 = c1718630upB.LLILZ;
        }
        if ((i & 16) != 0) {
            str2 = c1718630upB.LLILZIL;
        }
        if ((i & 32) != 0) {
            j2 = c1718630upB.LLILZLL;
        }
        c1718630upB.getClass();
        return new C1718630upB(pinChangeConsultResult2, hintPageMsg2, c1718700upI2, enumC488160JCk2, str2, j2);
    }
}
