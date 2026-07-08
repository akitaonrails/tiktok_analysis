package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0Jdu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496720Jdu implements InterfaceC0148002o {
    public final C496700Jds LL;

    public C496720Jdu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C496720Jdu) && Intrinsics.LJFF(this.LL, ((C496720Jdu) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceInfoHeaderVMState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C496720Jdu(int i) {
        this(new C496700Jds((SMBPreviewResponse.ResponseData) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (Long) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 2047));
    }

    public C496720Jdu(C496700Jds c496700Jds) {
        this.LL = c496700Jds;
    }
}
