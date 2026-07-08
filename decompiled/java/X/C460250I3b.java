package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460250I3b implements InterfaceC460300I3g {
    public final String LIZIZ;
    public final Function2<C1360520lVa, Context, Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BidiFormat(id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        C460250I3b c460250I3b;
        if (this == obj) {
            return true;
        }
        String str = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C460250I3b.class, cls)) {
            return false;
        }
        String str2 = this.LIZIZ;
        if ((obj instanceof C460250I3b) && (c460250I3b = (C460250I3b) obj) != null) {
            str = c460250I3b.LIZIZ;
        }
        if (Intrinsics.LJFF(str2, str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C460250I3b(String str, Function2<? super C1360520lVa, ? super Context, Unit> function2) {
        this.LIZIZ = str;
        this.LIZJ = function2;
    }
}
