package Y;

import X.C09RO;
import X.C13GJ;
import X.C13GU;
import X.C13GV;
import X.C13GX;
import X.C13HR;
import X.C13HS;
import X.C13JW;
import X.C13JZ;
import X.C1954807lC;
import X.C19981813Ge;
import X.C202139147l;
import X.C2188811AlT;
import X.EnumC19989213Ja;
import X.InterfaceC19983313Gt;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS373S0100000_30 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public AObjectS373S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) aObjectS373S0100000_30.l0;
        int iIntValue = ((Integer) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19983313Gt.LIZJ(iIntValue));
        sbLIZ.append(": ");
        sbLIZ.append(interfaceC19983313Gt.LJIIIIZZ(iIntValue).LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        ((C13GJ) obj).LIZIZ = ((C13HR) aObjectS373S0100000_30.l0).LIZIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        C13HS c13hs = (C13HS) aObjectS373S0100000_30.l0;
        C13GJ c13gj = (C13GJ) obj;
        C13GJ.LIZ(c13gj, "first", c13hs.LIZ.getDescriptor());
        C13GJ.LIZ(c13gj, "second", c13hs.LIZIZ.getDescriptor());
        C13GJ.LIZ(c13gj, "third", c13hs.LIZJ.getDescriptor());
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #1 {Exception -> 0x0054, blocks: (B:7:0x0019, B:9:0x002b, B:11:0x0031, B:13:0x0035, B:15:0x0039, B:17:0x003e, B:18:0x0049), top: B:49:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(Y.AObjectS373S0100000_30 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS373S0100000_30.invoke$3(Y.AObjectS373S0100000_30, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        C13JW c13jw;
        String strValueOf;
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        ((C13JW) aObjectS373S0100000_30.l0).getClass();
        if (kTypeProjection.LIZ == null) {
            return "*";
        }
        C09RO c09ro = kTypeProjection.LIZIZ;
        if (c09ro instanceof C13JW) {
            c13jw = (C13JW) c09ro;
        } else {
            c13jw = null;
        }
        if (c13jw == null || (strValueOf = c13jw.LIZJ(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.LIZIZ);
        }
        EnumC19989213Ja enumC19989213Ja = kTypeProjection.LIZ;
        if (enumC19989213Ja != null) {
            int i = C13JZ.LIZ[enumC19989213Ja.ordinal()];
            if (i == 1) {
                return strValueOf;
            }
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("out ");
                    sbLIZ.append(strValueOf);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("in ");
                sbLIZ2.append(strValueOf);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        throw new C1954807lC();
    }

    public static final Object invoke$5(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        return a0.LJJLIIIJLJLI((CharSequence) aObjectS373S0100000_30.l0, (IntRange) obj);
    }

    public static final Object invoke$6(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        C202139147l c202139147l = (C202139147l) aObjectS373S0100000_30.l0;
        c202139147l.LJII.LIZ((String) obj, (String) ((HashMap) c202139147l.LJIILIIL).remove(c202139147l.LJI));
        return null;
    }

    public static final Object invoke$7(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        C202139147l c202139147l = (C202139147l) aObjectS373S0100000_30.l0;
        c202139147l.LJII.LIZ((String) obj, (String) ((HashMap) c202139147l.LJIILIIL).remove(c202139147l.LJI));
        return null;
    }

    public static final Object invoke$8(AObjectS373S0100000_30 aObjectS373S0100000_30, Object obj) {
        C13GU c13gu = (C13GU) aObjectS373S0100000_30.l0;
        C13GJ c13gj = (C13GJ) obj;
        C13GJ.LIZ(c13gj, "type", C13GX.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kotlinx.serialization.Polymorphic<");
        sbLIZ.append(c13gu.LIZ.LJI());
        sbLIZ.append('>');
        C13GJ.LIZ(c13gj, "value", C19981813Ge.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), C13GV.LIZ, new InterfaceC19983313Gt[0], new AObjectS127S0000000_30(0)));
        c13gj.LIZIZ = c13gu.LIZIZ;
        return Unit.LIZ;
    }
}
