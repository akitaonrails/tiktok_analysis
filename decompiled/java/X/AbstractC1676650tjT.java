package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1676650tjT {
    public static final C1676550tjJ LIZ = new C1676550tjJ(new C1676690tjX(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 63));
    public static final C1676550tjJ LIZIZ = new C1676550tjJ(new C1676690tjX(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, true, 0 == true ? 1 : 0, 47));

    public abstract C1676690tjX LIZ();

    public final String toString() {
        if (Intrinsics.LJFF(this, LIZ)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.LJFF(this, LIZIZ)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C1676690tjX c1676690tjXLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitTransition: \nFade - ");
        C1676520tjG c1676520tjG = c1676690tjXLIZ.LIZ;
        sbLIZ.append(c1676520tjG != null ? c1676520tjG.toString() : null);
        sbLIZ.append(",\nSlide - ");
        C1676530tjH c1676530tjH = c1676690tjXLIZ.LIZIZ;
        sbLIZ.append(c1676530tjH != null ? c1676530tjH.toString() : null);
        sbLIZ.append(",\nShrink - ");
        C1676760tje c1676760tje = c1676690tjXLIZ.LIZJ;
        sbLIZ.append(c1676760tje != null ? c1676760tje.toString() : null);
        sbLIZ.append(",\nScale - ");
        C1676660tjU c1676660tjU = c1676690tjXLIZ.LIZLLL;
        sbLIZ.append(c1676660tjU != null ? c1676660tjU.toString() : null);
        sbLIZ.append(",\nKeepUntilTransitionsFinished - ");
        sbLIZ.append(c1676690tjXLIZ.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final C1676550tjJ LIZIZ(AbstractC1676650tjT abstractC1676650tjT) {
        boolean z;
        C1676520tjG c1676520tjG = abstractC1676650tjT.LIZ().LIZ;
        if (c1676520tjG == null) {
            c1676520tjG = LIZ().LIZ;
        }
        C1676530tjH c1676530tjH = abstractC1676650tjT.LIZ().LIZIZ;
        if (c1676530tjH == null) {
            c1676530tjH = LIZ().LIZIZ;
        }
        C1676760tje c1676760tje = abstractC1676650tjT.LIZ().LIZJ;
        if (c1676760tje == null) {
            c1676760tje = LIZ().LIZJ;
        }
        C1676660tjU c1676660tjU = abstractC1676650tjT.LIZ().LIZLLL;
        if (c1676660tjU == null) {
            c1676660tjU = LIZ().LIZLLL;
        }
        if (!abstractC1676650tjT.LIZ().LJ && !LIZ().LJ) {
            z = false;
        } else {
            z = true;
        }
        return new C1676550tjJ(new C1676690tjX(c1676520tjG, c1676530tjH, c1676760tje, c1676660tjU, z, C2097608Jq.LJIIL(LIZ().LJFF, abstractC1676650tjT.LIZ().LJFF)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC1676650tjT) && Intrinsics.LJFF(((AbstractC1676650tjT) obj).LIZ(), LIZ())) {
            return true;
        }
        return false;
    }
}
