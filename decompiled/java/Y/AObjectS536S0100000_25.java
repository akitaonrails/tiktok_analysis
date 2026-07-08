package Y;

import X.AbstractC1686530tzP;
import X.C05P1;
import X.C1668650tWZ;
import X.C1682380tsi;
import X.C2097608Jq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1673370teB;
import X.InterfaceC1689940u4u;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS536S0100000_25 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS536S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS536S0100000_25 r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r0 = r18
            r14 = r17
            r1 = r16
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            X.0tpg r14 = (X.InterfaceC1680500tpg) r14
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L25
            boolean r0 = r14.LIZ()
            if (r0 == 0) goto L25
            r14.LIZJ()
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.0tZS r0 = X.C1670400tZO.LIZLLL(r14)
            X.0tWw r6 = r0.LJI
            r0 = 24
            float r11 = (float) r0
            X.1ETK r0 = X.C1670400tZO.LIZIZ(r14)
            long r9 = r0.K3()
            X.0tcK r3 = X.C1672220tcK.LIZ
            X.0tyA r5 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r14.LJJIIJZLJL(r0)
            java.lang.Object r0 = r15.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r14.LJJIIJ(r0)
            java.lang.Object r1 = r15.l0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r4 = r14.LJJ()
            if (r0 != 0) goto L5b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L65
        L5b:
            Y.AObjectS399S0100000_25 r4 = new Y.AObjectS399S0100000_25
            r0 = 14
            r4.<init>(r1, r0)
            r14.LJJIJIIJI(r4)
        L65:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r14.LJ()
            r2 = 7
            r1 = 0
            r0 = 0
            X.0ty9 r1 = X.C634380OuS.LIZJ(r5, r1, r0, r4, r2)
            X.0tVa r0 = X.InterfaceC1668050tVb.LIZ
            r0.getClass()
            X.0jqv r0 = X.C1668040tVa.LIZLLL
            X.0ty9 r2 = r3.LIZIZ(r1, r0)
            r0 = 40
            float r1 = (float) r0
            X.0ty9 r0 = androidx.compose.foundation.layout.c.LJIILLIIL(r2, r1)
            X.0ty9 r8 = androidx.compose.foundation.layout.c.LJI(r0, r1)
            java.lang.String r7 = ""
            r13 = 0
            r15 = 221232(0x36030, float:3.10012E-40)
            r16 = 64
            r12 = r11
            X.C1668930tX1.LIZIZ(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS536S0100000_25.invoke$0(Y.AObjectS536S0100000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS536S0100000_25 aObjectS536S0100000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) obj;
        int iLJLLJ = interfaceC1689940u4u.LJLLJ(((C1668650tWZ) ((C05P1) aObjectS536S0100000_25.l0).getValue()).LL);
        long j = ((C1682380tsi) obj3).LIZ;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) obj2).LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), iLJLLJ, iLJLLJ));
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, iLJLLJ, C2097608Jq.LJ(), new AObjectS368S0100000_25(abstractC1686530tzPLJJJJZ, 17));
    }
}
