package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0unZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717630unZ implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final PhoneApi.PhoneChangeSettings LLILZIL;
    public final WalletFlowDecision LLILZLL;

    public C1717630unZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717630unZ)) {
            return false;
        }
        C1717630unZ c1717630unZ = (C1717630unZ) obj;
        return this.LL == c1717630unZ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1717630unZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717630unZ.LLILLL) && this.LLILZ == c1717630unZ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1717630unZ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1717630unZ.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        PhoneApi.PhoneChangeSettings phoneChangeSettings = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (phoneChangeSettings == null ? 0 : phoneChangeSettings.hashCode())) * 31;
        WalletFlowDecision walletFlowDecision = this.LLILZLL;
        return iHashCode4 + (walletFlowDecision != null ? walletFlowDecision.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangePhoneState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isConsultRequest=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", settingsData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", consultResult=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1717630unZ(int i) {
        this(EnumC488160JCk.LOADING, null, null, false, null, null);
    }

    public C1717630unZ(EnumC488160JCk enumC488160JCk, String str, String str2, boolean z, PhoneApi.PhoneChangeSettings phoneChangeSettings, WalletFlowDecision walletFlowDecision) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = phoneChangeSettings;
        this.LLILZLL = walletFlowDecision;
    }

    public static C1717630unZ LIZ(C1717630unZ c1717630unZ, EnumC488160JCk enumC488160JCk, String str, String str2, boolean z, PhoneApi.PhoneChangeSettings phoneChangeSettings, WalletFlowDecision walletFlowDecision, int i) {
        WalletFlowDecision walletFlowDecision2 = walletFlowDecision;
        PhoneApi.PhoneChangeSettings phoneChangeSettings2 = phoneChangeSettings;
        boolean z2 = z;
        String str3 = str2;
        String str4 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk2 = c1717630unZ.LL;
        }
        if ((i & 2) != 0) {
            str4 = c1717630unZ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str3 = c1717630unZ.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1717630unZ.LLILZ;
        }
        if ((i & 16) != 0) {
            phoneChangeSettings2 = c1717630unZ.LLILZIL;
        }
        if ((i & 32) != 0) {
            walletFlowDecision2 = c1717630unZ.LLILZLL;
        }
        c1717630unZ.getClass();
        return new C1717630unZ(enumC488160JCk2, str4, str3, z2, phoneChangeSettings2, walletFlowDecision2);
    }
}
