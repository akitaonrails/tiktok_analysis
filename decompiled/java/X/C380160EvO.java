package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380160EvO {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Function1<C380160EvO, Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380160EvO)) {
            return false;
        }
        C380160EvO c380160EvO = (C380160EvO) obj;
        return this.LIZ == c380160EvO.LIZ && this.LIZIZ == c380160EvO.LIZIZ && this.LIZJ == c380160EvO.LIZJ && Intrinsics.LJFF(this.LIZLLL, c380160EvO.LIZLLL);
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Function1<C380160EvO, Unit> function1 = this.LIZLLL;
        return i + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MenuActionItem(variant=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startIconId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onClickListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C380160EvO(int i, int i2, int i3, Function1<? super C380160EvO, Unit> function1) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = function1;
    }
}
