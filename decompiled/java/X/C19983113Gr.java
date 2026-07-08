package X;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19983113Gr implements InterfaceC19983313Gt {
    public final InterfaceC19983313Gt LIZ;
    public final C13IQ<?> LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC19983313Gt
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC19983313Gt
    public final C13GW LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC19983313Gt
    public final String LIZJ(int i) {
        return this.LIZ.LIZJ(i);
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> LJFF(int i) {
        return this.LIZ.LJFF(i);
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJII(String str) {
        return this.LIZ.LJII(str);
    }

    @Override // X.InterfaceC19983313Gt
    public final InterfaceC19983313Gt LJIIIIZZ(int i) {
        return this.LIZ.LJIIIIZZ(i);
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean LJIIIZ(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> getAnnotations() {
        return this.LIZ.getAnnotations();
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean isInline() {
        return this.LIZ.isInline();
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContextDescriptor(kClass: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", original: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final String LJI() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        C19983113Gr c19983113Gr;
        if (obj instanceof C19983113Gr) {
            c19983113Gr = (C19983113Gr) obj;
        } else {
            c19983113Gr = null;
        }
        if (c19983113Gr == null || !Intrinsics.LJFF(this.LIZ, c19983113Gr.LIZ) || !Intrinsics.LJFF(c19983113Gr.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C19983113Gr(C19983813Gy c19983813Gy, C13IQ c13iq) {
        this.LIZ = c19983813Gy;
        this.LIZIZ = c13iq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19983813Gy.LIZ);
        sbLIZ.append('<');
        sbLIZ.append(c13iq.LJI());
        sbLIZ.append('>');
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
