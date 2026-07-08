package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146430fwH {
    public final C1146360fwA LIZ;
    public final InterfaceC1665500tRU<C1146350fw9> LIZIZ;
    public final EnumC1146490fwN LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146430fwH)) {
            return false;
        }
        C1146430fwH c1146430fwH = (C1146430fwH) obj;
        return Intrinsics.LJFF(this.LIZ, c1146430fwH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1146430fwH.LIZIZ) && this.LIZJ == c1146430fwH.LIZJ;
    }

    public C1146430fwH(C1146360fwA c1146360fwA, InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU, EnumC1146490fwN enumC1146490fwN) {
        this.LIZ = c1146360fwA;
        this.LIZIZ = interfaceC1665500tRU;
        this.LIZJ = enumC1146490fwN;
    }
}
