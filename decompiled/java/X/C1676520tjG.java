package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676520tjG {
    public final float LIZ;
    public final InterfaceC1675680thu<Float> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676520tjG)) {
            return false;
        }
        C1676520tjG c1676520tjG = (C1676520tjG) obj;
        return Float.compare(this.LIZ, c1676520tjG.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1676520tjG.LIZIZ);
    }

    public C1676520tjG(float f, InterfaceC1675680thu<Float> interfaceC1675680thu) {
        this.LIZ = f;
        this.LIZIZ = interfaceC1675680thu;
    }
}
