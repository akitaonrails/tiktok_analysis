package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19987413Ii extends AbstractC19984113Hb implements C13GT {
    public final AbstractC19987213Ig LIZIZ;
    public final EnumC19987013Ie LIZJ;
    public final AbstractC19987713Il LIZLLL;
    public final AbstractC19984913Hj LJ;
    public int LJFF = -1;
    public C13JI LJI;
    public final C19988913Ix LJII;
    public final C13JA LJIIIIZZ;

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final void LJIJI() {
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final double LJ() {
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            double d = CastDoubleProtector.parseDouble(strLJIIJJI);
            if (this.LIZIZ.LIZ.LJIIJ || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C19988213Iq.LJII(this.LIZLLL, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("double");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final short LJIIL() {
        long jLJIIIIZZ = this.LIZLLL.LJIIIIZZ();
        short s = (short) jLJIIIIZZ;
        if (jLJIIIIZZ == s) {
            return s;
        }
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to parse short for input '");
        sbLIZ.append(jLJIIIIZZ);
        sbLIZ.append('\'');
        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
        throw null;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final String LJIILJJIL() {
        return this.LJII.LIZJ ? this.LIZLLL.LJIIL() : this.LIZLLL.LJIIIZ();
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final boolean LJIILLIIL() {
        boolean z;
        boolean z2;
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        int iLJJI = abstractC19987713Il.LJJI();
        if (iLJJI == abstractC19987713Il.LJIJ().length()) {
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC19987713Il.LJIJ().charAt(iLJJI) == '\"') {
            iLJJI++;
            z = true;
        } else {
            z = false;
        }
        int iLJJ = abstractC19987713Il.LJJ(iLJJI);
        if (iLJJ >= abstractC19987713Il.LJIJ().length() || iLJJ == -1) {
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, "EOF", 0, null, 6);
            throw null;
        }
        int i = iLJJ + 1;
        int iCharAt = abstractC19987713Il.LJIJ().charAt(iLJJ) | ' ';
        if (iCharAt == 102) {
            abstractC19987713Il.LIZLLL(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected valid boolean literal prefix, but had '");
                sbLIZ.append(abstractC19987713Il.LJIIJJI());
                sbLIZ.append('\'');
                AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
                throw null;
            }
            abstractC19987713Il.LIZLLL(i, "rue");
            z2 = true;
        }
        if (z) {
            if (abstractC19987713Il.LIZ == abstractC19987713Il.LJIJ().length()) {
                AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, "EOF", 0, null, 6);
                throw null;
            }
            if (abstractC19987713Il.LJIJ().charAt(abstractC19987713Il.LIZ) != '\"') {
                AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            abstractC19987713Il.LIZ++;
        }
        return z2;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final boolean LJIIZILJ() {
        C13JA c13ja = this.LJIIIIZZ;
        return (c13ja == null || !c13ja.LIZIZ) && !this.LIZLLL.LJJIII(true);
    }

    @Override // X.C13GT
    public final AbstractC19979113Fd LJIL() {
        return new C19988713Iv(this.LIZIZ.LIZ, this.LIZLLL).LIZ();
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final byte LJJI() {
        long jLJIIIIZZ = this.LIZLLL.LJIIIIZZ();
        byte b = (byte) jLJIIIIZZ;
        if (jLJIIIIZZ == b) {
            return b;
        }
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to parse byte for input '");
        sbLIZ.append(jLJIIIIZZ);
        sbLIZ.append('\'');
        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
        throw null;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final long LJJIFFI() {
        return this.LIZLLL.LJIIIIZZ();
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final char LJJIII() {
        String strLJIIJJI = this.LIZLLL.LJIIJJI();
        if (strLJIIJJI.length() == 1) {
            return strLJIIJJI.charAt(0);
        }
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected single char, but got '");
        sbLIZ.append(strLJIIJJI);
        sbLIZ.append('\'');
        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
        throw null;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final int LJJIIZ() {
        long jLJIIIIZZ = this.LIZLLL.LJIIIIZZ();
        int i = (int) jLJIIIIZZ;
        if (jLJIIIIZZ == i) {
            return i;
        }
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to parse int for input '");
        sbLIZ.append(jLJIIIIZZ);
        sbLIZ.append('\'');
        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
        throw null;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final float LJJIIZI() {
        AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            float f = CastFloatProtector.parseFloat(strLJIIJJI);
            if (this.LIZIZ.LIZ.LJIIJ || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C19988213Iq.LJII(this.LIZLLL, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("float");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.InterfaceC19986313Hx
    public final AbstractC19984913Hj LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final InterfaceC19986313Hx LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        EnumC19987013Ie enumC19987013IeLIZIZ = C13IX.LIZIZ(interfaceC19983313Gt, this.LIZIZ);
        C19988513It c19988513It = this.LIZLLL.LIZIZ;
        int i = c19988513It.LIZJ + 1;
        c19988513It.LIZJ = i;
        Object[] objArr = c19988513It.LIZ;
        if (i == objArr.length) {
            int i2 = i * 2;
            c19988513It.LIZ = Arrays.copyOf(objArr, i2);
            c19988513It.LIZIZ = Arrays.copyOf(c19988513It.LIZIZ, i2);
        }
        c19988513It.LIZ[i] = interfaceC19983313Gt;
        this.LIZLLL.LJII(enumC19987013IeLIZIZ.begin);
        if (this.LIZLLL.LJIJJLI() != 4) {
            int i3 = C19986913Id.LIZ[enumC19987013IeLIZIZ.ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                if (this.LIZJ == enumC19987013IeLIZIZ && this.LIZIZ.LIZ.LJFF) {
                    return this;
                }
                return new C19987413Ii(this.LIZIZ, enumC19987013IeLIZIZ, this.LIZLLL, interfaceC19983313Gt, this.LJI);
            }
            return new C19987413Ii(this.LIZIZ, enumC19987013IeLIZIZ, this.LIZLLL, interfaceC19983313Gt, this.LJI);
        }
        AbstractC19987713Il.LJIILLIIL(this.LIZLLL, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    @Override // X.AbstractC19984113Hb, X.C13HB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T LIZLLL(X.InterfaceC19984213Hc<? extends T> r10) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19987413Ii.LIZLLL(X.13Hc):java.lang.Object");
    }

    @Override // X.AbstractC19984113Hb, X.InterfaceC19986313Hx
    public final void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19983313Gt.LJ() == 0 && C19987613Ik.LIZLLL(interfaceC19983313Gt, this.LIZIZ)) {
            while (LJIJJ(interfaceC19983313Gt) != -1) {
            }
        }
        if (this.LIZLLL.LJJII() && !this.LIZIZ.LIZ.LJIILIIL) {
            C19988213Iq.LJFF(this.LIZLLL, "");
            throw null;
        }
        this.LIZLLL.LJII(this.LIZJ.end);
        C19988513It c19988513It = this.LIZLLL.LIZIZ;
        int i = c19988513It.LIZJ;
        int[] iArr = c19988513It.LIZIZ;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c19988513It.LIZJ = i - 1;
        }
        int i2 = c19988513It.LIZJ;
        if (i2 != -1) {
            c19988513It.LIZJ = i2 - 1;
        }
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final int LJIILIIL(InterfaceC19983313Gt interfaceC19983313Gt) {
        AbstractC19987213Ig abstractC19987213Ig = this.LIZIZ;
        String strLJIILJJIL = LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" at path ");
        sbLIZ.append(this.LIZLLL.LIZIZ.LIZ());
        return C19987613Ik.LIZJ(interfaceC19983313Gt, abstractC19987213Ig, strLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19986313Hx
    public final int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        boolean z;
        int iLIZIZ;
        String strLJ;
        String strLJIL;
        boolean z2;
        int i = C19986913Id.LIZ[this.LIZJ.ordinal()];
        char c = ':';
        boolean z3 = true;
        boolean zLJJII = 0;
        int i2 = 0;
        zLJJII = 0;
        int i3 = -1;
        if (i != 2) {
            if (i != 4) {
                boolean zLJJII2 = this.LIZLLL.LJJII();
                if (this.LIZLLL.LIZJ()) {
                    int i4 = this.LJFF;
                    if (i4 != -1 && !zLJJII2) {
                        AbstractC19987713Il.LJIILLIIL(this.LIZLLL, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i3 = i4 + 1;
                    this.LJFF = i3;
                } else if (zLJJII2 && !this.LIZIZ.LIZ.LJIILIIL) {
                    C19988213Iq.LJFF(this.LIZLLL, "array");
                    throw null;
                }
            } else {
                boolean zLJJII3 = this.LIZLLL.LJJII();
                while (this.LIZLLL.LIZJ()) {
                    if (this.LJII.LIZJ) {
                        strLJ = this.LIZLLL.LJIIL();
                    } else {
                        strLJ = this.LIZLLL.LJ();
                    }
                    this.LIZLLL.LJII(c);
                    iLIZIZ = C19987613Ik.LIZIZ(interfaceC19983313Gt, this.LIZIZ, strLJ);
                    if (iLIZIZ != -3) {
                        if (this.LJII.LJII) {
                            AbstractC19987213Ig abstractC19987213Ig = this.LIZIZ;
                            boolean zLJIIIZ = interfaceC19983313Gt.LJIIIZ(iLIZIZ);
                            InterfaceC19983313Gt interfaceC19983313GtLJIIIIZZ = interfaceC19983313Gt.LJIIIIZZ(iLIZIZ);
                            if (!zLJIIIZ || interfaceC19983313GtLJIIIIZZ.LIZ() || !this.LIZLLL.LJJIII(z3)) {
                                if (Intrinsics.LJFF(interfaceC19983313GtLJIIIIZZ.LIZIZ(), C13GS.LIZ) && ((!interfaceC19983313GtLJIIIIZZ.LIZ() || !this.LIZLLL.LJJIII(false)) && (strLJIL = this.LIZLLL.LJIL(this.LJII.LIZJ)) != null)) {
                                    int iLIZIZ2 = C19987613Ik.LIZIZ(interfaceC19983313GtLJIIIIZZ, abstractC19987213Ig, strLJIL);
                                    if (!abstractC19987213Ig.LIZ.LJFF && interfaceC19983313GtLJIIIIZZ.LIZ()) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (iLIZIZ2 == -3 && (zLJIIIZ || z2)) {
                                        this.LIZLLL.LJIIIZ();
                                    }
                                }
                            }
                            zLJJII3 = this.LIZLLL.LJJII();
                        }
                        C13JA c13ja = this.LJIIIIZZ;
                        if (c13ja != null) {
                            C13J6 c13j6 = c13ja.LIZ;
                            if (iLIZIZ < 64) {
                                c13j6.LIZJ |= 1 << iLIZIZ;
                            } else {
                                int i5 = (iLIZIZ >>> 6) - 1;
                                long[] jArr = c13j6.LIZLLL;
                                jArr[i5] = (1 << (iLIZIZ & 63)) | jArr[i5];
                            }
                        }
                        i3 = iLIZIZ;
                        break loop3;
                    }
                    if (!C19987613Ik.LIZLLL(interfaceC19983313Gt, this.LIZIZ)) {
                        C13JI c13ji = this.LJI;
                        if (c13ji != null && Intrinsics.LJFF(c13ji.LIZ, strLJ)) {
                            c13ji.LIZ = null;
                        } else {
                            AbstractC19987713Il abstractC19987713Il = this.LIZLLL;
                            C19988513It c19988513It = abstractC19987713Il.LIZIZ;
                            int i6 = c19988513It.LIZJ;
                            int[] iArr = c19988513It.LIZIZ;
                            if (iArr[i6] == -2) {
                                iArr[i6] = -1;
                                c19988513It.LIZJ = i6 - 1;
                            }
                            int i7 = c19988513It.LIZJ;
                            if (i7 != -1) {
                                c19988513It.LIZJ = i7 - 1;
                            }
                            int iLJJJJI = a0.LJJJJI(abstractC19987713Il.LJJIFFI(0, abstractC19987713Il.LIZ), strLJ, 0, 6);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Encountered an unknown key '");
                            sbLIZ.append(strLJ);
                            sbLIZ.append("' at offset ");
                            sbLIZ.append(iLJJJJI);
                            sbLIZ.append(" at path: ");
                            sbLIZ.append(abstractC19987713Il.LIZIZ.LIZ());
                            sbLIZ.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                            sbLIZ.append((Object) C19988213Iq.LJI(iLJJJJI, abstractC19987713Il.LJIJ()));
                            throw new C13JL(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    AbstractC19987713Il abstractC19987713Il2 = this.LIZLLL;
                    boolean z4 = this.LJII.LIZJ;
                    abstractC19987713Il2.getClass();
                    ArrayList arrayList = new ArrayList();
                    byte bLJIJJLI = abstractC19987713Il2.LJIJJLI();
                    if (bLJIJJLI == 8 || bLJIJJLI == 6) {
                        while (true) {
                            byte bLJIJJLI2 = abstractC19987713Il2.LJIJJLI();
                            if (bLJIJJLI2 == 1) {
                                if (z4) {
                                    abstractC19987713Il2.LJIIJJI();
                                } else {
                                    abstractC19987713Il2.LJ();
                                }
                            } else {
                                if (bLJIJJLI2 != 8 && bLJIJJLI2 != 6) {
                                    if (bLJIJJLI2 == 9) {
                                        if (((Number) C13LP.LJJLIIIJJI(arrayList)).byteValue() == 8) {
                                            C19719612Di.LJJIJ(arrayList);
                                        } else {
                                            int i8 = abstractC19987713Il2.LIZ;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("found ] instead of } at path: ");
                                            sbLIZ2.append(abstractC19987713Il2.LIZIZ);
                                            throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ2), abstractC19987713Il2.LJIJ(), i8);
                                        }
                                    } else if (bLJIJJLI2 == 7) {
                                        if (((Number) C13LP.LJJLIIIJJI(arrayList)).byteValue() == 6) {
                                            C19719612Di.LJJIJ(arrayList);
                                        } else {
                                            int i9 = abstractC19987713Il2.LIZ;
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("found } instead of ] at path: ");
                                            sbLIZ3.append(abstractC19987713Il2.LIZIZ);
                                            throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ3), abstractC19987713Il2.LJIJ(), i9);
                                        }
                                    } else if (bLJIJJLI2 == 10) {
                                        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il2, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                } else {
                                    arrayList.add(Byte.valueOf(bLJIJJLI2));
                                }
                                abstractC19987713Il2.LJFF();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        abstractC19987713Il2.LJIIJJI();
                    }
                    zLJJII3 = this.LIZLLL.LJJII();
                    c = ':';
                    z3 = true;
                }
                if (zLJJII3 && !this.LIZIZ.LIZ.LJIILIIL) {
                    C19988213Iq.LJFF(this.LIZLLL, "object");
                    throw null;
                }
                C13JA c13ja2 = this.LJIIIIZZ;
                if (c13ja2 != null) {
                    C13J6 c13j62 = c13ja2.LIZ;
                    int iLJ = c13j62.LIZ.LJ();
                    while (true) {
                        long j = c13j62.LIZJ;
                        long j2 = -1;
                        if (j != -1) {
                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                            c13j62.LIZJ |= 1 << iNumberOfTrailingZeros;
                            if (c13j62.LIZIZ.invoke(c13j62.LIZ, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue()) {
                                i3 = iNumberOfTrailingZeros;
                                break;
                            }
                        } else if (iLJ > 64) {
                            int length = c13j62.LIZLLL.length;
                            loop3: while (i2 < length) {
                                int i10 = i2 + 1;
                                int i11 = i10 * 64;
                                long j3 = c13j62.LIZLLL[i2];
                                while (j3 != j2) {
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                    j3 |= 1 << iNumberOfTrailingZeros2;
                                    iLIZIZ = iNumberOfTrailingZeros2 + i11;
                                    if (c13j62.LIZIZ.invoke(c13j62.LIZ, Integer.valueOf(iLIZIZ)).booleanValue()) {
                                        c13j62.LIZLLL[i2] = j3;
                                    } else {
                                        j2 = -1;
                                    }
                                }
                                c13j62.LIZLLL[i2] = j3;
                                i2 = i10;
                            }
                        }
                    }
                }
            }
        } else {
            int i12 = this.LJFF;
            if (i12 % 2 != 0) {
                z = true;
                if (i12 != -1) {
                    zLJJII = this.LIZLLL.LJJII();
                }
            } else {
                z = false;
                this.LIZLLL.LJII(':');
            }
            if (this.LIZLLL.LIZJ()) {
                if (z) {
                    if (this.LJFF == -1) {
                        AbstractC19987713Il abstractC19987713Il3 = this.LIZLLL;
                        int i13 = !zLJJII;
                        int i14 = abstractC19987713Il3.LIZ;
                        if (i13 == 0) {
                            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il3, "Unexpected leading comma", i14, null, 4);
                            throw null;
                        }
                    } else {
                        AbstractC19987713Il abstractC19987713Il4 = this.LIZLLL;
                        int i15 = abstractC19987713Il4.LIZ;
                        if (zLJJII == 0) {
                            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il4, "Expected comma after the key-value pair", i15, null, 4);
                            throw null;
                        }
                    }
                }
                i3 = this.LJFF + 1;
                this.LJFF = i3;
            } else if (zLJJII != 0 && !this.LIZIZ.LIZ.LJIILIIL) {
                C19988213Iq.LJFF(this.LIZLLL, "object");
                throw null;
            }
        }
        if (this.LIZJ != EnumC19987013Ie.MAP) {
            C19988513It c19988513It2 = this.LIZLLL.LIZIZ;
            c19988513It2.LIZIZ[c19988513It2.LIZJ] = i3;
        }
        return i3;
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final C13HB LJJIIJZLJL(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (C13HF.LIZ(interfaceC19983313Gt)) {
            return new C19970113Br(this.LIZLLL, this.LIZIZ);
        }
        return this;
    }

    @Override // X.AbstractC19984113Hb, X.InterfaceC19986313Hx
    public final <T> T LJI(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, T t) {
        boolean z;
        if (this.LIZJ == EnumC19987013Ie.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19988513It c19988513It = this.LIZLLL.LIZIZ;
            int[] iArr = c19988513It.LIZIZ;
            int i2 = c19988513It.LIZJ;
            if (iArr[i2] == -2) {
                c19988513It.LIZ[i2] = C13JP.LIZ;
            }
        }
        T t2 = (T) LIZLLL(interfaceC19984213Hc);
        if (z) {
            C19988513It c19988513It2 = this.LIZLLL.LIZIZ;
            int[] iArr2 = c19988513It2.LIZIZ;
            int i3 = c19988513It2.LIZJ;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c19988513It2.LIZJ = i4;
                Object[] objArr = c19988513It2.LIZ;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    c19988513It2.LIZ = Arrays.copyOf(objArr, i5);
                    c19988513It2.LIZIZ = Arrays.copyOf(c19988513It2.LIZIZ, i5);
                }
            }
            Object[] objArr2 = c19988513It2.LIZ;
            int i6 = c19988513It2.LIZJ;
            objArr2[i6] = t2;
            c19988513It2.LIZIZ[i6] = -2;
        }
        return t2;
    }

    public C19987413Ii(AbstractC19987213Ig abstractC19987213Ig, EnumC19987013Ie enumC19987013Ie, AbstractC19987713Il abstractC19987713Il, InterfaceC19983313Gt interfaceC19983313Gt, C13JI c13ji) {
        C13JA c13ja;
        this.LIZIZ = abstractC19987213Ig;
        this.LIZJ = enumC19987013Ie;
        this.LIZLLL = abstractC19987713Il;
        this.LJ = abstractC19987213Ig.LIZIZ;
        this.LJI = c13ji;
        C19988913Ix c19988913Ix = abstractC19987213Ig.LIZ;
        this.LJII = c19988913Ix;
        if (c19988913Ix.LJFF) {
            c13ja = null;
        } else {
            c13ja = new C13JA(interfaceC19983313Gt);
        }
        this.LJIIIIZZ = c13ja;
    }
}
