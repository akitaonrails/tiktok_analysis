package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710770RuN {
    public final EnumC715680S5m LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C710770RuN)) {
            return false;
        }
        C710770RuN c710770RuN = (C710770RuN) obj;
        return this.LIZ == c710770RuN.LIZ && Intrinsics.LJFF(this.LIZIZ, c710770RuN.LIZIZ);
    }

    public C710770RuN(EnumC715680S5m enumC715680S5m, String str) {
        this.LIZ = enumC715680S5m;
        this.LIZIZ = str;
    }
}
