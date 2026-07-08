package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422410n7P {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public String LJFF;
    public Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422410n7P)) {
            return false;
        }
        C1422410n7P c1422410n7P = (C1422410n7P) obj;
        return Intrinsics.LJFF(this.LIZ, c1422410n7P.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1422410n7P.LIZIZ) && this.LIZJ == c1422410n7P.LIZJ && this.LIZLLL == c1422410n7P.LIZLLL && Intrinsics.LJFF(this.LJ, c1422410n7P.LJ);
    }

    public C1422410n7P(int i, String str, boolean z) {
        String string = UUID.randomUUID().toString();
        this.LIZ = "create_tab_search";
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = string;
    }
}
