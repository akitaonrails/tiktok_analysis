package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SWS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWS extends C0SWR {
    public final C0SWK LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SWS) && Intrinsics.LJFF(this.LL, ((C0SWS) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescItem(descStruct=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0SWR
    public final C0SWK LIZ() {
        return this.LL;
    }

    public C0SWS(C0SWK c0swk) {
        this.LL = c0swk;
    }
}
