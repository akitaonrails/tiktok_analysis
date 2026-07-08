package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262981Dho {
    public final C833003Ng LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2262981Dho)) {
            return false;
        }
        C2262981Dho c2262981Dho = (C2262981Dho) obj;
        return Intrinsics.LJFF(this.LIZ, c2262981Dho.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2262981Dho.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2262981Dho.LIZJ);
    }

    public C2262981Dho(C833003Ng c833003Ng, String str, Integer num) {
        this.LIZ = c833003Ng;
        this.LIZIZ = str;
        this.LIZJ = num;
    }
}
