package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Esf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378470Esf {
    public final String LIZ;
    public final String LIZIZ;

    public C378470Esf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378470Esf)) {
            return false;
        }
        C378470Esf c378470Esf = (C378470Esf) obj;
        return Intrinsics.LJFF(this.LIZ, c378470Esf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378470Esf.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIStylePrompt(defaultPrompt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", i2iPrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C378470Esf(int i) {
        this("", "");
    }

    public C378470Esf(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
