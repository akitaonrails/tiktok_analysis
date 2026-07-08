package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676530tjH {
    public final Function1<C1682900ttY, C1676820tjk> LIZ;
    public final InterfaceC1675680thu<C1676820tjk> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676530tjH)) {
            return false;
        }
        C1676530tjH c1676530tjH = (C1676530tjH) obj;
        return Intrinsics.LJFF(this.LIZ, c1676530tjH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1676530tjH.LIZIZ);
    }

    public C1676530tjH(InterfaceC1675680thu interfaceC1675680thu, Function1 function1) {
        this.LIZ = function1;
        this.LIZIZ = interfaceC1675680thu;
    }
}
