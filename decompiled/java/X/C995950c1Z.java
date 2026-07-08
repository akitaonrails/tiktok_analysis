package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995950c1Z implements InterfaceC0148002o {
    public final String LL;

    public C995950c1Z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995950c1Z) && Intrinsics.LJFF(this.LL, ((C995950c1Z) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleTextTemplateEditState(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995950c1Z(int i) {
        this("");
    }

    public C995950c1Z(String str) {
        this.LL = str;
    }
}
