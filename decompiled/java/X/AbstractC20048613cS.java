package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import n2.k1;
import p2.j1;

/* JADX INFO: renamed from: X.13cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20048613cS extends AbstractC1686530tzP implements InterfaceC20048313cP, InterfaceC1683320tuE {
    public static final AFwS274S0000000_30 LLJILJIL = AFwS274S0000000_30.get$arr$(307);
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C20048913cV LLJ;
    public C13L2<AbstractC2282241EUs> LLJI;
    public C13L2<AbstractC2282241EUs> LLJIJIL;

    @Override // X.InterfaceC20048313cP
    public abstract C20053713dH LJJLIIIJL();

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    public abstract int LJJLJLI(C115T c115t);

    public abstract AbstractC20048613cS LJJZZI();

    public abstract InterfaceC1692950u9l LJJZZIII();

    public abstract boolean LJL();

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    public abstract InterfaceC1690350u5Z LJLIIL();

    public abstract AbstractC20048613cS LJLIL();

    public abstract long LJLILLLLZI();

    @Override // X.InterfaceC1689940u4u
    public final /* synthetic */ InterfaceC1690350u5Z LJLJJL(int i, int i2, Map map, Function1 function1) {
        return C1691220u6y.LIZ(this, i, i2, map, function1);
    }

    public abstract void LJLJJLL();

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1676350tiz
    public boolean LLIILII() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13cV] */
    public AbstractC20048613cS() {
        AFwS266S0000000_25 aFwS266S0000000_25 = k1.LIZ;
        this.LLJ = new AbstractC1683310tuD(this) { // from class: X.13cV
            public final AbstractC20048613cS LIZIZ;

            @Override // X.AbstractC1683310tuD
            public final EnumC1671200tag LIZIZ() {
                return this.LIZIZ.getLayoutDirection();
            }

            @Override // X.AbstractC1683310tuD
            public final int LIZJ() {
                return this.LIZIZ.LJJLI();
            }

            {
                this.LIZIZ = this;
            }
        };
    }

    public static void LJLJJI(j1 j1Var) {
        C20053713dH c20053713dH;
        C20050813co c20050813co;
        j1 j1Var2 = j1Var.LLJJI;
        if (j1Var2 != null) {
            c20053713dH = j1Var2.LLJILJILJ;
        } else {
            c20053713dH = null;
        }
        if (!Intrinsics.LJFF(c20053713dH, j1Var.LLJILJILJ)) {
            j1Var.LLJILJILJ.LLJLLL.LJIILL.LLJJJJLIIL.LJI();
            return;
        }
        InterfaceC20054413dO interfaceC20054413dOLJJJLZIJ = j1Var.LLJILJILJ.LLJLLL.LJIILL.LJJJLZIJ();
        if (interfaceC20054413dOLJJJLZIJ == null || (c20050813co = ((C20053813dI) interfaceC20054413dOLJJJLZIJ).LLJJJJLIIL) == null) {
            return;
        }
        c20050813co.LJI();
    }

    @Override // X.InterfaceC1683320tuE
    public final void LJIJJLI(boolean z) {
        C20053713dH c20053713dHLJJLIIIJL;
        EnumC20047813cK enumC20047813cK;
        AbstractC20048613cS abstractC20048613cSLJLIL = LJLIL();
        EnumC20047813cK enumC20047813cK2 = null;
        if (abstractC20048613cSLJLIL != null) {
            c20053713dHLJJLIIIJL = abstractC20048613cSLJLIL.LJJLIIIJL();
        } else {
            c20053713dHLJJLIIIJL = null;
        }
        if (Intrinsics.LJFF(c20053713dHLJJLIIIJL, LJJLIIIJL())) {
            this.LLILZLL = z;
            return;
        }
        if (c20053713dHLJJLIIIJL != null) {
            enumC20047813cK = c20053713dHLJJLIIIJL.LLJLLL.LIZLLL;
        } else {
            enumC20047813cK = null;
        }
        if (enumC20047813cK != EnumC20047813cK.LayingOut) {
            if (c20053713dHLJJLIIIJL != null) {
                enumC20047813cK2 = c20053713dHLJJLIIIJL.LLJLLL.LIZLLL;
            }
            if (enumC20047813cK2 != EnumC20047813cK.LookaheadLayingOut) {
                return;
            }
        }
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1678850tn1
    public final int LJJIJL(C115T c115t) {
        int iLJJLJLI;
        if (!LJL() || (iLJJLJLI = LJJLJLI(c115t)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return iLJJLJLI + C1676820tjk.LIZJ(this.LLILZIL);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        r3 = r8.LIZJ(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        if (r8.LJFF != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        if (((r8.LIZ[r3 >> 3] >> ((r3 & 7) << 3)) & 255) == 254) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        r6 = r8.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        if (r6 <= 8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        if (java.lang.Long.compare((((long) r8.LJ) * 32) ^ Long.MIN_VALUE, (((long) r6) * 25) ^ Long.MIN_VALUE) > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        r7 = r8.LIZ;
        r14 = r8.LIZLLL;
        r11 = r8.LIZIZ;
        r0 = r8.LIZJ;
        r12 = (r14 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
    
        if (r6 >= r12) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013d, code lost:
    
        r2 = r7[r6] & (-9187201950435737472L);
        r7[r6] = (-72340172838076674L) & ((~r2) + (r2 >>> 7));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014f, code lost:
    
        r12 = r7.length - 1;
        r6 = r12 - 1;
        r7[r6] = (r7[r6] & 72057594037927935L) | (-72057594037927936L);
        r6 = 0;
        r7[r12] = r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if (r6 == r14) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
    
        r21 = r6 >> 3;
        r20 = (r6 & 7) << 3;
        r12 = (r7[r21] >> r20) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0175, code lost:
    
        if (r12 == 128) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017b, code lost:
    
        if (r12 != 254) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        r0 = r11[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017f, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        r3 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        r3 = r3 * (-862048943);
        r3 = r3 ^ (r3 << 16);
        r2 = r3 >>> 7;
        r19 = r8.LIZJ(r2);
        r2 = r2 & r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019b, code lost:
    
        if ((((r19 - r2) & r14) / 8) != (((r6 - r2) & r14) / 8)) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019d, code lost:
    
        r7[r21] = ((~(255 << r20)) & r7[r21]) | (((long) (r3 & 127)) << r20);
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bb, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01be, code lost:
    
        r18 = r19 >> 3;
        r16 = r7[r18];
        r15 = (r19 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cb, code lost:
    
        if (((r16 >> r15) & 255) != 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cd, code lost:
    
        r7[r18] = ((~(255 << r15)) & r16) | (((long) (r3 & 127)) << r15);
        r7[r21] = (r7[r21] & (~(255 << r20))) | (128 << r20);
        r11[r19] = r11[r6];
        r11[r6] = null;
        r0[r19] = r0[r6];
        r0[r6] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
    
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
    
        r7[r18] = (((long) (r3 & 127)) << r15) | ((~(255 << r15)) & r16);
        r1 = r11[r19];
        r11[r19] = r11[r6];
        r11[r6] = r1;
        r1 = r0[r19];
        r0[r19] = r0[r6];
        r0[r6] = r1;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0225, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0228, code lost:
    
        r1 = X.C19992013Kc.LIZJ(r8.LIZLLL);
        r0 = r8.LIZ;
        r0 = r8.LIZIZ;
        r0 = r8.LIZJ;
        r0 = r8.LIZLLL;
        r8.LIZLLL(r1);
        r15 = r8.LIZ;
        r14 = r8.LIZIZ;
        r13 = r8.LIZJ;
        r12 = r8.LIZLLL;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024c, code lost:
    
        if (r11 >= r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x025a, code lost:
    
        if (((r0[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x025c, code lost:
    
        r21 = r0[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x025e, code lost:
    
        if (r21 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0260, code lost:
    
        r1 = r21.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0264, code lost:
    
        r1 = r1 * (-862048943);
        r1 = r1 ^ (r1 << 16);
        r20 = r8.LIZJ(r1 >>> 7);
        r19 = r20 >> 3;
        r18 = (r20 & 7) << 3;
        r6 = (((long) (r1 & 127)) << r18) | (r15[r19] & (~(255 << r18)));
        r15[r19] = r6;
        r15[(((r20 - 7) & r12) + (r12 & 7)) >> 3] = r6;
        r14[r20] = r21;
        r13[r20] = r0[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0295, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0298, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a8, code lost:
    
        r8.LJFF = X.C19992013Kc.LIZ(r8.LIZLLL) - r8.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b3, code lost:
    
        r3 = r8.LIZJ(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b9, code lost:
    
        r8.LJ++;
        r1 = r8.LJFF;
        r2 = r8.LIZ;
        r14 = r3 >> 3;
        r12 = r2[r14];
        r11 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d0, code lost:
    
        if (((r12 >> r11) & 255) != 128) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d2, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d3, code lost:
    
        r8.LJFF = r1 - r0;
        r6 = r8.LIZLLL;
        r12 = (r12 & (~(255 << r11))) | (r0 << r11);
        r2[r14] = r12;
        r2[(((r3 - 7) & r6) + (r6 & 7)) >> 3] = r12;
        r13 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02fe, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ(X.C20048813cU r45) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20048613cS.LJJZ(X.13cU):void");
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJZI(final int i, final int i2, final Map map, final Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Size(");
            sbLIZ.append(i);
            sbLIZ.append(" x ");
            sbLIZ.append(i2);
            sbLIZ.append(") is out of range. Each dimension must be between 0 and 16777215.");
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return new InterfaceC1690350u5Z() { // from class: X.13cH
            public final /* synthetic */ Function1<Object, Unit> LIZLLL = null;

            @Override // X.InterfaceC1690350u5Z
            public final void LJIILLIIL() {
                function1.invoke(this.LLJ);
            }

            @Override // X.InterfaceC1690350u5Z
            public final Map<C115T, Integer> LJIILL() {
                return map;
            }

            @Override // X.InterfaceC1690350u5Z
            public final Function1<Object, Unit> LJIIZILJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getHeight() {
                return i2;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getWidth() {
                return i;
            }
        };
    }
}
