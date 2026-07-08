package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676760tje {
    public final InterfaceC1668050tVb LIZ;
    public final Function1<C1682900ttY, C1682900ttY> LIZIZ;
    public final InterfaceC1675680thu<C1682900ttY> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676760tje)) {
            return false;
        }
        C1676760tje c1676760tje = (C1676760tje) obj;
        return Intrinsics.LJFF(this.LIZ, c1676760tje.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1676760tje.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1676760tje.LIZJ) && this.LIZLLL == c1676760tje.LIZLLL;
    }

    public C1676760tje(InterfaceC1675680thu interfaceC1675680thu, InterfaceC1668050tVb interfaceC1668050tVb, Function1 function1, boolean z) {
        this.LIZ = interfaceC1668050tVb;
        this.LIZIZ = function1;
        this.LIZJ = interfaceC1675680thu;
        this.LIZLLL = z;
    }
}
