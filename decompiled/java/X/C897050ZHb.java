package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897050ZHb implements InterfaceC1233504s9 {
    public final EnumC897070ZHd LIZ;
    public final InterfaceC460300I3g LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C897050ZHb)) {
            return false;
        }
        C897050ZHb c897050ZHb = (C897050ZHb) obj;
        return this.LIZ == c897050ZHb.LIZ && Intrinsics.LJFF(this.LIZIZ, c897050ZHb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextInlineLabelData(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C897050ZHb(EnumC897070ZHd enumC897070ZHd, C1233604sA c1233604sA) {
        this.LIZ = enumC897070ZHd;
        this.LIZIZ = c1233604sA;
    }
}
