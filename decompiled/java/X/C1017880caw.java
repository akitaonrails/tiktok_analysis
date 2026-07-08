package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0caw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017880caw extends AbstractC1017850cat {
    public final EnumC1017980cb6 LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017880caw)) {
            return false;
        }
        C1017880caw c1017880caw = (C1017880caw) obj;
        return this.LIZ == c1017880caw.LIZ && Intrinsics.LJFF(this.LIZIZ, c1017880caw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateChange(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1017880caw(EnumC1017980cb6 enumC1017980cb6, String str) {
        this.LIZ = enumC1017980cb6;
        this.LIZIZ = str;
    }
}
