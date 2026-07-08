package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657460tEW {
    public final InterfaceC1665350tRF<? extends InterfaceC1665520tRW> LIZ;

    public C1657460tEW() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1657460tEW) && Intrinsics.LJFF(this.LIZ, ((C1657460tEW) obj).LIZ);
    }

    public final int hashCode() {
        InterfaceC1665350tRF<? extends InterfaceC1665520tRW> interfaceC1665350tRF = this.LIZ;
        if (interfaceC1665350tRF == null) {
            return 0;
        }
        return interfaceC1665350tRF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterializedShootButtonConfiguration(renderer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1657460tEW(InterfaceC1665350tRF<? extends InterfaceC1665520tRW> interfaceC1665350tRF) {
        this.LIZ = interfaceC1665350tRF;
    }
}
