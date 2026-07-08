package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387180FGa {
    public final String LIZ;
    public final String LIZIZ;

    public C387180FGa() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C387180FGa)) {
            return false;
        }
        C387180FGa c387180FGa = (C387180FGa) obj;
        return Intrinsics.LJFF(this.LIZ, c387180FGa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c387180FGa.LIZIZ);
    }

    public C387180FGa(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
