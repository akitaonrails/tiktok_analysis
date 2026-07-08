package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637040Oyk {
    public final int LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C637040Oyk)) {
            return false;
        }
        C637040Oyk c637040Oyk = (C637040Oyk) obj;
        return this.LIZ == c637040Oyk.LIZ && Intrinsics.LJFF(this.LIZIZ, c637040Oyk.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxIconModel(iconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tintColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C637040Oyk(int i, Integer num) {
        this.LIZ = i;
        this.LIZIZ = num;
    }
}
