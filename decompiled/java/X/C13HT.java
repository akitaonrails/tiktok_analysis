package X;

/* JADX INFO: renamed from: X.13HT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13HT<K, V, R> implements C13HG<R> {
    public final C13HG<K> LIZ;
    public final C13HG<V> LIZIZ;

    public abstract K LIZ(R r);

    public abstract V LIZIZ(R r);

    public abstract R LIZJ(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19984213Hc
    public final R deserialize(C13HB c13hb) {
        InterfaceC19983313Gt descriptor = getDescriptor();
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(descriptor);
        interfaceC19986313HxLIZIZ.LJJII();
        Object objLJI = C19984013Ha.LIZ;
        Object objLJI2 = objLJI;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(getDescriptor());
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ == 1) {
                        objLJI2 = interfaceC19986313HxLIZIZ.LJI(getDescriptor(), 1, this.LIZIZ, null);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid index: ");
                        sbLIZ.append(iLJIJJ);
                        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    objLJI = interfaceC19986313HxLIZIZ.LJI(getDescriptor(), 0, this.LIZ, null);
                }
            } else {
                Object obj = C19984013Ha.LIZ;
                if (objLJI != obj) {
                    if (objLJI2 != obj) {
                        R r = (R) LIZJ(objLJI, objLJI2);
                        interfaceC19986313HxLIZIZ.LJIIJJI(descriptor);
                        return r;
                    }
                    throw new C19981113Fx("Element 'value' is missing");
                }
                throw new C19981113Fx("Element 'key' is missing");
            }
        }
    }

    public C13HT(C13HG c13hg, C13HG c13hg2) {
        this.LIZ = c13hg;
        this.LIZIZ = c13hg2;
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, R r) {
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(getDescriptor());
        interfaceC19986513HzLIZIZ.LJJIIJ(getDescriptor(), 0, this.LIZ, LIZ(r));
        interfaceC19986513HzLIZIZ.LJJIIJ(getDescriptor(), 1, this.LIZIZ, LIZIZ(r));
        getDescriptor();
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
