package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981713Gd implements C13HG<C19981913Gf> {
    public static final C19981713Gd LIZ = new C19981713Gd();
    public static final C19980913Fv LIZIZ;

    static {
        C19982013Gg c19982013Gg = C19982013Gg.LIZ;
        if (!(!a0.LJJJIL("kotlinx.serialization.json.JsonLiteral"))) {
            "Blank serial names are prohibited".toString();
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        for (C13HG<?> c13hg : C13HM.LIZ.values()) {
            if (Intrinsics.LJFF("kotlinx.serialization.json.JsonLiteral", c13hg.getDescriptor().LJI())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ");
                sbLIZ.append("kotlinx.serialization.json.JsonLiteral");
                sbLIZ.append(" there already exists ");
                sbLIZ.append(C13LE.LIZ(c13hg.getClass()).LJI());
                sbLIZ.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
            }
        }
        LIZIZ = new C19980913Fv("kotlinx.serialization.json.JsonLiteral", c19982013Gg);
    }

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        AbstractC19979113Fd abstractC19979113FdLJIL = C19981313Fz.LIZ(c13hb).LJIL();
        if (abstractC19979113FdLJIL instanceof C19981913Gf) {
            return abstractC19979113FdLJIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected JSON element, expected JsonLiteral, had ");
        sbLIZ.append(C13LE.LIZ(abstractC19979113FdLJIL.getClass()));
        throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ), abstractC19979113FdLJIL.toString(), -1);
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19981913Gf c19981913Gf = (C19981913Gf) obj;
        C19981313Fz.LIZIZ(c13hd);
        if (c19981913Gf.LL) {
            c13hd.LJIIIIZZ(c19981913Gf.LLILLL);
            return;
        }
        InterfaceC19983313Gt interfaceC19983313Gt = c19981913Gf.LLILLJJLI;
        if (interfaceC19983313Gt != null) {
            c13hd.LIZJ(interfaceC19983313Gt).LJIIIIZZ(c19981913Gf.LLILLL);
            return;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c19981913Gf.LLILLL);
        if (lLJIILIIL != null) {
            c13hd.LJIILL(lLJIILIIL.longValue());
            return;
        }
        C19969813Bo c19969813BoLJ = C19970013Bq.LJ(c19981913Gf.LLILLL);
        if (c19969813BoLJ != null) {
            c13hd.LIZJ(C13H5.LIZIZ).LJIILL(c19969813BoLJ.LL);
            return;
        }
        Double dLJII = C2327809Ae.LJII(c19981913Gf.LLILLL);
        if (dLJII != null) {
            c13hd.LJJIFFI(dLJII.doubleValue());
            return;
        }
        Boolean boolLJLI = a0.LJLI(c19981913Gf.LLILLL);
        if (boolLJLI != null) {
            c13hd.LJII(boolLJLI.booleanValue());
        } else {
            c13hd.LJIIIIZZ(c19981913Gf.LLILLL);
        }
    }
}
