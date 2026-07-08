package X;

import com.google.protobuf.k0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19936312zR implements InterfaceC19933712z1 {
    public final Class<?> LIZ;
    public final C19936712zV LIZIZ;

    @Override // X.InterfaceC19933712z1
    public InterfaceC19931912yj LJI() {
        throw new UnsupportedOperationException("newBuilderForField() called on a repeated field.");
    }

    @Override // X.InterfaceC19933712z1
    public final boolean LIZ(AbstractC19933512yz<?> abstractC19933512yz) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // X.InterfaceC19933712z1
    public Object LIZIZ(k0 k0Var) {
        return k0.invokeOrDie(this.LIZIZ.LIZ, k0Var, new Object[0]);
    }

    @Override // X.InterfaceC19933712z1
    public final boolean LIZJ(k0 k0Var) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // X.InterfaceC19933712z1
    public Object LIZLLL(AbstractC19933512yz<?> abstractC19933512yz) {
        return k0.invokeOrDie(this.LIZIZ.LIZIZ, abstractC19933512yz, new Object[0]);
    }

    @Override // X.InterfaceC19933712z1
    public final int LJ(k0 k0Var) {
        return ((Integer) k0.invokeOrDie(this.LIZIZ.LJFF, k0Var, new Object[0])).intValue();
    }

    @Override // X.InterfaceC19933712z1
    public final InterfaceC19931912yj LJII(AbstractC19933512yz<?> abstractC19933512yz) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a repeated field.");
    }

    @Override // X.InterfaceC19933712z1
    public final Object LJIIIZ(k0 k0Var) {
        return LIZIZ(k0Var);
    }

    @Override // X.InterfaceC19933712z1
    public Object LJFF(k0 k0Var, int i) {
        return k0.invokeOrDie(this.LIZIZ.LIZJ, k0Var, Integer.valueOf(i));
    }

    @Override // X.InterfaceC19933712z1
    public final void LJIIIIZZ(AbstractC19933512yz<?> abstractC19933512yz, Object obj) throws Throwable {
        k0.invokeOrDie(this.LIZIZ.LJII, abstractC19933512yz, new Object[0]);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            LJIIJ(abstractC19933512yz, it2.next());
        }
    }

    @Override // X.InterfaceC19933712z1
    public void LJIIJ(AbstractC19933512yz<?> abstractC19933512yz, Object obj) throws Throwable {
        k0.invokeOrDie(this.LIZIZ.LJ, abstractC19933512yz, obj);
    }

    public C19936312zR(Class cls, Class cls2, String str) {
        C19936712zV c19936712zV = new C19936712zV(cls, cls2, str);
        this.LIZ = c19936712zV.LIZJ.getReturnType();
        this.LIZIZ = c19936712zV;
    }
}
