package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155840gBS implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155840gBS)) {
            return false;
        }
        C1155840gBS c1155840gBS = (C1155840gBS) obj;
        return Intrinsics.LJFF(this.LL, c1155840gBS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155840gBS.LLILLJJLI) && this.LLILLL == c1155840gBS.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonStepData(stepName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needGetUserPlacement=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155840gBS(String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }
}
