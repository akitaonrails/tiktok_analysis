package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JD3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JD3 implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final WalletFlowDecision LLILLL;

    public C0JD3() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JD3)) {
            return false;
        }
        C0JD3 c0jd3 = (C0JD3) obj;
        return this.LL == c0jd3.LL && Intrinsics.LJFF(this.LLILLJJLI, c0jd3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jd3.LLILLL);
    }

    public final int hashCode() {
        EnumC488160JCk enumC488160JCk = this.LL;
        int iHashCode = (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        WalletFlowDecision walletFlowDecision = this.LLILLL;
        return iHashCode2 + (walletFlowDecision != null ? walletFlowDecision.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsultPhoneChangeState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JD3(EnumC488160JCk enumC488160JCk, String str, WalletFlowDecision walletFlowDecision) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = walletFlowDecision;
    }

    public static C0JD3 LIZ(C0JD3 c0jd3, EnumC488160JCk enumC488160JCk, String str, WalletFlowDecision walletFlowDecision, int i) {
        if ((i & 1) != 0) {
            enumC488160JCk = c0jd3.LL;
        }
        if ((i & 2) != 0) {
            str = c0jd3.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            walletFlowDecision = c0jd3.LLILLL;
        }
        c0jd3.getClass();
        return new C0JD3(enumC488160JCk, str, walletFlowDecision);
    }
}
