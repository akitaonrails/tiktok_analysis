package X;

import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.12zP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19936112zP implements InterfaceC19933712z1 {
    public final Class<?> LIZ;
    public final C19939112zt LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C19936612zU LJ;

    @Override // X.InterfaceC19933712z1
    public InterfaceC19931912yj LJI() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // X.InterfaceC19933712z1
    public final boolean LIZ(AbstractC19933512yz<?> abstractC19933512yz) {
        if (!this.LIZLLL) {
            if (this.LIZJ) {
                if (((InterfaceC19931112yb) k0.invokeOrDie(this.LJ.LJI, abstractC19933512yz, new Object[0])).getNumber() != this.LIZIZ.getNumber()) {
                    return false;
                }
                return true;
            }
            return !LIZLLL(abstractC19933512yz).equals(this.LIZIZ.LJIIZILJ());
        }
        return ((Boolean) k0.invokeOrDie(this.LJ.LJ, abstractC19933512yz, new Object[0])).booleanValue();
    }

    @Override // X.InterfaceC19933712z1
    public Object LIZIZ(k0 k0Var) {
        return k0.invokeOrDie(this.LJ.LIZ, k0Var, new Object[0]);
    }

    @Override // X.InterfaceC19933712z1
    public final boolean LIZJ(k0 k0Var) {
        if (!this.LIZLLL) {
            if (this.LIZJ) {
                if (((InterfaceC19931112yb) k0.invokeOrDie(this.LJ.LJFF, k0Var, new Object[0])).getNumber() != this.LIZIZ.getNumber()) {
                    return false;
                }
                return true;
            }
            return !LIZIZ(k0Var).equals(this.LIZIZ.LJIIZILJ());
        }
        return ((Boolean) k0.invokeOrDie(this.LJ.LIZLLL, k0Var, new Object[0])).booleanValue();
    }

    @Override // X.InterfaceC19933712z1
    public Object LIZLLL(AbstractC19933512yz<?> abstractC19933512yz) {
        return k0.invokeOrDie(this.LJ.LIZIZ, abstractC19933512yz, new Object[0]);
    }

    @Override // X.InterfaceC19933712z1
    public final int LJ(k0 k0Var) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // X.InterfaceC19933712z1
    public InterfaceC19931912yj LJII(AbstractC19933512yz<?> abstractC19933512yz) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // X.InterfaceC19933712z1
    public Object LJIIIZ(k0 k0Var) {
        return LIZIZ(k0Var);
    }

    @Override // X.InterfaceC19933712z1
    public final Object LJFF(k0 k0Var, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // X.InterfaceC19933712z1
    public void LJIIIIZZ(AbstractC19933512yz<?> abstractC19933512yz, Object obj) throws Throwable {
        k0.invokeOrDie(this.LJ.LIZJ, abstractC19933512yz, obj);
    }

    @Override // X.InterfaceC19933712z1
    public final void LJIIJ(AbstractC19933512yz<?> abstractC19933512yz, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19936112zP(X.C19939112zt r9, java.lang.String r10, java.lang.Class<? extends com.google.protobuf.k0> r11, java.lang.Class<? extends X.AbstractC19933512yz<?>> r12, java.lang.String r13) {
        /*
            r8 = this;
            r8.<init>()
            X.12zu r0 = r9.LLJILJIL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L14
            X.12zt[] r1 = r0.LLIZ
            int r0 = r1.length
            if (r0 != r3) goto L33
            r0 = r1[r2]
            boolean r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L33
        L14:
            r6 = 0
        L15:
            r8.LIZJ = r6
            boolean r7 = r9.LJJII()
            r8.LIZLLL = r7
            X.12zU r1 = new X.12zU
            r5 = r13
            r4 = r12
            r3 = r11
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.LIZIZ = r9
            java.lang.reflect.Method r0 = r1.LIZ
            java.lang.Class r0 = r0.getReturnType()
            r8.LIZ = r0
            r8.LJ = r1
            return
        L33:
            r6 = 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19936112zP.<init>(X.12zt, java.lang.String, java.lang.Class, java.lang.Class, java.lang.String):void");
    }
}
