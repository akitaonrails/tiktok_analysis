package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120090fFn implements InterfaceC111300bX {
    public final C1817550xOj LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1120090fFn) && Intrinsics.LJFF(this.LL, ((C1120090fFn) obj).LL);
    }

    public final int hashCode() {
        C1817550xOj c1817550xOj = this.LL;
        if (c1817550xOj == null) {
            return 0;
        }
        return c1817550xOj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecorationEditHierarchyData(decorationEditLogData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1120090fFn(C1817550xOj c1817550xOj) {
        this.LL = c1817550xOj;
    }
}
