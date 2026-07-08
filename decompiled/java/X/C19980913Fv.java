package X;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19980913Fv implements InterfaceC19983313Gt {
    public final String LIZ;
    public final C13HJ LIZIZ;

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return 0;
    }

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Primitive descriptor ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" does not have elements");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + (this.LIZIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrimitiveDescriptor(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19983313Gt
    public final /* bridge */ /* synthetic */ C13GW LIZIZ() {
        return this.LIZIZ;
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
        LIZLLL();
        throw null;
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> LJFF(int i) {
        LIZLLL();
        throw null;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJII(String str) {
        LIZLLL();
        throw null;
    }

    @Override // X.InterfaceC19983313Gt
    public final InterfaceC19983313Gt LJIIIIZZ(int i) {
        LIZLLL();
        throw null;
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean LJIIIZ(int i) {
        LIZLLL();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19980913Fv)) {
            return false;
        }
        C19980913Fv c19980913Fv = (C19980913Fv) obj;
        if (Intrinsics.LJFF(this.LIZ, c19980913Fv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19980913Fv.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C19980913Fv(String str, C13HJ c13hj) {
        this.LIZ = str;
        this.LIZIZ = c13hj;
    }
}
