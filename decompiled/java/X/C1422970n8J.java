package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422970n8J {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C1422970n8J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422970n8J)) {
            return false;
        }
        C1422970n8J c1422970n8J = (C1422970n8J) obj;
        return Intrinsics.LJFF(this.LIZ, c1422970n8J.LIZ) && this.LIZIZ == c1422970n8J.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1422970n8J.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1422970n8J.LIZLLL) && this.LJ == c1422970n8J.LJ && Intrinsics.LJFF(this.LJFF, c1422970n8J.LJFF);
    }

    public C1422970n8J(int i) {
        this(0, null, null, null, false, C13BV.INSTANCE);
    }

    public C1422970n8J(int i, String str, String str2, String str3, boolean z, List list) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = str3;
    }
}
