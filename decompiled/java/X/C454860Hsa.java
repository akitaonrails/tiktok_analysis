package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454860Hsa implements InterfaceC454940Hsi {
    public final C19EG LIZ;
    public final C869590Y9l LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454860Hsa)) {
            return false;
        }
        C454860Hsa c454860Hsa = (C454860Hsa) obj;
        return Intrinsics.LJFF(this.LIZ, c454860Hsa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454860Hsa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c454860Hsa.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromMessage(fragmentActivity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454860Hsa(C19EG c19eg, C869590Y9l c869590Y9l, String str) {
        this.LIZ = c19eg;
        this.LIZIZ = c869590Y9l;
        this.LIZJ = str;
    }
}
