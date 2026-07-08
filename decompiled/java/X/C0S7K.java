package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S7K, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S7K {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S7K)) {
            return false;
        }
        C0S7K c0s7k = (C0S7K) obj;
        return Intrinsics.LJFF(this.LIZ, c0s7k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0s7k.LIZIZ) && this.LIZJ == c0s7k.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0s7k.LIZLLL);
    }

    public C0S7K(CharSequence charSequence, CharSequence charSequence2, boolean z, String str) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
        this.LIZJ = z;
        this.LIZLLL = str;
    }
}
