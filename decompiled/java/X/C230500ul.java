package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C230500ul implements InterfaceC0148002o {
    public final C291001Au<Pair<String, String>> LL;

    public C230500ul() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C230500ul) && Intrinsics.LJFF(this.LL, ((C230500ul) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Pair<String, String>> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerListShareInfo(selectedInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C230500ul(Object obj) {
        this.LL = null;
    }
}
