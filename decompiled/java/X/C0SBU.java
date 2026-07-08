package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SBU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SBU {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SBU) && Intrinsics.LJFF(this.LIZ, ((C0SBU) obj).LIZ);
    }

    public C0SBU(String str) {
        this.LIZ = str;
    }
}
