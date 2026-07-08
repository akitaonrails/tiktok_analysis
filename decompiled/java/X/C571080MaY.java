package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571080MaY<C> extends AbstractC571190Maj<C> {
    public final String LIZ;
    public final EnumC571120Mac LIZIZ;
    public final Function1<C, Boolean> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C571080MaY)) {
            return false;
        }
        C571080MaY c571080MaY = (C571080MaY) obj;
        return Intrinsics.LJFF(this.LIZ, c571080MaY.LIZ) && this.LIZIZ == c571080MaY.LIZIZ && Intrinsics.LJFF(this.LIZJ, c571080MaY.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Simple(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", evaluator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC571190Maj
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC571190Maj
    public final EnumC571120Mac LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C571080MaY(String str, EnumC571120Mac enumC571120Mac, Function1<? super C, Boolean> function1) {
        this.LIZ = str;
        this.LIZIZ = enumC571120Mac;
        this.LIZJ = function1;
    }
}
