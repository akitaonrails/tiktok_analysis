package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.PinChangeConsultResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718730upL implements InterfaceC0148002o {
    public final PinChangeConsultResult LL;
    public final C1718700upI LLILLJJLI;
    public final EnumC488160JCk LLILLL;
    public final C1718790upR LLILZ;
    public final long LLILZIL;

    public C1718730upL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718730upL)) {
            return false;
        }
        C1718730upL c1718730upL = (C1718730upL) obj;
        return Intrinsics.LJFF(this.LL, c1718730upL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718730upL.LLILLJJLI) && this.LLILLL == c1718730upL.LLILLL && Intrinsics.LJFF(this.LLILZ, c1718730upL.LLILZ) && this.LLILZIL == c1718730upL.LLILZIL;
    }

    public final int hashCode() {
        PinChangeConsultResult pinChangeConsultResult = this.LL;
        int iHashCode = (pinChangeConsultResult == null ? 0 : pinChangeConsultResult.hashCode()) * 31;
        C1718700upI c1718700upI = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1718700upI == null ? 0 : c1718700upI.hashCode())) * 31;
        EnumC488160JCk enumC488160JCk = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode())) * 31;
        C1718790upR c1718790upR = this.LLILZ;
        return ((iHashCode3 + (c1718790upR != null ? c1718790upR.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinOfflineViewState(pinChangeConsultResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", alertInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", consultStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", consultErrorContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1718730upL(int i) {
        this(null, null, null, null, 0L);
    }

    public C1718730upL(PinChangeConsultResult pinChangeConsultResult, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, C1718790upR c1718790upR, long j) {
        this.LL = pinChangeConsultResult;
        this.LLILLJJLI = c1718700upI;
        this.LLILLL = enumC488160JCk;
        this.LLILZ = c1718790upR;
        this.LLILZIL = j;
    }

    public static C1718730upL LIZ(C1718730upL c1718730upL, PinChangeConsultResult pinChangeConsultResult, C1718700upI c1718700upI, EnumC488160JCk enumC488160JCk, C1718790upR c1718790upR, long j, int i) {
        long j2 = j;
        C1718790upR c1718790upR2 = c1718790upR;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        C1718700upI c1718700upI2 = c1718700upI;
        PinChangeConsultResult pinChangeConsultResult2 = pinChangeConsultResult;
        if ((i & 1) != 0) {
            pinChangeConsultResult2 = c1718730upL.LL;
        }
        if ((i & 2) != 0) {
            c1718700upI2 = c1718730upL.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC488160JCk2 = c1718730upL.LLILLL;
        }
        if ((i & 8) != 0) {
            c1718790upR2 = c1718730upL.LLILZ;
        }
        if ((i & 16) != 0) {
            j2 = c1718730upL.LLILZIL;
        }
        c1718730upL.getClass();
        return new C1718730upL(pinChangeConsultResult2, c1718700upI2, enumC488160JCk2, c1718790upR2, j2);
    }
}
