package X;

/* JADX INFO: renamed from: X.0ChX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320610ChX {
    public static String LJ(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized C05YC LIZ(Integer num, Long l) {
        C05YC<C321110CiL> c05ycLIZIZ;
        c05ycLIZIZ = null;
        if (l != null && num != null) {
            C05YC<C321110CiL> c05yc = C320640Cha.LJIIJJI.get(LJ(num.intValue(), l.longValue()));
            if (c05yc == null) {
                c05ycLIZIZ = C09IR.LIZIZ(0, 20, null, 4);
                C320640Cha.LJIIJJI.put(LJ(num.intValue(), l.longValue()), c05ycLIZIZ);
            } else {
                c05ycLIZIZ = c05yc;
            }
        }
        return c05ycLIZIZ;
    }

    public final synchronized C05YC LIZIZ(Integer num, Long l) {
        C05YC<C321120CiM> c05ycLIZIZ;
        c05ycLIZIZ = null;
        if (l != null && num != null) {
            C05YC<C321120CiM> c05yc = C320640Cha.LJIIL.get(LJ(num.intValue(), l.longValue()));
            if (c05yc == null) {
                c05ycLIZIZ = C09IR.LIZIZ(0, 20, null, 4);
                C320640Cha.LJIIL.put(LJ(num.intValue(), l.longValue()), c05ycLIZIZ);
            } else {
                c05ycLIZIZ = c05yc;
            }
        }
        return c05ycLIZIZ;
    }

    public final synchronized InterfaceC332260D0u LIZJ(Integer num, Long l) {
        InterfaceC332260D0u<Boolean> interfaceC332260D0uLIZ;
        if (l != null && num != null) {
            interfaceC332260D0uLIZ = C320640Cha.LJIILJJIL.get(LJ(num.intValue(), l.longValue()));
            if (interfaceC332260D0uLIZ == null) {
                interfaceC332260D0uLIZ = C1BNE.LIZ(Boolean.FALSE);
                C320640Cha.LJIILJJIL.put(LJ(num.intValue(), l.longValue()), interfaceC332260D0uLIZ);
            }
        } else {
            interfaceC332260D0uLIZ = null;
        }
        return interfaceC332260D0uLIZ;
    }

    public final synchronized InterfaceC332260D0u LIZLLL(Integer num, Long l) {
        InterfaceC332260D0u<Boolean> interfaceC332260D0uLIZ;
        if (l != null && num != null) {
            interfaceC332260D0uLIZ = C320640Cha.LJIILIIL.get(LJ(num.intValue(), l.longValue()));
            if (interfaceC332260D0uLIZ == null) {
                interfaceC332260D0uLIZ = C1BNE.LIZ(Boolean.FALSE);
                C320640Cha.LJIILIIL.put(LJ(num.intValue(), l.longValue()), interfaceC332260D0uLIZ);
            }
        } else {
            interfaceC332260D0uLIZ = null;
        }
        return interfaceC332260D0uLIZ;
    }
}
