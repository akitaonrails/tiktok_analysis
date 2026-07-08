package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908950ZlF implements InterfaceC0148002o {
    public final AbstractC909840Zmg LL;

    public C908950ZlF() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C908950ZlF) && Intrinsics.LJFF(this.LL, ((C908950ZlF) obj).LL);
    }

    public final int hashCode() {
        AbstractC909840Zmg abstractC909840Zmg = this.LL;
        if (abstractC909840Zmg == null) {
            return 0;
        }
        return abstractC909840Zmg.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GreetingCardViewModelState(greetingCardState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C908950ZlF(AbstractC909840Zmg abstractC909840Zmg) {
        this.LL = abstractC909840Zmg;
    }
}
