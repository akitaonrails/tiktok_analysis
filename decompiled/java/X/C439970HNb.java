package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439970HNb implements InterfaceC440050HNj {
    public final C0H7H LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439970HNb)) {
            return false;
        }
        C439970HNb c439970HNb = (C439970HNb) obj;
        return this.LIZ == c439970HNb.LIZ && Intrinsics.LJFF(this.LIZIZ, c439970HNb.LIZIZ) && this.LIZJ == c439970HNb.LIZJ;
    }

    public final int hashCode() {
        C0H7H c0h7h = this.LIZ;
        int iHashCode = (c0h7h == null ? 0 : c0h7h.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterTextElement(textType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", placeHolder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C439970HNb(int i, C0H7H c0h7h, String str) {
        this.LIZ = c0h7h;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
