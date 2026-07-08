package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534930q2t {
    public final String LIZ;
    public final EnumC1984207pw LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1534930q2t)) {
            return false;
        }
        C1534930q2t c1534930q2t = (C1534930q2t) obj;
        return Intrinsics.LJFF(this.LIZ, c1534930q2t.LIZ) && this.LIZIZ == c1534930q2t.LIZIZ;
    }

    public C1534930q2t(String str, EnumC1984207pw enumC1984207pw) {
        this.LIZ = str;
        this.LIZIZ = enumC1984207pw;
    }
}
