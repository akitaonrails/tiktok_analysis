package X;

import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715090ujT implements InterfaceC0148002o {
    public final boolean LL;
    public final EnumC1715080ujS LLILLJJLI;
    public DoVerifyResponse LLILLL;
    public final String LLILZ;

    public C1715090ujT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715090ujT)) {
            return false;
        }
        C1715090ujT c1715090ujT = (C1715090ujT) obj;
        return this.LL == c1715090ujT.LL && this.LLILLJJLI == c1715090ujT.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1715090ujT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1715090ujT.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        DoVerifyResponse doVerifyResponse = this.LLILLL;
        int iHashCode = (iZ2 + (doVerifyResponse == null ? 0 : doVerifyResponse.hashCode())) * 31;
        String str = this.LLILZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IDVerifyContentState(needClearError=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", networkStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", verifyResp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1715090ujT(int i) {
        this(false, EnumC1715080ujS.NOT_START, null, null);
    }

    public C1715090ujT(boolean z, EnumC1715080ujS enumC1715080ujS, DoVerifyResponse doVerifyResponse, String str) {
        this.LL = z;
        this.LLILLJJLI = enumC1715080ujS;
        this.LLILLL = doVerifyResponse;
        this.LLILZ = str;
    }

    public static C1715090ujT LIZ(C1715090ujT c1715090ujT, boolean z, EnumC1715080ujS enumC1715080ujS, DoVerifyResponse doVerifyResponse, String str, int i) {
        if ((i & 1) != 0) {
            z = c1715090ujT.LL;
        }
        if ((i & 2) != 0) {
            enumC1715080ujS = c1715090ujT.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            doVerifyResponse = c1715090ujT.LLILLL;
        }
        if ((i & 8) != 0) {
            str = c1715090ujT.LLILZ;
        }
        c1715090ujT.getClass();
        return new C1715090ujT(z, enumC1715080ujS, doVerifyResponse, str);
    }
}
