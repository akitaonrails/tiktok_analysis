package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0190, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0190 implements InterfaceC0148002o {
    public final AbstractC2863018z LL;

    public AnonymousClass0190() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0190) && Intrinsics.LJFF(this.LL, ((AnonymousClass0190) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankingPanelState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ AnonymousClass0190(int i) {
        this(AnonymousClass0191.LIZJ);
    }

    public AnonymousClass0190(AbstractC2863018z abstractC2863018z) {
        this.LL = abstractC2863018z;
    }
}
