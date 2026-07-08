package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C1890907at implements InterfaceC871310YGb {
    public final List<C869590Y9l> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1890907at) && Intrinsics.LJFF(this.LJIIIZ, ((C1890907at) obj).LJIIIZ);
    }

    public final int hashCode() {
        return this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalPushReceived(messages=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1890907at(List<? extends C869590Y9l> list) {
        this.LJIIIZ = list;
    }
}
