package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.069w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15626069w implements InterfaceC904740ZeS {
    public final int LIZ;
    public final C869590Y9l LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15626069w)) {
            return false;
        }
        C15626069w c15626069w = (C15626069w) obj;
        return this.LIZ == c15626069w.LIZ && Intrinsics.LJFF(this.LIZIZ, c15626069w.LIZIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnAddMessageEvent";
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnAddMessageEvent(statusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15626069w(C869590Y9l c869590Y9l, int i) {
        this.LIZ = i;
        this.LIZIZ = c869590Y9l;
    }
}
