package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004620cFY implements InterfaceC0148002o {
    public final C1004640cFa LL;

    public C1004620cFY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1004620cFY) && Intrinsics.LJFF(this.LL, ((C1004620cFY) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostCepRuleState(cepRuleEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1004620cFY(int i) {
        this(new C1004640cFa(null, null));
    }

    public C1004620cFY(C1004640cFa c1004640cFa) {
        this.LL = c1004640cFa;
    }
}
