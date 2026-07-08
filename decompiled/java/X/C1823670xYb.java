package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823670xYb implements InterfaceC0148002o {
    public final EnumC1823680xYc LL;
    public final SMBOptInQualificationResponse.ResponseData LLILLJJLI;
    public final Throwable LLILLL;

    public C1823670xYb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1823670xYb)) {
            return false;
        }
        C1823670xYb c1823670xYb = (C1823670xYb) obj;
        return this.LL == c1823670xYb.LL && Intrinsics.LJFF(this.LLILLJJLI, c1823670xYb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1823670xYb.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        SMBOptInQualificationResponse.ResponseData responseData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (responseData == null ? 0 : responseData.hashCode())) * 31;
        Throwable th = this.LLILLL;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServicePlusOptinState(loadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", qualificationData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageError=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1823670xYb(int i) {
        this(EnumC1823680xYc.BEFORE_LOAD_START, null, null);
    }

    public C1823670xYb(EnumC1823680xYc enumC1823680xYc, SMBOptInQualificationResponse.ResponseData responseData, Throwable th) {
        this.LL = enumC1823680xYc;
        this.LLILLJJLI = responseData;
        this.LLILLL = th;
    }
}
