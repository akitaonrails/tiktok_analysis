package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283230jUv {
    public final EnumC1283210jUt LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1283230jUv)) {
            return false;
        }
        C1283230jUv c1283230jUv = (C1283230jUv) obj;
        return this.LIZ == c1283230jUv.LIZ && Intrinsics.LJFF(this.LIZIZ, c1283230jUv.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicPosIdentity(posType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value_=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1CW4 LIZ() {
        return new C1CW4(this.LIZ.into(), this.LIZIZ);
    }

    public C1283230jUv(EnumC1283210jUt enumC1283210jUt, String str) {
        this.LIZ = enumC1283210jUt;
        this.LIZIZ = str;
    }
}
