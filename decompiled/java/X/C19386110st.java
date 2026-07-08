package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19386110st extends C19386210su {
    public final /* synthetic */ AbstractC19391210ti LIZLLL;

    public C19386110st() {
        throw null;
    }

    public final int LIZ() {
        Integer numValueOf;
        if (this.LIZIZ) {
            C19384910sh c19384910sh = this.LIZJ;
            Integer num = c19384910sh.LIZJ;
            if (num != null) {
                return num.intValue();
            }
            Integer num2 = c19384910sh.LIZIZ;
            return (num2 == null || (numValueOf = Integer.valueOf((int) (((float) num2.intValue()) / this.LIZ))) == null) ? LIZIZ() : numValueOf.intValue();
        }
        C19384910sh c19384910sh2 = this.LIZJ;
        Integer num3 = c19384910sh2.LJ;
        if (num3 != null) {
            return num3.intValue();
        }
        return (int) ((c19384910sh2.LIZLLL != null ? r0.intValue() : LIZJ()) / this.LIZ);
    }

    public final int LIZIZ() {
        AbstractC19391210ti abstractC19391210ti = this.LIZLLL;
        int i = (abstractC19391210ti.LJIIJJI - abstractC19391210ti.LJIIL) - abstractC19391210ti.LJIILIIL;
        int i2 = AbstractC19391210ti.LJIJ;
        return Math.min(i - i2, abstractC19391210ti.LJIIJ - (i2 * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    }

    public final int LIZJ() {
        Integer numValueOf;
        if (this.LIZIZ) {
            C19384910sh c19384910sh = this.LIZJ;
            Integer num = c19384910sh.LIZIZ;
            if (num != null) {
                return num.intValue();
            }
            return (int) ((c19384910sh.LIZJ != null ? r0.intValue() : LIZ()) * this.LIZ);
        }
        C19384910sh c19384910sh2 = this.LIZJ;
        Integer num2 = c19384910sh2.LIZLLL;
        if (num2 != null) {
            return num2.intValue();
        }
        Integer num3 = c19384910sh2.LJ;
        return (num3 == null || (numValueOf = Integer.valueOf((int) (((float) num3.intValue()) * this.LIZ))) == null) ? LIZIZ() : numValueOf.intValue();
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowSizeInternal( w/h: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPortrait: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mode: ");
        sbLIZ.append(this.LIZJ.LIZ);
        sbLIZ.append(" ), Dimen( max: (");
        int i = this.LIZLLL.LJIIJ;
        int i2 = AbstractC19391210ti.LJIJ;
        sbLIZ.append(i - (i2 * 2));
        sbLIZ.append(", ");
        AbstractC19391210ti abstractC19391210ti = this.LIZLLL;
        sbLIZ.append(((abstractC19391210ti.LJIIJJI - abstractC19391210ti.LJIIL) - abstractC19391210ti.LJIILIIL) - i2);
        sbLIZ.append("), real: (");
        sbLIZ.append(LIZJ());
        sbLIZ.append(", ");
        sbLIZ.append(LIZ());
        sbLIZ.append("))");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C19386110st.class, cls)) {
            return false;
        }
        C19386210su c19386210su = (C19386210su) obj;
        if (this.LIZ == c19386210su.LIZ && this.LIZIZ == c19386210su.LIZIZ && Intrinsics.LJFF(this.LIZJ, c19386210su.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19386110st(AbstractC19391210ti abstractC19391210ti, C19386210su c19386210su) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        float f = c19386210su.LIZ;
        boolean z = c19386210su.LIZIZ;
        C19384910sh c19384910sh = c19386210su.LIZJ;
        this.LIZLLL = abstractC19391210ti;
        super(f, z, c19384910sh);
        if (LIZJ() > LIZIZ() || LIZ() > LIZIZ()) {
            float fMax = Math.max(LIZJ(), LIZ()) / (LIZIZ() - 1);
            if (c19384910sh.LIZIZ != null) {
                numValueOf = Integer.valueOf((int) (r0.intValue() / fMax));
            } else {
                numValueOf = null;
            }
            c19384910sh.LIZIZ = numValueOf;
            if (c19384910sh.LIZLLL != null) {
                numValueOf2 = Integer.valueOf((int) (r0.intValue() / fMax));
            } else {
                numValueOf2 = null;
            }
            c19384910sh.LIZLLL = numValueOf2;
            if (c19384910sh.LIZJ != null) {
                numValueOf3 = Integer.valueOf((int) (r0.intValue() / fMax));
            } else {
                numValueOf3 = null;
            }
            c19384910sh.LIZJ = numValueOf3;
            c19384910sh.LJ = c19384910sh.LJ != null ? Integer.valueOf((int) (r0.intValue() / fMax)) : null;
            AbstractC1604130rqV abstractC1604130rqVLJFF = abstractC19391210ti.LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[WindowSizeInternal#init] Window size adjusted to fit window with ");
            sbLIZ.append(fMax);
            sbLIZ.append(". Current spec: ");
            sbLIZ.append(this);
            abstractC1604130rqVLJFF.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
