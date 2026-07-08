package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680780tq8 extends AbstractC1680810tqB {
    public final C1683130ttv LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.AbstractC1680810tqB
    public final C1683130ttv LIZ() {
        return this.LIZ;
    }

    public C1680780tq8(C1683130ttv c1683130ttv) {
        this.LIZ = c1683130ttv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1680780tq8) && Intrinsics.LJFF(this.LIZ, ((C1680780tq8) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
