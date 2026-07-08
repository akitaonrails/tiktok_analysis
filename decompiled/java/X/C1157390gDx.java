package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157390gDx implements InterfaceC111300bX {
    public final EnumC1163260gNQ LL;
    public final String LLILLJJLI;

    public C1157390gDx() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157390gDx)) {
            return false;
        }
        C1157390gDx c1157390gDx = (C1157390gDx) obj;
        return this.LL == c1157390gDx.LL && Intrinsics.LJFF(this.LLILLJJLI, c1157390gDx.LLILLJJLI);
    }

    public final int hashCode() {
        EnumC1163260gNQ enumC1163260gNQ = this.LL;
        return ((enumC1163260gNQ == null ? 0 : enumC1163260gNQ.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WhiteNoiseData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157390gDx(EnumC1163260gNQ enumC1163260gNQ, String str) {
        this.LL = enumC1163260gNQ;
        this.LLILLJJLI = str;
    }
}
