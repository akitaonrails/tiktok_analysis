package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IK implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;

    public C00IK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00IK) && Intrinsics.LJFF(this.LL, ((C00IK) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntelligentBoardTemplatePreviewVMState(intelligentBoardList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00IK(int i) {
        this(new ArrayList());
    }

    public C00IK(List<InterfaceC1891350zJl> list) {
        this.LL = list;
    }
}
