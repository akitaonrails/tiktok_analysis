package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608930NuV implements InterfaceC0148002o {
    public final String LL;

    public C608930NuV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C608930NuV) && Intrinsics.LJFF(this.LL, ((C608930NuV) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickExternalShareState(triggerSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C608930NuV(int i) {
        this("");
    }

    public C608930NuV(String str) {
        this.LL = str;
    }
}
