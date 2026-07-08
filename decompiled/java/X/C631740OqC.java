package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631740OqC implements InterfaceC111300bX {
    public final String LL;

    public C631740OqC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C631740OqC) && Intrinsics.LJFF(this.LL, ((C631740OqC) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightSelectListData(shootFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C631740OqC(String str) {
        this.LL = str;
    }
}
