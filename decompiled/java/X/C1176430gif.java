package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176430gif {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176430gif)) {
            return false;
        }
        C1176430gif c1176430gif = (C1176430gif) obj;
        return Intrinsics.LJFF(this.LIZ, c1176430gif.LIZ) && this.LIZIZ == c1176430gif.LIZIZ;
    }

    public C1176430gif(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
