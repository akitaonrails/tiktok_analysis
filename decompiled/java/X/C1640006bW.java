package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1640006bW {
    public final boolean LIZ;
    public final String LIZIZ;
    public final CharSequence LIZJ;
    public final int LIZLLL;

    public C1640006bW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1640006bW)) {
            return false;
        }
        C1640006bW c1640006bW = (C1640006bW) obj;
        return this.LIZ == c1640006bW.LIZ && Intrinsics.LJFF(this.LIZIZ, c1640006bW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1640006bW.LIZJ) && this.LIZLLL == c1640006bW.LIZLLL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.LIZJ;
        return ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputFieldUiState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hint=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", maxLineWhenNoHint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1640006bW(int i) {
        this(5, null, null, true);
    }

    public C1640006bW(int i, CharSequence charSequence, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = charSequence;
        this.LIZLLL = i;
    }

    public static C1640006bW LIZ(C1640006bW c1640006bW, boolean z, String str, CharSequence charSequence, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = c1640006bW.LIZ;
        }
        if ((i2 & 2) != 0) {
            str = c1640006bW.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            charSequence = c1640006bW.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i = c1640006bW.LIZLLL;
        }
        c1640006bW.getClass();
        return new C1640006bW(i, charSequence, str, z);
    }
}
