package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FT implements InterfaceC0148002o {
    public final List<C04FN> LL;

    public C04FT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04FT) && Intrinsics.LJFF(this.LL, ((C04FT) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpHeaderState(itemNodeList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C04FT(int i) {
        this(new ArrayList());
    }

    public C04FT(List<C04FN> list) {
        this.LL = list;
    }
}
