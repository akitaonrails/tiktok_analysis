package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231100ur implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public C231100ur() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231100ur) && Intrinsics.LJFF(this.LL, ((C231100ur) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EarlyFeedbackUIState(earlyFeedbackUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231100ur(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
