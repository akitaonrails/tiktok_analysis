package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908850Zl5 {
    public final String LIZ;
    public final Function1<TuxTextView, Unit> LIZIZ;

    public C908850Zl5() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908850Zl5)) {
            return false;
        }
        C908850Zl5 c908850Zl5 = (C908850Zl5) obj;
        return Intrinsics.LJFF(this.LIZ, c908850Zl5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c908850Zl5.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Title(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", configure=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C908850Zl5(String str, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AFwS248S0000000_14.get$arr$(515) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C908850Zl5(String str, Function1<? super TuxTextView, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
