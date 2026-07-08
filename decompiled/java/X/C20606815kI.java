package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20606815kI {
    public final Function1<C20607615kQ, Unit> LIZ;
    public volatile C20607615kQ LIZIZ = C20607615kQ.LIZJ;

    public C20606815kI(AwS610S0100000_31 awS610S0100000_31) {
        this.LIZ = awS610S0100000_31;
    }

    public final void LIZ(EnumC20607015kK enumC20607015kK, EnumC323450Cm7 enumC323450Cm7, Object obj) {
        AbstractC20607715kR c20608115kV;
        Exception exc;
        int i = C20606715kH.LIZ[enumC20607015kK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (!(obj instanceof Exception) || (exc = (Exception) obj) == null) {
                            exc = new Exception();
                        }
                        c20608115kV = new C20607815kS(enumC323450Cm7, exc, null);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c20608115kV = new C20607915kT(enumC323450Cm7, null);
                }
            } else {
                c20608115kV = new C20608015kU(enumC323450Cm7, null);
            }
        } else {
            c20608115kV = new C20608115kV(enumC323450Cm7, null);
        }
        C20606915kJ c20606915kJ = this.LIZIZ.LIZIZ;
        c20606915kJ.getClass();
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ((LinkedHashMap) C20606915kJ.LIZJ).get(enumC20607015kK);
        if (interfaceC1631620sYq != null) {
            c20606915kJ = new C20606915kJ((AbstractC20607715kR) interfaceC1631620sYq.invoke(c20606915kJ.LIZ, enumC323450Cm7, obj), (AbstractC20607715kR) interfaceC1631620sYq.invoke(c20606915kJ.LIZIZ, enumC323450Cm7, obj));
        }
        C20607615kQ c20607615kQ = new C20607615kQ(c20608115kV, c20606915kJ);
        if (!Intrinsics.LJFF(c20607615kQ, this.LIZIZ)) {
            this.LIZIZ = c20607615kQ;
            this.LIZ.invoke(this.LIZIZ);
        }
    }
}
