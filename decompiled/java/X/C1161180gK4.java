package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161180gK4 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1161180gK4) && Intrinsics.LJFF(this.LIZ, ((C1161180gK4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1161180gK4(String str) {
        this.LIZ = str;
    }
}
