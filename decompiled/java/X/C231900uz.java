package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231900uz implements InterfaceC0148002o {
    public final C291001Au<String> LL;

    public C231900uz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231900uz) && Intrinsics.LJFF(this.LL, ((C231900uz) obj).LL);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBottomSurveyButtonState(showButtonEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231900uz(C291001Au<String> c291001Au) {
        this.LL = c291001Au;
    }
}
