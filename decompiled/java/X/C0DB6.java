package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DB6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DB6 extends C0DB8 {
    public final String LIZ;

    public C0DB6() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DB6) && Intrinsics.LJFF(this.LIZ, ((C0DB6) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(inlineMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DB6(String str) {
        this.LIZ = str;
    }
}
