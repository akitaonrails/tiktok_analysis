package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658470tG9 {
    public final InterfaceC1665350tRF<? extends InterfaceC1665520tRW> LIZ;

    public C1658470tG9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1658470tG9) && Intrinsics.LJFF(this.LIZ, ((C1658470tG9) obj).LIZ);
    }

    public C1658470tG9(InterfaceC1665350tRF<? extends InterfaceC1665520tRW> interfaceC1665350tRF) {
        this.LIZ = interfaceC1665350tRF;
    }
}
