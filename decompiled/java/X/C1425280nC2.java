package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425280nC2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1425280nC2) && Intrinsics.LJFF(this.LIZ, ((C1425280nC2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1425280nC2(String str) {
        this.LIZ = str;
    }
}
