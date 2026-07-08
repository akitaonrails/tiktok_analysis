package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868650yj9 extends AbstractC1868670yjB {
    public final InterfaceC1868700yjE LIZIZ;
    public final InterfaceC1868700yjE LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868650yj9)) {
            return false;
        }
        C1868650yj9 c1868650yj9 = (C1868650yj9) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1868650yj9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868650yj9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1868650yj9.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        InterfaceC1868700yjE interfaceC1868700yjE = this.LIZJ;
        return ((iHashCode + (interfaceC1868700yjE == null ? 0 : interfaceC1868700yjE.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiType2(title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventPopUpType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1868670yjB
    public final String LIZ() {
        return this.LIZLLL;
    }

    public C1868650yj9(C1868640yj8 c1868640yj8, C1868640yj8 c1868640yj82, String str) {
        super(str);
        this.LIZIZ = c1868640yj8;
        this.LIZJ = c1868640yj82;
        this.LIZLLL = str;
    }
}
