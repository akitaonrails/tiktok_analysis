package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258904wF implements InterfaceC460300I3g {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1258904wF) && Intrinsics.LJFF(this.LIZIZ, ((C1258904wF) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(txt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258904wF(String str) {
        this.LIZIZ = str;
    }
}
