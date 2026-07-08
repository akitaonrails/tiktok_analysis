package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700400Rde {
    public final String LIZ;
    public C700400Rde LIZIZ;
    public final LinkedHashMap<String, C700400Rde> LIZJ = new LinkedHashMap<>();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C700400Rde) && Intrinsics.LJFF(this.LIZ, ((C700400Rde) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotTreeNode(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C700400Rde(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C700400Rde c700400Rde) {
        C700400Rde c700400Rde2;
        if (c700400Rde == this || (c700400Rde2 = c700400Rde.LIZIZ) == this || c700400Rde2 != null) {
            return;
        }
        this.LIZJ.put(c700400Rde.LIZ, c700400Rde);
        c700400Rde.LIZIZ = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Function1<? super C700400Rde, Unit> function1) {
        Iterator<T> it2 = this.LIZJ.values().iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
