package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F0R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F0R {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<String, Unit> LIZLLL;
    public final Function1<C0F04, Unit> LJ;
    public final Function0<Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F0R)) {
            return false;
        }
        C0F0R c0f0r = (C0F0R) obj;
        return Intrinsics.LJFF(this.LIZ, c0f0r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f0r.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f0r.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f0r.LIZLLL) && Intrinsics.LJFF(this.LJ, c0f0r.LJ) && Intrinsics.LJFF(this.LJFF, c0f0r.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCEditTextActions(clickAlbum=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickConfigure=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", generateRequest=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onPromptChanged=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mobClickEditFunction=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onBackPressedFromIme=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F0R(C0F0S c0f0s, C0F0T c0f0t, C0F0U c0f0u, C0F0V c0f0v, C0F0Q c0f0q, C0F0M c0f0m) {
        this.LIZ = c0f0s;
        this.LIZIZ = c0f0t;
        this.LIZJ = c0f0u;
        this.LIZLLL = c0f0q;
        this.LJ = c0f0m;
        this.LJFF = c0f0v;
    }
}
