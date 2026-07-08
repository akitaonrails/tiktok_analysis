package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454390Hrp {
    public final boolean LIZ;
    public final String LIZIZ;

    public C454390Hrp() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454390Hrp)) {
            return false;
        }
        C454390Hrp c454390Hrp = (C454390Hrp) obj;
        return this.LIZ == c454390Hrp.LIZ && Intrinsics.LJFF(this.LIZIZ, c454390Hrp.LIZIZ);
    }

    public C454390Hrp(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
