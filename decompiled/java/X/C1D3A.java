package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D3A, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3A {
    public final String LIZ;
    public final C2252061DCq LIZIZ;
    public C1D3A LIZJ;
    public C1D3A LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1D3A)) {
            return false;
        }
        C1D3A c1d3a = (C1D3A) obj;
        return Intrinsics.LJFF(this.LIZ, c1d3a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1d3a.LIZIZ);
    }

    public C1D3A(String str, C2252061DCq c2252061DCq) {
        this.LIZ = str;
        this.LIZIZ = c2252061DCq;
    }
}
