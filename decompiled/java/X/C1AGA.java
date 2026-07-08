package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AGA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGA {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AGA)) {
            return false;
        }
        C1AGA c1aga = (C1AGA) obj;
        return Intrinsics.LJFF(this.LIZ, c1aga.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1aga.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1aga.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1aga.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationTask(animationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1AGA(String str, Integer num, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
