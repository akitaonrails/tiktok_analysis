package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13HM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13HM {
    public static final Map<C13IQ<?>, C13HG<?>> LIZ;

    static {
        C13DA c13da = new C13DA();
        c13da.put(C13LE.LIZ(String.class), C13GX.LIZ);
        c13da.put(C13LE.LIZ(Character.TYPE), C13HN.LIZ);
        c13da.put(C13LE.LIZ(char[].class), new AbstractC19985313Hn<Character, char[], C13IE>() { // from class: X.13Hw
            @Override // X.AbstractC19985313Hn
            public final char[] LJIIIZ() {
                return new char[0];
            }

            {
                C13HN c13hn = C13HN.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((char[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13IE((char[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, char[] cArr, int i) {
                char[] cArr2 = cArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJIILLIIL(this.LIZIZ, i2, cArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13IE c13ie = (C13IE) obj;
                char cLJJIIJ = interfaceC19986313Hx.LJJIIJ(this.LIZIZ, i);
                c13ie.getClass();
                c13ie.LIZIZ(c13ie.LIZLLL() + 1);
                char[] cArr = c13ie.LIZ;
                int i2 = c13ie.LIZIZ;
                c13ie.LIZIZ = i2 + 1;
                cArr[i2] = cLJJIIJ;
            }
        });
        c13da.put(C13LE.LIZ(Double.TYPE), C13HK.LIZ);
        c13da.put(C13LE.LIZ(double[].class), new AbstractC19985313Hn<Double, double[], C13ID>() { // from class: X.13Hv
            @Override // X.AbstractC19985313Hn
            public final double[] LJIIIZ() {
                return new double[0];
            }

            {
                C13HK c13hk = C13HK.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((double[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13ID((double[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, double[] dArr, int i) {
                double[] dArr2 = dArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJIIJJI(this.LIZIZ, i2, dArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13ID c13id = (C13ID) obj;
                double dLIZJ = interfaceC19986313Hx.LIZJ(this.LIZIZ, i);
                c13id.getClass();
                c13id.LIZIZ(c13id.LIZLLL() + 1);
                double[] dArr = c13id.LIZ;
                int i2 = c13id.LIZIZ;
                c13id.LIZIZ = i2 + 1;
                dArr[i2] = dLIZJ;
            }
        });
        c13da.put(C13LE.LIZ(Float.TYPE), C13HL.LIZ);
        c13da.put(C13LE.LIZ(float[].class), new AbstractC19985313Hn<Float, float[], C13IB>() { // from class: X.13Hu
            @Override // X.AbstractC19985313Hn
            public final float[] LJIIIZ() {
                return new float[0];
            }

            {
                C13HL c13hl = C13HL.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((float[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13IB((float[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, float[] fArr, int i) {
                float[] fArr2 = fArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJJII(this.LIZIZ, i2, fArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13IB c13ib = (C13IB) obj;
                float fLJJ = interfaceC19986313Hx.LJJ(this.LIZIZ, i);
                c13ib.getClass();
                c13ib.LIZIZ(c13ib.LIZLLL() + 1);
                float[] fArr = c13ib.LIZ;
                int i2 = c13ib.LIZIZ;
                c13ib.LIZIZ = i2 + 1;
                fArr[i2] = fLJJ;
            }
        });
        c13da.put(C13LE.LIZ(Long.TYPE), C13H6.LIZ);
        c13da.put(C13LE.LIZ(long[].class), new AbstractC19985313Hn<Long, long[], C13I9>() { // from class: X.13I0
            @Override // X.AbstractC19985313Hn
            public final long[] LJIIIZ() {
                return new long[0];
            }

            {
                C13H6 c13h6 = C13H6.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((long[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13I9((long[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, long[] jArr, int i) {
                long[] jArr2 = jArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJFF(this.LIZIZ, i2, jArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13I9 c13i9 = (C13I9) obj;
                long jLJIIIIZZ = interfaceC19986313Hx.LJIIIIZZ(this.LIZIZ, i);
                c13i9.getClass();
                c13i9.LIZIZ(c13i9.LIZLLL() + 1);
                long[] jArr = c13i9.LIZ;
                int i2 = c13i9.LIZIZ;
                c13i9.LIZIZ = i2 + 1;
                jArr[i2] = jLJIIIIZZ;
            }
        });
        c13da.put(C13LE.LIZ(C19969813Bo.class), C13H5.LIZ);
        c13da.put(C13LE.LIZ(Integer.TYPE), C13HI.LIZ);
        c13da.put(C13LE.LIZ(int[].class), new AbstractC19985313Hn<Integer, int[], C13I8>() { // from class: X.13I2
            @Override // X.AbstractC19985313Hn
            public final int[] LJIIIZ() {
                return new int[0];
            }

            {
                C13HI c13hi = C13HI.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((int[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13I8((int[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, int[] iArr, int i) {
                int[] iArr2 = iArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJ(i2, iArr2[i2], this.LIZIZ);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13I8 c13i8 = (C13I8) obj;
                int iLJIJJLI = interfaceC19986313Hx.LJIJJLI(this.LIZIZ, i);
                c13i8.getClass();
                c13i8.LIZIZ(c13i8.LIZLLL() + 1);
                int[] iArr = c13i8.LIZ;
                int i2 = c13i8.LIZIZ;
                c13i8.LIZIZ = i2 + 1;
                iArr[i2] = iLJIJJLI;
            }
        });
        c13da.put(C13LE.LIZ(C1507240pKE.class), C13HE.LIZ);
        c13da.put(C13LE.LIZ(Short.TYPE), C13HP.LIZ);
        c13da.put(C13LE.LIZ(short[].class), new AbstractC19985313Hn<Short, short[], C13IC>() { // from class: X.13I1
            @Override // X.AbstractC19985313Hn
            public final short[] LJIIIZ() {
                return new short[0];
            }

            {
                C13HP c13hp = C13HP.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((short[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13IC((short[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, short[] sArr, int i) {
                short[] sArr2 = sArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJIIIZ(this.LIZIZ, i2, sArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13IC c13ic = (C13IC) obj;
                short sLJIIJ = interfaceC19986313Hx.LJIIJ(this.LIZIZ, i);
                c13ic.getClass();
                c13ic.LIZIZ(c13ic.LIZLLL() + 1);
                short[] sArr = c13ic.LIZ;
                int i2 = c13ic.LIZIZ;
                c13ic.LIZIZ = i2 + 1;
                sArr[i2] = sLJIIJ;
            }
        });
        c13da.put(C13LE.LIZ(C1507270pKH.class), C13HC.LIZ);
        c13da.put(C13LE.LIZ(Byte.TYPE), C13H9.LIZ);
        c13da.put(C13LE.LIZ(byte[].class), new AbstractC19985313Hn<Byte, byte[], C13I7>() { // from class: X.13Ht
            @Override // X.AbstractC19985313Hn
            public final byte[] LJIIIZ() {
                return new byte[0];
            }

            {
                C13H9 c13h9 = C13H9.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((byte[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13I7((byte[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, byte[] bArr, int i) {
                byte[] bArr2 = bArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJIL(this.LIZIZ, i2, bArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13I7 c13i7 = (C13I7) obj;
                byte bLJIJ = interfaceC19986313Hx.LJIJ(this.LIZIZ, i);
                c13i7.getClass();
                c13i7.LIZIZ(c13i7.LIZLLL() + 1);
                byte[] bArr = c13i7.LIZ;
                int i2 = c13i7.LIZIZ;
                c13i7.LIZIZ = i2 + 1;
                bArr[i2] = bLJIJ;
            }
        });
        c13da.put(C13LE.LIZ(C19969613Bm.class), C13H8.LIZ);
        c13da.put(C13LE.LIZ(Boolean.TYPE), C13HO.LIZ);
        c13da.put(C13LE.LIZ(boolean[].class), new AbstractC19985313Hn<Boolean, boolean[], C13IA>() { // from class: X.13Hy
            @Override // X.AbstractC19985313Hn
            public final boolean[] LJIIIZ() {
                return new boolean[0];
            }

            {
                C13HO c13ho = C13HO.LIZ;
            }

            @Override // X.AbstractC19985413Ho
            public final int LIZLLL(Object obj) {
                return ((boolean[]) obj).length;
            }

            @Override // X.AbstractC19985413Ho
            public final Object LJI(Object obj) {
                return new C13IA((boolean[]) obj);
            }

            @Override // X.AbstractC19985313Hn
            public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, boolean[] zArr, int i) {
                boolean[] zArr2 = zArr;
                for (int i2 = 0; i2 < i; i2++) {
                    interfaceC19986513Hz.LJIIJ(this.LIZIZ, i2, zArr2[i2]);
                }
            }

            @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
            public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                C13IA c13ia = (C13IA) obj;
                boolean zLJFF = interfaceC19986313Hx.LJFF(this.LIZIZ, i);
                c13ia.getClass();
                c13ia.LIZIZ(c13ia.LIZLLL() + 1);
                boolean[] zArr = c13ia.LIZ;
                int i2 = c13ia.LIZIZ;
                c13ia.LIZIZ = i2 + 1;
                zArr[i2] = zLJFF;
            }
        });
        c13da.put(C13LE.LIZ(Unit.class), new C13HG<Unit>() { // from class: X.13HQ
            public final /* synthetic */ C13HR<Unit> LIZ = new C13HR<>(Unit.LIZ);

            @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
            public final InterfaceC19983313Gt getDescriptor() {
                return this.LIZ.getDescriptor();
            }

            @Override // X.InterfaceC19984213Hc
            public final Object deserialize(C13HB c13hb) {
                this.LIZ.deserialize(c13hb);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC19984413He
            public final void serialize(C13HD c13hd, Object obj) {
                this.LIZ.serialize(c13hd, obj);
            }
        });
        c13da.put(C13LE.LIZ(Void.class), new C13HG() { // from class: X.13Gj
            public static final C19982213Gi LIZIZ = C19982213Gi.LIZ;

            @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
            public final InterfaceC19983313Gt getDescriptor() {
                return LIZIZ;
            }

            @Override // X.InterfaceC19984213Hc
            public final Object deserialize(C13HB c13hb) {
                throw new C19981113Fx("'kotlin.Nothing' does not have instances");
            }

            @Override // X.InterfaceC19984413He
            public final void serialize(C13HD c13hd, Object obj) {
                throw new C19981113Fx("'kotlin.Nothing' cannot be serialized");
            }
        });
        try {
            c13da.put(C13LE.LIZ(C19990113Jj.class), new C13HG<C19990113Jj>() { // from class: X.13Jh
                public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.time.Duration", C19982013Gg.LIZ);

                @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                public final InterfaceC19983313Gt getDescriptor() {
                    return LIZIZ;
                }

                @Override // X.InterfaceC19984213Hc
                public final Object deserialize(C13HB c13hb) {
                    C1302100jzM c1302100jzM = C19990113Jj.LLILLJJLI;
                    String strLJIILJJIL = c13hb.LJIILJJIL();
                    c1302100jzM.getClass();
                    try {
                        return new C19990113Jj(C19990313Jl.LJ(strLJIILJJIL));
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid ISO duration string format: '");
                        sbLIZ.append(strLJIILJJIL);
                        sbLIZ.append("'.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
                
                    if (r4 != false) goto L18;
                 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[PHI: r8
                  0x004b: PHI (r8v3 boolean) = (r8v1 boolean), (r8v0 boolean) binds: [B:28:0x0077, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[PHI: r8
                  0x0077: PHI (r8v1 boolean) = (r8v0 boolean), (r8v4 boolean) binds: [B:15:0x0045, B:27:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
                @Override // X.InterfaceC19984413He
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void serialize(X.C13HD r18, java.lang.Object r19) {
                    /*
                        r17 = this;
                        r0 = r19
                        X.13Jj r0 = (X.C19990113Jj) r0
                        long r5 = r0.LL
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder
                        r11.<init>()
                        r9 = 0
                        int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                        r8 = 1
                        if (r1 >= 0) goto L17
                        r0 = 45
                        r11.append(r0)
                    L17:
                        java.lang.String r0 = "PT"
                        r11.append(r0)
                        if (r1 >= 0) goto L82
                        long r3 = X.C19990113Jj.LJIJJLI(r5)
                    L22:
                        X.13Jk r0 = X.EnumC19990213Jk.HOURS
                        long r1 = X.C19990113Jj.LJIJI(r3, r0)
                        int r7 = X.C19990113Jj.LJIIL(r3)
                        int r12 = X.C19990113Jj.LJIILL(r3)
                        int r13 = X.C19990113Jj.LJIILJJIL(r3)
                        boolean r0 = X.C19990113Jj.LJIILLIIL(r5)
                        if (r0 == 0) goto L7c
                        r1 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
                    L3f:
                        r4 = 1
                    L40:
                        if (r12 != 0) goto L7a
                        if (r13 != 0) goto L7a
                        r3 = 0
                    L45:
                        if (r7 != 0) goto L77
                        if (r3 == 0) goto L76
                        if (r4 == 0) goto L63
                    L4b:
                        r11.append(r1)
                        r0 = 72
                        r11.append(r0)
                    L53:
                        if (r8 == 0) goto L5d
                        r11.append(r7)
                        r0 = 77
                        r11.append(r0)
                    L5d:
                        if (r3 != 0) goto L63
                        if (r4 != 0) goto L6c
                        if (r8 != 0) goto L6c
                    L63:
                        r14 = 9
                        java.lang.String r15 = "S"
                        r16 = 1
                        X.C19990113Jj.LJFF(r11, r12, r13, r14, r15, r16)
                    L6c:
                        java.lang.String r0 = r11.toString()
                        r1 = r18
                        r1.LJIIIIZZ(r0)
                        return
                    L76:
                        r8 = 0
                    L77:
                        if (r4 == 0) goto L53
                        goto L4b
                    L7a:
                        r3 = 1
                        goto L45
                    L7c:
                        int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                        if (r0 != 0) goto L3f
                        r4 = 0
                        goto L40
                    L82:
                        r3 = r5
                        goto L22
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19989913Jh.serialize(X.13HD, java.lang.Object):void");
                }
            });
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoClassDefFoundError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            c13da.put(C13LE.LIZ(C13BL.class), new AbstractC19985313Hn<C19969813Bo, C13BL, C13I4>() { // from class: X.13Hs
                @Override // X.AbstractC19985313Hn
                public final C13BL LJIIIZ() {
                    return new C13BL(new long[0]);
                }

                {
                    C13H5 c13h5 = C13H5.LIZ;
                }

                @Override // X.AbstractC19985413Ho
                public final int LIZLLL(Object obj) {
                    return ((C13BL) obj).LL.length;
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJI(Object obj) {
                    return new C13I4(((C13BL) obj).LL);
                }

                @Override // X.AbstractC19985313Hn
                public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, C13BL c13bl, int i) {
                    long[] jArr = c13bl.LL;
                    for (int i2 = 0; i2 < i; i2++) {
                        interfaceC19986513Hz.LJJIII(this.LIZIZ, i2).LJIILL(jArr[i2]);
                    }
                }

                @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
                public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                    C13I4 c13i4 = (C13I4) obj;
                    long jLJJIFFI = interfaceC19986313Hx.LJII(this.LIZIZ, i).LJJIFFI();
                    c13i4.getClass();
                    c13i4.LIZIZ(c13i4.LIZLLL() + 1);
                    long[] jArr = c13i4.LIZ;
                    int i2 = c13i4.LIZIZ;
                    c13i4.LIZIZ = i2 + 1;
                    jArr[i2] = jLJJIFFI;
                }
            });
        } catch (ClassNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (NoClassDefFoundError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            c13da.put(C13LE.LIZ(C13BN.class), new AbstractC19985313Hn<C1507240pKE, C13BN, C13I3>() { // from class: X.13Hr
                @Override // X.AbstractC19985313Hn
                public final C13BN LJIIIZ() {
                    return new C13BN(new int[0]);
                }

                {
                    C13HE c13he = C13HE.LIZ;
                }

                @Override // X.AbstractC19985413Ho
                public final int LIZLLL(Object obj) {
                    return ((C13BN) obj).LL.length;
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJI(Object obj) {
                    return new C13I3(((C13BN) obj).LL);
                }

                @Override // X.AbstractC19985313Hn
                public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, C13BN c13bn, int i) {
                    int[] iArr = c13bn.LL;
                    for (int i2 = 0; i2 < i; i2++) {
                        interfaceC19986513Hz.LJJIII(this.LIZIZ, i2).LJIIL(iArr[i2]);
                    }
                }

                @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
                public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                    C13I3 c13i3 = (C13I3) obj;
                    int iLJJIIZ = interfaceC19986313Hx.LJII(this.LIZIZ, i).LJJIIZ();
                    c13i3.getClass();
                    c13i3.LIZIZ(c13i3.LIZLLL() + 1);
                    int[] iArr = c13i3.LIZ;
                    int i2 = c13i3.LIZIZ;
                    c13i3.LIZIZ = i2 + 1;
                    iArr[i2] = iLJJIIZ;
                }
            });
        } catch (ClassNotFoundException e5) {
            TryCatchGuardChecker.doCheck(e5);
        } catch (NoClassDefFoundError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            c13da.put(C13LE.LIZ(C13B4.class), new AbstractC19985313Hn<C1507270pKH, C13B4, C13I6>() { // from class: X.13Hp
                @Override // X.AbstractC19985313Hn
                public final C13B4 LJIIIZ() {
                    return new C13B4(new short[0]);
                }

                {
                    C13HC c13hc = C13HC.LIZ;
                }

                @Override // X.AbstractC19985413Ho
                public final int LIZLLL(Object obj) {
                    return ((C13B4) obj).LL.length;
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJI(Object obj) {
                    return new C13I6(((C13B4) obj).LL);
                }

                @Override // X.AbstractC19985313Hn
                public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, C13B4 c13b4, int i) {
                    short[] sArr = c13b4.LL;
                    for (int i2 = 0; i2 < i; i2++) {
                        interfaceC19986513Hz.LJJIII(this.LIZIZ, i2).LJI(sArr[i2]);
                    }
                }

                @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
                public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                    C13I6 c13i6 = (C13I6) obj;
                    short sLJIIL = interfaceC19986313Hx.LJII(this.LIZIZ, i).LJIIL();
                    c13i6.getClass();
                    c13i6.LIZIZ(c13i6.LIZLLL() + 1);
                    short[] sArr = c13i6.LIZ;
                    int i2 = c13i6.LIZIZ;
                    c13i6.LIZIZ = i2 + 1;
                    sArr[i2] = sLJIIL;
                }
            });
        } catch (ClassNotFoundException e7) {
            TryCatchGuardChecker.doCheck(e7);
        } catch (NoClassDefFoundError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            c13da.put(C13LE.LIZ(C13BI.class), new AbstractC19985313Hn<C19969613Bm, C13BI, C13I5>() { // from class: X.13Hq
                @Override // X.AbstractC19985313Hn
                public final C13BI LJIIIZ() {
                    return new C13BI(new byte[0]);
                }

                {
                    C13H8 c13h8 = C13H8.LIZ;
                }

                @Override // X.AbstractC19985413Ho
                public final int LIZLLL(Object obj) {
                    return ((C13BI) obj).LL.length;
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJI(Object obj) {
                    return new C13I5(((C13BI) obj).LL);
                }

                @Override // X.AbstractC19985313Hn
                public final void LJIIJ(InterfaceC19986513Hz interfaceC19986513Hz, C13BI c13bi, int i) {
                    byte[] bArr = c13bi.LL;
                    for (int i2 = 0; i2 < i; i2++) {
                        interfaceC19986513Hz.LJJIII(this.LIZIZ, i2).LJIJJLI(bArr[i2]);
                    }
                }

                @Override // X.AbstractC19985213Hm, X.AbstractC19985413Ho
                public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Object obj, boolean z) {
                    C13I5 c13i5 = (C13I5) obj;
                    byte bLJJI = interfaceC19986313Hx.LJII(this.LIZIZ, i).LJJI();
                    c13i5.getClass();
                    c13i5.LIZIZ(c13i5.LIZLLL() + 1);
                    byte[] bArr = c13i5.LIZ;
                    int i2 = c13i5.LIZIZ;
                    c13i5.LIZIZ = i2 + 1;
                    bArr[i2] = bLJJI;
                }
            });
        } catch (ClassNotFoundException e9) {
            TryCatchGuardChecker.doCheck(e9);
        } catch (NoClassDefFoundError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            c13da.put(C13LE.LIZ(C13GZ.class), new C13HG<C13GZ>() { // from class: X.13GY
                public static final C19980913Fv LIZIZ = new C19980913Fv("kotlin.uuid.Uuid", C19982013Gg.LIZ);

                @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                public final InterfaceC19983313Gt getDescriptor() {
                    return LIZIZ;
                }

                @Override // X.InterfaceC19984213Hc
                public final Object deserialize(C13HB c13hb) {
                    String strLIZIZ;
                    C19981513Gb c19981513Gb = C13GZ.Companion;
                    String strLJIILJJIL = c13hb.LJIILJJIL();
                    c19981513Gb.getClass();
                    int length = strLJIILJJIL.length();
                    if (length != 32) {
                        if (length != 36) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                            if (strLJIILJJIL.length() <= 64) {
                                strLIZIZ = strLJIILJJIL;
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLJIILJJIL.substring(0, 64));
                                sbLIZ2.append("...");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append("\" of length ");
                            sbLIZ.append(strLJIILJJIL.length());
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        long jLIZIZ = C13EB.LIZIZ(strLJIILJJIL, 0, 8);
                        C1906107dL.LIZIZ(8, strLJIILJJIL);
                        long jLIZIZ2 = C13EB.LIZIZ(strLJIILJJIL, 9, 13);
                        C1906107dL.LIZIZ(13, strLJIILJJIL);
                        long jLIZIZ3 = C13EB.LIZIZ(strLJIILJJIL, 14, 18);
                        C1906107dL.LIZIZ(18, strLJIILJJIL);
                        long jLIZIZ4 = C13EB.LIZIZ(strLJIILJJIL, 19, 23);
                        C1906107dL.LIZIZ(23, strLJIILJJIL);
                        return C19981513Gb.LIZ((jLIZIZ << 32) | (jLIZIZ2 << 16) | jLIZIZ3, C13EB.LIZIZ(strLJIILJJIL, 24, 36) | (jLIZIZ4 << 48));
                    }
                    return C19981513Gb.LIZ(C13EB.LIZIZ(strLJIILJJIL, 0, 16), C13EB.LIZIZ(strLJIILJJIL, 16, 32));
                }

                @Override // X.InterfaceC19984413He
                public final void serialize(C13HD c13hd, Object obj) {
                    c13hd.LJIIIIZZ(((C13GZ) obj).toString());
                }
            });
        } catch (ClassNotFoundException e11) {
            TryCatchGuardChecker.doCheck(e11);
        } catch (NoClassDefFoundError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LIZ = c13da.build();
    }
}
