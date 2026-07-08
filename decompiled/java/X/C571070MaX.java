package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571070MaX<C> extends AbstractC571190Maj<C> {
    public final String LIZ;
    public final List<C571050MaV<C>> LIZIZ;
    public final EnumC571120Mac LIZJ = EnumC571120Mac.REQUIRE_ANY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C571070MaX)) {
            return false;
        }
        C571070MaX c571070MaX = (C571070MaX) obj;
        return Intrinsics.LJFF(this.LIZ, c571070MaX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c571070MaX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequireAny(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", options=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC571190Maj
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC571190Maj
    public final EnumC571120Mac LIZIZ() {
        return this.LIZJ;
    }

    public C571070MaX(String str, List<C571050MaV<C>> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
