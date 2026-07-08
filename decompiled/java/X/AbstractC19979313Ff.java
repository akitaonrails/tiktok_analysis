package X;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19979313Ff implements InterfaceC19983313Gt {
    public final InterfaceC19983313Gt LIZ;
    public final int LIZIZ = 1;

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + LJI().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        sbLIZ.append('(');
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final C13GW LIZIZ() {
        return C19982613Gm.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final List getAnnotations() {
        return C13BV.INSTANCE;
    }

    public AbstractC19979313Ff(InterfaceC19983313Gt interfaceC19983313Gt) {
        this.LIZ = interfaceC19983313Gt;
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
        sbLIZ.append(LJI());
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
        sbLIZ.append(" is not a valid list index");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19983313Gt
    public final InterfaceC19983313Gt LJIIIIZZ(int i) {
        if (i >= 0) {
            return this.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Illegal index ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(LJI());
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
        sbLIZ.append(LJI());
        sbLIZ.append(" expects only non-negative indices");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC19979313Ff)) {
            return false;
        }
        AbstractC19979313Ff abstractC19979313Ff = (AbstractC19979313Ff) obj;
        if (Intrinsics.LJFF(this.LIZ, abstractC19979313Ff.LIZ) && Intrinsics.LJFF(LJI(), abstractC19979313Ff.LJI())) {
            return true;
        }
        return false;
    }
}
