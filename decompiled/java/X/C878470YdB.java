package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878470YdB implements InterfaceC878560YdK {
    public final C878950Ydx LIZ;
    public final C877210Yb9 LIZIZ;
    public final C878390Yd3 LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878470YdB)) {
            return false;
        }
        C878470YdB c878470YdB = (C878470YdB) obj;
        return Intrinsics.LJFF(this.LIZ, c878470YdB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c878470YdB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c878470YdB.LIZJ) && this.LIZLLL == c878470YdB.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationDataSourceArgs(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", identifier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", seqIdHelper=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC878560YdK
    public final int LJFF() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC878560YdK
    public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 getKey() {
        return this.LIZ;
    }

    public C878470YdB(C878950Ydx c878950Ydx, C877210Yb9 c877210Yb9) {
        C878390Yd3 c878390Yd3 = C878390Yd3.LIZ;
        int i = C878570YdL.LIZ.paginationCount;
        this.LIZ = c878950Ydx;
        this.LIZIZ = c877210Yb9;
        this.LIZJ = c878390Yd3;
        this.LIZLLL = i;
    }
}
