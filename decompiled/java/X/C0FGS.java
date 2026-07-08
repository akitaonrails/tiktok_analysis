package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGS {
    public final List<C0FGT> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FGS)) {
            return false;
        }
        C0FGS c0fgs = (C0FGS) obj;
        return Intrinsics.LJFF(this.LIZ, c0fgs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fgs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fgs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fgs.LIZLLL);
    }

    public C0FGS() {
        this(C13BV.INSTANCE, "", "", null);
    }

    public C0FGS(List<C0FGT> list, String str, String str2, String str3) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
