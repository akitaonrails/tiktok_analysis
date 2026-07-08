package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321790kV7 {
    public final String LIZ;
    public final DialogC1321700kUy LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321790kV7)) {
            return false;
        }
        C1321790kV7 c1321790kV7 = (C1321790kV7) obj;
        return Intrinsics.LJFF(this.LIZ, c1321790kV7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1321790kV7.LIZIZ);
    }

    public C1321790kV7(String str, DialogC1321700kUy dialogC1321700kUy) {
        this.LIZ = str;
        this.LIZIZ = dialogC1321700kUy;
    }
}
