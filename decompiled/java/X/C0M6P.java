package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M6P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M6P {
    public final String LIZ;
    public final String LIZIZ;
    public final C0M6S LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M6P)) {
            return false;
        }
        C0M6P c0m6p = (C0M6P) obj;
        return Intrinsics.LJFF(this.LIZ, c0m6p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0m6p.LIZIZ) && this.LIZJ == c0m6p.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftBoxAiRemixVideoData(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M6P() {
        this("", "", C0M6S.NONE);
    }

    public C0M6P(String str, String str2, C0M6S c0m6s) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0m6s;
    }
}
