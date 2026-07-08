package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263200iyc {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C1263190iyb LIZJ;
    public final boolean LIZLLL;
    public final List<InterfaceC1262230ix3> LJ;

    public C1263200iyc() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263200iyc)) {
            return false;
        }
        C1263200iyc c1263200iyc = (C1263200iyc) obj;
        return this.LIZ == c1263200iyc.LIZ && this.LIZIZ == c1263200iyc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1263200iyc.LIZJ) && this.LIZLLL == c1263200iyc.LIZLLL && Intrinsics.LJFF(this.LJ, c1263200iyc.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCardSourceState(isInit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", data=");
        List<InterfaceC1262230ix3> list = this.LJ;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1263200iyc(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1263200iyc(boolean z, boolean z2, C1263190iyb c1263190iyb, boolean z3, List<? extends InterfaceC1262230ix3> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c1263190iyb;
        this.LIZLLL = z3;
        this.LJ = list;
    }
}
