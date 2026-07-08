package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597100NbQ implements InterfaceC0148002o {
    public final C291001Au<EnumC597760NcU> LL;

    public C597100NbQ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C597100NbQ) && Intrinsics.LJFF(this.LL, ((C597100NbQ) obj).LL);
    }

    public final int hashCode() {
        C291001Au<EnumC597760NcU> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitState(submitStatusEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C597100NbQ(C291001Au<? extends EnumC597760NcU> c291001Au) {
        this.LL = c291001Au;
    }
}
