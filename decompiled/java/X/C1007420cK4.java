package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007420cK4 {
    public final InterfaceC1627120sRa LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1007420cK4)) {
            return false;
        }
        C1007420cK4 c1007420cK4 = (C1007420cK4) obj;
        return Intrinsics.LJFF(this.LIZ, c1007420cK4.LIZ) && this.LIZIZ == c1007420cK4.LIZIZ;
    }

    public C1007420cK4(InterfaceC1627120sRa interfaceC1627120sRa, int i) {
        this.LIZ = interfaceC1627120sRa;
        this.LIZIZ = i;
    }
}
