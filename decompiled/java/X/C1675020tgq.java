package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS6S0302000_25;

/* JADX INFO: renamed from: X.0tgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675020tgq {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v9 kotlin.jvm.functions.Function2<? super X.0tpg, ? super java.lang.Integer, kotlin.Unit>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final void LIZ(X.InterfaceC1675090tgx r17, X.InterfaceC1685750ty9 r18, X.InterfaceC1631620sYq<? super X.InterfaceC1675090tgx, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r19, X.InterfaceC1680500tpg r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675020tgq.LIZ(X.0tgx, X.0ty9, X.0sYq, X.0tpg, int, int):void");
    }

    public static final void LIZIZ(C1675080tgw c1675080tgw, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1631620sYq<? super InterfaceC1675090tgx, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1631620sYq<? super InterfaceC1675090tgx, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1675080tgw)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i8 != 0) {
                interfaceC1631620sYq2 = C1675100tgy.LIZ;
            }
            InterfaceC1675090tgx interfaceC1675090tgx = (InterfaceC1675090tgx) ((C13FE) c1675080tgw.LIZ).getValue();
            C1680540tpk.LJFF(interfaceC1675090tgx, new C1675040tgs(interfaceC1675090tgx, (InterfaceC1675120th0) c13zcLJIIJ.LJJIL(C20055113dV.LIZ), null), c13zcLJIIJ);
            LIZ((InterfaceC1675090tgx) ((C13FE) c1675080tgw.LIZ).getValue(), interfaceC1685750ty92, interfaceC1631620sYq2, c13zcLJIIJ, (i3 & 112) | (i3 & 896), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(c1675080tgw, (C1675080tgw) interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1631620sYq2, (InterfaceC1631620sYq<? super InterfaceC1675090tgx, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 1);
        }
    }
}
