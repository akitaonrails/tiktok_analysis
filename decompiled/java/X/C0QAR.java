package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QAR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QAR)) {
            return false;
        }
        C0QAR c0qar = (C0QAR) obj;
        return Intrinsics.LJFF(this.LIZ, c0qar.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0qar.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0qar.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateItem(mobEventName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateString=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QAR(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
