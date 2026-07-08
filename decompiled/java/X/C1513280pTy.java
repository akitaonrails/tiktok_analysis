package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513280pTy {
    public static final C1513280pTy LIZLLL = new C1513280pTy(1.0f, "Default", -1);
    public final int LIZ;
    public final String LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1513280pTy)) {
            return false;
        }
        C1513280pTy c1513280pTy = (C1513280pTy) obj;
        return this.LIZ == c1513280pTy.LIZ && Intrinsics.LJFF(this.LIZIZ, c1513280pTy.LIZIZ) && Float.compare(this.LIZJ, c1513280pTy.LIZJ) == 0;
    }

    public C1513280pTy(float f, String str, int i) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = f;
    }
}
