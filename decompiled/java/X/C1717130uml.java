package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717130uml implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final WalletFlowDecision LLILZIL;
    public final EnumC1717110umj LLILZLL;

    public C1717130uml() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717130uml)) {
            return false;
        }
        C1717130uml c1717130uml = (C1717130uml) obj;
        return this.LL == c1717130uml.LL && Intrinsics.LJFF(this.LLILLJJLI, c1717130uml.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717130uml.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1717130uml.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1717130uml.LLILZIL) && this.LLILZLL == c1717130uml.LLILZLL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WalletFlowDecision walletFlowDecision = this.LLILZIL;
        return ((iHashCode4 + (walletFlowDecision != null ? walletFlowDecision.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletEntryState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reportErrorMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1717130uml(int i) {
        this(EnumC488160JCk.LOADING, null, null, null, null, EnumC1717110umj.REGISTRATION);
    }

    public C1717130uml(EnumC488160JCk enumC488160JCk, String str, String str2, String str3, WalletFlowDecision walletFlowDecision, EnumC1717110umj enumC1717110umj) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = walletFlowDecision;
        this.LLILZLL = enumC1717110umj;
    }

    public static C1717130uml LIZ(C1717130uml c1717130uml, EnumC488160JCk enumC488160JCk, String str, String str2, String str3, WalletFlowDecision walletFlowDecision, EnumC1717110umj enumC1717110umj, int i) {
        EnumC1717110umj enumC1717110umj2 = enumC1717110umj;
        WalletFlowDecision walletFlowDecision2 = walletFlowDecision;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk2 = c1717130uml.LL;
        }
        if ((i & 2) != 0) {
            str6 = c1717130uml.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str5 = c1717130uml.LLILLL;
        }
        if ((i & 8) != 0) {
            str4 = c1717130uml.LLILZ;
        }
        if ((i & 16) != 0) {
            walletFlowDecision2 = c1717130uml.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC1717110umj2 = c1717130uml.LLILZLL;
        }
        c1717130uml.getClass();
        return new C1717130uml(enumC488160JCk2, str6, str5, str4, walletFlowDecision2, enumC1717110umj2);
    }
}
