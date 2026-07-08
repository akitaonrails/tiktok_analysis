package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998420c5Y implements InterfaceC0148002o {
    public final C998410c5X LL;

    public C998420c5Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C998420c5Y) && Intrinsics.LJFF(this.LL, ((C998420c5Y) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareCepRuleState(cepRuleEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C998420c5Y(int i) {
        this(new C998410c5X(null, null));
    }

    public C998420c5Y(C998410c5X c998410c5X) {
        this.LL = c998410c5X;
    }
}
