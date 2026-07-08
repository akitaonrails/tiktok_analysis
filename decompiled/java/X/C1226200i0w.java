package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226200i0w extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C869290Y8h LJIIIIZZ;
    public final Function1<C0Y8T, Boolean> LJIIIZ;

    public C1226200i0w() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226200i0w)) {
            return false;
        }
        C1226200i0w c1226200i0w = (C1226200i0w) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1226200i0w.LIZLLL) && this.LJ == c1226200i0w.LJ && this.LJFF == c1226200i0w.LJFF && this.LJI == c1226200i0w.LJI && this.LJII == c1226200i0w.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1226200i0w.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1226200i0w.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalConversationDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sortedByAlphabeticalOrder=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", withIndex=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", conversationQuery=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", filterAfterQuery=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1223510hwb
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.C1223510hwb
    public final C20603715jn LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1223510hwb
    public final boolean LIZJ() {
        return this.LJFF;
    }

    public C1226200i0w(C20603715jn c20603715jn, C869290Y8h c869290Y8h, AwS380S0200000_14 awS380S0200000_14) {
        super(c20603715jn, false, false);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = c869290Y8h;
        this.LJIIIZ = awS380S0200000_14;
    }
}
