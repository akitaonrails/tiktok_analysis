package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442290HVz {
    public final String LIZ;
    public final InterfaceC1685750ty9 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C442290HVz)) {
            return false;
        }
        C442290HVz c442290HVz = (C442290HVz) obj;
        return Intrinsics.LJFF(this.LIZ, c442290HVz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c442290HVz.LIZIZ);
    }

    public C442290HVz() {
        this(InterfaceC1685750ty9.LIZ, "");
    }

    public C442290HVz(InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1685750ty9;
    }
}
