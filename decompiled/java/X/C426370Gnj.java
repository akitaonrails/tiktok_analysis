package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426370Gnj {
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final List<C21376318l7> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C426370Gnj)) {
            return false;
        }
        C426370Gnj c426370Gnj = (C426370Gnj) obj;
        return Intrinsics.LJFF(this.LIZ, c426370Gnj.LIZ) && this.LIZIZ == c426370Gnj.LIZIZ && this.LIZJ == c426370Gnj.LIZJ;
    }

    public C426370Gnj(List<C21376318l7> list, int i, boolean z) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
