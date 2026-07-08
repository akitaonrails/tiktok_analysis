package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2016807vC {
    public final boolean LIZ;
    public final CharSequence LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016807vC)) {
            return false;
        }
        C2016807vC c2016807vC = (C2016807vC) obj;
        return this.LIZ == c2016807vC.LIZ && Intrinsics.LJFF(this.LIZIZ, c2016807vC.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        CharSequence charSequence = this.LIZIZ;
        return iZ2 + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public C2016807vC(CharSequence charSequence, boolean z) {
        this.LIZ = z;
        this.LIZIZ = charSequence;
    }
}
