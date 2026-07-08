package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSY implements InterfaceC874460YSe {
    public final C0Y8T LIZ;
    public final C0YSX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YSY)) {
            return false;
        }
        C0YSY c0ysy = (C0YSY) obj;
        return Intrinsics.LJFF(this.LIZ, c0ysy.LIZ) && this.LIZIZ == c0ysy.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Updated(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YSY(C0Y8T c0y8t, C0YSX c0ysx) {
        this.LIZ = c0y8t;
        this.LIZIZ = c0ysx;
    }
}
