package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004640cFa {
    public final String LIZ;
    public final String LIZIZ;

    public C1004640cFa() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1004640cFa)) {
            return false;
        }
        C1004640cFa c1004640cFa = (C1004640cFa) obj;
        return Intrinsics.LJFF(this.LIZ, c1004640cFa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1004640cFa.LIZIZ);
    }

    public C1004640cFa(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
