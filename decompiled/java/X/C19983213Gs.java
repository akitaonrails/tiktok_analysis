package X;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19983213Gs implements InterfaceC19983313Gt, InterfaceC1865240yde {
    public final InterfaceC19983313Gt LIZ;
    public final String LIZIZ;
    public final Set<String> LIZJ;

    @Override // X.InterfaceC19983313Gt
    public final boolean LIZ() {
        return true;
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
        return this.LIZ.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('?');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1865240yde
    public final Set<String> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LJI() {
        return this.LIZIZ;
    }

    public C19983213Gs(InterfaceC19983313Gt interfaceC19983313Gt) {
        this.LIZ = interfaceC19983313Gt;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19983313Gt.LJI());
        sbLIZ.append('?');
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = C13GE.LIZ(interfaceC19983313Gt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19983213Gs) && Intrinsics.LJFF(this.LIZ, ((C19983213Gs) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
