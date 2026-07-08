package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716940SAi implements InterfaceC111300bX {
    public final C716960SAk LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C716940SAi) && Intrinsics.LJFF(this.LL, ((C716940SAi) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPageComponentData(fullPageContext=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C716940SAi(C716960SAk c716960SAk) {
        this.LL = c716960SAk;
    }
}
