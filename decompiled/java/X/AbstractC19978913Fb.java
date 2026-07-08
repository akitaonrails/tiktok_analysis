package X;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19978913Fb implements InterfaceC19983313Gt {
    public final String LIZ;
    public final InterfaceC19983313Gt LIZIZ;
    public final InterfaceC19983313Gt LIZJ;
    public final int LIZLLL = 2;

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('(');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final C13GW LIZIZ() {
        return C19982713Gn.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final List getAnnotations() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LIZJ(int i) {
        return String.valueOf(i);
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> LJFF(int i) {
        if (i >= 0) {
            return C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Illegal index ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" expects only non-negative indices");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJII(String str) {
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
        if (numLJIIJJI != null) {
            return numLJIIJJI.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" is not a valid map index");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19983313Gt
    public final InterfaceC19983313Gt LJIIIIZZ(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.LIZJ;
                }
                "Unreached".toString();
                throw new IllegalStateException("Unreached");
            }
            return this.LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Illegal index ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" expects only non-negative indices");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean LJIIIZ(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Illegal index ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" expects only non-negative indices");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC19978913Fb)) {
            return false;
        }
        AbstractC19978913Fb abstractC19978913Fb = (AbstractC19978913Fb) obj;
        if (Intrinsics.LJFF(this.LIZ, abstractC19978913Fb.LIZ) && Intrinsics.LJFF(this.LIZIZ, abstractC19978913Fb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, abstractC19978913Fb.LIZJ)) {
            return true;
        }
        return false;
    }

    public AbstractC19978913Fb(String str, InterfaceC19983313Gt interfaceC19983313Gt, InterfaceC19983313Gt interfaceC19983313Gt2) {
        this.LIZ = str;
        this.LIZIZ = interfaceC19983313Gt;
        this.LIZJ = interfaceC19983313Gt2;
    }
}
