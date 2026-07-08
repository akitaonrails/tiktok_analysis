package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002907sx implements InterfaceC0148002o {
    public final Set<C869590Y9l> LL;

    public C2002907sx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2002907sx) && Intrinsics.LJFF(this.LL, ((C2002907sx) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageSelectedState(selectedMessages=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2002907sx(int i) {
        this(C08CX.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2002907sx(Set<? extends C869590Y9l> set) {
        this.LL = set;
    }
}
