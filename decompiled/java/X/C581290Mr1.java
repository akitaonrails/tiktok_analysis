package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581290Mr1 extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C581290Mr1(C0M26 c0m26, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0m26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C581290Mr1(Function1 function1, Function1<? super String, Unit> function12) {
        super(4);
        this.$t = function12;
        this.l0 = function1;
    }

    public static final Object invoke$0(C581290Mr1 c581290Mr1, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean zLJII;
        int i3;
        C0MBC c0mbc = (C0MBC) obj;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj2;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            if ((iIntValue & 8) == 0) {
                zLJII = interfaceC1680500tpg.LJJIIJ(c0mbc);
            } else {
                zLJII = interfaceC1680500tpg.LJII(c0mbc);
            }
            if (zLJII) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1685750ty9)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) == 146 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1666410tSx.LIZ(c0mbc, interfaceC1685750ty9, (Function1) c581290Mr1.l0, interfaceC1680500tpg, (i & 112) | (i & 14));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C581290Mr1 r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r8 = r12
            r5 = r11
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            X.0tpg r8 = (X.InterfaceC1680500tpg) r8
            java.lang.Number r13 = (java.lang.Number) r13
            int r1 = r13.intValue()
            r0 = r1 & 6
            if (r0 != 0) goto L7d
            boolean r0 = r8.LJJIIJ(r4)
            if (r0 == 0) goto L7b
            r2 = 4
        L1a:
            r2 = r2 | r1
        L1b:
            r0 = r1 & 48
            if (r0 != 0) goto L28
            boolean r0 = r8.LJJIIJ(r5)
            if (r0 == 0) goto L78
            r0 = 32
        L27:
            r2 = r2 | r0
        L28:
            r1 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L3a
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L3a
            r8.LIZJ()
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.0tUi r3 = X.C1667500tUi.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r8.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            X.0M26 r0 = (X.C0M26) r0
            boolean r0 = r8.LJII(r0)
            java.lang.Object r1 = r9.l0
            X.0M26 r1 = (X.C0M26) r1
            java.lang.Object r6 = r8.LJJ()
            if (r0 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS587S0100000_8 r6 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 782(0x30e, float:1.096E-42)
            r6.<init>(r1, r0)
            r8.LJJIJIIJI(r6)
        L67:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r8.LJ()
            r7 = 0
            r9 = r2 & 14
            r0 = r2 & 112(0x70, float:1.57E-43)
            r9 = r9 | r0
            r10 = 8
            r3.LIZ(r4, r5, r6, r7, r8, r9, r10)
            goto L37
        L78:
            r0 = 16
            goto L27
        L7b:
            r2 = 2
            goto L1a
        L7d:
            r2 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C581290Mr1.invoke$1(X.0Mr1, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
