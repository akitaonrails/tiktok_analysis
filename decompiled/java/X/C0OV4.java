package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OV4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV4 {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC1548390qOb LIZJ;
    public final InterfaceC1541990qEH LIZLLL;

    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == null || !(obj instanceof C0OV4)) {
            return false;
        }
        C0OV4 c0ov4 = (C0OV4) obj;
        if (Intrinsics.LJFF(this.LIZ, c0ov4.LIZ) && ((str = this.LIZ) == null || str.length() == 0)) {
            return true;
        }
        if (!Intrinsics.LJFF(this.LIZ, c0ov4.LIZ) || !Intrinsics.LJFF(this.LIZLLL, c0ov4.LIZLLL) || this.LIZLLL == null) {
            return false;
        }
        return true;
    }

    public C0OV4(String str, long j, InterfaceC1548390qOb interfaceC1548390qOb, InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1548390qOb;
        this.LIZLLL = interfaceC1541990qEH;
    }
}
