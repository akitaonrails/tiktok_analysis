package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0umC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716780umC implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final WalletFlowDecision LLILZ;
    public final String LLILZIL;

    public C1716780umC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1716780umC)) {
            return false;
        }
        C1716780umC c1716780umC = (C1716780umC) obj;
        return this.LL == c1716780umC.LL && Intrinsics.LJFF(this.LLILLJJLI, c1716780umC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1716780umC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1716780umC.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1716780umC.LLILZIL);
    }

    public final int hashCode() {
        EnumC488160JCk enumC488160JCk = this.LL;
        int iHashCode = (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WalletFlowDecision walletFlowDecision = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (walletFlowDecision == null ? 0 : walletFlowDecision.hashCode())) * 31;
        String str3 = this.LLILZIL;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideWalletEntryState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reportErrorMsg=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1716780umC(int i) {
        this(null, null, null, null, null);
    }

    public C1716780umC(EnumC488160JCk enumC488160JCk, String str, String str2, WalletFlowDecision walletFlowDecision, String str3) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = walletFlowDecision;
        this.LLILZIL = str3;
    }

    public static C1716780umC LIZ(C1716780umC c1716780umC, EnumC488160JCk enumC488160JCk, String str, String str2, WalletFlowDecision walletFlowDecision, String str3, int i) {
        String str4 = str3;
        WalletFlowDecision walletFlowDecision2 = walletFlowDecision;
        String str5 = str2;
        String str6 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk2 = c1716780umC.LL;
        }
        if ((i & 2) != 0) {
            str6 = c1716780umC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str5 = c1716780umC.LLILLL;
        }
        if ((i & 8) != 0) {
            walletFlowDecision2 = c1716780umC.LLILZ;
        }
        if ((i & 16) != 0) {
            str4 = c1716780umC.LLILZIL;
        }
        c1716780umC.getClass();
        return new C1716780umC(enumC488160JCk2, str6, str5, walletFlowDecision2, str4);
    }
}
