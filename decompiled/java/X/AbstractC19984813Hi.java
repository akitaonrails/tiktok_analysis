package X;

/* JADX INFO: renamed from: X.13Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19984813Hi<T> implements C13HG<T> {
    public abstract C13IQ<T> LIZJ();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19984213Hc
    public final T deserialize(C13HB c13hb) {
        InterfaceC19983313Gt descriptor = getDescriptor();
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(descriptor);
        C259800zU c259800zU = new C259800zU();
        interfaceC19986313HxLIZIZ.LJJII();
        T t = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(getDescriptor());
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) c259800zU.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sbLIZ.append(str);
                        sbLIZ.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sbLIZ.append(iLJIJJ);
                        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    T t2 = c259800zU.element;
                    if (t2 != 0) {
                        c259800zU.element = t2;
                        t = (T) interfaceC19986313HxLIZIZ.LJI(getDescriptor(), iLJIJJ, C19984713Hh.LIZ(this, interfaceC19986313HxLIZIZ, (String) t2), null);
                    } else {
                        "Cannot read polymorphic value before its type token".toString();
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                } else {
                    c259800zU.element = (T) interfaceC19986313HxLIZIZ.LJIILL(getDescriptor(), iLJIJJ);
                }
            } else {
                if (t != null) {
                    interfaceC19986313HxLIZIZ.LJIIJJI(descriptor);
                    return t;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Polymorphic value has not been read for class ");
                sbLIZ2.append((String) c259800zU.element);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        }
    }

    public InterfaceC19984213Hc<T> LIZ(InterfaceC19986313Hx interfaceC19986313Hx, String str) {
        return interfaceC19986313Hx.LIZ().LJ(str, LIZJ());
    }

    public InterfaceC19984413He<T> LIZIZ(C13HD c13hd, T t) {
        return c13hd.LIZ().LJFF(LIZJ(), t);
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, T t) {
        InterfaceC19984413He<? super T> interfaceC19984413HeLIZIZ = C19984713Hh.LIZIZ(this, c13hd, t);
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(getDescriptor());
        interfaceC19986513HzLIZIZ.LJIILIIL(getDescriptor(), 0, interfaceC19984413HeLIZIZ.getDescriptor().LJI());
        interfaceC19986513HzLIZIZ.LJJIIJ(getDescriptor(), 1, interfaceC19984413HeLIZIZ, t);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
