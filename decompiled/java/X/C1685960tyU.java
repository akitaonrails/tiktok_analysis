package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685960tyU<T> extends AbstractC1686000tyY<T> {
    public final int LIZJ;

    public C1685960tyU() {
        throw null;
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((((t != null ? t.hashCode() : 0) * 31) + this.LIZJ) * 31) + this.LIZIZ.hashCode();
    }

    public C1685960tyU(Object obj) {
        super(obj, C05Y0.LIZLLL);
        this.LIZJ = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1685960tyU)) {
            return false;
        }
        C1685960tyU c1685960tyU = (C1685960tyU) obj;
        if (Intrinsics.LJFF(c1685960tyU.LIZ, this.LIZ) && Intrinsics.LJFF(c1685960tyU.LIZIZ, this.LIZIZ) && c1685960tyU.LIZJ == this.LIZJ) {
            return true;
        }
        return false;
    }
}
