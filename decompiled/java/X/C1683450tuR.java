package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683450tuR {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683450tuR)) {
            return false;
        }
        C1683450tuR c1683450tuR = (C1683450tuR) obj;
        return Intrinsics.LJFF(this.LIZ, c1683450tuR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1683450tuR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1683450tuR.LIZJ) && this.LIZLLL == c1683450tuR.LIZLLL;
    }

    public C1683450tuR(String str, List<String> list, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
