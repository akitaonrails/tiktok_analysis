package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2438609h2 implements InterfaceC0148002o {
    public final Pair<Integer, Integer> LL;

    public C2438609h2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2438609h2) && Intrinsics.LJFF(this.LL, ((C2438609h2) obj).LL);
    }

    public final int hashCode() {
        Pair<Integer, Integer> pair = this.LL;
        if (pair == null) {
            return 0;
        }
        return pair.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicHighlightBackgroundState(highlightBackgroundColor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2438609h2(Pair<Integer, Integer> pair) {
        this.LL = pair;
    }
}
